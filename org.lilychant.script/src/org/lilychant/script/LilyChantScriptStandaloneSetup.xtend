/*
 * generated by Xtext 2.9.2
 */
package org.lilychant.script


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class LilyChantScriptStandaloneSetup extends LilyChantScriptStandaloneSetupGenerated {

	def static void doSetup() {
		new LilyChantScriptStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}