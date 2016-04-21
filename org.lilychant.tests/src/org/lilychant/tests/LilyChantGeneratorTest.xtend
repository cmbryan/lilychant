package org.lilychant.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.lilychant.lilyChantScript.Script

@RunWith(XtextRunner)
@InjectWith(LilyChantInjectorProvider)
class LilyChantGeneratorTest {

	@Inject ParseHelper<Script> parseHelper;
	@Inject ValidationTestHelper validationHelper;
	@Inject IGenerator2 generator;
	
	@Test 
	def void basicGenerationTest() {
		val model = parseHelper.parse('''
			Tone one
				Voices
					Sop Bass
				Phrase one
					Voice Sop
						e4 f g a2
					Voice Bass
						c4 d e f2
				Phrase two
					Voice Sop
						a4 g f e1
					Voice Bass
						f4 e d c1
			Chant Tone one
				This __ <is a> test |
				This __ __ <is a ve -- ry long test> |
			Chant Tone one
				A--no--ther test |
				A--no--ther test |
			''')
		model.assertParsedWithoutError;
		
		val fsa = new InMemoryFileSystemAccess()
		generator.doGenerate(model.eResource, fsa, null)
		println(fsa.textFiles)
		
		// Assert one output file
		Assert.assertEquals(1, fsa.textFiles.size)

		// Assert output file contents
		var iterator = fsa.textFiles.entrySet.iterator
		var fileName = iterator.next.key
		println("Checking " + fileName)
		Assert.assertEquals(
			'''
			\version "2.16.2"
			
			% =======================
			% Global Variables
			% =======================
			alignleft = \once \override LyricText #'self-alignment-X = #-1
			
			%
			% voices
			%
			Sop = {
				e4( f) g a2 a4( g) f e1
			}
			Alt = {
				c4( d) e f2 f4( e) d c1
			}
			
			% =======================
			% Lyrics
			% =======================
			words = \lyricmode {
				This __ is -- a test This __ is -- a test
			}
			
			% =======================
			% Score
			% =======================
			\score {
				\new ChoirStaff \with {
				instrumentName = \markup \bold "Choir:"
			}
			<<
				#(set-accidental-style 'neo-modern 'Score)
				
				% Upper Staff
				\new Staff {
					\key f \major
					\cadenzaOn
					<<{
						\new Voice = "Sop" {
							\voiceOne
							\sop
						}
					}>>
				}
			    \new Lyrics \lyricsto "Sop" {
			    	\words
			    }
				
				% Lower Staff
				\new Staff {
					\key f \major
					\cadenzaOn
					<<{
						\new Voice = "Bass" {
							\voiceOne
							\bass
						}
					}\\{
						\new Voice = "Alt" {
							\voiceTwo
							\alt
						}
					}>>
				}
			    \new Lyrics \lyricsto "Sop" {
			    	\words
			    }
			}
			
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
			'''.toString,
			fsa.textFiles.get(fileName)
		)
	}

	private def assertParsedWithoutError(EObject obj) {
		Assert.assertNotNull(obj)
		validationHelper.assertNoErrors(obj)
	}
}