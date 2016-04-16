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
import org.lilychant.lilyChantScript.Script

@RunWith(XtextRunner)
@InjectWith(LilyChantInjectorProvider)
class LilyChantParsingTest{

	@Inject ParseHelper<Script> parseHelper;
	@Inject ValidationTestHelper validationHelper;

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Tone one in A:
				Voices: Sop Alt
				Phrase one:
					Voice Sop:
						c4 d e f2
					Voice Alt:
						g4 a b c2
				Phrase two:
					Voice Sop:
						d4 e f1
					Voice Alt:
						g4 a b c2
			Chant in Tone one in F:
				This -- is __ a test
				This -- is __ b test
		''')
		
		result.assertParsedWithoutError;
	}

	private def assertParsedWithoutError(EObject obj) {
		Assert.assertNotNull(obj)
		validationHelper.assertNoErrors(obj)
	}
}
