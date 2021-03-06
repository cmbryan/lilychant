/*
 * generated by Xtext 2.11.0
 */
package org.lilychant.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.lilychant.LilyChantRuntimeModule
import org.lilychant.LilyChantStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class LilyChantIdeSetup extends LilyChantStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new LilyChantRuntimeModule, new LilyChantIdeModule))
	}
	
}
