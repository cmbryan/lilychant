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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLilyChantParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RaggedLastBottom", "RaggedBottom", "Format", "Phrase", "Voices", "Chant", "Voice", "Tone", "HyphenMinusHyphenMinus", "KW___", "VerticalLineVerticalLine", "LeftParenthesis", "RightParenthesis", "Asterisk", "Solidus", "KW__", "VerticalLine", "RULE_ID", "RULE_STRING", "RULE_DURATION", "RULE_START_NOTE_GROUP", "RULE_END_NOTE_GROUP", "RULE_BEGIN", "RULE_END", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int HyphenMinusHyphenMinus=12;
    public static final int RULE_END=27;
    public static final int RULE_BEGIN=26;
    public static final int RULE_DURATION=23;
    public static final int RaggedBottom=5;
    public static final int VerticalLineVerticalLine=14;
    public static final int RULE_STRING=22;
    public static final int RULE_SL_COMMENT=29;
    public static final int RULE_START_NOTE_GROUP=24;
    public static final int Format=6;
    public static final int LeftParenthesis=15;
    public static final int KW___=13;
    public static final int Solidus=18;
    public static final int EOF=-1;
    public static final int Asterisk=17;
    public static final int Chant=9;
    public static final int RULE_ID=21;
    public static final int RULE_WS=30;
    public static final int RightParenthesis=16;
    public static final int RaggedLastBottom=4;
    public static final int Phrase=7;
    public static final int RULE_ANY_OTHER=31;
    public static final int Voices=8;
    public static final int KW__=19;
    public static final int RULE_END_NOTE_GROUP=25;
    public static final int Tone=11;
    public static final int VerticalLine=20;
    public static final int RULE_ML_COMMENT=28;
    public static final int Voice=10;

    // delegates
    // delegators


        public InternalLilyChantParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLilyChantParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLilyChantParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLilyChantParser.g"; }


    	private LilyChantGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("Solidus", "'/'");
    		tokenNameToValue.put("KW__", "'_'");
    		tokenNameToValue.put("VerticalLine", "'|'");
    		tokenNameToValue.put("HyphenMinusHyphenMinus", "'--'");
    		tokenNameToValue.put("KW___", "'__'");
    		tokenNameToValue.put("VerticalLineVerticalLine", "'||'");
    		tokenNameToValue.put("Tone", "'Tone'");
    		tokenNameToValue.put("Chant", "'Chant'");
    		tokenNameToValue.put("Voice", "'Voice'");
    		tokenNameToValue.put("Format", "'Format'");
    		tokenNameToValue.put("Phrase", "'Phrase'");
    		tokenNameToValue.put("Voices", "'Voices'");
    		tokenNameToValue.put("RaggedBottom", "'ragged-bottom'");
    		tokenNameToValue.put("RaggedLastBottom", "'ragged-last-bottom'");
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



    // $ANTLR start "entryRuleScript"
    // InternalLilyChantParser.g:73:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:74:1: ( ruleScript EOF )
            // InternalLilyChantParser.g:75:1: ruleScript EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleScript();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalLilyChantParser.g:82:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:86:2: ( ( ( rule__Script__Group__0 ) ) )
            // InternalLilyChantParser.g:87:2: ( ( rule__Script__Group__0 ) )
            {
            // InternalLilyChantParser.g:87:2: ( ( rule__Script__Group__0 ) )
            // InternalLilyChantParser.g:88:3: ( rule__Script__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:89:3: ( rule__Script__Group__0 )
            // InternalLilyChantParser.g:89:4: rule__Script__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleTone"
    // InternalLilyChantParser.g:98:1: entryRuleTone : ruleTone EOF ;
    public final void entryRuleTone() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:99:1: ( ruleTone EOF )
            // InternalLilyChantParser.g:100:1: ruleTone EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTone();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTone"


    // $ANTLR start "ruleTone"
    // InternalLilyChantParser.g:107:1: ruleTone : ( ( rule__Tone__Group__0 ) ) ;
    public final void ruleTone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:111:2: ( ( ( rule__Tone__Group__0 ) ) )
            // InternalLilyChantParser.g:112:2: ( ( rule__Tone__Group__0 ) )
            {
            // InternalLilyChantParser.g:112:2: ( ( rule__Tone__Group__0 ) )
            // InternalLilyChantParser.g:113:3: ( rule__Tone__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:114:3: ( rule__Tone__Group__0 )
            // InternalLilyChantParser.g:114:4: rule__Tone__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tone__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTone"


    // $ANTLR start "entryRuleVoiceName"
    // InternalLilyChantParser.g:123:1: entryRuleVoiceName : ruleVoiceName EOF ;
    public final void entryRuleVoiceName() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:124:1: ( ruleVoiceName EOF )
            // InternalLilyChantParser.g:125:1: ruleVoiceName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoiceNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVoiceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoiceNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVoiceName"


    // $ANTLR start "ruleVoiceName"
    // InternalLilyChantParser.g:132:1: ruleVoiceName : ( ( rule__VoiceName__NameAssignment ) ) ;
    public final void ruleVoiceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:136:2: ( ( ( rule__VoiceName__NameAssignment ) ) )
            // InternalLilyChantParser.g:137:2: ( ( rule__VoiceName__NameAssignment ) )
            {
            // InternalLilyChantParser.g:137:2: ( ( rule__VoiceName__NameAssignment ) )
            // InternalLilyChantParser.g:138:3: ( rule__VoiceName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoiceNameAccess().getNameAssignment()); 
            }
            // InternalLilyChantParser.g:139:3: ( rule__VoiceName__NameAssignment )
            // InternalLilyChantParser.g:139:4: rule__VoiceName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VoiceName__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoiceNameAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVoiceName"


    // $ANTLR start "entryRuleTonePhrase"
    // InternalLilyChantParser.g:148:1: entryRuleTonePhrase : ruleTonePhrase EOF ;
    public final void entryRuleTonePhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:149:1: ( ruleTonePhrase EOF )
            // InternalLilyChantParser.g:150:1: ruleTonePhrase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTonePhrase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTonePhraseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTonePhrase"


    // $ANTLR start "ruleTonePhrase"
    // InternalLilyChantParser.g:157:1: ruleTonePhrase : ( ( rule__TonePhrase__Group__0 ) ) ;
    public final void ruleTonePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:161:2: ( ( ( rule__TonePhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:162:2: ( ( rule__TonePhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:162:2: ( ( rule__TonePhrase__Group__0 ) )
            // InternalLilyChantParser.g:163:3: ( rule__TonePhrase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:164:3: ( rule__TonePhrase__Group__0 )
            // InternalLilyChantParser.g:164:4: rule__TonePhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TonePhrase__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTonePhraseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTonePhrase"


    // $ANTLR start "entryRuleVoicePhrase"
    // InternalLilyChantParser.g:173:1: entryRuleVoicePhrase : ruleVoicePhrase EOF ;
    public final void entryRuleVoicePhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:174:1: ( ruleVoicePhrase EOF )
            // InternalLilyChantParser.g:175:1: ruleVoicePhrase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVoicePhrase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoicePhraseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVoicePhrase"


    // $ANTLR start "ruleVoicePhrase"
    // InternalLilyChantParser.g:182:1: ruleVoicePhrase : ( ( rule__VoicePhrase__Group__0 ) ) ;
    public final void ruleVoicePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:186:2: ( ( ( rule__VoicePhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:187:2: ( ( rule__VoicePhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:187:2: ( ( rule__VoicePhrase__Group__0 ) )
            // InternalLilyChantParser.g:188:3: ( rule__VoicePhrase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:189:3: ( rule__VoicePhrase__Group__0 )
            // InternalLilyChantParser.g:189:4: rule__VoicePhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VoicePhrase__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoicePhraseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVoicePhrase"


    // $ANTLR start "entryRuleChant"
    // InternalLilyChantParser.g:198:1: entryRuleChant : ruleChant EOF ;
    public final void entryRuleChant() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:199:1: ( ruleChant EOF )
            // InternalLilyChantParser.g:200:1: ruleChant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleChant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChant"


    // $ANTLR start "ruleChant"
    // InternalLilyChantParser.g:207:1: ruleChant : ( ( rule__Chant__Group__0 ) ) ;
    public final void ruleChant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:211:2: ( ( ( rule__Chant__Group__0 ) ) )
            // InternalLilyChantParser.g:212:2: ( ( rule__Chant__Group__0 ) )
            {
            // InternalLilyChantParser.g:212:2: ( ( rule__Chant__Group__0 ) )
            // InternalLilyChantParser.g:213:3: ( rule__Chant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:214:3: ( rule__Chant__Group__0 )
            // InternalLilyChantParser.g:214:4: rule__Chant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChant"


    // $ANTLR start "entryRuleLyricPhrase"
    // InternalLilyChantParser.g:223:1: entryRuleLyricPhrase : ruleLyricPhrase EOF ;
    public final void entryRuleLyricPhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:224:1: ( ruleLyricPhrase EOF )
            // InternalLilyChantParser.g:225:1: ruleLyricPhrase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLyricPhrase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLyricPhrase"


    // $ANTLR start "ruleLyricPhrase"
    // InternalLilyChantParser.g:232:1: ruleLyricPhrase : ( ( rule__LyricPhrase__Group__0 ) ) ;
    public final void ruleLyricPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:236:2: ( ( ( rule__LyricPhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:237:2: ( ( rule__LyricPhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:237:2: ( ( rule__LyricPhrase__Group__0 ) )
            // InternalLilyChantParser.g:238:3: ( rule__LyricPhrase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:239:3: ( rule__LyricPhrase__Group__0 )
            // InternalLilyChantParser.g:239:4: rule__LyricPhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLyricPhrase"


    // $ANTLR start "entryRuleNoteGroup"
    // InternalLilyChantParser.g:248:1: entryRuleNoteGroup : ruleNoteGroup EOF ;
    public final void entryRuleNoteGroup() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:249:1: ( ruleNoteGroup EOF )
            // InternalLilyChantParser.g:250:1: ruleNoteGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNoteGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoteGroup"


    // $ANTLR start "ruleNoteGroup"
    // InternalLilyChantParser.g:257:1: ruleNoteGroup : ( ( rule__NoteGroup__Alternatives ) ) ;
    public final void ruleNoteGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:261:2: ( ( ( rule__NoteGroup__Alternatives ) ) )
            // InternalLilyChantParser.g:262:2: ( ( rule__NoteGroup__Alternatives ) )
            {
            // InternalLilyChantParser.g:262:2: ( ( rule__NoteGroup__Alternatives ) )
            // InternalLilyChantParser.g:263:3: ( rule__NoteGroup__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getAlternatives()); 
            }
            // InternalLilyChantParser.g:264:3: ( rule__NoteGroup__Alternatives )
            // InternalLilyChantParser.g:264:4: rule__NoteGroup__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoteGroup"


    // $ANTLR start "entryRuleIdRule"
    // InternalLilyChantParser.g:273:1: entryRuleIdRule : ruleIdRule EOF ;
    public final void entryRuleIdRule() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:274:1: ( ruleIdRule EOF )
            // InternalLilyChantParser.g:275:1: ruleIdRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIdRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdRule"


    // $ANTLR start "ruleIdRule"
    // InternalLilyChantParser.g:282:1: ruleIdRule : ( ( rule__IdRule__Group__0 ) ) ;
    public final void ruleIdRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:286:2: ( ( ( rule__IdRule__Group__0 ) ) )
            // InternalLilyChantParser.g:287:2: ( ( rule__IdRule__Group__0 ) )
            {
            // InternalLilyChantParser.g:287:2: ( ( rule__IdRule__Group__0 ) )
            // InternalLilyChantParser.g:288:3: ( rule__IdRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdRuleAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:289:3: ( rule__IdRule__Group__0 )
            // InternalLilyChantParser.g:289:4: rule__IdRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IdRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdRule"


    // $ANTLR start "entryRuleHyphenRule"
    // InternalLilyChantParser.g:298:1: entryRuleHyphenRule : ruleHyphenRule EOF ;
    public final void entryRuleHyphenRule() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:299:1: ( ruleHyphenRule EOF )
            // InternalLilyChantParser.g:300:1: ruleHyphenRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHyphenRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHyphenRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHyphenRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHyphenRule"


    // $ANTLR start "ruleHyphenRule"
    // InternalLilyChantParser.g:307:1: ruleHyphenRule : ( ( rule__HyphenRule__Group__0 ) ) ;
    public final void ruleHyphenRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:311:2: ( ( ( rule__HyphenRule__Group__0 ) ) )
            // InternalLilyChantParser.g:312:2: ( ( rule__HyphenRule__Group__0 ) )
            {
            // InternalLilyChantParser.g:312:2: ( ( rule__HyphenRule__Group__0 ) )
            // InternalLilyChantParser.g:313:3: ( rule__HyphenRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHyphenRuleAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:314:3: ( rule__HyphenRule__Group__0 )
            // InternalLilyChantParser.g:314:4: rule__HyphenRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HyphenRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHyphenRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHyphenRule"


    // $ANTLR start "entryRuleExtenderRule"
    // InternalLilyChantParser.g:323:1: entryRuleExtenderRule : ruleExtenderRule EOF ;
    public final void entryRuleExtenderRule() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:324:1: ( ruleExtenderRule EOF )
            // InternalLilyChantParser.g:325:1: ruleExtenderRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtenderRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExtenderRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtenderRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtenderRule"


    // $ANTLR start "ruleExtenderRule"
    // InternalLilyChantParser.g:332:1: ruleExtenderRule : ( ( rule__ExtenderRule__Group__0 ) ) ;
    public final void ruleExtenderRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:336:2: ( ( ( rule__ExtenderRule__Group__0 ) ) )
            // InternalLilyChantParser.g:337:2: ( ( rule__ExtenderRule__Group__0 ) )
            {
            // InternalLilyChantParser.g:337:2: ( ( rule__ExtenderRule__Group__0 ) )
            // InternalLilyChantParser.g:338:3: ( rule__ExtenderRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtenderRuleAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:339:3: ( rule__ExtenderRule__Group__0 )
            // InternalLilyChantParser.g:339:4: rule__ExtenderRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtenderRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtenderRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtenderRule"


    // $ANTLR start "entryRuleSkipRule"
    // InternalLilyChantParser.g:348:1: entryRuleSkipRule : ruleSkipRule EOF ;
    public final void entryRuleSkipRule() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:349:1: ( ruleSkipRule EOF )
            // InternalLilyChantParser.g:350:1: ruleSkipRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSkipRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSkipRule"


    // $ANTLR start "ruleSkipRule"
    // InternalLilyChantParser.g:357:1: ruleSkipRule : ( ( rule__SkipRule__Group__0 ) ) ;
    public final void ruleSkipRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:361:2: ( ( ( rule__SkipRule__Group__0 ) ) )
            // InternalLilyChantParser.g:362:2: ( ( rule__SkipRule__Group__0 ) )
            {
            // InternalLilyChantParser.g:362:2: ( ( rule__SkipRule__Group__0 ) )
            // InternalLilyChantParser.g:363:3: ( rule__SkipRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipRuleAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:364:3: ( rule__SkipRule__Group__0 )
            // InternalLilyChantParser.g:364:4: rule__SkipRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SkipRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkipRule"


    // $ANTLR start "entryRuleNote"
    // InternalLilyChantParser.g:373:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:374:1: ( ruleNote EOF )
            // InternalLilyChantParser.g:375:1: ruleNote EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNote();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalLilyChantParser.g:382:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:386:2: ( ( ( rule__Note__Group__0 ) ) )
            // InternalLilyChantParser.g:387:2: ( ( rule__Note__Group__0 ) )
            {
            // InternalLilyChantParser.g:387:2: ( ( rule__Note__Group__0 ) )
            // InternalLilyChantParser.g:388:3: ( rule__Note__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:389:3: ( rule__Note__Group__0 )
            // InternalLilyChantParser.g:389:4: rule__Note__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleFormat"
    // InternalLilyChantParser.g:398:1: entryRuleFormat : ruleFormat EOF ;
    public final void entryRuleFormat() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:399:1: ( ruleFormat EOF )
            // InternalLilyChantParser.g:400:1: ruleFormat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFormat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormat"


    // $ANTLR start "ruleFormat"
    // InternalLilyChantParser.g:407:1: ruleFormat : ( ( rule__Format__Group__0 ) ) ;
    public final void ruleFormat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:411:2: ( ( ( rule__Format__Group__0 ) ) )
            // InternalLilyChantParser.g:412:2: ( ( rule__Format__Group__0 ) )
            {
            // InternalLilyChantParser.g:412:2: ( ( rule__Format__Group__0 ) )
            // InternalLilyChantParser.g:413:3: ( rule__Format__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:414:3: ( rule__Format__Group__0 )
            // InternalLilyChantParser.g:414:4: rule__Format__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Format__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormat"


    // $ANTLR start "ruleBarline"
    // InternalLilyChantParser.g:423:1: ruleBarline : ( ( rule__Barline__Alternatives ) ) ;
    public final void ruleBarline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:427:1: ( ( ( rule__Barline__Alternatives ) ) )
            // InternalLilyChantParser.g:428:2: ( ( rule__Barline__Alternatives ) )
            {
            // InternalLilyChantParser.g:428:2: ( ( rule__Barline__Alternatives ) )
            // InternalLilyChantParser.g:429:3: ( rule__Barline__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBarlineAccess().getAlternatives()); 
            }
            // InternalLilyChantParser.g:430:3: ( rule__Barline__Alternatives )
            // InternalLilyChantParser.g:430:4: rule__Barline__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Barline__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBarlineAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBarline"


    // $ANTLR start "rule__NoteGroup__Alternatives"
    // InternalLilyChantParser.g:438:1: rule__NoteGroup__Alternatives : ( ( ( rule__NoteGroup__Group_0__0 ) ) | ( ( rule__NoteGroup__SyllablesAssignment_1 ) ) | ( ( rule__NoteGroup__Group_2__0 ) ) );
    public final void rule__NoteGroup__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:442:1: ( ( ( rule__NoteGroup__Group_0__0 ) ) | ( ( rule__NoteGroup__SyllablesAssignment_1 ) ) | ( ( rule__NoteGroup__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case HyphenMinusHyphenMinus:
            case Asterisk:
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case KW__:
                {
                alt1=2;
                }
                break;
            case RULE_START_NOTE_GROUP:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalLilyChantParser.g:443:2: ( ( rule__NoteGroup__Group_0__0 ) )
                    {
                    // InternalLilyChantParser.g:443:2: ( ( rule__NoteGroup__Group_0__0 ) )
                    // InternalLilyChantParser.g:444:3: ( rule__NoteGroup__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_0()); 
                    }
                    // InternalLilyChantParser.g:445:3: ( rule__NoteGroup__Group_0__0 )
                    // InternalLilyChantParser.g:445:4: rule__NoteGroup__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NoteGroup__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNoteGroupAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLilyChantParser.g:449:2: ( ( rule__NoteGroup__SyllablesAssignment_1 ) )
                    {
                    // InternalLilyChantParser.g:449:2: ( ( rule__NoteGroup__SyllablesAssignment_1 ) )
                    // InternalLilyChantParser.g:450:3: ( rule__NoteGroup__SyllablesAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1()); 
                    }
                    // InternalLilyChantParser.g:451:3: ( rule__NoteGroup__SyllablesAssignment_1 )
                    // InternalLilyChantParser.g:451:4: rule__NoteGroup__SyllablesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NoteGroup__SyllablesAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLilyChantParser.g:455:2: ( ( rule__NoteGroup__Group_2__0 ) )
                    {
                    // InternalLilyChantParser.g:455:2: ( ( rule__NoteGroup__Group_2__0 ) )
                    // InternalLilyChantParser.g:456:3: ( rule__NoteGroup__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_2()); 
                    }
                    // InternalLilyChantParser.g:457:3: ( rule__NoteGroup__Group_2__0 )
                    // InternalLilyChantParser.g:457:4: rule__NoteGroup__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NoteGroup__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNoteGroupAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Alternatives"


    // $ANTLR start "rule__NoteGroup__Alternatives_0_0"
    // InternalLilyChantParser.g:465:1: rule__NoteGroup__Alternatives_0_0 : ( ( ( rule__NoteGroup__Group_0_0_0__0 ) ) | ( ( rule__NoteGroup__Group_0_0_1__0 ) ) );
    public final void rule__NoteGroup__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:469:1: ( ( ( rule__NoteGroup__Group_0_0_0__0 ) ) | ( ( rule__NoteGroup__Group_0_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Asterisk||LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==HyphenMinusHyphenMinus) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLilyChantParser.g:470:2: ( ( rule__NoteGroup__Group_0_0_0__0 ) )
                    {
                    // InternalLilyChantParser.g:470:2: ( ( rule__NoteGroup__Group_0_0_0__0 ) )
                    // InternalLilyChantParser.g:471:3: ( rule__NoteGroup__Group_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_0_0_0()); 
                    }
                    // InternalLilyChantParser.g:472:3: ( rule__NoteGroup__Group_0_0_0__0 )
                    // InternalLilyChantParser.g:472:4: rule__NoteGroup__Group_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NoteGroup__Group_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNoteGroupAccess().getGroup_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLilyChantParser.g:476:2: ( ( rule__NoteGroup__Group_0_0_1__0 ) )
                    {
                    // InternalLilyChantParser.g:476:2: ( ( rule__NoteGroup__Group_0_0_1__0 ) )
                    // InternalLilyChantParser.g:477:3: ( rule__NoteGroup__Group_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_0_0_1()); 
                    }
                    // InternalLilyChantParser.g:478:3: ( rule__NoteGroup__Group_0_0_1__0 )
                    // InternalLilyChantParser.g:478:4: rule__NoteGroup__Group_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NoteGroup__Group_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNoteGroupAccess().getGroup_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Alternatives_0_0"


    // $ANTLR start "rule__NoteGroup__SyllablesAlternatives_2_2_0"
    // InternalLilyChantParser.g:486:1: rule__NoteGroup__SyllablesAlternatives_2_2_0 : ( ( ruleIdRule ) | ( ruleHyphenRule ) | ( ruleExtenderRule ) );
    public final void rule__NoteGroup__SyllablesAlternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:490:1: ( ( ruleIdRule ) | ( ruleHyphenRule ) | ( ruleExtenderRule ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case Asterisk:
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case HyphenMinusHyphenMinus:
                {
                alt3=2;
                }
                break;
            case KW___:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLilyChantParser.g:491:2: ( ruleIdRule )
                    {
                    // InternalLilyChantParser.g:491:2: ( ruleIdRule )
                    // InternalLilyChantParser.g:492:3: ruleIdRule
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getSyllablesIdRuleParserRuleCall_2_2_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIdRule();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNoteGroupAccess().getSyllablesIdRuleParserRuleCall_2_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLilyChantParser.g:497:2: ( ruleHyphenRule )
                    {
                    // InternalLilyChantParser.g:497:2: ( ruleHyphenRule )
                    // InternalLilyChantParser.g:498:3: ruleHyphenRule
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getSyllablesHyphenRuleParserRuleCall_2_2_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHyphenRule();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNoteGroupAccess().getSyllablesHyphenRuleParserRuleCall_2_2_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLilyChantParser.g:503:2: ( ruleExtenderRule )
                    {
                    // InternalLilyChantParser.g:503:2: ( ruleExtenderRule )
                    // InternalLilyChantParser.g:504:3: ruleExtenderRule
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getSyllablesExtenderRuleParserRuleCall_2_2_0_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExtenderRule();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNoteGroupAccess().getSyllablesExtenderRuleParserRuleCall_2_2_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__SyllablesAlternatives_2_2_0"


    // $ANTLR start "rule__Barline__Alternatives"
    // InternalLilyChantParser.g:513:1: rule__Barline__Alternatives : ( ( ( VerticalLine ) ) | ( ( VerticalLineVerticalLine ) ) );
    public final void rule__Barline__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:517:1: ( ( ( VerticalLine ) ) | ( ( VerticalLineVerticalLine ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==VerticalLine) ) {
                alt4=1;
            }
            else if ( (LA4_0==VerticalLineVerticalLine) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLilyChantParser.g:518:2: ( ( VerticalLine ) )
                    {
                    // InternalLilyChantParser.g:518:2: ( ( VerticalLine ) )
                    // InternalLilyChantParser.g:519:3: ( VerticalLine )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBarlineAccess().getSingleEnumLiteralDeclaration_0()); 
                    }
                    // InternalLilyChantParser.g:520:3: ( VerticalLine )
                    // InternalLilyChantParser.g:520:4: VerticalLine
                    {
                    match(input,VerticalLine,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBarlineAccess().getSingleEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLilyChantParser.g:524:2: ( ( VerticalLineVerticalLine ) )
                    {
                    // InternalLilyChantParser.g:524:2: ( ( VerticalLineVerticalLine ) )
                    // InternalLilyChantParser.g:525:3: ( VerticalLineVerticalLine )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBarlineAccess().getDoubleEnumLiteralDeclaration_1()); 
                    }
                    // InternalLilyChantParser.g:526:3: ( VerticalLineVerticalLine )
                    // InternalLilyChantParser.g:526:4: VerticalLineVerticalLine
                    {
                    match(input,VerticalLineVerticalLine,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBarlineAccess().getDoubleEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barline__Alternatives"


    // $ANTLR start "rule__Script__Group__0"
    // InternalLilyChantParser.g:534:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:538:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // InternalLilyChantParser.g:539:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Script__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Script__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0"


    // $ANTLR start "rule__Script__Group__0__Impl"
    // InternalLilyChantParser.g:546:1: rule__Script__Group__0__Impl : ( ( rule__Script__TonesAssignment_0 )* ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:550:1: ( ( ( rule__Script__TonesAssignment_0 )* ) )
            // InternalLilyChantParser.g:551:1: ( ( rule__Script__TonesAssignment_0 )* )
            {
            // InternalLilyChantParser.g:551:1: ( ( rule__Script__TonesAssignment_0 )* )
            // InternalLilyChantParser.g:552:2: ( rule__Script__TonesAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getTonesAssignment_0()); 
            }
            // InternalLilyChantParser.g:553:2: ( rule__Script__TonesAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Tone) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLilyChantParser.g:553:3: rule__Script__TonesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Script__TonesAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getTonesAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0__Impl"


    // $ANTLR start "rule__Script__Group__1"
    // InternalLilyChantParser.g:561:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:565:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // InternalLilyChantParser.g:566:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Script__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Script__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1"


    // $ANTLR start "rule__Script__Group__1__Impl"
    // InternalLilyChantParser.g:573:1: rule__Script__Group__1__Impl : ( ( rule__Script__ChantsAssignment_1 )* ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:577:1: ( ( ( rule__Script__ChantsAssignment_1 )* ) )
            // InternalLilyChantParser.g:578:1: ( ( rule__Script__ChantsAssignment_1 )* )
            {
            // InternalLilyChantParser.g:578:1: ( ( rule__Script__ChantsAssignment_1 )* )
            // InternalLilyChantParser.g:579:2: ( rule__Script__ChantsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getChantsAssignment_1()); 
            }
            // InternalLilyChantParser.g:580:2: ( rule__Script__ChantsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Chant) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLilyChantParser.g:580:3: rule__Script__ChantsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Script__ChantsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getChantsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1__Impl"


    // $ANTLR start "rule__Script__Group__2"
    // InternalLilyChantParser.g:588:1: rule__Script__Group__2 : rule__Script__Group__2__Impl ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:592:1: ( rule__Script__Group__2__Impl )
            // InternalLilyChantParser.g:593:2: rule__Script__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2"


    // $ANTLR start "rule__Script__Group__2__Impl"
    // InternalLilyChantParser.g:599:1: rule__Script__Group__2__Impl : ( ( rule__Script__FormatAssignment_2 )? ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:603:1: ( ( ( rule__Script__FormatAssignment_2 )? ) )
            // InternalLilyChantParser.g:604:1: ( ( rule__Script__FormatAssignment_2 )? )
            {
            // InternalLilyChantParser.g:604:1: ( ( rule__Script__FormatAssignment_2 )? )
            // InternalLilyChantParser.g:605:2: ( rule__Script__FormatAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getFormatAssignment_2()); 
            }
            // InternalLilyChantParser.g:606:2: ( rule__Script__FormatAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Format) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLilyChantParser.g:606:3: rule__Script__FormatAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Script__FormatAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getFormatAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2__Impl"


    // $ANTLR start "rule__Tone__Group__0"
    // InternalLilyChantParser.g:615:1: rule__Tone__Group__0 : rule__Tone__Group__0__Impl rule__Tone__Group__1 ;
    public final void rule__Tone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:619:1: ( rule__Tone__Group__0__Impl rule__Tone__Group__1 )
            // InternalLilyChantParser.g:620:2: rule__Tone__Group__0__Impl rule__Tone__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Tone__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tone__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__0"


    // $ANTLR start "rule__Tone__Group__0__Impl"
    // InternalLilyChantParser.g:627:1: rule__Tone__Group__0__Impl : ( Tone ) ;
    public final void rule__Tone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:631:1: ( ( Tone ) )
            // InternalLilyChantParser.g:632:1: ( Tone )
            {
            // InternalLilyChantParser.g:632:1: ( Tone )
            // InternalLilyChantParser.g:633:2: Tone
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getToneKeyword_0()); 
            }
            match(input,Tone,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getToneKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__0__Impl"


    // $ANTLR start "rule__Tone__Group__1"
    // InternalLilyChantParser.g:642:1: rule__Tone__Group__1 : rule__Tone__Group__1__Impl rule__Tone__Group__2 ;
    public final void rule__Tone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:646:1: ( rule__Tone__Group__1__Impl rule__Tone__Group__2 )
            // InternalLilyChantParser.g:647:2: rule__Tone__Group__1__Impl rule__Tone__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Tone__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tone__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__1"


    // $ANTLR start "rule__Tone__Group__1__Impl"
    // InternalLilyChantParser.g:654:1: rule__Tone__Group__1__Impl : ( ( rule__Tone__NameAssignment_1 ) ) ;
    public final void rule__Tone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:658:1: ( ( ( rule__Tone__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:659:1: ( ( rule__Tone__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:659:1: ( ( rule__Tone__NameAssignment_1 ) )
            // InternalLilyChantParser.g:660:2: ( rule__Tone__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:661:2: ( rule__Tone__NameAssignment_1 )
            // InternalLilyChantParser.g:661:3: rule__Tone__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tone__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__1__Impl"


    // $ANTLR start "rule__Tone__Group__2"
    // InternalLilyChantParser.g:669:1: rule__Tone__Group__2 : rule__Tone__Group__2__Impl rule__Tone__Group__3 ;
    public final void rule__Tone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:673:1: ( rule__Tone__Group__2__Impl rule__Tone__Group__3 )
            // InternalLilyChantParser.g:674:2: rule__Tone__Group__2__Impl rule__Tone__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Tone__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tone__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__2"


    // $ANTLR start "rule__Tone__Group__2__Impl"
    // InternalLilyChantParser.g:681:1: rule__Tone__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__Tone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:685:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:686:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:686:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:687:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getBEGINTerminalRuleCall_2()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getBEGINTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__2__Impl"


    // $ANTLR start "rule__Tone__Group__3"
    // InternalLilyChantParser.g:696:1: rule__Tone__Group__3 : rule__Tone__Group__3__Impl rule__Tone__Group__4 ;
    public final void rule__Tone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:700:1: ( rule__Tone__Group__3__Impl rule__Tone__Group__4 )
            // InternalLilyChantParser.g:701:2: rule__Tone__Group__3__Impl rule__Tone__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Tone__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tone__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__3"


    // $ANTLR start "rule__Tone__Group__3__Impl"
    // InternalLilyChantParser.g:708:1: rule__Tone__Group__3__Impl : ( Voices ) ;
    public final void rule__Tone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:712:1: ( ( Voices ) )
            // InternalLilyChantParser.g:713:1: ( Voices )
            {
            // InternalLilyChantParser.g:713:1: ( Voices )
            // InternalLilyChantParser.g:714:2: Voices
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getVoicesKeyword_3()); 
            }
            match(input,Voices,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getVoicesKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__3__Impl"


    // $ANTLR start "rule__Tone__Group__4"
    // InternalLilyChantParser.g:723:1: rule__Tone__Group__4 : rule__Tone__Group__4__Impl rule__Tone__Group__5 ;
    public final void rule__Tone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:727:1: ( rule__Tone__Group__4__Impl rule__Tone__Group__5 )
            // InternalLilyChantParser.g:728:2: rule__Tone__Group__4__Impl rule__Tone__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Tone__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tone__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__4"


    // $ANTLR start "rule__Tone__Group__4__Impl"
    // InternalLilyChantParser.g:735:1: rule__Tone__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__Tone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:739:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:740:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:740:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:741:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getBEGINTerminalRuleCall_4()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getBEGINTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__4__Impl"


    // $ANTLR start "rule__Tone__Group__5"
    // InternalLilyChantParser.g:750:1: rule__Tone__Group__5 : rule__Tone__Group__5__Impl rule__Tone__Group__6 ;
    public final void rule__Tone__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:754:1: ( rule__Tone__Group__5__Impl rule__Tone__Group__6 )
            // InternalLilyChantParser.g:755:2: rule__Tone__Group__5__Impl rule__Tone__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Tone__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tone__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__5"


    // $ANTLR start "rule__Tone__Group__5__Impl"
    // InternalLilyChantParser.g:762:1: rule__Tone__Group__5__Impl : ( ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* ) ) ;
    public final void rule__Tone__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:766:1: ( ( ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* ) ) )
            // InternalLilyChantParser.g:767:1: ( ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* ) )
            {
            // InternalLilyChantParser.g:767:1: ( ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* ) )
            // InternalLilyChantParser.g:768:2: ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* )
            {
            // InternalLilyChantParser.g:768:2: ( ( rule__Tone__VoiceNamesAssignment_5 ) )
            // InternalLilyChantParser.g:769:3: ( rule__Tone__VoiceNamesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getVoiceNamesAssignment_5()); 
            }
            // InternalLilyChantParser.g:770:3: ( rule__Tone__VoiceNamesAssignment_5 )
            // InternalLilyChantParser.g:770:4: rule__Tone__VoiceNamesAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__Tone__VoiceNamesAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getVoiceNamesAssignment_5()); 
            }

            }

            // InternalLilyChantParser.g:773:2: ( ( rule__Tone__VoiceNamesAssignment_5 )* )
            // InternalLilyChantParser.g:774:3: ( rule__Tone__VoiceNamesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getVoiceNamesAssignment_5()); 
            }
            // InternalLilyChantParser.g:775:3: ( rule__Tone__VoiceNamesAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLilyChantParser.g:775:4: rule__Tone__VoiceNamesAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Tone__VoiceNamesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getVoiceNamesAssignment_5()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__5__Impl"


    // $ANTLR start "rule__Tone__Group__6"
    // InternalLilyChantParser.g:784:1: rule__Tone__Group__6 : rule__Tone__Group__6__Impl rule__Tone__Group__7 ;
    public final void rule__Tone__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:788:1: ( rule__Tone__Group__6__Impl rule__Tone__Group__7 )
            // InternalLilyChantParser.g:789:2: rule__Tone__Group__6__Impl rule__Tone__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Tone__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tone__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__6"


    // $ANTLR start "rule__Tone__Group__6__Impl"
    // InternalLilyChantParser.g:796:1: rule__Tone__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Tone__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:800:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:801:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:801:1: ( RULE_END )
            // InternalLilyChantParser.g:802:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getENDTerminalRuleCall_6()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getENDTerminalRuleCall_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__6__Impl"


    // $ANTLR start "rule__Tone__Group__7"
    // InternalLilyChantParser.g:811:1: rule__Tone__Group__7 : rule__Tone__Group__7__Impl rule__Tone__Group__8 ;
    public final void rule__Tone__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:815:1: ( rule__Tone__Group__7__Impl rule__Tone__Group__8 )
            // InternalLilyChantParser.g:816:2: rule__Tone__Group__7__Impl rule__Tone__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Tone__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tone__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__7"


    // $ANTLR start "rule__Tone__Group__7__Impl"
    // InternalLilyChantParser.g:823:1: rule__Tone__Group__7__Impl : ( ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* ) ) ;
    public final void rule__Tone__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:827:1: ( ( ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* ) ) )
            // InternalLilyChantParser.g:828:1: ( ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* ) )
            {
            // InternalLilyChantParser.g:828:1: ( ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* ) )
            // InternalLilyChantParser.g:829:2: ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* )
            {
            // InternalLilyChantParser.g:829:2: ( ( rule__Tone__PhrasesAssignment_7 ) )
            // InternalLilyChantParser.g:830:3: ( rule__Tone__PhrasesAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getPhrasesAssignment_7()); 
            }
            // InternalLilyChantParser.g:831:3: ( rule__Tone__PhrasesAssignment_7 )
            // InternalLilyChantParser.g:831:4: rule__Tone__PhrasesAssignment_7
            {
            pushFollow(FOLLOW_12);
            rule__Tone__PhrasesAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getPhrasesAssignment_7()); 
            }

            }

            // InternalLilyChantParser.g:834:2: ( ( rule__Tone__PhrasesAssignment_7 )* )
            // InternalLilyChantParser.g:835:3: ( rule__Tone__PhrasesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getPhrasesAssignment_7()); 
            }
            // InternalLilyChantParser.g:836:3: ( rule__Tone__PhrasesAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Phrase) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLilyChantParser.g:836:4: rule__Tone__PhrasesAssignment_7
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Tone__PhrasesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getPhrasesAssignment_7()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__7__Impl"


    // $ANTLR start "rule__Tone__Group__8"
    // InternalLilyChantParser.g:845:1: rule__Tone__Group__8 : rule__Tone__Group__8__Impl ;
    public final void rule__Tone__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:849:1: ( rule__Tone__Group__8__Impl )
            // InternalLilyChantParser.g:850:2: rule__Tone__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tone__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__8"


    // $ANTLR start "rule__Tone__Group__8__Impl"
    // InternalLilyChantParser.g:856:1: rule__Tone__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Tone__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:860:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:861:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:861:1: ( RULE_END )
            // InternalLilyChantParser.g:862:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getENDTerminalRuleCall_8()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getENDTerminalRuleCall_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__8__Impl"


    // $ANTLR start "rule__TonePhrase__Group__0"
    // InternalLilyChantParser.g:872:1: rule__TonePhrase__Group__0 : rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1 ;
    public final void rule__TonePhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:876:1: ( rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1 )
            // InternalLilyChantParser.g:877:2: rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TonePhrase__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TonePhrase__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TonePhrase__Group__0"


    // $ANTLR start "rule__TonePhrase__Group__0__Impl"
    // InternalLilyChantParser.g:884:1: rule__TonePhrase__Group__0__Impl : ( Phrase ) ;
    public final void rule__TonePhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:888:1: ( ( Phrase ) )
            // InternalLilyChantParser.g:889:1: ( Phrase )
            {
            // InternalLilyChantParser.g:889:1: ( Phrase )
            // InternalLilyChantParser.g:890:2: Phrase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getPhraseKeyword_0()); 
            }
            match(input,Phrase,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTonePhraseAccess().getPhraseKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TonePhrase__Group__0__Impl"


    // $ANTLR start "rule__TonePhrase__Group__1"
    // InternalLilyChantParser.g:899:1: rule__TonePhrase__Group__1 : rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2 ;
    public final void rule__TonePhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:903:1: ( rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2 )
            // InternalLilyChantParser.g:904:2: rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__TonePhrase__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TonePhrase__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TonePhrase__Group__1"


    // $ANTLR start "rule__TonePhrase__Group__1__Impl"
    // InternalLilyChantParser.g:911:1: rule__TonePhrase__Group__1__Impl : ( ( rule__TonePhrase__NameAssignment_1 ) ) ;
    public final void rule__TonePhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:915:1: ( ( ( rule__TonePhrase__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:916:1: ( ( rule__TonePhrase__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:916:1: ( ( rule__TonePhrase__NameAssignment_1 ) )
            // InternalLilyChantParser.g:917:2: ( rule__TonePhrase__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:918:2: ( rule__TonePhrase__NameAssignment_1 )
            // InternalLilyChantParser.g:918:3: rule__TonePhrase__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TonePhrase__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTonePhraseAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TonePhrase__Group__1__Impl"


    // $ANTLR start "rule__TonePhrase__Group__2"
    // InternalLilyChantParser.g:926:1: rule__TonePhrase__Group__2 : rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3 ;
    public final void rule__TonePhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:930:1: ( rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3 )
            // InternalLilyChantParser.g:931:2: rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__TonePhrase__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TonePhrase__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TonePhrase__Group__2"


    // $ANTLR start "rule__TonePhrase__Group__2__Impl"
    // InternalLilyChantParser.g:938:1: rule__TonePhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__TonePhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:942:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:943:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:943:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:944:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getBEGINTerminalRuleCall_2()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTonePhraseAccess().getBEGINTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TonePhrase__Group__2__Impl"


    // $ANTLR start "rule__TonePhrase__Group__3"
    // InternalLilyChantParser.g:953:1: rule__TonePhrase__Group__3 : rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4 ;
    public final void rule__TonePhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:957:1: ( rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4 )
            // InternalLilyChantParser.g:958:2: rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__TonePhrase__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TonePhrase__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TonePhrase__Group__3"


    // $ANTLR start "rule__TonePhrase__Group__3__Impl"
    // InternalLilyChantParser.g:965:1: rule__TonePhrase__Group__3__Impl : ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) ) ;
    public final void rule__TonePhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:969:1: ( ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:970:1: ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:970:1: ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) )
            // InternalLilyChantParser.g:971:2: ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* )
            {
            // InternalLilyChantParser.g:971:2: ( ( rule__TonePhrase__VoicesAssignment_3 ) )
            // InternalLilyChantParser.g:972:3: ( rule__TonePhrase__VoicesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            }
            // InternalLilyChantParser.g:973:3: ( rule__TonePhrase__VoicesAssignment_3 )
            // InternalLilyChantParser.g:973:4: rule__TonePhrase__VoicesAssignment_3
            {
            pushFollow(FOLLOW_14);
            rule__TonePhrase__VoicesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            }

            }

            // InternalLilyChantParser.g:976:2: ( ( rule__TonePhrase__VoicesAssignment_3 )* )
            // InternalLilyChantParser.g:977:3: ( rule__TonePhrase__VoicesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            }
            // InternalLilyChantParser.g:978:3: ( rule__TonePhrase__VoicesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Voice) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLilyChantParser.g:978:4: rule__TonePhrase__VoicesAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__TonePhrase__VoicesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TonePhrase__Group__3__Impl"


    // $ANTLR start "rule__TonePhrase__Group__4"
    // InternalLilyChantParser.g:987:1: rule__TonePhrase__Group__4 : rule__TonePhrase__Group__4__Impl ;
    public final void rule__TonePhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:991:1: ( rule__TonePhrase__Group__4__Impl )
            // InternalLilyChantParser.g:992:2: rule__TonePhrase__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TonePhrase__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TonePhrase__Group__4"


    // $ANTLR start "rule__TonePhrase__Group__4__Impl"
    // InternalLilyChantParser.g:998:1: rule__TonePhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__TonePhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1002:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:1003:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:1003:1: ( RULE_END )
            // InternalLilyChantParser.g:1004:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getENDTerminalRuleCall_4()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTonePhraseAccess().getENDTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TonePhrase__Group__4__Impl"


    // $ANTLR start "rule__VoicePhrase__Group__0"
    // InternalLilyChantParser.g:1014:1: rule__VoicePhrase__Group__0 : rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1 ;
    public final void rule__VoicePhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1018:1: ( rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1 )
            // InternalLilyChantParser.g:1019:2: rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VoicePhrase__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VoicePhrase__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoicePhrase__Group__0"


    // $ANTLR start "rule__VoicePhrase__Group__0__Impl"
    // InternalLilyChantParser.g:1026:1: rule__VoicePhrase__Group__0__Impl : ( Voice ) ;
    public final void rule__VoicePhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1030:1: ( ( Voice ) )
            // InternalLilyChantParser.g:1031:1: ( Voice )
            {
            // InternalLilyChantParser.g:1031:1: ( Voice )
            // InternalLilyChantParser.g:1032:2: Voice
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getVoiceKeyword_0()); 
            }
            match(input,Voice,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoicePhraseAccess().getVoiceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoicePhrase__Group__0__Impl"


    // $ANTLR start "rule__VoicePhrase__Group__1"
    // InternalLilyChantParser.g:1041:1: rule__VoicePhrase__Group__1 : rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2 ;
    public final void rule__VoicePhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1045:1: ( rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2 )
            // InternalLilyChantParser.g:1046:2: rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__VoicePhrase__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VoicePhrase__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoicePhrase__Group__1"


    // $ANTLR start "rule__VoicePhrase__Group__1__Impl"
    // InternalLilyChantParser.g:1053:1: rule__VoicePhrase__Group__1__Impl : ( ( rule__VoicePhrase__NameAssignment_1 ) ) ;
    public final void rule__VoicePhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1057:1: ( ( ( rule__VoicePhrase__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:1058:1: ( ( rule__VoicePhrase__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:1058:1: ( ( rule__VoicePhrase__NameAssignment_1 ) )
            // InternalLilyChantParser.g:1059:2: ( rule__VoicePhrase__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:1060:2: ( rule__VoicePhrase__NameAssignment_1 )
            // InternalLilyChantParser.g:1060:3: rule__VoicePhrase__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VoicePhrase__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoicePhraseAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoicePhrase__Group__1__Impl"


    // $ANTLR start "rule__VoicePhrase__Group__2"
    // InternalLilyChantParser.g:1068:1: rule__VoicePhrase__Group__2 : rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3 ;
    public final void rule__VoicePhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1072:1: ( rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3 )
            // InternalLilyChantParser.g:1073:2: rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__VoicePhrase__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VoicePhrase__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoicePhrase__Group__2"


    // $ANTLR start "rule__VoicePhrase__Group__2__Impl"
    // InternalLilyChantParser.g:1080:1: rule__VoicePhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__VoicePhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1084:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:1085:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:1085:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:1086:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getBEGINTerminalRuleCall_2()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoicePhraseAccess().getBEGINTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoicePhrase__Group__2__Impl"


    // $ANTLR start "rule__VoicePhrase__Group__3"
    // InternalLilyChantParser.g:1095:1: rule__VoicePhrase__Group__3 : rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4 ;
    public final void rule__VoicePhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1099:1: ( rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4 )
            // InternalLilyChantParser.g:1100:2: rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__VoicePhrase__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VoicePhrase__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoicePhrase__Group__3"


    // $ANTLR start "rule__VoicePhrase__Group__3__Impl"
    // InternalLilyChantParser.g:1107:1: rule__VoicePhrase__Group__3__Impl : ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) ) ;
    public final void rule__VoicePhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1111:1: ( ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:1112:1: ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:1112:1: ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) )
            // InternalLilyChantParser.g:1113:2: ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* )
            {
            // InternalLilyChantParser.g:1113:2: ( ( rule__VoicePhrase__NotesAssignment_3 ) )
            // InternalLilyChantParser.g:1114:3: ( rule__VoicePhrase__NotesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            }
            // InternalLilyChantParser.g:1115:3: ( rule__VoicePhrase__NotesAssignment_3 )
            // InternalLilyChantParser.g:1115:4: rule__VoicePhrase__NotesAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__VoicePhrase__NotesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            }

            }

            // InternalLilyChantParser.g:1118:2: ( ( rule__VoicePhrase__NotesAssignment_3 )* )
            // InternalLilyChantParser.g:1119:3: ( rule__VoicePhrase__NotesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            }
            // InternalLilyChantParser.g:1120:3: ( rule__VoicePhrase__NotesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLilyChantParser.g:1120:4: rule__VoicePhrase__NotesAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VoicePhrase__NotesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoicePhrase__Group__3__Impl"


    // $ANTLR start "rule__VoicePhrase__Group__4"
    // InternalLilyChantParser.g:1129:1: rule__VoicePhrase__Group__4 : rule__VoicePhrase__Group__4__Impl ;
    public final void rule__VoicePhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1133:1: ( rule__VoicePhrase__Group__4__Impl )
            // InternalLilyChantParser.g:1134:2: rule__VoicePhrase__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoicePhrase__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoicePhrase__Group__4"


    // $ANTLR start "rule__VoicePhrase__Group__4__Impl"
    // InternalLilyChantParser.g:1140:1: rule__VoicePhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__VoicePhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1144:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:1145:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:1145:1: ( RULE_END )
            // InternalLilyChantParser.g:1146:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getENDTerminalRuleCall_4()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoicePhraseAccess().getENDTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoicePhrase__Group__4__Impl"


    // $ANTLR start "rule__Chant__Group__0"
    // InternalLilyChantParser.g:1156:1: rule__Chant__Group__0 : rule__Chant__Group__0__Impl rule__Chant__Group__1 ;
    public final void rule__Chant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1160:1: ( rule__Chant__Group__0__Impl rule__Chant__Group__1 )
            // InternalLilyChantParser.g:1161:2: rule__Chant__Group__0__Impl rule__Chant__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Chant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Chant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__0"


    // $ANTLR start "rule__Chant__Group__0__Impl"
    // InternalLilyChantParser.g:1168:1: rule__Chant__Group__0__Impl : ( Chant ) ;
    public final void rule__Chant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1172:1: ( ( Chant ) )
            // InternalLilyChantParser.g:1173:1: ( Chant )
            {
            // InternalLilyChantParser.g:1173:1: ( Chant )
            // InternalLilyChantParser.g:1174:2: Chant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getChantKeyword_0()); 
            }
            match(input,Chant,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getChantKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__0__Impl"


    // $ANTLR start "rule__Chant__Group__1"
    // InternalLilyChantParser.g:1183:1: rule__Chant__Group__1 : rule__Chant__Group__1__Impl rule__Chant__Group__2 ;
    public final void rule__Chant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1187:1: ( rule__Chant__Group__1__Impl rule__Chant__Group__2 )
            // InternalLilyChantParser.g:1188:2: rule__Chant__Group__1__Impl rule__Chant__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Chant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Chant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__1"


    // $ANTLR start "rule__Chant__Group__1__Impl"
    // InternalLilyChantParser.g:1195:1: rule__Chant__Group__1__Impl : ( ( rule__Chant__NameAssignment_1 )? ) ;
    public final void rule__Chant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1199:1: ( ( ( rule__Chant__NameAssignment_1 )? ) )
            // InternalLilyChantParser.g:1200:1: ( ( rule__Chant__NameAssignment_1 )? )
            {
            // InternalLilyChantParser.g:1200:1: ( ( rule__Chant__NameAssignment_1 )? )
            // InternalLilyChantParser.g:1201:2: ( rule__Chant__NameAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:1202:2: ( rule__Chant__NameAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLilyChantParser.g:1202:3: rule__Chant__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chant__NameAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__1__Impl"


    // $ANTLR start "rule__Chant__Group__2"
    // InternalLilyChantParser.g:1210:1: rule__Chant__Group__2 : rule__Chant__Group__2__Impl rule__Chant__Group__3 ;
    public final void rule__Chant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1214:1: ( rule__Chant__Group__2__Impl rule__Chant__Group__3 )
            // InternalLilyChantParser.g:1215:2: rule__Chant__Group__2__Impl rule__Chant__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Chant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Chant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__2"


    // $ANTLR start "rule__Chant__Group__2__Impl"
    // InternalLilyChantParser.g:1222:1: rule__Chant__Group__2__Impl : ( Tone ) ;
    public final void rule__Chant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1226:1: ( ( Tone ) )
            // InternalLilyChantParser.g:1227:1: ( Tone )
            {
            // InternalLilyChantParser.g:1227:1: ( Tone )
            // InternalLilyChantParser.g:1228:2: Tone
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getToneKeyword_2()); 
            }
            match(input,Tone,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getToneKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__2__Impl"


    // $ANTLR start "rule__Chant__Group__3"
    // InternalLilyChantParser.g:1237:1: rule__Chant__Group__3 : rule__Chant__Group__3__Impl rule__Chant__Group__4 ;
    public final void rule__Chant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1241:1: ( rule__Chant__Group__3__Impl rule__Chant__Group__4 )
            // InternalLilyChantParser.g:1242:2: rule__Chant__Group__3__Impl rule__Chant__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Chant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Chant__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__3"


    // $ANTLR start "rule__Chant__Group__3__Impl"
    // InternalLilyChantParser.g:1249:1: rule__Chant__Group__3__Impl : ( ( rule__Chant__ToneAssignment_3 ) ) ;
    public final void rule__Chant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1253:1: ( ( ( rule__Chant__ToneAssignment_3 ) ) )
            // InternalLilyChantParser.g:1254:1: ( ( rule__Chant__ToneAssignment_3 ) )
            {
            // InternalLilyChantParser.g:1254:1: ( ( rule__Chant__ToneAssignment_3 ) )
            // InternalLilyChantParser.g:1255:2: ( rule__Chant__ToneAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getToneAssignment_3()); 
            }
            // InternalLilyChantParser.g:1256:2: ( rule__Chant__ToneAssignment_3 )
            // InternalLilyChantParser.g:1256:3: rule__Chant__ToneAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Chant__ToneAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getToneAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__3__Impl"


    // $ANTLR start "rule__Chant__Group__4"
    // InternalLilyChantParser.g:1264:1: rule__Chant__Group__4 : rule__Chant__Group__4__Impl rule__Chant__Group__5 ;
    public final void rule__Chant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1268:1: ( rule__Chant__Group__4__Impl rule__Chant__Group__5 )
            // InternalLilyChantParser.g:1269:2: rule__Chant__Group__4__Impl rule__Chant__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Chant__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Chant__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__4"


    // $ANTLR start "rule__Chant__Group__4__Impl"
    // InternalLilyChantParser.g:1276:1: rule__Chant__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__Chant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1280:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:1281:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:1281:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:1282:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getBEGINTerminalRuleCall_4()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getBEGINTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__4__Impl"


    // $ANTLR start "rule__Chant__Group__5"
    // InternalLilyChantParser.g:1291:1: rule__Chant__Group__5 : rule__Chant__Group__5__Impl rule__Chant__Group__6 ;
    public final void rule__Chant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1295:1: ( rule__Chant__Group__5__Impl rule__Chant__Group__6 )
            // InternalLilyChantParser.g:1296:2: rule__Chant__Group__5__Impl rule__Chant__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Chant__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Chant__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__5"


    // $ANTLR start "rule__Chant__Group__5__Impl"
    // InternalLilyChantParser.g:1303:1: rule__Chant__Group__5__Impl : ( ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* ) ) ;
    public final void rule__Chant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1307:1: ( ( ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* ) ) )
            // InternalLilyChantParser.g:1308:1: ( ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* ) )
            {
            // InternalLilyChantParser.g:1308:1: ( ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* ) )
            // InternalLilyChantParser.g:1309:2: ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* )
            {
            // InternalLilyChantParser.g:1309:2: ( ( rule__Chant__PhrasesAssignment_5 ) )
            // InternalLilyChantParser.g:1310:3: ( rule__Chant__PhrasesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getPhrasesAssignment_5()); 
            }
            // InternalLilyChantParser.g:1311:3: ( rule__Chant__PhrasesAssignment_5 )
            // InternalLilyChantParser.g:1311:4: rule__Chant__PhrasesAssignment_5
            {
            pushFollow(FOLLOW_17);
            rule__Chant__PhrasesAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getPhrasesAssignment_5()); 
            }

            }

            // InternalLilyChantParser.g:1314:2: ( ( rule__Chant__PhrasesAssignment_5 )* )
            // InternalLilyChantParser.g:1315:3: ( rule__Chant__PhrasesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getPhrasesAssignment_5()); 
            }
            // InternalLilyChantParser.g:1316:3: ( rule__Chant__PhrasesAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==HyphenMinusHyphenMinus||LA13_0==LeftParenthesis||LA13_0==Asterisk||LA13_0==KW__||LA13_0==RULE_ID||LA13_0==RULE_START_NOTE_GROUP) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLilyChantParser.g:1316:4: rule__Chant__PhrasesAssignment_5
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Chant__PhrasesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getPhrasesAssignment_5()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__5__Impl"


    // $ANTLR start "rule__Chant__Group__6"
    // InternalLilyChantParser.g:1325:1: rule__Chant__Group__6 : rule__Chant__Group__6__Impl ;
    public final void rule__Chant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1329:1: ( rule__Chant__Group__6__Impl )
            // InternalLilyChantParser.g:1330:2: rule__Chant__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chant__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__6"


    // $ANTLR start "rule__Chant__Group__6__Impl"
    // InternalLilyChantParser.g:1336:1: rule__Chant__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Chant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1340:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:1341:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:1341:1: ( RULE_END )
            // InternalLilyChantParser.g:1342:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getENDTerminalRuleCall_6()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getENDTerminalRuleCall_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__6__Impl"


    // $ANTLR start "rule__LyricPhrase__Group__0"
    // InternalLilyChantParser.g:1352:1: rule__LyricPhrase__Group__0 : rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1 ;
    public final void rule__LyricPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1356:1: ( rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1 )
            // InternalLilyChantParser.g:1357:2: rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__LyricPhrase__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__Group__0"


    // $ANTLR start "rule__LyricPhrase__Group__0__Impl"
    // InternalLilyChantParser.g:1364:1: rule__LyricPhrase__Group__0__Impl : ( ( rule__LyricPhrase__Group_0__0 )? ) ;
    public final void rule__LyricPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1368:1: ( ( ( rule__LyricPhrase__Group_0__0 )? ) )
            // InternalLilyChantParser.g:1369:1: ( ( rule__LyricPhrase__Group_0__0 )? )
            {
            // InternalLilyChantParser.g:1369:1: ( ( rule__LyricPhrase__Group_0__0 )? )
            // InternalLilyChantParser.g:1370:2: ( rule__LyricPhrase__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getGroup_0()); 
            }
            // InternalLilyChantParser.g:1371:2: ( rule__LyricPhrase__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LeftParenthesis) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLilyChantParser.g:1371:3: rule__LyricPhrase__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LyricPhrase__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__Group__0__Impl"


    // $ANTLR start "rule__LyricPhrase__Group__1"
    // InternalLilyChantParser.g:1379:1: rule__LyricPhrase__Group__1 : rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2 ;
    public final void rule__LyricPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1383:1: ( rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2 )
            // InternalLilyChantParser.g:1384:2: rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__LyricPhrase__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__Group__1"


    // $ANTLR start "rule__LyricPhrase__Group__1__Impl"
    // InternalLilyChantParser.g:1391:1: rule__LyricPhrase__Group__1__Impl : ( ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* ) ) ;
    public final void rule__LyricPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1395:1: ( ( ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* ) ) )
            // InternalLilyChantParser.g:1396:1: ( ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* ) )
            {
            // InternalLilyChantParser.g:1396:1: ( ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* ) )
            // InternalLilyChantParser.g:1397:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* )
            {
            // InternalLilyChantParser.g:1397:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) )
            // InternalLilyChantParser.g:1398:3: ( rule__LyricPhrase__NoteGroupsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_1()); 
            }
            // InternalLilyChantParser.g:1399:3: ( rule__LyricPhrase__NoteGroupsAssignment_1 )
            // InternalLilyChantParser.g:1399:4: rule__LyricPhrase__NoteGroupsAssignment_1
            {
            pushFollow(FOLLOW_17);
            rule__LyricPhrase__NoteGroupsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_1()); 
            }

            }

            // InternalLilyChantParser.g:1402:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* )
            // InternalLilyChantParser.g:1403:3: ( rule__LyricPhrase__NoteGroupsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_1()); 
            }
            // InternalLilyChantParser.g:1404:3: ( rule__LyricPhrase__NoteGroupsAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==HyphenMinusHyphenMinus||LA15_0==Asterisk||LA15_0==KW__||LA15_0==RULE_ID||LA15_0==RULE_START_NOTE_GROUP) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLilyChantParser.g:1404:4: rule__LyricPhrase__NoteGroupsAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__LyricPhrase__NoteGroupsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__Group__1__Impl"


    // $ANTLR start "rule__LyricPhrase__Group__2"
    // InternalLilyChantParser.g:1413:1: rule__LyricPhrase__Group__2 : rule__LyricPhrase__Group__2__Impl ;
    public final void rule__LyricPhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1417:1: ( rule__LyricPhrase__Group__2__Impl )
            // InternalLilyChantParser.g:1418:2: rule__LyricPhrase__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__Group__2"


    // $ANTLR start "rule__LyricPhrase__Group__2__Impl"
    // InternalLilyChantParser.g:1424:1: rule__LyricPhrase__Group__2__Impl : ( ( rule__LyricPhrase__BarAssignment_2 ) ) ;
    public final void rule__LyricPhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1428:1: ( ( ( rule__LyricPhrase__BarAssignment_2 ) ) )
            // InternalLilyChantParser.g:1429:1: ( ( rule__LyricPhrase__BarAssignment_2 ) )
            {
            // InternalLilyChantParser.g:1429:1: ( ( rule__LyricPhrase__BarAssignment_2 ) )
            // InternalLilyChantParser.g:1430:2: ( rule__LyricPhrase__BarAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getBarAssignment_2()); 
            }
            // InternalLilyChantParser.g:1431:2: ( rule__LyricPhrase__BarAssignment_2 )
            // InternalLilyChantParser.g:1431:3: rule__LyricPhrase__BarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__BarAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getBarAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__Group__2__Impl"


    // $ANTLR start "rule__LyricPhrase__Group_0__0"
    // InternalLilyChantParser.g:1440:1: rule__LyricPhrase__Group_0__0 : rule__LyricPhrase__Group_0__0__Impl rule__LyricPhrase__Group_0__1 ;
    public final void rule__LyricPhrase__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1444:1: ( rule__LyricPhrase__Group_0__0__Impl rule__LyricPhrase__Group_0__1 )
            // InternalLilyChantParser.g:1445:2: rule__LyricPhrase__Group_0__0__Impl rule__LyricPhrase__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__LyricPhrase__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__Group_0__0"


    // $ANTLR start "rule__LyricPhrase__Group_0__0__Impl"
    // InternalLilyChantParser.g:1452:1: rule__LyricPhrase__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__LyricPhrase__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1456:1: ( ( LeftParenthesis ) )
            // InternalLilyChantParser.g:1457:1: ( LeftParenthesis )
            {
            // InternalLilyChantParser.g:1457:1: ( LeftParenthesis )
            // InternalLilyChantParser.g:1458:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__Group_0__0__Impl"


    // $ANTLR start "rule__LyricPhrase__Group_0__1"
    // InternalLilyChantParser.g:1467:1: rule__LyricPhrase__Group_0__1 : rule__LyricPhrase__Group_0__1__Impl rule__LyricPhrase__Group_0__2 ;
    public final void rule__LyricPhrase__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1471:1: ( rule__LyricPhrase__Group_0__1__Impl rule__LyricPhrase__Group_0__2 )
            // InternalLilyChantParser.g:1472:2: rule__LyricPhrase__Group_0__1__Impl rule__LyricPhrase__Group_0__2
            {
            pushFollow(FOLLOW_19);
            rule__LyricPhrase__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__Group_0__1"


    // $ANTLR start "rule__LyricPhrase__Group_0__1__Impl"
    // InternalLilyChantParser.g:1479:1: rule__LyricPhrase__Group_0__1__Impl : ( ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 ) ) ;
    public final void rule__LyricPhrase__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1483:1: ( ( ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 ) ) )
            // InternalLilyChantParser.g:1484:1: ( ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 ) )
            {
            // InternalLilyChantParser.g:1484:1: ( ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 ) )
            // InternalLilyChantParser.g:1485:2: ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getExplicitPhraseAssignment_0_1()); 
            }
            // InternalLilyChantParser.g:1486:2: ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 )
            // InternalLilyChantParser.g:1486:3: rule__LyricPhrase__ExplicitPhraseAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__ExplicitPhraseAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getExplicitPhraseAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__Group_0__1__Impl"


    // $ANTLR start "rule__LyricPhrase__Group_0__2"
    // InternalLilyChantParser.g:1494:1: rule__LyricPhrase__Group_0__2 : rule__LyricPhrase__Group_0__2__Impl ;
    public final void rule__LyricPhrase__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1498:1: ( rule__LyricPhrase__Group_0__2__Impl )
            // InternalLilyChantParser.g:1499:2: rule__LyricPhrase__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__Group_0__2"


    // $ANTLR start "rule__LyricPhrase__Group_0__2__Impl"
    // InternalLilyChantParser.g:1505:1: rule__LyricPhrase__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__LyricPhrase__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1509:1: ( ( RightParenthesis ) )
            // InternalLilyChantParser.g:1510:1: ( RightParenthesis )
            {
            // InternalLilyChantParser.g:1510:1: ( RightParenthesis )
            // InternalLilyChantParser.g:1511:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__Group_0__2__Impl"


    // $ANTLR start "rule__NoteGroup__Group_0__0"
    // InternalLilyChantParser.g:1521:1: rule__NoteGroup__Group_0__0 : rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1 ;
    public final void rule__NoteGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1525:1: ( rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1 )
            // InternalLilyChantParser.g:1526:2: rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__NoteGroup__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_0__0"


    // $ANTLR start "rule__NoteGroup__Group_0__0__Impl"
    // InternalLilyChantParser.g:1533:1: rule__NoteGroup__Group_0__0__Impl : ( ( rule__NoteGroup__Alternatives_0_0 ) ) ;
    public final void rule__NoteGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1537:1: ( ( ( rule__NoteGroup__Alternatives_0_0 ) ) )
            // InternalLilyChantParser.g:1538:1: ( ( rule__NoteGroup__Alternatives_0_0 ) )
            {
            // InternalLilyChantParser.g:1538:1: ( ( rule__NoteGroup__Alternatives_0_0 ) )
            // InternalLilyChantParser.g:1539:2: ( rule__NoteGroup__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getAlternatives_0_0()); 
            }
            // InternalLilyChantParser.g:1540:2: ( rule__NoteGroup__Alternatives_0_0 )
            // InternalLilyChantParser.g:1540:3: rule__NoteGroup__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_0__0__Impl"


    // $ANTLR start "rule__NoteGroup__Group_0__1"
    // InternalLilyChantParser.g:1548:1: rule__NoteGroup__Group_0__1 : rule__NoteGroup__Group_0__1__Impl ;
    public final void rule__NoteGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1552:1: ( rule__NoteGroup__Group_0__1__Impl )
            // InternalLilyChantParser.g:1553:2: rule__NoteGroup__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_0__1"


    // $ANTLR start "rule__NoteGroup__Group_0__1__Impl"
    // InternalLilyChantParser.g:1559:1: rule__NoteGroup__Group_0__1__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* ) ;
    public final void rule__NoteGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1563:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* ) )
            // InternalLilyChantParser.g:1564:1: ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* )
            {
            // InternalLilyChantParser.g:1564:1: ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* )
            // InternalLilyChantParser.g:1565:2: ( rule__NoteGroup__SyllablesAssignment_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_1()); 
            }
            // InternalLilyChantParser.g:1566:2: ( rule__NoteGroup__SyllablesAssignment_0_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==KW___) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLilyChantParser.g:1566:3: rule__NoteGroup__SyllablesAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__NoteGroup__SyllablesAssignment_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_0__1__Impl"


    // $ANTLR start "rule__NoteGroup__Group_0_0_0__0"
    // InternalLilyChantParser.g:1575:1: rule__NoteGroup__Group_0_0_0__0 : rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1 ;
    public final void rule__NoteGroup__Group_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1579:1: ( rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1 )
            // InternalLilyChantParser.g:1580:2: rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1
            {
            pushFollow(FOLLOW_22);
            rule__NoteGroup__Group_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_0_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_0_0_0__0"


    // $ANTLR start "rule__NoteGroup__Group_0_0_0__0__Impl"
    // InternalLilyChantParser.g:1587:1: rule__NoteGroup__Group_0_0_0__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1591:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) ) )
            // InternalLilyChantParser.g:1592:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) )
            {
            // InternalLilyChantParser.g:1592:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) )
            // InternalLilyChantParser.g:1593:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_0()); 
            }
            // InternalLilyChantParser.g:1594:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 )
            // InternalLilyChantParser.g:1594:3: rule__NoteGroup__SyllablesAssignment_0_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__SyllablesAssignment_0_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_0_0_0__0__Impl"


    // $ANTLR start "rule__NoteGroup__Group_0_0_0__1"
    // InternalLilyChantParser.g:1602:1: rule__NoteGroup__Group_0_0_0__1 : rule__NoteGroup__Group_0_0_0__1__Impl ;
    public final void rule__NoteGroup__Group_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1606:1: ( rule__NoteGroup__Group_0_0_0__1__Impl )
            // InternalLilyChantParser.g:1607:2: rule__NoteGroup__Group_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_0_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_0_0_0__1"


    // $ANTLR start "rule__NoteGroup__Group_0_0_0__1__Impl"
    // InternalLilyChantParser.g:1613:1: rule__NoteGroup__Group_0_0_0__1__Impl : ( ( rule__NoteGroup__Group_0_0_0_1__0 )? ) ;
    public final void rule__NoteGroup__Group_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1617:1: ( ( ( rule__NoteGroup__Group_0_0_0_1__0 )? ) )
            // InternalLilyChantParser.g:1618:1: ( ( rule__NoteGroup__Group_0_0_0_1__0 )? )
            {
            // InternalLilyChantParser.g:1618:1: ( ( rule__NoteGroup__Group_0_0_0_1__0 )? )
            // InternalLilyChantParser.g:1619:2: ( rule__NoteGroup__Group_0_0_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getGroup_0_0_0_1()); 
            }
            // InternalLilyChantParser.g:1620:2: ( rule__NoteGroup__Group_0_0_0_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==HyphenMinusHyphenMinus) ) {
                switch ( input.LA(2) ) {
                    case EOF:
                    case HyphenMinusHyphenMinus:
                    case KW___:
                    case VerticalLineVerticalLine:
                    case KW__:
                    case VerticalLine:
                    case RULE_START_NOTE_GROUP:
                        {
                        alt17=1;
                        }
                        break;
                    case Asterisk:
                        {
                        int LA17_4 = input.LA(3);

                        if ( (LA17_4==RULE_ID) ) {
                            int LA17_5 = input.LA(4);

                            if ( (synpred19_InternalLilyChantParser()) ) {
                                alt17=1;
                            }
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA17_5 = input.LA(3);

                        if ( (synpred19_InternalLilyChantParser()) ) {
                            alt17=1;
                        }
                        }
                        break;
                }

            }
            switch (alt17) {
                case 1 :
                    // InternalLilyChantParser.g:1620:3: rule__NoteGroup__Group_0_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NoteGroup__Group_0_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getGroup_0_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_0_0_0__1__Impl"


    // $ANTLR start "rule__NoteGroup__Group_0_0_0_1__0"
    // InternalLilyChantParser.g:1629:1: rule__NoteGroup__Group_0_0_0_1__0 : rule__NoteGroup__Group_0_0_0_1__0__Impl ;
    public final void rule__NoteGroup__Group_0_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1633:1: ( rule__NoteGroup__Group_0_0_0_1__0__Impl )
            // InternalLilyChantParser.g:1634:2: rule__NoteGroup__Group_0_0_0_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_0_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_0_0_0_1__0"


    // $ANTLR start "rule__NoteGroup__Group_0_0_0_1__0__Impl"
    // InternalLilyChantParser.g:1640:1: rule__NoteGroup__Group_0_0_0_1__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1644:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) ) )
            // InternalLilyChantParser.g:1645:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) )
            {
            // InternalLilyChantParser.g:1645:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) )
            // InternalLilyChantParser.g:1646:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_1_0()); 
            }
            // InternalLilyChantParser.g:1647:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 )
            // InternalLilyChantParser.g:1647:3: rule__NoteGroup__SyllablesAssignment_0_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__SyllablesAssignment_0_0_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_0_0_0_1__0__Impl"


    // $ANTLR start "rule__NoteGroup__Group_0_0_1__0"
    // InternalLilyChantParser.g:1656:1: rule__NoteGroup__Group_0_0_1__0 : rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1 ;
    public final void rule__NoteGroup__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1660:1: ( rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1 )
            // InternalLilyChantParser.g:1661:2: rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1
            {
            pushFollow(FOLLOW_23);
            rule__NoteGroup__Group_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_0_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_0_0_1__0"


    // $ANTLR start "rule__NoteGroup__Group_0_0_1__0__Impl"
    // InternalLilyChantParser.g:1668:1: rule__NoteGroup__Group_0_0_1__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1672:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) ) )
            // InternalLilyChantParser.g:1673:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) )
            {
            // InternalLilyChantParser.g:1673:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) )
            // InternalLilyChantParser.g:1674:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_0()); 
            }
            // InternalLilyChantParser.g:1675:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 )
            // InternalLilyChantParser.g:1675:3: rule__NoteGroup__SyllablesAssignment_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__SyllablesAssignment_0_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_0_0_1__0__Impl"


    // $ANTLR start "rule__NoteGroup__Group_0_0_1__1"
    // InternalLilyChantParser.g:1683:1: rule__NoteGroup__Group_0_0_1__1 : rule__NoteGroup__Group_0_0_1__1__Impl ;
    public final void rule__NoteGroup__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1687:1: ( rule__NoteGroup__Group_0_0_1__1__Impl )
            // InternalLilyChantParser.g:1688:2: rule__NoteGroup__Group_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_0_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_0_0_1__1"


    // $ANTLR start "rule__NoteGroup__Group_0_0_1__1__Impl"
    // InternalLilyChantParser.g:1694:1: rule__NoteGroup__Group_0_0_1__1__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) ) ;
    public final void rule__NoteGroup__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1698:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) ) )
            // InternalLilyChantParser.g:1699:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) )
            {
            // InternalLilyChantParser.g:1699:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) )
            // InternalLilyChantParser.g:1700:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_1()); 
            }
            // InternalLilyChantParser.g:1701:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 )
            // InternalLilyChantParser.g:1701:3: rule__NoteGroup__SyllablesAssignment_0_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__SyllablesAssignment_0_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_0_0_1__1__Impl"


    // $ANTLR start "rule__NoteGroup__Group_2__0"
    // InternalLilyChantParser.g:1710:1: rule__NoteGroup__Group_2__0 : rule__NoteGroup__Group_2__0__Impl rule__NoteGroup__Group_2__1 ;
    public final void rule__NoteGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1714:1: ( rule__NoteGroup__Group_2__0__Impl rule__NoteGroup__Group_2__1 )
            // InternalLilyChantParser.g:1715:2: rule__NoteGroup__Group_2__0__Impl rule__NoteGroup__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__NoteGroup__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_2__0"


    // $ANTLR start "rule__NoteGroup__Group_2__0__Impl"
    // InternalLilyChantParser.g:1722:1: rule__NoteGroup__Group_2__0__Impl : ( RULE_START_NOTE_GROUP ) ;
    public final void rule__NoteGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1726:1: ( ( RULE_START_NOTE_GROUP ) )
            // InternalLilyChantParser.g:1727:1: ( RULE_START_NOTE_GROUP )
            {
            // InternalLilyChantParser.g:1727:1: ( RULE_START_NOTE_GROUP )
            // InternalLilyChantParser.g:1728:2: RULE_START_NOTE_GROUP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSTART_NOTE_GROUPTerminalRuleCall_2_0()); 
            }
            match(input,RULE_START_NOTE_GROUP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSTART_NOTE_GROUPTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_2__0__Impl"


    // $ANTLR start "rule__NoteGroup__Group_2__1"
    // InternalLilyChantParser.g:1737:1: rule__NoteGroup__Group_2__1 : rule__NoteGroup__Group_2__1__Impl rule__NoteGroup__Group_2__2 ;
    public final void rule__NoteGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1741:1: ( rule__NoteGroup__Group_2__1__Impl rule__NoteGroup__Group_2__2 )
            // InternalLilyChantParser.g:1742:2: rule__NoteGroup__Group_2__1__Impl rule__NoteGroup__Group_2__2
            {
            pushFollow(FOLLOW_24);
            rule__NoteGroup__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_2__1"


    // $ANTLR start "rule__NoteGroup__Group_2__1__Impl"
    // InternalLilyChantParser.g:1749:1: rule__NoteGroup__Group_2__1__Impl : ( ( rule__NoteGroup__NoemphasisAssignment_2_1 )? ) ;
    public final void rule__NoteGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1753:1: ( ( ( rule__NoteGroup__NoemphasisAssignment_2_1 )? ) )
            // InternalLilyChantParser.g:1754:1: ( ( rule__NoteGroup__NoemphasisAssignment_2_1 )? )
            {
            // InternalLilyChantParser.g:1754:1: ( ( rule__NoteGroup__NoemphasisAssignment_2_1 )? )
            // InternalLilyChantParser.g:1755:2: ( rule__NoteGroup__NoemphasisAssignment_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getNoemphasisAssignment_2_1()); 
            }
            // InternalLilyChantParser.g:1756:2: ( rule__NoteGroup__NoemphasisAssignment_2_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Solidus) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLilyChantParser.g:1756:3: rule__NoteGroup__NoemphasisAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NoteGroup__NoemphasisAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getNoemphasisAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_2__1__Impl"


    // $ANTLR start "rule__NoteGroup__Group_2__2"
    // InternalLilyChantParser.g:1764:1: rule__NoteGroup__Group_2__2 : rule__NoteGroup__Group_2__2__Impl rule__NoteGroup__Group_2__3 ;
    public final void rule__NoteGroup__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1768:1: ( rule__NoteGroup__Group_2__2__Impl rule__NoteGroup__Group_2__3 )
            // InternalLilyChantParser.g:1769:2: rule__NoteGroup__Group_2__2__Impl rule__NoteGroup__Group_2__3
            {
            pushFollow(FOLLOW_25);
            rule__NoteGroup__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_2__2"


    // $ANTLR start "rule__NoteGroup__Group_2__2__Impl"
    // InternalLilyChantParser.g:1776:1: rule__NoteGroup__Group_2__2__Impl : ( ( ( rule__NoteGroup__SyllablesAssignment_2_2 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_2 )* ) ) ;
    public final void rule__NoteGroup__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1780:1: ( ( ( ( rule__NoteGroup__SyllablesAssignment_2_2 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_2 )* ) ) )
            // InternalLilyChantParser.g:1781:1: ( ( ( rule__NoteGroup__SyllablesAssignment_2_2 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_2 )* ) )
            {
            // InternalLilyChantParser.g:1781:1: ( ( ( rule__NoteGroup__SyllablesAssignment_2_2 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_2 )* ) )
            // InternalLilyChantParser.g:1782:2: ( ( rule__NoteGroup__SyllablesAssignment_2_2 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_2 )* )
            {
            // InternalLilyChantParser.g:1782:2: ( ( rule__NoteGroup__SyllablesAssignment_2_2 ) )
            // InternalLilyChantParser.g:1783:3: ( rule__NoteGroup__SyllablesAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_2_2()); 
            }
            // InternalLilyChantParser.g:1784:3: ( rule__NoteGroup__SyllablesAssignment_2_2 )
            // InternalLilyChantParser.g:1784:4: rule__NoteGroup__SyllablesAssignment_2_2
            {
            pushFollow(FOLLOW_26);
            rule__NoteGroup__SyllablesAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_2_2()); 
            }

            }

            // InternalLilyChantParser.g:1787:2: ( ( rule__NoteGroup__SyllablesAssignment_2_2 )* )
            // InternalLilyChantParser.g:1788:3: ( rule__NoteGroup__SyllablesAssignment_2_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_2_2()); 
            }
            // InternalLilyChantParser.g:1789:3: ( rule__NoteGroup__SyllablesAssignment_2_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=HyphenMinusHyphenMinus && LA19_0<=KW___)||LA19_0==Asterisk||LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLilyChantParser.g:1789:4: rule__NoteGroup__SyllablesAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__NoteGroup__SyllablesAssignment_2_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_2_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_2__2__Impl"


    // $ANTLR start "rule__NoteGroup__Group_2__3"
    // InternalLilyChantParser.g:1798:1: rule__NoteGroup__Group_2__3 : rule__NoteGroup__Group_2__3__Impl ;
    public final void rule__NoteGroup__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1802:1: ( rule__NoteGroup__Group_2__3__Impl )
            // InternalLilyChantParser.g:1803:2: rule__NoteGroup__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_2__3"


    // $ANTLR start "rule__NoteGroup__Group_2__3__Impl"
    // InternalLilyChantParser.g:1809:1: rule__NoteGroup__Group_2__3__Impl : ( RULE_END_NOTE_GROUP ) ;
    public final void rule__NoteGroup__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1813:1: ( ( RULE_END_NOTE_GROUP ) )
            // InternalLilyChantParser.g:1814:1: ( RULE_END_NOTE_GROUP )
            {
            // InternalLilyChantParser.g:1814:1: ( RULE_END_NOTE_GROUP )
            // InternalLilyChantParser.g:1815:2: RULE_END_NOTE_GROUP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getEND_NOTE_GROUPTerminalRuleCall_2_3()); 
            }
            match(input,RULE_END_NOTE_GROUP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getEND_NOTE_GROUPTerminalRuleCall_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__Group_2__3__Impl"


    // $ANTLR start "rule__IdRule__Group__0"
    // InternalLilyChantParser.g:1825:1: rule__IdRule__Group__0 : rule__IdRule__Group__0__Impl rule__IdRule__Group__1 ;
    public final void rule__IdRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1829:1: ( rule__IdRule__Group__0__Impl rule__IdRule__Group__1 )
            // InternalLilyChantParser.g:1830:2: rule__IdRule__Group__0__Impl rule__IdRule__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__IdRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IdRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdRule__Group__0"


    // $ANTLR start "rule__IdRule__Group__0__Impl"
    // InternalLilyChantParser.g:1837:1: rule__IdRule__Group__0__Impl : ( ( rule__IdRule__EmphasisAssignment_0 )? ) ;
    public final void rule__IdRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1841:1: ( ( ( rule__IdRule__EmphasisAssignment_0 )? ) )
            // InternalLilyChantParser.g:1842:1: ( ( rule__IdRule__EmphasisAssignment_0 )? )
            {
            // InternalLilyChantParser.g:1842:1: ( ( rule__IdRule__EmphasisAssignment_0 )? )
            // InternalLilyChantParser.g:1843:2: ( rule__IdRule__EmphasisAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdRuleAccess().getEmphasisAssignment_0()); 
            }
            // InternalLilyChantParser.g:1844:2: ( rule__IdRule__EmphasisAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Asterisk) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLilyChantParser.g:1844:3: rule__IdRule__EmphasisAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IdRule__EmphasisAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdRuleAccess().getEmphasisAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdRule__Group__0__Impl"


    // $ANTLR start "rule__IdRule__Group__1"
    // InternalLilyChantParser.g:1852:1: rule__IdRule__Group__1 : rule__IdRule__Group__1__Impl ;
    public final void rule__IdRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1856:1: ( rule__IdRule__Group__1__Impl )
            // InternalLilyChantParser.g:1857:2: rule__IdRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IdRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdRule__Group__1"


    // $ANTLR start "rule__IdRule__Group__1__Impl"
    // InternalLilyChantParser.g:1863:1: rule__IdRule__Group__1__Impl : ( ( rule__IdRule__LiteralAssignment_1 ) ) ;
    public final void rule__IdRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1867:1: ( ( ( rule__IdRule__LiteralAssignment_1 ) ) )
            // InternalLilyChantParser.g:1868:1: ( ( rule__IdRule__LiteralAssignment_1 ) )
            {
            // InternalLilyChantParser.g:1868:1: ( ( rule__IdRule__LiteralAssignment_1 ) )
            // InternalLilyChantParser.g:1869:2: ( rule__IdRule__LiteralAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdRuleAccess().getLiteralAssignment_1()); 
            }
            // InternalLilyChantParser.g:1870:2: ( rule__IdRule__LiteralAssignment_1 )
            // InternalLilyChantParser.g:1870:3: rule__IdRule__LiteralAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IdRule__LiteralAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdRuleAccess().getLiteralAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdRule__Group__1__Impl"


    // $ANTLR start "rule__HyphenRule__Group__0"
    // InternalLilyChantParser.g:1879:1: rule__HyphenRule__Group__0 : rule__HyphenRule__Group__0__Impl rule__HyphenRule__Group__1 ;
    public final void rule__HyphenRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1883:1: ( rule__HyphenRule__Group__0__Impl rule__HyphenRule__Group__1 )
            // InternalLilyChantParser.g:1884:2: rule__HyphenRule__Group__0__Impl rule__HyphenRule__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__HyphenRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HyphenRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HyphenRule__Group__0"


    // $ANTLR start "rule__HyphenRule__Group__0__Impl"
    // InternalLilyChantParser.g:1891:1: rule__HyphenRule__Group__0__Impl : ( () ) ;
    public final void rule__HyphenRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1895:1: ( ( () ) )
            // InternalLilyChantParser.g:1896:1: ( () )
            {
            // InternalLilyChantParser.g:1896:1: ( () )
            // InternalLilyChantParser.g:1897:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHyphenRuleAccess().getHyphenRuleAction_0()); 
            }
            // InternalLilyChantParser.g:1898:2: ()
            // InternalLilyChantParser.g:1898:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHyphenRuleAccess().getHyphenRuleAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HyphenRule__Group__0__Impl"


    // $ANTLR start "rule__HyphenRule__Group__1"
    // InternalLilyChantParser.g:1906:1: rule__HyphenRule__Group__1 : rule__HyphenRule__Group__1__Impl ;
    public final void rule__HyphenRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1910:1: ( rule__HyphenRule__Group__1__Impl )
            // InternalLilyChantParser.g:1911:2: rule__HyphenRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HyphenRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HyphenRule__Group__1"


    // $ANTLR start "rule__HyphenRule__Group__1__Impl"
    // InternalLilyChantParser.g:1917:1: rule__HyphenRule__Group__1__Impl : ( ( rule__HyphenRule__LiteralAssignment_1 ) ) ;
    public final void rule__HyphenRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1921:1: ( ( ( rule__HyphenRule__LiteralAssignment_1 ) ) )
            // InternalLilyChantParser.g:1922:1: ( ( rule__HyphenRule__LiteralAssignment_1 ) )
            {
            // InternalLilyChantParser.g:1922:1: ( ( rule__HyphenRule__LiteralAssignment_1 ) )
            // InternalLilyChantParser.g:1923:2: ( rule__HyphenRule__LiteralAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHyphenRuleAccess().getLiteralAssignment_1()); 
            }
            // InternalLilyChantParser.g:1924:2: ( rule__HyphenRule__LiteralAssignment_1 )
            // InternalLilyChantParser.g:1924:3: rule__HyphenRule__LiteralAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HyphenRule__LiteralAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHyphenRuleAccess().getLiteralAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HyphenRule__Group__1__Impl"


    // $ANTLR start "rule__ExtenderRule__Group__0"
    // InternalLilyChantParser.g:1933:1: rule__ExtenderRule__Group__0 : rule__ExtenderRule__Group__0__Impl rule__ExtenderRule__Group__1 ;
    public final void rule__ExtenderRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1937:1: ( rule__ExtenderRule__Group__0__Impl rule__ExtenderRule__Group__1 )
            // InternalLilyChantParser.g:1938:2: rule__ExtenderRule__Group__0__Impl rule__ExtenderRule__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ExtenderRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExtenderRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtenderRule__Group__0"


    // $ANTLR start "rule__ExtenderRule__Group__0__Impl"
    // InternalLilyChantParser.g:1945:1: rule__ExtenderRule__Group__0__Impl : ( () ) ;
    public final void rule__ExtenderRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1949:1: ( ( () ) )
            // InternalLilyChantParser.g:1950:1: ( () )
            {
            // InternalLilyChantParser.g:1950:1: ( () )
            // InternalLilyChantParser.g:1951:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtenderRuleAccess().getExtenderRuleAction_0()); 
            }
            // InternalLilyChantParser.g:1952:2: ()
            // InternalLilyChantParser.g:1952:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtenderRuleAccess().getExtenderRuleAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtenderRule__Group__0__Impl"


    // $ANTLR start "rule__ExtenderRule__Group__1"
    // InternalLilyChantParser.g:1960:1: rule__ExtenderRule__Group__1 : rule__ExtenderRule__Group__1__Impl ;
    public final void rule__ExtenderRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1964:1: ( rule__ExtenderRule__Group__1__Impl )
            // InternalLilyChantParser.g:1965:2: rule__ExtenderRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtenderRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtenderRule__Group__1"


    // $ANTLR start "rule__ExtenderRule__Group__1__Impl"
    // InternalLilyChantParser.g:1971:1: rule__ExtenderRule__Group__1__Impl : ( ( rule__ExtenderRule__LiteralAssignment_1 ) ) ;
    public final void rule__ExtenderRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1975:1: ( ( ( rule__ExtenderRule__LiteralAssignment_1 ) ) )
            // InternalLilyChantParser.g:1976:1: ( ( rule__ExtenderRule__LiteralAssignment_1 ) )
            {
            // InternalLilyChantParser.g:1976:1: ( ( rule__ExtenderRule__LiteralAssignment_1 ) )
            // InternalLilyChantParser.g:1977:2: ( rule__ExtenderRule__LiteralAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtenderRuleAccess().getLiteralAssignment_1()); 
            }
            // InternalLilyChantParser.g:1978:2: ( rule__ExtenderRule__LiteralAssignment_1 )
            // InternalLilyChantParser.g:1978:3: rule__ExtenderRule__LiteralAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtenderRule__LiteralAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtenderRuleAccess().getLiteralAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtenderRule__Group__1__Impl"


    // $ANTLR start "rule__SkipRule__Group__0"
    // InternalLilyChantParser.g:1987:1: rule__SkipRule__Group__0 : rule__SkipRule__Group__0__Impl rule__SkipRule__Group__1 ;
    public final void rule__SkipRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1991:1: ( rule__SkipRule__Group__0__Impl rule__SkipRule__Group__1 )
            // InternalLilyChantParser.g:1992:2: rule__SkipRule__Group__0__Impl rule__SkipRule__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__SkipRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SkipRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkipRule__Group__0"


    // $ANTLR start "rule__SkipRule__Group__0__Impl"
    // InternalLilyChantParser.g:1999:1: rule__SkipRule__Group__0__Impl : ( () ) ;
    public final void rule__SkipRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2003:1: ( ( () ) )
            // InternalLilyChantParser.g:2004:1: ( () )
            {
            // InternalLilyChantParser.g:2004:1: ( () )
            // InternalLilyChantParser.g:2005:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipRuleAccess().getSkipRuleAction_0()); 
            }
            // InternalLilyChantParser.g:2006:2: ()
            // InternalLilyChantParser.g:2006:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipRuleAccess().getSkipRuleAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkipRule__Group__0__Impl"


    // $ANTLR start "rule__SkipRule__Group__1"
    // InternalLilyChantParser.g:2014:1: rule__SkipRule__Group__1 : rule__SkipRule__Group__1__Impl ;
    public final void rule__SkipRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2018:1: ( rule__SkipRule__Group__1__Impl )
            // InternalLilyChantParser.g:2019:2: rule__SkipRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkipRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkipRule__Group__1"


    // $ANTLR start "rule__SkipRule__Group__1__Impl"
    // InternalLilyChantParser.g:2025:1: rule__SkipRule__Group__1__Impl : ( ( rule__SkipRule__LiteralAssignment_1 ) ) ;
    public final void rule__SkipRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2029:1: ( ( ( rule__SkipRule__LiteralAssignment_1 ) ) )
            // InternalLilyChantParser.g:2030:1: ( ( rule__SkipRule__LiteralAssignment_1 ) )
            {
            // InternalLilyChantParser.g:2030:1: ( ( rule__SkipRule__LiteralAssignment_1 ) )
            // InternalLilyChantParser.g:2031:2: ( rule__SkipRule__LiteralAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipRuleAccess().getLiteralAssignment_1()); 
            }
            // InternalLilyChantParser.g:2032:2: ( rule__SkipRule__LiteralAssignment_1 )
            // InternalLilyChantParser.g:2032:3: rule__SkipRule__LiteralAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SkipRule__LiteralAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipRuleAccess().getLiteralAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkipRule__Group__1__Impl"


    // $ANTLR start "rule__Note__Group__0"
    // InternalLilyChantParser.g:2041:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2045:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalLilyChantParser.g:2046:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Note__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Note__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0"


    // $ANTLR start "rule__Note__Group__0__Impl"
    // InternalLilyChantParser.g:2053:1: rule__Note__Group__0__Impl : ( ( rule__Note__PitchAssignment_0 ) ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2057:1: ( ( ( rule__Note__PitchAssignment_0 ) ) )
            // InternalLilyChantParser.g:2058:1: ( ( rule__Note__PitchAssignment_0 ) )
            {
            // InternalLilyChantParser.g:2058:1: ( ( rule__Note__PitchAssignment_0 ) )
            // InternalLilyChantParser.g:2059:2: ( rule__Note__PitchAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getPitchAssignment_0()); 
            }
            // InternalLilyChantParser.g:2060:2: ( rule__Note__PitchAssignment_0 )
            // InternalLilyChantParser.g:2060:3: rule__Note__PitchAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Note__PitchAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteAccess().getPitchAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0__Impl"


    // $ANTLR start "rule__Note__Group__1"
    // InternalLilyChantParser.g:2068:1: rule__Note__Group__1 : rule__Note__Group__1__Impl ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2072:1: ( rule__Note__Group__1__Impl )
            // InternalLilyChantParser.g:2073:2: rule__Note__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1"


    // $ANTLR start "rule__Note__Group__1__Impl"
    // InternalLilyChantParser.g:2079:1: rule__Note__Group__1__Impl : ( ( rule__Note__DurationAssignment_1 )? ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2083:1: ( ( ( rule__Note__DurationAssignment_1 )? ) )
            // InternalLilyChantParser.g:2084:1: ( ( rule__Note__DurationAssignment_1 )? )
            {
            // InternalLilyChantParser.g:2084:1: ( ( rule__Note__DurationAssignment_1 )? )
            // InternalLilyChantParser.g:2085:2: ( rule__Note__DurationAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getDurationAssignment_1()); 
            }
            // InternalLilyChantParser.g:2086:2: ( rule__Note__DurationAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_DURATION) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLilyChantParser.g:2086:3: rule__Note__DurationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__DurationAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteAccess().getDurationAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1__Impl"


    // $ANTLR start "rule__Format__Group__0"
    // InternalLilyChantParser.g:2095:1: rule__Format__Group__0 : rule__Format__Group__0__Impl rule__Format__Group__1 ;
    public final void rule__Format__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2099:1: ( rule__Format__Group__0__Impl rule__Format__Group__1 )
            // InternalLilyChantParser.g:2100:2: rule__Format__Group__0__Impl rule__Format__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Format__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Format__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group__0"


    // $ANTLR start "rule__Format__Group__0__Impl"
    // InternalLilyChantParser.g:2107:1: rule__Format__Group__0__Impl : ( Format ) ;
    public final void rule__Format__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2111:1: ( ( Format ) )
            // InternalLilyChantParser.g:2112:1: ( Format )
            {
            // InternalLilyChantParser.g:2112:1: ( Format )
            // InternalLilyChantParser.g:2113:2: Format
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatAccess().getFormatKeyword_0()); 
            }
            match(input,Format,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatAccess().getFormatKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group__0__Impl"


    // $ANTLR start "rule__Format__Group__1"
    // InternalLilyChantParser.g:2122:1: rule__Format__Group__1 : rule__Format__Group__1__Impl rule__Format__Group__2 ;
    public final void rule__Format__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2126:1: ( rule__Format__Group__1__Impl rule__Format__Group__2 )
            // InternalLilyChantParser.g:2127:2: rule__Format__Group__1__Impl rule__Format__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Format__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Format__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group__1"


    // $ANTLR start "rule__Format__Group__1__Impl"
    // InternalLilyChantParser.g:2134:1: rule__Format__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Format__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2138:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:2139:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:2139:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:2140:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatAccess().getBEGINTerminalRuleCall_1()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatAccess().getBEGINTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group__1__Impl"


    // $ANTLR start "rule__Format__Group__2"
    // InternalLilyChantParser.g:2149:1: rule__Format__Group__2 : rule__Format__Group__2__Impl rule__Format__Group__3 ;
    public final void rule__Format__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2153:1: ( rule__Format__Group__2__Impl rule__Format__Group__3 )
            // InternalLilyChantParser.g:2154:2: rule__Format__Group__2__Impl rule__Format__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Format__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Format__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group__2"


    // $ANTLR start "rule__Format__Group__2__Impl"
    // InternalLilyChantParser.g:2161:1: rule__Format__Group__2__Impl : ( ( rule__Format__UnorderedGroup_2 ) ) ;
    public final void rule__Format__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2165:1: ( ( ( rule__Format__UnorderedGroup_2 ) ) )
            // InternalLilyChantParser.g:2166:1: ( ( rule__Format__UnorderedGroup_2 ) )
            {
            // InternalLilyChantParser.g:2166:1: ( ( rule__Format__UnorderedGroup_2 ) )
            // InternalLilyChantParser.g:2167:2: ( rule__Format__UnorderedGroup_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatAccess().getUnorderedGroup_2()); 
            }
            // InternalLilyChantParser.g:2168:2: ( rule__Format__UnorderedGroup_2 )
            // InternalLilyChantParser.g:2168:3: rule__Format__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__Format__UnorderedGroup_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatAccess().getUnorderedGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group__2__Impl"


    // $ANTLR start "rule__Format__Group__3"
    // InternalLilyChantParser.g:2176:1: rule__Format__Group__3 : rule__Format__Group__3__Impl ;
    public final void rule__Format__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2180:1: ( rule__Format__Group__3__Impl )
            // InternalLilyChantParser.g:2181:2: rule__Format__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Format__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group__3"


    // $ANTLR start "rule__Format__Group__3__Impl"
    // InternalLilyChantParser.g:2187:1: rule__Format__Group__3__Impl : ( RULE_END ) ;
    public final void rule__Format__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2191:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:2192:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:2192:1: ( RULE_END )
            // InternalLilyChantParser.g:2193:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatAccess().getENDTerminalRuleCall_3()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatAccess().getENDTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group__3__Impl"


    // $ANTLR start "rule__Format__UnorderedGroup_2"
    // InternalLilyChantParser.g:2203:1: rule__Format__UnorderedGroup_2 : ( rule__Format__UnorderedGroup_2__0 )? ;
    public final void rule__Format__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getFormatAccess().getUnorderedGroup_2());
        	
        try {
            // InternalLilyChantParser.g:2208:1: ( ( rule__Format__UnorderedGroup_2__0 )? )
            // InternalLilyChantParser.g:2209:2: ( rule__Format__UnorderedGroup_2__0 )?
            {
            // InternalLilyChantParser.g:2209:2: ( rule__Format__UnorderedGroup_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == RaggedBottom && getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == RaggedLastBottom && getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 1) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLilyChantParser.g:0:0: rule__Format__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Format__UnorderedGroup_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getFormatAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__UnorderedGroup_2"


    // $ANTLR start "rule__Format__UnorderedGroup_2__Impl"
    // InternalLilyChantParser.g:2217:1: rule__Format__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Format__RaggedbottomAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Format__RaggedlastbottomAssignment_2_1 ) ) ) ) ) ;
    public final void rule__Format__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalLilyChantParser.g:2222:1: ( ( ({...}? => ( ( ( rule__Format__RaggedbottomAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Format__RaggedlastbottomAssignment_2_1 ) ) ) ) ) )
            // InternalLilyChantParser.g:2223:3: ( ({...}? => ( ( ( rule__Format__RaggedbottomAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Format__RaggedlastbottomAssignment_2_1 ) ) ) ) )
            {
            // InternalLilyChantParser.g:2223:3: ( ({...}? => ( ( ( rule__Format__RaggedbottomAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Format__RaggedlastbottomAssignment_2_1 ) ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == RaggedBottom && getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == RaggedLastBottom && getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 1) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalLilyChantParser.g:2224:3: ({...}? => ( ( ( rule__Format__RaggedbottomAssignment_2_0 ) ) ) )
                    {
                    // InternalLilyChantParser.g:2224:3: ({...}? => ( ( ( rule__Format__RaggedbottomAssignment_2_0 ) ) ) )
                    // InternalLilyChantParser.g:2225:4: {...}? => ( ( ( rule__Format__RaggedbottomAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Format__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalLilyChantParser.g:2225:102: ( ( ( rule__Format__RaggedbottomAssignment_2_0 ) ) )
                    // InternalLilyChantParser.g:2226:5: ( ( rule__Format__RaggedbottomAssignment_2_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 0);
                    selected = true;
                    // InternalLilyChantParser.g:2232:5: ( ( rule__Format__RaggedbottomAssignment_2_0 ) )
                    // InternalLilyChantParser.g:2233:6: ( rule__Format__RaggedbottomAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormatAccess().getRaggedbottomAssignment_2_0()); 
                    }
                    // InternalLilyChantParser.g:2234:6: ( rule__Format__RaggedbottomAssignment_2_0 )
                    // InternalLilyChantParser.g:2234:7: rule__Format__RaggedbottomAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Format__RaggedbottomAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormatAccess().getRaggedbottomAssignment_2_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLilyChantParser.g:2239:3: ({...}? => ( ( ( rule__Format__RaggedlastbottomAssignment_2_1 ) ) ) )
                    {
                    // InternalLilyChantParser.g:2239:3: ({...}? => ( ( ( rule__Format__RaggedlastbottomAssignment_2_1 ) ) ) )
                    // InternalLilyChantParser.g:2240:4: {...}? => ( ( ( rule__Format__RaggedlastbottomAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Format__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalLilyChantParser.g:2240:102: ( ( ( rule__Format__RaggedlastbottomAssignment_2_1 ) ) )
                    // InternalLilyChantParser.g:2241:5: ( ( rule__Format__RaggedlastbottomAssignment_2_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 1);
                    selected = true;
                    // InternalLilyChantParser.g:2247:5: ( ( rule__Format__RaggedlastbottomAssignment_2_1 ) )
                    // InternalLilyChantParser.g:2248:6: ( rule__Format__RaggedlastbottomAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormatAccess().getRaggedlastbottomAssignment_2_1()); 
                    }
                    // InternalLilyChantParser.g:2249:6: ( rule__Format__RaggedlastbottomAssignment_2_1 )
                    // InternalLilyChantParser.g:2249:7: rule__Format__RaggedlastbottomAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Format__RaggedlastbottomAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormatAccess().getRaggedlastbottomAssignment_2_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormatAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Format__UnorderedGroup_2__0"
    // InternalLilyChantParser.g:2262:1: rule__Format__UnorderedGroup_2__0 : rule__Format__UnorderedGroup_2__Impl ( rule__Format__UnorderedGroup_2__1 )? ;
    public final void rule__Format__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2266:1: ( rule__Format__UnorderedGroup_2__Impl ( rule__Format__UnorderedGroup_2__1 )? )
            // InternalLilyChantParser.g:2267:2: rule__Format__UnorderedGroup_2__Impl ( rule__Format__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_30);
            rule__Format__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalLilyChantParser.g:2268:2: ( rule__Format__UnorderedGroup_2__1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == RaggedBottom && getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == RaggedLastBottom && getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 1) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLilyChantParser.g:0:0: rule__Format__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Format__UnorderedGroup_2__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__UnorderedGroup_2__0"


    // $ANTLR start "rule__Format__UnorderedGroup_2__1"
    // InternalLilyChantParser.g:2274:1: rule__Format__UnorderedGroup_2__1 : rule__Format__UnorderedGroup_2__Impl ;
    public final void rule__Format__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2278:1: ( rule__Format__UnorderedGroup_2__Impl )
            // InternalLilyChantParser.g:2279:2: rule__Format__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Format__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__UnorderedGroup_2__1"


    // $ANTLR start "rule__Script__TonesAssignment_0"
    // InternalLilyChantParser.g:2286:1: rule__Script__TonesAssignment_0 : ( ruleTone ) ;
    public final void rule__Script__TonesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2290:1: ( ( ruleTone ) )
            // InternalLilyChantParser.g:2291:2: ( ruleTone )
            {
            // InternalLilyChantParser.g:2291:2: ( ruleTone )
            // InternalLilyChantParser.g:2292:3: ruleTone
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getTonesToneParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTone();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getTonesToneParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__TonesAssignment_0"


    // $ANTLR start "rule__Script__ChantsAssignment_1"
    // InternalLilyChantParser.g:2301:1: rule__Script__ChantsAssignment_1 : ( ruleChant ) ;
    public final void rule__Script__ChantsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2305:1: ( ( ruleChant ) )
            // InternalLilyChantParser.g:2306:2: ( ruleChant )
            {
            // InternalLilyChantParser.g:2306:2: ( ruleChant )
            // InternalLilyChantParser.g:2307:3: ruleChant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getChantsChantParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleChant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getChantsChantParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__ChantsAssignment_1"


    // $ANTLR start "rule__Script__FormatAssignment_2"
    // InternalLilyChantParser.g:2316:1: rule__Script__FormatAssignment_2 : ( ruleFormat ) ;
    public final void rule__Script__FormatAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2320:1: ( ( ruleFormat ) )
            // InternalLilyChantParser.g:2321:2: ( ruleFormat )
            {
            // InternalLilyChantParser.g:2321:2: ( ruleFormat )
            // InternalLilyChantParser.g:2322:3: ruleFormat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getFormatFormatParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFormat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getFormatFormatParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__FormatAssignment_2"


    // $ANTLR start "rule__Tone__NameAssignment_1"
    // InternalLilyChantParser.g:2331:1: rule__Tone__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tone__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2335:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2336:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:2336:2: ( RULE_ID )
            // InternalLilyChantParser.g:2337:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__NameAssignment_1"


    // $ANTLR start "rule__Tone__VoiceNamesAssignment_5"
    // InternalLilyChantParser.g:2346:1: rule__Tone__VoiceNamesAssignment_5 : ( ruleVoiceName ) ;
    public final void rule__Tone__VoiceNamesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2350:1: ( ( ruleVoiceName ) )
            // InternalLilyChantParser.g:2351:2: ( ruleVoiceName )
            {
            // InternalLilyChantParser.g:2351:2: ( ruleVoiceName )
            // InternalLilyChantParser.g:2352:3: ruleVoiceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getVoiceNamesVoiceNameParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVoiceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getVoiceNamesVoiceNameParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__VoiceNamesAssignment_5"


    // $ANTLR start "rule__Tone__PhrasesAssignment_7"
    // InternalLilyChantParser.g:2361:1: rule__Tone__PhrasesAssignment_7 : ( ruleTonePhrase ) ;
    public final void rule__Tone__PhrasesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2365:1: ( ( ruleTonePhrase ) )
            // InternalLilyChantParser.g:2366:2: ( ruleTonePhrase )
            {
            // InternalLilyChantParser.g:2366:2: ( ruleTonePhrase )
            // InternalLilyChantParser.g:2367:3: ruleTonePhrase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getPhrasesTonePhraseParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTonePhrase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getPhrasesTonePhraseParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__PhrasesAssignment_7"


    // $ANTLR start "rule__VoiceName__NameAssignment"
    // InternalLilyChantParser.g:2376:1: rule__VoiceName__NameAssignment : ( RULE_ID ) ;
    public final void rule__VoiceName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2380:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2381:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:2381:2: ( RULE_ID )
            // InternalLilyChantParser.g:2382:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoiceNameAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoiceNameAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoiceName__NameAssignment"


    // $ANTLR start "rule__TonePhrase__NameAssignment_1"
    // InternalLilyChantParser.g:2391:1: rule__TonePhrase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TonePhrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2395:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2396:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:2396:2: ( RULE_ID )
            // InternalLilyChantParser.g:2397:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTonePhraseAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TonePhrase__NameAssignment_1"


    // $ANTLR start "rule__TonePhrase__VoicesAssignment_3"
    // InternalLilyChantParser.g:2406:1: rule__TonePhrase__VoicesAssignment_3 : ( ruleVoicePhrase ) ;
    public final void rule__TonePhrase__VoicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2410:1: ( ( ruleVoicePhrase ) )
            // InternalLilyChantParser.g:2411:2: ( ruleVoicePhrase )
            {
            // InternalLilyChantParser.g:2411:2: ( ruleVoicePhrase )
            // InternalLilyChantParser.g:2412:3: ruleVoicePhrase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getVoicesVoicePhraseParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVoicePhrase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTonePhraseAccess().getVoicesVoicePhraseParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TonePhrase__VoicesAssignment_3"


    // $ANTLR start "rule__VoicePhrase__NameAssignment_1"
    // InternalLilyChantParser.g:2421:1: rule__VoicePhrase__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VoicePhrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2425:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:2426:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:2426:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2427:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNameVoiceNameCrossReference_1_0()); 
            }
            // InternalLilyChantParser.g:2428:3: ( RULE_ID )
            // InternalLilyChantParser.g:2429:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNameVoiceNameIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoicePhraseAccess().getNameVoiceNameIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoicePhraseAccess().getNameVoiceNameCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoicePhrase__NameAssignment_1"


    // $ANTLR start "rule__VoicePhrase__NotesAssignment_3"
    // InternalLilyChantParser.g:2440:1: rule__VoicePhrase__NotesAssignment_3 : ( ruleNote ) ;
    public final void rule__VoicePhrase__NotesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2444:1: ( ( ruleNote ) )
            // InternalLilyChantParser.g:2445:2: ( ruleNote )
            {
            // InternalLilyChantParser.g:2445:2: ( ruleNote )
            // InternalLilyChantParser.g:2446:3: ruleNote
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNotesNoteParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoicePhraseAccess().getNotesNoteParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoicePhrase__NotesAssignment_3"


    // $ANTLR start "rule__Chant__NameAssignment_1"
    // InternalLilyChantParser.g:2455:1: rule__Chant__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Chant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2459:1: ( ( RULE_STRING ) )
            // InternalLilyChantParser.g:2460:2: ( RULE_STRING )
            {
            // InternalLilyChantParser.g:2460:2: ( RULE_STRING )
            // InternalLilyChantParser.g:2461:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__NameAssignment_1"


    // $ANTLR start "rule__Chant__ToneAssignment_3"
    // InternalLilyChantParser.g:2470:1: rule__Chant__ToneAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Chant__ToneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2474:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:2475:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:2475:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2476:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getToneToneCrossReference_3_0()); 
            }
            // InternalLilyChantParser.g:2477:3: ( RULE_ID )
            // InternalLilyChantParser.g:2478:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getToneToneIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getToneToneIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getToneToneCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__ToneAssignment_3"


    // $ANTLR start "rule__Chant__PhrasesAssignment_5"
    // InternalLilyChantParser.g:2489:1: rule__Chant__PhrasesAssignment_5 : ( ruleLyricPhrase ) ;
    public final void rule__Chant__PhrasesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2493:1: ( ( ruleLyricPhrase ) )
            // InternalLilyChantParser.g:2494:2: ( ruleLyricPhrase )
            {
            // InternalLilyChantParser.g:2494:2: ( ruleLyricPhrase )
            // InternalLilyChantParser.g:2495:3: ruleLyricPhrase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getPhrasesLyricPhraseParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLyricPhrase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getPhrasesLyricPhraseParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__PhrasesAssignment_5"


    // $ANTLR start "rule__LyricPhrase__ExplicitPhraseAssignment_0_1"
    // InternalLilyChantParser.g:2504:1: rule__LyricPhrase__ExplicitPhraseAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__LyricPhrase__ExplicitPhraseAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2508:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:2509:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:2509:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2510:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getExplicitPhraseTonePhraseCrossReference_0_1_0()); 
            }
            // InternalLilyChantParser.g:2511:3: ( RULE_ID )
            // InternalLilyChantParser.g:2512:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getExplicitPhraseTonePhraseIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getExplicitPhraseTonePhraseIDTerminalRuleCall_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getExplicitPhraseTonePhraseCrossReference_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__ExplicitPhraseAssignment_0_1"


    // $ANTLR start "rule__LyricPhrase__NoteGroupsAssignment_1"
    // InternalLilyChantParser.g:2523:1: rule__LyricPhrase__NoteGroupsAssignment_1 : ( ruleNoteGroup ) ;
    public final void rule__LyricPhrase__NoteGroupsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2527:1: ( ( ruleNoteGroup ) )
            // InternalLilyChantParser.g:2528:2: ( ruleNoteGroup )
            {
            // InternalLilyChantParser.g:2528:2: ( ruleNoteGroup )
            // InternalLilyChantParser.g:2529:3: ruleNoteGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNoteGroupsNoteGroupParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNoteGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getNoteGroupsNoteGroupParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__NoteGroupsAssignment_1"


    // $ANTLR start "rule__LyricPhrase__BarAssignment_2"
    // InternalLilyChantParser.g:2538:1: rule__LyricPhrase__BarAssignment_2 : ( ruleBarline ) ;
    public final void rule__LyricPhrase__BarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2542:1: ( ( ruleBarline ) )
            // InternalLilyChantParser.g:2543:2: ( ruleBarline )
            {
            // InternalLilyChantParser.g:2543:2: ( ruleBarline )
            // InternalLilyChantParser.g:2544:3: ruleBarline
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getBarBarlineEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBarline();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getBarBarlineEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LyricPhrase__BarAssignment_2"


    // $ANTLR start "rule__NoteGroup__SyllablesAssignment_0_0_0_0"
    // InternalLilyChantParser.g:2553:1: rule__NoteGroup__SyllablesAssignment_0_0_0_0 : ( ruleIdRule ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2557:1: ( ( ruleIdRule ) )
            // InternalLilyChantParser.g:2558:2: ( ruleIdRule )
            {
            // InternalLilyChantParser.g:2558:2: ( ruleIdRule )
            // InternalLilyChantParser.g:2559:3: ruleIdRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesIdRuleParserRuleCall_0_0_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesIdRuleParserRuleCall_0_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__SyllablesAssignment_0_0_0_0"


    // $ANTLR start "rule__NoteGroup__SyllablesAssignment_0_0_0_1_0"
    // InternalLilyChantParser.g:2568:1: rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 : ( ruleHyphenRule ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2572:1: ( ( ruleHyphenRule ) )
            // InternalLilyChantParser.g:2573:2: ( ruleHyphenRule )
            {
            // InternalLilyChantParser.g:2573:2: ( ruleHyphenRule )
            // InternalLilyChantParser.g:2574:3: ruleHyphenRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesHyphenRuleParserRuleCall_0_0_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleHyphenRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesHyphenRuleParserRuleCall_0_0_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__SyllablesAssignment_0_0_0_1_0"


    // $ANTLR start "rule__NoteGroup__SyllablesAssignment_0_0_1_0"
    // InternalLilyChantParser.g:2583:1: rule__NoteGroup__SyllablesAssignment_0_0_1_0 : ( ruleHyphenRule ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2587:1: ( ( ruleHyphenRule ) )
            // InternalLilyChantParser.g:2588:2: ( ruleHyphenRule )
            {
            // InternalLilyChantParser.g:2588:2: ( ruleHyphenRule )
            // InternalLilyChantParser.g:2589:3: ruleHyphenRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesHyphenRuleParserRuleCall_0_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleHyphenRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesHyphenRuleParserRuleCall_0_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__SyllablesAssignment_0_0_1_0"


    // $ANTLR start "rule__NoteGroup__SyllablesAssignment_0_0_1_1"
    // InternalLilyChantParser.g:2598:1: rule__NoteGroup__SyllablesAssignment_0_0_1_1 : ( ruleIdRule ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2602:1: ( ( ruleIdRule ) )
            // InternalLilyChantParser.g:2603:2: ( ruleIdRule )
            {
            // InternalLilyChantParser.g:2603:2: ( ruleIdRule )
            // InternalLilyChantParser.g:2604:3: ruleIdRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesIdRuleParserRuleCall_0_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesIdRuleParserRuleCall_0_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__SyllablesAssignment_0_0_1_1"


    // $ANTLR start "rule__NoteGroup__SyllablesAssignment_0_1"
    // InternalLilyChantParser.g:2613:1: rule__NoteGroup__SyllablesAssignment_0_1 : ( ruleExtenderRule ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2617:1: ( ( ruleExtenderRule ) )
            // InternalLilyChantParser.g:2618:2: ( ruleExtenderRule )
            {
            // InternalLilyChantParser.g:2618:2: ( ruleExtenderRule )
            // InternalLilyChantParser.g:2619:3: ruleExtenderRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesExtenderRuleParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExtenderRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesExtenderRuleParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__SyllablesAssignment_0_1"


    // $ANTLR start "rule__NoteGroup__SyllablesAssignment_1"
    // InternalLilyChantParser.g:2628:1: rule__NoteGroup__SyllablesAssignment_1 : ( ruleSkipRule ) ;
    public final void rule__NoteGroup__SyllablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2632:1: ( ( ruleSkipRule ) )
            // InternalLilyChantParser.g:2633:2: ( ruleSkipRule )
            {
            // InternalLilyChantParser.g:2633:2: ( ruleSkipRule )
            // InternalLilyChantParser.g:2634:3: ruleSkipRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesSkipRuleParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSkipRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesSkipRuleParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__SyllablesAssignment_1"


    // $ANTLR start "rule__NoteGroup__NoemphasisAssignment_2_1"
    // InternalLilyChantParser.g:2643:1: rule__NoteGroup__NoemphasisAssignment_2_1 : ( ( Solidus ) ) ;
    public final void rule__NoteGroup__NoemphasisAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2647:1: ( ( ( Solidus ) ) )
            // InternalLilyChantParser.g:2648:2: ( ( Solidus ) )
            {
            // InternalLilyChantParser.g:2648:2: ( ( Solidus ) )
            // InternalLilyChantParser.g:2649:3: ( Solidus )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getNoemphasisSolidusKeyword_2_1_0()); 
            }
            // InternalLilyChantParser.g:2650:3: ( Solidus )
            // InternalLilyChantParser.g:2651:4: Solidus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getNoemphasisSolidusKeyword_2_1_0()); 
            }
            match(input,Solidus,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getNoemphasisSolidusKeyword_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getNoemphasisSolidusKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__NoemphasisAssignment_2_1"


    // $ANTLR start "rule__NoteGroup__SyllablesAssignment_2_2"
    // InternalLilyChantParser.g:2662:1: rule__NoteGroup__SyllablesAssignment_2_2 : ( ( rule__NoteGroup__SyllablesAlternatives_2_2_0 ) ) ;
    public final void rule__NoteGroup__SyllablesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2666:1: ( ( ( rule__NoteGroup__SyllablesAlternatives_2_2_0 ) ) )
            // InternalLilyChantParser.g:2667:2: ( ( rule__NoteGroup__SyllablesAlternatives_2_2_0 ) )
            {
            // InternalLilyChantParser.g:2667:2: ( ( rule__NoteGroup__SyllablesAlternatives_2_2_0 ) )
            // InternalLilyChantParser.g:2668:3: ( rule__NoteGroup__SyllablesAlternatives_2_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_2_2_0()); 
            }
            // InternalLilyChantParser.g:2669:3: ( rule__NoteGroup__SyllablesAlternatives_2_2_0 )
            // InternalLilyChantParser.g:2669:4: rule__NoteGroup__SyllablesAlternatives_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__SyllablesAlternatives_2_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__SyllablesAssignment_2_2"


    // $ANTLR start "rule__IdRule__EmphasisAssignment_0"
    // InternalLilyChantParser.g:2677:1: rule__IdRule__EmphasisAssignment_0 : ( ( Asterisk ) ) ;
    public final void rule__IdRule__EmphasisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2681:1: ( ( ( Asterisk ) ) )
            // InternalLilyChantParser.g:2682:2: ( ( Asterisk ) )
            {
            // InternalLilyChantParser.g:2682:2: ( ( Asterisk ) )
            // InternalLilyChantParser.g:2683:3: ( Asterisk )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdRuleAccess().getEmphasisAsteriskKeyword_0_0()); 
            }
            // InternalLilyChantParser.g:2684:3: ( Asterisk )
            // InternalLilyChantParser.g:2685:4: Asterisk
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdRuleAccess().getEmphasisAsteriskKeyword_0_0()); 
            }
            match(input,Asterisk,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdRuleAccess().getEmphasisAsteriskKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdRuleAccess().getEmphasisAsteriskKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdRule__EmphasisAssignment_0"


    // $ANTLR start "rule__IdRule__LiteralAssignment_1"
    // InternalLilyChantParser.g:2696:1: rule__IdRule__LiteralAssignment_1 : ( RULE_ID ) ;
    public final void rule__IdRule__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2700:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2701:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:2701:2: ( RULE_ID )
            // InternalLilyChantParser.g:2702:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdRuleAccess().getLiteralIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdRuleAccess().getLiteralIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdRule__LiteralAssignment_1"


    // $ANTLR start "rule__HyphenRule__LiteralAssignment_1"
    // InternalLilyChantParser.g:2711:1: rule__HyphenRule__LiteralAssignment_1 : ( ( HyphenMinusHyphenMinus ) ) ;
    public final void rule__HyphenRule__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2715:1: ( ( ( HyphenMinusHyphenMinus ) ) )
            // InternalLilyChantParser.g:2716:2: ( ( HyphenMinusHyphenMinus ) )
            {
            // InternalLilyChantParser.g:2716:2: ( ( HyphenMinusHyphenMinus ) )
            // InternalLilyChantParser.g:2717:3: ( HyphenMinusHyphenMinus )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHyphenRuleAccess().getLiteralHyphenMinusHyphenMinusKeyword_1_0()); 
            }
            // InternalLilyChantParser.g:2718:3: ( HyphenMinusHyphenMinus )
            // InternalLilyChantParser.g:2719:4: HyphenMinusHyphenMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHyphenRuleAccess().getLiteralHyphenMinusHyphenMinusKeyword_1_0()); 
            }
            match(input,HyphenMinusHyphenMinus,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHyphenRuleAccess().getLiteralHyphenMinusHyphenMinusKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHyphenRuleAccess().getLiteralHyphenMinusHyphenMinusKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HyphenRule__LiteralAssignment_1"


    // $ANTLR start "rule__ExtenderRule__LiteralAssignment_1"
    // InternalLilyChantParser.g:2730:1: rule__ExtenderRule__LiteralAssignment_1 : ( ( KW___ ) ) ;
    public final void rule__ExtenderRule__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2734:1: ( ( ( KW___ ) ) )
            // InternalLilyChantParser.g:2735:2: ( ( KW___ ) )
            {
            // InternalLilyChantParser.g:2735:2: ( ( KW___ ) )
            // InternalLilyChantParser.g:2736:3: ( KW___ )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtenderRuleAccess().getLiteral__Keyword_1_0()); 
            }
            // InternalLilyChantParser.g:2737:3: ( KW___ )
            // InternalLilyChantParser.g:2738:4: KW___
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtenderRuleAccess().getLiteral__Keyword_1_0()); 
            }
            match(input,KW___,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtenderRuleAccess().getLiteral__Keyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtenderRuleAccess().getLiteral__Keyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtenderRule__LiteralAssignment_1"


    // $ANTLR start "rule__SkipRule__LiteralAssignment_1"
    // InternalLilyChantParser.g:2749:1: rule__SkipRule__LiteralAssignment_1 : ( ( KW__ ) ) ;
    public final void rule__SkipRule__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2753:1: ( ( ( KW__ ) ) )
            // InternalLilyChantParser.g:2754:2: ( ( KW__ ) )
            {
            // InternalLilyChantParser.g:2754:2: ( ( KW__ ) )
            // InternalLilyChantParser.g:2755:3: ( KW__ )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipRuleAccess().getLiteral_Keyword_1_0()); 
            }
            // InternalLilyChantParser.g:2756:3: ( KW__ )
            // InternalLilyChantParser.g:2757:4: KW__
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipRuleAccess().getLiteral_Keyword_1_0()); 
            }
            match(input,KW__,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipRuleAccess().getLiteral_Keyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipRuleAccess().getLiteral_Keyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkipRule__LiteralAssignment_1"


    // $ANTLR start "rule__Note__PitchAssignment_0"
    // InternalLilyChantParser.g:2768:1: rule__Note__PitchAssignment_0 : ( RULE_ID ) ;
    public final void rule__Note__PitchAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2772:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2773:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:2773:2: ( RULE_ID )
            // InternalLilyChantParser.g:2774:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getPitchIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteAccess().getPitchIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__PitchAssignment_0"


    // $ANTLR start "rule__Note__DurationAssignment_1"
    // InternalLilyChantParser.g:2783:1: rule__Note__DurationAssignment_1 : ( RULE_DURATION ) ;
    public final void rule__Note__DurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2787:1: ( ( RULE_DURATION ) )
            // InternalLilyChantParser.g:2788:2: ( RULE_DURATION )
            {
            // InternalLilyChantParser.g:2788:2: ( RULE_DURATION )
            // InternalLilyChantParser.g:2789:3: RULE_DURATION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getDurationDURATIONTerminalRuleCall_1_0()); 
            }
            match(input,RULE_DURATION,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteAccess().getDurationDURATIONTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__DurationAssignment_1"


    // $ANTLR start "rule__Format__RaggedbottomAssignment_2_0"
    // InternalLilyChantParser.g:2798:1: rule__Format__RaggedbottomAssignment_2_0 : ( ( RaggedBottom ) ) ;
    public final void rule__Format__RaggedbottomAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2802:1: ( ( ( RaggedBottom ) ) )
            // InternalLilyChantParser.g:2803:2: ( ( RaggedBottom ) )
            {
            // InternalLilyChantParser.g:2803:2: ( ( RaggedBottom ) )
            // InternalLilyChantParser.g:2804:3: ( RaggedBottom )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatAccess().getRaggedbottomRaggedBottomKeyword_2_0_0()); 
            }
            // InternalLilyChantParser.g:2805:3: ( RaggedBottom )
            // InternalLilyChantParser.g:2806:4: RaggedBottom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatAccess().getRaggedbottomRaggedBottomKeyword_2_0_0()); 
            }
            match(input,RaggedBottom,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatAccess().getRaggedbottomRaggedBottomKeyword_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatAccess().getRaggedbottomRaggedBottomKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__RaggedbottomAssignment_2_0"


    // $ANTLR start "rule__Format__RaggedlastbottomAssignment_2_1"
    // InternalLilyChantParser.g:2817:1: rule__Format__RaggedlastbottomAssignment_2_1 : ( ( RaggedLastBottom ) ) ;
    public final void rule__Format__RaggedlastbottomAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2821:1: ( ( ( RaggedLastBottom ) ) )
            // InternalLilyChantParser.g:2822:2: ( ( RaggedLastBottom ) )
            {
            // InternalLilyChantParser.g:2822:2: ( ( RaggedLastBottom ) )
            // InternalLilyChantParser.g:2823:3: ( RaggedLastBottom )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatAccess().getRaggedlastbottomRaggedLastBottomKeyword_2_1_0()); 
            }
            // InternalLilyChantParser.g:2824:3: ( RaggedLastBottom )
            // InternalLilyChantParser.g:2825:4: RaggedLastBottom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatAccess().getRaggedlastbottomRaggedLastBottomKeyword_2_1_0()); 
            }
            match(input,RaggedLastBottom,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatAccess().getRaggedlastbottomRaggedLastBottomKeyword_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatAccess().getRaggedlastbottomRaggedLastBottomKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__RaggedlastbottomAssignment_2_1"

    // $ANTLR start synpred19_InternalLilyChantParser
    public final void synpred19_InternalLilyChantParser_fragment() throws RecognitionException {   
        // InternalLilyChantParser.g:1620:3: ( rule__NoteGroup__Group_0_0_0_1__0 )
        // InternalLilyChantParser.g:1620:3: rule__NoteGroup__Group_0_0_0_1__0
        {
        pushFollow(FOLLOW_2);
        rule__NoteGroup__Group_0_0_0_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalLilyChantParser

    // $ANTLR start synpred24_InternalLilyChantParser
    public final void synpred24_InternalLilyChantParser_fragment() throws RecognitionException {   
        // InternalLilyChantParser.g:2209:2: ( rule__Format__UnorderedGroup_2__0 )
        // InternalLilyChantParser.g:2209:2: rule__Format__UnorderedGroup_2__0
        {
        pushFollow(FOLLOW_2);
        rule__Format__UnorderedGroup_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalLilyChantParser

    // $ANTLR start synpred25_InternalLilyChantParser
    public final void synpred25_InternalLilyChantParser_fragment() throws RecognitionException {   
        // InternalLilyChantParser.g:2224:3: ( ({...}? => ( ( ( rule__Format__RaggedbottomAssignment_2_0 ) ) ) ) )
        // InternalLilyChantParser.g:2224:3: ({...}? => ( ( ( rule__Format__RaggedbottomAssignment_2_0 ) ) ) )
        {
        // InternalLilyChantParser.g:2224:3: ({...}? => ( ( ( rule__Format__RaggedbottomAssignment_2_0 ) ) ) )
        // InternalLilyChantParser.g:2225:4: {...}? => ( ( ( rule__Format__RaggedbottomAssignment_2_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred25_InternalLilyChantParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 0)");
        }
        // InternalLilyChantParser.g:2225:102: ( ( ( rule__Format__RaggedbottomAssignment_2_0 ) ) )
        // InternalLilyChantParser.g:2226:5: ( ( rule__Format__RaggedbottomAssignment_2_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 0);
        // InternalLilyChantParser.g:2232:5: ( ( rule__Format__RaggedbottomAssignment_2_0 ) )
        // InternalLilyChantParser.g:2233:6: ( rule__Format__RaggedbottomAssignment_2_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getFormatAccess().getRaggedbottomAssignment_2_0()); 
        }
        // InternalLilyChantParser.g:2234:6: ( rule__Format__RaggedbottomAssignment_2_0 )
        // InternalLilyChantParser.g:2234:7: rule__Format__RaggedbottomAssignment_2_0
        {
        pushFollow(FOLLOW_2);
        rule__Format__RaggedbottomAssignment_2_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalLilyChantParser

    // $ANTLR start synpred26_InternalLilyChantParser
    public final void synpred26_InternalLilyChantParser_fragment() throws RecognitionException {   
        // InternalLilyChantParser.g:2268:2: ( rule__Format__UnorderedGroup_2__1 )
        // InternalLilyChantParser.g:2268:2: rule__Format__UnorderedGroup_2__1
        {
        pushFollow(FOLLOW_2);
        rule__Format__UnorderedGroup_2__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalLilyChantParser

    // Delegated rules

    public final boolean synpred26_InternalLilyChantParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalLilyChantParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalLilyChantParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalLilyChantParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalLilyChantParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalLilyChantParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalLilyChantParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalLilyChantParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000012A9000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000012A9002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000221000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000263000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000263002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000032L});

}
