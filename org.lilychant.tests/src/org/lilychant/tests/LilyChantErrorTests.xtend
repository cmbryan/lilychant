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
import org.lilychant.lilyChantScript.NoteGroup
import org.lilychant.lilyChantScript.LilyChantScriptPackage
import org.lilychant.validation.LilyChantValidator

@RunWith(XtextRunner)
@InjectWith(LilyChantInjectorProvider)
class LilyChantErrorTests {

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
						e4 f4 g4 a2
					Voice Bass
						c4 d4 e4 f2
			Chant Tone one
				This __ <is a> test |
				with extra syl--la--bles |
		''')
		model.assertParsedWithError;
	}	

	// FIXME How to check for error...
	private def assertParsedWithError(EObject obj) {
		Assert.assertNotNull(obj)
		validationHelper.assertError(
			obj,
			LilyChantScriptPackage.Literals.NOTE_GROUP,
			LilyChantValidator.TOO_MANY_SYLLABLES,
			160, 4,
			"Too many syllables"
		)
	}
}