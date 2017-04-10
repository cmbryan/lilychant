package org.lilychant.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
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
class LilyChantParsingTest{

	@Inject ParseHelper<Script> parseHelper;
	@Inject ValidationTestHelper validationHelper;

	@Test 
	def void basicTest() {
		val result = parseHelper.parse('''
			Tone one
				Voices
					Sop Alt
				Phrase one
					Voice Sop
						c4 d4 e4 f2
					Voice Alt
						g4 a4 b4 c2
				Phrase two
					Voice Sop
						d4 e4 e4 f1
					Voice Alt
						g4 a4 b4 c2
			Chant Tone one
				<This--s> is__ <a test> |
				Words in phrase two |
				(two) ^Phrase two again ||
		''')
		
		result.assertParsedWithoutError;
	}
	
	@Test
	def void cyrillicTest() {
		parseHelper.parse('''
			Tone one
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
			Chant "test" Tone one
				<English text> |
				<Руский техт> |
			''').assertParsedWithoutError
	}

	private def assertParsedWithoutError(EObject obj) {
		Assert.assertNotNull(obj)
		validationHelper.assertNoErrors(obj)
	}
}
