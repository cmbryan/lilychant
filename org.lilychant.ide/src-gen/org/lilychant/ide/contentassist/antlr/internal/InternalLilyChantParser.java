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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Phrase", "Voices", "Chant", "Voice", "Tone", "VerticalLineVerticalLine", "LeftParenthesis", "RightParenthesis", "VerticalLine", "RULE_ID", "RULE_STRING", "RULE_DURATION", "RULE_HYPHEN", "RULE_EXTENDER", "RULE_SKIP", "RULE_START_NOTE_GROUP", "RULE_END_NOTE_GROUP", "RULE_BEGIN", "RULE_END", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=22;
    public static final int RULE_BEGIN=21;
    public static final int RULE_DURATION=15;
    public static final int VerticalLineVerticalLine=9;
    public static final int RULE_STRING=14;
    public static final int RULE_SKIP=18;
    public static final int RULE_EXTENDER=17;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_START_NOTE_GROUP=19;
    public static final int LeftParenthesis=10;
    public static final int EOF=-1;
    public static final int Chant=6;
    public static final int RULE_ID=13;
    public static final int RULE_WS=25;
    public static final int RightParenthesis=11;
    public static final int Phrase=4;
    public static final int RULE_HYPHEN=16;
    public static final int RULE_ANY_OTHER=26;
    public static final int Voices=5;
    public static final int RULE_END_NOTE_GROUP=20;
    public static final int Tone=8;
    public static final int VerticalLine=12;
    public static final int RULE_ML_COMMENT=23;
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



    // $ANTLR start "entryRuleScript"
    // InternalLilyChantParser.g:65:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:66:1: ( ruleScript EOF )
            // InternalLilyChantParser.g:67:1: ruleScript EOF
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
    // InternalLilyChantParser.g:74:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:78:2: ( ( ( rule__Script__Group__0 ) ) )
            // InternalLilyChantParser.g:79:2: ( ( rule__Script__Group__0 ) )
            {
            // InternalLilyChantParser.g:79:2: ( ( rule__Script__Group__0 ) )
            // InternalLilyChantParser.g:80:3: ( rule__Script__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:81:3: ( rule__Script__Group__0 )
            // InternalLilyChantParser.g:81:4: rule__Script__Group__0
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
    // InternalLilyChantParser.g:90:1: entryRuleTone : ruleTone EOF ;
    public final void entryRuleTone() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:91:1: ( ruleTone EOF )
            // InternalLilyChantParser.g:92:1: ruleTone EOF
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
    // InternalLilyChantParser.g:99:1: ruleTone : ( ( rule__Tone__Group__0 ) ) ;
    public final void ruleTone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:103:2: ( ( ( rule__Tone__Group__0 ) ) )
            // InternalLilyChantParser.g:104:2: ( ( rule__Tone__Group__0 ) )
            {
            // InternalLilyChantParser.g:104:2: ( ( rule__Tone__Group__0 ) )
            // InternalLilyChantParser.g:105:3: ( rule__Tone__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:106:3: ( rule__Tone__Group__0 )
            // InternalLilyChantParser.g:106:4: rule__Tone__Group__0
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
    // InternalLilyChantParser.g:115:1: entryRuleVoiceName : ruleVoiceName EOF ;
    public final void entryRuleVoiceName() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:116:1: ( ruleVoiceName EOF )
            // InternalLilyChantParser.g:117:1: ruleVoiceName EOF
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
    // InternalLilyChantParser.g:124:1: ruleVoiceName : ( ( rule__VoiceName__NameAssignment ) ) ;
    public final void ruleVoiceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:128:2: ( ( ( rule__VoiceName__NameAssignment ) ) )
            // InternalLilyChantParser.g:129:2: ( ( rule__VoiceName__NameAssignment ) )
            {
            // InternalLilyChantParser.g:129:2: ( ( rule__VoiceName__NameAssignment ) )
            // InternalLilyChantParser.g:130:3: ( rule__VoiceName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoiceNameAccess().getNameAssignment()); 
            }
            // InternalLilyChantParser.g:131:3: ( rule__VoiceName__NameAssignment )
            // InternalLilyChantParser.g:131:4: rule__VoiceName__NameAssignment
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
    // InternalLilyChantParser.g:140:1: entryRuleTonePhrase : ruleTonePhrase EOF ;
    public final void entryRuleTonePhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:141:1: ( ruleTonePhrase EOF )
            // InternalLilyChantParser.g:142:1: ruleTonePhrase EOF
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
    // InternalLilyChantParser.g:149:1: ruleTonePhrase : ( ( rule__TonePhrase__Group__0 ) ) ;
    public final void ruleTonePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:153:2: ( ( ( rule__TonePhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:154:2: ( ( rule__TonePhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:154:2: ( ( rule__TonePhrase__Group__0 ) )
            // InternalLilyChantParser.g:155:3: ( rule__TonePhrase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:156:3: ( rule__TonePhrase__Group__0 )
            // InternalLilyChantParser.g:156:4: rule__TonePhrase__Group__0
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
    // InternalLilyChantParser.g:165:1: entryRuleVoicePhrase : ruleVoicePhrase EOF ;
    public final void entryRuleVoicePhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:166:1: ( ruleVoicePhrase EOF )
            // InternalLilyChantParser.g:167:1: ruleVoicePhrase EOF
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
    // InternalLilyChantParser.g:174:1: ruleVoicePhrase : ( ( rule__VoicePhrase__Group__0 ) ) ;
    public final void ruleVoicePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:178:2: ( ( ( rule__VoicePhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:179:2: ( ( rule__VoicePhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:179:2: ( ( rule__VoicePhrase__Group__0 ) )
            // InternalLilyChantParser.g:180:3: ( rule__VoicePhrase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:181:3: ( rule__VoicePhrase__Group__0 )
            // InternalLilyChantParser.g:181:4: rule__VoicePhrase__Group__0
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
    // InternalLilyChantParser.g:190:1: entryRuleChant : ruleChant EOF ;
    public final void entryRuleChant() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:191:1: ( ruleChant EOF )
            // InternalLilyChantParser.g:192:1: ruleChant EOF
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
    // InternalLilyChantParser.g:199:1: ruleChant : ( ( rule__Chant__Group__0 ) ) ;
    public final void ruleChant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:203:2: ( ( ( rule__Chant__Group__0 ) ) )
            // InternalLilyChantParser.g:204:2: ( ( rule__Chant__Group__0 ) )
            {
            // InternalLilyChantParser.g:204:2: ( ( rule__Chant__Group__0 ) )
            // InternalLilyChantParser.g:205:3: ( rule__Chant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:206:3: ( rule__Chant__Group__0 )
            // InternalLilyChantParser.g:206:4: rule__Chant__Group__0
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
    // InternalLilyChantParser.g:215:1: entryRuleLyricPhrase : ruleLyricPhrase EOF ;
    public final void entryRuleLyricPhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:216:1: ( ruleLyricPhrase EOF )
            // InternalLilyChantParser.g:217:1: ruleLyricPhrase EOF
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
    // InternalLilyChantParser.g:224:1: ruleLyricPhrase : ( ( rule__LyricPhrase__Group__0 ) ) ;
    public final void ruleLyricPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:228:2: ( ( ( rule__LyricPhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:229:2: ( ( rule__LyricPhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:229:2: ( ( rule__LyricPhrase__Group__0 ) )
            // InternalLilyChantParser.g:230:3: ( rule__LyricPhrase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:231:3: ( rule__LyricPhrase__Group__0 )
            // InternalLilyChantParser.g:231:4: rule__LyricPhrase__Group__0
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
    // InternalLilyChantParser.g:240:1: entryRuleNoteGroup : ruleNoteGroup EOF ;
    public final void entryRuleNoteGroup() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:241:1: ( ruleNoteGroup EOF )
            // InternalLilyChantParser.g:242:1: ruleNoteGroup EOF
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
    // InternalLilyChantParser.g:249:1: ruleNoteGroup : ( ( rule__NoteGroup__Alternatives ) ) ;
    public final void ruleNoteGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:253:2: ( ( ( rule__NoteGroup__Alternatives ) ) )
            // InternalLilyChantParser.g:254:2: ( ( rule__NoteGroup__Alternatives ) )
            {
            // InternalLilyChantParser.g:254:2: ( ( rule__NoteGroup__Alternatives ) )
            // InternalLilyChantParser.g:255:3: ( rule__NoteGroup__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getAlternatives()); 
            }
            // InternalLilyChantParser.g:256:3: ( rule__NoteGroup__Alternatives )
            // InternalLilyChantParser.g:256:4: rule__NoteGroup__Alternatives
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
    // InternalLilyChantParser.g:265:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:266:1: ( ruleNote EOF )
            // InternalLilyChantParser.g:267:1: ruleNote EOF
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
    // InternalLilyChantParser.g:274:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:278:2: ( ( ( rule__Note__Group__0 ) ) )
            // InternalLilyChantParser.g:279:2: ( ( rule__Note__Group__0 ) )
            {
            // InternalLilyChantParser.g:279:2: ( ( rule__Note__Group__0 ) )
            // InternalLilyChantParser.g:280:3: ( rule__Note__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getGroup()); 
            }
            // InternalLilyChantParser.g:281:3: ( rule__Note__Group__0 )
            // InternalLilyChantParser.g:281:4: rule__Note__Group__0
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
    // InternalLilyChantParser.g:290:1: ruleBarline : ( ( rule__Barline__Alternatives ) ) ;
    public final void ruleBarline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:294:1: ( ( ( rule__Barline__Alternatives ) ) )
            // InternalLilyChantParser.g:295:2: ( ( rule__Barline__Alternatives ) )
            {
            // InternalLilyChantParser.g:295:2: ( ( rule__Barline__Alternatives ) )
            // InternalLilyChantParser.g:296:3: ( rule__Barline__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBarlineAccess().getAlternatives()); 
            }
            // InternalLilyChantParser.g:297:3: ( rule__Barline__Alternatives )
            // InternalLilyChantParser.g:297:4: rule__Barline__Alternatives
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
    // InternalLilyChantParser.g:305:1: rule__NoteGroup__Alternatives : ( ( ( rule__NoteGroup__Group_0__0 ) ) | ( ( rule__NoteGroup__SyllablesAssignment_1 ) ) | ( ( rule__NoteGroup__Group_2__0 ) ) );
    public final void rule__NoteGroup__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:309:1: ( ( ( rule__NoteGroup__Group_0__0 ) ) | ( ( rule__NoteGroup__SyllablesAssignment_1 ) ) | ( ( rule__NoteGroup__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_HYPHEN:
                {
                alt1=1;
                }
                break;
            case RULE_SKIP:
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
                    // InternalLilyChantParser.g:310:2: ( ( rule__NoteGroup__Group_0__0 ) )
                    {
                    // InternalLilyChantParser.g:310:2: ( ( rule__NoteGroup__Group_0__0 ) )
                    // InternalLilyChantParser.g:311:3: ( rule__NoteGroup__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_0()); 
                    }
                    // InternalLilyChantParser.g:312:3: ( rule__NoteGroup__Group_0__0 )
                    // InternalLilyChantParser.g:312:4: rule__NoteGroup__Group_0__0
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
                    // InternalLilyChantParser.g:316:2: ( ( rule__NoteGroup__SyllablesAssignment_1 ) )
                    {
                    // InternalLilyChantParser.g:316:2: ( ( rule__NoteGroup__SyllablesAssignment_1 ) )
                    // InternalLilyChantParser.g:317:3: ( rule__NoteGroup__SyllablesAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1()); 
                    }
                    // InternalLilyChantParser.g:318:3: ( rule__NoteGroup__SyllablesAssignment_1 )
                    // InternalLilyChantParser.g:318:4: rule__NoteGroup__SyllablesAssignment_1
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
                    // InternalLilyChantParser.g:322:2: ( ( rule__NoteGroup__Group_2__0 ) )
                    {
                    // InternalLilyChantParser.g:322:2: ( ( rule__NoteGroup__Group_2__0 ) )
                    // InternalLilyChantParser.g:323:3: ( rule__NoteGroup__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_2()); 
                    }
                    // InternalLilyChantParser.g:324:3: ( rule__NoteGroup__Group_2__0 )
                    // InternalLilyChantParser.g:324:4: rule__NoteGroup__Group_2__0
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
    // InternalLilyChantParser.g:332:1: rule__NoteGroup__Alternatives_0_0 : ( ( ( rule__NoteGroup__Group_0_0_0__0 ) ) | ( ( rule__NoteGroup__Group_0_0_1__0 ) ) );
    public final void rule__NoteGroup__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:336:1: ( ( ( rule__NoteGroup__Group_0_0_0__0 ) ) | ( ( rule__NoteGroup__Group_0_0_1__0 ) ) )
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
                    // InternalLilyChantParser.g:337:2: ( ( rule__NoteGroup__Group_0_0_0__0 ) )
                    {
                    // InternalLilyChantParser.g:337:2: ( ( rule__NoteGroup__Group_0_0_0__0 ) )
                    // InternalLilyChantParser.g:338:3: ( rule__NoteGroup__Group_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_0_0_0()); 
                    }
                    // InternalLilyChantParser.g:339:3: ( rule__NoteGroup__Group_0_0_0__0 )
                    // InternalLilyChantParser.g:339:4: rule__NoteGroup__Group_0_0_0__0
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
                    // InternalLilyChantParser.g:343:2: ( ( rule__NoteGroup__Group_0_0_1__0 ) )
                    {
                    // InternalLilyChantParser.g:343:2: ( ( rule__NoteGroup__Group_0_0_1__0 ) )
                    // InternalLilyChantParser.g:344:3: ( rule__NoteGroup__Group_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getGroup_0_0_1()); 
                    }
                    // InternalLilyChantParser.g:345:3: ( rule__NoteGroup__Group_0_0_1__0 )
                    // InternalLilyChantParser.g:345:4: rule__NoteGroup__Group_0_0_1__0
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


    // $ANTLR start "rule__NoteGroup__SyllablesAlternatives_2_1_0"
    // InternalLilyChantParser.g:353:1: rule__NoteGroup__SyllablesAlternatives_2_1_0 : ( ( RULE_ID ) | ( RULE_HYPHEN ) | ( RULE_EXTENDER ) );
    public final void rule__NoteGroup__SyllablesAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:357:1: ( ( RULE_ID ) | ( RULE_HYPHEN ) | ( RULE_EXTENDER ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_HYPHEN:
                {
                alt3=2;
                }
                break;
            case RULE_EXTENDER:
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
                    // InternalLilyChantParser.g:358:2: ( RULE_ID )
                    {
                    // InternalLilyChantParser.g:358:2: ( RULE_ID )
                    // InternalLilyChantParser.g:359:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_2_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLilyChantParser.g:364:2: ( RULE_HYPHEN )
                    {
                    // InternalLilyChantParser.g:364:2: ( RULE_HYPHEN )
                    // InternalLilyChantParser.g:365:3: RULE_HYPHEN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_2_1_0_1()); 
                    }
                    match(input,RULE_HYPHEN,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_2_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLilyChantParser.g:370:2: ( RULE_EXTENDER )
                    {
                    // InternalLilyChantParser.g:370:2: ( RULE_EXTENDER )
                    // InternalLilyChantParser.g:371:3: RULE_EXTENDER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNoteGroupAccess().getSyllablesEXTENDERTerminalRuleCall_2_1_0_2()); 
                    }
                    match(input,RULE_EXTENDER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNoteGroupAccess().getSyllablesEXTENDERTerminalRuleCall_2_1_0_2()); 
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
    // $ANTLR end "rule__NoteGroup__SyllablesAlternatives_2_1_0"


    // $ANTLR start "rule__Barline__Alternatives"
    // InternalLilyChantParser.g:380:1: rule__Barline__Alternatives : ( ( ( VerticalLine ) ) | ( ( VerticalLineVerticalLine ) ) );
    public final void rule__Barline__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:384:1: ( ( ( VerticalLine ) ) | ( ( VerticalLineVerticalLine ) ) )
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
                    // InternalLilyChantParser.g:385:2: ( ( VerticalLine ) )
                    {
                    // InternalLilyChantParser.g:385:2: ( ( VerticalLine ) )
                    // InternalLilyChantParser.g:386:3: ( VerticalLine )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBarlineAccess().getSingleEnumLiteralDeclaration_0()); 
                    }
                    // InternalLilyChantParser.g:387:3: ( VerticalLine )
                    // InternalLilyChantParser.g:387:4: VerticalLine
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
                    // InternalLilyChantParser.g:391:2: ( ( VerticalLineVerticalLine ) )
                    {
                    // InternalLilyChantParser.g:391:2: ( ( VerticalLineVerticalLine ) )
                    // InternalLilyChantParser.g:392:3: ( VerticalLineVerticalLine )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBarlineAccess().getDoubleEnumLiteralDeclaration_1()); 
                    }
                    // InternalLilyChantParser.g:393:3: ( VerticalLineVerticalLine )
                    // InternalLilyChantParser.g:393:4: VerticalLineVerticalLine
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
    // InternalLilyChantParser.g:401:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:405:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // InternalLilyChantParser.g:406:2: rule__Script__Group__0__Impl rule__Script__Group__1
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
    // InternalLilyChantParser.g:413:1: rule__Script__Group__0__Impl : ( ( rule__Script__TonesAssignment_0 )* ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:417:1: ( ( ( rule__Script__TonesAssignment_0 )* ) )
            // InternalLilyChantParser.g:418:1: ( ( rule__Script__TonesAssignment_0 )* )
            {
            // InternalLilyChantParser.g:418:1: ( ( rule__Script__TonesAssignment_0 )* )
            // InternalLilyChantParser.g:419:2: ( rule__Script__TonesAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getTonesAssignment_0()); 
            }
            // InternalLilyChantParser.g:420:2: ( rule__Script__TonesAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Tone) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLilyChantParser.g:420:3: rule__Script__TonesAssignment_0
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
    // InternalLilyChantParser.g:428:1: rule__Script__Group__1 : rule__Script__Group__1__Impl ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:432:1: ( rule__Script__Group__1__Impl )
            // InternalLilyChantParser.g:433:2: rule__Script__Group__1__Impl
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
    // InternalLilyChantParser.g:439:1: rule__Script__Group__1__Impl : ( ( rule__Script__ChantsAssignment_1 )* ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:443:1: ( ( ( rule__Script__ChantsAssignment_1 )* ) )
            // InternalLilyChantParser.g:444:1: ( ( rule__Script__ChantsAssignment_1 )* )
            {
            // InternalLilyChantParser.g:444:1: ( ( rule__Script__ChantsAssignment_1 )* )
            // InternalLilyChantParser.g:445:2: ( rule__Script__ChantsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getChantsAssignment_1()); 
            }
            // InternalLilyChantParser.g:446:2: ( rule__Script__ChantsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Chant) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLilyChantParser.g:446:3: rule__Script__ChantsAssignment_1
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
    // InternalLilyChantParser.g:455:1: rule__Tone__Group__0 : rule__Tone__Group__0__Impl rule__Tone__Group__1 ;
    public final void rule__Tone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:459:1: ( rule__Tone__Group__0__Impl rule__Tone__Group__1 )
            // InternalLilyChantParser.g:460:2: rule__Tone__Group__0__Impl rule__Tone__Group__1
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
    // InternalLilyChantParser.g:467:1: rule__Tone__Group__0__Impl : ( Tone ) ;
    public final void rule__Tone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:471:1: ( ( Tone ) )
            // InternalLilyChantParser.g:472:1: ( Tone )
            {
            // InternalLilyChantParser.g:472:1: ( Tone )
            // InternalLilyChantParser.g:473:2: Tone
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
    // InternalLilyChantParser.g:482:1: rule__Tone__Group__1 : rule__Tone__Group__1__Impl rule__Tone__Group__2 ;
    public final void rule__Tone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:486:1: ( rule__Tone__Group__1__Impl rule__Tone__Group__2 )
            // InternalLilyChantParser.g:487:2: rule__Tone__Group__1__Impl rule__Tone__Group__2
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
    // InternalLilyChantParser.g:494:1: rule__Tone__Group__1__Impl : ( ( rule__Tone__NameAssignment_1 ) ) ;
    public final void rule__Tone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:498:1: ( ( ( rule__Tone__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:499:1: ( ( rule__Tone__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:499:1: ( ( rule__Tone__NameAssignment_1 ) )
            // InternalLilyChantParser.g:500:2: ( rule__Tone__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:501:2: ( rule__Tone__NameAssignment_1 )
            // InternalLilyChantParser.g:501:3: rule__Tone__NameAssignment_1
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
    // InternalLilyChantParser.g:509:1: rule__Tone__Group__2 : rule__Tone__Group__2__Impl rule__Tone__Group__3 ;
    public final void rule__Tone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:513:1: ( rule__Tone__Group__2__Impl rule__Tone__Group__3 )
            // InternalLilyChantParser.g:514:2: rule__Tone__Group__2__Impl rule__Tone__Group__3
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
    // InternalLilyChantParser.g:521:1: rule__Tone__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__Tone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:525:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:526:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:526:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:527:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:536:1: rule__Tone__Group__3 : rule__Tone__Group__3__Impl rule__Tone__Group__4 ;
    public final void rule__Tone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:540:1: ( rule__Tone__Group__3__Impl rule__Tone__Group__4 )
            // InternalLilyChantParser.g:541:2: rule__Tone__Group__3__Impl rule__Tone__Group__4
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
    // InternalLilyChantParser.g:548:1: rule__Tone__Group__3__Impl : ( Voices ) ;
    public final void rule__Tone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:552:1: ( ( Voices ) )
            // InternalLilyChantParser.g:553:1: ( Voices )
            {
            // InternalLilyChantParser.g:553:1: ( Voices )
            // InternalLilyChantParser.g:554:2: Voices
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
    // InternalLilyChantParser.g:563:1: rule__Tone__Group__4 : rule__Tone__Group__4__Impl rule__Tone__Group__5 ;
    public final void rule__Tone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:567:1: ( rule__Tone__Group__4__Impl rule__Tone__Group__5 )
            // InternalLilyChantParser.g:568:2: rule__Tone__Group__4__Impl rule__Tone__Group__5
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
    // InternalLilyChantParser.g:575:1: rule__Tone__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__Tone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:579:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:580:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:580:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:581:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:590:1: rule__Tone__Group__5 : rule__Tone__Group__5__Impl rule__Tone__Group__6 ;
    public final void rule__Tone__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:594:1: ( rule__Tone__Group__5__Impl rule__Tone__Group__6 )
            // InternalLilyChantParser.g:595:2: rule__Tone__Group__5__Impl rule__Tone__Group__6
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
    // InternalLilyChantParser.g:602:1: rule__Tone__Group__5__Impl : ( ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* ) ) ;
    public final void rule__Tone__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:606:1: ( ( ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* ) ) )
            // InternalLilyChantParser.g:607:1: ( ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* ) )
            {
            // InternalLilyChantParser.g:607:1: ( ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* ) )
            // InternalLilyChantParser.g:608:2: ( ( rule__Tone__VoiceNamesAssignment_5 ) ) ( ( rule__Tone__VoiceNamesAssignment_5 )* )
            {
            // InternalLilyChantParser.g:608:2: ( ( rule__Tone__VoiceNamesAssignment_5 ) )
            // InternalLilyChantParser.g:609:3: ( rule__Tone__VoiceNamesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getVoiceNamesAssignment_5()); 
            }
            // InternalLilyChantParser.g:610:3: ( rule__Tone__VoiceNamesAssignment_5 )
            // InternalLilyChantParser.g:610:4: rule__Tone__VoiceNamesAssignment_5
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

            // InternalLilyChantParser.g:613:2: ( ( rule__Tone__VoiceNamesAssignment_5 )* )
            // InternalLilyChantParser.g:614:3: ( rule__Tone__VoiceNamesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getVoiceNamesAssignment_5()); 
            }
            // InternalLilyChantParser.g:615:3: ( rule__Tone__VoiceNamesAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLilyChantParser.g:615:4: rule__Tone__VoiceNamesAssignment_5
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
    // InternalLilyChantParser.g:624:1: rule__Tone__Group__6 : rule__Tone__Group__6__Impl rule__Tone__Group__7 ;
    public final void rule__Tone__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:628:1: ( rule__Tone__Group__6__Impl rule__Tone__Group__7 )
            // InternalLilyChantParser.g:629:2: rule__Tone__Group__6__Impl rule__Tone__Group__7
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
    // InternalLilyChantParser.g:636:1: rule__Tone__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Tone__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:640:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:641:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:641:1: ( RULE_END )
            // InternalLilyChantParser.g:642:2: RULE_END
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
    // InternalLilyChantParser.g:651:1: rule__Tone__Group__7 : rule__Tone__Group__7__Impl rule__Tone__Group__8 ;
    public final void rule__Tone__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:655:1: ( rule__Tone__Group__7__Impl rule__Tone__Group__8 )
            // InternalLilyChantParser.g:656:2: rule__Tone__Group__7__Impl rule__Tone__Group__8
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
    // InternalLilyChantParser.g:663:1: rule__Tone__Group__7__Impl : ( ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* ) ) ;
    public final void rule__Tone__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:667:1: ( ( ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* ) ) )
            // InternalLilyChantParser.g:668:1: ( ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* ) )
            {
            // InternalLilyChantParser.g:668:1: ( ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* ) )
            // InternalLilyChantParser.g:669:2: ( ( rule__Tone__PhrasesAssignment_7 ) ) ( ( rule__Tone__PhrasesAssignment_7 )* )
            {
            // InternalLilyChantParser.g:669:2: ( ( rule__Tone__PhrasesAssignment_7 ) )
            // InternalLilyChantParser.g:670:3: ( rule__Tone__PhrasesAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getPhrasesAssignment_7()); 
            }
            // InternalLilyChantParser.g:671:3: ( rule__Tone__PhrasesAssignment_7 )
            // InternalLilyChantParser.g:671:4: rule__Tone__PhrasesAssignment_7
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

            // InternalLilyChantParser.g:674:2: ( ( rule__Tone__PhrasesAssignment_7 )* )
            // InternalLilyChantParser.g:675:3: ( rule__Tone__PhrasesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToneAccess().getPhrasesAssignment_7()); 
            }
            // InternalLilyChantParser.g:676:3: ( rule__Tone__PhrasesAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Phrase) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLilyChantParser.g:676:4: rule__Tone__PhrasesAssignment_7
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
    // InternalLilyChantParser.g:685:1: rule__Tone__Group__8 : rule__Tone__Group__8__Impl ;
    public final void rule__Tone__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:689:1: ( rule__Tone__Group__8__Impl )
            // InternalLilyChantParser.g:690:2: rule__Tone__Group__8__Impl
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
    // InternalLilyChantParser.g:696:1: rule__Tone__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Tone__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:700:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:701:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:701:1: ( RULE_END )
            // InternalLilyChantParser.g:702:2: RULE_END
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
    // InternalLilyChantParser.g:712:1: rule__TonePhrase__Group__0 : rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1 ;
    public final void rule__TonePhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:716:1: ( rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1 )
            // InternalLilyChantParser.g:717:2: rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1
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
    // InternalLilyChantParser.g:724:1: rule__TonePhrase__Group__0__Impl : ( Phrase ) ;
    public final void rule__TonePhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:728:1: ( ( Phrase ) )
            // InternalLilyChantParser.g:729:1: ( Phrase )
            {
            // InternalLilyChantParser.g:729:1: ( Phrase )
            // InternalLilyChantParser.g:730:2: Phrase
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
    // InternalLilyChantParser.g:739:1: rule__TonePhrase__Group__1 : rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2 ;
    public final void rule__TonePhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:743:1: ( rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2 )
            // InternalLilyChantParser.g:744:2: rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2
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
    // InternalLilyChantParser.g:751:1: rule__TonePhrase__Group__1__Impl : ( ( rule__TonePhrase__NameAssignment_1 ) ) ;
    public final void rule__TonePhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:755:1: ( ( ( rule__TonePhrase__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:756:1: ( ( rule__TonePhrase__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:756:1: ( ( rule__TonePhrase__NameAssignment_1 ) )
            // InternalLilyChantParser.g:757:2: ( rule__TonePhrase__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:758:2: ( rule__TonePhrase__NameAssignment_1 )
            // InternalLilyChantParser.g:758:3: rule__TonePhrase__NameAssignment_1
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
    // InternalLilyChantParser.g:766:1: rule__TonePhrase__Group__2 : rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3 ;
    public final void rule__TonePhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:770:1: ( rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3 )
            // InternalLilyChantParser.g:771:2: rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3
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
    // InternalLilyChantParser.g:778:1: rule__TonePhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__TonePhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:782:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:783:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:783:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:784:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:793:1: rule__TonePhrase__Group__3 : rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4 ;
    public final void rule__TonePhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:797:1: ( rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4 )
            // InternalLilyChantParser.g:798:2: rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4
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
    // InternalLilyChantParser.g:805:1: rule__TonePhrase__Group__3__Impl : ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) ) ;
    public final void rule__TonePhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:809:1: ( ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:810:1: ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:810:1: ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) )
            // InternalLilyChantParser.g:811:2: ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* )
            {
            // InternalLilyChantParser.g:811:2: ( ( rule__TonePhrase__VoicesAssignment_3 ) )
            // InternalLilyChantParser.g:812:3: ( rule__TonePhrase__VoicesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            }
            // InternalLilyChantParser.g:813:3: ( rule__TonePhrase__VoicesAssignment_3 )
            // InternalLilyChantParser.g:813:4: rule__TonePhrase__VoicesAssignment_3
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

            // InternalLilyChantParser.g:816:2: ( ( rule__TonePhrase__VoicesAssignment_3 )* )
            // InternalLilyChantParser.g:817:3: ( rule__TonePhrase__VoicesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            }
            // InternalLilyChantParser.g:818:3: ( rule__TonePhrase__VoicesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Voice) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLilyChantParser.g:818:4: rule__TonePhrase__VoicesAssignment_3
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
    // InternalLilyChantParser.g:827:1: rule__TonePhrase__Group__4 : rule__TonePhrase__Group__4__Impl ;
    public final void rule__TonePhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:831:1: ( rule__TonePhrase__Group__4__Impl )
            // InternalLilyChantParser.g:832:2: rule__TonePhrase__Group__4__Impl
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
    // InternalLilyChantParser.g:838:1: rule__TonePhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__TonePhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:842:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:843:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:843:1: ( RULE_END )
            // InternalLilyChantParser.g:844:2: RULE_END
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
    // InternalLilyChantParser.g:854:1: rule__VoicePhrase__Group__0 : rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1 ;
    public final void rule__VoicePhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:858:1: ( rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1 )
            // InternalLilyChantParser.g:859:2: rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1
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
    // InternalLilyChantParser.g:866:1: rule__VoicePhrase__Group__0__Impl : ( Voice ) ;
    public final void rule__VoicePhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:870:1: ( ( Voice ) )
            // InternalLilyChantParser.g:871:1: ( Voice )
            {
            // InternalLilyChantParser.g:871:1: ( Voice )
            // InternalLilyChantParser.g:872:2: Voice
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
    // InternalLilyChantParser.g:881:1: rule__VoicePhrase__Group__1 : rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2 ;
    public final void rule__VoicePhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:885:1: ( rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2 )
            // InternalLilyChantParser.g:886:2: rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2
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
    // InternalLilyChantParser.g:893:1: rule__VoicePhrase__Group__1__Impl : ( ( rule__VoicePhrase__NameAssignment_1 ) ) ;
    public final void rule__VoicePhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:897:1: ( ( ( rule__VoicePhrase__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:898:1: ( ( rule__VoicePhrase__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:898:1: ( ( rule__VoicePhrase__NameAssignment_1 ) )
            // InternalLilyChantParser.g:899:2: ( rule__VoicePhrase__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:900:2: ( rule__VoicePhrase__NameAssignment_1 )
            // InternalLilyChantParser.g:900:3: rule__VoicePhrase__NameAssignment_1
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
    // InternalLilyChantParser.g:908:1: rule__VoicePhrase__Group__2 : rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3 ;
    public final void rule__VoicePhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:912:1: ( rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3 )
            // InternalLilyChantParser.g:913:2: rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3
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
    // InternalLilyChantParser.g:920:1: rule__VoicePhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__VoicePhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:924:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:925:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:925:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:926:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:935:1: rule__VoicePhrase__Group__3 : rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4 ;
    public final void rule__VoicePhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:939:1: ( rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4 )
            // InternalLilyChantParser.g:940:2: rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4
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
    // InternalLilyChantParser.g:947:1: rule__VoicePhrase__Group__3__Impl : ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) ) ;
    public final void rule__VoicePhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:951:1: ( ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:952:1: ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:952:1: ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) )
            // InternalLilyChantParser.g:953:2: ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* )
            {
            // InternalLilyChantParser.g:953:2: ( ( rule__VoicePhrase__NotesAssignment_3 ) )
            // InternalLilyChantParser.g:954:3: ( rule__VoicePhrase__NotesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            }
            // InternalLilyChantParser.g:955:3: ( rule__VoicePhrase__NotesAssignment_3 )
            // InternalLilyChantParser.g:955:4: rule__VoicePhrase__NotesAssignment_3
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

            // InternalLilyChantParser.g:958:2: ( ( rule__VoicePhrase__NotesAssignment_3 )* )
            // InternalLilyChantParser.g:959:3: ( rule__VoicePhrase__NotesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            }
            // InternalLilyChantParser.g:960:3: ( rule__VoicePhrase__NotesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLilyChantParser.g:960:4: rule__VoicePhrase__NotesAssignment_3
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
    // InternalLilyChantParser.g:969:1: rule__VoicePhrase__Group__4 : rule__VoicePhrase__Group__4__Impl ;
    public final void rule__VoicePhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:973:1: ( rule__VoicePhrase__Group__4__Impl )
            // InternalLilyChantParser.g:974:2: rule__VoicePhrase__Group__4__Impl
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
    // InternalLilyChantParser.g:980:1: rule__VoicePhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__VoicePhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:984:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:985:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:985:1: ( RULE_END )
            // InternalLilyChantParser.g:986:2: RULE_END
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
    // InternalLilyChantParser.g:996:1: rule__Chant__Group__0 : rule__Chant__Group__0__Impl rule__Chant__Group__1 ;
    public final void rule__Chant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1000:1: ( rule__Chant__Group__0__Impl rule__Chant__Group__1 )
            // InternalLilyChantParser.g:1001:2: rule__Chant__Group__0__Impl rule__Chant__Group__1
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
    // InternalLilyChantParser.g:1008:1: rule__Chant__Group__0__Impl : ( Chant ) ;
    public final void rule__Chant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1012:1: ( ( Chant ) )
            // InternalLilyChantParser.g:1013:1: ( Chant )
            {
            // InternalLilyChantParser.g:1013:1: ( Chant )
            // InternalLilyChantParser.g:1014:2: Chant
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
    // InternalLilyChantParser.g:1023:1: rule__Chant__Group__1 : rule__Chant__Group__1__Impl rule__Chant__Group__2 ;
    public final void rule__Chant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1027:1: ( rule__Chant__Group__1__Impl rule__Chant__Group__2 )
            // InternalLilyChantParser.g:1028:2: rule__Chant__Group__1__Impl rule__Chant__Group__2
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
    // InternalLilyChantParser.g:1035:1: rule__Chant__Group__1__Impl : ( ( rule__Chant__NameAssignment_1 )? ) ;
    public final void rule__Chant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1039:1: ( ( ( rule__Chant__NameAssignment_1 )? ) )
            // InternalLilyChantParser.g:1040:1: ( ( rule__Chant__NameAssignment_1 )? )
            {
            // InternalLilyChantParser.g:1040:1: ( ( rule__Chant__NameAssignment_1 )? )
            // InternalLilyChantParser.g:1041:2: ( rule__Chant__NameAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getNameAssignment_1()); 
            }
            // InternalLilyChantParser.g:1042:2: ( rule__Chant__NameAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLilyChantParser.g:1042:3: rule__Chant__NameAssignment_1
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
    // InternalLilyChantParser.g:1050:1: rule__Chant__Group__2 : rule__Chant__Group__2__Impl rule__Chant__Group__3 ;
    public final void rule__Chant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1054:1: ( rule__Chant__Group__2__Impl rule__Chant__Group__3 )
            // InternalLilyChantParser.g:1055:2: rule__Chant__Group__2__Impl rule__Chant__Group__3
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
    // InternalLilyChantParser.g:1062:1: rule__Chant__Group__2__Impl : ( Tone ) ;
    public final void rule__Chant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1066:1: ( ( Tone ) )
            // InternalLilyChantParser.g:1067:1: ( Tone )
            {
            // InternalLilyChantParser.g:1067:1: ( Tone )
            // InternalLilyChantParser.g:1068:2: Tone
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
    // InternalLilyChantParser.g:1077:1: rule__Chant__Group__3 : rule__Chant__Group__3__Impl rule__Chant__Group__4 ;
    public final void rule__Chant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1081:1: ( rule__Chant__Group__3__Impl rule__Chant__Group__4 )
            // InternalLilyChantParser.g:1082:2: rule__Chant__Group__3__Impl rule__Chant__Group__4
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
    // InternalLilyChantParser.g:1089:1: rule__Chant__Group__3__Impl : ( ( rule__Chant__ToneAssignment_3 ) ) ;
    public final void rule__Chant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1093:1: ( ( ( rule__Chant__ToneAssignment_3 ) ) )
            // InternalLilyChantParser.g:1094:1: ( ( rule__Chant__ToneAssignment_3 ) )
            {
            // InternalLilyChantParser.g:1094:1: ( ( rule__Chant__ToneAssignment_3 ) )
            // InternalLilyChantParser.g:1095:2: ( rule__Chant__ToneAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getToneAssignment_3()); 
            }
            // InternalLilyChantParser.g:1096:2: ( rule__Chant__ToneAssignment_3 )
            // InternalLilyChantParser.g:1096:3: rule__Chant__ToneAssignment_3
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
    // InternalLilyChantParser.g:1104:1: rule__Chant__Group__4 : rule__Chant__Group__4__Impl rule__Chant__Group__5 ;
    public final void rule__Chant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1108:1: ( rule__Chant__Group__4__Impl rule__Chant__Group__5 )
            // InternalLilyChantParser.g:1109:2: rule__Chant__Group__4__Impl rule__Chant__Group__5
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
    // InternalLilyChantParser.g:1116:1: rule__Chant__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__Chant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1120:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:1121:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:1121:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:1122:2: RULE_BEGIN
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
    // InternalLilyChantParser.g:1131:1: rule__Chant__Group__5 : rule__Chant__Group__5__Impl rule__Chant__Group__6 ;
    public final void rule__Chant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1135:1: ( rule__Chant__Group__5__Impl rule__Chant__Group__6 )
            // InternalLilyChantParser.g:1136:2: rule__Chant__Group__5__Impl rule__Chant__Group__6
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
    // InternalLilyChantParser.g:1143:1: rule__Chant__Group__5__Impl : ( ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* ) ) ;
    public final void rule__Chant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1147:1: ( ( ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* ) ) )
            // InternalLilyChantParser.g:1148:1: ( ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* ) )
            {
            // InternalLilyChantParser.g:1148:1: ( ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* ) )
            // InternalLilyChantParser.g:1149:2: ( ( rule__Chant__PhrasesAssignment_5 ) ) ( ( rule__Chant__PhrasesAssignment_5 )* )
            {
            // InternalLilyChantParser.g:1149:2: ( ( rule__Chant__PhrasesAssignment_5 ) )
            // InternalLilyChantParser.g:1150:3: ( rule__Chant__PhrasesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getPhrasesAssignment_5()); 
            }
            // InternalLilyChantParser.g:1151:3: ( rule__Chant__PhrasesAssignment_5 )
            // InternalLilyChantParser.g:1151:4: rule__Chant__PhrasesAssignment_5
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

            // InternalLilyChantParser.g:1154:2: ( ( rule__Chant__PhrasesAssignment_5 )* )
            // InternalLilyChantParser.g:1155:3: ( rule__Chant__PhrasesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getPhrasesAssignment_5()); 
            }
            // InternalLilyChantParser.g:1156:3: ( rule__Chant__PhrasesAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==LeftParenthesis||LA12_0==RULE_ID||LA12_0==RULE_HYPHEN||(LA12_0>=RULE_SKIP && LA12_0<=RULE_START_NOTE_GROUP)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLilyChantParser.g:1156:4: rule__Chant__PhrasesAssignment_5
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
    // InternalLilyChantParser.g:1165:1: rule__Chant__Group__6 : rule__Chant__Group__6__Impl ;
    public final void rule__Chant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1169:1: ( rule__Chant__Group__6__Impl )
            // InternalLilyChantParser.g:1170:2: rule__Chant__Group__6__Impl
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
    // InternalLilyChantParser.g:1176:1: rule__Chant__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Chant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1180:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:1181:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:1181:1: ( RULE_END )
            // InternalLilyChantParser.g:1182:2: RULE_END
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
    // InternalLilyChantParser.g:1192:1: rule__LyricPhrase__Group__0 : rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1 ;
    public final void rule__LyricPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1196:1: ( rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1 )
            // InternalLilyChantParser.g:1197:2: rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1
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
    // InternalLilyChantParser.g:1204:1: rule__LyricPhrase__Group__0__Impl : ( ( rule__LyricPhrase__Group_0__0 )? ) ;
    public final void rule__LyricPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1208:1: ( ( ( rule__LyricPhrase__Group_0__0 )? ) )
            // InternalLilyChantParser.g:1209:1: ( ( rule__LyricPhrase__Group_0__0 )? )
            {
            // InternalLilyChantParser.g:1209:1: ( ( rule__LyricPhrase__Group_0__0 )? )
            // InternalLilyChantParser.g:1210:2: ( rule__LyricPhrase__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getGroup_0()); 
            }
            // InternalLilyChantParser.g:1211:2: ( rule__LyricPhrase__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftParenthesis) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLilyChantParser.g:1211:3: rule__LyricPhrase__Group_0__0
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
    // InternalLilyChantParser.g:1219:1: rule__LyricPhrase__Group__1 : rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2 ;
    public final void rule__LyricPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1223:1: ( rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2 )
            // InternalLilyChantParser.g:1224:2: rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2
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
    // InternalLilyChantParser.g:1231:1: rule__LyricPhrase__Group__1__Impl : ( ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* ) ) ;
    public final void rule__LyricPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1235:1: ( ( ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* ) ) )
            // InternalLilyChantParser.g:1236:1: ( ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* ) )
            {
            // InternalLilyChantParser.g:1236:1: ( ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* ) )
            // InternalLilyChantParser.g:1237:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* )
            {
            // InternalLilyChantParser.g:1237:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_1 ) )
            // InternalLilyChantParser.g:1238:3: ( rule__LyricPhrase__NoteGroupsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_1()); 
            }
            // InternalLilyChantParser.g:1239:3: ( rule__LyricPhrase__NoteGroupsAssignment_1 )
            // InternalLilyChantParser.g:1239:4: rule__LyricPhrase__NoteGroupsAssignment_1
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

            // InternalLilyChantParser.g:1242:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_1 )* )
            // InternalLilyChantParser.g:1243:3: ( rule__LyricPhrase__NoteGroupsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_1()); 
            }
            // InternalLilyChantParser.g:1244:3: ( rule__LyricPhrase__NoteGroupsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==RULE_HYPHEN||(LA14_0>=RULE_SKIP && LA14_0<=RULE_START_NOTE_GROUP)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLilyChantParser.g:1244:4: rule__LyricPhrase__NoteGroupsAssignment_1
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
    // InternalLilyChantParser.g:1253:1: rule__LyricPhrase__Group__2 : rule__LyricPhrase__Group__2__Impl ;
    public final void rule__LyricPhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1257:1: ( rule__LyricPhrase__Group__2__Impl )
            // InternalLilyChantParser.g:1258:2: rule__LyricPhrase__Group__2__Impl
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
    // InternalLilyChantParser.g:1264:1: rule__LyricPhrase__Group__2__Impl : ( ( rule__LyricPhrase__BarAssignment_2 ) ) ;
    public final void rule__LyricPhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1268:1: ( ( ( rule__LyricPhrase__BarAssignment_2 ) ) )
            // InternalLilyChantParser.g:1269:1: ( ( rule__LyricPhrase__BarAssignment_2 ) )
            {
            // InternalLilyChantParser.g:1269:1: ( ( rule__LyricPhrase__BarAssignment_2 ) )
            // InternalLilyChantParser.g:1270:2: ( rule__LyricPhrase__BarAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getBarAssignment_2()); 
            }
            // InternalLilyChantParser.g:1271:2: ( rule__LyricPhrase__BarAssignment_2 )
            // InternalLilyChantParser.g:1271:3: rule__LyricPhrase__BarAssignment_2
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
    // InternalLilyChantParser.g:1280:1: rule__LyricPhrase__Group_0__0 : rule__LyricPhrase__Group_0__0__Impl rule__LyricPhrase__Group_0__1 ;
    public final void rule__LyricPhrase__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1284:1: ( rule__LyricPhrase__Group_0__0__Impl rule__LyricPhrase__Group_0__1 )
            // InternalLilyChantParser.g:1285:2: rule__LyricPhrase__Group_0__0__Impl rule__LyricPhrase__Group_0__1
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
    // InternalLilyChantParser.g:1292:1: rule__LyricPhrase__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__LyricPhrase__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1296:1: ( ( LeftParenthesis ) )
            // InternalLilyChantParser.g:1297:1: ( LeftParenthesis )
            {
            // InternalLilyChantParser.g:1297:1: ( LeftParenthesis )
            // InternalLilyChantParser.g:1298:2: LeftParenthesis
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
    // InternalLilyChantParser.g:1307:1: rule__LyricPhrase__Group_0__1 : rule__LyricPhrase__Group_0__1__Impl rule__LyricPhrase__Group_0__2 ;
    public final void rule__LyricPhrase__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1311:1: ( rule__LyricPhrase__Group_0__1__Impl rule__LyricPhrase__Group_0__2 )
            // InternalLilyChantParser.g:1312:2: rule__LyricPhrase__Group_0__1__Impl rule__LyricPhrase__Group_0__2
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
    // InternalLilyChantParser.g:1319:1: rule__LyricPhrase__Group_0__1__Impl : ( ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 ) ) ;
    public final void rule__LyricPhrase__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1323:1: ( ( ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 ) ) )
            // InternalLilyChantParser.g:1324:1: ( ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 ) )
            {
            // InternalLilyChantParser.g:1324:1: ( ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 ) )
            // InternalLilyChantParser.g:1325:2: ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getExplicitPhraseAssignment_0_1()); 
            }
            // InternalLilyChantParser.g:1326:2: ( rule__LyricPhrase__ExplicitPhraseAssignment_0_1 )
            // InternalLilyChantParser.g:1326:3: rule__LyricPhrase__ExplicitPhraseAssignment_0_1
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
    // InternalLilyChantParser.g:1334:1: rule__LyricPhrase__Group_0__2 : rule__LyricPhrase__Group_0__2__Impl ;
    public final void rule__LyricPhrase__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1338:1: ( rule__LyricPhrase__Group_0__2__Impl )
            // InternalLilyChantParser.g:1339:2: rule__LyricPhrase__Group_0__2__Impl
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
    // InternalLilyChantParser.g:1345:1: rule__LyricPhrase__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__LyricPhrase__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1349:1: ( ( RightParenthesis ) )
            // InternalLilyChantParser.g:1350:1: ( RightParenthesis )
            {
            // InternalLilyChantParser.g:1350:1: ( RightParenthesis )
            // InternalLilyChantParser.g:1351:2: RightParenthesis
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
    // InternalLilyChantParser.g:1361:1: rule__NoteGroup__Group_0__0 : rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1 ;
    public final void rule__NoteGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1365:1: ( rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1 )
            // InternalLilyChantParser.g:1366:2: rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1
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
    // InternalLilyChantParser.g:1373:1: rule__NoteGroup__Group_0__0__Impl : ( ( rule__NoteGroup__Alternatives_0_0 ) ) ;
    public final void rule__NoteGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1377:1: ( ( ( rule__NoteGroup__Alternatives_0_0 ) ) )
            // InternalLilyChantParser.g:1378:1: ( ( rule__NoteGroup__Alternatives_0_0 ) )
            {
            // InternalLilyChantParser.g:1378:1: ( ( rule__NoteGroup__Alternatives_0_0 ) )
            // InternalLilyChantParser.g:1379:2: ( rule__NoteGroup__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getAlternatives_0_0()); 
            }
            // InternalLilyChantParser.g:1380:2: ( rule__NoteGroup__Alternatives_0_0 )
            // InternalLilyChantParser.g:1380:3: rule__NoteGroup__Alternatives_0_0
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
    // InternalLilyChantParser.g:1388:1: rule__NoteGroup__Group_0__1 : rule__NoteGroup__Group_0__1__Impl ;
    public final void rule__NoteGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1392:1: ( rule__NoteGroup__Group_0__1__Impl )
            // InternalLilyChantParser.g:1393:2: rule__NoteGroup__Group_0__1__Impl
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
    // InternalLilyChantParser.g:1399:1: rule__NoteGroup__Group_0__1__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* ) ;
    public final void rule__NoteGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1403:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* ) )
            // InternalLilyChantParser.g:1404:1: ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* )
            {
            // InternalLilyChantParser.g:1404:1: ( ( rule__NoteGroup__SyllablesAssignment_0_1 )* )
            // InternalLilyChantParser.g:1405:2: ( rule__NoteGroup__SyllablesAssignment_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_1()); 
            }
            // InternalLilyChantParser.g:1406:2: ( rule__NoteGroup__SyllablesAssignment_0_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_EXTENDER) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLilyChantParser.g:1406:3: rule__NoteGroup__SyllablesAssignment_0_1
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
    // InternalLilyChantParser.g:1415:1: rule__NoteGroup__Group_0_0_0__0 : rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1 ;
    public final void rule__NoteGroup__Group_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1419:1: ( rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1 )
            // InternalLilyChantParser.g:1420:2: rule__NoteGroup__Group_0_0_0__0__Impl rule__NoteGroup__Group_0_0_0__1
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
    // InternalLilyChantParser.g:1427:1: rule__NoteGroup__Group_0_0_0__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1431:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) ) )
            // InternalLilyChantParser.g:1432:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) )
            {
            // InternalLilyChantParser.g:1432:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 ) )
            // InternalLilyChantParser.g:1433:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_0()); 
            }
            // InternalLilyChantParser.g:1434:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_0 )
            // InternalLilyChantParser.g:1434:3: rule__NoteGroup__SyllablesAssignment_0_0_0_0
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
    // InternalLilyChantParser.g:1442:1: rule__NoteGroup__Group_0_0_0__1 : rule__NoteGroup__Group_0_0_0__1__Impl ;
    public final void rule__NoteGroup__Group_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1446:1: ( rule__NoteGroup__Group_0_0_0__1__Impl )
            // InternalLilyChantParser.g:1447:2: rule__NoteGroup__Group_0_0_0__1__Impl
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
    // InternalLilyChantParser.g:1453:1: rule__NoteGroup__Group_0_0_0__1__Impl : ( ( rule__NoteGroup__Group_0_0_0_1__0 )? ) ;
    public final void rule__NoteGroup__Group_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1457:1: ( ( ( rule__NoteGroup__Group_0_0_0_1__0 )? ) )
            // InternalLilyChantParser.g:1458:1: ( ( rule__NoteGroup__Group_0_0_0_1__0 )? )
            {
            // InternalLilyChantParser.g:1458:1: ( ( rule__NoteGroup__Group_0_0_0_1__0 )? )
            // InternalLilyChantParser.g:1459:2: ( rule__NoteGroup__Group_0_0_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getGroup_0_0_0_1()); 
            }
            // InternalLilyChantParser.g:1460:2: ( rule__NoteGroup__Group_0_0_0_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_HYPHEN) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==EOF||LA16_1==VerticalLineVerticalLine||LA16_1==VerticalLine||(LA16_1>=RULE_HYPHEN && LA16_1<=RULE_START_NOTE_GROUP)) ) {
                    alt16=1;
                }
                else if ( (LA16_1==RULE_ID) ) {
                    int LA16_4 = input.LA(3);

                    if ( (synpred18_InternalLilyChantParser()) ) {
                        alt16=1;
                    }
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalLilyChantParser.g:1460:3: rule__NoteGroup__Group_0_0_0_1__0
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
    // InternalLilyChantParser.g:1469:1: rule__NoteGroup__Group_0_0_0_1__0 : rule__NoteGroup__Group_0_0_0_1__0__Impl ;
    public final void rule__NoteGroup__Group_0_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1473:1: ( rule__NoteGroup__Group_0_0_0_1__0__Impl )
            // InternalLilyChantParser.g:1474:2: rule__NoteGroup__Group_0_0_0_1__0__Impl
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
    // InternalLilyChantParser.g:1480:1: rule__NoteGroup__Group_0_0_0_1__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1484:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) ) )
            // InternalLilyChantParser.g:1485:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) )
            {
            // InternalLilyChantParser.g:1485:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 ) )
            // InternalLilyChantParser.g:1486:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_1_0()); 
            }
            // InternalLilyChantParser.g:1487:2: ( rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 )
            // InternalLilyChantParser.g:1487:3: rule__NoteGroup__SyllablesAssignment_0_0_0_1_0
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
    // InternalLilyChantParser.g:1496:1: rule__NoteGroup__Group_0_0_1__0 : rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1 ;
    public final void rule__NoteGroup__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1500:1: ( rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1 )
            // InternalLilyChantParser.g:1501:2: rule__NoteGroup__Group_0_0_1__0__Impl rule__NoteGroup__Group_0_0_1__1
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
    // InternalLilyChantParser.g:1508:1: rule__NoteGroup__Group_0_0_1__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) ) ;
    public final void rule__NoteGroup__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1512:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) ) )
            // InternalLilyChantParser.g:1513:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) )
            {
            // InternalLilyChantParser.g:1513:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 ) )
            // InternalLilyChantParser.g:1514:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_0()); 
            }
            // InternalLilyChantParser.g:1515:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_0 )
            // InternalLilyChantParser.g:1515:3: rule__NoteGroup__SyllablesAssignment_0_0_1_0
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
    // InternalLilyChantParser.g:1523:1: rule__NoteGroup__Group_0_0_1__1 : rule__NoteGroup__Group_0_0_1__1__Impl ;
    public final void rule__NoteGroup__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1527:1: ( rule__NoteGroup__Group_0_0_1__1__Impl )
            // InternalLilyChantParser.g:1528:2: rule__NoteGroup__Group_0_0_1__1__Impl
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
    // InternalLilyChantParser.g:1534:1: rule__NoteGroup__Group_0_0_1__1__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) ) ;
    public final void rule__NoteGroup__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1538:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) ) )
            // InternalLilyChantParser.g:1539:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) )
            {
            // InternalLilyChantParser.g:1539:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 ) )
            // InternalLilyChantParser.g:1540:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_1()); 
            }
            // InternalLilyChantParser.g:1541:2: ( rule__NoteGroup__SyllablesAssignment_0_0_1_1 )
            // InternalLilyChantParser.g:1541:3: rule__NoteGroup__SyllablesAssignment_0_0_1_1
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
    // InternalLilyChantParser.g:1550:1: rule__NoteGroup__Group_2__0 : rule__NoteGroup__Group_2__0__Impl rule__NoteGroup__Group_2__1 ;
    public final void rule__NoteGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1554:1: ( rule__NoteGroup__Group_2__0__Impl rule__NoteGroup__Group_2__1 )
            // InternalLilyChantParser.g:1555:2: rule__NoteGroup__Group_2__0__Impl rule__NoteGroup__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalLilyChantParser.g:1562:1: rule__NoteGroup__Group_2__0__Impl : ( RULE_START_NOTE_GROUP ) ;
    public final void rule__NoteGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1566:1: ( ( RULE_START_NOTE_GROUP ) )
            // InternalLilyChantParser.g:1567:1: ( RULE_START_NOTE_GROUP )
            {
            // InternalLilyChantParser.g:1567:1: ( RULE_START_NOTE_GROUP )
            // InternalLilyChantParser.g:1568:2: RULE_START_NOTE_GROUP
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
    // InternalLilyChantParser.g:1577:1: rule__NoteGroup__Group_2__1 : rule__NoteGroup__Group_2__1__Impl rule__NoteGroup__Group_2__2 ;
    public final void rule__NoteGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1581:1: ( rule__NoteGroup__Group_2__1__Impl rule__NoteGroup__Group_2__2 )
            // InternalLilyChantParser.g:1582:2: rule__NoteGroup__Group_2__1__Impl rule__NoteGroup__Group_2__2
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
    // InternalLilyChantParser.g:1589:1: rule__NoteGroup__Group_2__1__Impl : ( ( ( rule__NoteGroup__SyllablesAssignment_2_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_1 )* ) ) ;
    public final void rule__NoteGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1593:1: ( ( ( ( rule__NoteGroup__SyllablesAssignment_2_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_1 )* ) ) )
            // InternalLilyChantParser.g:1594:1: ( ( ( rule__NoteGroup__SyllablesAssignment_2_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_1 )* ) )
            {
            // InternalLilyChantParser.g:1594:1: ( ( ( rule__NoteGroup__SyllablesAssignment_2_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_1 )* ) )
            // InternalLilyChantParser.g:1595:2: ( ( rule__NoteGroup__SyllablesAssignment_2_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_2_1 )* )
            {
            // InternalLilyChantParser.g:1595:2: ( ( rule__NoteGroup__SyllablesAssignment_2_1 ) )
            // InternalLilyChantParser.g:1596:3: ( rule__NoteGroup__SyllablesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_2_1()); 
            }
            // InternalLilyChantParser.g:1597:3: ( rule__NoteGroup__SyllablesAssignment_2_1 )
            // InternalLilyChantParser.g:1597:4: rule__NoteGroup__SyllablesAssignment_2_1
            {
            pushFollow(FOLLOW_25);
            rule__NoteGroup__SyllablesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_2_1()); 
            }

            }

            // InternalLilyChantParser.g:1600:2: ( ( rule__NoteGroup__SyllablesAssignment_2_1 )* )
            // InternalLilyChantParser.g:1601:3: ( rule__NoteGroup__SyllablesAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_2_1()); 
            }
            // InternalLilyChantParser.g:1602:3: ( rule__NoteGroup__SyllablesAssignment_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||(LA17_0>=RULE_HYPHEN && LA17_0<=RULE_EXTENDER)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLilyChantParser.g:1602:4: rule__NoteGroup__SyllablesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__NoteGroup__SyllablesAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_2_1()); 
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
    // $ANTLR end "rule__NoteGroup__Group_2__1__Impl"


    // $ANTLR start "rule__NoteGroup__Group_2__2"
    // InternalLilyChantParser.g:1611:1: rule__NoteGroup__Group_2__2 : rule__NoteGroup__Group_2__2__Impl ;
    public final void rule__NoteGroup__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1615:1: ( rule__NoteGroup__Group_2__2__Impl )
            // InternalLilyChantParser.g:1616:2: rule__NoteGroup__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_2__2__Impl();

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
    // InternalLilyChantParser.g:1622:1: rule__NoteGroup__Group_2__2__Impl : ( RULE_END_NOTE_GROUP ) ;
    public final void rule__NoteGroup__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1626:1: ( ( RULE_END_NOTE_GROUP ) )
            // InternalLilyChantParser.g:1627:1: ( RULE_END_NOTE_GROUP )
            {
            // InternalLilyChantParser.g:1627:1: ( RULE_END_NOTE_GROUP )
            // InternalLilyChantParser.g:1628:2: RULE_END_NOTE_GROUP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getEND_NOTE_GROUPTerminalRuleCall_2_2()); 
            }
            match(input,RULE_END_NOTE_GROUP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getEND_NOTE_GROUPTerminalRuleCall_2_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Note__Group__0"
    // InternalLilyChantParser.g:1638:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1642:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalLilyChantParser.g:1643:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalLilyChantParser.g:1650:1: rule__Note__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1654:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1655:1: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1655:1: ( RULE_ID )
            // InternalLilyChantParser.g:1656:2: RULE_ID
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
    // InternalLilyChantParser.g:1665:1: rule__Note__Group__1 : rule__Note__Group__1__Impl ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1669:1: ( rule__Note__Group__1__Impl )
            // InternalLilyChantParser.g:1670:2: rule__Note__Group__1__Impl
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
    // InternalLilyChantParser.g:1676:1: rule__Note__Group__1__Impl : ( ( RULE_DURATION )? ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1680:1: ( ( ( RULE_DURATION )? ) )
            // InternalLilyChantParser.g:1681:1: ( ( RULE_DURATION )? )
            {
            // InternalLilyChantParser.g:1681:1: ( ( RULE_DURATION )? )
            // InternalLilyChantParser.g:1682:2: ( RULE_DURATION )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteAccess().getDURATIONTerminalRuleCall_1()); 
            }
            // InternalLilyChantParser.g:1683:2: ( RULE_DURATION )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DURATION) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLilyChantParser.g:1683:3: RULE_DURATION
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
    // InternalLilyChantParser.g:1692:1: rule__Script__TonesAssignment_0 : ( ruleTone ) ;
    public final void rule__Script__TonesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1696:1: ( ( ruleTone ) )
            // InternalLilyChantParser.g:1697:2: ( ruleTone )
            {
            // InternalLilyChantParser.g:1697:2: ( ruleTone )
            // InternalLilyChantParser.g:1698:3: ruleTone
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
    // InternalLilyChantParser.g:1707:1: rule__Script__ChantsAssignment_1 : ( ruleChant ) ;
    public final void rule__Script__ChantsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1711:1: ( ( ruleChant ) )
            // InternalLilyChantParser.g:1712:2: ( ruleChant )
            {
            // InternalLilyChantParser.g:1712:2: ( ruleChant )
            // InternalLilyChantParser.g:1713:3: ruleChant
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
    // InternalLilyChantParser.g:1722:1: rule__Tone__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tone__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1726:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1727:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1727:2: ( RULE_ID )
            // InternalLilyChantParser.g:1728:3: RULE_ID
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
    // InternalLilyChantParser.g:1737:1: rule__Tone__VoiceNamesAssignment_5 : ( ruleVoiceName ) ;
    public final void rule__Tone__VoiceNamesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1741:1: ( ( ruleVoiceName ) )
            // InternalLilyChantParser.g:1742:2: ( ruleVoiceName )
            {
            // InternalLilyChantParser.g:1742:2: ( ruleVoiceName )
            // InternalLilyChantParser.g:1743:3: ruleVoiceName
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
    // InternalLilyChantParser.g:1752:1: rule__Tone__PhrasesAssignment_7 : ( ruleTonePhrase ) ;
    public final void rule__Tone__PhrasesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1756:1: ( ( ruleTonePhrase ) )
            // InternalLilyChantParser.g:1757:2: ( ruleTonePhrase )
            {
            // InternalLilyChantParser.g:1757:2: ( ruleTonePhrase )
            // InternalLilyChantParser.g:1758:3: ruleTonePhrase
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
    // InternalLilyChantParser.g:1767:1: rule__VoiceName__NameAssignment : ( RULE_ID ) ;
    public final void rule__VoiceName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1771:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1772:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1772:2: ( RULE_ID )
            // InternalLilyChantParser.g:1773:3: RULE_ID
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
    // InternalLilyChantParser.g:1782:1: rule__TonePhrase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TonePhrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1786:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1787:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1787:2: ( RULE_ID )
            // InternalLilyChantParser.g:1788:3: RULE_ID
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
    // InternalLilyChantParser.g:1797:1: rule__TonePhrase__VoicesAssignment_3 : ( ruleVoicePhrase ) ;
    public final void rule__TonePhrase__VoicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1801:1: ( ( ruleVoicePhrase ) )
            // InternalLilyChantParser.g:1802:2: ( ruleVoicePhrase )
            {
            // InternalLilyChantParser.g:1802:2: ( ruleVoicePhrase )
            // InternalLilyChantParser.g:1803:3: ruleVoicePhrase
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
    // InternalLilyChantParser.g:1812:1: rule__VoicePhrase__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VoicePhrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1816:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:1817:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:1817:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1818:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVoicePhraseAccess().getNameVoiceNameCrossReference_1_0()); 
            }
            // InternalLilyChantParser.g:1819:3: ( RULE_ID )
            // InternalLilyChantParser.g:1820:4: RULE_ID
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
    // InternalLilyChantParser.g:1831:1: rule__VoicePhrase__NotesAssignment_3 : ( ruleNote ) ;
    public final void rule__VoicePhrase__NotesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1835:1: ( ( ruleNote ) )
            // InternalLilyChantParser.g:1836:2: ( ruleNote )
            {
            // InternalLilyChantParser.g:1836:2: ( ruleNote )
            // InternalLilyChantParser.g:1837:3: ruleNote
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
    // InternalLilyChantParser.g:1846:1: rule__Chant__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Chant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1850:1: ( ( RULE_STRING ) )
            // InternalLilyChantParser.g:1851:2: ( RULE_STRING )
            {
            // InternalLilyChantParser.g:1851:2: ( RULE_STRING )
            // InternalLilyChantParser.g:1852:3: RULE_STRING
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
    // InternalLilyChantParser.g:1861:1: rule__Chant__ToneAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Chant__ToneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1865:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:1866:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:1866:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1867:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChantAccess().getToneToneCrossReference_3_0()); 
            }
            // InternalLilyChantParser.g:1868:3: ( RULE_ID )
            // InternalLilyChantParser.g:1869:4: RULE_ID
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
    // InternalLilyChantParser.g:1880:1: rule__Chant__PhrasesAssignment_5 : ( ruleLyricPhrase ) ;
    public final void rule__Chant__PhrasesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1884:1: ( ( ruleLyricPhrase ) )
            // InternalLilyChantParser.g:1885:2: ( ruleLyricPhrase )
            {
            // InternalLilyChantParser.g:1885:2: ( ruleLyricPhrase )
            // InternalLilyChantParser.g:1886:3: ruleLyricPhrase
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
    // InternalLilyChantParser.g:1895:1: rule__LyricPhrase__ExplicitPhraseAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__LyricPhrase__ExplicitPhraseAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1899:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:1900:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:1900:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1901:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLyricPhraseAccess().getExplicitPhraseTonePhraseCrossReference_0_1_0()); 
            }
            // InternalLilyChantParser.g:1902:3: ( RULE_ID )
            // InternalLilyChantParser.g:1903:4: RULE_ID
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
    // InternalLilyChantParser.g:1914:1: rule__LyricPhrase__NoteGroupsAssignment_1 : ( ruleNoteGroup ) ;
    public final void rule__LyricPhrase__NoteGroupsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1918:1: ( ( ruleNoteGroup ) )
            // InternalLilyChantParser.g:1919:2: ( ruleNoteGroup )
            {
            // InternalLilyChantParser.g:1919:2: ( ruleNoteGroup )
            // InternalLilyChantParser.g:1920:3: ruleNoteGroup
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
    // InternalLilyChantParser.g:1929:1: rule__LyricPhrase__BarAssignment_2 : ( ruleBarline ) ;
    public final void rule__LyricPhrase__BarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1933:1: ( ( ruleBarline ) )
            // InternalLilyChantParser.g:1934:2: ( ruleBarline )
            {
            // InternalLilyChantParser.g:1934:2: ( ruleBarline )
            // InternalLilyChantParser.g:1935:3: ruleBarline
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
    // InternalLilyChantParser.g:1944:1: rule__NoteGroup__SyllablesAssignment_0_0_0_0 : ( RULE_ID ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1948:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1949:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1949:2: ( RULE_ID )
            // InternalLilyChantParser.g:1950:3: RULE_ID
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
    // InternalLilyChantParser.g:1959:1: rule__NoteGroup__SyllablesAssignment_0_0_0_1_0 : ( RULE_HYPHEN ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1963:1: ( ( RULE_HYPHEN ) )
            // InternalLilyChantParser.g:1964:2: ( RULE_HYPHEN )
            {
            // InternalLilyChantParser.g:1964:2: ( RULE_HYPHEN )
            // InternalLilyChantParser.g:1965:3: RULE_HYPHEN
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
    // InternalLilyChantParser.g:1974:1: rule__NoteGroup__SyllablesAssignment_0_0_1_0 : ( RULE_HYPHEN ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1978:1: ( ( RULE_HYPHEN ) )
            // InternalLilyChantParser.g:1979:2: ( RULE_HYPHEN )
            {
            // InternalLilyChantParser.g:1979:2: ( RULE_HYPHEN )
            // InternalLilyChantParser.g:1980:3: RULE_HYPHEN
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
    // InternalLilyChantParser.g:1989:1: rule__NoteGroup__SyllablesAssignment_0_0_1_1 : ( RULE_ID ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1993:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1994:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1994:2: ( RULE_ID )
            // InternalLilyChantParser.g:1995:3: RULE_ID
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
    // InternalLilyChantParser.g:2004:1: rule__NoteGroup__SyllablesAssignment_0_1 : ( RULE_EXTENDER ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2008:1: ( ( RULE_EXTENDER ) )
            // InternalLilyChantParser.g:2009:2: ( RULE_EXTENDER )
            {
            // InternalLilyChantParser.g:2009:2: ( RULE_EXTENDER )
            // InternalLilyChantParser.g:2010:3: RULE_EXTENDER
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


    // $ANTLR start "rule__NoteGroup__SyllablesAssignment_1"
    // InternalLilyChantParser.g:2019:1: rule__NoteGroup__SyllablesAssignment_1 : ( RULE_SKIP ) ;
    public final void rule__NoteGroup__SyllablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2023:1: ( ( RULE_SKIP ) )
            // InternalLilyChantParser.g:2024:2: ( RULE_SKIP )
            {
            // InternalLilyChantParser.g:2024:2: ( RULE_SKIP )
            // InternalLilyChantParser.g:2025:3: RULE_SKIP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesSKIPTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SKIP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesSKIPTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__NoteGroup__SyllablesAssignment_2_1"
    // InternalLilyChantParser.g:2034:1: rule__NoteGroup__SyllablesAssignment_2_1 : ( ( rule__NoteGroup__SyllablesAlternatives_2_1_0 ) ) ;
    public final void rule__NoteGroup__SyllablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:2038:1: ( ( ( rule__NoteGroup__SyllablesAlternatives_2_1_0 ) ) )
            // InternalLilyChantParser.g:2039:2: ( ( rule__NoteGroup__SyllablesAlternatives_2_1_0 ) )
            {
            // InternalLilyChantParser.g:2039:2: ( ( rule__NoteGroup__SyllablesAlternatives_2_1_0 ) )
            // InternalLilyChantParser.g:2040:3: ( rule__NoteGroup__SyllablesAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_2_1_0()); 
            }
            // InternalLilyChantParser.g:2041:3: ( rule__NoteGroup__SyllablesAlternatives_2_1_0 )
            // InternalLilyChantParser.g:2041:4: rule__NoteGroup__SyllablesAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__SyllablesAlternatives_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__SyllablesAssignment_2_1"

    // $ANTLR start synpred18_InternalLilyChantParser
    public final void synpred18_InternalLilyChantParser_fragment() throws RecognitionException {   
        // InternalLilyChantParser.g:1460:3: ( rule__NoteGroup__Group_0_0_0_1__0 )
        // InternalLilyChantParser.g:1460:3: rule__NoteGroup__Group_0_0_0_1__0
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000D2400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000D2402L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000032002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008000L});

}