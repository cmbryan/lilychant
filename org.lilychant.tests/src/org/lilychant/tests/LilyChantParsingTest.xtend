package org.lilychant.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.lilychant.lilyChantScript.NoteGroup
import org.lilychant.lilyChantScript.Script

@RunWith(XtextRunner)
@InjectWith(LilyChantInjectorProvider)
class LilyChantParsingTest{

	@Inject ParseHelper<Script> parseHelper;
	@Inject ValidationTestHelper validationHelper;

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Tone one key A
				Voices
					Sop Alt
				Phrase one
					Voice Sop
						c4 d e f2
					Voice Alt
						g4 a b c2
				Phrase two
					Voice Sop
						d4 e f1
					Voice Alt
						g4 a b c2
			Chant "test" Tone one key F
				Phrase one
					<This--s> is__ <a test>
				Phrase two
					<This--s> is__ <a test>
			''')
		
		result.assertParsedWithoutError;
	}
	
	@Test
	def void cyrillicTest() {
		parseHelper.parse('''
			Tone one key A
				Voices
					Sop Alt
				Phrase one
					Voice Sop
						c4
					Voice Alt
						g4
				Phrase two
					Voice Sop
						d4
					Voice Alt
						g4
			Chant "test" Tone one key F
				Phrase one
					<English text>
				Phrase two
					<Руский техт>
			''').assertParsedWithoutError
	}

	private def assertParsedWithoutError(EObject obj) {
		Assert.assertNotNull(obj)
		validationHelper.assertNoErrors(obj)
	}
}
