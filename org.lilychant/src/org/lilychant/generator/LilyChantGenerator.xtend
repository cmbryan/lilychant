/*
 * generated by Xtext 2.9.2
 */
package org.lilychant.generator

import java.util.ArrayList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.lilychant.lilyChantScript.Barline
import org.lilychant.lilyChantScript.Chant
import org.lilychant.lilyChantScript.Script
import org.lilychant.lilyChantScript.Tone
import org.lilychant.lilyChantScript.VoiceName
import org.lilychant.lilyChantScript.VoicePhrase

import static extension org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LilyChantGenerator extends AbstractGenerator {
	
	def generateVoice(Tone tone) {
		'''
		«tone.name»
		'''
	}
		
	def getVoiceNotes(Script model, Chant chant, VoiceName voiceName) {
		var currentPhraseIndex = -1
		var result = new ArrayList<String>()

		for (lyricPhrase : chant.phrases) {
			if (lyricPhrase.explicitPhrase != null) {
				currentPhraseIndex = chant.tone.phrases.indexOf(lyricPhrase.explicitPhrase)
			} else {
				currentPhraseIndex = (currentPhraseIndex+1) % chant.tone.phrases.length
				// Special case for 'final' phrase
				while (
					chant.tone.phrases.get(currentPhraseIndex).name.toLowerCase.endsWith("final")
					&& currentPhraseIndex != 0
				) {
					currentPhraseIndex = (currentPhraseIndex+1) % chant.tone.phrases.length
				}
			}
			val notePhrase = chant.tone.phrases.get(currentPhraseIndex)
			
			var VoicePhrase targetVoice
			for (voice : notePhrase.voices) {
				if (voice.name == voiceName) {
					targetVoice = voice
				}
			}
			
			// Match the notes to the syllables
			var noteIndex = 0
			for (noteGroup : lyricPhrase.noteGroups) {
				var syllableIndex = 0
				var inSlur = false
				while (syllableIndex < noteGroup.syllables.length) {
					// TODO use terminal definitions for hyphens and extenders, but where do they live?
					// TODO Better error handling
					try {
						val note = targetVoice.notes.get(noteIndex)
						switch (noteGroup.syllables.get(syllableIndex)) {
							case "--",
							case "_": {
								// skip to the next syllable
							}
							case "__": {
	//							// slurring implies advance to the next note
								if (!inSlur) {
									result.add("(")
									inSlur = true
								}
								noteIndex++
								result.add(targetVoice.notes.get(noteIndex))
								if (syllableIndex+1 == noteGroup.syllables.length
										|| noteGroup.syllables.get(syllableIndex+1) != "__")
									result.add(")")
							}
							default: {
								if (inSlur) {
									result.add(")")
									inSlur = false
								}
	
								if (result.length == 0 || result.get(result.length-1).indexOf("bar") == -1) {
									// allow for natural line breaking
									result.add('''\bar ""''')
								}
								result.add(note)
							}
						}
					} catch (IndexOutOfBoundsException e) {
						System.err.println('''
							More syllabels than notes! («noteIndex» >= «targetVoice.notes.length»)
							  Phrase: «notePhrase.name»
							  Line: «NodeModelUtils.getNode(noteGroup).startLine»
						''')
						return result
					}
					syllableIndex++
				}
				syllableIndex++
				noteIndex++
			}
			switch (lyricPhrase.bar) {
				case Barline.SINGLE: {
					result.add('''\bar "|"''')
				}
				case Barline.DOUBLE: {
					result.add('''\bar "||"''')
				}
			}
		}
		
		// replace last barline with double-bar
		result.remove(result.length-1)
		result.add('''\bar "|."''')
		
//		println('''Notes for voice: «FOR note : result» «note»«ENDFOR»''')
		return result
	}

	def private generateVoices(Script model, Chant chant) {
		'''
		«FOR voice : chant.tone.voiceNames»
		«voice.name» = {
			«FOR note : getVoiceNotes(model, chant, voice)»«note» «ENDFOR»
		}
		
		«ENDFOR»
		'''
	}
	
	def private generateLyrics(Script model, Chant chant) {
		'''
		words = \lyricmode {
			«FOR lyricPhrase : chant.phrases»
			«FOR noteGroup : lyricPhrase.noteGroups»
«««			"_" implies a skipped note in the NotePhrase
«««			TODO Don't use a string literal!
			«FOR syllable : noteGroup.syllables.filter[!equals("_")]»«syllable» «ENDFOR»
			«ENDFOR»
			«ENDFOR»
		}
		'''
	}

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.allContents.filter(typeof(Script)).next
		
		// Only generate if there are chants in the file
		if (model.chants.size == 0)
			return
		
		val filename = resource.normalizedURI.lastSegment + ".ly"
		fsa.generateFile(filename,
			'''
			\version "2.16.2"
			
			% =======================
			% Global Variables
			% =======================
			alignleft = \once \override LyricText #'self-alignment-X = #-1
			
			«FOR chant : model.chants»
			«IF chant.name != null»
			% =======================
			% Score «IF chant.name != null»for «chant.name»«ENDIF»
			% =======================
			«ENDIF»
			%
			% voices
			%
			«model.generateVoices(chant)»
			
			% =======================
			% Lyrics
			% =======================
			«model.generateLyrics(chant)»
			
			\score {

			«IF chant.name != null»
			  % This produces a lilypond error, but still seems to render OK, so...
			  \header { title = "«chant.name»" }
			«ENDIF»

			  \new ChoirStaff \with {
			    instrumentName = \markup \bold "Choir:"
			  }
			  <<
			    #(set-accidental-style 'neo-modern 'Score)
			    \new Staff {
			      \key g \major
			      \cadenzaOn
			      <<{
				  \new Voice = "Sop" {
				    %\voiceOne
				    \Sop
				  }
				}>>
			    }
			    \new Lyrics \lyricsto "Sop" { \words }
			    \new Staff {
			      \key g \major
			      \clef bass
			      \cadenzaOn
			      <<{
				  \new Voice = "Bass" {
				    %\voiceOne
				    \Bass
				  }
				}>>
			    }
			  >>
			}
			
			«ENDFOR»
			
			% =======================
			% Layout
			% =======================
			\layout {
			  \context {
			    \Score
			    \remove "Bar_number_engraver"
			  }
			  \context {
			    \Staff
			    \remove "Time_signature_engraver"
			  }
			}			
			'''.toString
		)
	}
}
