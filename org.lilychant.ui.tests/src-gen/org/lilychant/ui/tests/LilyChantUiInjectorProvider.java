/*
 * generated by Xtext 2.11.0
 */
package org.lilychant.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.lilychant.ui.internal.LilychantActivator;

public class LilyChantUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return LilychantActivator.getInstance().getInjector("org.lilychant.LilyChant");
	}

}
