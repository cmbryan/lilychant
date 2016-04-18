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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Phrase", "Voices", "Chant", "Voice", "Tone", "Key", "RULE_ID", "RULE_DURATION", "RULE_HYPHEN", "RULE_EXTENDER", "RULE_START_NOTE_GROUP", "RULE_END_NOTE_GROUP", "RULE_BEGIN", "RULE_END", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DURATION=11;
    public static final int RULE_ID=10;
    public static final int RULE_HYPHEN=12;
    public static final int Key=9;
    public static final int Voice=7;
    public static final int RULE_END=17;
    public static final int RULE_BEGIN=16;
    public static final int RULE_END_NOTE_GROUP=15;
    public static final int Tone=8;
    public static final int RULE_ANY_OTHER=21;
    public static final int Phrase=4;
    public static final int Voices=5;
    public static final int RULE_EXTENDER=13;
    public static final int Chant=6;
    public static final int RULE_WS=20;
    public static final int RULE_SL_COMMENT=19;
    public static final int EOF=-1;
    public static final int RULE_START_NOTE_GROUP=14;
    public static final int RULE_ML_COMMENT=18;

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
    		tokenNameToValue.put("Key", "'key'");
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
    // InternalLilyChantParser.g:62:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:63:1: ( ruleScript EOF )
            // InternalLilyChantParser.g:64:1: ruleScript EOF
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
    // InternalLilyChantParser.g:71:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:75:2: ( ( ( rule__Script__Group__0 ) ) )
            // InternalLilyChantParser.g:76:2: ( ( rule__Script__Group__0 ) )
            {
            // InternalLilyChantParser.g:76:2: ( ( rule__Script__Group__0 ) )
            // InternalLilyChantParser.g:77:3: ( rule__Script__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:78:3: ( rule__Script__Group__0 )
            // InternalLilyChantParser.g:78:4: rule__Script__Group__0
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
    // InternalLilyChantParser.g:87:1: entryRuleTone : ruleTone EOF ;
    public final void entryRuleTone() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:88:1: ( ruleTone EOF )
            // InternalLilyChantParser.g:89:1: ruleTone EOF
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
    // InternalLilyChantParser.g:96:1: ruleTone : ( ( rule__Tone__Group__0 ) ) ;
    public final void ruleTone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:100:2: ( ( ( rule__Tone__Group__0 ) ) )
            // InternalLilyChantParser.g:101:2: ( ( rule__Tone__Group__0 ) )
            {
            // InternalLilyChantParser.g:101:2: ( ( rule__Tone__Group__0 ) )
            // InternalLilyChantParser.g:102:3: ( rule__Tone__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:103:3: ( rule__Tone__Group__0 )
            // InternalLilyChantParser.g:103:4: rule__Tone__Group__0
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
    // InternalLilyChantParser.g:112:1: entryRuleVoiceName : ruleVoiceName EOF ;
    public final void entryRuleVoiceName() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:113:1: ( ruleVoiceName EOF )
            // InternalLilyChantParser.g:114:1: ruleVoiceName EOF
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
    // InternalLilyChantParser.g:121:1: ruleVoiceName : ( ( rule__VoiceName__NameAssignment ) ) ;
    public final void ruleVoiceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:125:2: ( ( ( rule__VoiceName__NameAssignment ) ) )
            // InternalLilyChantParser.g:126:2: ( ( rule__VoiceName__NameAssignment ) )
            {
            // InternalLilyChantParser.g:126:2: ( ( rule__VoiceName__NameAssignment ) )
            // InternalLilyChantParser.g:127:3: ( rule__VoiceName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoiceNameAccess().getNameAssignment()); 
            }
            // InternalLilyChantParser.g:128:3: ( rule__VoiceName__NameAssignment )
            // InternalLilyChantParser.g:128:4: rule__VoiceName__NameAssignment
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
    // InternalLilyChantParser.g:137:1: entryRuleTonePhrase : ruleTonePhrase EOF ;
    public final void entryRuleTonePhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:138:1: ( ruleTonePhrase EOF )
            // InternalLilyChantParser.g:139:1: ruleTonePhrase EOF
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
    // InternalLilyChantParser.g:146:1: ruleTonePhrase : ( ( rule__TonePhrase__Group__0 ) ) ;
    public final void ruleTonePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:150:2: ( ( ( rule__TonePhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:151:2: ( ( rule__TonePhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:151:2: ( ( rule__TonePhrase__Group__0 ) )
            // InternalLilyChantParser.g:152:3: ( rule__TonePhrase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:153:3: ( rule__TonePhrase__Group__0 )
            // InternalLilyChantParser.g:153:4: rule__TonePhrase__Group__0
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
    // InternalLilyChantParser.g:162:1: entryRuleVoicePhrase : ruleVoicePhrase EOF ;
    public final void entryRuleVoicePhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:163:1: ( ruleVoicePhrase EOF )
            // InternalLilyChantParser.g:164:1: ruleVoicePhrase EOF
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
    // InternalLilyChantParser.g:171:1: ruleVoicePhrase : ( ( rule__VoicePhrase__Group__0 ) ) ;
    public final void ruleVoicePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:175:2: ( ( ( rule__VoicePhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:176:2: ( ( rule__VoicePhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:176:2: ( ( rule__VoicePhrase__Group__0 ) )
            // InternalLilyChantParser.g:177:3: ( rule__VoicePhrase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:178:3: ( rule__VoicePhrase__Group__0 )
            // InternalLilyChantParser.g:178:4: rule__VoicePhrase__Group__0
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
    // InternalLilyChantParser.g:187:1: entryRuleChant : ruleChant EOF ;
    public final void entryRuleChant() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:188:1: ( ruleChant EOF )
            // InternalLilyChantParser.g:189:1: ruleChant EOF
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
    // InternalLilyChantParser.g:196:1: ruleChant : ( ( rule__Chant__Group__0 ) ) ;
    public final void ruleChant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:200:2: ( ( ( rule__Chant__Group__0 ) ) )
            // InternalLilyChantParser.g:201:2: ( ( rule__Chant__Group__0 ) )
            {
            // InternalLilyChantParser.g:201:2: ( ( rule__Chant__Group__0 ) )
            // InternalLilyChantParser.g:202:3: ( rule__Chant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:203:3: ( rule__Chant__Group__0 )
            // InternalLilyChantParser.g:203:4: rule__Chant__Group__0
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
    // InternalLilyChantParser.g:212:1: entryRuleLyricPhrase : ruleLyricPhrase EOF ;
    public final void entryRuleLyricPhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:213:1: ( ruleLyricPhrase EOF )
            // InternalLilyChantParser.g:214:1: ruleLyricPhrase EOF
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
    // InternalLilyChantParser.g:221:1: ruleLyricPhrase : ( ( rule__LyricPhrase__Group__0 ) ) ;
    public final void ruleLyricPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:225:2: ( ( ( rule__LyricPhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:226:2: ( ( rule__LyricPhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:226:2: ( ( rule__LyricPhrase__Group__0 ) )
            // InternalLilyChantParser.g:227:3: ( rule__LyricPhrase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:228:3: ( rule__LyricPhrase__Group__0 )
            // InternalLilyChantParser.g:228:4: rule__LyricPhrase__Group__0
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
    // InternalLilyChantParser.g:237:1: entryRuleNoteGroup : ruleNoteGroup EOF ;
    public final void entryRuleNoteGroup() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:238:1: ( ruleNoteGroup EOF )
            // InternalLilyChantParser.g:239:1: ruleNoteGroup EOF
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
    // InternalLilyChantParser.g:246:1: ruleNoteGroup : ( ( rule__NoteGroup__Alternatives ) ) ;
    public final void ruleNoteGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:250:2: ( ( ( rule__NoteGroup__Alternatives ) ) )
            // InternalLilyChantParser.g:251:2: ( ( rule__NoteGroup__Alternatives ) )
            {
            // InternalLilyChantParser.g:251:2: ( ( rule__NoteGroup__Alternatives ) )
            // InternalLilyChantParser.g:252:3: ( rule__NoteGroup__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getAlternatives()); 
            }
            // InternalLilyChantParser.g:253:3: ( rule__NoteGroup__Alternatives )
            // InternalLilyChantParser.g:253:4: rule__NoteGroup__Alternatives
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


    // $ANTLR start "entryRuleNote"
    // InternalLilyChantParser.g:262:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:263:1: ( ruleNote EOF )
            // InternalLilyChantParser.g:264:1: ruleNote EOF
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
    // InternalLilyChantParser.g:271:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:275:2: ( ( ( rule__Note__Group__0 ) ) )
            // InternalLilyChantParser.g:276:2: ( ( rule__Note__Group__0 ) )
            {
            // InternalLilyChantParser.g:276:2: ( ( rule__Note__Group__0 ) )
            // InternalLilyChantParser.g:277:3: ( rule__Note__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:278:3: ( rule__Note__Group__0 )
            // InternalLilyChantParser.g:278:4: rule__Note__Group__0
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


    // $ANTLR start "rule__NoteGroup__Alternatives"
    // InternalLilyChantParser.g:286:1: rule__NoteGroup__Alternatives : ( ( ( rule__NoteGroup__Group_0__0 ) ) | ( ( rule__NoteGroup__Group_1__0 ) ) );
    public final void rule__NoteGroup__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:290:1: ( ( ( rule__NoteGroup__Group_0__0 ) ) | ( ( rule__NoteGroup__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||LA1_0==RULE_HYPHEN) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_START_NOTE_GROUP) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalLilyChantParser.g:291:2: ( ( rule__NoteGroup__Group_0__0 ) )
                    {
                    // InternalLilyChantParser.g:291:2: ( ( rule__NoteGroup__Group_0__0 ) )
                    // InternalLilyChantParser.g:292:3: ( rule__NoteGroup__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_0()); 
                    }
                    // InternalLilyChantParser.g:293:3: ( rule__NoteGroup__Group_0__0 )
                    // InternalLilyChantParser.g:293:4: rule__NoteGroup__Group_0__0
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
                    // InternalLilyChantParser.g:297:2: ( ( rule__NoteGroup__Group_1__0 ) )
                    {
                    // InternalLilyChantParser.g:297:2: ( ( rule__NoteGroup__Group_1__0 ) )
                    // InternalLilyChantParser.g:298:3: ( rule__NoteGroup__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_1()); 
                    }
                    // InternalLilyChantParser.g:299:3: ( rule__NoteGroup__Group_1__0 )
                    // InternalLilyChantParser.g:299:4: rule__NoteGroup__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NoteGroup__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNoteGroupAccess().getGroup_1()); 
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
    // InternalLilyChantParser.g:307:1: rule__NoteGroup__Alternatives_0_0 : ( ( ( rule__NoteGroup__Group_0_0_0__0 ) ) | ( ( rule__NoteGroup__Group_0_0_1__0 ) ) );
    public final void rule__NoteGroup__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:311:1: ( ( ( rule__NoteGroup__Group_0_0_0__0 ) ) | ( ( rule__NoteGroup__Group_0_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_HYPHEN) ) {
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
                    // InternalLilyChantParser.g:312:2: ( ( rule__NoteGroup__Group_0_0_0__0 ) )
                    {
                    // InternalLilyChantParser.g:312:2: ( ( rule__NoteGroup__Group_0_0_0__0 ) )
                    // InternalLilyChantParser.g:313:3: ( rule__NoteGroup__Group_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_0_0_0()); 
                    }
                    // InternalLilyChantParser.g:314:3: ( rule__NoteGroup__Group_0_0_0__0 )
                    // InternalLilyChantParser.g:314:4: rule__NoteGroup__Group_0_0_0__0
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
                    // InternalLilyChantParser.g:318:2: ( ( rule__NoteGroup__Group_0_0_1__0 ) )
                    {
                    // InternalLilyChantParser.g:318:2: ( ( rule__NoteGroup__Group_0_0_1__0 ) )
                    // InternalLilyChantParser.g:319:3: ( rule__NoteGroup__Group_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_0_0_1()); 
                    }
                    // InternalLilyChantParser.g:320:3: ( rule__NoteGroup__Group_0_0_1__0 )
                    // InternalLilyChantParser.g:320:4: rule__NoteGroup__Group_0_0_1__0
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


    // $ANTLR start "rule__NoteGroup__SyllablesAlternatives_1_1_0"
    // InternalLilyChantParser.g:328:1: rule__NoteGroup__SyllablesAlternatives_1_1_0 : ( ( RULE_ID ) | ( RULE_HYPHEN ) );
    public final void rule__NoteGroup__SyllablesAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:332:1: ( ( RULE_ID ) | ( RULE_HYPHEN ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_HYPHEN) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLilyChantParser.g:333:2: ( RULE_ID )
                    {
                    // InternalLilyChantParser.g:333:2: ( RULE_ID )
                    // InternalLilyChantParser.g:334:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_1_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLilyChantParser.g:339:2: ( RULE_HYPHEN )
                    {
                    // InternalLilyChantParser.g:339:2: ( RULE_HYPHEN )
                    // InternalLilyChantParser.g:340:3: RULE_HYPHEN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_1_1_0_1()); 
                    }
                    match(input,RULE_HYPHEN,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_1_1_0_1()); 
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
    // $ANTLR end "rule__NoteGroup__SyllablesAlternatives_1_1_0"


    // $ANTLR start "rule__Script__Group__0"
    // InternalLilyChantParser.g:349:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:353:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // InternalLilyChantParser.g:354:2: rule__Script__Group__0__Impl rule__Script__Group__1
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
    // InternalLilyChantParser.g:361:1: rule__Script__Group__0__Impl : ( ( rule__Script__TonesAssignment_0 )* ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:365:1: ( ( ( rule__Script__TonesAssignment_0 )* ) )
            // InternalLilyChantParser.g:366:1: ( ( rule__Script__TonesAssignment_0 )* )
            {
            // InternalLilyChantParser.g:366:1: ( ( rule__Script__TonesAssignment_0 )* )
            // InternalLilyChantParser.g:367:2: ( rule__Script__TonesAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getTonesAssignment_0()); 
            }
            // InternalLilyChantParser.g:368:2: ( rule__Script__TonesAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Tone) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLilyChantParser.g:368:3: rule__Script__TonesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Script__TonesAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalLilyChantParser.g:376:1: rule__Script__Group__1 : rule__Script__Group__1__Impl ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:380:1: ( rule__Script__Group__1__Impl )
            // InternalLilyChantParser.g:381:2: rule__Script__Group__1__Impl
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
    // InternalLilyChantParser.g:387:1: rule__Script__Group__1__Impl : ( ( rule__Script__ChantsAssignment_1 )* ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:391:1: ( ( ( rule__Script__ChantsAssignment_1 )* ) )
            // InternalLilyChantParser.g:392:1: ( ( rule__Script__ChantsAssignment_1 )* )
            {
            // InternalLilyChantParser.g:392:1: ( ( rule__Script__ChantsAssignment_1 )* )
            // InternalLilyChantParser.g:393:2: ( rule__Script__ChantsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getChantsAssignment_1()); 
            }
            // InternalLilyChantParser.g:394:2: ( rule__Script__ChantsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Chant) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLilyChantParser.g:394:3: rule__Script__ChantsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Script__ChantsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalLilyChantParser.g:403:1: rule__Tone__Group__0 : rule__Tone__Group__0__Impl rule__Tone__Group__1 ;
    public final void rule__Tone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:407:1: ( rule__Tone__Group__0__Impl rule__Tone__Group__1 )
            // InternalLilyChantParser.g:408:2: rule__Tone__Group__0__Impl rule__Tone__Group__1
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
    // InternalLilyChantParser.g:415:1: rule__Tone__Group__0__Impl : ( Tone ) ;
    public final void rule__Tone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:419:1: ( ( Tone ) )
            // InternalLilyChantParser.g:420:1: ( Tone )
            {
            // InternalLilyChantParser.g:420:1: ( Tone )
            // InternalLilyChantParser.g:421:2: Tone
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
    // InternalLilyChantParser.g:430:1: rule__Tone__Group__1 : rule__Tone__Group__1__Impl rule__Tone__Group__2 ;
    public final void rule__Tone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:434:1: ( rule__Tone__Group__1__Impl rule__Tone__Group__2 )
            // InternalLilyChantParser.g:435:2: rule__Tone__Group__1__Impl rule__Tone__Group__2
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
    // InternalLilyChantParser.g:442:1: rule__Tone__Group__1__Impl : ( ( rule__Tone__NameAssignment_1 ) ) ;
    public final void rule__Tone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:446:1: ( ( ( rule__Tone__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:447:1: ( ( rule__Tone__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:447:1: ( ( rule__Tone__NameAssignment_1 ) )
            // InternalLilyChantParser.g:448:2: ( rule__Tone__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:449:2: ( rule__Tone__NameAssignment_1 )
            // InternalLilyChantParser.g:449:3: rule__Tone__NameAssignment_1
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
    // InternalLilyChantParser.g:457:1: rule__Tone__Group__2 : rule__Tone__Group__2__Impl rule__Tone__Group__3 ;
    public final void rule__Tone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:461:1: ( rule__Tone__Group__2__Impl rule__Tone__Group__3 )
            // InternalLilyChantParser.g:462:2: rule__Tone__Group__2__Impl rule__Tone__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalLilyChantParser.g:469:1: rule__Tone__Group__2__Impl : ( Key ) ;
    public final void rule__Tone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:473:1: ( ( Key ) )
            // InternalLilyChantParser.g:474:1: ( Key )
            {
            // InternalLilyChantParser.g:474:1: ( Key )
            // InternalLilyChantParser.g:475:2: Key
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getKeyKeyword_2()); 
            }
            match(input,Key,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getKeyKeyword_2()); 
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
    // InternalLilyChantParser.g:484:1: rule__Tone__Group__3 : rule__Tone__Group__3__Impl rule__Tone__Group__4 ;
    public final void rule__Tone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:488:1: ( rule__Tone__Group__3__Impl rule__Tone__Group__4 )
            // InternalLilyChantParser.g:489:2: rule__Tone__Group__3__Impl rule__Tone__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalLilyChantParser.g:496:1: rule__Tone__Group__3__Impl : ( ( rule__Tone__KeyAssignment_3 ) ) ;
    public final void rule__Tone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:500:1: ( ( ( rule__Tone__KeyAssignment_3 ) ) )
            // InternalLilyChantParser.g:501:1: ( ( rule__Tone__KeyAssignment_3 ) )
            {
            // InternalLilyChantParser.g:501:1: ( ( rule__Tone__KeyAssignment_3 ) )
            // InternalLilyChantParser.g:502:2: ( rule__Tone__KeyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getKeyAssignment_3()); 
            }
            // InternalLilyChantParser.g:503:2: ( rule__Tone__KeyAssignment_3 )
            // InternalLilyChantParser.g:503:3: rule__Tone__KeyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Tone__KeyAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getKeyAssignment_3()); 
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
    // InternalLilyChantParser.g:511:1: rule__Tone__Group__4 : rule__Tone__Group__4__Impl rule__Tone__Group__5 ;
    public final void rule__Tone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:515:1: ( rule__Tone__Group__4__Impl rule__Tone__Group__5 )
            // InternalLilyChantParser.g:516:2: rule__Tone__Group__4__Impl rule__Tone__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalLilyChantParser.g:523:1: rule__Tone__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__Tone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:527:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:528:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:528:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:529:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:538:1: rule__Tone__Group__5 : rule__Tone__Group__5__Impl rule__Tone__Group__6 ;
    public final void rule__Tone__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:542:1: ( rule__Tone__Group__5__Impl rule__Tone__Group__6 )
            // InternalLilyChantParser.g:543:2: rule__Tone__Group__5__Impl rule__Tone__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalLilyChantParser.g:550:1: rule__Tone__Group__5__Impl : ( Voices ) ;
    public final void rule__Tone__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:554:1: ( ( Voices ) )
            // InternalLilyChantParser.g:555:1: ( Voices )
            {
            // InternalLilyChantParser.g:555:1: ( Voices )
            // InternalLilyChantParser.g:556:2: Voices
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getVoicesKeyword_5()); 
            }
            match(input,Voices,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getVoicesKeyword_5()); 
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
    // InternalLilyChantParser.g:565:1: rule__Tone__Group__6 : rule__Tone__Group__6__Impl rule__Tone__Group__7 ;
    public final void rule__Tone__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:569:1: ( rule__Tone__Group__6__Impl rule__Tone__Group__7 )
            // InternalLilyChantParser.g:570:2: rule__Tone__Group__6__Impl rule__Tone__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalLilyChantParser.g:577:1: rule__Tone__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__Tone__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:581:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:582:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:582:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:583:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getBEGINTerminalRuleCall_6()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getBEGINTerminalRuleCall_6()); 
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
    // InternalLilyChantParser.g:592:1: rule__Tone__Group__7 : rule__Tone__Group__7__Impl rule__Tone__Group__8 ;
    public final void rule__Tone__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:596:1: ( rule__Tone__Group__7__Impl rule__Tone__Group__8 )
            // InternalLilyChantParser.g:597:2: rule__Tone__Group__7__Impl rule__Tone__Group__8
            {
            pushFollow(FOLLOW_10);
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
    // InternalLilyChantParser.g:604:1: rule__Tone__Group__7__Impl : ( ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* ) ) ;
    public final void rule__Tone__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:608:1: ( ( ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* ) ) )
            // InternalLilyChantParser.g:609:1: ( ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* ) )
            {
            // InternalLilyChantParser.g:609:1: ( ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* ) )
            // InternalLilyChantParser.g:610:2: ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* )
            {
            // InternalLilyChantParser.g:610:2: ( ( rule__Tone__VoiceNamesAssignment_7 ) )
            // InternalLilyChantParser.g:611:3: ( rule__Tone__VoiceNamesAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getVoiceNamesAssignment_7()); 
            }
            // InternalLilyChantParser.g:612:3: ( rule__Tone__VoiceNamesAssignment_7 )
            // InternalLilyChantParser.g:612:4: rule__Tone__VoiceNamesAssignment_7
            {
            pushFollow(FOLLOW_11);
            rule__Tone__VoiceNamesAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getVoiceNamesAssignment_7()); 
            }

            }

            // InternalLilyChantParser.g:615:2: ( ( rule__Tone__VoiceNamesAssignment_7 )* )
            // InternalLilyChantParser.g:616:3: ( rule__Tone__VoiceNamesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getVoiceNamesAssignment_7()); 
            }
            // InternalLilyChantParser.g:617:3: ( rule__Tone__VoiceNamesAssignment_7 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLilyChantParser.g:617:4: rule__Tone__VoiceNamesAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Tone__VoiceNamesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getVoiceNamesAssignment_7()); 
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
    // InternalLilyChantParser.g:626:1: rule__Tone__Group__8 : rule__Tone__Group__8__Impl rule__Tone__Group__9 ;
    public final void rule__Tone__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:630:1: ( rule__Tone__Group__8__Impl rule__Tone__Group__9 )
            // InternalLilyChantParser.g:631:2: rule__Tone__Group__8__Impl rule__Tone__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Tone__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tone__Group__9();

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
    // InternalLilyChantParser.g:638:1: rule__Tone__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Tone__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:642:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:643:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:643:1: ( RULE_END )
            // InternalLilyChantParser.g:644:2: RULE_END
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


    // $ANTLR start "rule__Tone__Group__9"
    // InternalLilyChantParser.g:653:1: rule__Tone__Group__9 : rule__Tone__Group__9__Impl rule__Tone__Group__10 ;
    public final void rule__Tone__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:657:1: ( rule__Tone__Group__9__Impl rule__Tone__Group__10 )
            // InternalLilyChantParser.g:658:2: rule__Tone__Group__9__Impl rule__Tone__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Tone__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tone__Group__10();

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
    // $ANTLR end "rule__Tone__Group__9"


    // $ANTLR start "rule__Tone__Group__9__Impl"
    // InternalLilyChantParser.g:665:1: rule__Tone__Group__9__Impl : ( ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* ) ) ;
    public final void rule__Tone__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:669:1: ( ( ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* ) ) )
            // InternalLilyChantParser.g:670:1: ( ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* ) )
            {
            // InternalLilyChantParser.g:670:1: ( ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* ) )
            // InternalLilyChantParser.g:671:2: ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* )
            {
            // InternalLilyChantParser.g:671:2: ( ( rule__Tone__PhrasesAssignment_9 ) )
            // InternalLilyChantParser.g:672:3: ( rule__Tone__PhrasesAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getPhrasesAssignment_9()); 
            }
            // InternalLilyChantParser.g:673:3: ( rule__Tone__PhrasesAssignment_9 )
            // InternalLilyChantParser.g:673:4: rule__Tone__PhrasesAssignment_9
            {
            pushFollow(FOLLOW_13);
            rule__Tone__PhrasesAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getPhrasesAssignment_9()); 
            }

            }

            // InternalLilyChantParser.g:676:2: ( ( rule__Tone__PhrasesAssignment_9 )* )
            // InternalLilyChantParser.g:677:3: ( rule__Tone__PhrasesAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getPhrasesAssignment_9()); 
            }
            // InternalLilyChantParser.g:678:3: ( rule__Tone__PhrasesAssignment_9 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Phrase) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLilyChantParser.g:678:4: rule__Tone__PhrasesAssignment_9
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Tone__PhrasesAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getPhrasesAssignment_9()); 
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
    // $ANTLR end "rule__Tone__Group__9__Impl"


    // $ANTLR start "rule__Tone__Group__10"
    // InternalLilyChantParser.g:687:1: rule__Tone__Group__10 : rule__Tone__Group__10__Impl ;
    public final void rule__Tone__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:691:1: ( rule__Tone__Group__10__Impl )
            // InternalLilyChantParser.g:692:2: rule__Tone__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tone__Group__10__Impl();

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
    // $ANTLR end "rule__Tone__Group__10"


    // $ANTLR start "rule__Tone__Group__10__Impl"
    // InternalLilyChantParser.g:698:1: rule__Tone__Group__10__Impl : ( RULE_END ) ;
    public final void rule__Tone__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:702:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:703:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:703:1: ( RULE_END )
            // InternalLilyChantParser.g:704:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getENDTerminalRuleCall_10()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getENDTerminalRuleCall_10()); 
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
    // $ANTLR end "rule__Tone__Group__10__Impl"


    // $ANTLR start "rule__TonePhrase__Group__0"
    // InternalLilyChantParser.g:714:1: rule__TonePhrase__Group__0 : rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1 ;
    public final void rule__TonePhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:718:1: ( rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1 )
            // InternalLilyChantParser.g:719:2: rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1
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
    // InternalLilyChantParser.g:726:1: rule__TonePhrase__Group__0__Impl : ( Phrase ) ;
    public final void rule__TonePhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:730:1: ( ( Phrase ) )
            // InternalLilyChantParser.g:731:1: ( Phrase )
            {
            // InternalLilyChantParser.g:731:1: ( Phrase )
            // InternalLilyChantParser.g:732:2: Phrase
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
    // InternalLilyChantParser.g:741:1: rule__TonePhrase__Group__1 : rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2 ;
    public final void rule__TonePhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:745:1: ( rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2 )
            // InternalLilyChantParser.g:746:2: rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalLilyChantParser.g:753:1: rule__TonePhrase__Group__1__Impl : ( ( rule__TonePhrase__NameAssignment_1 ) ) ;
    public final void rule__TonePhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:757:1: ( ( ( rule__TonePhrase__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:758:1: ( ( rule__TonePhrase__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:758:1: ( ( rule__TonePhrase__NameAssignment_1 ) )
            // InternalLilyChantParser.g:759:2: ( rule__TonePhrase__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:760:2: ( rule__TonePhrase__NameAssignment_1 )
            // InternalLilyChantParser.g:760:3: rule__TonePhrase__NameAssignment_1
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
    // InternalLilyChantParser.g:768:1: rule__TonePhrase__Group__2 : rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3 ;
    public final void rule__TonePhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:772:1: ( rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3 )
            // InternalLilyChantParser.g:773:2: rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalLilyChantParser.g:780:1: rule__TonePhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__TonePhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:784:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:785:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:785:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:786:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:795:1: rule__TonePhrase__Group__3 : rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4 ;
    public final void rule__TonePhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:799:1: ( rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4 )
            // InternalLilyChantParser.g:800:2: rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalLilyChantParser.g:807:1: rule__TonePhrase__Group__3__Impl : ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) ) ;
    public final void rule__TonePhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:811:1: ( ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:812:1: ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:812:1: ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) )
            // InternalLilyChantParser.g:813:2: ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* )
            {
            // InternalLilyChantParser.g:813:2: ( ( rule__TonePhrase__VoicesAssignment_3 ) )
            // InternalLilyChantParser.g:814:3: ( rule__TonePhrase__VoicesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            }
            // InternalLilyChantParser.g:815:3: ( rule__TonePhrase__VoicesAssignment_3 )
            // InternalLilyChantParser.g:815:4: rule__TonePhrase__VoicesAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__TonePhrase__VoicesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            }

            }

            // InternalLilyChantParser.g:818:2: ( ( rule__TonePhrase__VoicesAssignment_3 )* )
            // InternalLilyChantParser.g:819:3: ( rule__TonePhrase__VoicesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            }
            // InternalLilyChantParser.g:820:3: ( rule__TonePhrase__VoicesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Voice) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLilyChantParser.g:820:4: rule__TonePhrase__VoicesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TonePhrase__VoicesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalLilyChantParser.g:829:1: rule__TonePhrase__Group__4 : rule__TonePhrase__Group__4__Impl ;
    public final void rule__TonePhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:833:1: ( rule__TonePhrase__Group__4__Impl )
            // InternalLilyChantParser.g:834:2: rule__TonePhrase__Group__4__Impl
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
    // InternalLilyChantParser.g:840:1: rule__TonePhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__TonePhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:844:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:845:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:845:1: ( RULE_END )
            // InternalLilyChantParser.g:846:2: RULE_END
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
    // InternalLilyChantParser.g:856:1: rule__VoicePhrase__Group__0 : rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1 ;
    public final void rule__VoicePhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:860:1: ( rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1 )
            // InternalLilyChantParser.g:861:2: rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1
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
    // InternalLilyChantParser.g:868:1: rule__VoicePhrase__Group__0__Impl : ( Voice ) ;
    public final void rule__VoicePhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:872:1: ( ( Voice ) )
            // InternalLilyChantParser.g:873:1: ( Voice )
            {
            // InternalLilyChantParser.g:873:1: ( Voice )
            // InternalLilyChantParser.g:874:2: Voice
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
    // InternalLilyChantParser.g:883:1: rule__VoicePhrase__Group__1 : rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2 ;
    public final void rule__VoicePhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:887:1: ( rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2 )
            // InternalLilyChantParser.g:888:2: rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalLilyChantParser.g:895:1: rule__VoicePhrase__Group__1__Impl : ( ( rule__VoicePhrase__NameAssignment_1 ) ) ;
    public final void rule__VoicePhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:899:1: ( ( ( rule__VoicePhrase__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:900:1: ( ( rule__VoicePhrase__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:900:1: ( ( rule__VoicePhrase__NameAssignment_1 ) )
            // InternalLilyChantParser.g:901:2: ( rule__VoicePhrase__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:902:2: ( rule__VoicePhrase__NameAssignment_1 )
            // InternalLilyChantParser.g:902:3: rule__VoicePhrase__NameAssignment_1
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
    // InternalLilyChantParser.g:910:1: rule__VoicePhrase__Group__2 : rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3 ;
    public final void rule__VoicePhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:914:1: ( rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3 )
            // InternalLilyChantParser.g:915:2: rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3
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
    // InternalLilyChantParser.g:922:1: rule__VoicePhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__VoicePhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:926:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:927:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:927:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:928:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:937:1: rule__VoicePhrase__Group__3 : rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4 ;
    public final void rule__VoicePhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:941:1: ( rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4 )
            // InternalLilyChantParser.g:942:2: rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalLilyChantParser.g:949:1: rule__VoicePhrase__Group__3__Impl : ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) ) ;
    public final void rule__VoicePhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:953:1: ( ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:954:1: ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:954:1: ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) )
            // InternalLilyChantParser.g:955:2: ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* )
            {
            // InternalLilyChantParser.g:955:2: ( ( rule__VoicePhrase__NotesAssignment_3 ) )
            // InternalLilyChantParser.g:956:3: ( rule__VoicePhrase__NotesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            }
            // InternalLilyChantParser.g:957:3: ( rule__VoicePhrase__NotesAssignment_3 )
            // InternalLilyChantParser.g:957:4: rule__VoicePhrase__NotesAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__VoicePhrase__NotesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            }

            }

            // InternalLilyChantParser.g:960:2: ( ( rule__VoicePhrase__NotesAssignment_3 )* )
            // InternalLilyChantParser.g:961:3: ( rule__VoicePhrase__NotesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            }
            // InternalLilyChantParser.g:962:3: ( rule__VoicePhrase__NotesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLilyChantParser.g:962:4: rule__VoicePhrase__NotesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__VoicePhrase__NotesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalLilyChantParser.g:971:1: rule__VoicePhrase__Group__4 : rule__VoicePhrase__Group__4__Impl ;
    public final void rule__VoicePhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:975:1: ( rule__VoicePhrase__Group__4__Impl )
            // InternalLilyChantParser.g:976:2: rule__VoicePhrase__Group__4__Impl
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
    // InternalLilyChantParser.g:982:1: rule__VoicePhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__VoicePhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:986:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:987:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:987:1: ( RULE_END )
            // InternalLilyChantParser.g:988:2: RULE_END
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
    // InternalLilyChantParser.g:998:1: rule__Chant__Group__0 : rule__Chant__Group__0__Impl rule__Chant__Group__1 ;
    public final void rule__Chant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1002:1: ( rule__Chant__Group__0__Impl rule__Chant__Group__1 )
            // InternalLilyChantParser.g:1003:2: rule__Chant__Group__0__Impl rule__Chant__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalLilyChantParser.g:1010:1: rule__Chant__Group__0__Impl : ( Chant ) ;
    public final void rule__Chant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1014:1: ( ( Chant ) )
            // InternalLilyChantParser.g:1015:1: ( Chant )
            {
            // InternalLilyChantParser.g:1015:1: ( Chant )
            // InternalLilyChantParser.g:1016:2: Chant
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
    // InternalLilyChantParser.g:1025:1: rule__Chant__Group__1 : rule__Chant__Group__1__Impl rule__Chant__Group__2 ;
    public final void rule__Chant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1029:1: ( rule__Chant__Group__1__Impl rule__Chant__Group__2 )
            // InternalLilyChantParser.g:1030:2: rule__Chant__Group__1__Impl rule__Chant__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalLilyChantParser.g:1037:1: rule__Chant__Group__1__Impl : ( Tone ) ;
    public final void rule__Chant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1041:1: ( ( Tone ) )
            // InternalLilyChantParser.g:1042:1: ( Tone )
            {
            // InternalLilyChantParser.g:1042:1: ( Tone )
            // InternalLilyChantParser.g:1043:2: Tone
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getToneKeyword_1()); 
            }
            match(input,Tone,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getToneKeyword_1()); 
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
    // InternalLilyChantParser.g:1052:1: rule__Chant__Group__2 : rule__Chant__Group__2__Impl rule__Chant__Group__3 ;
    public final void rule__Chant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1056:1: ( rule__Chant__Group__2__Impl rule__Chant__Group__3 )
            // InternalLilyChantParser.g:1057:2: rule__Chant__Group__2__Impl rule__Chant__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalLilyChantParser.g:1064:1: rule__Chant__Group__2__Impl : ( ( rule__Chant__ToneAssignment_2 ) ) ;
    public final void rule__Chant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1068:1: ( ( ( rule__Chant__ToneAssignment_2 ) ) )
            // InternalLilyChantParser.g:1069:1: ( ( rule__Chant__ToneAssignment_2 ) )
            {
            // InternalLilyChantParser.g:1069:1: ( ( rule__Chant__ToneAssignment_2 ) )
            // InternalLilyChantParser.g:1070:2: ( rule__Chant__ToneAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getToneAssignment_2()); 
            }
            // InternalLilyChantParser.g:1071:2: ( rule__Chant__ToneAssignment_2 )
            // InternalLilyChantParser.g:1071:3: rule__Chant__ToneAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Chant__ToneAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getToneAssignment_2()); 
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
    // InternalLilyChantParser.g:1079:1: rule__Chant__Group__3 : rule__Chant__Group__3__Impl rule__Chant__Group__4 ;
    public final void rule__Chant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1083:1: ( rule__Chant__Group__3__Impl rule__Chant__Group__4 )
            // InternalLilyChantParser.g:1084:2: rule__Chant__Group__3__Impl rule__Chant__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalLilyChantParser.g:1091:1: rule__Chant__Group__3__Impl : ( Key ) ;
    public final void rule__Chant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1095:1: ( ( Key ) )
            // InternalLilyChantParser.g:1096:1: ( Key )
            {
            // InternalLilyChantParser.g:1096:1: ( Key )
            // InternalLilyChantParser.g:1097:2: Key
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getKeyKeyword_3()); 
            }
            match(input,Key,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getKeyKeyword_3()); 
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
    // InternalLilyChantParser.g:1106:1: rule__Chant__Group__4 : rule__Chant__Group__4__Impl rule__Chant__Group__5 ;
    public final void rule__Chant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1110:1: ( rule__Chant__Group__4__Impl rule__Chant__Group__5 )
            // InternalLilyChantParser.g:1111:2: rule__Chant__Group__4__Impl rule__Chant__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalLilyChantParser.g:1118:1: rule__Chant__Group__4__Impl : ( ( rule__Chant__KeyAssignment_4 ) ) ;
    public final void rule__Chant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1122:1: ( ( ( rule__Chant__KeyAssignment_4 ) ) )
            // InternalLilyChantParser.g:1123:1: ( ( rule__Chant__KeyAssignment_4 ) )
            {
            // InternalLilyChantParser.g:1123:1: ( ( rule__Chant__KeyAssignment_4 ) )
            // InternalLilyChantParser.g:1124:2: ( rule__Chant__KeyAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getKeyAssignment_4()); 
            }
            // InternalLilyChantParser.g:1125:2: ( rule__Chant__KeyAssignment_4 )
            // InternalLilyChantParser.g:1125:3: rule__Chant__KeyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Chant__KeyAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getKeyAssignment_4()); 
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
    // InternalLilyChantParser.g:1133:1: rule__Chant__Group__5 : rule__Chant__Group__5__Impl rule__Chant__Group__6 ;
    public final void rule__Chant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1137:1: ( rule__Chant__Group__5__Impl rule__Chant__Group__6 )
            // InternalLilyChantParser.g:1138:2: rule__Chant__Group__5__Impl rule__Chant__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalLilyChantParser.g:1145:1: rule__Chant__Group__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__Chant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1149:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:1150:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:1150:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:1151:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getBEGINTerminalRuleCall_5()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getBEGINTerminalRuleCall_5()); 
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
    // InternalLilyChantParser.g:1160:1: rule__Chant__Group__6 : rule__Chant__Group__6__Impl rule__Chant__Group__7 ;
    public final void rule__Chant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1164:1: ( rule__Chant__Group__6__Impl rule__Chant__Group__7 )
            // InternalLilyChantParser.g:1165:2: rule__Chant__Group__6__Impl rule__Chant__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Chant__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Chant__Group__7();

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
    // InternalLilyChantParser.g:1172:1: rule__Chant__Group__6__Impl : ( ( ( rule__Chant__PhrasesAssignment_6 ) ) ( ( rule__Chant__PhrasesAssignment_6 )* ) ) ;
    public final void rule__Chant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1176:1: ( ( ( ( rule__Chant__PhrasesAssignment_6 ) ) ( ( rule__Chant__PhrasesAssignment_6 )* ) ) )
            // InternalLilyChantParser.g:1177:1: ( ( ( rule__Chant__PhrasesAssignment_6 ) ) ( ( rule__Chant__PhrasesAssignment_6 )* ) )
            {
            // InternalLilyChantParser.g:1177:1: ( ( ( rule__Chant__PhrasesAssignment_6 ) ) ( ( rule__Chant__PhrasesAssignment_6 )* ) )
            // InternalLilyChantParser.g:1178:2: ( ( rule__Chant__PhrasesAssignment_6 ) ) ( ( rule__Chant__PhrasesAssignment_6 )* )
            {
            // InternalLilyChantParser.g:1178:2: ( ( rule__Chant__PhrasesAssignment_6 ) )
            // InternalLilyChantParser.g:1179:3: ( rule__Chant__PhrasesAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getPhrasesAssignment_6()); 
            }
            // InternalLilyChantParser.g:1180:3: ( rule__Chant__PhrasesAssignment_6 )
            // InternalLilyChantParser.g:1180:4: rule__Chant__PhrasesAssignment_6
            {
            pushFollow(FOLLOW_13);
            rule__Chant__PhrasesAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getPhrasesAssignment_6()); 
            }

            }

            // InternalLilyChantParser.g:1183:2: ( ( rule__Chant__PhrasesAssignment_6 )* )
            // InternalLilyChantParser.g:1184:3: ( rule__Chant__PhrasesAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getPhrasesAssignment_6()); 
            }
            // InternalLilyChantParser.g:1185:3: ( rule__Chant__PhrasesAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Phrase) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLilyChantParser.g:1185:4: rule__Chant__PhrasesAssignment_6
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Chant__PhrasesAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getPhrasesAssignment_6()); 
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
    // $ANTLR end "rule__Chant__Group__6__Impl"


    // $ANTLR start "rule__Chant__Group__7"
    // InternalLilyChantParser.g:1194:1: rule__Chant__Group__7 : rule__Chant__Group__7__Impl ;
    public final void rule__Chant__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1198:1: ( rule__Chant__Group__7__Impl )
            // InternalLilyChantParser.g:1199:2: rule__Chant__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chant__Group__7__Impl();

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
    // $ANTLR end "rule__Chant__Group__7"


    // $ANTLR start "rule__Chant__Group__7__Impl"
    // InternalLilyChantParser.g:1205:1: rule__Chant__Group__7__Impl : ( RULE_END ) ;
    public final void rule__Chant__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1209:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:1210:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:1210:1: ( RULE_END )
            // InternalLilyChantParser.g:1211:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getENDTerminalRuleCall_7()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getENDTerminalRuleCall_7()); 
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
    // $ANTLR end "rule__Chant__Group__7__Impl"


    // $ANTLR start "rule__LyricPhrase__Group__0"
    // InternalLilyChantParser.g:1221:1: rule__LyricPhrase__Group__0 : rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1 ;
    public final void rule__LyricPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1225:1: ( rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1 )
            // InternalLilyChantParser.g:1226:2: rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalLilyChantParser.g:1233:1: rule__LyricPhrase__Group__0__Impl : ( Phrase ) ;
    public final void rule__LyricPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1237:1: ( ( Phrase ) )
            // InternalLilyChantParser.g:1238:1: ( Phrase )
            {
            // InternalLilyChantParser.g:1238:1: ( Phrase )
            // InternalLilyChantParser.g:1239:2: Phrase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getPhraseKeyword_0()); 
            }
            match(input,Phrase,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getPhraseKeyword_0()); 
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
    // InternalLilyChantParser.g:1248:1: rule__LyricPhrase__Group__1 : rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2 ;
    public final void rule__LyricPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1252:1: ( rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2 )
            // InternalLilyChantParser.g:1253:2: rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalLilyChantParser.g:1260:1: rule__LyricPhrase__Group__1__Impl : ( ( rule__LyricPhrase__NotesAssignment_1 ) ) ;
    public final void rule__LyricPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1264:1: ( ( ( rule__LyricPhrase__NotesAssignment_1 ) ) )
            // InternalLilyChantParser.g:1265:1: ( ( rule__LyricPhrase__NotesAssignment_1 ) )
            {
            // InternalLilyChantParser.g:1265:1: ( ( rule__LyricPhrase__NotesAssignment_1 ) )
            // InternalLilyChantParser.g:1266:2: ( rule__LyricPhrase__NotesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNotesAssignment_1()); 
            }
            // InternalLilyChantParser.g:1267:2: ( rule__LyricPhrase__NotesAssignment_1 )
            // InternalLilyChantParser.g:1267:3: rule__LyricPhrase__NotesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__NotesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getNotesAssignment_1()); 
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
    // InternalLilyChantParser.g:1275:1: rule__LyricPhrase__Group__2 : rule__LyricPhrase__Group__2__Impl rule__LyricPhrase__Group__3 ;
    public final void rule__LyricPhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1279:1: ( rule__LyricPhrase__Group__2__Impl rule__LyricPhrase__Group__3 )
            // InternalLilyChantParser.g:1280:2: rule__LyricPhrase__Group__2__Impl rule__LyricPhrase__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__LyricPhrase__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group__3();

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
    // InternalLilyChantParser.g:1287:1: rule__LyricPhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__LyricPhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1291:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:1292:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:1292:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:1293:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getBEGINTerminalRuleCall_2()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getBEGINTerminalRuleCall_2()); 
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


    // $ANTLR start "rule__LyricPhrase__Group__3"
    // InternalLilyChantParser.g:1302:1: rule__LyricPhrase__Group__3 : rule__LyricPhrase__Group__3__Impl rule__LyricPhrase__Group__4 ;
    public final void rule__LyricPhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1306:1: ( rule__LyricPhrase__Group__3__Impl rule__LyricPhrase__Group__4 )
            // InternalLilyChantParser.g:1307:2: rule__LyricPhrase__Group__3__Impl rule__LyricPhrase__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__LyricPhrase__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group__4();

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
    // $ANTLR end "rule__LyricPhrase__Group__3"


    // $ANTLR start "rule__LyricPhrase__Group__3__Impl"
    // InternalLilyChantParser.g:1314:1: rule__LyricPhrase__Group__3__Impl : ( ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* ) ) ;
    public final void rule__LyricPhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1318:1: ( ( ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:1319:1: ( ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:1319:1: ( ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* ) )
            // InternalLilyChantParser.g:1320:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* )
            {
            // InternalLilyChantParser.g:1320:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) )
            // InternalLilyChantParser.g:1321:3: ( rule__LyricPhrase__NoteGroupsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_3()); 
            }
            // InternalLilyChantParser.g:1322:3: ( rule__LyricPhrase__NoteGroupsAssignment_3 )
            // InternalLilyChantParser.g:1322:4: rule__LyricPhrase__NoteGroupsAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__LyricPhrase__NoteGroupsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_3()); 
            }

            }

            // InternalLilyChantParser.g:1325:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* )
            // InternalLilyChantParser.g:1326:3: ( rule__LyricPhrase__NoteGroupsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_3()); 
            }
            // InternalLilyChantParser.g:1327:3: ( rule__LyricPhrase__NoteGroupsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==RULE_HYPHEN||LA11_0==RULE_START_NOTE_GROUP) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLilyChantParser.g:1327:4: rule__LyricPhrase__NoteGroupsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__LyricPhrase__NoteGroupsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_3()); 
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
    // $ANTLR end "rule__LyricPhrase__Group__3__Impl"


    // $ANTLR start "rule__LyricPhrase__Group__4"
    // InternalLilyChantParser.g:1336:1: rule__LyricPhrase__Group__4 : rule__LyricPhrase__Group__4__Impl ;
    public final void rule__LyricPhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1340:1: ( rule__LyricPhrase__Group__4__Impl )
            // InternalLilyChantParser.g:1341:2: rule__LyricPhrase__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group__4__Impl();

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
    // $ANTLR end "rule__LyricPhrase__Group__4"


    // $ANTLR start "rule__LyricPhrase__Group__4__Impl"
    // InternalLilyChantParser.g:1347:1: rule__LyricPhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__LyricPhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1351:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:1352:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:1352:1: ( RULE_END )
            // InternalLilyChantParser.g:1353:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getENDTerminalRuleCall_4()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getENDTerminalRuleCall_4()); 
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
    // $ANTLR end "rule__LyricPhrase__Group__4__Impl"


    // $ANTLR start "rule__NoteGroup__Group_0__0"
    // InternalLilyChantParser.g:1363:1: rule__NoteGroup__Group_0__0 : rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1 ;
    public final void rule__NoteGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1367:1: ( rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1 )
            // InternalLilyChantParser.g:1368:2: rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalLilyChantParser.g:1375:1: rule__NoteGroup__Group_0__0__Impl : ( ( rule__NoteGroup__Alternatives_0_0 ) ) ;
    public final void rule__NoteGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1379:1: ( ( ( rule__NoteGroup__Alternatives_0_0 ) ) )
            // InternalLilyChantParser.g:1380:1: ( ( rule__NoteGroup__Alternatives_0_0 ) )
            {
            // InternalLilyChantParser.g:1380:1: ( ( rule__NoteGroup__Alternatives_0_0 ) )
            // InternalLilyChantParser.g:1381:2: ( rule__NoteGroup__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getAlternatives_0_0()); 
            }
            // InternalLilyChantParser.g:1382:2: ( rule__NoteGroup__Alternatives_0_0 )
            // InternalLilyChantParser.g:1382:3: rule__NoteGroup__Alternatives_0_0
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
    // InternalLilyChantParser.g:1390:1: rule__NoteGroup__Group_0__1 : rule__NoteGroup__Group_0__1__Impl ;
    public final void rule__NoteGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1394:1: ( rule__NoteGroup__Group_0__1__Impl )
            // InternalLilyChantParser.g:1395:2: rule__NoteGroup__Group_0__1__Impl
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
    // InternalLilyChantParser.g:1401:1: rule__NoteGroup__Group_0__1__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* ) ;
    public final void rule__NoteGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1405:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* ) )
            // InternalLilyChantParser.g:1406:1: ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* )
            {
            // InternalLilyChantParser.g:1406:1: ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* )
            // InternalLilyChantParser.g:1407:2: ( rule__NoteGroup__SyllablesAssignment_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_1()); 
            }
            // InternalLilyChantParser.g:1408:2: ( rule__NoteGroup__SyllablesAssignment_0_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_EXTENDER) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLilyChantParser.g:1408:3: rule__NoteGroup__SyllablesAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__NoteGroup__SyllablesAssignment_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalLilyChantParser.g:1417:1: rule__NoteGroup__Group_0_0_0__0 : rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1 ;
    public final void rule__NoteGroup__Group_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1421:1: ( rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1 )
            // InternalLilyChantParser.g:1422:2: rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalLilyChantParser.g:1429:1: rule__NoteGroup__Group_0_0_0__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1433:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) ) )
            // InternalLilyChantParser.g:1434:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) )
            {
            // InternalLilyChantParser.g:1434:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) )
            // InternalLilyChantParser.g:1435:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_0()); 
            }
            // InternalLilyChantParser.g:1436:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 )
            // InternalLilyChantParser.g:1436:3: rule__NoteGroup__SyllablesAssignment_0_0_0_0
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
    // InternalLilyChantParser.g:1444:1: rule__NoteGroup__Group_0_0_0__1 : rule__NoteGroup__Group_0_0_0__1__Impl ;
    public final void rule__NoteGroup__Group_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1448:1: ( rule__NoteGroup__Group_0_0_0__1__Impl )
            // InternalLilyChantParser.g:1449:2: rule__NoteGroup__Group_0_0_0__1__Impl
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
    // InternalLilyChantParser.g:1455:1: rule__NoteGroup__Group_0_0_0__1__Impl : ( ( rule__NoteGroup__Group_0_0_0_1__0 )? ) ;
    public final void rule__NoteGroup__Group_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1459:1: ( ( ( rule__NoteGroup__Group_0_0_0_1__0 )? ) )
            // InternalLilyChantParser.g:1460:1: ( ( rule__NoteGroup__Group_0_0_0_1__0 )? )
            {
            // InternalLilyChantParser.g:1460:1: ( ( rule__NoteGroup__Group_0_0_0_1__0 )? )
            // InternalLilyChantParser.g:1461:2: ( rule__NoteGroup__Group_0_0_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getGroup_0_0_0_1()); 
            }
            // InternalLilyChantParser.g:1462:2: ( rule__NoteGroup__Group_0_0_0_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_HYPHEN) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||(LA13_1>=RULE_HYPHEN && LA13_1<=RULE_START_NOTE_GROUP)||LA13_1==RULE_END) ) {
                    alt13=1;
                }
                else if ( (LA13_1==RULE_ID) ) {
                    int LA13_4 = input.LA(3);

                    if ( (synpred13_InternalLilyChantParser()) ) {
                        alt13=1;
                    }
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalLilyChantParser.g:1462:3: rule__NoteGroup__Group_0_0_0_1__0
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
    // InternalLilyChantParser.g:1471:1: rule__NoteGroup__Group_0_0_0_1__0 : rule__NoteGroup__Group_0_0_0_1__0__Impl ;
    public final void rule__NoteGroup__Group_0_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1475:1: ( rule__NoteGroup__Group_0_0_0_1__0__Impl )
            // InternalLilyChantParser.g:1476:2: rule__NoteGroup__Group_0_0_0_1__0__Impl
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
    // InternalLilyChantParser.g:1482:1: rule__NoteGroup__Group_0_0_0_1__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1486:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) ) )
            // InternalLilyChantParser.g:1487:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) )
            {
            // InternalLilyChantParser.g:1487:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) )
            // InternalLilyChantParser.g:1488:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_1_0()); 
            }
            // InternalLilyChantParser.g:1489:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 )
            // InternalLilyChantParser.g:1489:3: rule__NoteGroup__SyllablesAssignment_0_0_0_1_0
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
    // InternalLilyChantParser.g:1498:1: rule__NoteGroup__Group_0_0_1__0 : rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1 ;
    public final void rule__NoteGroup__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1502:1: ( rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1 )
            // InternalLilyChantParser.g:1503:2: rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalLilyChantParser.g:1510:1: rule__NoteGroup__Group_0_0_1__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1514:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) ) )
            // InternalLilyChantParser.g:1515:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) )
            {
            // InternalLilyChantParser.g:1515:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) )
            // InternalLilyChantParser.g:1516:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_0()); 
            }
            // InternalLilyChantParser.g:1517:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 )
            // InternalLilyChantParser.g:1517:3: rule__NoteGroup__SyllablesAssignment_0_0_1_0
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
    // InternalLilyChantParser.g:1525:1: rule__NoteGroup__Group_0_0_1__1 : rule__NoteGroup__Group_0_0_1__1__Impl ;
    public final void rule__NoteGroup__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1529:1: ( rule__NoteGroup__Group_0_0_1__1__Impl )
            // InternalLilyChantParser.g:1530:2: rule__NoteGroup__Group_0_0_1__1__Impl
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
    // InternalLilyChantParser.g:1536:1: rule__NoteGroup__Group_0_0_1__1__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) ) ;
    public final void rule__NoteGroup__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1540:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) ) )
            // InternalLilyChantParser.g:1541:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) )
            {
            // InternalLilyChantParser.g:1541:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) )
            // InternalLilyChantParser.g:1542:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_1()); 
            }
            // InternalLilyChantParser.g:1543:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 )
            // InternalLilyChantParser.g:1543:3: rule__NoteGroup__SyllablesAssignment_0_0_1_1
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


    // $ANTLR start "rule__NoteGroup__Group_1__0"
    // InternalLilyChantParser.g:1552:1: rule__NoteGroup__Group_1__0 : rule__NoteGroup__Group_1__0__Impl rule__NoteGroup__Group_1__1 ;
    public final void rule__NoteGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1556:1: ( rule__NoteGroup__Group_1__0__Impl rule__NoteGroup__Group_1__1 )
            // InternalLilyChantParser.g:1557:2: rule__NoteGroup__Group_1__0__Impl rule__NoteGroup__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__NoteGroup__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_1__1();

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
    // $ANTLR end "rule__NoteGroup__Group_1__0"


    // $ANTLR start "rule__NoteGroup__Group_1__0__Impl"
    // InternalLilyChantParser.g:1564:1: rule__NoteGroup__Group_1__0__Impl : ( RULE_START_NOTE_GROUP ) ;
    public final void rule__NoteGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1568:1: ( ( RULE_START_NOTE_GROUP ) )
            // InternalLilyChantParser.g:1569:1: ( RULE_START_NOTE_GROUP )
            {
            // InternalLilyChantParser.g:1569:1: ( RULE_START_NOTE_GROUP )
            // InternalLilyChantParser.g:1570:2: RULE_START_NOTE_GROUP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSTART_NOTE_GROUPTerminalRuleCall_1_0()); 
            }
            match(input,RULE_START_NOTE_GROUP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSTART_NOTE_GROUPTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__NoteGroup__Group_1__0__Impl"


    // $ANTLR start "rule__NoteGroup__Group_1__1"
    // InternalLilyChantParser.g:1579:1: rule__NoteGroup__Group_1__1 : rule__NoteGroup__Group_1__1__Impl rule__NoteGroup__Group_1__2 ;
    public final void rule__NoteGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1583:1: ( rule__NoteGroup__Group_1__1__Impl rule__NoteGroup__Group_1__2 )
            // InternalLilyChantParser.g:1584:2: rule__NoteGroup__Group_1__1__Impl rule__NoteGroup__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__NoteGroup__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_1__2();

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
    // $ANTLR end "rule__NoteGroup__Group_1__1"


    // $ANTLR start "rule__NoteGroup__Group_1__1__Impl"
    // InternalLilyChantParser.g:1591:1: rule__NoteGroup__Group_1__1__Impl : ( ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* ) ) ;
    public final void rule__NoteGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1595:1: ( ( ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* ) ) )
            // InternalLilyChantParser.g:1596:1: ( ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* ) )
            {
            // InternalLilyChantParser.g:1596:1: ( ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* ) )
            // InternalLilyChantParser.g:1597:2: ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* )
            {
            // InternalLilyChantParser.g:1597:2: ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) )
            // InternalLilyChantParser.g:1598:3: ( rule__NoteGroup__SyllablesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); 
            }
            // InternalLilyChantParser.g:1599:3: ( rule__NoteGroup__SyllablesAssignment_1_1 )
            // InternalLilyChantParser.g:1599:4: rule__NoteGroup__SyllablesAssignment_1_1
            {
            pushFollow(FOLLOW_24);
            rule__NoteGroup__SyllablesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); 
            }

            }

            // InternalLilyChantParser.g:1602:2: ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* )
            // InternalLilyChantParser.g:1603:3: ( rule__NoteGroup__SyllablesAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); 
            }
            // InternalLilyChantParser.g:1604:3: ( rule__NoteGroup__SyllablesAssignment_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==RULE_HYPHEN) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLilyChantParser.g:1604:4: rule__NoteGroup__SyllablesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__NoteGroup__SyllablesAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); 
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
    // $ANTLR end "rule__NoteGroup__Group_1__1__Impl"


    // $ANTLR start "rule__NoteGroup__Group_1__2"
    // InternalLilyChantParser.g:1613:1: rule__NoteGroup__Group_1__2 : rule__NoteGroup__Group_1__2__Impl ;
    public final void rule__NoteGroup__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1617:1: ( rule__NoteGroup__Group_1__2__Impl )
            // InternalLilyChantParser.g:1618:2: rule__NoteGroup__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_1__2__Impl();

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
    // $ANTLR end "rule__NoteGroup__Group_1__2"


    // $ANTLR start "rule__NoteGroup__Group_1__2__Impl"
    // InternalLilyChantParser.g:1624:1: rule__NoteGroup__Group_1__2__Impl : ( RULE_END_NOTE_GROUP ) ;
    public final void rule__NoteGroup__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1628:1: ( ( RULE_END_NOTE_GROUP ) )
            // InternalLilyChantParser.g:1629:1: ( RULE_END_NOTE_GROUP )
            {
            // InternalLilyChantParser.g:1629:1: ( RULE_END_NOTE_GROUP )
            // InternalLilyChantParser.g:1630:2: RULE_END_NOTE_GROUP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getEND_NOTE_GROUPTerminalRuleCall_1_2()); 
            }
            match(input,RULE_END_NOTE_GROUP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getEND_NOTE_GROUPTerminalRuleCall_1_2()); 
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
    // $ANTLR end "rule__NoteGroup__Group_1__2__Impl"


    // $ANTLR start "rule__Note__Group__0"
    // InternalLilyChantParser.g:1640:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1644:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalLilyChantParser.g:1645:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalLilyChantParser.g:1652:1: rule__Note__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1656:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1657:1: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1657:1: ( RULE_ID )
            // InternalLilyChantParser.g:1658:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteAccess().getIDTerminalRuleCall_0()); 
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
    // InternalLilyChantParser.g:1667:1: rule__Note__Group__1 : rule__Note__Group__1__Impl ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1671:1: ( rule__Note__Group__1__Impl )
            // InternalLilyChantParser.g:1672:2: rule__Note__Group__1__Impl
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
    // InternalLilyChantParser.g:1678:1: rule__Note__Group__1__Impl : ( ( RULE_DURATION )? ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1682:1: ( ( ( RULE_DURATION )? ) )
            // InternalLilyChantParser.g:1683:1: ( ( RULE_DURATION )? )
            {
            // InternalLilyChantParser.g:1683:1: ( ( RULE_DURATION )? )
            // InternalLilyChantParser.g:1684:2: ( RULE_DURATION )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getDURATIONTerminalRuleCall_1()); 
            }
            // InternalLilyChantParser.g:1685:2: ( RULE_DURATION )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DURATION) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLilyChantParser.g:1685:3: RULE_DURATION
                    {
                    match(input,RULE_DURATION,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteAccess().getDURATIONTerminalRuleCall_1()); 
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
    // InternalLilyChantParser.g:1694:1: rule__Script__TonesAssignment_0 : ( ruleTone ) ;
    public final void rule__Script__TonesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1698:1: ( ( ruleTone ) )
            // InternalLilyChantParser.g:1699:2: ( ruleTone )
            {
            // InternalLilyChantParser.g:1699:2: ( ruleTone )
            // InternalLilyChantParser.g:1700:3: ruleTone
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
    // InternalLilyChantParser.g:1709:1: rule__Script__ChantsAssignment_1 : ( ruleChant ) ;
    public final void rule__Script__ChantsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1713:1: ( ( ruleChant ) )
            // InternalLilyChantParser.g:1714:2: ( ruleChant )
            {
            // InternalLilyChantParser.g:1714:2: ( ruleChant )
            // InternalLilyChantParser.g:1715:3: ruleChant
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
    // InternalLilyChantParser.g:1724:1: rule__Tone__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tone__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1728:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1729:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1729:2: ( RULE_ID )
            // InternalLilyChantParser.g:1730:3: RULE_ID
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


    // $ANTLR start "rule__Tone__KeyAssignment_3"
    // InternalLilyChantParser.g:1739:1: rule__Tone__KeyAssignment_3 : ( RULE_ID ) ;
    public final void rule__Tone__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1743:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1744:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1744:2: ( RULE_ID )
            // InternalLilyChantParser.g:1745:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getKeyIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getKeyIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Tone__KeyAssignment_3"


    // $ANTLR start "rule__Tone__VoiceNamesAssignment_7"
    // InternalLilyChantParser.g:1754:1: rule__Tone__VoiceNamesAssignment_7 : ( ruleVoiceName ) ;
    public final void rule__Tone__VoiceNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1758:1: ( ( ruleVoiceName ) )
            // InternalLilyChantParser.g:1759:2: ( ruleVoiceName )
            {
            // InternalLilyChantParser.g:1759:2: ( ruleVoiceName )
            // InternalLilyChantParser.g:1760:3: ruleVoiceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getVoiceNamesVoiceNameParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVoiceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getVoiceNamesVoiceNameParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Tone__VoiceNamesAssignment_7"


    // $ANTLR start "rule__Tone__PhrasesAssignment_9"
    // InternalLilyChantParser.g:1769:1: rule__Tone__PhrasesAssignment_9 : ( ruleTonePhrase ) ;
    public final void rule__Tone__PhrasesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1773:1: ( ( ruleTonePhrase ) )
            // InternalLilyChantParser.g:1774:2: ( ruleTonePhrase )
            {
            // InternalLilyChantParser.g:1774:2: ( ruleTonePhrase )
            // InternalLilyChantParser.g:1775:3: ruleTonePhrase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getPhrasesTonePhraseParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTonePhrase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getPhrasesTonePhraseParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__Tone__PhrasesAssignment_9"


    // $ANTLR start "rule__VoiceName__NameAssignment"
    // InternalLilyChantParser.g:1784:1: rule__VoiceName__NameAssignment : ( RULE_ID ) ;
    public final void rule__VoiceName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1788:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1789:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1789:2: ( RULE_ID )
            // InternalLilyChantParser.g:1790:3: RULE_ID
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
    // InternalLilyChantParser.g:1799:1: rule__TonePhrase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TonePhrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1803:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1804:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1804:2: ( RULE_ID )
            // InternalLilyChantParser.g:1805:3: RULE_ID
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
    // InternalLilyChantParser.g:1814:1: rule__TonePhrase__VoicesAssignment_3 : ( ruleVoicePhrase ) ;
    public final void rule__TonePhrase__VoicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1818:1: ( ( ruleVoicePhrase ) )
            // InternalLilyChantParser.g:1819:2: ( ruleVoicePhrase )
            {
            // InternalLilyChantParser.g:1819:2: ( ruleVoicePhrase )
            // InternalLilyChantParser.g:1820:3: ruleVoicePhrase
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
    // InternalLilyChantParser.g:1829:1: rule__VoicePhrase__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VoicePhrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1833:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:1834:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:1834:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1835:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNameVoiceNameCrossReference_1_0()); 
            }
            // InternalLilyChantParser.g:1836:3: ( RULE_ID )
            // InternalLilyChantParser.g:1837:4: RULE_ID
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
    // InternalLilyChantParser.g:1848:1: rule__VoicePhrase__NotesAssignment_3 : ( ruleNote ) ;
    public final void rule__VoicePhrase__NotesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1852:1: ( ( ruleNote ) )
            // InternalLilyChantParser.g:1853:2: ( ruleNote )
            {
            // InternalLilyChantParser.g:1853:2: ( ruleNote )
            // InternalLilyChantParser.g:1854:3: ruleNote
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


    // $ANTLR start "rule__Chant__ToneAssignment_2"
    // InternalLilyChantParser.g:1863:1: rule__Chant__ToneAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Chant__ToneAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1867:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:1868:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:1868:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1869:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getToneToneCrossReference_2_0()); 
            }
            // InternalLilyChantParser.g:1870:3: ( RULE_ID )
            // InternalLilyChantParser.g:1871:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getToneToneIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getToneToneIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getToneToneCrossReference_2_0()); 
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
    // $ANTLR end "rule__Chant__ToneAssignment_2"


    // $ANTLR start "rule__Chant__KeyAssignment_4"
    // InternalLilyChantParser.g:1882:1: rule__Chant__KeyAssignment_4 : ( RULE_ID ) ;
    public final void rule__Chant__KeyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1886:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1887:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1887:2: ( RULE_ID )
            // InternalLilyChantParser.g:1888:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getKeyIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getKeyIDTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__Chant__KeyAssignment_4"


    // $ANTLR start "rule__Chant__PhrasesAssignment_6"
    // InternalLilyChantParser.g:1897:1: rule__Chant__PhrasesAssignment_6 : ( ruleLyricPhrase ) ;
    public final void rule__Chant__PhrasesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1901:1: ( ( ruleLyricPhrase ) )
            // InternalLilyChantParser.g:1902:2: ( ruleLyricPhrase )
            {
            // InternalLilyChantParser.g:1902:2: ( ruleLyricPhrase )
            // InternalLilyChantParser.g:1903:3: ruleLyricPhrase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getPhrasesLyricPhraseParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLyricPhrase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getPhrasesLyricPhraseParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Chant__PhrasesAssignment_6"


    // $ANTLR start "rule__LyricPhrase__NotesAssignment_1"
    // InternalLilyChantParser.g:1912:1: rule__LyricPhrase__NotesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LyricPhrase__NotesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1916:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:1917:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:1917:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1918:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNotesTonePhraseCrossReference_1_0()); 
            }
            // InternalLilyChantParser.g:1919:3: ( RULE_ID )
            // InternalLilyChantParser.g:1920:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNotesTonePhraseIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getNotesTonePhraseIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getNotesTonePhraseCrossReference_1_0()); 
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
    // $ANTLR end "rule__LyricPhrase__NotesAssignment_1"


    // $ANTLR start "rule__LyricPhrase__NoteGroupsAssignment_3"
    // InternalLilyChantParser.g:1931:1: rule__LyricPhrase__NoteGroupsAssignment_3 : ( ruleNoteGroup ) ;
    public final void rule__LyricPhrase__NoteGroupsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1935:1: ( ( ruleNoteGroup ) )
            // InternalLilyChantParser.g:1936:2: ( ruleNoteGroup )
            {
            // InternalLilyChantParser.g:1936:2: ( ruleNoteGroup )
            // InternalLilyChantParser.g:1937:3: ruleNoteGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNoteGroupsNoteGroupParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNoteGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLyricPhraseAccess().getNoteGroupsNoteGroupParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__LyricPhrase__NoteGroupsAssignment_3"


    // $ANTLR start "rule__NoteGroup__SyllablesAssignment_0_0_0_0"
    // InternalLilyChantParser.g:1946:1: rule__NoteGroup__SyllablesAssignment_0_0_0_0 : ( RULE_ID ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1950:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1951:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1951:2: ( RULE_ID )
            // InternalLilyChantParser.g:1952:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_0_0_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_0_0_0_0_0()); 
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
    // InternalLilyChantParser.g:1961:1: rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 : ( RULE_HYPHEN ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1965:1: ( ( RULE_HYPHEN ) )
            // InternalLilyChantParser.g:1966:2: ( RULE_HYPHEN )
            {
            // InternalLilyChantParser.g:1966:2: ( RULE_HYPHEN )
            // InternalLilyChantParser.g:1967:3: RULE_HYPHEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_0_0_0_1_0_0()); 
            }
            match(input,RULE_HYPHEN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_0_0_0_1_0_0()); 
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
    // InternalLilyChantParser.g:1976:1: rule__NoteGroup__SyllablesAssignment_0_0_1_0 : ( RULE_HYPHEN ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1980:1: ( ( RULE_HYPHEN ) )
            // InternalLilyChantParser.g:1981:2: ( RULE_HYPHEN )
            {
            // InternalLilyChantParser.g:1981:2: ( RULE_HYPHEN )
            // InternalLilyChantParser.g:1982:3: RULE_HYPHEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_0_0_1_0_0()); 
            }
            match(input,RULE_HYPHEN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_0_0_1_0_0()); 
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
    // InternalLilyChantParser.g:1991:1: rule__NoteGroup__SyllablesAssignment_0_0_1_1 : ( RULE_ID ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1995:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1996:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1996:2: ( RULE_ID )
            // InternalLilyChantParser.g:1997:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_0_0_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_0_0_1_1_0()); 
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
    // InternalLilyChantParser.g:2006:1: rule__NoteGroup__SyllablesAssignment_0_1 : ( RULE_EXTENDER ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2010:1: ( ( RULE_EXTENDER ) )
            // InternalLilyChantParser.g:2011:2: ( RULE_EXTENDER )
            {
            // InternalLilyChantParser.g:2011:2: ( RULE_EXTENDER )
            // InternalLilyChantParser.g:2012:3: RULE_EXTENDER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesEXTENDERTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_EXTENDER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesEXTENDERTerminalRuleCall_0_1_0()); 
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


    // $ANTLR start "rule__NoteGroup__SyllablesAssignment_1_1"
    // InternalLilyChantParser.g:2021:1: rule__NoteGroup__SyllablesAssignment_1_1 : ( ( rule__NoteGroup__SyllablesAlternatives_1_1_0 ) ) ;
    public final void rule__NoteGroup__SyllablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2025:1: ( ( ( rule__NoteGroup__SyllablesAlternatives_1_1_0 ) ) )
            // InternalLilyChantParser.g:2026:2: ( ( rule__NoteGroup__SyllablesAlternatives_1_1_0 ) )
            {
            // InternalLilyChantParser.g:2026:2: ( ( rule__NoteGroup__SyllablesAlternatives_1_1_0 ) )
            // InternalLilyChantParser.g:2027:3: ( rule__NoteGroup__SyllablesAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_1_1_0()); 
            }
            // InternalLilyChantParser.g:2028:3: ( rule__NoteGroup__SyllablesAlternatives_1_1_0 )
            // InternalLilyChantParser.g:2028:4: rule__NoteGroup__SyllablesAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__SyllablesAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_1_1_0()); 
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
    // $ANTLR end "rule__NoteGroup__SyllablesAssignment_1_1"

    // $ANTLR start synpred13_InternalLilyChantParser
    public final void synpred13_InternalLilyChantParser_fragment() throws RecognitionException {   
        // InternalLilyChantParser.g:1462:3: ( rule__NoteGroup__Group_0_0_0_1__0 )
        // InternalLilyChantParser.g:1462:3: rule__NoteGroup__Group_0_0_0_1__0
        {
        pushFollow(FOLLOW_2);
        rule__NoteGroup__Group_0_0_0_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalLilyChantParser

    // Delegated rules

    public final boolean synpred13_InternalLilyChantParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalLilyChantParser_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000005400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000005402L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000800L});

}