/*
 * generated by Xtext 2.11.0
 */
package org.lilychant.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LilyChantAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/lilychant/parser/antlr/internal/InternalLilyChantParser.tokens");
	}
}
