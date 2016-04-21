/*
 * generated by Xtext 2.9.2
 */
parser grammar InternalLilyChantParser;

options {
	tokenVocab=InternalLilyChantLexer;
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@header {
package org.lilychant.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.lilychant.services.LilyChantGrammarAccess;

}
@members {
	private LilyChantGrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("LeftParenthesis", "'('");
		tokenNameToValue.put("RightParenthesis", "')'");
		tokenNameToValue.put("VerticalLine", "'|'");
		tokenNameToValue.put("VerticalLineVerticalLine", "'||'");
		tokenNameToValue.put("Tone", "'Tone'");
		tokenNameToValue.put("Chant", "'Chant'");
		tokenNameToValue.put("Voice", "'Voice'");
		tokenNameToValue.put("Phrase", "'Phrase'");
		tokenNameToValue.put("Voices", "'Voices'");
	}

	public void setGrammarAccess(LilyChantGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		String result = tokenNameToValue.get(tokenName);
		if (result == null)
			result = tokenName;
		return result;
	}
}

// Entry rule entryRuleScript
entryRuleScript
:
{ before(grammarAccess.getScriptRule()); }
	 ruleScript
{ after(grammarAccess.getScriptRule()); } 
	 EOF 
;

// Rule Script
ruleScript 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScriptAccess().getGroup()); }
		(rule__Script__Group__0)
		{ after(grammarAccess.getScriptAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTone
entryRuleTone
:
{ before(grammarAccess.getToneRule()); }
	 ruleTone
{ after(grammarAccess.getToneRule()); } 
	 EOF 
;

// Rule Tone
ruleTone 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getToneAccess().getGroup()); }
		(rule__Tone__Group__0)
		{ after(grammarAccess.getToneAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVoiceName
entryRuleVoiceName
:
{ before(grammarAccess.getVoiceNameRule()); }
	 ruleVoiceName
{ after(grammarAccess.getVoiceNameRule()); } 
	 EOF 
;

// Rule VoiceName
ruleVoiceName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVoiceNameAccess().getNameAssignment()); }
		(rule__VoiceName__NameAssignment)
		{ after(grammarAccess.getVoiceNameAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTonePhrase
entryRuleTonePhrase
:
{ before(grammarAccess.getTonePhraseRule()); }
	 ruleTonePhrase
{ after(grammarAccess.getTonePhraseRule()); } 
	 EOF 
;

// Rule TonePhrase
ruleTonePhrase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTonePhraseAccess().getGroup()); }
		(rule__TonePhrase__Group__0)
		{ after(grammarAccess.getTonePhraseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVoicePhrase
entryRuleVoicePhrase
:
{ before(grammarAccess.getVoicePhraseRule()); }
	 ruleVoicePhrase
{ after(grammarAccess.getVoicePhraseRule()); } 
	 EOF 
;

// Rule VoicePhrase
ruleVoicePhrase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVoicePhraseAccess().getGroup()); }
		(rule__VoicePhrase__Group__0)
		{ after(grammarAccess.getVoicePhraseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChant
entryRuleChant
:
{ before(grammarAccess.getChantRule()); }
	 ruleChant
{ after(grammarAccess.getChantRule()); } 
	 EOF 
;

// Rule Chant
ruleChant 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChantAccess().getGroup()); }
		(rule__Chant__Group__0)
		{ after(grammarAccess.getChantAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLyricPhrase
entryRuleLyricPhrase
:
{ before(grammarAccess.getLyricPhraseRule()); }
	 ruleLyricPhrase
{ after(grammarAccess.getLyricPhraseRule()); } 
	 EOF 
;

// Rule LyricPhrase
ruleLyricPhrase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLyricPhraseAccess().getGroup()); }
		(rule__LyricPhrase__Group__0)
		{ after(grammarAccess.getLyricPhraseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNoteGroup
entryRuleNoteGroup
:
{ before(grammarAccess.getNoteGroupRule()); }
	 ruleNoteGroup
{ after(grammarAccess.getNoteGroupRule()); } 
	 EOF 
;

// Rule NoteGroup
ruleNoteGroup 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNoteGroupAccess().getAlternatives()); }
		(rule__NoteGroup__Alternatives)
		{ after(grammarAccess.getNoteGroupAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNote
entryRuleNote
:
{ before(grammarAccess.getNoteRule()); }
	 ruleNote
{ after(grammarAccess.getNoteRule()); } 
	 EOF 
;

// Rule Note
ruleNote 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNoteAccess().getGroup()); }
		(rule__Note__Group__0)
		{ after(grammarAccess.getNoteAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Barline
ruleBarline
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBarlineAccess().getAlternatives()); }
		(rule__Barline__Alternatives)
		{ after(grammarAccess.getBarlineAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNoteGroupAccess().getGroup_0()); }
		(rule__NoteGroup__Group_0__0)
		{ after(grammarAccess.getNoteGroupAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getNoteGroupAccess().getGroup_1()); }
		(rule__NoteGroup__Group_1__0)
		{ after(grammarAccess.getNoteGroupAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Alternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNoteGroupAccess().getGroup_0_0_0()); }
		(rule__NoteGroup__Group_0_0_0__0)
		{ after(grammarAccess.getNoteGroupAccess().getGroup_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getNoteGroupAccess().getGroup_0_0_1()); }
		(rule__NoteGroup__Group_0_0_1__0)
		{ after(grammarAccess.getNoteGroupAccess().getGroup_0_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__SyllablesAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_1_1_0_0()); }
		RULE_ID
		{ after(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_1_1_0_1()); }
		RULE_HYPHEN
		{ after(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_1_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Barline__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBarlineAccess().getSingleEnumLiteralDeclaration_0()); }
		(VerticalLine)
		{ after(grammarAccess.getBarlineAccess().getSingleEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getBarlineAccess().getDoubleEnumLiteralDeclaration_1()); }
		(VerticalLineVerticalLine)
		{ after(grammarAccess.getBarlineAccess().getDoubleEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Script__Group__0__Impl
	rule__Script__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScriptAccess().getTonesAssignment_0()); }
	(rule__Script__TonesAssignment_0)*
	{ after(grammarAccess.getScriptAccess().getTonesAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Script__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScriptAccess().getChantsAssignment_1()); }
	(rule__Script__ChantsAssignment_1)*
	{ after(grammarAccess.getScriptAccess().getChantsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Tone__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tone__Group__0__Impl
	rule__Tone__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getToneAccess().getToneKeyword_0()); }
	Tone
	{ after(grammarAccess.getToneAccess().getToneKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tone__Group__1__Impl
	rule__Tone__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getToneAccess().getNameAssignment_1()); }
	(rule__Tone__NameAssignment_1)
	{ after(grammarAccess.getToneAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tone__Group__2__Impl
	rule__Tone__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getToneAccess().getBEGINTerminalRuleCall_2()); }
	RULE_BEGIN
	{ after(grammarAccess.getToneAccess().getBEGINTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tone__Group__3__Impl
	rule__Tone__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getToneAccess().getVoicesKeyword_3()); }
	Voices
	{ after(grammarAccess.getToneAccess().getVoicesKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tone__Group__4__Impl
	rule__Tone__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getToneAccess().getBEGINTerminalRuleCall_4()); }
	RULE_BEGIN
	{ after(grammarAccess.getToneAccess().getBEGINTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tone__Group__5__Impl
	rule__Tone__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getToneAccess().getVoiceNamesAssignment_5()); }
		(rule__Tone__VoiceNamesAssignment_5)
		{ after(grammarAccess.getToneAccess().getVoiceNamesAssignment_5()); }
	)
	(
		{ before(grammarAccess.getToneAccess().getVoiceNamesAssignment_5()); }
		(rule__Tone__VoiceNamesAssignment_5)*
		{ after(grammarAccess.getToneAccess().getVoiceNamesAssignment_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tone__Group__6__Impl
	rule__Tone__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getToneAccess().getENDTerminalRuleCall_6()); }
	RULE_END
	{ after(grammarAccess.getToneAccess().getENDTerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tone__Group__7__Impl
	rule__Tone__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getToneAccess().getPhrasesAssignment_7()); }
		(rule__Tone__PhrasesAssignment_7)
		{ after(grammarAccess.getToneAccess().getPhrasesAssignment_7()); }
	)
	(
		{ before(grammarAccess.getToneAccess().getPhrasesAssignment_7()); }
		(rule__Tone__PhrasesAssignment_7)*
		{ after(grammarAccess.getToneAccess().getPhrasesAssignment_7()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tone__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getToneAccess().getENDTerminalRuleCall_8()); }
	RULE_END
	{ after(grammarAccess.getToneAccess().getENDTerminalRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TonePhrase__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TonePhrase__Group__0__Impl
	rule__TonePhrase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TonePhrase__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTonePhraseAccess().getPhraseKeyword_0()); }
	Phrase
	{ after(grammarAccess.getTonePhraseAccess().getPhraseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TonePhrase__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TonePhrase__Group__1__Impl
	rule__TonePhrase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TonePhrase__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTonePhraseAccess().getNameAssignment_1()); }
	(rule__TonePhrase__NameAssignment_1)
	{ after(grammarAccess.getTonePhraseAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TonePhrase__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TonePhrase__Group__2__Impl
	rule__TonePhrase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TonePhrase__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTonePhraseAccess().getBEGINTerminalRuleCall_2()); }
	RULE_BEGIN
	{ after(grammarAccess.getTonePhraseAccess().getBEGINTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TonePhrase__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TonePhrase__Group__3__Impl
	rule__TonePhrase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TonePhrase__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); }
		(rule__TonePhrase__VoicesAssignment_3)
		{ after(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); }
	)
	(
		{ before(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); }
		(rule__TonePhrase__VoicesAssignment_3)*
		{ after(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TonePhrase__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TonePhrase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TonePhrase__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTonePhraseAccess().getENDTerminalRuleCall_4()); }
	RULE_END
	{ after(grammarAccess.getTonePhraseAccess().getENDTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VoicePhrase__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VoicePhrase__Group__0__Impl
	rule__VoicePhrase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VoicePhrase__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVoicePhraseAccess().getVoiceKeyword_0()); }
	Voice
	{ after(grammarAccess.getVoicePhraseAccess().getVoiceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VoicePhrase__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VoicePhrase__Group__1__Impl
	rule__VoicePhrase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VoicePhrase__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVoicePhraseAccess().getNameAssignment_1()); }
	(rule__VoicePhrase__NameAssignment_1)
	{ after(grammarAccess.getVoicePhraseAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VoicePhrase__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VoicePhrase__Group__2__Impl
	rule__VoicePhrase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VoicePhrase__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVoicePhraseAccess().getBEGINTerminalRuleCall_2()); }
	RULE_BEGIN
	{ after(grammarAccess.getVoicePhraseAccess().getBEGINTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VoicePhrase__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VoicePhrase__Group__3__Impl
	rule__VoicePhrase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VoicePhrase__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); }
		(rule__VoicePhrase__NotesAssignment_3)
		{ after(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); }
	)
	(
		{ before(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); }
		(rule__VoicePhrase__NotesAssignment_3)*
		{ after(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VoicePhrase__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VoicePhrase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VoicePhrase__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVoicePhraseAccess().getENDTerminalRuleCall_4()); }
	RULE_END
	{ after(grammarAccess.getVoicePhraseAccess().getENDTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Chant__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Chant__Group__0__Impl
	rule__Chant__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChantAccess().getChantKeyword_0()); }
	Chant
	{ after(grammarAccess.getChantAccess().getChantKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Chant__Group__1__Impl
	rule__Chant__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChantAccess().getNameAssignment_1()); }
	(rule__Chant__NameAssignment_1)?
	{ after(grammarAccess.getChantAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Chant__Group__2__Impl
	rule__Chant__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChantAccess().getToneKeyword_2()); }
	Tone
	{ after(grammarAccess.getChantAccess().getToneKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Chant__Group__3__Impl
	rule__Chant__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChantAccess().getToneAssignment_3()); }
	(rule__Chant__ToneAssignment_3)
	{ after(grammarAccess.getChantAccess().getToneAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Chant__Group__4__Impl
	rule__Chant__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChantAccess().getBEGINTerminalRuleCall_4()); }
	RULE_BEGIN
	{ after(grammarAccess.getChantAccess().getBEGINTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Chant__Group__5__Impl
	rule__Chant__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getChantAccess().getPhrasesAssignment_5()); }
		(rule__Chant__PhrasesAssignment_5)
		{ after(grammarAccess.getChantAccess().getPhrasesAssignment_5()); }
	)
	(
		{ before(grammarAccess.getChantAccess().getPhrasesAssignment_5()); }
		(rule__Chant__PhrasesAssignment_5)*
		{ after(grammarAccess.getChantAccess().getPhrasesAssignment_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Chant__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChantAccess().getENDTerminalRuleCall_6()); }
	RULE_END
	{ after(grammarAccess.getChantAccess().getENDTerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LyricPhrase__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LyricPhrase__Group__0__Impl
	rule__LyricPhrase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLyricPhraseAccess().getGroup_0()); }
	(rule__LyricPhrase__Group_0__0)?
	{ after(grammarAccess.getLyricPhraseAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LyricPhrase__Group__1__Impl
	rule__LyricPhrase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_1()); }
		(rule__LyricPhrase__NoteGroupsAssignment_1)
		{ after(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_1()); }
		(rule__LyricPhrase__NoteGroupsAssignment_1)*
		{ after(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LyricPhrase__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLyricPhraseAccess().getBarAssignment_2()); }
	(rule__LyricPhrase__BarAssignment_2)
	{ after(grammarAccess.getLyricPhraseAccess().getBarAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LyricPhrase__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LyricPhrase__Group_0__0__Impl
	rule__LyricPhrase__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLyricPhraseAccess().getLeftParenthesisKeyword_0_0()); }
	LeftParenthesis
	{ after(grammarAccess.getLyricPhraseAccess().getLeftParenthesisKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LyricPhrase__Group_0__1__Impl
	rule__LyricPhrase__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLyricPhraseAccess().getPhraseKeyword_0_1()); }
	Phrase
	{ after(grammarAccess.getLyricPhraseAccess().getPhraseKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LyricPhrase__Group_0__2__Impl
	rule__LyricPhrase__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLyricPhraseAccess().getExplicitPhraseAssignment_0_2()); }
	(rule__LyricPhrase__ExplicitPhraseAssignment_0_2)
	{ after(grammarAccess.getLyricPhraseAccess().getExplicitPhraseAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LyricPhrase__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLyricPhraseAccess().getRightParenthesisKeyword_0_3()); }
	RightParenthesis
	{ after(grammarAccess.getLyricPhraseAccess().getRightParenthesisKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NoteGroup__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NoteGroup__Group_0__0__Impl
	rule__NoteGroup__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNoteGroupAccess().getAlternatives_0_0()); }
	(rule__NoteGroup__Alternatives_0_0)
	{ after(grammarAccess.getNoteGroupAccess().getAlternatives_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NoteGroup__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_1()); }
	(rule__NoteGroup__SyllablesAssignment_0_1)*
	{ after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NoteGroup__Group_0_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NoteGroup__Group_0_0_0__0__Impl
	rule__NoteGroup__Group_0_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_0_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_0()); }
	(rule__NoteGroup__SyllablesAssignment_0_0_0_0)
	{ after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_0_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NoteGroup__Group_0_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_0_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNoteGroupAccess().getGroup_0_0_0_1()); }
	(rule__NoteGroup__Group_0_0_0_1__0)?
	{ after(grammarAccess.getNoteGroupAccess().getGroup_0_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NoteGroup__Group_0_0_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NoteGroup__Group_0_0_0_1__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_0_0_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_1_0()); }
	(rule__NoteGroup__SyllablesAssignment_0_0_0_1_0)
	{ after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NoteGroup__Group_0_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NoteGroup__Group_0_0_1__0__Impl
	rule__NoteGroup__Group_0_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_0_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_0()); }
	(rule__NoteGroup__SyllablesAssignment_0_0_1_0)
	{ after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_0_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NoteGroup__Group_0_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_0_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_1()); }
	(rule__NoteGroup__SyllablesAssignment_0_0_1_1)
	{ after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NoteGroup__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NoteGroup__Group_1__0__Impl
	rule__NoteGroup__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNoteGroupAccess().getSTART_NOTE_GROUPTerminalRuleCall_1_0()); }
	RULE_START_NOTE_GROUP
	{ after(grammarAccess.getNoteGroupAccess().getSTART_NOTE_GROUPTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NoteGroup__Group_1__1__Impl
	rule__NoteGroup__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); }
		(rule__NoteGroup__SyllablesAssignment_1_1)
		{ after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); }
	)
	(
		{ before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); }
		(rule__NoteGroup__SyllablesAssignment_1_1)*
		{ after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NoteGroup__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNoteGroupAccess().getEND_NOTE_GROUPTerminalRuleCall_1_2()); }
	RULE_END_NOTE_GROUP
	{ after(grammarAccess.getNoteGroupAccess().getEND_NOTE_GROUPTerminalRuleCall_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Note__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Note__Group__0__Impl
	rule__Note__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Note__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNoteAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getNoteAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Note__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Note__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Note__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNoteAccess().getDURATIONTerminalRuleCall_1()); }
	(RULE_DURATION)?
	{ after(grammarAccess.getNoteAccess().getDURATIONTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Script__TonesAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScriptAccess().getTonesToneParserRuleCall_0_0()); }
		ruleTone
		{ after(grammarAccess.getScriptAccess().getTonesToneParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__ChantsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScriptAccess().getChantsChantParserRuleCall_1_0()); }
		ruleChant
		{ after(grammarAccess.getScriptAccess().getChantsChantParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getToneAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getToneAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__VoiceNamesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getToneAccess().getVoiceNamesVoiceNameParserRuleCall_5_0()); }
		ruleVoiceName
		{ after(grammarAccess.getToneAccess().getVoiceNamesVoiceNameParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__PhrasesAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getToneAccess().getPhrasesTonePhraseParserRuleCall_7_0()); }
		ruleTonePhrase
		{ after(grammarAccess.getToneAccess().getPhrasesTonePhraseParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VoiceName__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVoiceNameAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getVoiceNameAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TonePhrase__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTonePhraseAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTonePhraseAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TonePhrase__VoicesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTonePhraseAccess().getVoicesVoicePhraseParserRuleCall_3_0()); }
		ruleVoicePhrase
		{ after(grammarAccess.getTonePhraseAccess().getVoicesVoicePhraseParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VoicePhrase__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVoicePhraseAccess().getNameVoiceNameCrossReference_1_0()); }
		(
			{ before(grammarAccess.getVoicePhraseAccess().getNameVoiceNameIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getVoicePhraseAccess().getNameVoiceNameIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getVoicePhraseAccess().getNameVoiceNameCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VoicePhrase__NotesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVoicePhraseAccess().getNotesNoteParserRuleCall_3_0()); }
		ruleNote
		{ after(grammarAccess.getVoicePhraseAccess().getNotesNoteParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChantAccess().getNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getChantAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__ToneAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChantAccess().getToneToneCrossReference_3_0()); }
		(
			{ before(grammarAccess.getChantAccess().getToneToneIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getChantAccess().getToneToneIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getChantAccess().getToneToneCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Chant__PhrasesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChantAccess().getPhrasesLyricPhraseParserRuleCall_5_0()); }
		ruleLyricPhrase
		{ after(grammarAccess.getChantAccess().getPhrasesLyricPhraseParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__ExplicitPhraseAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLyricPhraseAccess().getExplicitPhraseTonePhraseCrossReference_0_2_0()); }
		(
			{ before(grammarAccess.getLyricPhraseAccess().getExplicitPhraseTonePhraseIDTerminalRuleCall_0_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getLyricPhraseAccess().getExplicitPhraseTonePhraseIDTerminalRuleCall_0_2_0_1()); }
		)
		{ after(grammarAccess.getLyricPhraseAccess().getExplicitPhraseTonePhraseCrossReference_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__NoteGroupsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLyricPhraseAccess().getNoteGroupsNoteGroupParserRuleCall_1_0()); }
		ruleNoteGroup
		{ after(grammarAccess.getLyricPhraseAccess().getNoteGroupsNoteGroupParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LyricPhrase__BarAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLyricPhraseAccess().getBarBarlineEnumRuleCall_2_0()); }
		ruleBarline
		{ after(grammarAccess.getLyricPhraseAccess().getBarBarlineEnumRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__SyllablesAssignment_0_0_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_0_0_0_0_0()); }
		RULE_ID
		{ after(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_0_0_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__SyllablesAssignment_0_0_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_0_0_0_1_0_0()); }
		RULE_HYPHEN
		{ after(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_0_0_0_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__SyllablesAssignment_0_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_0_0_1_0_0()); }
		RULE_HYPHEN
		{ after(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_0_0_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__SyllablesAssignment_0_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_0_0_1_1_0()); }
		RULE_ID
		{ after(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_0_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__SyllablesAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNoteGroupAccess().getSyllablesEXTENDERTerminalRuleCall_0_1_0()); }
		RULE_EXTENDER
		{ after(grammarAccess.getNoteGroupAccess().getSyllablesEXTENDERTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NoteGroup__SyllablesAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_1_1_0()); }
		(rule__NoteGroup__SyllablesAlternatives_1_1_0)
		{ after(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
