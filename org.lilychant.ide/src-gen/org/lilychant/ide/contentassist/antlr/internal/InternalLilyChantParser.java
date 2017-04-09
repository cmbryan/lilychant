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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Phrase", "Voices", "Chant", "Voice", "Tone", "HyphenMinusHyphenMinus", "KW___", "VerticalLineVerticalLine", "LeftParenthesis", "RightParenthesis", "Asterisk", "Solidus", "KW__", "VerticalLine", "RULE_ID", "RULE_STRING", "RULE_DURATION", "RULE_START_NOTE_GROUP", "RULE_END_NOTE_GROUP", "RULE_BEGIN", "RULE_END", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int HyphenMinusHyphenMinus=9;
    public static final int RULE_END=24;
    public static final int RULE_BEGIN=23;
    public static final int RULE_DURATION=20;
    public static final int VerticalLineVerticalLine=11;
    public static final int RULE_STRING=19;
    public static final int RULE_SL_COMMENT=26;
    public static final int RULE_START_NOTE_GROUP=21;
    public static final int LeftParenthesis=12;
    public static final int KW___=10;
    public static final int Solidus=15;
    public static final int EOF=-1;
    public static final int Asterisk=14;
    public static final int Chant=6;
    public static final int RULE_ID=18;
    public static final int RULE_WS=27;
    public static final int RightParenthesis=13;
    public static final int Phrase=4;
    public static final int RULE_ANY_OTHER=28;
    public static final int Voices=5;
    public static final int KW__=16;
    public static final int RULE_END_NOTE_GROUP=22;
    public static final int Tone=8;
    public static final int VerticalLine=17;
    public static final int RULE_ML_COMMENT=25;
    public static final int Voice=7;

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



    // $ANTLR start "entryRuleScript"
    // InternalLilyChantParser.g:70:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:71:1: ( ruleScript EOF )
            // InternalLilyChantParser.g:72:1: ruleScript EOF
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
    // InternalLilyChantParser.g:79:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:83:2: ( ( ( rule__Script__Group__0 ) ) )
            // InternalLilyChantParser.g:84:2: ( ( rule__Script__Group__0 ) )
            {
            // InternalLilyChantParser.g:84:2: ( ( rule__Script__Group__0 ) )
            // InternalLilyChantParser.g:85:3: ( rule__Script__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:86:3: ( rule__Script__Group__0 )
            // InternalLilyChantParser.g:86:4: rule__Script__Group__0
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
    // InternalLilyChantParser.g:95:1: entryRuleTone : ruleTone EOF ;
    public final void entryRuleTone() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:96:1: ( ruleTone EOF )
            // InternalLilyChantParser.g:97:1: ruleTone EOF
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
    // InternalLilyChantParser.g:104:1: ruleTone : ( ( rule__Tone__Group__0 ) ) ;
    public final void ruleTone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:108:2: ( ( ( rule__Tone__Group__0 ) ) )
            // InternalLilyChantParser.g:109:2: ( ( rule__Tone__Group__0 ) )
            {
            // InternalLilyChantParser.g:109:2: ( ( rule__Tone__Group__0 ) )
            // InternalLilyChantParser.g:110:3: ( rule__Tone__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:111:3: ( rule__Tone__Group__0 )
            // InternalLilyChantParser.g:111:4: rule__Tone__Group__0
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
    // InternalLilyChantParser.g:120:1: entryRuleVoiceName : ruleVoiceName EOF ;
    public final void entryRuleVoiceName() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:121:1: ( ruleVoiceName EOF )
            // InternalLilyChantParser.g:122:1: ruleVoiceName EOF
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
    // InternalLilyChantParser.g:129:1: ruleVoiceName : ( ( rule__VoiceName__NameAssignment ) ) ;
    public final void ruleVoiceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:133:2: ( ( ( rule__VoiceName__NameAssignment ) ) )
            // InternalLilyChantParser.g:134:2: ( ( rule__VoiceName__NameAssignment ) )
            {
            // InternalLilyChantParser.g:134:2: ( ( rule__VoiceName__NameAssignment ) )
            // InternalLilyChantParser.g:135:3: ( rule__VoiceName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoiceNameAccess().getNameAssignment()); 
            }
            // InternalLilyChantParser.g:136:3: ( rule__VoiceName__NameAssignment )
            // InternalLilyChantParser.g:136:4: rule__VoiceName__NameAssignment
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
    // InternalLilyChantParser.g:145:1: entryRuleTonePhrase : ruleTonePhrase EOF ;
    public final void entryRuleTonePhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:146:1: ( ruleTonePhrase EOF )
            // InternalLilyChantParser.g:147:1: ruleTonePhrase EOF
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
    // InternalLilyChantParser.g:154:1: ruleTonePhrase : ( ( rule__TonePhrase__Group__0 ) ) ;
    public final void ruleTonePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:158:2: ( ( ( rule__TonePhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:159:2: ( ( rule__TonePhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:159:2: ( ( rule__TonePhrase__Group__0 ) )
            // InternalLilyChantParser.g:160:3: ( rule__TonePhrase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:161:3: ( rule__TonePhrase__Group__0 )
            // InternalLilyChantParser.g:161:4: rule__TonePhrase__Group__0
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
    // InternalLilyChantParser.g:170:1: entryRuleVoicePhrase : ruleVoicePhrase EOF ;
    public final void entryRuleVoicePhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:171:1: ( ruleVoicePhrase EOF )
            // InternalLilyChantParser.g:172:1: ruleVoicePhrase EOF
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
    // InternalLilyChantParser.g:179:1: ruleVoicePhrase : ( ( rule__VoicePhrase__Group__0 ) ) ;
    public final void ruleVoicePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:183:2: ( ( ( rule__VoicePhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:184:2: ( ( rule__VoicePhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:184:2: ( ( rule__VoicePhrase__Group__0 ) )
            // InternalLilyChantParser.g:185:3: ( rule__VoicePhrase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:186:3: ( rule__VoicePhrase__Group__0 )
            // InternalLilyChantParser.g:186:4: rule__VoicePhrase__Group__0
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
    // InternalLilyChantParser.g:195:1: entryRuleChant : ruleChant EOF ;
    public final void entryRuleChant() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:196:1: ( ruleChant EOF )
            // InternalLilyChantParser.g:197:1: ruleChant EOF
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
    // InternalLilyChantParser.g:204:1: ruleChant : ( ( rule__Chant__Group__0 ) ) ;
    public final void ruleChant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:208:2: ( ( ( rule__Chant__Group__0 ) ) )
            // InternalLilyChantParser.g:209:2: ( ( rule__Chant__Group__0 ) )
            {
            // InternalLilyChantParser.g:209:2: ( ( rule__Chant__Group__0 ) )
            // InternalLilyChantParser.g:210:3: ( rule__Chant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:211:3: ( rule__Chant__Group__0 )
            // InternalLilyChantParser.g:211:4: rule__Chant__Group__0
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
    // InternalLilyChantParser.g:220:1: entryRuleLyricPhrase : ruleLyricPhrase EOF ;
    public final void entryRuleLyricPhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:221:1: ( ruleLyricPhrase EOF )
            // InternalLilyChantParser.g:222:1: ruleLyricPhrase EOF
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
    // InternalLilyChantParser.g:229:1: ruleLyricPhrase : ( ( rule__LyricPhrase__Group__0 ) ) ;
    public final void ruleLyricPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:233:2: ( ( ( rule__LyricPhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:234:2: ( ( rule__LyricPhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:234:2: ( ( rule__LyricPhrase__Group__0 ) )
            // InternalLilyChantParser.g:235:3: ( rule__LyricPhrase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:236:3: ( rule__LyricPhrase__Group__0 )
            // InternalLilyChantParser.g:236:4: rule__LyricPhrase__Group__0
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
    // InternalLilyChantParser.g:245:1: entryRuleNoteGroup : ruleNoteGroup EOF ;
    public final void entryRuleNoteGroup() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:246:1: ( ruleNoteGroup EOF )
            // InternalLilyChantParser.g:247:1: ruleNoteGroup EOF
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
    // InternalLilyChantParser.g:254:1: ruleNoteGroup : ( ( rule__NoteGroup__Alternatives ) ) ;
    public final void ruleNoteGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:258:2: ( ( ( rule__NoteGroup__Alternatives ) ) )
            // InternalLilyChantParser.g:259:2: ( ( rule__NoteGroup__Alternatives ) )
            {
            // InternalLilyChantParser.g:259:2: ( ( rule__NoteGroup__Alternatives ) )
            // InternalLilyChantParser.g:260:3: ( rule__NoteGroup__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getAlternatives()); 
            }
            // InternalLilyChantParser.g:261:3: ( rule__NoteGroup__Alternatives )
            // InternalLilyChantParser.g:261:4: rule__NoteGroup__Alternatives
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
    // InternalLilyChantParser.g:270:1: entryRuleIdRule : ruleIdRule EOF ;
    public final void entryRuleIdRule() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:271:1: ( ruleIdRule EOF )
            // InternalLilyChantParser.g:272:1: ruleIdRule EOF
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
    // InternalLilyChantParser.g:279:1: ruleIdRule : ( ( rule__IdRule__Group__0 ) ) ;
    public final void ruleIdRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:283:2: ( ( ( rule__IdRule__Group__0 ) ) )
            // InternalLilyChantParser.g:284:2: ( ( rule__IdRule__Group__0 ) )
            {
            // InternalLilyChantParser.g:284:2: ( ( rule__IdRule__Group__0 ) )
            // InternalLilyChantParser.g:285:3: ( rule__IdRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdRuleAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:286:3: ( rule__IdRule__Group__0 )
            // InternalLilyChantParser.g:286:4: rule__IdRule__Group__0
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
    // InternalLilyChantParser.g:295:1: entryRuleHyphenRule : ruleHyphenRule EOF ;
    public final void entryRuleHyphenRule() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:296:1: ( ruleHyphenRule EOF )
            // InternalLilyChantParser.g:297:1: ruleHyphenRule EOF
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
    // InternalLilyChantParser.g:304:1: ruleHyphenRule : ( ( rule__HyphenRule__Group__0 ) ) ;
    public final void ruleHyphenRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:308:2: ( ( ( rule__HyphenRule__Group__0 ) ) )
            // InternalLilyChantParser.g:309:2: ( ( rule__HyphenRule__Group__0 ) )
            {
            // InternalLilyChantParser.g:309:2: ( ( rule__HyphenRule__Group__0 ) )
            // InternalLilyChantParser.g:310:3: ( rule__HyphenRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHyphenRuleAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:311:3: ( rule__HyphenRule__Group__0 )
            // InternalLilyChantParser.g:311:4: rule__HyphenRule__Group__0
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
    // InternalLilyChantParser.g:320:1: entryRuleExtenderRule : ruleExtenderRule EOF ;
    public final void entryRuleExtenderRule() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:321:1: ( ruleExtenderRule EOF )
            // InternalLilyChantParser.g:322:1: ruleExtenderRule EOF
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
    // InternalLilyChantParser.g:329:1: ruleExtenderRule : ( ( rule__ExtenderRule__Group__0 ) ) ;
    public final void ruleExtenderRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:333:2: ( ( ( rule__ExtenderRule__Group__0 ) ) )
            // InternalLilyChantParser.g:334:2: ( ( rule__ExtenderRule__Group__0 ) )
            {
            // InternalLilyChantParser.g:334:2: ( ( rule__ExtenderRule__Group__0 ) )
            // InternalLilyChantParser.g:335:3: ( rule__ExtenderRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtenderRuleAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:336:3: ( rule__ExtenderRule__Group__0 )
            // InternalLilyChantParser.g:336:4: rule__ExtenderRule__Group__0
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
    // InternalLilyChantParser.g:345:1: entryRuleSkipRule : ruleSkipRule EOF ;
    public final void entryRuleSkipRule() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:346:1: ( ruleSkipRule EOF )
            // InternalLilyChantParser.g:347:1: ruleSkipRule EOF
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
    // InternalLilyChantParser.g:354:1: ruleSkipRule : ( ( rule__SkipRule__Group__0 ) ) ;
    public final void ruleSkipRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:358:2: ( ( ( rule__SkipRule__Group__0 ) ) )
            // InternalLilyChantParser.g:359:2: ( ( rule__SkipRule__Group__0 ) )
            {
            // InternalLilyChantParser.g:359:2: ( ( rule__SkipRule__Group__0 ) )
            // InternalLilyChantParser.g:360:3: ( rule__SkipRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipRuleAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:361:3: ( rule__SkipRule__Group__0 )
            // InternalLilyChantParser.g:361:4: rule__SkipRule__Group__0
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
    // InternalLilyChantParser.g:370:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:371:1: ( ruleNote EOF )
            // InternalLilyChantParser.g:372:1: ruleNote EOF
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
    // InternalLilyChantParser.g:379:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:383:2: ( ( ( rule__Note__Group__0 ) ) )
            // InternalLilyChantParser.g:384:2: ( ( rule__Note__Group__0 ) )
            {
            // InternalLilyChantParser.g:384:2: ( ( rule__Note__Group__0 ) )
            // InternalLilyChantParser.g:385:3: ( rule__Note__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:386:3: ( rule__Note__Group__0 )
            // InternalLilyChantParser.g:386:4: rule__Note__Group__0
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


    // $ANTLR start "ruleBarline"
    // InternalLilyChantParser.g:395:1: ruleBarline : ( ( rule__Barline__Alternatives ) ) ;
    public final void ruleBarline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:399:1: ( ( ( rule__Barline__Alternatives ) ) )
            // InternalLilyChantParser.g:400:2: ( ( rule__Barline__Alternatives ) )
            {
            // InternalLilyChantParser.g:400:2: ( ( rule__Barline__Alternatives ) )
            // InternalLilyChantParser.g:401:3: ( rule__Barline__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBarlineAccess().getAlternatives()); 
            }
            // InternalLilyChantParser.g:402:3: ( rule__Barline__Alternatives )
            // InternalLilyChantParser.g:402:4: rule__Barline__Alternatives
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
    // InternalLilyChantParser.g:410:1: rule__NoteGroup__Alternatives : ( ( ( rule__NoteGroup__Group_0__0 ) ) | ( ( rule__NoteGroup__SyllablesAssignment_1 ) ) | ( ( rule__NoteGroup__Group_2__0 ) ) );
    public final void rule__NoteGroup__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:414:1: ( ( ( rule__NoteGroup__Group_0__0 ) ) | ( ( rule__NoteGroup__SyllablesAssignment_1 ) ) | ( ( rule__NoteGroup__Group_2__0 ) ) )
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
                    // InternalLilyChantParser.g:415:2: ( ( rule__NoteGroup__Group_0__0 ) )
                    {
                    // InternalLilyChantParser.g:415:2: ( ( rule__NoteGroup__Group_0__0 ) )
                    // InternalLilyChantParser.g:416:3: ( rule__NoteGroup__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_0()); 
                    }
                    // InternalLilyChantParser.g:417:3: ( rule__NoteGroup__Group_0__0 )
                    // InternalLilyChantParser.g:417:4: rule__NoteGroup__Group_0__0
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
                    // InternalLilyChantParser.g:421:2: ( ( rule__NoteGroup__SyllablesAssignment_1 ) )
                    {
                    // InternalLilyChantParser.g:421:2: ( ( rule__NoteGroup__SyllablesAssignment_1 ) )
                    // InternalLilyChantParser.g:422:3: ( rule__NoteGroup__SyllablesAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1()); 
                    }
                    // InternalLilyChantParser.g:423:3: ( rule__NoteGroup__SyllablesAssignment_1 )
                    // InternalLilyChantParser.g:423:4: rule__NoteGroup__SyllablesAssignment_1
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
                    // InternalLilyChantParser.g:427:2: ( ( rule__NoteGroup__Group_2__0 ) )
                    {
                    // InternalLilyChantParser.g:427:2: ( ( rule__NoteGroup__Group_2__0 ) )
                    // InternalLilyChantParser.g:428:3: ( rule__NoteGroup__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_2()); 
                    }
                    // InternalLilyChantParser.g:429:3: ( rule__NoteGroup__Group_2__0 )
                    // InternalLilyChantParser.g:429:4: rule__NoteGroup__Group_2__0
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
    // InternalLilyChantParser.g:437:1: rule__NoteGroup__Alternatives_0_0 : ( ( ( rule__NoteGroup__Group_0_0_0__0 ) ) | ( ( rule__NoteGroup__Group_0_0_1__0 ) ) );
    public final void rule__NoteGroup__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:441:1: ( ( ( rule__NoteGroup__Group_0_0_0__0 ) ) | ( ( rule__NoteGroup__Group_0_0_1__0 ) ) )
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
                    // InternalLilyChantParser.g:442:2: ( ( rule__NoteGroup__Group_0_0_0__0 ) )
                    {
                    // InternalLilyChantParser.g:442:2: ( ( rule__NoteGroup__Group_0_0_0__0 ) )
                    // InternalLilyChantParser.g:443:3: ( rule__NoteGroup__Group_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_0_0_0()); 
                    }
                    // InternalLilyChantParser.g:444:3: ( rule__NoteGroup__Group_0_0_0__0 )
                    // InternalLilyChantParser.g:444:4: rule__NoteGroup__Group_0_0_0__0
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
                    // InternalLilyChantParser.g:448:2: ( ( rule__NoteGroup__Group_0_0_1__0 ) )
                    {
                    // InternalLilyChantParser.g:448:2: ( ( rule__NoteGroup__Group_0_0_1__0 ) )
                    // InternalLilyChantParser.g:449:3: ( rule__NoteGroup__Group_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_0_0_1()); 
                    }
                    // InternalLilyChantParser.g:450:3: ( rule__NoteGroup__Group_0_0_1__0 )
                    // InternalLilyChantParser.g:450:4: rule__NoteGroup__Group_0_0_1__0
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
    // InternalLilyChantParser.g:458:1: rule__NoteGroup__SyllablesAlternatives_2_2_0 : ( ( ruleIdRule ) | ( ruleHyphenRule ) | ( ruleExtenderRule ) );
    public final void rule__NoteGroup__SyllablesAlternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:462:1: ( ( ruleIdRule ) | ( ruleHyphenRule ) | ( ruleExtenderRule ) )
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
                    // InternalLilyChantParser.g:463:2: ( ruleIdRule )
                    {
                    // InternalLilyChantParser.g:463:2: ( ruleIdRule )
                    // InternalLilyChantParser.g:464:3: ruleIdRule
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
                    // InternalLilyChantParser.g:469:2: ( ruleHyphenRule )
                    {
                    // InternalLilyChantParser.g:469:2: ( ruleHyphenRule )
                    // InternalLilyChantParser.g:470:3: ruleHyphenRule
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
                    // InternalLilyChantParser.g:475:2: ( ruleExtenderRule )
                    {
                    // InternalLilyChantParser.g:475:2: ( ruleExtenderRule )
                    // InternalLilyChantParser.g:476:3: ruleExtenderRule
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
    // InternalLilyChantParser.g:485:1: rule__Barline__Alternatives : ( ( ( VerticalLine ) ) | ( ( VerticalLineVerticalLine ) ) );
    public final void rule__Barline__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:489:1: ( ( ( VerticalLine ) ) | ( ( VerticalLineVerticalLine ) ) )
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
                    // InternalLilyChantParser.g:490:2: ( ( VerticalLine ) )
                    {
                    // InternalLilyChantParser.g:490:2: ( ( VerticalLine ) )
                    // InternalLilyChantParser.g:491:3: ( VerticalLine )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBarlineAccess().getSingleEnumLiteralDeclaration_0()); 
                    }
                    // InternalLilyChantParser.g:492:3: ( VerticalLine )
                    // InternalLilyChantParser.g:492:4: VerticalLine
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
                    // InternalLilyChantParser.g:496:2: ( ( VerticalLineVerticalLine ) )
                    {
                    // InternalLilyChantParser.g:496:2: ( ( VerticalLineVerticalLine ) )
                    // InternalLilyChantParser.g:497:3: ( VerticalLineVerticalLine )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBarlineAccess().getDoubleEnumLiteralDeclaration_1()); 
                    }
                    // InternalLilyChantParser.g:498:3: ( VerticalLineVerticalLine )
                    // InternalLilyChantParser.g:498:4: VerticalLineVerticalLine
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
    // InternalLilyChantParser.g:506:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:510:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // InternalLilyChantParser.g:511:2: rule__Script__Group__0__Impl rule__Script__Group__1
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
    // InternalLilyChantParser.g:518:1: rule__Script__Group__0__Impl : ( ( rule__Script__TonesAssignment_0 )* ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:522:1: ( ( ( rule__Script__TonesAssignment_0 )* ) )
            // InternalLilyChantParser.g:523:1: ( ( rule__Script__TonesAssignment_0 )* )
            {
            // InternalLilyChantParser.g:523:1: ( ( rule__Script__TonesAssignment_0 )* )
            // InternalLilyChantParser.g:524:2: ( rule__Script__TonesAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getTonesAssignment_0()); 
            }
            // InternalLilyChantParser.g:525:2: ( rule__Script__TonesAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Tone) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLilyChantParser.g:525:3: rule__Script__TonesAssignment_0
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
    // InternalLilyChantParser.g:533:1: rule__Script__Group__1 : rule__Script__Group__1__Impl ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:537:1: ( rule__Script__Group__1__Impl )
            // InternalLilyChantParser.g:538:2: rule__Script__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__1__Impl();

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
    // InternalLilyChantParser.g:544:1: rule__Script__Group__1__Impl : ( ( rule__Script__ChantsAssignment_1 )* ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:548:1: ( ( ( rule__Script__ChantsAssignment_1 )* ) )
            // InternalLilyChantParser.g:549:1: ( ( rule__Script__ChantsAssignment_1 )* )
            {
            // InternalLilyChantParser.g:549:1: ( ( rule__Script__ChantsAssignment_1 )* )
            // InternalLilyChantParser.g:550:2: ( rule__Script__ChantsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getChantsAssignment_1()); 
            }
            // InternalLilyChantParser.g:551:2: ( rule__Script__ChantsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Chant) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLilyChantParser.g:551:3: rule__Script__ChantsAssignment_1
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


    // $ANTLR start "rule__Tone__Group__0"
    // InternalLilyChantParser.g:560:1: rule__Tone__Group__0 : rule__Tone__Group__0__Impl rule__Tone__Group__1 ;
    public final void rule__Tone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:564:1: ( rule__Tone__Group__0__Impl rule__Tone__Group__1 )
            // InternalLilyChantParser.g:565:2: rule__Tone__Group__0__Impl rule__Tone__Group__1
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
    // InternalLilyChantParser.g:572:1: rule__Tone__Group__0__Impl : ( Tone ) ;
    public final void rule__Tone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:576:1: ( ( Tone ) )
            // InternalLilyChantParser.g:577:1: ( Tone )
            {
            // InternalLilyChantParser.g:577:1: ( Tone )
            // InternalLilyChantParser.g:578:2: Tone
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
    // InternalLilyChantParser.g:587:1: rule__Tone__Group__1 : rule__Tone__Group__1__Impl rule__Tone__Group__2 ;
    public final void rule__Tone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:591:1: ( rule__Tone__Group__1__Impl rule__Tone__Group__2 )
            // InternalLilyChantParser.g:592:2: rule__Tone__Group__1__Impl rule__Tone__Group__2
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
    // InternalLilyChantParser.g:599:1: rule__Tone__Group__1__Impl : ( ( rule__Tone__NameAssignment_1 ) ) ;
    public final void rule__Tone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:603:1: ( ( ( rule__Tone__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:604:1: ( ( rule__Tone__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:604:1: ( ( rule__Tone__NameAssignment_1 ) )
            // InternalLilyChantParser.g:605:2: ( rule__Tone__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:606:2: ( rule__Tone__NameAssignment_1 )
            // InternalLilyChantParser.g:606:3: rule__Tone__NameAssignment_1
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
    // InternalLilyChantParser.g:614:1: rule__Tone__Group__2 : rule__Tone__Group__2__Impl rule__Tone__Group__3 ;
    public final void rule__Tone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:618:1: ( rule__Tone__Group__2__Impl rule__Tone__Group__3 )
            // InternalLilyChantParser.g:619:2: rule__Tone__Group__2__Impl rule__Tone__Group__3
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
    // InternalLilyChantParser.g:626:1: rule__Tone__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__Tone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:630:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:631:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:631:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:632:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:641:1: rule__Tone__Group__3 : rule__Tone__Group__3__Impl rule__Tone__Group__4 ;
    public final void rule__Tone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:645:1: ( rule__Tone__Group__3__Impl rule__Tone__Group__4 )
            // InternalLilyChantParser.g:646:2: rule__Tone__Group__3__Impl rule__Tone__Group__4
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
    // InternalLilyChantParser.g:653:1: rule__Tone__Group__3__Impl : ( Voices ) ;
    public final void rule__Tone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:657:1: ( ( Voices ) )
            // InternalLilyChantParser.g:658:1: ( Voices )
            {
            // InternalLilyChantParser.g:658:1: ( Voices )
            // InternalLilyChantParser.g:659:2: Voices
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
    // InternalLilyChantParser.g:668:1: rule__Tone__Group__4 : rule__Tone__Group__4__Impl rule__Tone__Group__5 ;
    public final void rule__Tone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:672:1: ( rule__Tone__Group__4__Impl rule__Tone__Group__5 )
            // InternalLilyChantParser.g:673:2: rule__Tone__Group__4__Impl rule__Tone__Group__5
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
    // InternalLilyChantParser.g:680:1: rule__Tone__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__Tone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:684:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:685:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:685:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:686:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:695:1: rule__Tone__Group__5 : rule__Tone__Group__5__Impl rule__Tone__Group__6 ;
    public final void rule__Tone__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:699:1: ( rule__Tone__Group__5__Impl rule__Tone__Group__6 )
            // InternalLilyChantParser.g:700:2: rule__Tone__Group__5__Impl rule__Tone__Group__6
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
    // InternalLilyChantParser.g:707:1: rule__Tone__Group__5__Impl : ( ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* ) ) ;
    public final void rule__Tone__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:711:1: ( ( ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* ) ) )
            // InternalLilyChantParser.g:712:1: ( ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* ) )
            {
            // InternalLilyChantParser.g:712:1: ( ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* ) )
            // InternalLilyChantParser.g:713:2: ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* )
            {
            // InternalLilyChantParser.g:713:2: ( ( rule__Tone__VoiceNamesAssignment_5 ) )
            // InternalLilyChantParser.g:714:3: ( rule__Tone__VoiceNamesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getVoiceNamesAssignment_5()); 
            }
            // InternalLilyChantParser.g:715:3: ( rule__Tone__VoiceNamesAssignment_5 )
            // InternalLilyChantParser.g:715:4: rule__Tone__VoiceNamesAssignment_5
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

            // InternalLilyChantParser.g:718:2: ( ( rule__Tone__VoiceNamesAssignment_5 )* )
            // InternalLilyChantParser.g:719:3: ( rule__Tone__VoiceNamesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getVoiceNamesAssignment_5()); 
            }
            // InternalLilyChantParser.g:720:3: ( rule__Tone__VoiceNamesAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLilyChantParser.g:720:4: rule__Tone__VoiceNamesAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Tone__VoiceNamesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalLilyChantParser.g:729:1: rule__Tone__Group__6 : rule__Tone__Group__6__Impl rule__Tone__Group__7 ;
    public final void rule__Tone__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:733:1: ( rule__Tone__Group__6__Impl rule__Tone__Group__7 )
            // InternalLilyChantParser.g:734:2: rule__Tone__Group__6__Impl rule__Tone__Group__7
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
    // InternalLilyChantParser.g:741:1: rule__Tone__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Tone__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:745:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:746:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:746:1: ( RULE_END )
            // InternalLilyChantParser.g:747:2: RULE_END
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
    // InternalLilyChantParser.g:756:1: rule__Tone__Group__7 : rule__Tone__Group__7__Impl rule__Tone__Group__8 ;
    public final void rule__Tone__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:760:1: ( rule__Tone__Group__7__Impl rule__Tone__Group__8 )
            // InternalLilyChantParser.g:761:2: rule__Tone__Group__7__Impl rule__Tone__Group__8
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
    // InternalLilyChantParser.g:768:1: rule__Tone__Group__7__Impl : ( ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* ) ) ;
    public final void rule__Tone__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:772:1: ( ( ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* ) ) )
            // InternalLilyChantParser.g:773:1: ( ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* ) )
            {
            // InternalLilyChantParser.g:773:1: ( ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* ) )
            // InternalLilyChantParser.g:774:2: ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* )
            {
            // InternalLilyChantParser.g:774:2: ( ( rule__Tone__PhrasesAssignment_7 ) )
            // InternalLilyChantParser.g:775:3: ( rule__Tone__PhrasesAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getPhrasesAssignment_7()); 
            }
            // InternalLilyChantParser.g:776:3: ( rule__Tone__PhrasesAssignment_7 )
            // InternalLilyChantParser.g:776:4: rule__Tone__PhrasesAssignment_7
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

            // InternalLilyChantParser.g:779:2: ( ( rule__Tone__PhrasesAssignment_7 )* )
            // InternalLilyChantParser.g:780:3: ( rule__Tone__PhrasesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getPhrasesAssignment_7()); 
            }
            // InternalLilyChantParser.g:781:3: ( rule__Tone__PhrasesAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Phrase) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLilyChantParser.g:781:4: rule__Tone__PhrasesAssignment_7
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Tone__PhrasesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalLilyChantParser.g:790:1: rule__Tone__Group__8 : rule__Tone__Group__8__Impl ;
    public final void rule__Tone__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:794:1: ( rule__Tone__Group__8__Impl )
            // InternalLilyChantParser.g:795:2: rule__Tone__Group__8__Impl
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
    // InternalLilyChantParser.g:801:1: rule__Tone__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Tone__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:805:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:806:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:806:1: ( RULE_END )
            // InternalLilyChantParser.g:807:2: RULE_END
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
    // InternalLilyChantParser.g:817:1: rule__TonePhrase__Group__0 : rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1 ;
    public final void rule__TonePhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:821:1: ( rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1 )
            // InternalLilyChantParser.g:822:2: rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1
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
    // InternalLilyChantParser.g:829:1: rule__TonePhrase__Group__0__Impl : ( Phrase ) ;
    public final void rule__TonePhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:833:1: ( ( Phrase ) )
            // InternalLilyChantParser.g:834:1: ( Phrase )
            {
            // InternalLilyChantParser.g:834:1: ( Phrase )
            // InternalLilyChantParser.g:835:2: Phrase
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
    // InternalLilyChantParser.g:844:1: rule__TonePhrase__Group__1 : rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2 ;
    public final void rule__TonePhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:848:1: ( rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2 )
            // InternalLilyChantParser.g:849:2: rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2
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
    // InternalLilyChantParser.g:856:1: rule__TonePhrase__Group__1__Impl : ( ( rule__TonePhrase__NameAssignment_1 ) ) ;
    public final void rule__TonePhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:860:1: ( ( ( rule__TonePhrase__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:861:1: ( ( rule__TonePhrase__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:861:1: ( ( rule__TonePhrase__NameAssignment_1 ) )
            // InternalLilyChantParser.g:862:2: ( rule__TonePhrase__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:863:2: ( rule__TonePhrase__NameAssignment_1 )
            // InternalLilyChantParser.g:863:3: rule__TonePhrase__NameAssignment_1
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
    // InternalLilyChantParser.g:871:1: rule__TonePhrase__Group__2 : rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3 ;
    public final void rule__TonePhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:875:1: ( rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3 )
            // InternalLilyChantParser.g:876:2: rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3
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
    // InternalLilyChantParser.g:883:1: rule__TonePhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__TonePhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:887:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:888:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:888:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:889:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:898:1: rule__TonePhrase__Group__3 : rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4 ;
    public final void rule__TonePhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:902:1: ( rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4 )
            // InternalLilyChantParser.g:903:2: rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4
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
    // InternalLilyChantParser.g:910:1: rule__TonePhrase__Group__3__Impl : ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) ) ;
    public final void rule__TonePhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:914:1: ( ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:915:1: ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:915:1: ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) )
            // InternalLilyChantParser.g:916:2: ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* )
            {
            // InternalLilyChantParser.g:916:2: ( ( rule__TonePhrase__VoicesAssignment_3 ) )
            // InternalLilyChantParser.g:917:3: ( rule__TonePhrase__VoicesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            }
            // InternalLilyChantParser.g:918:3: ( rule__TonePhrase__VoicesAssignment_3 )
            // InternalLilyChantParser.g:918:4: rule__TonePhrase__VoicesAssignment_3
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

            // InternalLilyChantParser.g:921:2: ( ( rule__TonePhrase__VoicesAssignment_3 )* )
            // InternalLilyChantParser.g:922:3: ( rule__TonePhrase__VoicesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            }
            // InternalLilyChantParser.g:923:3: ( rule__TonePhrase__VoicesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Voice) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLilyChantParser.g:923:4: rule__TonePhrase__VoicesAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__TonePhrase__VoicesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalLilyChantParser.g:932:1: rule__TonePhrase__Group__4 : rule__TonePhrase__Group__4__Impl ;
    public final void rule__TonePhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:936:1: ( rule__TonePhrase__Group__4__Impl )
            // InternalLilyChantParser.g:937:2: rule__TonePhrase__Group__4__Impl
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
    // InternalLilyChantParser.g:943:1: rule__TonePhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__TonePhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:947:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:948:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:948:1: ( RULE_END )
            // InternalLilyChantParser.g:949:2: RULE_END
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
    // InternalLilyChantParser.g:959:1: rule__VoicePhrase__Group__0 : rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1 ;
    public final void rule__VoicePhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:963:1: ( rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1 )
            // InternalLilyChantParser.g:964:2: rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1
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
    // InternalLilyChantParser.g:971:1: rule__VoicePhrase__Group__0__Impl : ( Voice ) ;
    public final void rule__VoicePhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:975:1: ( ( Voice ) )
            // InternalLilyChantParser.g:976:1: ( Voice )
            {
            // InternalLilyChantParser.g:976:1: ( Voice )
            // InternalLilyChantParser.g:977:2: Voice
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
    // InternalLilyChantParser.g:986:1: rule__VoicePhrase__Group__1 : rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2 ;
    public final void rule__VoicePhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:990:1: ( rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2 )
            // InternalLilyChantParser.g:991:2: rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2
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
    // InternalLilyChantParser.g:998:1: rule__VoicePhrase__Group__1__Impl : ( ( rule__VoicePhrase__NameAssignment_1 ) ) ;
    public final void rule__VoicePhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1002:1: ( ( ( rule__VoicePhrase__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:1003:1: ( ( rule__VoicePhrase__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:1003:1: ( ( rule__VoicePhrase__NameAssignment_1 ) )
            // InternalLilyChantParser.g:1004:2: ( rule__VoicePhrase__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:1005:2: ( rule__VoicePhrase__NameAssignment_1 )
            // InternalLilyChantParser.g:1005:3: rule__VoicePhrase__NameAssignment_1
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
    // InternalLilyChantParser.g:1013:1: rule__VoicePhrase__Group__2 : rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3 ;
    public final void rule__VoicePhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1017:1: ( rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3 )
            // InternalLilyChantParser.g:1018:2: rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3
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
    // InternalLilyChantParser.g:1025:1: rule__VoicePhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__VoicePhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1029:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:1030:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:1030:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:1031:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:1040:1: rule__VoicePhrase__Group__3 : rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4 ;
    public final void rule__VoicePhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1044:1: ( rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4 )
            // InternalLilyChantParser.g:1045:2: rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4
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
    // InternalLilyChantParser.g:1052:1: rule__VoicePhrase__Group__3__Impl : ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) ) ;
    public final void rule__VoicePhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1056:1: ( ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:1057:1: ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:1057:1: ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) )
            // InternalLilyChantParser.g:1058:2: ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* )
            {
            // InternalLilyChantParser.g:1058:2: ( ( rule__VoicePhrase__NotesAssignment_3 ) )
            // InternalLilyChantParser.g:1059:3: ( rule__VoicePhrase__NotesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            }
            // InternalLilyChantParser.g:1060:3: ( rule__VoicePhrase__NotesAssignment_3 )
            // InternalLilyChantParser.g:1060:4: rule__VoicePhrase__NotesAssignment_3
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

            // InternalLilyChantParser.g:1063:2: ( ( rule__VoicePhrase__NotesAssignment_3 )* )
            // InternalLilyChantParser.g:1064:3: ( rule__VoicePhrase__NotesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            }
            // InternalLilyChantParser.g:1065:3: ( rule__VoicePhrase__NotesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLilyChantParser.g:1065:4: rule__VoicePhrase__NotesAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VoicePhrase__NotesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalLilyChantParser.g:1074:1: rule__VoicePhrase__Group__4 : rule__VoicePhrase__Group__4__Impl ;
    public final void rule__VoicePhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1078:1: ( rule__VoicePhrase__Group__4__Impl )
            // InternalLilyChantParser.g:1079:2: rule__VoicePhrase__Group__4__Impl
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
    // InternalLilyChantParser.g:1085:1: rule__VoicePhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__VoicePhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1089:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:1090:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:1090:1: ( RULE_END )
            // InternalLilyChantParser.g:1091:2: RULE_END
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
    // InternalLilyChantParser.g:1101:1: rule__Chant__Group__0 : rule__Chant__Group__0__Impl rule__Chant__Group__1 ;
    public final void rule__Chant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1105:1: ( rule__Chant__Group__0__Impl rule__Chant__Group__1 )
            // InternalLilyChantParser.g:1106:2: rule__Chant__Group__0__Impl rule__Chant__Group__1
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
    // InternalLilyChantParser.g:1113:1: rule__Chant__Group__0__Impl : ( Chant ) ;
    public final void rule__Chant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1117:1: ( ( Chant ) )
            // InternalLilyChantParser.g:1118:1: ( Chant )
            {
            // InternalLilyChantParser.g:1118:1: ( Chant )
            // InternalLilyChantParser.g:1119:2: Chant
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
    // InternalLilyChantParser.g:1128:1: rule__Chant__Group__1 : rule__Chant__Group__1__Impl rule__Chant__Group__2 ;
    public final void rule__Chant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1132:1: ( rule__Chant__Group__1__Impl rule__Chant__Group__2 )
            // InternalLilyChantParser.g:1133:2: rule__Chant__Group__1__Impl rule__Chant__Group__2
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
    // InternalLilyChantParser.g:1140:1: rule__Chant__Group__1__Impl : ( ( rule__Chant__NameAssignment_1 )? ) ;
    public final void rule__Chant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1144:1: ( ( ( rule__Chant__NameAssignment_1 )? ) )
            // InternalLilyChantParser.g:1145:1: ( ( rule__Chant__NameAssignment_1 )? )
            {
            // InternalLilyChantParser.g:1145:1: ( ( rule__Chant__NameAssignment_1 )? )
            // InternalLilyChantParser.g:1146:2: ( rule__Chant__NameAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:1147:2: ( rule__Chant__NameAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLilyChantParser.g:1147:3: rule__Chant__NameAssignment_1
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
    // InternalLilyChantParser.g:1155:1: rule__Chant__Group__2 : rule__Chant__Group__2__Impl rule__Chant__Group__3 ;
    public final void rule__Chant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1159:1: ( rule__Chant__Group__2__Impl rule__Chant__Group__3 )
            // InternalLilyChantParser.g:1160:2: rule__Chant__Group__2__Impl rule__Chant__Group__3
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
    // InternalLilyChantParser.g:1167:1: rule__Chant__Group__2__Impl : ( Tone ) ;
    public final void rule__Chant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1171:1: ( ( Tone ) )
            // InternalLilyChantParser.g:1172:1: ( Tone )
            {
            // InternalLilyChantParser.g:1172:1: ( Tone )
            // InternalLilyChantParser.g:1173:2: Tone
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
    // InternalLilyChantParser.g:1182:1: rule__Chant__Group__3 : rule__Chant__Group__3__Impl rule__Chant__Group__4 ;
    public final void rule__Chant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1186:1: ( rule__Chant__Group__3__Impl rule__Chant__Group__4 )
            // InternalLilyChantParser.g:1187:2: rule__Chant__Group__3__Impl rule__Chant__Group__4
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
    // InternalLilyChantParser.g:1194:1: rule__Chant__Group__3__Impl : ( ( rule__Chant__ToneAssignment_3 ) ) ;
    public final void rule__Chant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1198:1: ( ( ( rule__Chant__ToneAssignment_3 ) ) )
            // InternalLilyChantParser.g:1199:1: ( ( rule__Chant__ToneAssignment_3 ) )
            {
            // InternalLilyChantParser.g:1199:1: ( ( rule__Chant__ToneAssignment_3 ) )
            // InternalLilyChantParser.g:1200:2: ( rule__Chant__ToneAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getToneAssignment_3()); 
            }
            // InternalLilyChantParser.g:1201:2: ( rule__Chant__ToneAssignment_3 )
            // InternalLilyChantParser.g:1201:3: rule__Chant__ToneAssignment_3
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
    // InternalLilyChantParser.g:1209:1: rule__Chant__Group__4 : rule__Chant__Group__4__Impl rule__Chant__Group__5 ;
    public final void rule__Chant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1213:1: ( rule__Chant__Group__4__Impl rule__Chant__Group__5 )
            // InternalLilyChantParser.g:1214:2: rule__Chant__Group__4__Impl rule__Chant__Group__5
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
    // InternalLilyChantParser.g:1221:1: rule__Chant__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__Chant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1225:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:1226:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:1226:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:1227:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:1236:1: rule__Chant__Group__5 : rule__Chant__Group__5__Impl rule__Chant__Group__6 ;
    public final void rule__Chant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1240:1: ( rule__Chant__Group__5__Impl rule__Chant__Group__6 )
            // InternalLilyChantParser.g:1241:2: rule__Chant__Group__5__Impl rule__Chant__Group__6
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
    // InternalLilyChantParser.g:1248:1: rule__Chant__Group__5__Impl : ( ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* ) ) ;
    public final void rule__Chant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1252:1: ( ( ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* ) ) )
            // InternalLilyChantParser.g:1253:1: ( ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* ) )
            {
            // InternalLilyChantParser.g:1253:1: ( ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* ) )
            // InternalLilyChantParser.g:1254:2: ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* )
            {
            // InternalLilyChantParser.g:1254:2: ( ( rule__Chant__PhrasesAssignment_5 ) )
            // InternalLilyChantParser.g:1255:3: ( rule__Chant__PhrasesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getPhrasesAssignment_5()); 
            }
            // InternalLilyChantParser.g:1256:3: ( rule__Chant__PhrasesAssignment_5 )
            // InternalLilyChantParser.g:1256:4: rule__Chant__PhrasesAssignment_5
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

            // InternalLilyChantParser.g:1259:2: ( ( rule__Chant__PhrasesAssignment_5 )* )
            // InternalLilyChantParser.g:1260:3: ( rule__Chant__PhrasesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getPhrasesAssignment_5()); 
            }
            // InternalLilyChantParser.g:1261:3: ( rule__Chant__PhrasesAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==HyphenMinusHyphenMinus||LA12_0==LeftParenthesis||LA12_0==Asterisk||LA12_0==KW__||LA12_0==RULE_ID||LA12_0==RULE_START_NOTE_GROUP) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLilyChantParser.g:1261:4: rule__Chant__PhrasesAssignment_5
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Chant__PhrasesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalLilyChantParser.g:1270:1: rule__Chant__Group__6 : rule__Chant__Group__6__Impl ;
    public final void rule__Chant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1274:1: ( rule__Chant__Group__6__Impl )
            // InternalLilyChantParser.g:1275:2: rule__Chant__Group__6__Impl
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
    // InternalLilyChantParser.g:1281:1: rule__Chant__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Chant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1285:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:1286:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:1286:1: ( RULE_END )
            // InternalLilyChantParser.g:1287:2: RULE_END
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
    // InternalLilyChantParser.g:1297:1: rule__LyricPhrase__Group__0 : rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1 ;
    public final void rule__LyricPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1301:1: ( rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1 )
            // InternalLilyChantParser.g:1302:2: rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1
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
    // InternalLilyChantParser.g:1309:1: rule__LyricPhrase__Group__0__Impl : ( ( rule__LyricPhrase__Group_0__0 )? ) ;
    public final void rule__LyricPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1313:1: ( ( ( rule__LyricPhrase__Group_0__0 )? ) )
            // InternalLilyChantParser.g:1314:1: ( ( rule__LyricPhrase__Group_0__0 )? )
            {
            // InternalLilyChantParser.g:1314:1: ( ( rule__LyricPhrase__Group_0__0 )? )
            // InternalLilyChantParser.g:1315:2: ( rule__LyricPhrase__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getGroup_0()); 
            }
            // InternalLilyChantParser.g:1316:2: ( rule__LyricPhrase__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftParenthesis) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLilyChantParser.g:1316:3: rule__LyricPhrase__Group_0__0
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
    // InternalLilyChantParser.g:1324:1: rule__LyricPhrase__Group__1 : rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2 ;
    public final void rule__LyricPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1328:1: ( rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2 )
            // InternalLilyChantParser.g:1329:2: rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2
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
    // InternalLilyChantParser.g:1336:1: rule__LyricPhrase__Group__1__Impl : ( ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* ) ) ;
    public final void rule__LyricPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1340:1: ( ( ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* ) ) )
            // InternalLilyChantParser.g:1341:1: ( ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* ) )
            {
            // InternalLilyChantParser.g:1341:1: ( ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* ) )
            // InternalLilyChantParser.g:1342:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* )
            {
            // InternalLilyChantParser.g:1342:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) )
            // InternalLilyChantParser.g:1343:3: ( rule__LyricPhrase__NoteGroupsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_1()); 
            }
            // InternalLilyChantParser.g:1344:3: ( rule__LyricPhrase__NoteGroupsAssignment_1 )
            // InternalLilyChantParser.g:1344:4: rule__LyricPhrase__NoteGroupsAssignment_1
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

            // InternalLilyChantParser.g:1347:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* )
            // InternalLilyChantParser.g:1348:3: ( rule__LyricPhrase__NoteGroupsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_1()); 
            }
            // InternalLilyChantParser.g:1349:3: ( rule__LyricPhrase__NoteGroupsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==HyphenMinusHyphenMinus||LA14_0==Asterisk||LA14_0==KW__||LA14_0==RULE_ID||LA14_0==RULE_START_NOTE_GROUP) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLilyChantParser.g:1349:4: rule__LyricPhrase__NoteGroupsAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__LyricPhrase__NoteGroupsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalLilyChantParser.g:1358:1: rule__LyricPhrase__Group__2 : rule__LyricPhrase__Group__2__Impl ;
    public final void rule__LyricPhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1362:1: ( rule__LyricPhrase__Group__2__Impl )
            // InternalLilyChantParser.g:1363:2: rule__LyricPhrase__Group__2__Impl
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
    // InternalLilyChantParser.g:1369:1: rule__LyricPhrase__Group__2__Impl : ( ( rule__LyricPhrase__BarAssignment_2 ) ) ;
    public final void rule__LyricPhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1373:1: ( ( ( rule__LyricPhrase__BarAssignment_2 ) ) )
            // InternalLilyChantParser.g:1374:1: ( ( rule__LyricPhrase__BarAssignment_2 ) )
            {
            // InternalLilyChantParser.g:1374:1: ( ( rule__LyricPhrase__BarAssignment_2 ) )
            // InternalLilyChantParser.g:1375:2: ( rule__LyricPhrase__BarAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getBarAssignment_2()); 
            }
            // InternalLilyChantParser.g:1376:2: ( rule__LyricPhrase__BarAssignment_2 )
            // InternalLilyChantParser.g:1376:3: rule__LyricPhrase__BarAssignment_2
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
    // InternalLilyChantParser.g:1385:1: rule__LyricPhrase__Group_0__0 : rule__LyricPhrase__Group_0__0__Impl rule__LyricPhrase__Group_0__1 ;
    public final void rule__LyricPhrase__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1389:1: ( rule__LyricPhrase__Group_0__0__Impl rule__LyricPhrase__Group_0__1 )
            // InternalLilyChantParser.g:1390:2: rule__LyricPhrase__Group_0__0__Impl rule__LyricPhrase__Group_0__1
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
    // InternalLilyChantParser.g:1397:1: rule__LyricPhrase__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__LyricPhrase__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1401:1: ( ( LeftParenthesis ) )
            // InternalLilyChantParser.g:1402:1: ( LeftParenthesis )
            {
            // InternalLilyChantParser.g:1402:1: ( LeftParenthesis )
            // InternalLilyChantParser.g:1403:2: LeftParenthesis
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
    // InternalLilyChantParser.g:1412:1: rule__LyricPhrase__Group_0__1 : rule__LyricPhrase__Group_0__1__Impl rule__LyricPhrase__Group_0__2 ;
    public final void rule__LyricPhrase__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1416:1: ( rule__LyricPhrase__Group_0__1__Impl rule__LyricPhrase__Group_0__2 )
            // InternalLilyChantParser.g:1417:2: rule__LyricPhrase__Group_0__1__Impl rule__LyricPhrase__Group_0__2
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
    // InternalLilyChantParser.g:1424:1: rule__LyricPhrase__Group_0__1__Impl : ( ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 ) ) ;
    public final void rule__LyricPhrase__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1428:1: ( ( ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 ) ) )
            // InternalLilyChantParser.g:1429:1: ( ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 ) )
            {
            // InternalLilyChantParser.g:1429:1: ( ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 ) )
            // InternalLilyChantParser.g:1430:2: ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getExplicitPhraseAssignment_0_1()); 
            }
            // InternalLilyChantParser.g:1431:2: ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 )
            // InternalLilyChantParser.g:1431:3: rule__LyricPhrase__ExplicitPhraseAssignment_0_1
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
    // InternalLilyChantParser.g:1439:1: rule__LyricPhrase__Group_0__2 : rule__LyricPhrase__Group_0__2__Impl ;
    public final void rule__LyricPhrase__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1443:1: ( rule__LyricPhrase__Group_0__2__Impl )
            // InternalLilyChantParser.g:1444:2: rule__LyricPhrase__Group_0__2__Impl
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
    // InternalLilyChantParser.g:1450:1: rule__LyricPhrase__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__LyricPhrase__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1454:1: ( ( RightParenthesis ) )
            // InternalLilyChantParser.g:1455:1: ( RightParenthesis )
            {
            // InternalLilyChantParser.g:1455:1: ( RightParenthesis )
            // InternalLilyChantParser.g:1456:2: RightParenthesis
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
    // InternalLilyChantParser.g:1466:1: rule__NoteGroup__Group_0__0 : rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1 ;
    public final void rule__NoteGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1470:1: ( rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1 )
            // InternalLilyChantParser.g:1471:2: rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1
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
    // InternalLilyChantParser.g:1478:1: rule__NoteGroup__Group_0__0__Impl : ( ( rule__NoteGroup__Alternatives_0_0 ) ) ;
    public final void rule__NoteGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1482:1: ( ( ( rule__NoteGroup__Alternatives_0_0 ) ) )
            // InternalLilyChantParser.g:1483:1: ( ( rule__NoteGroup__Alternatives_0_0 ) )
            {
            // InternalLilyChantParser.g:1483:1: ( ( rule__NoteGroup__Alternatives_0_0 ) )
            // InternalLilyChantParser.g:1484:2: ( rule__NoteGroup__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getAlternatives_0_0()); 
            }
            // InternalLilyChantParser.g:1485:2: ( rule__NoteGroup__Alternatives_0_0 )
            // InternalLilyChantParser.g:1485:3: rule__NoteGroup__Alternatives_0_0
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
    // InternalLilyChantParser.g:1493:1: rule__NoteGroup__Group_0__1 : rule__NoteGroup__Group_0__1__Impl ;
    public final void rule__NoteGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1497:1: ( rule__NoteGroup__Group_0__1__Impl )
            // InternalLilyChantParser.g:1498:2: rule__NoteGroup__Group_0__1__Impl
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
    // InternalLilyChantParser.g:1504:1: rule__NoteGroup__Group_0__1__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* ) ;
    public final void rule__NoteGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1508:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* ) )
            // InternalLilyChantParser.g:1509:1: ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* )
            {
            // InternalLilyChantParser.g:1509:1: ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* )
            // InternalLilyChantParser.g:1510:2: ( rule__NoteGroup__SyllablesAssignment_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_1()); 
            }
            // InternalLilyChantParser.g:1511:2: ( rule__NoteGroup__SyllablesAssignment_0_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==KW___) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLilyChantParser.g:1511:3: rule__NoteGroup__SyllablesAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__NoteGroup__SyllablesAssignment_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalLilyChantParser.g:1520:1: rule__NoteGroup__Group_0_0_0__0 : rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1 ;
    public final void rule__NoteGroup__Group_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1524:1: ( rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1 )
            // InternalLilyChantParser.g:1525:2: rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1
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
    // InternalLilyChantParser.g:1532:1: rule__NoteGroup__Group_0_0_0__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1536:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) ) )
            // InternalLilyChantParser.g:1537:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) )
            {
            // InternalLilyChantParser.g:1537:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) )
            // InternalLilyChantParser.g:1538:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_0()); 
            }
            // InternalLilyChantParser.g:1539:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 )
            // InternalLilyChantParser.g:1539:3: rule__NoteGroup__SyllablesAssignment_0_0_0_0
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
    // InternalLilyChantParser.g:1547:1: rule__NoteGroup__Group_0_0_0__1 : rule__NoteGroup__Group_0_0_0__1__Impl ;
    public final void rule__NoteGroup__Group_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1551:1: ( rule__NoteGroup__Group_0_0_0__1__Impl )
            // InternalLilyChantParser.g:1552:2: rule__NoteGroup__Group_0_0_0__1__Impl
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
    // InternalLilyChantParser.g:1558:1: rule__NoteGroup__Group_0_0_0__1__Impl : ( ( rule__NoteGroup__Group_0_0_0_1__0 )? ) ;
    public final void rule__NoteGroup__Group_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1562:1: ( ( ( rule__NoteGroup__Group_0_0_0_1__0 )? ) )
            // InternalLilyChantParser.g:1563:1: ( ( rule__NoteGroup__Group_0_0_0_1__0 )? )
            {
            // InternalLilyChantParser.g:1563:1: ( ( rule__NoteGroup__Group_0_0_0_1__0 )? )
            // InternalLilyChantParser.g:1564:2: ( rule__NoteGroup__Group_0_0_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getGroup_0_0_0_1()); 
            }
            // InternalLilyChantParser.g:1565:2: ( rule__NoteGroup__Group_0_0_0_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==HyphenMinusHyphenMinus) ) {
                switch ( input.LA(2) ) {
                    case EOF:
                    case HyphenMinusHyphenMinus:
                    case KW___:
                    case VerticalLineVerticalLine:
                    case KW__:
                    case VerticalLine:
                    case RULE_START_NOTE_GROUP:
                        {
                        alt16=1;
                        }
                        break;
                    case Asterisk:
                        {
                        int LA16_4 = input.LA(3);

                        if ( (LA16_4==RULE_ID) ) {
                            int LA16_5 = input.LA(4);

                            if ( (synpred18_InternalLilyChantParser()) ) {
                                alt16=1;
                            }
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA16_5 = input.LA(3);

                        if ( (synpred18_InternalLilyChantParser()) ) {
                            alt16=1;
                        }
                        }
                        break;
                }

            }
            switch (alt16) {
                case 1 :
                    // InternalLilyChantParser.g:1565:3: rule__NoteGroup__Group_0_0_0_1__0
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
    // InternalLilyChantParser.g:1574:1: rule__NoteGroup__Group_0_0_0_1__0 : rule__NoteGroup__Group_0_0_0_1__0__Impl ;
    public final void rule__NoteGroup__Group_0_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1578:1: ( rule__NoteGroup__Group_0_0_0_1__0__Impl )
            // InternalLilyChantParser.g:1579:2: rule__NoteGroup__Group_0_0_0_1__0__Impl
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
    // InternalLilyChantParser.g:1585:1: rule__NoteGroup__Group_0_0_0_1__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1589:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) ) )
            // InternalLilyChantParser.g:1590:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) )
            {
            // InternalLilyChantParser.g:1590:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) )
            // InternalLilyChantParser.g:1591:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_1_0()); 
            }
            // InternalLilyChantParser.g:1592:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 )
            // InternalLilyChantParser.g:1592:3: rule__NoteGroup__SyllablesAssignment_0_0_0_1_0
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
    // InternalLilyChantParser.g:1601:1: rule__NoteGroup__Group_0_0_1__0 : rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1 ;
    public final void rule__NoteGroup__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1605:1: ( rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1 )
            // InternalLilyChantParser.g:1606:2: rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1
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
    // InternalLilyChantParser.g:1613:1: rule__NoteGroup__Group_0_0_1__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1617:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) ) )
            // InternalLilyChantParser.g:1618:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) )
            {
            // InternalLilyChantParser.g:1618:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) )
            // InternalLilyChantParser.g:1619:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_0()); 
            }
            // InternalLilyChantParser.g:1620:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 )
            // InternalLilyChantParser.g:1620:3: rule__NoteGroup__SyllablesAssignment_0_0_1_0
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
    // InternalLilyChantParser.g:1628:1: rule__NoteGroup__Group_0_0_1__1 : rule__NoteGroup__Group_0_0_1__1__Impl ;
    public final void rule__NoteGroup__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1632:1: ( rule__NoteGroup__Group_0_0_1__1__Impl )
            // InternalLilyChantParser.g:1633:2: rule__NoteGroup__Group_0_0_1__1__Impl
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
    // InternalLilyChantParser.g:1639:1: rule__NoteGroup__Group_0_0_1__1__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) ) ;
    public final void rule__NoteGroup__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1643:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) ) )
            // InternalLilyChantParser.g:1644:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) )
            {
            // InternalLilyChantParser.g:1644:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) )
            // InternalLilyChantParser.g:1645:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_1()); 
            }
            // InternalLilyChantParser.g:1646:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 )
            // InternalLilyChantParser.g:1646:3: rule__NoteGroup__SyllablesAssignment_0_0_1_1
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
    // InternalLilyChantParser.g:1655:1: rule__NoteGroup__Group_2__0 : rule__NoteGroup__Group_2__0__Impl rule__NoteGroup__Group_2__1 ;
    public final void rule__NoteGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1659:1: ( rule__NoteGroup__Group_2__0__Impl rule__NoteGroup__Group_2__1 )
            // InternalLilyChantParser.g:1660:2: rule__NoteGroup__Group_2__0__Impl rule__NoteGroup__Group_2__1
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
    // InternalLilyChantParser.g:1667:1: rule__NoteGroup__Group_2__0__Impl : ( RULE_START_NOTE_GROUP ) ;
    public final void rule__NoteGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1671:1: ( ( RULE_START_NOTE_GROUP ) )
            // InternalLilyChantParser.g:1672:1: ( RULE_START_NOTE_GROUP )
            {
            // InternalLilyChantParser.g:1672:1: ( RULE_START_NOTE_GROUP )
            // InternalLilyChantParser.g:1673:2: RULE_START_NOTE_GROUP
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
    // InternalLilyChantParser.g:1682:1: rule__NoteGroup__Group_2__1 : rule__NoteGroup__Group_2__1__Impl rule__NoteGroup__Group_2__2 ;
    public final void rule__NoteGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1686:1: ( rule__NoteGroup__Group_2__1__Impl rule__NoteGroup__Group_2__2 )
            // InternalLilyChantParser.g:1687:2: rule__NoteGroup__Group_2__1__Impl rule__NoteGroup__Group_2__2
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
    // InternalLilyChantParser.g:1694:1: rule__NoteGroup__Group_2__1__Impl : ( ( rule__NoteGroup__NoemphasisAssignment_2_1 )? ) ;
    public final void rule__NoteGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1698:1: ( ( ( rule__NoteGroup__NoemphasisAssignment_2_1 )? ) )
            // InternalLilyChantParser.g:1699:1: ( ( rule__NoteGroup__NoemphasisAssignment_2_1 )? )
            {
            // InternalLilyChantParser.g:1699:1: ( ( rule__NoteGroup__NoemphasisAssignment_2_1 )? )
            // InternalLilyChantParser.g:1700:2: ( rule__NoteGroup__NoemphasisAssignment_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getNoemphasisAssignment_2_1()); 
            }
            // InternalLilyChantParser.g:1701:2: ( rule__NoteGroup__NoemphasisAssignment_2_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Solidus) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLilyChantParser.g:1701:3: rule__NoteGroup__NoemphasisAssignment_2_1
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
    // InternalLilyChantParser.g:1709:1: rule__NoteGroup__Group_2__2 : rule__NoteGroup__Group_2__2__Impl rule__NoteGroup__Group_2__3 ;
    public final void rule__NoteGroup__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1713:1: ( rule__NoteGroup__Group_2__2__Impl rule__NoteGroup__Group_2__3 )
            // InternalLilyChantParser.g:1714:2: rule__NoteGroup__Group_2__2__Impl rule__NoteGroup__Group_2__3
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
    // InternalLilyChantParser.g:1721:1: rule__NoteGroup__Group_2__2__Impl : ( ( ( rule__NoteGroup__SyllablesAssignment_2_2 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_2 )* ) ) ;
    public final void rule__NoteGroup__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1725:1: ( ( ( ( rule__NoteGroup__SyllablesAssignment_2_2 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_2 )* ) ) )
            // InternalLilyChantParser.g:1726:1: ( ( ( rule__NoteGroup__SyllablesAssignment_2_2 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_2 )* ) )
            {
            // InternalLilyChantParser.g:1726:1: ( ( ( rule__NoteGroup__SyllablesAssignment_2_2 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_2 )* ) )
            // InternalLilyChantParser.g:1727:2: ( ( rule__NoteGroup__SyllablesAssignment_2_2 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_2 )* )
            {
            // InternalLilyChantParser.g:1727:2: ( ( rule__NoteGroup__SyllablesAssignment_2_2 ) )
            // InternalLilyChantParser.g:1728:3: ( rule__NoteGroup__SyllablesAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_2_2()); 
            }
            // InternalLilyChantParser.g:1729:3: ( rule__NoteGroup__SyllablesAssignment_2_2 )
            // InternalLilyChantParser.g:1729:4: rule__NoteGroup__SyllablesAssignment_2_2
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

            // InternalLilyChantParser.g:1732:2: ( ( rule__NoteGroup__SyllablesAssignment_2_2 )* )
            // InternalLilyChantParser.g:1733:3: ( rule__NoteGroup__SyllablesAssignment_2_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_2_2()); 
            }
            // InternalLilyChantParser.g:1734:3: ( rule__NoteGroup__SyllablesAssignment_2_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=HyphenMinusHyphenMinus && LA18_0<=KW___)||LA18_0==Asterisk||LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLilyChantParser.g:1734:4: rule__NoteGroup__SyllablesAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__NoteGroup__SyllablesAssignment_2_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalLilyChantParser.g:1743:1: rule__NoteGroup__Group_2__3 : rule__NoteGroup__Group_2__3__Impl ;
    public final void rule__NoteGroup__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1747:1: ( rule__NoteGroup__Group_2__3__Impl )
            // InternalLilyChantParser.g:1748:2: rule__NoteGroup__Group_2__3__Impl
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
    // InternalLilyChantParser.g:1754:1: rule__NoteGroup__Group_2__3__Impl : ( RULE_END_NOTE_GROUP ) ;
    public final void rule__NoteGroup__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1758:1: ( ( RULE_END_NOTE_GROUP ) )
            // InternalLilyChantParser.g:1759:1: ( RULE_END_NOTE_GROUP )
            {
            // InternalLilyChantParser.g:1759:1: ( RULE_END_NOTE_GROUP )
            // InternalLilyChantParser.g:1760:2: RULE_END_NOTE_GROUP
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
    // InternalLilyChantParser.g:1770:1: rule__IdRule__Group__0 : rule__IdRule__Group__0__Impl rule__IdRule__Group__1 ;
    public final void rule__IdRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1774:1: ( rule__IdRule__Group__0__Impl rule__IdRule__Group__1 )
            // InternalLilyChantParser.g:1775:2: rule__IdRule__Group__0__Impl rule__IdRule__Group__1
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
    // InternalLilyChantParser.g:1782:1: rule__IdRule__Group__0__Impl : ( ( rule__IdRule__EmphasisAssignment_0 )? ) ;
    public final void rule__IdRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1786:1: ( ( ( rule__IdRule__EmphasisAssignment_0 )? ) )
            // InternalLilyChantParser.g:1787:1: ( ( rule__IdRule__EmphasisAssignment_0 )? )
            {
            // InternalLilyChantParser.g:1787:1: ( ( rule__IdRule__EmphasisAssignment_0 )? )
            // InternalLilyChantParser.g:1788:2: ( rule__IdRule__EmphasisAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdRuleAccess().getEmphasisAssignment_0()); 
            }
            // InternalLilyChantParser.g:1789:2: ( rule__IdRule__EmphasisAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Asterisk) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLilyChantParser.g:1789:3: rule__IdRule__EmphasisAssignment_0
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
    // InternalLilyChantParser.g:1797:1: rule__IdRule__Group__1 : rule__IdRule__Group__1__Impl ;
    public final void rule__IdRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1801:1: ( rule__IdRule__Group__1__Impl )
            // InternalLilyChantParser.g:1802:2: rule__IdRule__Group__1__Impl
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
    // InternalLilyChantParser.g:1808:1: rule__IdRule__Group__1__Impl : ( ( rule__IdRule__LiteralAssignment_1 ) ) ;
    public final void rule__IdRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1812:1: ( ( ( rule__IdRule__LiteralAssignment_1 ) ) )
            // InternalLilyChantParser.g:1813:1: ( ( rule__IdRule__LiteralAssignment_1 ) )
            {
            // InternalLilyChantParser.g:1813:1: ( ( rule__IdRule__LiteralAssignment_1 ) )
            // InternalLilyChantParser.g:1814:2: ( rule__IdRule__LiteralAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdRuleAccess().getLiteralAssignment_1()); 
            }
            // InternalLilyChantParser.g:1815:2: ( rule__IdRule__LiteralAssignment_1 )
            // InternalLilyChantParser.g:1815:3: rule__IdRule__LiteralAssignment_1
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
    // InternalLilyChantParser.g:1824:1: rule__HyphenRule__Group__0 : rule__HyphenRule__Group__0__Impl rule__HyphenRule__Group__1 ;
    public final void rule__HyphenRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1828:1: ( rule__HyphenRule__Group__0__Impl rule__HyphenRule__Group__1 )
            // InternalLilyChantParser.g:1829:2: rule__HyphenRule__Group__0__Impl rule__HyphenRule__Group__1
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
    // InternalLilyChantParser.g:1836:1: rule__HyphenRule__Group__0__Impl : ( () ) ;
    public final void rule__HyphenRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1840:1: ( ( () ) )
            // InternalLilyChantParser.g:1841:1: ( () )
            {
            // InternalLilyChantParser.g:1841:1: ( () )
            // InternalLilyChantParser.g:1842:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHyphenRuleAccess().getHyphenRuleAction_0()); 
            }
            // InternalLilyChantParser.g:1843:2: ()
            // InternalLilyChantParser.g:1843:3: 
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
    // InternalLilyChantParser.g:1851:1: rule__HyphenRule__Group__1 : rule__HyphenRule__Group__1__Impl ;
    public final void rule__HyphenRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1855:1: ( rule__HyphenRule__Group__1__Impl )
            // InternalLilyChantParser.g:1856:2: rule__HyphenRule__Group__1__Impl
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
    // InternalLilyChantParser.g:1862:1: rule__HyphenRule__Group__1__Impl : ( ( rule__HyphenRule__LiteralAssignment_1 ) ) ;
    public final void rule__HyphenRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1866:1: ( ( ( rule__HyphenRule__LiteralAssignment_1 ) ) )
            // InternalLilyChantParser.g:1867:1: ( ( rule__HyphenRule__LiteralAssignment_1 ) )
            {
            // InternalLilyChantParser.g:1867:1: ( ( rule__HyphenRule__LiteralAssignment_1 ) )
            // InternalLilyChantParser.g:1868:2: ( rule__HyphenRule__LiteralAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHyphenRuleAccess().getLiteralAssignment_1()); 
            }
            // InternalLilyChantParser.g:1869:2: ( rule__HyphenRule__LiteralAssignment_1 )
            // InternalLilyChantParser.g:1869:3: rule__HyphenRule__LiteralAssignment_1
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
    // InternalLilyChantParser.g:1878:1: rule__ExtenderRule__Group__0 : rule__ExtenderRule__Group__0__Impl rule__ExtenderRule__Group__1 ;
    public final void rule__ExtenderRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1882:1: ( rule__ExtenderRule__Group__0__Impl rule__ExtenderRule__Group__1 )
            // InternalLilyChantParser.g:1883:2: rule__ExtenderRule__Group__0__Impl rule__ExtenderRule__Group__1
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
    // InternalLilyChantParser.g:1890:1: rule__ExtenderRule__Group__0__Impl : ( () ) ;
    public final void rule__ExtenderRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1894:1: ( ( () ) )
            // InternalLilyChantParser.g:1895:1: ( () )
            {
            // InternalLilyChantParser.g:1895:1: ( () )
            // InternalLilyChantParser.g:1896:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtenderRuleAccess().getExtenderRuleAction_0()); 
            }
            // InternalLilyChantParser.g:1897:2: ()
            // InternalLilyChantParser.g:1897:3: 
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
    // InternalLilyChantParser.g:1905:1: rule__ExtenderRule__Group__1 : rule__ExtenderRule__Group__1__Impl ;
    public final void rule__ExtenderRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1909:1: ( rule__ExtenderRule__Group__1__Impl )
            // InternalLilyChantParser.g:1910:2: rule__ExtenderRule__Group__1__Impl
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
    // InternalLilyChantParser.g:1916:1: rule__ExtenderRule__Group__1__Impl : ( ( rule__ExtenderRule__LiteralAssignment_1 ) ) ;
    public final void rule__ExtenderRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1920:1: ( ( ( rule__ExtenderRule__LiteralAssignment_1 ) ) )
            // InternalLilyChantParser.g:1921:1: ( ( rule__ExtenderRule__LiteralAssignment_1 ) )
            {
            // InternalLilyChantParser.g:1921:1: ( ( rule__ExtenderRule__LiteralAssignment_1 ) )
            // InternalLilyChantParser.g:1922:2: ( rule__ExtenderRule__LiteralAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtenderRuleAccess().getLiteralAssignment_1()); 
            }
            // InternalLilyChantParser.g:1923:2: ( rule__ExtenderRule__LiteralAssignment_1 )
            // InternalLilyChantParser.g:1923:3: rule__ExtenderRule__LiteralAssignment_1
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
    // InternalLilyChantParser.g:1932:1: rule__SkipRule__Group__0 : rule__SkipRule__Group__0__Impl rule__SkipRule__Group__1 ;
    public final void rule__SkipRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1936:1: ( rule__SkipRule__Group__0__Impl rule__SkipRule__Group__1 )
            // InternalLilyChantParser.g:1937:2: rule__SkipRule__Group__0__Impl rule__SkipRule__Group__1
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
    // InternalLilyChantParser.g:1944:1: rule__SkipRule__Group__0__Impl : ( () ) ;
    public final void rule__SkipRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1948:1: ( ( () ) )
            // InternalLilyChantParser.g:1949:1: ( () )
            {
            // InternalLilyChantParser.g:1949:1: ( () )
            // InternalLilyChantParser.g:1950:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipRuleAccess().getSkipRuleAction_0()); 
            }
            // InternalLilyChantParser.g:1951:2: ()
            // InternalLilyChantParser.g:1951:3: 
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
    // InternalLilyChantParser.g:1959:1: rule__SkipRule__Group__1 : rule__SkipRule__Group__1__Impl ;
    public final void rule__SkipRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1963:1: ( rule__SkipRule__Group__1__Impl )
            // InternalLilyChantParser.g:1964:2: rule__SkipRule__Group__1__Impl
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
    // InternalLilyChantParser.g:1970:1: rule__SkipRule__Group__1__Impl : ( ( rule__SkipRule__LiteralAssignment_1 ) ) ;
    public final void rule__SkipRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1974:1: ( ( ( rule__SkipRule__LiteralAssignment_1 ) ) )
            // InternalLilyChantParser.g:1975:1: ( ( rule__SkipRule__LiteralAssignment_1 ) )
            {
            // InternalLilyChantParser.g:1975:1: ( ( rule__SkipRule__LiteralAssignment_1 ) )
            // InternalLilyChantParser.g:1976:2: ( rule__SkipRule__LiteralAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipRuleAccess().getLiteralAssignment_1()); 
            }
            // InternalLilyChantParser.g:1977:2: ( rule__SkipRule__LiteralAssignment_1 )
            // InternalLilyChantParser.g:1977:3: rule__SkipRule__LiteralAssignment_1
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
    // InternalLilyChantParser.g:1986:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1990:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalLilyChantParser.g:1991:2: rule__Note__Group__0__Impl rule__Note__Group__1
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
    // InternalLilyChantParser.g:1998:1: rule__Note__Group__0__Impl : ( ( rule__Note__PitchAssignment_0 ) ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2002:1: ( ( ( rule__Note__PitchAssignment_0 ) ) )
            // InternalLilyChantParser.g:2003:1: ( ( rule__Note__PitchAssignment_0 ) )
            {
            // InternalLilyChantParser.g:2003:1: ( ( rule__Note__PitchAssignment_0 ) )
            // InternalLilyChantParser.g:2004:2: ( rule__Note__PitchAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getPitchAssignment_0()); 
            }
            // InternalLilyChantParser.g:2005:2: ( rule__Note__PitchAssignment_0 )
            // InternalLilyChantParser.g:2005:3: rule__Note__PitchAssignment_0
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
    // InternalLilyChantParser.g:2013:1: rule__Note__Group__1 : rule__Note__Group__1__Impl ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2017:1: ( rule__Note__Group__1__Impl )
            // InternalLilyChantParser.g:2018:2: rule__Note__Group__1__Impl
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
    // InternalLilyChantParser.g:2024:1: rule__Note__Group__1__Impl : ( ( rule__Note__DurationAssignment_1 )? ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2028:1: ( ( ( rule__Note__DurationAssignment_1 )? ) )
            // InternalLilyChantParser.g:2029:1: ( ( rule__Note__DurationAssignment_1 )? )
            {
            // InternalLilyChantParser.g:2029:1: ( ( rule__Note__DurationAssignment_1 )? )
            // InternalLilyChantParser.g:2030:2: ( rule__Note__DurationAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getDurationAssignment_1()); 
            }
            // InternalLilyChantParser.g:2031:2: ( rule__Note__DurationAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DURATION) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLilyChantParser.g:2031:3: rule__Note__DurationAssignment_1
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


    // $ANTLR start "rule__Script__TonesAssignment_0"
    // InternalLilyChantParser.g:2040:1: rule__Script__TonesAssignment_0 : ( ruleTone ) ;
    public final void rule__Script__TonesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2044:1: ( ( ruleTone ) )
            // InternalLilyChantParser.g:2045:2: ( ruleTone )
            {
            // InternalLilyChantParser.g:2045:2: ( ruleTone )
            // InternalLilyChantParser.g:2046:3: ruleTone
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
    // InternalLilyChantParser.g:2055:1: rule__Script__ChantsAssignment_1 : ( ruleChant ) ;
    public final void rule__Script__ChantsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2059:1: ( ( ruleChant ) )
            // InternalLilyChantParser.g:2060:2: ( ruleChant )
            {
            // InternalLilyChantParser.g:2060:2: ( ruleChant )
            // InternalLilyChantParser.g:2061:3: ruleChant
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


    // $ANTLR start "rule__Tone__NameAssignment_1"
    // InternalLilyChantParser.g:2070:1: rule__Tone__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tone__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2074:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2075:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:2075:2: ( RULE_ID )
            // InternalLilyChantParser.g:2076:3: RULE_ID
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
    // InternalLilyChantParser.g:2085:1: rule__Tone__VoiceNamesAssignment_5 : ( ruleVoiceName ) ;
    public final void rule__Tone__VoiceNamesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2089:1: ( ( ruleVoiceName ) )
            // InternalLilyChantParser.g:2090:2: ( ruleVoiceName )
            {
            // InternalLilyChantParser.g:2090:2: ( ruleVoiceName )
            // InternalLilyChantParser.g:2091:3: ruleVoiceName
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
    // InternalLilyChantParser.g:2100:1: rule__Tone__PhrasesAssignment_7 : ( ruleTonePhrase ) ;
    public final void rule__Tone__PhrasesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2104:1: ( ( ruleTonePhrase ) )
            // InternalLilyChantParser.g:2105:2: ( ruleTonePhrase )
            {
            // InternalLilyChantParser.g:2105:2: ( ruleTonePhrase )
            // InternalLilyChantParser.g:2106:3: ruleTonePhrase
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
    // InternalLilyChantParser.g:2115:1: rule__VoiceName__NameAssignment : ( RULE_ID ) ;
    public final void rule__VoiceName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2119:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2120:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:2120:2: ( RULE_ID )
            // InternalLilyChantParser.g:2121:3: RULE_ID
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
    // InternalLilyChantParser.g:2130:1: rule__TonePhrase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TonePhrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2134:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2135:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:2135:2: ( RULE_ID )
            // InternalLilyChantParser.g:2136:3: RULE_ID
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
    // InternalLilyChantParser.g:2145:1: rule__TonePhrase__VoicesAssignment_3 : ( ruleVoicePhrase ) ;
    public final void rule__TonePhrase__VoicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2149:1: ( ( ruleVoicePhrase ) )
            // InternalLilyChantParser.g:2150:2: ( ruleVoicePhrase )
            {
            // InternalLilyChantParser.g:2150:2: ( ruleVoicePhrase )
            // InternalLilyChantParser.g:2151:3: ruleVoicePhrase
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
    // InternalLilyChantParser.g:2160:1: rule__VoicePhrase__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VoicePhrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2164:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:2165:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:2165:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2166:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNameVoiceNameCrossReference_1_0()); 
            }
            // InternalLilyChantParser.g:2167:3: ( RULE_ID )
            // InternalLilyChantParser.g:2168:4: RULE_ID
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
    // InternalLilyChantParser.g:2179:1: rule__VoicePhrase__NotesAssignment_3 : ( ruleNote ) ;
    public final void rule__VoicePhrase__NotesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2183:1: ( ( ruleNote ) )
            // InternalLilyChantParser.g:2184:2: ( ruleNote )
            {
            // InternalLilyChantParser.g:2184:2: ( ruleNote )
            // InternalLilyChantParser.g:2185:3: ruleNote
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
    // InternalLilyChantParser.g:2194:1: rule__Chant__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Chant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2198:1: ( ( RULE_STRING ) )
            // InternalLilyChantParser.g:2199:2: ( RULE_STRING )
            {
            // InternalLilyChantParser.g:2199:2: ( RULE_STRING )
            // InternalLilyChantParser.g:2200:3: RULE_STRING
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
    // InternalLilyChantParser.g:2209:1: rule__Chant__ToneAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Chant__ToneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2213:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:2214:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:2214:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2215:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getToneToneCrossReference_3_0()); 
            }
            // InternalLilyChantParser.g:2216:3: ( RULE_ID )
            // InternalLilyChantParser.g:2217:4: RULE_ID
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
    // InternalLilyChantParser.g:2228:1: rule__Chant__PhrasesAssignment_5 : ( ruleLyricPhrase ) ;
    public final void rule__Chant__PhrasesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2232:1: ( ( ruleLyricPhrase ) )
            // InternalLilyChantParser.g:2233:2: ( ruleLyricPhrase )
            {
            // InternalLilyChantParser.g:2233:2: ( ruleLyricPhrase )
            // InternalLilyChantParser.g:2234:3: ruleLyricPhrase
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
    // InternalLilyChantParser.g:2243:1: rule__LyricPhrase__ExplicitPhraseAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__LyricPhrase__ExplicitPhraseAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2247:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:2248:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:2248:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2249:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getExplicitPhraseTonePhraseCrossReference_0_1_0()); 
            }
            // InternalLilyChantParser.g:2250:3: ( RULE_ID )
            // InternalLilyChantParser.g:2251:4: RULE_ID
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
    // InternalLilyChantParser.g:2262:1: rule__LyricPhrase__NoteGroupsAssignment_1 : ( ruleNoteGroup ) ;
    public final void rule__LyricPhrase__NoteGroupsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2266:1: ( ( ruleNoteGroup ) )
            // InternalLilyChantParser.g:2267:2: ( ruleNoteGroup )
            {
            // InternalLilyChantParser.g:2267:2: ( ruleNoteGroup )
            // InternalLilyChantParser.g:2268:3: ruleNoteGroup
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
    // InternalLilyChantParser.g:2277:1: rule__LyricPhrase__BarAssignment_2 : ( ruleBarline ) ;
    public final void rule__LyricPhrase__BarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2281:1: ( ( ruleBarline ) )
            // InternalLilyChantParser.g:2282:2: ( ruleBarline )
            {
            // InternalLilyChantParser.g:2282:2: ( ruleBarline )
            // InternalLilyChantParser.g:2283:3: ruleBarline
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
    // InternalLilyChantParser.g:2292:1: rule__NoteGroup__SyllablesAssignment_0_0_0_0 : ( ruleIdRule ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2296:1: ( ( ruleIdRule ) )
            // InternalLilyChantParser.g:2297:2: ( ruleIdRule )
            {
            // InternalLilyChantParser.g:2297:2: ( ruleIdRule )
            // InternalLilyChantParser.g:2298:3: ruleIdRule
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
    // InternalLilyChantParser.g:2307:1: rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 : ( ruleHyphenRule ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2311:1: ( ( ruleHyphenRule ) )
            // InternalLilyChantParser.g:2312:2: ( ruleHyphenRule )
            {
            // InternalLilyChantParser.g:2312:2: ( ruleHyphenRule )
            // InternalLilyChantParser.g:2313:3: ruleHyphenRule
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
    // InternalLilyChantParser.g:2322:1: rule__NoteGroup__SyllablesAssignment_0_0_1_0 : ( ruleHyphenRule ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2326:1: ( ( ruleHyphenRule ) )
            // InternalLilyChantParser.g:2327:2: ( ruleHyphenRule )
            {
            // InternalLilyChantParser.g:2327:2: ( ruleHyphenRule )
            // InternalLilyChantParser.g:2328:3: ruleHyphenRule
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
    // InternalLilyChantParser.g:2337:1: rule__NoteGroup__SyllablesAssignment_0_0_1_1 : ( ruleIdRule ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2341:1: ( ( ruleIdRule ) )
            // InternalLilyChantParser.g:2342:2: ( ruleIdRule )
            {
            // InternalLilyChantParser.g:2342:2: ( ruleIdRule )
            // InternalLilyChantParser.g:2343:3: ruleIdRule
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
    // InternalLilyChantParser.g:2352:1: rule__NoteGroup__SyllablesAssignment_0_1 : ( ruleExtenderRule ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2356:1: ( ( ruleExtenderRule ) )
            // InternalLilyChantParser.g:2357:2: ( ruleExtenderRule )
            {
            // InternalLilyChantParser.g:2357:2: ( ruleExtenderRule )
            // InternalLilyChantParser.g:2358:3: ruleExtenderRule
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
    // InternalLilyChantParser.g:2367:1: rule__NoteGroup__SyllablesAssignment_1 : ( ruleSkipRule ) ;
    public final void rule__NoteGroup__SyllablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2371:1: ( ( ruleSkipRule ) )
            // InternalLilyChantParser.g:2372:2: ( ruleSkipRule )
            {
            // InternalLilyChantParser.g:2372:2: ( ruleSkipRule )
            // InternalLilyChantParser.g:2373:3: ruleSkipRule
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
    // InternalLilyChantParser.g:2382:1: rule__NoteGroup__NoemphasisAssignment_2_1 : ( ( Solidus ) ) ;
    public final void rule__NoteGroup__NoemphasisAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2386:1: ( ( ( Solidus ) ) )
            // InternalLilyChantParser.g:2387:2: ( ( Solidus ) )
            {
            // InternalLilyChantParser.g:2387:2: ( ( Solidus ) )
            // InternalLilyChantParser.g:2388:3: ( Solidus )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getNoemphasisSolidusKeyword_2_1_0()); 
            }
            // InternalLilyChantParser.g:2389:3: ( Solidus )
            // InternalLilyChantParser.g:2390:4: Solidus
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
    // InternalLilyChantParser.g:2401:1: rule__NoteGroup__SyllablesAssignment_2_2 : ( ( rule__NoteGroup__SyllablesAlternatives_2_2_0 ) ) ;
    public final void rule__NoteGroup__SyllablesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2405:1: ( ( ( rule__NoteGroup__SyllablesAlternatives_2_2_0 ) ) )
            // InternalLilyChantParser.g:2406:2: ( ( rule__NoteGroup__SyllablesAlternatives_2_2_0 ) )
            {
            // InternalLilyChantParser.g:2406:2: ( ( rule__NoteGroup__SyllablesAlternatives_2_2_0 ) )
            // InternalLilyChantParser.g:2407:3: ( rule__NoteGroup__SyllablesAlternatives_2_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_2_2_0()); 
            }
            // InternalLilyChantParser.g:2408:3: ( rule__NoteGroup__SyllablesAlternatives_2_2_0 )
            // InternalLilyChantParser.g:2408:4: rule__NoteGroup__SyllablesAlternatives_2_2_0
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
    // InternalLilyChantParser.g:2416:1: rule__IdRule__EmphasisAssignment_0 : ( ( Asterisk ) ) ;
    public final void rule__IdRule__EmphasisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2420:1: ( ( ( Asterisk ) ) )
            // InternalLilyChantParser.g:2421:2: ( ( Asterisk ) )
            {
            // InternalLilyChantParser.g:2421:2: ( ( Asterisk ) )
            // InternalLilyChantParser.g:2422:3: ( Asterisk )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdRuleAccess().getEmphasisAsteriskKeyword_0_0()); 
            }
            // InternalLilyChantParser.g:2423:3: ( Asterisk )
            // InternalLilyChantParser.g:2424:4: Asterisk
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
    // InternalLilyChantParser.g:2435:1: rule__IdRule__LiteralAssignment_1 : ( RULE_ID ) ;
    public final void rule__IdRule__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2439:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2440:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:2440:2: ( RULE_ID )
            // InternalLilyChantParser.g:2441:3: RULE_ID
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
    // InternalLilyChantParser.g:2450:1: rule__HyphenRule__LiteralAssignment_1 : ( ( HyphenMinusHyphenMinus ) ) ;
    public final void rule__HyphenRule__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2454:1: ( ( ( HyphenMinusHyphenMinus ) ) )
            // InternalLilyChantParser.g:2455:2: ( ( HyphenMinusHyphenMinus ) )
            {
            // InternalLilyChantParser.g:2455:2: ( ( HyphenMinusHyphenMinus ) )
            // InternalLilyChantParser.g:2456:3: ( HyphenMinusHyphenMinus )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHyphenRuleAccess().getLiteralHyphenMinusHyphenMinusKeyword_1_0()); 
            }
            // InternalLilyChantParser.g:2457:3: ( HyphenMinusHyphenMinus )
            // InternalLilyChantParser.g:2458:4: HyphenMinusHyphenMinus
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
    // InternalLilyChantParser.g:2469:1: rule__ExtenderRule__LiteralAssignment_1 : ( ( KW___ ) ) ;
    public final void rule__ExtenderRule__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2473:1: ( ( ( KW___ ) ) )
            // InternalLilyChantParser.g:2474:2: ( ( KW___ ) )
            {
            // InternalLilyChantParser.g:2474:2: ( ( KW___ ) )
            // InternalLilyChantParser.g:2475:3: ( KW___ )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtenderRuleAccess().getLiteral__Keyword_1_0()); 
            }
            // InternalLilyChantParser.g:2476:3: ( KW___ )
            // InternalLilyChantParser.g:2477:4: KW___
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
    // InternalLilyChantParser.g:2488:1: rule__SkipRule__LiteralAssignment_1 : ( ( KW__ ) ) ;
    public final void rule__SkipRule__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2492:1: ( ( ( KW__ ) ) )
            // InternalLilyChantParser.g:2493:2: ( ( KW__ ) )
            {
            // InternalLilyChantParser.g:2493:2: ( ( KW__ ) )
            // InternalLilyChantParser.g:2494:3: ( KW__ )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipRuleAccess().getLiteral_Keyword_1_0()); 
            }
            // InternalLilyChantParser.g:2495:3: ( KW__ )
            // InternalLilyChantParser.g:2496:4: KW__
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
    // InternalLilyChantParser.g:2507:1: rule__Note__PitchAssignment_0 : ( RULE_ID ) ;
    public final void rule__Note__PitchAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2511:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2512:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:2512:2: ( RULE_ID )
            // InternalLilyChantParser.g:2513:3: RULE_ID
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
    // InternalLilyChantParser.g:2522:1: rule__Note__DurationAssignment_1 : ( RULE_DURATION ) ;
    public final void rule__Note__DurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2526:1: ( ( RULE_DURATION ) )
            // InternalLilyChantParser.g:2527:2: ( RULE_DURATION )
            {
            // InternalLilyChantParser.g:2527:2: ( RULE_DURATION )
            // InternalLilyChantParser.g:2528:3: RULE_DURATION
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

    // $ANTLR start synpred18_InternalLilyChantParser
    public final void synpred18_InternalLilyChantParser_fragment() throws RecognitionException {   
        // InternalLilyChantParser.g:1565:3: ( rule__NoteGroup__Group_0_0_0_1__0 )
        // InternalLilyChantParser.g:1565:3: rule__NoteGroup__Group_0_0_0_1__0
        {
        pushFollow(FOLLOW_2);
        rule__NoteGroup__Group_0_0_0_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalLilyChantParser

    // Delegated rules

    public final boolean synpred18_InternalLilyChantParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalLilyChantParser_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000255200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000255202L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000044200L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000004C600L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000004C602L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000100000L});

}