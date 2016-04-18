/*
 * generated by Xtext 2.9.2
 */
package org.lilychant.parser.antlr;

import com.google.inject.Inject;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.lilychant.parser.antlr.internal.InternalLilyChantParser;
import org.lilychant.services.LilyChantGrammarAccess;

public class LilyChantParser extends AbstractAntlrParser {

	@Inject
	private LilyChantGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new LilyChantTokenSource(super.createLexer(stream));
	}
	
	/**
	 * Indentation aware languages do not support partial parsing since the lexer is inherently stateful.
	 * Override and return {@code true} if your terminal splitting is stateless.
	 */
	@Override
	protected boolean isReparseSupported() {
		return false;
	}

	@Override
	protected InternalLilyChantParser createParser(XtextTokenStream stream) {
		return new InternalLilyChantParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Script";
	}

	public LilyChantGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LilyChantGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}