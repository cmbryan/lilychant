/*
 * generated by Xtext 2.9.2
 */
lexer grammar InternalLilyChantLexer;

@header {
package org.lilychant.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

Phrase : 'Phrase';

Voices : 'Voices';

Chant : 'Chant';

Voice : 'Voice';

Tone : 'Tone';

Key : 'key';

// Rules duplicated to allow inter-rule references

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|','|'\''|';'|'.'|':')*;

RULE_DURATION : ('1'|'2'|'4'|'8'|'16'|'\breve')+;

RULE_HYPHEN : '--';

RULE_EXTENDER : '__';

RULE_START_NOTE_GROUP : '<';

RULE_END_NOTE_GROUP : '>';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : ('('|')'|'\\'|'&');
