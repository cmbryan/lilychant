/*
 * generated by Xtext 2.9.2
 */
package org.lilychant.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class LilyChantGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ScriptElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.Script");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTonesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTonesToneParserRuleCall_0_0 = (RuleCall)cTonesAssignment_0.eContents().get(0);
		private final Assignment cChantsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cChantsChantParserRuleCall_1_0 = (RuleCall)cChantsAssignment_1.eContents().get(0);
		
		//Script:
		//	tones+=Tone*
		//	//	ensemble=Ensemble
		//	chants+=Chant*;
		@Override public ParserRule getRule() { return rule; }
		
		//tones+=Tone* //	ensemble=Ensemble
		//chants+=Chant*
		public Group getGroup() { return cGroup; }
		
		//tones+=Tone*
		public Assignment getTonesAssignment_0() { return cTonesAssignment_0; }
		
		//Tone
		public RuleCall getTonesToneParserRuleCall_0_0() { return cTonesToneParserRuleCall_0_0; }
		
		////	ensemble=Ensemble
		//chants+=Chant*
		public Assignment getChantsAssignment_1() { return cChantsAssignment_1; }
		
		//Chant
		public RuleCall getChantsChantParserRuleCall_1_0() { return cChantsChantParserRuleCall_1_0; }
	}
	public class ToneElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.Tone");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cToneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cKeyKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cKeyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cKeyIDTerminalRuleCall_3_0 = (RuleCall)cKeyAssignment_3.eContents().get(0);
		private final RuleCall cBEGINTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Keyword cVoicesKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final RuleCall cBEGINTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Assignment cVoiceNamesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cVoiceNamesVoiceNameParserRuleCall_7_0 = (RuleCall)cVoiceNamesAssignment_7.eContents().get(0);
		private final RuleCall cENDTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final Assignment cPhrasesAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cPhrasesTonePhraseParserRuleCall_9_0 = (RuleCall)cPhrasesAssignment_9.eContents().get(0);
		private final RuleCall cENDTerminalRuleCall_10 = (RuleCall)cGroup.eContents().get(10);
		
		/// *
		// * Tone definitions
		// * / // TODO VOICE NAMES SHOULD BE GLOBAL
		//Tone:
		//	'Tone' name=ID 'key' key=ID
		//	BEGIN
		//	'Voices'
		//	BEGIN
		//	voiceNames+=VoiceName+
		//	END
		//	phrases+=TonePhrase+
		//	END;
		@Override public ParserRule getRule() { return rule; }
		
		//'Tone' name=ID 'key' key=ID BEGIN 'Voices' BEGIN voiceNames+=VoiceName+ END phrases+=TonePhrase+ END
		public Group getGroup() { return cGroup; }
		
		//'Tone'
		public Keyword getToneKeyword_0() { return cToneKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'key'
		public Keyword getKeyKeyword_2() { return cKeyKeyword_2; }
		
		//key=ID
		public Assignment getKeyAssignment_3() { return cKeyAssignment_3; }
		
		//ID
		public RuleCall getKeyIDTerminalRuleCall_3_0() { return cKeyIDTerminalRuleCall_3_0; }
		
		//BEGIN
		public RuleCall getBEGINTerminalRuleCall_4() { return cBEGINTerminalRuleCall_4; }
		
		//'Voices'
		public Keyword getVoicesKeyword_5() { return cVoicesKeyword_5; }
		
		//BEGIN
		public RuleCall getBEGINTerminalRuleCall_6() { return cBEGINTerminalRuleCall_6; }
		
		//voiceNames+=VoiceName+
		public Assignment getVoiceNamesAssignment_7() { return cVoiceNamesAssignment_7; }
		
		//VoiceName
		public RuleCall getVoiceNamesVoiceNameParserRuleCall_7_0() { return cVoiceNamesVoiceNameParserRuleCall_7_0; }
		
		//END
		public RuleCall getENDTerminalRuleCall_8() { return cENDTerminalRuleCall_8; }
		
		//phrases+=TonePhrase+
		public Assignment getPhrasesAssignment_9() { return cPhrasesAssignment_9; }
		
		//TonePhrase
		public RuleCall getPhrasesTonePhraseParserRuleCall_9_0() { return cPhrasesTonePhraseParserRuleCall_9_0; }
		
		//END
		public RuleCall getENDTerminalRuleCall_10() { return cENDTerminalRuleCall_10; }
	}
	public class VoiceNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.VoiceName");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//VoiceName:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class TonePhraseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.TonePhrase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPhraseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cBEGINTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cVoicesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVoicesVoicePhraseParserRuleCall_3_0 = (RuleCall)cVoicesAssignment_3.eContents().get(0);
		private final RuleCall cENDTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//TonePhrase:
		//	'Phrase' name=ID
		//	BEGIN
		//	voices+=VoicePhrase+
		//	END;
		@Override public ParserRule getRule() { return rule; }
		
		//'Phrase' name=ID BEGIN voices+=VoicePhrase+ END
		public Group getGroup() { return cGroup; }
		
		//'Phrase'
		public Keyword getPhraseKeyword_0() { return cPhraseKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//BEGIN
		public RuleCall getBEGINTerminalRuleCall_2() { return cBEGINTerminalRuleCall_2; }
		
		//voices+=VoicePhrase+
		public Assignment getVoicesAssignment_3() { return cVoicesAssignment_3; }
		
		//VoicePhrase
		public RuleCall getVoicesVoicePhraseParserRuleCall_3_0() { return cVoicesVoicePhraseParserRuleCall_3_0; }
		
		//END
		public RuleCall getENDTerminalRuleCall_4() { return cENDTerminalRuleCall_4; }
	}
	public class VoicePhraseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.VoicePhrase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVoiceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cNameVoiceNameCrossReference_1_0 = (CrossReference)cNameAssignment_1.eContents().get(0);
		private final RuleCall cNameVoiceNameIDTerminalRuleCall_1_0_1 = (RuleCall)cNameVoiceNameCrossReference_1_0.eContents().get(1);
		private final RuleCall cBEGINTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cNotesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNotesNoteParserRuleCall_3_0 = (RuleCall)cNotesAssignment_3.eContents().get(0);
		private final RuleCall cENDTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//VoicePhrase:
		//	'Voice' name=[VoiceName] BEGIN
		//	notes+=Note+
		//	END;
		@Override public ParserRule getRule() { return rule; }
		
		//'Voice' name=[VoiceName] BEGIN notes+=Note+ END
		public Group getGroup() { return cGroup; }
		
		//'Voice'
		public Keyword getVoiceKeyword_0() { return cVoiceKeyword_0; }
		
		//name=[VoiceName]
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//[VoiceName]
		public CrossReference getNameVoiceNameCrossReference_1_0() { return cNameVoiceNameCrossReference_1_0; }
		
		//ID
		public RuleCall getNameVoiceNameIDTerminalRuleCall_1_0_1() { return cNameVoiceNameIDTerminalRuleCall_1_0_1; }
		
		//BEGIN
		public RuleCall getBEGINTerminalRuleCall_2() { return cBEGINTerminalRuleCall_2; }
		
		//notes+=Note+
		public Assignment getNotesAssignment_3() { return cNotesAssignment_3; }
		
		//Note
		public RuleCall getNotesNoteParserRuleCall_3_0() { return cNotesNoteParserRuleCall_3_0; }
		
		//END
		public RuleCall getENDTerminalRuleCall_4() { return cENDTerminalRuleCall_4; }
	}
	public class ChantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.Chant");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChantKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cToneKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cToneAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cToneToneCrossReference_3_0 = (CrossReference)cToneAssignment_3.eContents().get(0);
		private final RuleCall cToneToneIDTerminalRuleCall_3_0_1 = (RuleCall)cToneToneCrossReference_3_0.eContents().get(1);
		private final Keyword cKeyKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cKeyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cKeyIDTerminalRuleCall_5_0 = (RuleCall)cKeyAssignment_5.eContents().get(0);
		private final RuleCall cBEGINTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Assignment cPhrasesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cPhrasesLyricPhraseParserRuleCall_7_0 = (RuleCall)cPhrasesAssignment_7.eContents().get(0);
		private final RuleCall cENDTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		
		///// *
		//// * Ensemble
		//// * /
		////
		////Ensemble:
		////	'ensemble' ':'
		////	'top' 'staff' ':' BEGIN voices+=[VoiceName]+ END
		////	'bottom' 'staff' ':' BEGIN voices+=[VoiceName]+ END
		////;
		/// *
		// * Chants
		// * / Chant:
		//	'Chant' name=STRING 'Tone' tone=[Tone] 'key' key=ID
		//	BEGIN
		//	phrases+=LyricPhrase+
		//	END;
		@Override public ParserRule getRule() { return rule; }
		
		//'Chant' name=STRING 'Tone' tone=[Tone] 'key' key=ID BEGIN phrases+=LyricPhrase+ END
		public Group getGroup() { return cGroup; }
		
		//'Chant'
		public Keyword getChantKeyword_0() { return cChantKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'Tone'
		public Keyword getToneKeyword_2() { return cToneKeyword_2; }
		
		//tone=[Tone]
		public Assignment getToneAssignment_3() { return cToneAssignment_3; }
		
		//[Tone]
		public CrossReference getToneToneCrossReference_3_0() { return cToneToneCrossReference_3_0; }
		
		//ID
		public RuleCall getToneToneIDTerminalRuleCall_3_0_1() { return cToneToneIDTerminalRuleCall_3_0_1; }
		
		//'key'
		public Keyword getKeyKeyword_4() { return cKeyKeyword_4; }
		
		//key=ID
		public Assignment getKeyAssignment_5() { return cKeyAssignment_5; }
		
		//ID
		public RuleCall getKeyIDTerminalRuleCall_5_0() { return cKeyIDTerminalRuleCall_5_0; }
		
		//BEGIN
		public RuleCall getBEGINTerminalRuleCall_6() { return cBEGINTerminalRuleCall_6; }
		
		//phrases+=LyricPhrase+
		public Assignment getPhrasesAssignment_7() { return cPhrasesAssignment_7; }
		
		//LyricPhrase
		public RuleCall getPhrasesLyricPhraseParserRuleCall_7_0() { return cPhrasesLyricPhraseParserRuleCall_7_0; }
		
		//END
		public RuleCall getENDTerminalRuleCall_8() { return cENDTerminalRuleCall_8; }
	}
	public class LyricPhraseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.LyricPhrase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPhraseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNotesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cNotesTonePhraseCrossReference_1_0 = (CrossReference)cNotesAssignment_1.eContents().get(0);
		private final RuleCall cNotesTonePhraseIDTerminalRuleCall_1_0_1 = (RuleCall)cNotesTonePhraseCrossReference_1_0.eContents().get(1);
		private final RuleCall cBEGINTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cNoteGroupsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNoteGroupsNoteGroupParserRuleCall_3_0 = (RuleCall)cNoteGroupsAssignment_3.eContents().get(0);
		private final Assignment cDoubleBarAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Keyword cDoubleBarVerticalLineVerticalLineKeyword_4_0 = (Keyword)cDoubleBarAssignment_4.eContents().get(0);
		private final RuleCall cENDTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//LyricPhrase:
		//	'Phrase' notes=[TonePhrase] BEGIN
		//	noteGroups+=NoteGroup+
		//	doubleBar?='||'?
		//	END;
		@Override public ParserRule getRule() { return rule; }
		
		//'Phrase' notes=[TonePhrase] BEGIN noteGroups+=NoteGroup+ doubleBar?='||'? END
		public Group getGroup() { return cGroup; }
		
		//'Phrase'
		public Keyword getPhraseKeyword_0() { return cPhraseKeyword_0; }
		
		//notes=[TonePhrase]
		public Assignment getNotesAssignment_1() { return cNotesAssignment_1; }
		
		//[TonePhrase]
		public CrossReference getNotesTonePhraseCrossReference_1_0() { return cNotesTonePhraseCrossReference_1_0; }
		
		//ID
		public RuleCall getNotesTonePhraseIDTerminalRuleCall_1_0_1() { return cNotesTonePhraseIDTerminalRuleCall_1_0_1; }
		
		//BEGIN
		public RuleCall getBEGINTerminalRuleCall_2() { return cBEGINTerminalRuleCall_2; }
		
		//noteGroups+=NoteGroup+
		public Assignment getNoteGroupsAssignment_3() { return cNoteGroupsAssignment_3; }
		
		//NoteGroup
		public RuleCall getNoteGroupsNoteGroupParserRuleCall_3_0() { return cNoteGroupsNoteGroupParserRuleCall_3_0; }
		
		//doubleBar?='||'?
		public Assignment getDoubleBarAssignment_4() { return cDoubleBarAssignment_4; }
		
		//'||'
		public Keyword getDoubleBarVerticalLineVerticalLineKeyword_4_0() { return cDoubleBarVerticalLineVerticalLineKeyword_4_0; }
		
		//END
		public RuleCall getENDTerminalRuleCall_5() { return cENDTerminalRuleCall_5; }
	}
	public class NoteGroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.NoteGroup");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Alternatives cAlternatives_0_0 = (Alternatives)cGroup_0.eContents().get(0);
		private final Group cGroup_0_0_0 = (Group)cAlternatives_0_0.eContents().get(0);
		private final Assignment cSyllablesAssignment_0_0_0_0 = (Assignment)cGroup_0_0_0.eContents().get(0);
		private final RuleCall cSyllablesIDTerminalRuleCall_0_0_0_0_0 = (RuleCall)cSyllablesAssignment_0_0_0_0.eContents().get(0);
		private final Group cGroup_0_0_0_1 = (Group)cGroup_0_0_0.eContents().get(1);
		private final Assignment cSyllablesAssignment_0_0_0_1_0 = (Assignment)cGroup_0_0_0_1.eContents().get(0);
		private final RuleCall cSyllablesHYPHENTerminalRuleCall_0_0_0_1_0_0 = (RuleCall)cSyllablesAssignment_0_0_0_1_0.eContents().get(0);
		private final Group cGroup_0_0_1 = (Group)cAlternatives_0_0.eContents().get(1);
		private final Assignment cSyllablesAssignment_0_0_1_0 = (Assignment)cGroup_0_0_1.eContents().get(0);
		private final RuleCall cSyllablesHYPHENTerminalRuleCall_0_0_1_0_0 = (RuleCall)cSyllablesAssignment_0_0_1_0.eContents().get(0);
		private final Assignment cSyllablesAssignment_0_0_1_1 = (Assignment)cGroup_0_0_1.eContents().get(1);
		private final RuleCall cSyllablesIDTerminalRuleCall_0_0_1_1_0 = (RuleCall)cSyllablesAssignment_0_0_1_1.eContents().get(0);
		private final Assignment cSyllablesAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cSyllablesEXTENDERTerminalRuleCall_0_1_0 = (RuleCall)cSyllablesAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cSTART_NOTE_GROUPTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Assignment cSyllablesAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cSyllablesAlternatives_1_1_0 = (Alternatives)cSyllablesAssignment_1_1.eContents().get(0);
		private final RuleCall cSyllablesIDTerminalRuleCall_1_1_0_0 = (RuleCall)cSyllablesAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cSyllablesHYPHENTerminalRuleCall_1_1_0_1 = (RuleCall)cSyllablesAlternatives_1_1_0.eContents().get(1);
		private final RuleCall cEND_NOTE_GROUPTerminalRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		
		//NoteGroup:
		//	(syllables+=ID => (syllables+=HYPHEN)?
		//	| syllables+=HYPHEN syllables+=ID) syllables+=EXTENDER*
		//	// group of syllables to be repeated on the same pitch
		//	// Note that '__' is not allowed within a group, as this implies a slur
		//	| START_NOTE_GROUP syllables+=(ID | HYPHEN)+ END_NOTE_GROUP;
		@Override public ParserRule getRule() { return rule; }
		
		//(syllables+=ID => (syllables+=HYPHEN)? | syllables+=HYPHEN syllables+=ID) syllables+=EXTENDER* // group of syllables to be repeated on the same pitch
		//// Note that '__' is not allowed within a group, as this implies a slur
		//| START_NOTE_GROUP syllables+=(ID | HYPHEN)+ END_NOTE_GROUP
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//(syllables+=ID => (syllables+=HYPHEN)? | syllables+=HYPHEN syllables+=ID) syllables+=EXTENDER*
		public Group getGroup_0() { return cGroup_0; }
		
		//// single syllable
		//syllables+=ID => (syllables+=HYPHEN)? | syllables+=HYPHEN syllables+=ID
		public Alternatives getAlternatives_0_0() { return cAlternatives_0_0; }
		
		//syllables+=ID => (syllables+=HYPHEN)?
		public Group getGroup_0_0_0() { return cGroup_0_0_0; }
		
		//syllables+=ID
		public Assignment getSyllablesAssignment_0_0_0_0() { return cSyllablesAssignment_0_0_0_0; }
		
		//ID
		public RuleCall getSyllablesIDTerminalRuleCall_0_0_0_0_0() { return cSyllablesIDTerminalRuleCall_0_0_0_0_0; }
		
		//=> (syllables+=HYPHEN)?
		public Group getGroup_0_0_0_1() { return cGroup_0_0_0_1; }
		
		//syllables+=HYPHEN
		public Assignment getSyllablesAssignment_0_0_0_1_0() { return cSyllablesAssignment_0_0_0_1_0; }
		
		//HYPHEN
		public RuleCall getSyllablesHYPHENTerminalRuleCall_0_0_0_1_0_0() { return cSyllablesHYPHENTerminalRuleCall_0_0_0_1_0_0; }
		
		//syllables+=HYPHEN syllables+=ID
		public Group getGroup_0_0_1() { return cGroup_0_0_1; }
		
		//syllables+=HYPHEN
		public Assignment getSyllablesAssignment_0_0_1_0() { return cSyllablesAssignment_0_0_1_0; }
		
		//HYPHEN
		public RuleCall getSyllablesHYPHENTerminalRuleCall_0_0_1_0_0() { return cSyllablesHYPHENTerminalRuleCall_0_0_1_0_0; }
		
		//syllables+=ID
		public Assignment getSyllablesAssignment_0_0_1_1() { return cSyllablesAssignment_0_0_1_1; }
		
		//ID
		public RuleCall getSyllablesIDTerminalRuleCall_0_0_1_1_0() { return cSyllablesIDTerminalRuleCall_0_0_1_1_0; }
		
		//syllables+=EXTENDER*
		public Assignment getSyllablesAssignment_0_1() { return cSyllablesAssignment_0_1; }
		
		//EXTENDER
		public RuleCall getSyllablesEXTENDERTerminalRuleCall_0_1_0() { return cSyllablesEXTENDERTerminalRuleCall_0_1_0; }
		
		//START_NOTE_GROUP syllables+=(ID | HYPHEN)+ END_NOTE_GROUP
		public Group getGroup_1() { return cGroup_1; }
		
		//START_NOTE_GROUP
		public RuleCall getSTART_NOTE_GROUPTerminalRuleCall_1_0() { return cSTART_NOTE_GROUPTerminalRuleCall_1_0; }
		
		//syllables+=(ID | HYPHEN)+
		public Assignment getSyllablesAssignment_1_1() { return cSyllablesAssignment_1_1; }
		
		//(ID | HYPHEN)
		public Alternatives getSyllablesAlternatives_1_1_0() { return cSyllablesAlternatives_1_1_0; }
		
		//ID
		public RuleCall getSyllablesIDTerminalRuleCall_1_1_0_0() { return cSyllablesIDTerminalRuleCall_1_1_0_0; }
		
		//HYPHEN
		public RuleCall getSyllablesHYPHENTerminalRuleCall_1_1_0_1() { return cSyllablesHYPHENTerminalRuleCall_1_1_0_1; }
		
		//END_NOTE_GROUP
		public RuleCall getEND_NOTE_GROUPTerminalRuleCall_1_2() { return cEND_NOTE_GROUPTerminalRuleCall_1_2; }
	}
	public class NoteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.Note");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cDURATIONTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		/// *
		// * Notes and keys
		// * / //enum Mode:
		////	major='major' | minor='minor'
		////;
		//Note:
		//	ID DURATION?;
		@Override public ParserRule getRule() { return rule; }
		
		//ID DURATION?
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//DURATION?
		public RuleCall getDURATIONTerminalRuleCall_1() { return cDURATIONTerminalRuleCall_1; }
	}
	
	
	private final ScriptElements pScript;
	private final ToneElements pTone;
	private final VoiceNameElements pVoiceName;
	private final TonePhraseElements pTonePhrase;
	private final VoicePhraseElements pVoicePhrase;
	private final ChantElements pChant;
	private final LyricPhraseElements pLyricPhrase;
	private final NoteGroupElements pNoteGroup;
	private final NoteElements pNote;
	private final TerminalRule tID;
	private final TerminalRule tSTRING;
	private final TerminalRule tDURATION;
	private final TerminalRule tHYPHEN;
	private final TerminalRule tEXTENDER;
	private final TerminalRule tSTART_NOTE_GROUP;
	private final TerminalRule tEND_NOTE_GROUP;
	private final TerminalRule tBEGIN;
	private final TerminalRule tEND;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	private final TerminalRule tANY_OTHER;
	
	private final Grammar grammar;

	@Inject
	public LilyChantGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pScript = new ScriptElements();
		this.pTone = new ToneElements();
		this.pVoiceName = new VoiceNameElements();
		this.pTonePhrase = new TonePhraseElements();
		this.pVoicePhrase = new VoicePhraseElements();
		this.pChant = new ChantElements();
		this.pLyricPhrase = new LyricPhraseElements();
		this.pNoteGroup = new NoteGroupElements();
		this.pNote = new NoteElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.ID");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.STRING");
		this.tDURATION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.DURATION");
		this.tHYPHEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.HYPHEN");
		this.tEXTENDER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.EXTENDER");
		this.tSTART_NOTE_GROUP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.START_NOTE_GROUP");
		this.tEND_NOTE_GROUP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.END_NOTE_GROUP");
		this.tBEGIN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.BEGIN");
		this.tEND = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.END");
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.WS");
		this.tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.lilychant.LilyChant.ANY_OTHER");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.lilychant.LilyChant".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//Script:
	//	tones+=Tone*
	//	//	ensemble=Ensemble
	//	chants+=Chant*;
	public ScriptElements getScriptAccess() {
		return pScript;
	}
	
	public ParserRule getScriptRule() {
		return getScriptAccess().getRule();
	}
	
	/// *
	// * Tone definitions
	// * / // TODO VOICE NAMES SHOULD BE GLOBAL
	//Tone:
	//	'Tone' name=ID 'key' key=ID
	//	BEGIN
	//	'Voices'
	//	BEGIN
	//	voiceNames+=VoiceName+
	//	END
	//	phrases+=TonePhrase+
	//	END;
	public ToneElements getToneAccess() {
		return pTone;
	}
	
	public ParserRule getToneRule() {
		return getToneAccess().getRule();
	}
	
	//VoiceName:
	//	name=ID;
	public VoiceNameElements getVoiceNameAccess() {
		return pVoiceName;
	}
	
	public ParserRule getVoiceNameRule() {
		return getVoiceNameAccess().getRule();
	}
	
	//TonePhrase:
	//	'Phrase' name=ID
	//	BEGIN
	//	voices+=VoicePhrase+
	//	END;
	public TonePhraseElements getTonePhraseAccess() {
		return pTonePhrase;
	}
	
	public ParserRule getTonePhraseRule() {
		return getTonePhraseAccess().getRule();
	}
	
	//VoicePhrase:
	//	'Voice' name=[VoiceName] BEGIN
	//	notes+=Note+
	//	END;
	public VoicePhraseElements getVoicePhraseAccess() {
		return pVoicePhrase;
	}
	
	public ParserRule getVoicePhraseRule() {
		return getVoicePhraseAccess().getRule();
	}
	
	///// *
	//// * Ensemble
	//// * /
	////
	////Ensemble:
	////	'ensemble' ':'
	////	'top' 'staff' ':' BEGIN voices+=[VoiceName]+ END
	////	'bottom' 'staff' ':' BEGIN voices+=[VoiceName]+ END
	////;
	/// *
	// * Chants
	// * / Chant:
	//	'Chant' name=STRING 'Tone' tone=[Tone] 'key' key=ID
	//	BEGIN
	//	phrases+=LyricPhrase+
	//	END;
	public ChantElements getChantAccess() {
		return pChant;
	}
	
	public ParserRule getChantRule() {
		return getChantAccess().getRule();
	}
	
	//LyricPhrase:
	//	'Phrase' notes=[TonePhrase] BEGIN
	//	noteGroups+=NoteGroup+
	//	doubleBar?='||'?
	//	END;
	public LyricPhraseElements getLyricPhraseAccess() {
		return pLyricPhrase;
	}
	
	public ParserRule getLyricPhraseRule() {
		return getLyricPhraseAccess().getRule();
	}
	
	//NoteGroup:
	//	(syllables+=ID => (syllables+=HYPHEN)?
	//	| syllables+=HYPHEN syllables+=ID) syllables+=EXTENDER*
	//	// group of syllables to be repeated on the same pitch
	//	// Note that '__' is not allowed within a group, as this implies a slur
	//	| START_NOTE_GROUP syllables+=(ID | HYPHEN)+ END_NOTE_GROUP;
	public NoteGroupElements getNoteGroupAccess() {
		return pNoteGroup;
	}
	
	public ParserRule getNoteGroupRule() {
		return getNoteGroupAccess().getRule();
	}
	
	/// *
	// * Notes and keys
	// * / //enum Mode:
	////	major='major' | minor='minor'
	////;
	//Note:
	//	ID DURATION?;
	public NoteElements getNoteAccess() {
		return pNote;
	}
	
	public ParserRule getNoteRule() {
		return getNoteAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '\\u0400'..'\\u04ff' | ',' | '\'' | ';' | '.' | ':')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
	
	//terminal DURATION:
	//	'1' | '2' | '4' | '8' | '16' | '\breve'+;
	public TerminalRule getDURATIONRule() {
		return tDURATION;
	}
	
	//terminal HYPHEN:
	//	'--';
	public TerminalRule getHYPHENRule() {
		return tHYPHEN;
	}
	
	//terminal EXTENDER:
	//	'__';
	public TerminalRule getEXTENDERRule() {
		return tEXTENDER;
	}
	
	//terminal START_NOTE_GROUP:
	//	'<';
	public TerminalRule getSTART_NOTE_GROUPRule() {
		return tSTART_NOTE_GROUP;
	}
	
	//terminal END_NOTE_GROUP:
	//	'>';
	public TerminalRule getEND_NOTE_GROUPRule() {
		return tEND_NOTE_GROUP;
	}
	
	//terminal BEGIN:
	//	'synthetic:BEGIN';
	public TerminalRule getBEGINRule() {
		return tBEGIN;
	}
	
	//terminal END:
	//	'synthetic:END';
	public TerminalRule getENDRule() {
		return tEND;
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return tANY_OTHER;
	}
}
