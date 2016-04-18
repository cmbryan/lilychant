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
    // InternalLilyChantParser.g:61:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:62:1: ( ruleScript EOF )
            // InternalLilyChantParser.g:63:1: ruleScript EOF
            {
             before(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getScriptRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLilyChantParser.g:70:1: ruleScript : ( ( rule__Script__Group__0 )? ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:74:2: ( ( ( rule__Script__Group__0 )? ) )
            // InternalLilyChantParser.g:75:2: ( ( rule__Script__Group__0 )? )
            {
            // InternalLilyChantParser.g:75:2: ( ( rule__Script__Group__0 )? )
            // InternalLilyChantParser.g:76:3: ( rule__Script__Group__0 )?
            {
             before(grammarAccess.getScriptAccess().getGroup()); 
            // InternalLilyChantParser.g:77:3: ( rule__Script__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Tone) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalLilyChantParser.g:77:4: rule__Script__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Script__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScriptAccess().getGroup()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:86:1: entryRuleTone : ruleTone EOF ;
    public final void entryRuleTone() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:87:1: ( ruleTone EOF )
            // InternalLilyChantParser.g:88:1: ruleTone EOF
            {
             before(grammarAccess.getToneRule()); 
            pushFollow(FOLLOW_1);
            ruleTone();

            state._fsp--;

             after(grammarAccess.getToneRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLilyChantParser.g:95:1: ruleTone : ( ( rule__Tone__Group__0 ) ) ;
    public final void ruleTone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:99:2: ( ( ( rule__Tone__Group__0 ) ) )
            // InternalLilyChantParser.g:100:2: ( ( rule__Tone__Group__0 ) )
            {
            // InternalLilyChantParser.g:100:2: ( ( rule__Tone__Group__0 ) )
            // InternalLilyChantParser.g:101:3: ( rule__Tone__Group__0 )
            {
             before(grammarAccess.getToneAccess().getGroup()); 
            // InternalLilyChantParser.g:102:3: ( rule__Tone__Group__0 )
            // InternalLilyChantParser.g:102:4: rule__Tone__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tone__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToneAccess().getGroup()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:111:1: entryRuleVoiceName : ruleVoiceName EOF ;
    public final void entryRuleVoiceName() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:112:1: ( ruleVoiceName EOF )
            // InternalLilyChantParser.g:113:1: ruleVoiceName EOF
            {
             before(grammarAccess.getVoiceNameRule()); 
            pushFollow(FOLLOW_1);
            ruleVoiceName();

            state._fsp--;

             after(grammarAccess.getVoiceNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLilyChantParser.g:120:1: ruleVoiceName : ( ( rule__VoiceName__NameAssignment ) ) ;
    public final void ruleVoiceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:124:2: ( ( ( rule__VoiceName__NameAssignment ) ) )
            // InternalLilyChantParser.g:125:2: ( ( rule__VoiceName__NameAssignment ) )
            {
            // InternalLilyChantParser.g:125:2: ( ( rule__VoiceName__NameAssignment ) )
            // InternalLilyChantParser.g:126:3: ( rule__VoiceName__NameAssignment )
            {
             before(grammarAccess.getVoiceNameAccess().getNameAssignment()); 
            // InternalLilyChantParser.g:127:3: ( rule__VoiceName__NameAssignment )
            // InternalLilyChantParser.g:127:4: rule__VoiceName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VoiceName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVoiceNameAccess().getNameAssignment()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:136:1: entryRuleTonePhrase : ruleTonePhrase EOF ;
    public final void entryRuleTonePhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:137:1: ( ruleTonePhrase EOF )
            // InternalLilyChantParser.g:138:1: ruleTonePhrase EOF
            {
             before(grammarAccess.getTonePhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleTonePhrase();

            state._fsp--;

             after(grammarAccess.getTonePhraseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLilyChantParser.g:145:1: ruleTonePhrase : ( ( rule__TonePhrase__Group__0 ) ) ;
    public final void ruleTonePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:149:2: ( ( ( rule__TonePhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:150:2: ( ( rule__TonePhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:150:2: ( ( rule__TonePhrase__Group__0 ) )
            // InternalLilyChantParser.g:151:3: ( rule__TonePhrase__Group__0 )
            {
             before(grammarAccess.getTonePhraseAccess().getGroup()); 
            // InternalLilyChantParser.g:152:3: ( rule__TonePhrase__Group__0 )
            // InternalLilyChantParser.g:152:4: rule__TonePhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TonePhrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTonePhraseAccess().getGroup()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:161:1: entryRuleVoicePhrase : ruleVoicePhrase EOF ;
    public final void entryRuleVoicePhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:162:1: ( ruleVoicePhrase EOF )
            // InternalLilyChantParser.g:163:1: ruleVoicePhrase EOF
            {
             before(grammarAccess.getVoicePhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleVoicePhrase();

            state._fsp--;

             after(grammarAccess.getVoicePhraseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLilyChantParser.g:170:1: ruleVoicePhrase : ( ( rule__VoicePhrase__Group__0 ) ) ;
    public final void ruleVoicePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:174:2: ( ( ( rule__VoicePhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:175:2: ( ( rule__VoicePhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:175:2: ( ( rule__VoicePhrase__Group__0 ) )
            // InternalLilyChantParser.g:176:3: ( rule__VoicePhrase__Group__0 )
            {
             before(grammarAccess.getVoicePhraseAccess().getGroup()); 
            // InternalLilyChantParser.g:177:3: ( rule__VoicePhrase__Group__0 )
            // InternalLilyChantParser.g:177:4: rule__VoicePhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VoicePhrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVoicePhraseAccess().getGroup()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:186:1: entryRuleChant : ruleChant EOF ;
    public final void entryRuleChant() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:187:1: ( ruleChant EOF )
            // InternalLilyChantParser.g:188:1: ruleChant EOF
            {
             before(grammarAccess.getChantRule()); 
            pushFollow(FOLLOW_1);
            ruleChant();

            state._fsp--;

             after(grammarAccess.getChantRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLilyChantParser.g:195:1: ruleChant : ( ( rule__Chant__Group__0 ) ) ;
    public final void ruleChant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:199:2: ( ( ( rule__Chant__Group__0 ) ) )
            // InternalLilyChantParser.g:200:2: ( ( rule__Chant__Group__0 ) )
            {
            // InternalLilyChantParser.g:200:2: ( ( rule__Chant__Group__0 ) )
            // InternalLilyChantParser.g:201:3: ( rule__Chant__Group__0 )
            {
             before(grammarAccess.getChantAccess().getGroup()); 
            // InternalLilyChantParser.g:202:3: ( rule__Chant__Group__0 )
            // InternalLilyChantParser.g:202:4: rule__Chant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChantAccess().getGroup()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:211:1: entryRuleLyricPhrase : ruleLyricPhrase EOF ;
    public final void entryRuleLyricPhrase() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:212:1: ( ruleLyricPhrase EOF )
            // InternalLilyChantParser.g:213:1: ruleLyricPhrase EOF
            {
             before(grammarAccess.getLyricPhraseRule()); 
            pushFollow(FOLLOW_1);
            ruleLyricPhrase();

            state._fsp--;

             after(grammarAccess.getLyricPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLilyChantParser.g:220:1: ruleLyricPhrase : ( ( rule__LyricPhrase__Group__0 ) ) ;
    public final void ruleLyricPhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:224:2: ( ( ( rule__LyricPhrase__Group__0 ) ) )
            // InternalLilyChantParser.g:225:2: ( ( rule__LyricPhrase__Group__0 ) )
            {
            // InternalLilyChantParser.g:225:2: ( ( rule__LyricPhrase__Group__0 ) )
            // InternalLilyChantParser.g:226:3: ( rule__LyricPhrase__Group__0 )
            {
             before(grammarAccess.getLyricPhraseAccess().getGroup()); 
            // InternalLilyChantParser.g:227:3: ( rule__LyricPhrase__Group__0 )
            // InternalLilyChantParser.g:227:4: rule__LyricPhrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLyricPhraseAccess().getGroup()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:236:1: entryRuleNoteGroup : ruleNoteGroup EOF ;
    public final void entryRuleNoteGroup() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:237:1: ( ruleNoteGroup EOF )
            // InternalLilyChantParser.g:238:1: ruleNoteGroup EOF
            {
             before(grammarAccess.getNoteGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleNoteGroup();

            state._fsp--;

             after(grammarAccess.getNoteGroupRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLilyChantParser.g:245:1: ruleNoteGroup : ( ( rule__NoteGroup__Alternatives ) ) ;
    public final void ruleNoteGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:249:2: ( ( ( rule__NoteGroup__Alternatives ) ) )
            // InternalLilyChantParser.g:250:2: ( ( rule__NoteGroup__Alternatives ) )
            {
            // InternalLilyChantParser.g:250:2: ( ( rule__NoteGroup__Alternatives ) )
            // InternalLilyChantParser.g:251:3: ( rule__NoteGroup__Alternatives )
            {
             before(grammarAccess.getNoteGroupAccess().getAlternatives()); 
            // InternalLilyChantParser.g:252:3: ( rule__NoteGroup__Alternatives )
            // InternalLilyChantParser.g:252:4: rule__NoteGroup__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoteGroupAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:261:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalLilyChantParser.g:262:1: ( ruleNote EOF )
            // InternalLilyChantParser.g:263:1: ruleNote EOF
            {
             before(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getNoteRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLilyChantParser.g:270:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:274:2: ( ( ( rule__Note__Group__0 ) ) )
            // InternalLilyChantParser.g:275:2: ( ( rule__Note__Group__0 ) )
            {
            // InternalLilyChantParser.g:275:2: ( ( rule__Note__Group__0 ) )
            // InternalLilyChantParser.g:276:3: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // InternalLilyChantParser.g:277:3: ( rule__Note__Group__0 )
            // InternalLilyChantParser.g:277:4: rule__Note__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getGroup()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:285:1: rule__NoteGroup__Alternatives : ( ( ( rule__NoteGroup__Group_0__0 ) ) | ( ( rule__NoteGroup__Group_1__0 ) ) );
    public final void rule__NoteGroup__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:289:1: ( ( ( rule__NoteGroup__Group_0__0 ) ) | ( ( rule__NoteGroup__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_START_NOTE_GROUP) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLilyChantParser.g:290:2: ( ( rule__NoteGroup__Group_0__0 ) )
                    {
                    // InternalLilyChantParser.g:290:2: ( ( rule__NoteGroup__Group_0__0 ) )
                    // InternalLilyChantParser.g:291:3: ( rule__NoteGroup__Group_0__0 )
                    {
                     before(grammarAccess.getNoteGroupAccess().getGroup_0()); 
                    // InternalLilyChantParser.g:292:3: ( rule__NoteGroup__Group_0__0 )
                    // InternalLilyChantParser.g:292:4: rule__NoteGroup__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NoteGroup__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNoteGroupAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLilyChantParser.g:296:2: ( ( rule__NoteGroup__Group_1__0 ) )
                    {
                    // InternalLilyChantParser.g:296:2: ( ( rule__NoteGroup__Group_1__0 ) )
                    // InternalLilyChantParser.g:297:3: ( rule__NoteGroup__Group_1__0 )
                    {
                     before(grammarAccess.getNoteGroupAccess().getGroup_1()); 
                    // InternalLilyChantParser.g:298:3: ( rule__NoteGroup__Group_1__0 )
                    // InternalLilyChantParser.g:298:4: rule__NoteGroup__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NoteGroup__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNoteGroupAccess().getGroup_1()); 

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


    // $ANTLR start "rule__NoteGroup__SyllablesAlternatives_0_1_0"
    // InternalLilyChantParser.g:306:1: rule__NoteGroup__SyllablesAlternatives_0_1_0 : ( ( RULE_HYPHEN ) | ( RULE_EXTENDER ) );
    public final void rule__NoteGroup__SyllablesAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:310:1: ( ( RULE_HYPHEN ) | ( RULE_EXTENDER ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_HYPHEN) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_EXTENDER) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLilyChantParser.g:311:2: ( RULE_HYPHEN )
                    {
                    // InternalLilyChantParser.g:311:2: ( RULE_HYPHEN )
                    // InternalLilyChantParser.g:312:3: RULE_HYPHEN
                    {
                     before(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_HYPHEN,FOLLOW_2); 
                     after(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLilyChantParser.g:317:2: ( RULE_EXTENDER )
                    {
                    // InternalLilyChantParser.g:317:2: ( RULE_EXTENDER )
                    // InternalLilyChantParser.g:318:3: RULE_EXTENDER
                    {
                     before(grammarAccess.getNoteGroupAccess().getSyllablesEXTENDERTerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_EXTENDER,FOLLOW_2); 
                     after(grammarAccess.getNoteGroupAccess().getSyllablesEXTENDERTerminalRuleCall_0_1_0_1()); 

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
    // $ANTLR end "rule__NoteGroup__SyllablesAlternatives_0_1_0"


    // $ANTLR start "rule__NoteGroup__SyllablesAlternatives_1_1_0"
    // InternalLilyChantParser.g:327:1: rule__NoteGroup__SyllablesAlternatives_1_1_0 : ( ( RULE_ID ) | ( RULE_HYPHEN ) );
    public final void rule__NoteGroup__SyllablesAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:331:1: ( ( RULE_ID ) | ( RULE_HYPHEN ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_HYPHEN) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLilyChantParser.g:332:2: ( RULE_ID )
                    {
                    // InternalLilyChantParser.g:332:2: ( RULE_ID )
                    // InternalLilyChantParser.g:333:3: RULE_ID
                    {
                     before(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_1_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLilyChantParser.g:338:2: ( RULE_HYPHEN )
                    {
                    // InternalLilyChantParser.g:338:2: ( RULE_HYPHEN )
                    // InternalLilyChantParser.g:339:3: RULE_HYPHEN
                    {
                     before(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_1_1_0_1()); 
                    match(input,RULE_HYPHEN,FOLLOW_2); 
                     after(grammarAccess.getNoteGroupAccess().getSyllablesHYPHENTerminalRuleCall_1_1_0_1()); 

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
    // InternalLilyChantParser.g:348:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:352:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // InternalLilyChantParser.g:353:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Script__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__1();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:360:1: rule__Script__Group__0__Impl : ( ( ( rule__Script__TonesAssignment_0 ) ) ( ( rule__Script__TonesAssignment_0 )* ) ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:364:1: ( ( ( ( rule__Script__TonesAssignment_0 ) ) ( ( rule__Script__TonesAssignment_0 )* ) ) )
            // InternalLilyChantParser.g:365:1: ( ( ( rule__Script__TonesAssignment_0 ) ) ( ( rule__Script__TonesAssignment_0 )* ) )
            {
            // InternalLilyChantParser.g:365:1: ( ( ( rule__Script__TonesAssignment_0 ) ) ( ( rule__Script__TonesAssignment_0 )* ) )
            // InternalLilyChantParser.g:366:2: ( ( rule__Script__TonesAssignment_0 ) ) ( ( rule__Script__TonesAssignment_0 )* )
            {
            // InternalLilyChantParser.g:366:2: ( ( rule__Script__TonesAssignment_0 ) )
            // InternalLilyChantParser.g:367:3: ( rule__Script__TonesAssignment_0 )
            {
             before(grammarAccess.getScriptAccess().getTonesAssignment_0()); 
            // InternalLilyChantParser.g:368:3: ( rule__Script__TonesAssignment_0 )
            // InternalLilyChantParser.g:368:4: rule__Script__TonesAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__Script__TonesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getTonesAssignment_0()); 

            }

            // InternalLilyChantParser.g:371:2: ( ( rule__Script__TonesAssignment_0 )* )
            // InternalLilyChantParser.g:372:3: ( rule__Script__TonesAssignment_0 )*
            {
             before(grammarAccess.getScriptAccess().getTonesAssignment_0()); 
            // InternalLilyChantParser.g:373:3: ( rule__Script__TonesAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Tone) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLilyChantParser.g:373:4: rule__Script__TonesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Script__TonesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

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
    // InternalLilyChantParser.g:382:1: rule__Script__Group__1 : rule__Script__Group__1__Impl ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:386:1: ( rule__Script__Group__1__Impl )
            // InternalLilyChantParser.g:387:2: rule__Script__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:393:1: rule__Script__Group__1__Impl : ( ( rule__Script__ChantsAssignment_1 )* ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:397:1: ( ( ( rule__Script__ChantsAssignment_1 )* ) )
            // InternalLilyChantParser.g:398:1: ( ( rule__Script__ChantsAssignment_1 )* )
            {
            // InternalLilyChantParser.g:398:1: ( ( rule__Script__ChantsAssignment_1 )* )
            // InternalLilyChantParser.g:399:2: ( rule__Script__ChantsAssignment_1 )*
            {
             before(grammarAccess.getScriptAccess().getChantsAssignment_1()); 
            // InternalLilyChantParser.g:400:2: ( rule__Script__ChantsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Chant) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLilyChantParser.g:400:3: rule__Script__ChantsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Script__ChantsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getChantsAssignment_1()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:409:1: rule__Tone__Group__0 : rule__Tone__Group__0__Impl rule__Tone__Group__1 ;
    public final void rule__Tone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:413:1: ( rule__Tone__Group__0__Impl rule__Tone__Group__1 )
            // InternalLilyChantParser.g:414:2: rule__Tone__Group__0__Impl rule__Tone__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Tone__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tone__Group__1();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:421:1: rule__Tone__Group__0__Impl : ( Tone ) ;
    public final void rule__Tone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:425:1: ( ( Tone ) )
            // InternalLilyChantParser.g:426:1: ( Tone )
            {
            // InternalLilyChantParser.g:426:1: ( Tone )
            // InternalLilyChantParser.g:427:2: Tone
            {
             before(grammarAccess.getToneAccess().getToneKeyword_0()); 
            match(input,Tone,FOLLOW_2); 
             after(grammarAccess.getToneAccess().getToneKeyword_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:436:1: rule__Tone__Group__1 : rule__Tone__Group__1__Impl rule__Tone__Group__2 ;
    public final void rule__Tone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:440:1: ( rule__Tone__Group__1__Impl rule__Tone__Group__2 )
            // InternalLilyChantParser.g:441:2: rule__Tone__Group__1__Impl rule__Tone__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Tone__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tone__Group__2();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:448:1: rule__Tone__Group__1__Impl : ( ( rule__Tone__NameAssignment_1 ) ) ;
    public final void rule__Tone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:452:1: ( ( ( rule__Tone__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:453:1: ( ( rule__Tone__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:453:1: ( ( rule__Tone__NameAssignment_1 ) )
            // InternalLilyChantParser.g:454:2: ( rule__Tone__NameAssignment_1 )
            {
             before(grammarAccess.getToneAccess().getNameAssignment_1()); 
            // InternalLilyChantParser.g:455:2: ( rule__Tone__NameAssignment_1 )
            // InternalLilyChantParser.g:455:3: rule__Tone__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tone__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getToneAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:463:1: rule__Tone__Group__2 : rule__Tone__Group__2__Impl rule__Tone__Group__3 ;
    public final void rule__Tone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:467:1: ( rule__Tone__Group__2__Impl rule__Tone__Group__3 )
            // InternalLilyChantParser.g:468:2: rule__Tone__Group__2__Impl rule__Tone__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Tone__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tone__Group__3();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:475:1: rule__Tone__Group__2__Impl : ( In ) ;
    public final void rule__Tone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:479:1: ( ( In ) )
            // InternalLilyChantParser.g:480:1: ( In )
            {
            // InternalLilyChantParser.g:480:1: ( In )
            // InternalLilyChantParser.g:481:2: In
            {
             before(grammarAccess.getToneAccess().getInKeyword_2()); 
            match(input,In,FOLLOW_2); 
             after(grammarAccess.getToneAccess().getInKeyword_2()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:490:1: rule__Tone__Group__3 : rule__Tone__Group__3__Impl rule__Tone__Group__4 ;
    public final void rule__Tone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:494:1: ( rule__Tone__Group__3__Impl rule__Tone__Group__4 )
            // InternalLilyChantParser.g:495:2: rule__Tone__Group__3__Impl rule__Tone__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Tone__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tone__Group__4();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:502:1: rule__Tone__Group__3__Impl : ( ( rule__Tone__KeyAssignment_3 ) ) ;
    public final void rule__Tone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:506:1: ( ( ( rule__Tone__KeyAssignment_3 ) ) )
            // InternalLilyChantParser.g:507:1: ( ( rule__Tone__KeyAssignment_3 ) )
            {
            // InternalLilyChantParser.g:507:1: ( ( rule__Tone__KeyAssignment_3 ) )
            // InternalLilyChantParser.g:508:2: ( rule__Tone__KeyAssignment_3 )
            {
             before(grammarAccess.getToneAccess().getKeyAssignment_3()); 
            // InternalLilyChantParser.g:509:2: ( rule__Tone__KeyAssignment_3 )
            // InternalLilyChantParser.g:509:3: rule__Tone__KeyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Tone__KeyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getToneAccess().getKeyAssignment_3()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:517:1: rule__Tone__Group__4 : rule__Tone__Group__4__Impl rule__Tone__Group__5 ;
    public final void rule__Tone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:521:1: ( rule__Tone__Group__4__Impl rule__Tone__Group__5 )
            // InternalLilyChantParser.g:522:2: rule__Tone__Group__4__Impl rule__Tone__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Tone__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tone__Group__5();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:529:1: rule__Tone__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__Tone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:533:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:534:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:534:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:535:2: RULE_BEGIN
            {
             before(grammarAccess.getToneAccess().getBEGINTerminalRuleCall_4()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getToneAccess().getBEGINTerminalRuleCall_4()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:544:1: rule__Tone__Group__5 : rule__Tone__Group__5__Impl rule__Tone__Group__6 ;
    public final void rule__Tone__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:548:1: ( rule__Tone__Group__5__Impl rule__Tone__Group__6 )
            // InternalLilyChantParser.g:549:2: rule__Tone__Group__5__Impl rule__Tone__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Tone__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tone__Group__6();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:556:1: rule__Tone__Group__5__Impl : ( Voices ) ;
    public final void rule__Tone__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:560:1: ( ( Voices ) )
            // InternalLilyChantParser.g:561:1: ( Voices )
            {
            // InternalLilyChantParser.g:561:1: ( Voices )
            // InternalLilyChantParser.g:562:2: Voices
            {
             before(grammarAccess.getToneAccess().getVoicesKeyword_5()); 
            match(input,Voices,FOLLOW_2); 
             after(grammarAccess.getToneAccess().getVoicesKeyword_5()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:571:1: rule__Tone__Group__6 : rule__Tone__Group__6__Impl rule__Tone__Group__7 ;
    public final void rule__Tone__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:575:1: ( rule__Tone__Group__6__Impl rule__Tone__Group__7 )
            // InternalLilyChantParser.g:576:2: rule__Tone__Group__6__Impl rule__Tone__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Tone__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tone__Group__7();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:583:1: rule__Tone__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__Tone__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:587:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:588:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:588:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:589:2: RULE_BEGIN
            {
             before(grammarAccess.getToneAccess().getBEGINTerminalRuleCall_6()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getToneAccess().getBEGINTerminalRuleCall_6()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:598:1: rule__Tone__Group__7 : rule__Tone__Group__7__Impl rule__Tone__Group__8 ;
    public final void rule__Tone__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:602:1: ( rule__Tone__Group__7__Impl rule__Tone__Group__8 )
            // InternalLilyChantParser.g:603:2: rule__Tone__Group__7__Impl rule__Tone__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Tone__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tone__Group__8();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:610:1: rule__Tone__Group__7__Impl : ( ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* ) ) ;
    public final void rule__Tone__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:614:1: ( ( ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* ) ) )
            // InternalLilyChantParser.g:615:1: ( ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* ) )
            {
            // InternalLilyChantParser.g:615:1: ( ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* ) )
            // InternalLilyChantParser.g:616:2: ( ( rule__Tone__VoiceNamesAssignment_7 ) ) ( ( rule__Tone__VoiceNamesAssignment_7 )* )
            {
            // InternalLilyChantParser.g:616:2: ( ( rule__Tone__VoiceNamesAssignment_7 ) )
            // InternalLilyChantParser.g:617:3: ( rule__Tone__VoiceNamesAssignment_7 )
            {
             before(grammarAccess.getToneAccess().getVoiceNamesAssignment_7()); 
            // InternalLilyChantParser.g:618:3: ( rule__Tone__VoiceNamesAssignment_7 )
            // InternalLilyChantParser.g:618:4: rule__Tone__VoiceNamesAssignment_7
            {
            pushFollow(FOLLOW_11);
            rule__Tone__VoiceNamesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getToneAccess().getVoiceNamesAssignment_7()); 

            }

            // InternalLilyChantParser.g:621:2: ( ( rule__Tone__VoiceNamesAssignment_7 )* )
            // InternalLilyChantParser.g:622:3: ( rule__Tone__VoiceNamesAssignment_7 )*
            {
             before(grammarAccess.getToneAccess().getVoiceNamesAssignment_7()); 
            // InternalLilyChantParser.g:623:3: ( rule__Tone__VoiceNamesAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLilyChantParser.g:623:4: rule__Tone__VoiceNamesAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Tone__VoiceNamesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getToneAccess().getVoiceNamesAssignment_7()); 

            }


            }


            }

        }
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
    // InternalLilyChantParser.g:632:1: rule__Tone__Group__8 : rule__Tone__Group__8__Impl rule__Tone__Group__9 ;
    public final void rule__Tone__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:636:1: ( rule__Tone__Group__8__Impl rule__Tone__Group__9 )
            // InternalLilyChantParser.g:637:2: rule__Tone__Group__8__Impl rule__Tone__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Tone__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tone__Group__9();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:644:1: rule__Tone__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Tone__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:648:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:649:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:649:1: ( RULE_END )
            // InternalLilyChantParser.g:650:2: RULE_END
            {
             before(grammarAccess.getToneAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getToneAccess().getENDTerminalRuleCall_8()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:659:1: rule__Tone__Group__9 : rule__Tone__Group__9__Impl rule__Tone__Group__10 ;
    public final void rule__Tone__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:663:1: ( rule__Tone__Group__9__Impl rule__Tone__Group__10 )
            // InternalLilyChantParser.g:664:2: rule__Tone__Group__9__Impl rule__Tone__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Tone__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tone__Group__10();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:671:1: rule__Tone__Group__9__Impl : ( ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* ) ) ;
    public final void rule__Tone__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:675:1: ( ( ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* ) ) )
            // InternalLilyChantParser.g:676:1: ( ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* ) )
            {
            // InternalLilyChantParser.g:676:1: ( ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* ) )
            // InternalLilyChantParser.g:677:2: ( ( rule__Tone__PhrasesAssignment_9 ) ) ( ( rule__Tone__PhrasesAssignment_9 )* )
            {
            // InternalLilyChantParser.g:677:2: ( ( rule__Tone__PhrasesAssignment_9 ) )
            // InternalLilyChantParser.g:678:3: ( rule__Tone__PhrasesAssignment_9 )
            {
             before(grammarAccess.getToneAccess().getPhrasesAssignment_9()); 
            // InternalLilyChantParser.g:679:3: ( rule__Tone__PhrasesAssignment_9 )
            // InternalLilyChantParser.g:679:4: rule__Tone__PhrasesAssignment_9
            {
            pushFollow(FOLLOW_13);
            rule__Tone__PhrasesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getToneAccess().getPhrasesAssignment_9()); 

            }

            // InternalLilyChantParser.g:682:2: ( ( rule__Tone__PhrasesAssignment_9 )* )
            // InternalLilyChantParser.g:683:3: ( rule__Tone__PhrasesAssignment_9 )*
            {
             before(grammarAccess.getToneAccess().getPhrasesAssignment_9()); 
            // InternalLilyChantParser.g:684:3: ( rule__Tone__PhrasesAssignment_9 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Phrase) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLilyChantParser.g:684:4: rule__Tone__PhrasesAssignment_9
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Tone__PhrasesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getToneAccess().getPhrasesAssignment_9()); 

            }


            }


            }

        }
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
    // InternalLilyChantParser.g:693:1: rule__Tone__Group__10 : rule__Tone__Group__10__Impl ;
    public final void rule__Tone__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:697:1: ( rule__Tone__Group__10__Impl )
            // InternalLilyChantParser.g:698:2: rule__Tone__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tone__Group__10__Impl();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:704:1: rule__Tone__Group__10__Impl : ( RULE_END ) ;
    public final void rule__Tone__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:708:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:709:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:709:1: ( RULE_END )
            // InternalLilyChantParser.g:710:2: RULE_END
            {
             before(grammarAccess.getToneAccess().getENDTerminalRuleCall_10()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getToneAccess().getENDTerminalRuleCall_10()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:720:1: rule__TonePhrase__Group__0 : rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1 ;
    public final void rule__TonePhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:724:1: ( rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1 )
            // InternalLilyChantParser.g:725:2: rule__TonePhrase__Group__0__Impl rule__TonePhrase__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TonePhrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TonePhrase__Group__1();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:732:1: rule__TonePhrase__Group__0__Impl : ( Phrase ) ;
    public final void rule__TonePhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:736:1: ( ( Phrase ) )
            // InternalLilyChantParser.g:737:1: ( Phrase )
            {
            // InternalLilyChantParser.g:737:1: ( Phrase )
            // InternalLilyChantParser.g:738:2: Phrase
            {
             before(grammarAccess.getTonePhraseAccess().getPhraseKeyword_0()); 
            match(input,Phrase,FOLLOW_2); 
             after(grammarAccess.getTonePhraseAccess().getPhraseKeyword_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:747:1: rule__TonePhrase__Group__1 : rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2 ;
    public final void rule__TonePhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:751:1: ( rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2 )
            // InternalLilyChantParser.g:752:2: rule__TonePhrase__Group__1__Impl rule__TonePhrase__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__TonePhrase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TonePhrase__Group__2();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:759:1: rule__TonePhrase__Group__1__Impl : ( ( rule__TonePhrase__NameAssignment_1 ) ) ;
    public final void rule__TonePhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:763:1: ( ( ( rule__TonePhrase__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:764:1: ( ( rule__TonePhrase__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:764:1: ( ( rule__TonePhrase__NameAssignment_1 ) )
            // InternalLilyChantParser.g:765:2: ( rule__TonePhrase__NameAssignment_1 )
            {
             before(grammarAccess.getTonePhraseAccess().getNameAssignment_1()); 
            // InternalLilyChantParser.g:766:2: ( rule__TonePhrase__NameAssignment_1 )
            // InternalLilyChantParser.g:766:3: rule__TonePhrase__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TonePhrase__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTonePhraseAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:774:1: rule__TonePhrase__Group__2 : rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3 ;
    public final void rule__TonePhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:778:1: ( rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3 )
            // InternalLilyChantParser.g:779:2: rule__TonePhrase__Group__2__Impl rule__TonePhrase__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__TonePhrase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TonePhrase__Group__3();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:786:1: rule__TonePhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__TonePhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:790:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:791:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:791:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:792:2: RULE_BEGIN
            {
             before(grammarAccess.getTonePhraseAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getTonePhraseAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:801:1: rule__TonePhrase__Group__3 : rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4 ;
    public final void rule__TonePhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:805:1: ( rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4 )
            // InternalLilyChantParser.g:806:2: rule__TonePhrase__Group__3__Impl rule__TonePhrase__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__TonePhrase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TonePhrase__Group__4();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:813:1: rule__TonePhrase__Group__3__Impl : ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) ) ;
    public final void rule__TonePhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:817:1: ( ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:818:1: ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:818:1: ( ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* ) )
            // InternalLilyChantParser.g:819:2: ( ( rule__TonePhrase__VoicesAssignment_3 ) ) ( ( rule__TonePhrase__VoicesAssignment_3 )* )
            {
            // InternalLilyChantParser.g:819:2: ( ( rule__TonePhrase__VoicesAssignment_3 ) )
            // InternalLilyChantParser.g:820:3: ( rule__TonePhrase__VoicesAssignment_3 )
            {
             before(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            // InternalLilyChantParser.g:821:3: ( rule__TonePhrase__VoicesAssignment_3 )
            // InternalLilyChantParser.g:821:4: rule__TonePhrase__VoicesAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__TonePhrase__VoicesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 

            }

            // InternalLilyChantParser.g:824:2: ( ( rule__TonePhrase__VoicesAssignment_3 )* )
            // InternalLilyChantParser.g:825:3: ( rule__TonePhrase__VoicesAssignment_3 )*
            {
             before(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 
            // InternalLilyChantParser.g:826:3: ( rule__TonePhrase__VoicesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Voice) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLilyChantParser.g:826:4: rule__TonePhrase__VoicesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TonePhrase__VoicesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3()); 

            }


            }


            }

        }
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
    // InternalLilyChantParser.g:835:1: rule__TonePhrase__Group__4 : rule__TonePhrase__Group__4__Impl ;
    public final void rule__TonePhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:839:1: ( rule__TonePhrase__Group__4__Impl )
            // InternalLilyChantParser.g:840:2: rule__TonePhrase__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TonePhrase__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:846:1: rule__TonePhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__TonePhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:850:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:851:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:851:1: ( RULE_END )
            // InternalLilyChantParser.g:852:2: RULE_END
            {
             before(grammarAccess.getTonePhraseAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getTonePhraseAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:862:1: rule__VoicePhrase__Group__0 : rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1 ;
    public final void rule__VoicePhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:866:1: ( rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1 )
            // InternalLilyChantParser.g:867:2: rule__VoicePhrase__Group__0__Impl rule__VoicePhrase__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VoicePhrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoicePhrase__Group__1();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:874:1: rule__VoicePhrase__Group__0__Impl : ( Voice ) ;
    public final void rule__VoicePhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:878:1: ( ( Voice ) )
            // InternalLilyChantParser.g:879:1: ( Voice )
            {
            // InternalLilyChantParser.g:879:1: ( Voice )
            // InternalLilyChantParser.g:880:2: Voice
            {
             before(grammarAccess.getVoicePhraseAccess().getVoiceKeyword_0()); 
            match(input,Voice,FOLLOW_2); 
             after(grammarAccess.getVoicePhraseAccess().getVoiceKeyword_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:889:1: rule__VoicePhrase__Group__1 : rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2 ;
    public final void rule__VoicePhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:893:1: ( rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2 )
            // InternalLilyChantParser.g:894:2: rule__VoicePhrase__Group__1__Impl rule__VoicePhrase__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__VoicePhrase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoicePhrase__Group__2();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:901:1: rule__VoicePhrase__Group__1__Impl : ( ( rule__VoicePhrase__NameAssignment_1 ) ) ;
    public final void rule__VoicePhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:905:1: ( ( ( rule__VoicePhrase__NameAssignment_1 ) ) )
            // InternalLilyChantParser.g:906:1: ( ( rule__VoicePhrase__NameAssignment_1 ) )
            {
            // InternalLilyChantParser.g:906:1: ( ( rule__VoicePhrase__NameAssignment_1 ) )
            // InternalLilyChantParser.g:907:2: ( rule__VoicePhrase__NameAssignment_1 )
            {
             before(grammarAccess.getVoicePhraseAccess().getNameAssignment_1()); 
            // InternalLilyChantParser.g:908:2: ( rule__VoicePhrase__NameAssignment_1 )
            // InternalLilyChantParser.g:908:3: rule__VoicePhrase__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VoicePhrase__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVoicePhraseAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:916:1: rule__VoicePhrase__Group__2 : rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3 ;
    public final void rule__VoicePhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:920:1: ( rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3 )
            // InternalLilyChantParser.g:921:2: rule__VoicePhrase__Group__2__Impl rule__VoicePhrase__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__VoicePhrase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoicePhrase__Group__3();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:928:1: rule__VoicePhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__VoicePhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:932:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:933:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:933:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:934:2: RULE_BEGIN
            {
             before(grammarAccess.getVoicePhraseAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getVoicePhraseAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:943:1: rule__VoicePhrase__Group__3 : rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4 ;
    public final void rule__VoicePhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:947:1: ( rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4 )
            // InternalLilyChantParser.g:948:2: rule__VoicePhrase__Group__3__Impl rule__VoicePhrase__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__VoicePhrase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoicePhrase__Group__4();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:955:1: rule__VoicePhrase__Group__3__Impl : ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) ) ;
    public final void rule__VoicePhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:959:1: ( ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:960:1: ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:960:1: ( ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* ) )
            // InternalLilyChantParser.g:961:2: ( ( rule__VoicePhrase__NotesAssignment_3 ) ) ( ( rule__VoicePhrase__NotesAssignment_3 )* )
            {
            // InternalLilyChantParser.g:961:2: ( ( rule__VoicePhrase__NotesAssignment_3 ) )
            // InternalLilyChantParser.g:962:3: ( rule__VoicePhrase__NotesAssignment_3 )
            {
             before(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            // InternalLilyChantParser.g:963:3: ( rule__VoicePhrase__NotesAssignment_3 )
            // InternalLilyChantParser.g:963:4: rule__VoicePhrase__NotesAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__VoicePhrase__NotesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 

            }

            // InternalLilyChantParser.g:966:2: ( ( rule__VoicePhrase__NotesAssignment_3 )* )
            // InternalLilyChantParser.g:967:3: ( rule__VoicePhrase__NotesAssignment_3 )*
            {
             before(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 
            // InternalLilyChantParser.g:968:3: ( rule__VoicePhrase__NotesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLilyChantParser.g:968:4: rule__VoicePhrase__NotesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__VoicePhrase__NotesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3()); 

            }


            }


            }

        }
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
    // InternalLilyChantParser.g:977:1: rule__VoicePhrase__Group__4 : rule__VoicePhrase__Group__4__Impl ;
    public final void rule__VoicePhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:981:1: ( rule__VoicePhrase__Group__4__Impl )
            // InternalLilyChantParser.g:982:2: rule__VoicePhrase__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoicePhrase__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:988:1: rule__VoicePhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__VoicePhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:992:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:993:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:993:1: ( RULE_END )
            // InternalLilyChantParser.g:994:2: RULE_END
            {
             before(grammarAccess.getVoicePhraseAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getVoicePhraseAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1004:1: rule__Chant__Group__0 : rule__Chant__Group__0__Impl rule__Chant__Group__1 ;
    public final void rule__Chant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1008:1: ( rule__Chant__Group__0__Impl rule__Chant__Group__1 )
            // InternalLilyChantParser.g:1009:2: rule__Chant__Group__0__Impl rule__Chant__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Chant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chant__Group__1();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1016:1: rule__Chant__Group__0__Impl : ( Chant ) ;
    public final void rule__Chant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1020:1: ( ( Chant ) )
            // InternalLilyChantParser.g:1021:1: ( Chant )
            {
            // InternalLilyChantParser.g:1021:1: ( Chant )
            // InternalLilyChantParser.g:1022:2: Chant
            {
             before(grammarAccess.getChantAccess().getChantKeyword_0()); 
            match(input,Chant,FOLLOW_2); 
             after(grammarAccess.getChantAccess().getChantKeyword_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1031:1: rule__Chant__Group__1 : rule__Chant__Group__1__Impl rule__Chant__Group__2 ;
    public final void rule__Chant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1035:1: ( rule__Chant__Group__1__Impl rule__Chant__Group__2 )
            // InternalLilyChantParser.g:1036:2: rule__Chant__Group__1__Impl rule__Chant__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Chant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chant__Group__2();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1043:1: rule__Chant__Group__1__Impl : ( In ) ;
    public final void rule__Chant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1047:1: ( ( In ) )
            // InternalLilyChantParser.g:1048:1: ( In )
            {
            // InternalLilyChantParser.g:1048:1: ( In )
            // InternalLilyChantParser.g:1049:2: In
            {
             before(grammarAccess.getChantAccess().getInKeyword_1()); 
            match(input,In,FOLLOW_2); 
             after(grammarAccess.getChantAccess().getInKeyword_1()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1058:1: rule__Chant__Group__2 : rule__Chant__Group__2__Impl rule__Chant__Group__3 ;
    public final void rule__Chant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1062:1: ( rule__Chant__Group__2__Impl rule__Chant__Group__3 )
            // InternalLilyChantParser.g:1063:2: rule__Chant__Group__2__Impl rule__Chant__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Chant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chant__Group__3();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1070:1: rule__Chant__Group__2__Impl : ( Tone ) ;
    public final void rule__Chant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1074:1: ( ( Tone ) )
            // InternalLilyChantParser.g:1075:1: ( Tone )
            {
            // InternalLilyChantParser.g:1075:1: ( Tone )
            // InternalLilyChantParser.g:1076:2: Tone
            {
             before(grammarAccess.getChantAccess().getToneKeyword_2()); 
            match(input,Tone,FOLLOW_2); 
             after(grammarAccess.getChantAccess().getToneKeyword_2()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1085:1: rule__Chant__Group__3 : rule__Chant__Group__3__Impl rule__Chant__Group__4 ;
    public final void rule__Chant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1089:1: ( rule__Chant__Group__3__Impl rule__Chant__Group__4 )
            // InternalLilyChantParser.g:1090:2: rule__Chant__Group__3__Impl rule__Chant__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Chant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chant__Group__4();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1097:1: rule__Chant__Group__3__Impl : ( ( rule__Chant__ToneAssignment_3 ) ) ;
    public final void rule__Chant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1101:1: ( ( ( rule__Chant__ToneAssignment_3 ) ) )
            // InternalLilyChantParser.g:1102:1: ( ( rule__Chant__ToneAssignment_3 ) )
            {
            // InternalLilyChantParser.g:1102:1: ( ( rule__Chant__ToneAssignment_3 ) )
            // InternalLilyChantParser.g:1103:2: ( rule__Chant__ToneAssignment_3 )
            {
             before(grammarAccess.getChantAccess().getToneAssignment_3()); 
            // InternalLilyChantParser.g:1104:2: ( rule__Chant__ToneAssignment_3 )
            // InternalLilyChantParser.g:1104:3: rule__Chant__ToneAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Chant__ToneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChantAccess().getToneAssignment_3()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1112:1: rule__Chant__Group__4 : rule__Chant__Group__4__Impl rule__Chant__Group__5 ;
    public final void rule__Chant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1116:1: ( rule__Chant__Group__4__Impl rule__Chant__Group__5 )
            // InternalLilyChantParser.g:1117:2: rule__Chant__Group__4__Impl rule__Chant__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Chant__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chant__Group__5();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1124:1: rule__Chant__Group__4__Impl : ( In ) ;
    public final void rule__Chant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1128:1: ( ( In ) )
            // InternalLilyChantParser.g:1129:1: ( In )
            {
            // InternalLilyChantParser.g:1129:1: ( In )
            // InternalLilyChantParser.g:1130:2: In
            {
             before(grammarAccess.getChantAccess().getInKeyword_4()); 
            match(input,In,FOLLOW_2); 
             after(grammarAccess.getChantAccess().getInKeyword_4()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1139:1: rule__Chant__Group__5 : rule__Chant__Group__5__Impl rule__Chant__Group__6 ;
    public final void rule__Chant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1143:1: ( rule__Chant__Group__5__Impl rule__Chant__Group__6 )
            // InternalLilyChantParser.g:1144:2: rule__Chant__Group__5__Impl rule__Chant__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Chant__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chant__Group__6();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1151:1: rule__Chant__Group__5__Impl : ( ( rule__Chant__KeyAssignment_5 ) ) ;
    public final void rule__Chant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1155:1: ( ( ( rule__Chant__KeyAssignment_5 ) ) )
            // InternalLilyChantParser.g:1156:1: ( ( rule__Chant__KeyAssignment_5 ) )
            {
            // InternalLilyChantParser.g:1156:1: ( ( rule__Chant__KeyAssignment_5 ) )
            // InternalLilyChantParser.g:1157:2: ( rule__Chant__KeyAssignment_5 )
            {
             before(grammarAccess.getChantAccess().getKeyAssignment_5()); 
            // InternalLilyChantParser.g:1158:2: ( rule__Chant__KeyAssignment_5 )
            // InternalLilyChantParser.g:1158:3: rule__Chant__KeyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Chant__KeyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChantAccess().getKeyAssignment_5()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1166:1: rule__Chant__Group__6 : rule__Chant__Group__6__Impl rule__Chant__Group__7 ;
    public final void rule__Chant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1170:1: ( rule__Chant__Group__6__Impl rule__Chant__Group__7 )
            // InternalLilyChantParser.g:1171:2: rule__Chant__Group__6__Impl rule__Chant__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Chant__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chant__Group__7();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1178:1: rule__Chant__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__Chant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1182:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:1183:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:1183:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:1184:2: RULE_BEGIN
            {
             before(grammarAccess.getChantAccess().getBEGINTerminalRuleCall_6()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getChantAccess().getBEGINTerminalRuleCall_6()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1193:1: rule__Chant__Group__7 : rule__Chant__Group__7__Impl rule__Chant__Group__8 ;
    public final void rule__Chant__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1197:1: ( rule__Chant__Group__7__Impl rule__Chant__Group__8 )
            // InternalLilyChantParser.g:1198:2: rule__Chant__Group__7__Impl rule__Chant__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Chant__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chant__Group__8();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1205:1: rule__Chant__Group__7__Impl : ( ( ( rule__Chant__PhrasesAssignment_7 ) ) ( ( rule__Chant__PhrasesAssignment_7 )* ) ) ;
    public final void rule__Chant__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1209:1: ( ( ( ( rule__Chant__PhrasesAssignment_7 ) ) ( ( rule__Chant__PhrasesAssignment_7 )* ) ) )
            // InternalLilyChantParser.g:1210:1: ( ( ( rule__Chant__PhrasesAssignment_7 ) ) ( ( rule__Chant__PhrasesAssignment_7 )* ) )
            {
            // InternalLilyChantParser.g:1210:1: ( ( ( rule__Chant__PhrasesAssignment_7 ) ) ( ( rule__Chant__PhrasesAssignment_7 )* ) )
            // InternalLilyChantParser.g:1211:2: ( ( rule__Chant__PhrasesAssignment_7 ) ) ( ( rule__Chant__PhrasesAssignment_7 )* )
            {
            // InternalLilyChantParser.g:1211:2: ( ( rule__Chant__PhrasesAssignment_7 ) )
            // InternalLilyChantParser.g:1212:3: ( rule__Chant__PhrasesAssignment_7 )
            {
             before(grammarAccess.getChantAccess().getPhrasesAssignment_7()); 
            // InternalLilyChantParser.g:1213:3: ( rule__Chant__PhrasesAssignment_7 )
            // InternalLilyChantParser.g:1213:4: rule__Chant__PhrasesAssignment_7
            {
            pushFollow(FOLLOW_13);
            rule__Chant__PhrasesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getChantAccess().getPhrasesAssignment_7()); 

            }

            // InternalLilyChantParser.g:1216:2: ( ( rule__Chant__PhrasesAssignment_7 )* )
            // InternalLilyChantParser.g:1217:3: ( rule__Chant__PhrasesAssignment_7 )*
            {
             before(grammarAccess.getChantAccess().getPhrasesAssignment_7()); 
            // InternalLilyChantParser.g:1218:3: ( rule__Chant__PhrasesAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Phrase) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLilyChantParser.g:1218:4: rule__Chant__PhrasesAssignment_7
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Chant__PhrasesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getChantAccess().getPhrasesAssignment_7()); 

            }


            }


            }

        }
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
    // InternalLilyChantParser.g:1227:1: rule__Chant__Group__8 : rule__Chant__Group__8__Impl ;
    public final void rule__Chant__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1231:1: ( rule__Chant__Group__8__Impl )
            // InternalLilyChantParser.g:1232:2: rule__Chant__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chant__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1238:1: rule__Chant__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Chant__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1242:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:1243:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:1243:1: ( RULE_END )
            // InternalLilyChantParser.g:1244:2: RULE_END
            {
             before(grammarAccess.getChantAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getChantAccess().getENDTerminalRuleCall_8()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1254:1: rule__LyricPhrase__Group__0 : rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1 ;
    public final void rule__LyricPhrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1258:1: ( rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1 )
            // InternalLilyChantParser.g:1259:2: rule__LyricPhrase__Group__0__Impl rule__LyricPhrase__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__LyricPhrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group__1();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1266:1: rule__LyricPhrase__Group__0__Impl : ( Phrase ) ;
    public final void rule__LyricPhrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1270:1: ( ( Phrase ) )
            // InternalLilyChantParser.g:1271:1: ( Phrase )
            {
            // InternalLilyChantParser.g:1271:1: ( Phrase )
            // InternalLilyChantParser.g:1272:2: Phrase
            {
             before(grammarAccess.getLyricPhraseAccess().getPhraseKeyword_0()); 
            match(input,Phrase,FOLLOW_2); 
             after(grammarAccess.getLyricPhraseAccess().getPhraseKeyword_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1281:1: rule__LyricPhrase__Group__1 : rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2 ;
    public final void rule__LyricPhrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1285:1: ( rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2 )
            // InternalLilyChantParser.g:1286:2: rule__LyricPhrase__Group__1__Impl rule__LyricPhrase__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__LyricPhrase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group__2();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1293:1: rule__LyricPhrase__Group__1__Impl : ( ( rule__LyricPhrase__NotesAssignment_1 ) ) ;
    public final void rule__LyricPhrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1297:1: ( ( ( rule__LyricPhrase__NotesAssignment_1 ) ) )
            // InternalLilyChantParser.g:1298:1: ( ( rule__LyricPhrase__NotesAssignment_1 ) )
            {
            // InternalLilyChantParser.g:1298:1: ( ( rule__LyricPhrase__NotesAssignment_1 ) )
            // InternalLilyChantParser.g:1299:2: ( rule__LyricPhrase__NotesAssignment_1 )
            {
             before(grammarAccess.getLyricPhraseAccess().getNotesAssignment_1()); 
            // InternalLilyChantParser.g:1300:2: ( rule__LyricPhrase__NotesAssignment_1 )
            // InternalLilyChantParser.g:1300:3: rule__LyricPhrase__NotesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__NotesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLyricPhraseAccess().getNotesAssignment_1()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1308:1: rule__LyricPhrase__Group__2 : rule__LyricPhrase__Group__2__Impl rule__LyricPhrase__Group__3 ;
    public final void rule__LyricPhrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1312:1: ( rule__LyricPhrase__Group__2__Impl rule__LyricPhrase__Group__3 )
            // InternalLilyChantParser.g:1313:2: rule__LyricPhrase__Group__2__Impl rule__LyricPhrase__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__LyricPhrase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group__3();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1320:1: rule__LyricPhrase__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__LyricPhrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1324:1: ( ( RULE_BEGIN ) )
            // InternalLilyChantParser.g:1325:1: ( RULE_BEGIN )
            {
            // InternalLilyChantParser.g:1325:1: ( RULE_BEGIN )
            // InternalLilyChantParser.g:1326:2: RULE_BEGIN
            {
             before(grammarAccess.getLyricPhraseAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getLyricPhraseAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1335:1: rule__LyricPhrase__Group__3 : rule__LyricPhrase__Group__3__Impl rule__LyricPhrase__Group__4 ;
    public final void rule__LyricPhrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1339:1: ( rule__LyricPhrase__Group__3__Impl rule__LyricPhrase__Group__4 )
            // InternalLilyChantParser.g:1340:2: rule__LyricPhrase__Group__3__Impl rule__LyricPhrase__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__LyricPhrase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group__4();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1347:1: rule__LyricPhrase__Group__3__Impl : ( ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* ) ) ;
    public final void rule__LyricPhrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1351:1: ( ( ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* ) ) )
            // InternalLilyChantParser.g:1352:1: ( ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* ) )
            {
            // InternalLilyChantParser.g:1352:1: ( ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* ) )
            // InternalLilyChantParser.g:1353:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) ) ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* )
            {
            // InternalLilyChantParser.g:1353:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_3 ) )
            // InternalLilyChantParser.g:1354:3: ( rule__LyricPhrase__NoteGroupsAssignment_3 )
            {
             before(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_3()); 
            // InternalLilyChantParser.g:1355:3: ( rule__LyricPhrase__NoteGroupsAssignment_3 )
            // InternalLilyChantParser.g:1355:4: rule__LyricPhrase__NoteGroupsAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__LyricPhrase__NoteGroupsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_3()); 

            }

            // InternalLilyChantParser.g:1358:2: ( ( rule__LyricPhrase__NoteGroupsAssignment_3 )* )
            // InternalLilyChantParser.g:1359:3: ( rule__LyricPhrase__NoteGroupsAssignment_3 )*
            {
             before(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_3()); 
            // InternalLilyChantParser.g:1360:3: ( rule__LyricPhrase__NoteGroupsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==RULE_START_NOTE_GROUP) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLilyChantParser.g:1360:4: rule__LyricPhrase__NoteGroupsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__LyricPhrase__NoteGroupsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_3()); 

            }


            }


            }

        }
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
    // InternalLilyChantParser.g:1369:1: rule__LyricPhrase__Group__4 : rule__LyricPhrase__Group__4__Impl ;
    public final void rule__LyricPhrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1373:1: ( rule__LyricPhrase__Group__4__Impl )
            // InternalLilyChantParser.g:1374:2: rule__LyricPhrase__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LyricPhrase__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1380:1: rule__LyricPhrase__Group__4__Impl : ( RULE_END ) ;
    public final void rule__LyricPhrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1384:1: ( ( RULE_END ) )
            // InternalLilyChantParser.g:1385:1: ( RULE_END )
            {
            // InternalLilyChantParser.g:1385:1: ( RULE_END )
            // InternalLilyChantParser.g:1386:2: RULE_END
            {
             before(grammarAccess.getLyricPhraseAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getLyricPhraseAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1396:1: rule__NoteGroup__Group_0__0 : rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1 ;
    public final void rule__NoteGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1400:1: ( rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1 )
            // InternalLilyChantParser.g:1401:2: rule__NoteGroup__Group_0__0__Impl rule__NoteGroup__Group_0__1
            {
            pushFollow(FOLLOW_19);
            rule__NoteGroup__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_0__1();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1408:1: rule__NoteGroup__Group_0__0__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_0 ) ) ;
    public final void rule__NoteGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1412:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_0 ) ) )
            // InternalLilyChantParser.g:1413:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0 ) )
            {
            // InternalLilyChantParser.g:1413:1: ( ( rule__NoteGroup__SyllablesAssignment_0_0 ) )
            // InternalLilyChantParser.g:1414:2: ( rule__NoteGroup__SyllablesAssignment_0_0 )
            {
             before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0()); 
            // InternalLilyChantParser.g:1415:2: ( rule__NoteGroup__SyllablesAssignment_0_0 )
            // InternalLilyChantParser.g:1415:3: rule__NoteGroup__SyllablesAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__SyllablesAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1423:1: rule__NoteGroup__Group_0__1 : rule__NoteGroup__Group_0__1__Impl ;
    public final void rule__NoteGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1427:1: ( rule__NoteGroup__Group_0__1__Impl )
            // InternalLilyChantParser.g:1428:2: rule__NoteGroup__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1434:1: rule__NoteGroup__Group_0__1__Impl : ( ( rule__NoteGroup__SyllablesAssignment_0_1 )? ) ;
    public final void rule__NoteGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1438:1: ( ( ( rule__NoteGroup__SyllablesAssignment_0_1 )? ) )
            // InternalLilyChantParser.g:1439:1: ( ( rule__NoteGroup__SyllablesAssignment_0_1 )? )
            {
            // InternalLilyChantParser.g:1439:1: ( ( rule__NoteGroup__SyllablesAssignment_0_1 )? )
            // InternalLilyChantParser.g:1440:2: ( rule__NoteGroup__SyllablesAssignment_0_1 )?
            {
             before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_1()); 
            // InternalLilyChantParser.g:1441:2: ( rule__NoteGroup__SyllablesAssignment_0_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_HYPHEN && LA13_0<=RULE_EXTENDER)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLilyChantParser.g:1441:3: rule__NoteGroup__SyllablesAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NoteGroup__SyllablesAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__NoteGroup__Group_1__0"
    // InternalLilyChantParser.g:1450:1: rule__NoteGroup__Group_1__0 : rule__NoteGroup__Group_1__0__Impl rule__NoteGroup__Group_1__1 ;
    public final void rule__NoteGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1454:1: ( rule__NoteGroup__Group_1__0__Impl rule__NoteGroup__Group_1__1 )
            // InternalLilyChantParser.g:1455:2: rule__NoteGroup__Group_1__0__Impl rule__NoteGroup__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__NoteGroup__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1462:1: rule__NoteGroup__Group_1__0__Impl : ( RULE_START_NOTE_GROUP ) ;
    public final void rule__NoteGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1466:1: ( ( RULE_START_NOTE_GROUP ) )
            // InternalLilyChantParser.g:1467:1: ( RULE_START_NOTE_GROUP )
            {
            // InternalLilyChantParser.g:1467:1: ( RULE_START_NOTE_GROUP )
            // InternalLilyChantParser.g:1468:2: RULE_START_NOTE_GROUP
            {
             before(grammarAccess.getNoteGroupAccess().getSTART_NOTE_GROUPTerminalRuleCall_1_0()); 
            match(input,RULE_START_NOTE_GROUP,FOLLOW_2); 
             after(grammarAccess.getNoteGroupAccess().getSTART_NOTE_GROUPTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1477:1: rule__NoteGroup__Group_1__1 : rule__NoteGroup__Group_1__1__Impl rule__NoteGroup__Group_1__2 ;
    public final void rule__NoteGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1481:1: ( rule__NoteGroup__Group_1__1__Impl rule__NoteGroup__Group_1__2 )
            // InternalLilyChantParser.g:1482:2: rule__NoteGroup__Group_1__1__Impl rule__NoteGroup__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__NoteGroup__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1489:1: rule__NoteGroup__Group_1__1__Impl : ( ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* ) ) ;
    public final void rule__NoteGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1493:1: ( ( ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* ) ) )
            // InternalLilyChantParser.g:1494:1: ( ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* ) )
            {
            // InternalLilyChantParser.g:1494:1: ( ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* ) )
            // InternalLilyChantParser.g:1495:2: ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) ) ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* )
            {
            // InternalLilyChantParser.g:1495:2: ( ( rule__NoteGroup__SyllablesAssignment_1_1 ) )
            // InternalLilyChantParser.g:1496:3: ( rule__NoteGroup__SyllablesAssignment_1_1 )
            {
             before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); 
            // InternalLilyChantParser.g:1497:3: ( rule__NoteGroup__SyllablesAssignment_1_1 )
            // InternalLilyChantParser.g:1497:4: rule__NoteGroup__SyllablesAssignment_1_1
            {
            pushFollow(FOLLOW_22);
            rule__NoteGroup__SyllablesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); 

            }

            // InternalLilyChantParser.g:1500:2: ( ( rule__NoteGroup__SyllablesAssignment_1_1 )* )
            // InternalLilyChantParser.g:1501:3: ( rule__NoteGroup__SyllablesAssignment_1_1 )*
            {
             before(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); 
            // InternalLilyChantParser.g:1502:3: ( rule__NoteGroup__SyllablesAssignment_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==RULE_HYPHEN) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLilyChantParser.g:1502:4: rule__NoteGroup__SyllablesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__NoteGroup__SyllablesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1_1()); 

            }


            }


            }

        }
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
    // InternalLilyChantParser.g:1511:1: rule__NoteGroup__Group_1__2 : rule__NoteGroup__Group_1__2__Impl ;
    public final void rule__NoteGroup__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1515:1: ( rule__NoteGroup__Group_1__2__Impl )
            // InternalLilyChantParser.g:1516:2: rule__NoteGroup__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1522:1: rule__NoteGroup__Group_1__2__Impl : ( RULE_END_NOTE_GROUP ) ;
    public final void rule__NoteGroup__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1526:1: ( ( RULE_END_NOTE_GROUP ) )
            // InternalLilyChantParser.g:1527:1: ( RULE_END_NOTE_GROUP )
            {
            // InternalLilyChantParser.g:1527:1: ( RULE_END_NOTE_GROUP )
            // InternalLilyChantParser.g:1528:2: RULE_END_NOTE_GROUP
            {
             before(grammarAccess.getNoteGroupAccess().getEND_NOTE_GROUPTerminalRuleCall_1_2()); 
            match(input,RULE_END_NOTE_GROUP,FOLLOW_2); 
             after(grammarAccess.getNoteGroupAccess().getEND_NOTE_GROUPTerminalRuleCall_1_2()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1538:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1542:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalLilyChantParser.g:1543:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__1();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1550:1: rule__Note__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1554:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1555:1: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1555:1: ( RULE_ID )
            // InternalLilyChantParser.g:1556:2: RULE_ID
            {
             before(grammarAccess.getNoteAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1565:1: rule__Note__Group__1 : rule__Note__Group__1__Impl ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1569:1: ( rule__Note__Group__1__Impl )
            // InternalLilyChantParser.g:1570:2: rule__Note__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalLilyChantParser.g:1576:1: rule__Note__Group__1__Impl : ( ( RULE_DURATION )? ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1580:1: ( ( ( RULE_DURATION )? ) )
            // InternalLilyChantParser.g:1581:1: ( ( RULE_DURATION )? )
            {
            // InternalLilyChantParser.g:1581:1: ( ( RULE_DURATION )? )
            // InternalLilyChantParser.g:1582:2: ( RULE_DURATION )?
            {
             before(grammarAccess.getNoteAccess().getDURATIONTerminalRuleCall_1()); 
            // InternalLilyChantParser.g:1583:2: ( RULE_DURATION )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DURATION) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLilyChantParser.g:1583:3: RULE_DURATION
                    {
                    match(input,RULE_DURATION,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getDURATIONTerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1592:1: rule__Script__TonesAssignment_0 : ( ruleTone ) ;
    public final void rule__Script__TonesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1596:1: ( ( ruleTone ) )
            // InternalLilyChantParser.g:1597:2: ( ruleTone )
            {
            // InternalLilyChantParser.g:1597:2: ( ruleTone )
            // InternalLilyChantParser.g:1598:3: ruleTone
            {
             before(grammarAccess.getScriptAccess().getTonesToneParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTone();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getTonesToneParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1607:1: rule__Script__ChantsAssignment_1 : ( ruleChant ) ;
    public final void rule__Script__ChantsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1611:1: ( ( ruleChant ) )
            // InternalLilyChantParser.g:1612:2: ( ruleChant )
            {
            // InternalLilyChantParser.g:1612:2: ( ruleChant )
            // InternalLilyChantParser.g:1613:3: ruleChant
            {
             before(grammarAccess.getScriptAccess().getChantsChantParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChant();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getChantsChantParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1622:1: rule__Tone__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tone__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1626:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1627:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1627:2: ( RULE_ID )
            // InternalLilyChantParser.g:1628:3: RULE_ID
            {
             before(grammarAccess.getToneAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getToneAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1637:1: rule__Tone__KeyAssignment_3 : ( RULE_ID ) ;
    public final void rule__Tone__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1641:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1642:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1642:2: ( RULE_ID )
            // InternalLilyChantParser.g:1643:3: RULE_ID
            {
             before(grammarAccess.getToneAccess().getKeyIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getToneAccess().getKeyIDTerminalRuleCall_3_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1652:1: rule__Tone__VoiceNamesAssignment_7 : ( ruleVoiceName ) ;
    public final void rule__Tone__VoiceNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1656:1: ( ( ruleVoiceName ) )
            // InternalLilyChantParser.g:1657:2: ( ruleVoiceName )
            {
            // InternalLilyChantParser.g:1657:2: ( ruleVoiceName )
            // InternalLilyChantParser.g:1658:3: ruleVoiceName
            {
             before(grammarAccess.getToneAccess().getVoiceNamesVoiceNameParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleVoiceName();

            state._fsp--;

             after(grammarAccess.getToneAccess().getVoiceNamesVoiceNameParserRuleCall_7_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1667:1: rule__Tone__PhrasesAssignment_9 : ( ruleTonePhrase ) ;
    public final void rule__Tone__PhrasesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1671:1: ( ( ruleTonePhrase ) )
            // InternalLilyChantParser.g:1672:2: ( ruleTonePhrase )
            {
            // InternalLilyChantParser.g:1672:2: ( ruleTonePhrase )
            // InternalLilyChantParser.g:1673:3: ruleTonePhrase
            {
             before(grammarAccess.getToneAccess().getPhrasesTonePhraseParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleTonePhrase();

            state._fsp--;

             after(grammarAccess.getToneAccess().getPhrasesTonePhraseParserRuleCall_9_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1682:1: rule__VoiceName__NameAssignment : ( RULE_ID ) ;
    public final void rule__VoiceName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1686:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1687:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1687:2: ( RULE_ID )
            // InternalLilyChantParser.g:1688:3: RULE_ID
            {
             before(grammarAccess.getVoiceNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVoiceNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1697:1: rule__TonePhrase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TonePhrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1701:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1702:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1702:2: ( RULE_ID )
            // InternalLilyChantParser.g:1703:3: RULE_ID
            {
             before(grammarAccess.getTonePhraseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTonePhraseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1712:1: rule__TonePhrase__VoicesAssignment_3 : ( ruleVoicePhrase ) ;
    public final void rule__TonePhrase__VoicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1716:1: ( ( ruleVoicePhrase ) )
            // InternalLilyChantParser.g:1717:2: ( ruleVoicePhrase )
            {
            // InternalLilyChantParser.g:1717:2: ( ruleVoicePhrase )
            // InternalLilyChantParser.g:1718:3: ruleVoicePhrase
            {
             before(grammarAccess.getTonePhraseAccess().getVoicesVoicePhraseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVoicePhrase();

            state._fsp--;

             after(grammarAccess.getTonePhraseAccess().getVoicesVoicePhraseParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1727:1: rule__VoicePhrase__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VoicePhrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1731:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:1732:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:1732:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1733:3: ( RULE_ID )
            {
             before(grammarAccess.getVoicePhraseAccess().getNameVoiceNameCrossReference_1_0()); 
            // InternalLilyChantParser.g:1734:3: ( RULE_ID )
            // InternalLilyChantParser.g:1735:4: RULE_ID
            {
             before(grammarAccess.getVoicePhraseAccess().getNameVoiceNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVoicePhraseAccess().getNameVoiceNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVoicePhraseAccess().getNameVoiceNameCrossReference_1_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1746:1: rule__VoicePhrase__NotesAssignment_3 : ( ruleNote ) ;
    public final void rule__VoicePhrase__NotesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1750:1: ( ( ruleNote ) )
            // InternalLilyChantParser.g:1751:2: ( ruleNote )
            {
            // InternalLilyChantParser.g:1751:2: ( ruleNote )
            // InternalLilyChantParser.g:1752:3: ruleNote
            {
             before(grammarAccess.getVoicePhraseAccess().getNotesNoteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getVoicePhraseAccess().getNotesNoteParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1761:1: rule__Chant__ToneAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Chant__ToneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1765:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:1766:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:1766:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1767:3: ( RULE_ID )
            {
             before(grammarAccess.getChantAccess().getToneToneCrossReference_3_0()); 
            // InternalLilyChantParser.g:1768:3: ( RULE_ID )
            // InternalLilyChantParser.g:1769:4: RULE_ID
            {
             before(grammarAccess.getChantAccess().getToneToneIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChantAccess().getToneToneIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getChantAccess().getToneToneCrossReference_3_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1780:1: rule__Chant__KeyAssignment_5 : ( RULE_ID ) ;
    public final void rule__Chant__KeyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1784:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1785:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1785:2: ( RULE_ID )
            // InternalLilyChantParser.g:1786:3: RULE_ID
            {
             before(grammarAccess.getChantAccess().getKeyIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChantAccess().getKeyIDTerminalRuleCall_5_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1795:1: rule__Chant__PhrasesAssignment_7 : ( ruleLyricPhrase ) ;
    public final void rule__Chant__PhrasesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1799:1: ( ( ruleLyricPhrase ) )
            // InternalLilyChantParser.g:1800:2: ( ruleLyricPhrase )
            {
            // InternalLilyChantParser.g:1800:2: ( ruleLyricPhrase )
            // InternalLilyChantParser.g:1801:3: ruleLyricPhrase
            {
             before(grammarAccess.getChantAccess().getPhrasesLyricPhraseParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleLyricPhrase();

            state._fsp--;

             after(grammarAccess.getChantAccess().getPhrasesLyricPhraseParserRuleCall_7_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1810:1: rule__LyricPhrase__NotesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LyricPhrase__NotesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1814:1: ( ( ( RULE_ID ) ) )
            // InternalLilyChantParser.g:1815:2: ( ( RULE_ID ) )
            {
            // InternalLilyChantParser.g:1815:2: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1816:3: ( RULE_ID )
            {
             before(grammarAccess.getLyricPhraseAccess().getNotesTonePhraseCrossReference_1_0()); 
            // InternalLilyChantParser.g:1817:3: ( RULE_ID )
            // InternalLilyChantParser.g:1818:4: RULE_ID
            {
             before(grammarAccess.getLyricPhraseAccess().getNotesTonePhraseIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLyricPhraseAccess().getNotesTonePhraseIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLyricPhraseAccess().getNotesTonePhraseCrossReference_1_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1829:1: rule__LyricPhrase__NoteGroupsAssignment_3 : ( ruleNoteGroup ) ;
    public final void rule__LyricPhrase__NoteGroupsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1833:1: ( ( ruleNoteGroup ) )
            // InternalLilyChantParser.g:1834:2: ( ruleNoteGroup )
            {
            // InternalLilyChantParser.g:1834:2: ( ruleNoteGroup )
            // InternalLilyChantParser.g:1835:3: ruleNoteGroup
            {
             before(grammarAccess.getLyricPhraseAccess().getNoteGroupsNoteGroupParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNoteGroup();

            state._fsp--;

             after(grammarAccess.getLyricPhraseAccess().getNoteGroupsNoteGroupParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__NoteGroup__SyllablesAssignment_0_0"
    // InternalLilyChantParser.g:1844:1: rule__NoteGroup__SyllablesAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1848:1: ( ( RULE_ID ) )
            // InternalLilyChantParser.g:1849:2: ( RULE_ID )
            {
            // InternalLilyChantParser.g:1849:2: ( RULE_ID )
            // InternalLilyChantParser.g:1850:3: RULE_ID
            {
             before(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNoteGroupAccess().getSyllablesIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteGroup__SyllablesAssignment_0_0"


    // $ANTLR start "rule__NoteGroup__SyllablesAssignment_0_1"
    // InternalLilyChantParser.g:1859:1: rule__NoteGroup__SyllablesAssignment_0_1 : ( ( rule__NoteGroup__SyllablesAlternatives_0_1_0 ) ) ;
    public final void rule__NoteGroup__SyllablesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1863:1: ( ( ( rule__NoteGroup__SyllablesAlternatives_0_1_0 ) ) )
            // InternalLilyChantParser.g:1864:2: ( ( rule__NoteGroup__SyllablesAlternatives_0_1_0 ) )
            {
            // InternalLilyChantParser.g:1864:2: ( ( rule__NoteGroup__SyllablesAlternatives_0_1_0 ) )
            // InternalLilyChantParser.g:1865:3: ( rule__NoteGroup__SyllablesAlternatives_0_1_0 )
            {
             before(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_0_1_0()); 
            // InternalLilyChantParser.g:1866:3: ( rule__NoteGroup__SyllablesAlternatives_0_1_0 )
            // InternalLilyChantParser.g:1866:4: rule__NoteGroup__SyllablesAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__SyllablesAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_0_1_0()); 

            }


            }

        }
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
    // InternalLilyChantParser.g:1874:1: rule__NoteGroup__SyllablesAssignment_1_1 : ( ( rule__NoteGroup__SyllablesAlternatives_1_1_0 ) ) ;
    public final void rule__NoteGroup__SyllablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLilyChantParser.g:1878:1: ( ( ( rule__NoteGroup__SyllablesAlternatives_1_1_0 ) ) )
            // InternalLilyChantParser.g:1879:2: ( ( rule__NoteGroup__SyllablesAlternatives_1_1_0 ) )
            {
            // InternalLilyChantParser.g:1879:2: ( ( rule__NoteGroup__SyllablesAlternatives_1_1_0 ) )
            // InternalLilyChantParser.g:1880:3: ( rule__NoteGroup__SyllablesAlternatives_1_1_0 )
            {
             before(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_1_1_0()); 
            // InternalLilyChantParser.g:1881:3: ( rule__NoteGroup__SyllablesAlternatives_1_1_0 )
            // InternalLilyChantParser.g:1881:4: rule__NoteGroup__SyllablesAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NoteGroup__SyllablesAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_1_1_0()); 

            }


            }

        }
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

    // Delegated rules


 

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
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004402L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000800L});

}