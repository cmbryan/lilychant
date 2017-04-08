package org.lilychant.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
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
				This __ __ <is a test> |
			Chant Tone one
				A--no--ther test |
				A--no--ther test |
				A--no--ther test ||
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
		Assert.assertEquals('''
\version "2.16.2"

% =======================
% Global Variables
% =======================
alignleft = \once \override LyricText #'self-alignment-X = #-1

%
% voices
%
Sop = {
	e4 ( f ) g g a2 \bar "|" 
	 a4 ( g f ) e1 \bar "" e1 \bar "" e1 \bar "" \bar "|" 
	 \bar "|." 
}

Bass = {
	c4 ( d ) e e f2 \bar "|" 
	 f4 ( e d ) c1 \bar "" c1 \bar "" c1 \bar "" \bar "|" 
	 \bar "|." 
}


% =======================
% Lyrics
% =======================
words = \lyricmode {
	This __ 
	is a 
	test 
	This __ __ 
	is a test 
}

\score {


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

%
% voices
%
Sop = {
	e4 \bar "" f \bar "" g \bar "" a2 \bar "" \bar "|" 
	 a4 \bar "" g \bar "" f \bar "" e1 \bar "" \bar "|" 
	 e4 \bar "" f \bar "" g \bar "" a2 \bar "" \bar "||" 
	 \bar "|." 
}

Bass = {
	c4 \bar "" d \bar "" e \bar "" f2 \bar "" \bar "|" 
	 f4 \bar "" e \bar "" d \bar "" c1 \bar "" \bar "|" 
	 c4 \bar "" d \bar "" e \bar "" f2 \bar "" \bar "||" 
	 \bar "|." 
}


% =======================
% Lyrics
% =======================
words = \lyricmode {
	A -- 
	no -- 
	ther 
	test 
	A -- 
	no -- 
	ther 
	test 
	A -- 
	no -- 
	ther 
	test 
}

\score {


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
	
	@Test 
	def void syllabelGroupingTest() {
		val model = parseHelper.parse('''
			Tone one
				Voices
					Sop Bass
				Phrase one
					Voice Sop
						g4 a4 g2
					Voice Bass
						g4 a4 g2
			Chant Tone one
				<There are> <four syl -- la -- bles> here |
				<There are> <five syl -- la -- bles here> <in -- stead> |
				<There are> <quite a lot of mul -- ti -- syl -- la -- ble words sung on a sin -- gle> note. |
				<This mul -- ti> <syl -- la -- ble group borders with hyp> -- ens. |
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
		Assert.assertEquals('''
\version "2.16.2"

% =======================
% Global Variables
% =======================
alignleft = \once \override LyricText #'self-alignment-X = #-1

%
% voices
%
Sop = {
	g4 \bar "" g4 \bar "" a4 \bar "" a4 \bar "" a4 \bar "" a4 \bar "" g2 \bar "" \bar "|" 
	 g4 \bar "" g4 \bar "" a4 a\breve a4 \bar "" g2 \bar "" g2 \bar "" \bar "|" 
	 g4 \bar "" g4 \bar "" a4 a\breve a4 \bar "" g2 \bar "" \bar "|" 
	 g4 \bar "" g4 \bar "" g4 \bar "" a4 a\breve a4 \bar "" g2 \bar "" \bar "|" 
	 \bar "|." 
}

Bass = {
	g4 \bar "" g4 \bar "" a4 \bar "" a4 \bar "" a4 \bar "" a4 \bar "" g2 \bar "" \bar "|" 
	 g4 \bar "" g4 \bar "" a4 a\breve a4 \bar "" g2 \bar "" g2 \bar "" \bar "|" 
	 g4 \bar "" g4 \bar "" a4 a\breve a4 \bar "" g2 \bar "" \bar "|" 
	 g4 \bar "" g4 \bar "" g4 \bar "" a4 a\breve a4 \bar "" g2 \bar "" \bar "|" 
	 \bar "|." 
}


% =======================
% Lyrics
% =======================
words = \lyricmode {
	There are 
	four syl -- la -- bles 
	here 
	There are 
	 five "syllables " here
	in -- stead 
	There are 
	 quite "a lot of multisyllable words sung on a sin" gle
	note. 
	This mul -- ti 
	 syl "lable group borders with " hyp
	-- ens. 
}

\score {


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
	
	@Test
	def void anotherGroupingTest() {
		val model = parseHelper.parse('''
			Tone fourIermos
				Voices
					Sop Bass
					
				Phrase iermosOne
					Voice Sop
						a'4 b'4 a'4 g'4 a'2
					Voice Bass
						d4 g4 d4 e4 d2
				Phrase iermosTwo
					Voice Sop
						e'4 g'4 g'2 fis'4 g'4 a'2
					Voice Bass
						e4 e4 e2 d4 e4 d2
			Chant Tone fourIermos
				<When Israel of> old__ had passed |
				<through the a> <--byss of the Red Sea, with> un--wet__ feet, |
				<he overcame the power of Amalek in the> wil__--der--ness, |
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
		Assert.assertEquals('''
\version "2.16.2"

% =======================
% Global Variables
% =======================
alignleft = \once \override LyricText #'self-alignment-X = #-1

%
% voices
%
Sop = {
	a'4 a'4 a'4 b'4 ( a'4 ) g'4 a'2 \bar "|" 
	 e'4 e'4 e'4 g'4 g'\breve g'4 g'2 fis'4 ( g'4 ) a'2 \bar "|" 
	 a'4 a'\breve a'4 b'4 ( a'4 ) g'4 \bar "" a'2 \bar "" \bar "|" 
	 \bar "|." 
}

Bass = {
	d4 d4 d4 g4 ( d4 ) e4 d2 \bar "|" 
	 e4 e4 e4 e4 e\breve e4 e2 d4 ( e4 ) d2 \bar "|" 
	 d4 d\breve d4 g4 ( d4 ) e4 \bar "" d2 \bar "" \bar "|" 
	 \bar "|." 
}


% =======================
% Lyrics
% =======================
words = \lyricmode {
	When Israel of 
	old __ 
	had 
	passed 
	through the a 
	 -- byss "of the Red Sea, " with
	un -- 
	wet __ 
	feet, 
	 he "overcame the power of Amalek in " the
	wil __ 
	-- der 
	-- ness, 
}

\score {


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
			fsa.textFiles.get(fileName))
	}
	

	private def assertParsedWithoutError(EObject obj) {
		Assert.assertNotNull(obj)
		validationHelper.assertNoErrors(obj)
	}
}