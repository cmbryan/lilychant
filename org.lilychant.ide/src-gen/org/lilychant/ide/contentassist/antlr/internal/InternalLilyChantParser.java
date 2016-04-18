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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Phrase", "Voices", "Chant", "Voice", "Tone", "In", "RULE_ID", "RULE_DURATION", "RULE_HYPHEN", "RULE_EXTENDER", "RULE_START_NOTE_GROUP", "RULE_END_NOTE_GROUP", "RULE_BEGIN", "RULE_END", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS"
    };
    public static final int RULE_DURATION=11;
    public static final int RULE_ID=10;
    public static final int RULE_HYPHEN=12;
    public static final int In=9;
    public static final int Voice=7;
    public static final int RULE_END=17;
    public static final int RULE_BEGIN=16;
    public static final int RULE_END_NOTE_GROUP=15;
    public static final int Tone=8;
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
    		tokenNameToValue.put("In", "'in'");
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
    // InternalLilyChantParser.g:71:1: ruleScript : ( ( rule__Script__Group__0 )? ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:75:2: ( ( ( rule__Script__Group__0 )? ) )
            // InternalLilyChantParser.g:76:2: ( ( rule__Script__Group__0 )? )
            {
            // InternalLilyChantParser.g:76:2: ( ( rule__Script__Group__0 )? )
            // InternalLilyChantParser.g:77:3: ( rule__Script__Group__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:78:3: ( rule__Script__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Tone) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalLilyChantParser.g:78:4: rule__Script__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Script__Group__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==RULE_HYPHEN) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_START_NOTE_GROUP) ) {
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
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_HYPHEN) ) {
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
    // InternalLilyChantParser.g:361:1: rule__Script__Group__0__Impl : ( ( ( rule__Script__TonesAssignment_0 ) ) ( ( rule__Script__TonesAssignment_0 )* ) ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:365:1: ( ( ( ( rule__Script__TonesAssignment_0 ) ) ( ( rule__Script__TonesAssignment_0 )* ) ) )
            // InternalLilyChantParser.g:366:1: ( ( ( rule__Script__TonesAssignment_0 ) ) ( ( rule__Script__TonesAssignment_0 )* ) )
            {
            // InternalLilyChantParser.g:366:1: ( ( ( rule__Script__TonesAssignment_0 ) ) ( ( rule__Script__TonesAssignment_0 )* ) )
            // InternalLilyChantParser.g:367:2: ( ( rule__Script__TonesAssignment_0 ) ) ( ( rule__Script__TonesAssignment_0 )* )
            {
            // InternalLilyChantParser.g:367:2: ( ( rule__Script__TonesAssignment_0 ) )
            // InternalLilyChantParser.g:368:3: ( rule__Script__TonesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getTonesAssignment_0()); 
            }
            // InternalLilyChantParser.g:369:3: ( rule__Script__TonesAssignment_0 )
            // InternalLilyChantParser.g:369:4: rule__Script__TonesAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__Script__TonesAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getTonesAssignment_0()); 
            }

            }

            // InternalLilyChantParser.g:372:2: ( ( rule__Script__TonesAssignment_0 )* )
            // InternalLilyChantParser.g:373:3: ( rule__Script__TonesAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getTonesAssignment_0()); 
            }
            // InternalLilyChantParser.g:374:3: ( rule__Script__TonesAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Tone) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLilyChantParser.g:374:4: rule__Script__TonesAssignment_0
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

        }
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
    // InternalLilyChantParser.g:383:1: rule__Script__Group__1 : rule__Script__Group__1__Impl ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:387:1: ( rule__Script__Group__1__Impl )
            // InternalLilyChantParser.g:388:2: rule__Script__Group__1__Impl
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
    // InternalLilyChantParser.g:394:1: rule__Script__Group__1__Impl : ( ( rule__Script__ChantsAssignment_1 )* ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:398:1: ( ( ( rule__Script__ChantsAssignment_1 )* ) )
            // InternalLilyChantParser.g:399:1: ( ( rule__Script__ChantsAssignment_1 )* )
            {
            // InternalLilyChantParser.g:399:1: ( ( rule__Script__ChantsAssignment_1 )* )
            // InternalLilyChantParser.g:400:2: ( rule__Script__ChantsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getChantsAssignment_1()); 
            }
            // InternalLilyChantParser.g:401:2: ( rule__Script__ChantsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Chant) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLilyChantParser.g:401:3: rule__Script__ChantsAssignment_1
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
    // InternalLilyChantParser.g:410:1: rule__Tone__Group__0 : rule__Tone__Group__0__Impl rule__Tone__Group__1 ;
    public final void rule__Tone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:414:1: ( rule__Tone__Group__0__Impl rule__Tone__Group__1 )
            // InternalLilyChantParser.g:415:2: rule__Tone__Group__0__Impl rule__Tone__Group__1
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
    // InternalLilyChantParser.g:422:1: rule__Tone__Group__0__Impl : ( Tone ) ;
    public final void rule__Tone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:426:1: ( ( Tone ) )
            // InternalLilyChantParser.g:427:1: ( Tone )
            {
            // InternalLilyChantParser.g:427:1: ( Tone )
            // InternalLilyChantParser.g:428:2: Tone
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
    // InternalLilyChantParser.g:437:1: rule__Tone__Group__1 : rule__Tone__Group__1__Impl rule__Tone__Group__2 ;
    public final void rule__Tone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:441:1: ( rule__Tone__Group__1__Impl rule__Tone__Group__2 )
            // InternalLilyChantParser.g:442:2: rule__Tone__Group__1__Impl rule__Tone__Group__2
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
    // InternalLilyChantParser.g:449:1: rule__Tone__Group__1__Impl : ( ( rule__Tone__NameAssignment_1 ) ) ;
    public final void rule__Tone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:453:1: ( ( ( rule__Tone__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:454:1: ( ( rule__Tone__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:454:1: ( ( rule__Tone__NameAssignment_1 ) )
            // InternalLilyChantParser.g:455:2: ( rule__Tone__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:456:2: ( rule__Tone__NameAssignment_1 )
            // InternalLilyChantParser.g:456:3: rule__Tone__NameAssignment_1
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
    // InternalLilyChantParser.g:464:1: rule__Tone__Group__2 : rule__Tone__Group__2__Impl rule__Tone__Group__3 ;
    public final void rule__Tone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:468:1: ( rule__Tone__Group__2__Impl rule__Tone__Group__3 )
            // InternalLilyChantParser.g:469:2: rule__Tone__Group__2__Impl rule__Tone__Group__3
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
    // InternalLilyChantParser.g:476:1: rule__Tone__Group__2__Impl : ( In ) ;
    public final void rule__Tone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:480:1: ( ( In ) )
            // InternalLilyChantParser.g:481:1: ( In )
            {
            // InternalLilyChantParser.g:481:1: ( In )
            // InternalLilyChantParser.g:482:2: In
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getInKeyword_2()); 
            }
            match(input,In,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToneAccess().getInKeyword_2()); 
            }

            }


            }

        }
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
    // InternalLilyChantParser.g:491:1: rule__Tone__Group__3 : rule__Tone__Group__3__Impl rule__Tone__Group__4 ;
    public final void rule__Tone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:495:1: ( rule__Tone__Group__3__Impl rule__Tone__Group__4 )
            // InternalLilyChantParser.g:496:2: rule__Tone__Group__3__Impl rule__Tone__Group__4
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
    // InternalLilyChantParser.g:503:1: rule__Tone__Group__3__Impl : ( ( rule__Tone__KeyAssignment_3 ) ) ;
    public final void rule__Tone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:507:1: ( ( ( rule__Tone__KeyAssignment_3 ) ) )
            // InternalLilyChantParser.g:508:1: ( ( rule__Tone__KeyAssignment_3 ) )
            {
            // InternalLilyChantParser.g:508:1: ( ( rule__Tone__KeyAssignment_3 ) )
            // InternalLilyChantParser.g:509:2: ( rule__Tone__KeyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getKeyAssignment_3()); 
            }
            // InternalLilyChantParser.g:510:2: ( rule__Tone__KeyAssignment_3 )
            // InternalLilyChantParser.g:510:3: rule__Tone__KeyAssignment_3
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
    // InternalLilyChantParser.g:518:1: rule__Tone__Group__4 : rule__Tone__Group__4__Impl rule__Tone__Group__5 ;
    public final void rule__Tone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:522:1: ( rule__Tone__Group__4__Impl rule__Tone__Group__5 )
            // InternalLilyChantParser.g:523:2: rule__Tone__Group__4__Impl rule__Tone__Group__5
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
    // InternalLilyChantParser.g:530:1: rule__Tone__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__Tone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:534:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:535:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:535:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:536:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:545:1: rule__Tone__Group__5 : rule__Tone__Group__5__Impl rule__Tone__Group__6 ;
    public final void rule__Tone__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:549:1: ( rule__Tone__Group__5__Impl rule__Tone__Group__6 )
            // InternalLilyChantParser.g:550:2: rule__Tone__Group__5__Impl rule__Tone__Group__6
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
    // InternalLilyChantParser.g:557:1: rule__Tone__Group__5__Impl : ( Voices ) ;
    public final void rule__Tone__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:561:1: ( ( Voices ) )
            // InternalLilyChantParser.g:562:1: ( Voices )
            {
            // InternalLilyChantParser.g:562:1: ( Voices )
            // InternalLilyChantParser.g:563:2: Voices
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
    // InternalLilyChantParser.g:572:1: rule__Tone__Group__6 : rule__Tone__Group__6__Impl rule__Tone__Group__7 ;
    public final void rule__Tone__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:576:1: ( rule__Tone__Group__6__Impl rule__Tone__Group__7 )
            // InternalLilyChantParser.g:577:2: rule__Tone__Group__6__Impl rule__Tone__Group__7
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
    // InternalLilyChantParser.g:584:1: rule__Tone__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__Tone__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:588:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:589:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:589:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:590:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:599:1: rule__Tone__Group__7 : rule__Tone__Group__7__Impl rule__Tone__Group__8 ;
    public final void rule__Tone__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:603:1: ( rule__Tone__Group__7__Impl rule__Tone__Group__8 )
            // InternalLilyChantParser.g:604:2: rule__Tone__Group__7__Impl rule__Tone__Group__8
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
    // InternalLilyChantParser.g:611:1: rule__Tone__Group__7__Impl : ( ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* ) ) ;
    public final void rule__Tone__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:615:1: ( ( ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* ) ) )
            // InternalLilyChantParser.g:616:1: ( ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* ) )
            {
            // InternalLilyChantParser.g:616:1: ( ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* ) )
            // InternalLilyChantParser.g:617:2: ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* )
            {
            // InternalLilyChantParser.g:617:2: ( ( rule__Tone__VoiceNamesAssignment_7 ) )
            // InternalLilyChantParser.g:618:3: ( rule__Tone__VoiceNamesAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getVoiceNamesAssignment_7()); 
            }
            // InternalLilyChantParser.g:619:3: ( rule__Tone__VoiceNamesAssignment_7 )
            // InternalLilyChantParser.g:619:4: rule__Tone__VoiceNamesAssignment_7
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

            // InternalLilyChantParser.g:622:2: ( ( rule__Tone__VoiceNamesAssignment_7 )* )
            // InternalLilyChantParser.g:623:3: ( rule__Tone__VoiceNamesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getVoiceNamesAssignment_7()); 
            }
            // InternalLilyChantParser.g:624:3: ( rule__Tone__VoiceNamesAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLilyChantParser.g:624:4: rule__Tone__VoiceNamesAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Tone__VoiceNamesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalLilyChantParser.g:633:1: rule__Tone__Group__8 : rule__Tone__Group__8__Impl rule__Tone__Group__9 ;
    public final void rule__Tone__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:637:1: ( rule__Tone__Group__8__Impl rule__Tone__Group__9 )
            // InternalLilyChantParser.g:638:2: rule__Tone__Group__8__Impl rule__Tone__Group__9
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
    // InternalLilyChantParser.g:645:1: rule__Tone__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Tone__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:649:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:650:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:650:1: ( RULE_END )
            // InternalLilyChantParser.g:651:2: RULE_END
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
    // InternalLilyChantParser.g:660:1: rule__Tone__Group__9 : rule__Tone__Group__9__Impl rule__Tone__Group__10 ;
    public final void rule__Tone__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:664:1: ( rule__Tone__Group__9__Impl rule__Tone__Group__10 )
            // InternalLilyChantParser.g:665:2: rule__Tone__Group__9__Impl rule__Tone__Group__10
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
    // InternalLilyChantParser.g:672:1: rule__Tone__Group__9__Impl : ( ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* ) ) ;
    public final void rule__Tone__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:676:1: ( ( ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* ) ) )
            // InternalLilyChantParser.g:677:1: ( ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* ) )
            {
            // InternalLilyChantParser.g:677:1: ( ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* ) )
            // InternalLilyChantParser.g:678:2: ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* )
            {
            // InternalLilyChantParser.g:678:2: ( ( rule__Tone__PhrasesAssignment_9 ) )
            // InternalLilyChantParser.g:679:3: ( rule__Tone__PhrasesAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getPhrasesAssignment_9()); 
            }
            // InternalLilyChantParser.g:680:3: ( rule__Tone__PhrasesAssignment_9 )
            // InternalLilyChantParser.g:680:4: rule__Tone__PhrasesAssignment_9
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

            // InternalLilyChantParser.g:683:2: ( ( rule__Tone__PhrasesAssignment_9 )* )
            // InternalLilyChantParser.g:684:3: ( rule__Tone__PhrasesAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getPhrasesAssignment_9()); 
            }
            // InternalLilyChantParser.g:685:3: ( rule__Tone__PhrasesAssignment_9 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Phrase) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLilyChantParser.g:685:4: rule__Tone__PhrasesAssignment_9
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Tone__PhrasesAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalLilyChantParser.g:694:1: rule__Tone__Group__10 : rule__Tone__Group__10__Impl ;
    public final void rule__Tone__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:698:1: ( rule__Tone__Group__10__Impl )
            // InternalLilyChantParser.g:699:2: rule__Tone__Group__10__Impl
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
    // InternalLilyChantParser.g:705:1: rule__Tone__Group__10__Impl : ( RULE_END ) ;
    public final void rule__Tone__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:709:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:710:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:710:1: ( RULE_END )
            // InternalLilyChantParser.g:711:2: RULE_END
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
    // InternalLilyChantParser.g:721:1: rule__TonePhrase__Group__0 : rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1 ;
    public final void rule__TonePhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:725:1: ( rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1 )
            // InternalLilyChantParser.g:726:2: rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1
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
    // InternalLilyChantParser.g:733:1: rule__TonePhrase__Group__0__Impl : ( Phrase ) ;
    public final void rule__TonePhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:737:1: ( ( Phrase ) )
            // InternalLilyChantParser.g:738:1: ( Phrase )
            {
            // InternalLilyChantParser.g:738:1: ( Phrase )
            // InternalLilyChantParser.g:739:2: Phrase
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
    // InternalLilyChantParser.g:748:1: rule__TonePhrase__Group__1 : rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2 ;
    public final void rule__TonePhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:752:1: ( rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2 )
            // InternalLilyChantParser.g:753:2: rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2
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
    // InternalLilyChantParser.g:760:1: rule__TonePhrase__Group__1__Impl : ( ( rule__TonePhrase__NameAssignment_1 ) ) ;
    public final void rule__TonePhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:764:1: ( ( ( rule__TonePhrase__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:765:1: ( ( rule__TonePhrase__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:765:1: ( ( rule__TonePhrase__NameAssignment_1 ) )
            // InternalLilyChantParser.g:766:2: ( rule__TonePhrase__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:767:2: ( rule__TonePhrase__NameAssignment_1 )
            // InternalLilyChantParser.g:767:3: rule__TonePhrase__NameAssignment_1
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
    // InternalLilyChantParser.g:775:1: rule__TonePhrase__Group__2 : rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3 ;
    public final void rule__TonePhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:779:1: ( rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3 )
            // InternalLilyChantParser.g:780:2: rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3
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
    // InternalLilyChantParser.g:787:1: rule__TonePhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__TonePhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:791:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:792:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:792:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:793:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:802:1: rule__TonePhrase__Group__3 : rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4 ;
    public final void rule__TonePhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:806:1: ( rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4 )
            // InternalLilyChantParser.g:807:2: rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4
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
    // InternalLilyChantParser.g:814:1: rule__TonePhrase__Group__3__Impl : ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) ) ;
    public final void rule__TonePhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:818:1: ( ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:819:1: ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:819:1: ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) )
            // InternalLilyChantParser.g:820:2: ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* )
            {
            // InternalLilyChantParser.g:820:2: ( ( rule__TonePhrase__VoicesAssignment_3 ) )
            // InternalLilyChantParser.g:821:3: ( rule__TonePhrase__VoicesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            }
            // InternalLilyChantParser.g:822:3: ( rule__TonePhrase__VoicesAssignment_3 )
            // InternalLilyChantParser.g:822:4: rule__TonePhrase__VoicesAssignment_3
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

            // InternalLilyChantParser.g:825:2: ( ( rule__TonePhrase__VoicesAssignment_3 )* )
            // InternalLilyChantParser.g:826:3: ( rule__TonePhrase__VoicesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            }
            // InternalLilyChantParser.g:827:3: ( rule__TonePhrase__VoicesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Voice) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLilyChantParser.g:827:4: rule__TonePhrase__VoicesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalLilyChantParser.g:836:1: rule__TonePhrase__Group__4 : rule__TonePhrase__Group__4__Impl ;
    public final void rule__TonePhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:840:1: ( rule__TonePhrase__Group__4__Impl )
            // InternalLilyChantParser.g:841:2: rule__TonePhrase__Group__4__Impl
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
    // InternalLilyChantParser.g:847:1: rule__TonePhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__TonePhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:851:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:852:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:852:1: ( RULE_END )
            // InternalLilyChantParser.g:853:2: RULE_END
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
    // InternalLilyChantParser.g:863:1: rule__VoicePhrase__Group__0 : rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1 ;
    public final void rule__VoicePhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:867:1: ( rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1 )
            // InternalLilyChantParser.g:868:2: rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1
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
    // InternalLilyChantParser.g:875:1: rule__VoicePhrase__Group__0__Impl : ( Voice ) ;
    public final void rule__VoicePhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:879:1: ( ( Voice ) )
            // InternalLilyChantParser.g:880:1: ( Voice )
            {
            // InternalLilyChantParser.g:880:1: ( Voice )
            // InternalLilyChantParser.g:881:2: Voice
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
    // InternalLilyChantParser.g:890:1: rule__VoicePhrase__Group__1 : rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2 ;
    public final void rule__VoicePhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:894:1: ( rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2 )
            // InternalLilyChantParser.g:895:2: rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2
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
    // InternalLilyChantParser.g:902:1: rule__VoicePhrase__Group__1__Impl : ( ( rule__VoicePhrase__NameAssignment_1 ) ) ;
    public final void rule__VoicePhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:906:1: ( ( ( rule__VoicePhrase__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:907:1: ( ( rule__VoicePhrase__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:907:1: ( ( rule__VoicePhrase__NameAssignment_1 ) )
            // InternalLilyChantParser.g:908:2: ( rule__VoicePhrase__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:909:2: ( rule__VoicePhrase__NameAssignment_1 )
            // InternalLilyChantParser.g:909:3: rule__VoicePhrase__NameAssignment_1
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
    // InternalLilyChantParser.g:917:1: rule__VoicePhrase__Group__2 : rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3 ;
    public final void rule__VoicePhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:921:1: ( rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3 )
            // InternalLilyChantParser.g:922:2: rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3
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
    // InternalLilyChantParser.g:929:1: rule__VoicePhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__VoicePhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:933:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:934:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:934:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:935:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:944:1: rule__VoicePhrase__Group__3 : rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4 ;
    public final void rule__VoicePhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:948:1: ( rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4 )
            // InternalLilyChantParser.g:949:2: rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4
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
    // InternalLilyChantParser.g:956:1: rule__VoicePhrase__Group__3__Impl : ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) ) ;
    public final void rule__VoicePhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:960:1: ( ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:961:1: ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:961:1: ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) )
            // InternalLilyChantParser.g:962:2: ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* )
            {
            // InternalLilyChantParser.g:962:2: ( ( rule__VoicePhrase__NotesAssignment_3 ) )
            // InternalLilyChantParser.g:963:3: ( rule__VoicePhrase__NotesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            }
            // InternalLilyChantParser.g:964:3: ( rule__VoicePhrase__NotesAssignment_3 )
            // InternalLilyChantParser.g:964:4: rule__VoicePhrase__NotesAssignment_3
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

            // InternalLilyChantParser.g:967:2: ( ( rule__VoicePhrase__NotesAssignment_3 )* )
            // InternalLilyChantParser.g:968:3: ( rule__VoicePhrase__NotesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            }
            // InternalLilyChantParser.g:969:3: ( rule__VoicePhrase__NotesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLilyChantParser.g:969:4: rule__VoicePhrase__NotesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
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
    // InternalLilyChantParser.g:978:1: rule__VoicePhrase__Group__4 : rule__VoicePhrase__Group__4__Impl ;
    public final void rule__VoicePhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:982:1: ( rule__VoicePhrase__Group__4__Impl )
            // InternalLilyChantParser.g:983:2: rule__VoicePhrase__Group__4__Impl
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
    // InternalLilyChantParser.g:989:1: rule__VoicePhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__VoicePhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:993:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:994:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:994:1: ( RULE_END )
            // InternalLilyChantParser.g:995:2: RULE_END
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
    // InternalLilyChantParser.g:1005:1: rule__Chant__Group__0 : rule__Chant__Group__0__Impl rule__Chant__Group__1 ;
    public final void rule__Chant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1009:1: ( rule__Chant__Group__0__Impl rule__Chant__Group__1 )
            // InternalLilyChantParser.g:1010:2: rule__Chant__Group__0__Impl rule__Chant__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalLilyChantParser.g:1017:1: rule__Chant__Group__0__Impl : ( Chant ) ;
    public final void rule__Chant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1021:1: ( ( Chant ) )
            // InternalLilyChantParser.g:1022:1: ( Chant )
            {
            // InternalLilyChantParser.g:1022:1: ( Chant )
            // InternalLilyChantParser.g:1023:2: Chant
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
    // InternalLilyChantParser.g:1032:1: rule__Chant__Group__1 : rule__Chant__Group__1__Impl rule__Chant__Group__2 ;
    public final void rule__Chant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1036:1: ( rule__Chant__Group__1__Impl rule__Chant__Group__2 )
            // InternalLilyChantParser.g:1037:2: rule__Chant__Group__1__Impl rule__Chant__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalLilyChantParser.g:1044:1: rule__Chant__Group__1__Impl : ( In ) ;
    public final void rule__Chant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1048:1: ( ( In ) )
            // InternalLilyChantParser.g:1049:1: ( In )
            {
            // InternalLilyChantParser.g:1049:1: ( In )
            // InternalLilyChantParser.g:1050:2: In
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getInKeyword_1()); 
            }
            match(input,In,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getInKeyword_1()); 
            }

            }


            }

        }
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
    // InternalLilyChantParser.g:1059:1: rule__Chant__Group__2 : rule__Chant__Group__2__Impl rule__Chant__Group__3 ;
    public final void rule__Chant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1063:1: ( rule__Chant__Group__2__Impl rule__Chant__Group__3 )
            // InternalLilyChantParser.g:1064:2: rule__Chant__Group__2__Impl rule__Chant__Group__3
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
    // InternalLilyChantParser.g:1071:1: rule__Chant__Group__2__Impl : ( Tone ) ;
    public final void rule__Chant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1075:1: ( ( Tone ) )
            // InternalLilyChantParser.g:1076:1: ( Tone )
            {
            // InternalLilyChantParser.g:1076:1: ( Tone )
            // InternalLilyChantParser.g:1077:2: Tone
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
    // InternalLilyChantParser.g:1086:1: rule__Chant__Group__3 : rule__Chant__Group__3__Impl rule__Chant__Group__4 ;
    public final void rule__Chant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1090:1: ( rule__Chant__Group__3__Impl rule__Chant__Group__4 )
            // InternalLilyChantParser.g:1091:2: rule__Chant__Group__3__Impl rule__Chant__Group__4
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
    // InternalLilyChantParser.g:1098:1: rule__Chant__Group__3__Impl : ( ( rule__Chant__ToneAssignment_3 ) ) ;
    public final void rule__Chant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1102:1: ( ( ( rule__Chant__ToneAssignment_3 ) ) )
            // InternalLilyChantParser.g:1103:1: ( ( rule__Chant__ToneAssignment_3 ) )
            {
            // InternalLilyChantParser.g:1103:1: ( ( rule__Chant__ToneAssignment_3 ) )
            // InternalLilyChantParser.g:1104:2: ( rule__Chant__ToneAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getToneAssignment_3()); 
            }
            // InternalLilyChantParser.g:1105:2: ( rule__Chant__ToneAssignment_3 )
            // InternalLilyChantParser.g:1105:3: rule__Chant__ToneAssignment_3
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
    // InternalLilyChantParser.g:1113:1: rule__Chant__Group__4 : rule__Chant__Group__4__Impl rule__Chant__Group__5 ;
    public final void rule__Chant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1117:1: ( rule__Chant__Group__4__Impl rule__Chant__Group__5 )
            // InternalLilyChantParser.g:1118:2: rule__Chant__Group__4__Impl rule__Chant__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalLilyChantParser.g:1125:1: rule__Chant__Group__4__Impl : ( In ) ;
    public final void rule__Chant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1129:1: ( ( In ) )
            // InternalLilyChantParser.g:1130:1: ( In )
            {
            // InternalLilyChantParser.g:1130:1: ( In )
            // InternalLilyChantParser.g:1131:2: In
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getInKeyword_4()); 
            }
            match(input,In,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getInKeyword_4()); 
            }

            }


            }

        }
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
    // InternalLilyChantParser.g:1140:1: rule__Chant__Group__5 : rule__Chant__Group__5__Impl rule__Chant__Group__6 ;
    public final void rule__Chant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1144:1: ( rule__Chant__Group__5__Impl rule__Chant__Group__6 )
            // InternalLilyChantParser.g:1145:2: rule__Chant__Group__5__Impl rule__Chant__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalLilyChantParser.g:1152:1: rule__Chant__Group__5__Impl : ( ( rule__Chant__KeyAssignment_5 ) ) ;
    public final void rule__Chant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1156:1: ( ( ( rule__Chant__KeyAssignment_5 ) ) )
            // InternalLilyChantParser.g:1157:1: ( ( rule__Chant__KeyAssignment_5 ) )
            {
            // InternalLilyChantParser.g:1157:1: ( ( rule__Chant__KeyAssignment_5 ) )
            // InternalLilyChantParser.g:1158:2: ( rule__Chant__KeyAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getKeyAssignment_5()); 
            }
            // InternalLilyChantParser.g:1159:2: ( rule__Chant__KeyAssignment_5 )
            // InternalLilyChantParser.g:1159:3: rule__Chant__KeyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Chant__KeyAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getKeyAssignment_5()); 
            }

            }


            }

        }
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
    // InternalLilyChantParser.g:1167:1: rule__Chant__Group__6 : rule__Chant__Group__6__Impl rule__Chant__Group__7 ;
    public final void rule__Chant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1171:1: ( rule__Chant__Group__6__Impl rule__Chant__Group__7 )
            // InternalLilyChantParser.g:1172:2: rule__Chant__Group__6__Impl rule__Chant__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalLilyChantParser.g:1179:1: rule__Chant__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__Chant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1183:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:1184:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:1184:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:1185:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getBEGINTerminalRuleCall_6()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getBEGINTerminalRuleCall_6()); 
            }

            }


            }

        }
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
    // InternalLilyChantParser.g:1194:1: rule__Chant__Group__7 : rule__Chant__Group__7__Impl rule__Chant__Group__8 ;
    public final void rule__Chant__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1198:1: ( rule__Chant__Group__7__Impl rule__Chant__Group__8 )
            // InternalLilyChantParser.g:1199:2: rule__Chant__Group__7__Impl rule__Chant__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Chant__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Chant__Group__8();

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
    // InternalLilyChantParser.g:1206:1: rule__Chant__Group__7__Impl : ( ( ( rule__Chant__PhrasesAssignment_7 ) ) ( ( rule__Chant__PhrasesAssignment_7 )* ) ) ;
    public final void rule__Chant__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1210:1: ( ( ( ( rule__Chant__PhrasesAssignment_7 ) ) ( ( rule__Chant__PhrasesAssignment_7 )* ) ) )
            // InternalLilyChantParser.g:1211:1: ( ( ( rule__Chant__PhrasesAssignment_7 ) ) ( ( rule__Chant__PhrasesAssignment_7 )* ) )
            {
            // InternalLilyChantParser.g:1211:1: ( ( ( rule__Chant__PhrasesAssignment_7 ) ) ( ( rule__Chant__PhrasesAssignment_7 )* ) )
            // InternalLilyChantParser.g:1212:2: ( ( rule__Chant__PhrasesAssignment_7 ) ) ( ( rule__Chant__PhrasesAssignment_7 )* )
            {
            // InternalLilyChantParser.g:1212:2: ( ( rule__Chant__PhrasesAssignment_7 ) )
            // InternalLilyChantParser.g:1213:3: ( rule__Chant__PhrasesAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getPhrasesAssignment_7()); 
            }
            // InternalLilyChantParser.g:1214:3: ( rule__Chant__PhrasesAssignment_7 )
            // InternalLilyChantParser.g:1214:4: rule__Chant__PhrasesAssignment_7
            {
            pushFollow(FOLLOW_13);
            rule__Chant__PhrasesAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getPhrasesAssignment_7()); 
            }

            }

            // InternalLilyChantParser.g:1217:2: ( ( rule__Chant__PhrasesAssignment_7 )* )
            // InternalLilyChantParser.g:1218:3: ( rule__Chant__PhrasesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getPhrasesAssignment_7()); 
            }
            // InternalLilyChantParser.g:1219:3: ( rule__Chant__PhrasesAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Phrase) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLilyChantParser.g:1219:4: rule__Chant__PhrasesAssignment_7
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Chant__PhrasesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getPhrasesAssignment_7()); 
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
    // $ANTLR end "rule__Chant__Group__7__Impl"


    // $ANTLR start "rule__Chant__Group__8"
    // InternalLilyChantParser.g:1228:1: rule__Chant__Group__8 : rule__Chant__Group__8__Impl ;
    public final void rule__Chant__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1232:1: ( rule__Chant__Group__8__Impl )
            // InternalLilyChantParser.g:1233:2: rule__Chant__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chant__Group__8__Impl();

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
    // $ANTLR end "rule__Chant__Group__8"


    // $ANTLR start "rule__Chant__Group__8__Impl"
    // InternalLilyChantParser.g:1239:1: rule__Chant__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Chant__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1243:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:1244:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:1244:1: ( RULE_END )
            // InternalLilyChantParser.g:1245:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getENDTerminalRuleCall_8()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getENDTerminalRuleCall_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__Group__8__Impl"


    // $ANTLR start "rule__LyricPhrase__Group__0"
    // InternalLilyChantParser.g:1255:1: rule__LyricPhrase__Group__0 : rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1 ;
    public final void rule__LyricPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1259:1: ( rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1 )
            // InternalLilyChantParser.g:1260:2: rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1
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
    // InternalLilyChantParser.g:1267:1: rule__LyricPhrase__Group__0__Impl : ( Phrase ) ;
    public final void rule__LyricPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1271:1: ( ( Phrase ) )
            // InternalLilyChantParser.g:1272:1: ( Phrase )
            {
            // InternalLilyChantParser.g:1272:1: ( Phrase )
            // InternalLilyChantParser.g:1273:2: Phrase
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
    // InternalLilyChantParser.g:1282:1: rule__LyricPhrase__Group__1 : rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2 ;
    public final void rule__LyricPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1286:1: ( rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2 )
            // InternalLilyChantParser.g:1287:2: rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2
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
    // InternalLilyChantParser.g:1294:1: rule__LyricPhrase__Group__1__Impl : ( ( rule__LyricPhrase__NotesAssignment_1 ) ) ;
    public final void rule__LyricPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1298:1: ( ( ( rule__LyricPhrase__NotesAssignment_1 ) ) )
            // InternalLilyChantParser.g:1299:1: ( ( rule__LyricPhrase__NotesAssignment_1 ) )
            {
            // InternalLilyChantParser.g:1299:1: ( ( rule__LyricPhrase__NotesAssignment_1 ) )
            // InternalLilyChantParser.g:1300:2: ( rule__LyricPhrase__NotesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNotesAssignment_1()); 
            }
            // InternalLilyChantParser.g:1301:2: ( rule__LyricPhrase__NotesAssignment_1 )
            // InternalLilyChantParser.g:1301:3: rule__LyricPhrase__NotesAssignment_1
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
    // InternalLilyChantParser.g:1309:1: rule__LyricPhrase__Group__2 : rule__LyricPhrase__Group__2__Impl rule__LyricPhrase__Group__3 ;
    public final void rule__LyricPhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1313:1: ( rule__LyricPhrase__Group__2__Impl rule__LyricPhrase__Group__3 )
            // InternalLilyChantParser.g:1314:2: rule__LyricPhrase__Group__2__Impl rule__LyricPhrase__Group__3
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
    // InternalLilyChantParser.g:1321:1: rule__LyricPhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__LyricPhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1325:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:1326:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:1326:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:1327:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:1336:1: rule__LyricPhrase__Group__3 : rule__LyricPhrase__Group__3__Impl rule__LyricPhrase__Group__4 ;
    public final void rule__LyricPhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1340:1: ( rule__LyricPhrase__Group__3__Impl rule__LyricPhrase__Group__4 )
            // InternalLilyChantParser.g:1341:2: rule__LyricPhrase__Group__3__Impl rule__LyricPhrase__Group__4
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
    // InternalLilyChantParser.g:1348:1: rule__LyricPhrase__Group__3__Impl : ( ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* ) ) ;
    public final void rule__LyricPhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1352:1: ( ( ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:1353:1: ( ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:1353:1: ( ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* ) )
            // InternalLilyChantParser.g:1354:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* )
            {
            // InternalLilyChantParser.g:1354:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) )
            // InternalLilyChantParser.g:1355:3: ( rule__LyricPhrase__NoteGroupsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_3()); 
            }
            // InternalLilyChantParser.g:1356:3: ( rule__LyricPhrase__NoteGroupsAssignment_3 )
            // InternalLilyChantParser.g:1356:4: rule__LyricPhrase__NoteGroupsAssignment_3
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

            // InternalLilyChantParser.g:1359:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* )
            // InternalLilyChantParser.g:1360:3: ( rule__LyricPhrase__NoteGroupsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_3()); 
            }
            // InternalLilyChantParser.g:1361:3: ( rule__LyricPhrase__NoteGroupsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==RULE_HYPHEN||LA12_0==RULE_START_NOTE_GROUP) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLilyChantParser.g:1361:4: rule__LyricPhrase__NoteGroupsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__LyricPhrase__NoteGroupsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalLilyChantParser.g:1370:1: rule__LyricPhrase__Group__4 : rule__LyricPhrase__Group__4__Impl ;
    public final void rule__LyricPhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1374:1: ( rule__LyricPhrase__Group__4__Impl )
            // InternalLilyChantParser.g:1375:2: rule__LyricPhrase__Group__4__Impl
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
    // InternalLilyChantParser.g:1381:1: rule__LyricPhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__LyricPhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1385:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:1386:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:1386:1: ( RULE_END )
            // InternalLilyChantParser.g:1387:2: RULE_END
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
    // InternalLilyChantParser.g:1397:1: rule__NoteGroup__Group_0__0 : rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1 ;
    public final void rule__NoteGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1401:1: ( rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1 )
            // InternalLilyChantParser.g:1402:2: rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1
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
    // InternalLilyChantParser.g:1409:1: rule__NoteGroup__Group_0__0__Impl : ( ( rule__NoteGroup__Alternatives_0_0 ) ) ;
    public final void rule__NoteGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1413:1: ( ( ( rule__NoteGroup__Alternatives_0_0 ) ) )
            // InternalLilyChantParser.g:1414:1: ( ( rule__NoteGroup__Alternatives_0_0 ) )
            {
            // InternalLilyChantParser.g:1414:1: ( ( rule__NoteGroup__Alternatives_0_0 ) )
            // InternalLilyChantParser.g:1415:2: ( rule__NoteGroup__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getAlternatives_0_0()); 
            }
            // InternalLilyChantParser.g:1416:2: ( rule__NoteGroup__Alternatives_0_0 )
            // InternalLilyChantParser.g:1416:3: rule__NoteGroup__Alternatives_0_0
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
    // InternalLilyChantParser.g:1424:1: rule__NoteGroup__Group_0__1 : rule__NoteGroup__Group_0__1__Impl ;
    public final void rule__NoteGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1428:1: ( rule__NoteGroup__Group_0__1__Impl )
            // InternalLilyChantParser.g:1429:2: rule__NoteGroup__Group_0__1__Impl
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
    // InternalLilyChantParser.g:1435:1: rule__NoteGroup__Group_0__1__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_1 )? ) ;
    public final void rule__NoteGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1439:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_1 )? ) )
            // InternalLilyChantParser.g:1440:1: ( ( rule__NoteGroup__SyllablesAssignment_0_1 )? )
            {
            // InternalLilyChantParser.g:1440:1: ( ( rule__NoteGroup__SyllablesAssignment_0_1 )? )
            // InternalLilyChantParser.g:1441:2: ( rule__NoteGroup__SyllablesAssignment_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_1()); 
            }
            // InternalLilyChantParser.g:1442:2: ( rule__NoteGroup__SyllablesAssignment_0_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_EXTENDER) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLilyChantParser.g:1442:3: rule__NoteGroup__SyllablesAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NoteGroup__SyllablesAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

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
    // InternalLilyChantParser.g:1451:1: rule__NoteGroup__Group_0_0_0__0 : rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1 ;
    public final void rule__NoteGroup__Group_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1455:1: ( rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1 )
            // InternalLilyChantParser.g:1456:2: rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalLilyChantParser.g:1463:1: rule__NoteGroup__Group_0_0_0__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1467:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) ) )
            // InternalLilyChantParser.g:1468:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) )
            {
            // InternalLilyChantParser.g:1468:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) )
            // InternalLilyChantParser.g:1469:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_0()); 
            }
            // InternalLilyChantParser.g:1470:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 )
            // InternalLilyChantParser.g:1470:3: rule__NoteGroup__SyllablesAssignment_0_0_0_0
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
    // InternalLilyChantParser.g:1478:1: rule__NoteGroup__Group_0_0_0__1 : rule__NoteGroup__Group_0_0_0__1__Impl ;
    public final void rule__NoteGroup__Group_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1482:1: ( rule__NoteGroup__Group_0_0_0__1__Impl )
            // InternalLilyChantParser.g:1483:2: rule__NoteGroup__Group_0_0_0__1__Impl
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
    // InternalLilyChantParser.g:1489:1: rule__NoteGroup__Group_0_0_0__1__Impl : ( ( rule__NoteGroup__Group_0_0_0_1__0 )? ) ;
    public final void rule__NoteGroup__Group_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1493:1: ( ( ( rule__NoteGroup__Group_0_0_0_1__0 )? ) )
            // InternalLilyChantParser.g:1494:1: ( ( rule__NoteGroup__Group_0_0_0_1__0 )? )
            {
            // InternalLilyChantParser.g:1494:1: ( ( rule__NoteGroup__Group_0_0_0_1__0 )? )
            // InternalLilyChantParser.g:1495:2: ( rule__NoteGroup__Group_0_0_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getGroup_0_0_0_1()); 
            }
            // InternalLilyChantParser.g:1496:2: ( rule__NoteGroup__Group_0_0_0_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_HYPHEN) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    int LA14_3 = input.LA(3);

                    if ( (synpred14_InternalLilyChantParser()) ) {
                        alt14=1;
                    }
                }
                else if ( (LA14_1==EOF||(LA14_1>=RULE_HYPHEN && LA14_1<=RULE_START_NOTE_GROUP)||LA14_1==RULE_END) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalLilyChantParser.g:1496:3: rule__NoteGroup__Group_0_0_0_1__0
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
    // InternalLilyChantParser.g:1505:1: rule__NoteGroup__Group_0_0_0_1__0 : rule__NoteGroup__Group_0_0_0_1__0__Impl ;
    public final void rule__NoteGroup__Group_0_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1509:1: ( rule__NoteGroup__Group_0_0_0_1__0__Impl )
            // InternalLilyChantParser.g:1510:2: rule__NoteGroup__Group_0_0_0_1__0__Impl
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
    // InternalLilyChantParser.g:1516:1: rule__NoteGroup__Group_0_0_0_1__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1520:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) ) )
            // InternalLilyChantParser.g:1521:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) )
            {
            // InternalLilyChantParser.g:1521:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) )
            // InternalLilyChantParser.g:1522:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_1_0()); 
            }
            // InternalLilyChantParser.g:1523:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 )
            // InternalLilyChantParser.g:1523:3: rule__NoteGroup__SyllablesAssignment_0_0_0_1_0
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
    // InternalLilyChantParser.g:1532:1: rule__NoteGroup__Group_0_0_1__0 : rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1 ;
    public final void rule__NoteGroup__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1536:1: ( rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1 )
            // InternalLilyChantParser.g:1537:2: rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1
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
    // InternalLilyChantParser.g:1544:1: rule__NoteGroup__Group_0_0_1__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1548:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) ) )
            // InternalLilyChantParser.g:1549:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) )
            {
            // InternalLilyChantParser.g:1549:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) )
            // InternalLilyChantParser.g:1550:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_0()); 
            }
            // InternalLilyChantParser.g:1551:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 )
            // InternalLilyChantParser.g:1551:3: rule__NoteGroup__SyllablesAssignment_0_0_1_0
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
    // InternalLilyChantParser.g:1559:1: rule__NoteGroup__Group_0_0_1__1 : rule__NoteGroup__Group_0_0_1__1__Impl ;
    public final void rule__NoteGroup__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1563:1: ( rule__NoteGroup__Group_0_0_1__1__Impl )
            // InternalLilyChantParser.g:1564:2: rule__NoteGroup__Group_0_0_1__1__Impl
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
    // InternalLilyChantParser.g:1570:1: rule__NoteGroup__Group_0_0_1__1__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) ) ;
    public final void rule__NoteGroup__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1574:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) ) )
            // InternalLilyChantParser.g:1575:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) )
            {
            // InternalLilyChantParser.g:1575:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) )
            // InternalLilyChantParser.g:1576:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_1()); 
            }
            // InternalLilyChantParser.g:1577:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 )
            // InternalLilyChantParser.g:1577:3: rule__NoteGroup__SyllablesAssignment_0_0_1_1
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
    // InternalLilyChantParser.g:1586:1: rule__NoteGroup__Group_1__0 : rule__NoteGroup__Group_1__0__Impl rule__NoteGroup__Group_1__1 ;
    public final void rule__NoteGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1590:1: ( rule__NoteGroup__Group_1__0__Impl rule__NoteGroup__Group_1__1 )
            // InternalLilyChantParser.g:1591:2: rule__NoteGroup__Group_1__0__Impl rule__NoteGroup__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalLilyChantParser.g:1598:1: rule__NoteGroup__Group_1__0__Impl : ( RULE_START_NOTE_GROUP ) ;
    public final void rule__NoteGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1602:1: ( ( RULE_START_NOTE_GROUP ) )
            // InternalLilyChantParser.g:1603:1: ( RULE_START_NOTE_GROUP )
            {
            // InternalLilyChantParser.g:1603:1: ( RULE_START_NOTE_GROUP )
            // InternalLilyChantParser.g:1604:2: RULE_START_NOTE_GROUP
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
    // InternalLilyChantParser.g:1613:1: rule__NoteGroup__Group_1__1 : rule__NoteGroup__Group_1__1__Impl rule__NoteGroup__Group_1__2 ;
    public final void rule__NoteGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1617:1: ( rule__NoteGroup__Group_1__1__Impl rule__NoteGroup__Group_1__2 )
            // InternalLilyChantParser.g:1618:2: rule__NoteGroup__Group_1__1__Impl rule__NoteGroup__Group_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalLilyChantParser.g:1625:1: rule__NoteGroup__Group_1__1__Impl : ( ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* ) ) ;
    public final void rule__NoteGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1629:1: ( ( ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* ) ) )
            // InternalLilyChantParser.g:1630:1: ( ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* ) )
            {
            // InternalLilyChantParser.g:1630:1: ( ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* ) )
            // InternalLilyChantParser.g:1631:2: ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* )
            {
            // InternalLilyChantParser.g:1631:2: ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) )
            // InternalLilyChantParser.g:1632:3: ( rule__NoteGroup__SyllablesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); 
            }
            // InternalLilyChantParser.g:1633:3: ( rule__NoteGroup__SyllablesAssignment_1_1 )
            // InternalLilyChantParser.g:1633:4: rule__NoteGroup__SyllablesAssignment_1_1
            {
            pushFollow(FOLLOW_23);
            rule__NoteGroup__SyllablesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); 
            }

            }

            // InternalLilyChantParser.g:1636:2: ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* )
            // InternalLilyChantParser.g:1637:3: ( rule__NoteGroup__SyllablesAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); 
            }
            // InternalLilyChantParser.g:1638:3: ( rule__NoteGroup__SyllablesAssignment_1_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==RULE_HYPHEN) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLilyChantParser.g:1638:4: rule__NoteGroup__SyllablesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__NoteGroup__SyllablesAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalLilyChantParser.g:1647:1: rule__NoteGroup__Group_1__2 : rule__NoteGroup__Group_1__2__Impl ;
    public final void rule__NoteGroup__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1651:1: ( rule__NoteGroup__Group_1__2__Impl )
            // InternalLilyChantParser.g:1652:2: rule__NoteGroup__Group_1__2__Impl
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
    // InternalLilyChantParser.g:1658:1: rule__NoteGroup__Group_1__2__Impl : ( RULE_END_NOTE_GROUP ) ;
    public final void rule__NoteGroup__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1662:1: ( ( RULE_END_NOTE_GROUP ) )
            // InternalLilyChantParser.g:1663:1: ( RULE_END_NOTE_GROUP )
            {
            // InternalLilyChantParser.g:1663:1: ( RULE_END_NOTE_GROUP )
            // InternalLilyChantParser.g:1664:2: RULE_END_NOTE_GROUP
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
    // InternalLilyChantParser.g:1674:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1678:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalLilyChantParser.g:1679:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalLilyChantParser.g:1686:1: rule__Note__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1690:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1691:1: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1691:1: ( RULE_ID )
            // InternalLilyChantParser.g:1692:2: RULE_ID
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
    // InternalLilyChantParser.g:1701:1: rule__Note__Group__1 : rule__Note__Group__1__Impl ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1705:1: ( rule__Note__Group__1__Impl )
            // InternalLilyChantParser.g:1706:2: rule__Note__Group__1__Impl
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
    // InternalLilyChantParser.g:1712:1: rule__Note__Group__1__Impl : ( ( RULE_DURATION )? ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1716:1: ( ( ( RULE_DURATION )? ) )
            // InternalLilyChantParser.g:1717:1: ( ( RULE_DURATION )? )
            {
            // InternalLilyChantParser.g:1717:1: ( ( RULE_DURATION )? )
            // InternalLilyChantParser.g:1718:2: ( RULE_DURATION )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getDURATIONTerminalRuleCall_1()); 
            }
            // InternalLilyChantParser.g:1719:2: ( RULE_DURATION )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DURATION) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLilyChantParser.g:1719:3: RULE_DURATION
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
    // InternalLilyChantParser.g:1728:1: rule__Script__TonesAssignment_0 : ( ruleTone ) ;
    public final void rule__Script__TonesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1732:1: ( ( ruleTone ) )
            // InternalLilyChantParser.g:1733:2: ( ruleTone )
            {
            // InternalLilyChantParser.g:1733:2: ( ruleTone )
            // InternalLilyChantParser.g:1734:3: ruleTone
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
    // InternalLilyChantParser.g:1743:1: rule__Script__ChantsAssignment_1 : ( ruleChant ) ;
    public final void rule__Script__ChantsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1747:1: ( ( ruleChant ) )
            // InternalLilyChantParser.g:1748:2: ( ruleChant )
            {
            // InternalLilyChantParser.g:1748:2: ( ruleChant )
            // InternalLilyChantParser.g:1749:3: ruleChant
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
    // InternalLilyChantParser.g:1758:1: rule__Tone__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tone__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1762:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1763:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1763:2: ( RULE_ID )
            // InternalLilyChantParser.g:1764:3: RULE_ID
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
    // InternalLilyChantParser.g:1773:1: rule__Tone__KeyAssignment_3 : ( RULE_ID ) ;
    public final void rule__Tone__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1777:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1778:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1778:2: ( RULE_ID )
            // InternalLilyChantParser.g:1779:3: RULE_ID
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
    // InternalLilyChantParser.g:1788:1: rule__Tone__VoiceNamesAssignment_7 : ( ruleVoiceName ) ;
    public final void rule__Tone__VoiceNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1792:1: ( ( ruleVoiceName ) )
            // InternalLilyChantParser.g:1793:2: ( ruleVoiceName )
            {
            // InternalLilyChantParser.g:1793:2: ( ruleVoiceName )
            // InternalLilyChantParser.g:1794:3: ruleVoiceName
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
    // InternalLilyChantParser.g:1803:1: rule__Tone__PhrasesAssignment_9 : ( ruleTonePhrase ) ;
    public final void rule__Tone__PhrasesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1807:1: ( ( ruleTonePhrase ) )
            // InternalLilyChantParser.g:1808:2: ( ruleTonePhrase )
            {
            // InternalLilyChantParser.g:1808:2: ( ruleTonePhrase )
            // InternalLilyChantParser.g:1809:3: ruleTonePhrase
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
    // InternalLilyChantParser.g:1818:1: rule__VoiceName__NameAssignment : ( RULE_ID ) ;
    public final void rule__VoiceName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1822:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1823:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1823:2: ( RULE_ID )
            // InternalLilyChantParser.g:1824:3: RULE_ID
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
    // InternalLilyChantParser.g:1833:1: rule__TonePhrase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TonePhrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1837:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1838:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1838:2: ( RULE_ID )
            // InternalLilyChantParser.g:1839:3: RULE_ID
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
    // InternalLilyChantParser.g:1848:1: rule__TonePhrase__VoicesAssignment_3 : ( ruleVoicePhrase ) ;
    public final void rule__TonePhrase__VoicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1852:1: ( ( ruleVoicePhrase ) )
            // InternalLilyChantParser.g:1853:2: ( ruleVoicePhrase )
            {
            // InternalLilyChantParser.g:1853:2: ( ruleVoicePhrase )
            // InternalLilyChantParser.g:1854:3: ruleVoicePhrase
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
    // InternalLilyChantParser.g:1863:1: rule__VoicePhrase__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VoicePhrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1867:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:1868:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:1868:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1869:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNameVoiceNameCrossReference_1_0()); 
            }
            // InternalLilyChantParser.g:1870:3: ( RULE_ID )
            // InternalLilyChantParser.g:1871:4: RULE_ID
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
    // InternalLilyChantParser.g:1882:1: rule__VoicePhrase__NotesAssignment_3 : ( ruleNote ) ;
    public final void rule__VoicePhrase__NotesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1886:1: ( ( ruleNote ) )
            // InternalLilyChantParser.g:1887:2: ( ruleNote )
            {
            // InternalLilyChantParser.g:1887:2: ( ruleNote )
            // InternalLilyChantParser.g:1888:3: ruleNote
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


    // $ANTLR start "rule__Chant__ToneAssignment_3"
    // InternalLilyChantParser.g:1897:1: rule__Chant__ToneAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Chant__ToneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1901:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:1902:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:1902:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1903:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getToneToneCrossReference_3_0()); 
            }
            // InternalLilyChantParser.g:1904:3: ( RULE_ID )
            // InternalLilyChantParser.g:1905:4: RULE_ID
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


    // $ANTLR start "rule__Chant__KeyAssignment_5"
    // InternalLilyChantParser.g:1916:1: rule__Chant__KeyAssignment_5 : ( RULE_ID ) ;
    public final void rule__Chant__KeyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1920:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1921:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1921:2: ( RULE_ID )
            // InternalLilyChantParser.g:1922:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getKeyIDTerminalRuleCall_5_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getKeyIDTerminalRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__KeyAssignment_5"


    // $ANTLR start "rule__Chant__PhrasesAssignment_7"
    // InternalLilyChantParser.g:1931:1: rule__Chant__PhrasesAssignment_7 : ( ruleLyricPhrase ) ;
    public final void rule__Chant__PhrasesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1935:1: ( ( ruleLyricPhrase ) )
            // InternalLilyChantParser.g:1936:2: ( ruleLyricPhrase )
            {
            // InternalLilyChantParser.g:1936:2: ( ruleLyricPhrase )
            // InternalLilyChantParser.g:1937:3: ruleLyricPhrase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getPhrasesLyricPhraseParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLyricPhrase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChantAccess().getPhrasesLyricPhraseParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chant__PhrasesAssignment_7"


    // $ANTLR start "rule__LyricPhrase__NotesAssignment_1"
    // InternalLilyChantParser.g:1946:1: rule__LyricPhrase__NotesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LyricPhrase__NotesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1950:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:1951:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:1951:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1952:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNotesTonePhraseCrossReference_1_0()); 
            }
            // InternalLilyChantParser.g:1953:3: ( RULE_ID )
            // InternalLilyChantParser.g:1954:4: RULE_ID
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
    // InternalLilyChantParser.g:1965:1: rule__LyricPhrase__NoteGroupsAssignment_3 : ( ruleNoteGroup ) ;
    public final void rule__LyricPhrase__NoteGroupsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1969:1: ( ( ruleNoteGroup ) )
            // InternalLilyChantParser.g:1970:2: ( ruleNoteGroup )
            {
            // InternalLilyChantParser.g:1970:2: ( ruleNoteGroup )
            // InternalLilyChantParser.g:1971:3: ruleNoteGroup
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
    // InternalLilyChantParser.g:1980:1: rule__NoteGroup__SyllablesAssignment_0_0_0_0 : ( RULE_ID ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1984:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1985:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1985:2: ( RULE_ID )
            // InternalLilyChantParser.g:1986:3: RULE_ID
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
    // InternalLilyChantParser.g:1995:1: rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 : ( RULE_HYPHEN ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1999:1: ( ( RULE_HYPHEN ) )
            // InternalLilyChantParser.g:2000:2: ( RULE_HYPHEN )
            {
            // InternalLilyChantParser.g:2000:2: ( RULE_HYPHEN )
            // InternalLilyChantParser.g:2001:3: RULE_HYPHEN
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
    // InternalLilyChantParser.g:2010:1: rule__NoteGroup__SyllablesAssignment_0_0_1_0 : ( RULE_HYPHEN ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2014:1: ( ( RULE_HYPHEN ) )
            // InternalLilyChantParser.g:2015:2: ( RULE_HYPHEN )
            {
            // InternalLilyChantParser.g:2015:2: ( RULE_HYPHEN )
            // InternalLilyChantParser.g:2016:3: RULE_HYPHEN
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
    // InternalLilyChantParser.g:2025:1: rule__NoteGroup__SyllablesAssignment_0_0_1_1 : ( RULE_ID ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2029:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:2030:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:2030:2: ( RULE_ID )
            // InternalLilyChantParser.g:2031:3: RULE_ID
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
    // InternalLilyChantParser.g:2040:1: rule__NoteGroup__SyllablesAssignment_0_1 : ( RULE_EXTENDER ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2044:1: ( ( RULE_EXTENDER ) )
            // InternalLilyChantParser.g:2045:2: ( RULE_EXTENDER )
            {
            // InternalLilyChantParser.g:2045:2: ( RULE_EXTENDER )
            // InternalLilyChantParser.g:2046:3: RULE_EXTENDER
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
    // InternalLilyChantParser.g:2055:1: rule__NoteGroup__SyllablesAssignment_1_1 : ( ( rule__NoteGroup__SyllablesAlternatives_1_1_0 ) ) ;
    public final void rule__NoteGroup__SyllablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2059:1: ( ( ( rule__NoteGroup__SyllablesAlternatives_1_1_0 ) ) )
            // InternalLilyChantParser.g:2060:2: ( ( rule__NoteGroup__SyllablesAlternatives_1_1_0 ) )
            {
            // InternalLilyChantParser.g:2060:2: ( ( rule__NoteGroup__SyllablesAlternatives_1_1_0 ) )
            // InternalLilyChantParser.g:2061:3: ( rule__NoteGroup__SyllablesAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_1_1_0()); 
            }
            // InternalLilyChantParser.g:2062:3: ( rule__NoteGroup__SyllablesAlternatives_1_1_0 )
            // InternalLilyChantParser.g:2062:4: rule__NoteGroup__SyllablesAlternatives_1_1_0
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

    // $ANTLR start synpred14_InternalLilyChantParser
    public final void synpred14_InternalLilyChantParser_fragment() throws RecognitionException {   
        // InternalLilyChantParser.g:1496:3: ( rule__NoteGroup__Group_0_0_0_1__0 )
        // InternalLilyChantParser.g:1496:3: rule__NoteGroup__Group_0_0_0_1__0
        {
        pushFollow(FOLLOW_2);
        rule__NoteGroup__Group_0_0_0_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalLilyChantParser

    // Delegated rules

    public final boolean synpred14_InternalLilyChantParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalLilyChantParser_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000800L});

}