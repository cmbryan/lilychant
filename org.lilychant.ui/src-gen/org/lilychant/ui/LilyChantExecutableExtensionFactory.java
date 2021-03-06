/*
 * generated by Xtext 2.11.0
 */
package org.lilychant.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.lilychant.ui.internal.LilychantActivator;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LilyChantExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return LilychantActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return LilychantActivator.getInstance().getInjector(LilychantActivator.ORG_LILYCHANT_LILYCHANT);
	}
	
}
