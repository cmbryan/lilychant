package org.lilychant.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.lilychant.services.LilyChantGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLilyChantParser extends AbstractInternalAntlrParser {
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

        public InternalLilyChantParser(TokenStream input, LilyChantGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Script";
       	}

       	@Override
       	protected LilyChantGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleScript"
    // InternalLilyChantParser.g:58:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalLilyChantParser.g:58:47: (iv_ruleScript= ruleScript EOF )
            // InternalLilyChantParser.g:59:2: iv_ruleScript= ruleScript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScriptRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScript=ruleScript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScript; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalLilyChantParser.g:65:1: ruleScript returns [EObject current=null] : ( ( (lv_tones_0_0= ruleTone ) )* ( (lv_chants_1_0= ruleChant ) )* ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_tones_0_0 = null;

        EObject lv_chants_1_0 = null;



        	enterRule();

        try {
            // InternalLilyChantParser.g:71:2: ( ( ( (lv_tones_0_0= ruleTone ) )* ( (lv_chants_1_0= ruleChant ) )* ) )
            // InternalLilyChantParser.g:72:2: ( ( (lv_tones_0_0= ruleTone ) )* ( (lv_chants_1_0= ruleChant ) )* )
            {
            // InternalLilyChantParser.g:72:2: ( ( (lv_tones_0_0= ruleTone ) )* ( (lv_chants_1_0= ruleChant ) )* )
            // InternalLilyChantParser.g:73:3: ( (lv_tones_0_0= ruleTone ) )* ( (lv_chants_1_0= ruleChant ) )*
            {
            // InternalLilyChantParser.g:73:3: ( (lv_tones_0_0= ruleTone ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Tone) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLilyChantParser.g:74:4: (lv_tones_0_0= ruleTone )
            	    {
            	    // InternalLilyChantParser.g:74:4: (lv_tones_0_0= ruleTone )
            	    // InternalLilyChantParser.g:75:5: lv_tones_0_0= ruleTone
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getScriptAccess().getTonesToneParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_tones_0_0=ruleTone();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getScriptRule());
            	      					}
            	      					add(
            	      						current,
            	      						"tones",
            	      						lv_tones_0_0,
            	      						"org.lilychant.LilyChant.Tone");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalLilyChantParser.g:92:3: ( (lv_chants_1_0= ruleChant ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Chant) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLilyChantParser.g:93:4: (lv_chants_1_0= ruleChant )
            	    {
            	    // InternalLilyChantParser.g:93:4: (lv_chants_1_0= ruleChant )
            	    // InternalLilyChantParser.g:94:5: lv_chants_1_0= ruleChant
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getScriptAccess().getChantsChantParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_chants_1_0=ruleChant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getScriptRule());
            	      					}
            	      					add(
            	      						current,
            	      						"chants",
            	      						lv_chants_1_0,
            	      						"org.lilychant.LilyChant.Chant");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleTone"
    // InternalLilyChantParser.g:115:1: entryRuleTone returns [EObject current=null] : iv_ruleTone= ruleTone EOF ;
    public final EObject entryRuleTone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTone = null;


        try {
            // InternalLilyChantParser.g:115:45: (iv_ruleTone= ruleTone EOF )
            // InternalLilyChantParser.g:116:2: iv_ruleTone= ruleTone EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getToneRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTone=ruleTone();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTone; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTone"


    // $ANTLR start "ruleTone"
    // InternalLilyChantParser.g:122:1: ruleTone returns [EObject current=null] : (otherlv_0= Tone ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Voices this_BEGIN_4= RULE_BEGIN ( (lv_voiceNames_5_0= ruleVoiceName ) )+ this_END_6= RULE_END ( (lv_phrases_7_0= ruleTonePhrase ) )+ this_END_8= RULE_END ) ;
    public final EObject ruleTone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        Token this_END_8=null;
        EObject lv_voiceNames_5_0 = null;

        EObject lv_phrases_7_0 = null;



        	enterRule();

        try {
            // InternalLilyChantParser.g:128:2: ( (otherlv_0= Tone ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Voices this_BEGIN_4= RULE_BEGIN ( (lv_voiceNames_5_0= ruleVoiceName ) )+ this_END_6= RULE_END ( (lv_phrases_7_0= ruleTonePhrase ) )+ this_END_8= RULE_END ) )
            // InternalLilyChantParser.g:129:2: (otherlv_0= Tone ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Voices this_BEGIN_4= RULE_BEGIN ( (lv_voiceNames_5_0= ruleVoiceName ) )+ this_END_6= RULE_END ( (lv_phrases_7_0= ruleTonePhrase ) )+ this_END_8= RULE_END )
            {
            // InternalLilyChantParser.g:129:2: (otherlv_0= Tone ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Voices this_BEGIN_4= RULE_BEGIN ( (lv_voiceNames_5_0= ruleVoiceName ) )+ this_END_6= RULE_END ( (lv_phrases_7_0= ruleTonePhrase ) )+ this_END_8= RULE_END )
            // InternalLilyChantParser.g:130:3: otherlv_0= Tone ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Voices this_BEGIN_4= RULE_BEGIN ( (lv_voiceNames_5_0= ruleVoiceName ) )+ this_END_6= RULE_END ( (lv_phrases_7_0= ruleTonePhrase ) )+ this_END_8= RULE_END
            {
            otherlv_0=(Token)match(input,Tone,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getToneAccess().getToneKeyword_0());
              		
            }
            // InternalLilyChantParser.g:134:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLilyChantParser.g:135:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLilyChantParser.g:135:4: (lv_name_1_0= RULE_ID )
            // InternalLilyChantParser.g:136:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getToneAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getToneRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.lilychant.LilyChant.ID");
              				
            }

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_2, grammarAccess.getToneAccess().getBEGINTerminalRuleCall_2());
              		
            }
            otherlv_3=(Token)match(input,Voices,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getToneAccess().getVoicesKeyword_3());
              		
            }
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_4, grammarAccess.getToneAccess().getBEGINTerminalRuleCall_4());
              		
            }
            // InternalLilyChantParser.g:164:3: ( (lv_voiceNames_5_0= ruleVoiceName ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLilyChantParser.g:165:4: (lv_voiceNames_5_0= ruleVoiceName )
            	    {
            	    // InternalLilyChantParser.g:165:4: (lv_voiceNames_5_0= ruleVoiceName )
            	    // InternalLilyChantParser.g:166:5: lv_voiceNames_5_0= ruleVoiceName
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getToneAccess().getVoiceNamesVoiceNameParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_voiceNames_5_0=ruleVoiceName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getToneRule());
            	      					}
            	      					add(
            	      						current,
            	      						"voiceNames",
            	      						lv_voiceNames_5_0,
            	      						"org.lilychant.LilyChant.VoiceName");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_6, grammarAccess.getToneAccess().getENDTerminalRuleCall_6());
              		
            }
            // InternalLilyChantParser.g:187:3: ( (lv_phrases_7_0= ruleTonePhrase ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Phrase) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLilyChantParser.g:188:4: (lv_phrases_7_0= ruleTonePhrase )
            	    {
            	    // InternalLilyChantParser.g:188:4: (lv_phrases_7_0= ruleTonePhrase )
            	    // InternalLilyChantParser.g:189:5: lv_phrases_7_0= ruleTonePhrase
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getToneAccess().getPhrasesTonePhraseParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_phrases_7_0=ruleTonePhrase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getToneRule());
            	      					}
            	      					add(
            	      						current,
            	      						"phrases",
            	      						lv_phrases_7_0,
            	      						"org.lilychant.LilyChant.TonePhrase");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_8, grammarAccess.getToneAccess().getENDTerminalRuleCall_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTone"


    // $ANTLR start "entryRuleVoiceName"
    // InternalLilyChantParser.g:214:1: entryRuleVoiceName returns [EObject current=null] : iv_ruleVoiceName= ruleVoiceName EOF ;
    public final EObject entryRuleVoiceName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoiceName = null;


        try {
            // InternalLilyChantParser.g:214:50: (iv_ruleVoiceName= ruleVoiceName EOF )
            // InternalLilyChantParser.g:215:2: iv_ruleVoiceName= ruleVoiceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVoiceNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVoiceName=ruleVoiceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVoiceName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVoiceName"


    // $ANTLR start "ruleVoiceName"
    // InternalLilyChantParser.g:221:1: ruleVoiceName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVoiceName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:227:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalLilyChantParser.g:228:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalLilyChantParser.g:228:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalLilyChantParser.g:229:3: (lv_name_0_0= RULE_ID )
            {
            // InternalLilyChantParser.g:229:3: (lv_name_0_0= RULE_ID )
            // InternalLilyChantParser.g:230:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getVoiceNameAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVoiceNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.lilychant.LilyChant.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVoiceName"


    // $ANTLR start "entryRuleTonePhrase"
    // InternalLilyChantParser.g:249:1: entryRuleTonePhrase returns [EObject current=null] : iv_ruleTonePhrase= ruleTonePhrase EOF ;
    public final EObject entryRuleTonePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTonePhrase = null;


        try {
            // InternalLilyChantParser.g:249:51: (iv_ruleTonePhrase= ruleTonePhrase EOF )
            // InternalLilyChantParser.g:250:2: iv_ruleTonePhrase= ruleTonePhrase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTonePhraseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTonePhrase=ruleTonePhrase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTonePhrase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTonePhrase"


    // $ANTLR start "ruleTonePhrase"
    // InternalLilyChantParser.g:256:1: ruleTonePhrase returns [EObject current=null] : (otherlv_0= Phrase ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_voices_3_0= ruleVoicePhrase ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleTonePhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_voices_3_0 = null;



        	enterRule();

        try {
            // InternalLilyChantParser.g:262:2: ( (otherlv_0= Phrase ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_voices_3_0= ruleVoicePhrase ) )+ this_END_4= RULE_END ) )
            // InternalLilyChantParser.g:263:2: (otherlv_0= Phrase ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_voices_3_0= ruleVoicePhrase ) )+ this_END_4= RULE_END )
            {
            // InternalLilyChantParser.g:263:2: (otherlv_0= Phrase ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_voices_3_0= ruleVoicePhrase ) )+ this_END_4= RULE_END )
            // InternalLilyChantParser.g:264:3: otherlv_0= Phrase ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_voices_3_0= ruleVoicePhrase ) )+ this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Phrase,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTonePhraseAccess().getPhraseKeyword_0());
              		
            }
            // InternalLilyChantParser.g:268:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLilyChantParser.g:269:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLilyChantParser.g:269:4: (lv_name_1_0= RULE_ID )
            // InternalLilyChantParser.g:270:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTonePhraseAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTonePhraseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.lilychant.LilyChant.ID");
              				
            }

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_2, grammarAccess.getTonePhraseAccess().getBEGINTerminalRuleCall_2());
              		
            }
            // InternalLilyChantParser.g:290:3: ( (lv_voices_3_0= ruleVoicePhrase ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Voice) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLilyChantParser.g:291:4: (lv_voices_3_0= ruleVoicePhrase )
            	    {
            	    // InternalLilyChantParser.g:291:4: (lv_voices_3_0= ruleVoicePhrase )
            	    // InternalLilyChantParser.g:292:5: lv_voices_3_0= ruleVoicePhrase
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTonePhraseAccess().getVoicesVoicePhraseParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_voices_3_0=ruleVoicePhrase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTonePhraseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"voices",
            	      						lv_voices_3_0,
            	      						"org.lilychant.LilyChant.VoicePhrase");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_4, grammarAccess.getTonePhraseAccess().getENDTerminalRuleCall_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTonePhrase"


    // $ANTLR start "entryRuleVoicePhrase"
    // InternalLilyChantParser.g:317:1: entryRuleVoicePhrase returns [EObject current=null] : iv_ruleVoicePhrase= ruleVoicePhrase EOF ;
    public final EObject entryRuleVoicePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoicePhrase = null;


        try {
            // InternalLilyChantParser.g:317:52: (iv_ruleVoicePhrase= ruleVoicePhrase EOF )
            // InternalLilyChantParser.g:318:2: iv_ruleVoicePhrase= ruleVoicePhrase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVoicePhraseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVoicePhrase=ruleVoicePhrase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVoicePhrase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVoicePhrase"


    // $ANTLR start "ruleVoicePhrase"
    // InternalLilyChantParser.g:324:1: ruleVoicePhrase returns [EObject current=null] : (otherlv_0= Voice ( (otherlv_1= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_notes_3_0= ruleNote ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleVoicePhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_notes_3_0 = null;



        	enterRule();

        try {
            // InternalLilyChantParser.g:330:2: ( (otherlv_0= Voice ( (otherlv_1= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_notes_3_0= ruleNote ) )+ this_END_4= RULE_END ) )
            // InternalLilyChantParser.g:331:2: (otherlv_0= Voice ( (otherlv_1= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_notes_3_0= ruleNote ) )+ this_END_4= RULE_END )
            {
            // InternalLilyChantParser.g:331:2: (otherlv_0= Voice ( (otherlv_1= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_notes_3_0= ruleNote ) )+ this_END_4= RULE_END )
            // InternalLilyChantParser.g:332:3: otherlv_0= Voice ( (otherlv_1= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_notes_3_0= ruleNote ) )+ this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Voice,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVoicePhraseAccess().getVoiceKeyword_0());
              		
            }
            // InternalLilyChantParser.g:336:3: ( (otherlv_1= RULE_ID ) )
            // InternalLilyChantParser.g:337:4: (otherlv_1= RULE_ID )
            {
            // InternalLilyChantParser.g:337:4: (otherlv_1= RULE_ID )
            // InternalLilyChantParser.g:338:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVoicePhraseRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getVoicePhraseAccess().getNameVoiceNameCrossReference_1_0());
              				
            }

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_2, grammarAccess.getVoicePhraseAccess().getBEGINTerminalRuleCall_2());
              		
            }
            // InternalLilyChantParser.g:353:3: ( (lv_notes_3_0= ruleNote ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLilyChantParser.g:354:4: (lv_notes_3_0= ruleNote )
            	    {
            	    // InternalLilyChantParser.g:354:4: (lv_notes_3_0= ruleNote )
            	    // InternalLilyChantParser.g:355:5: lv_notes_3_0= ruleNote
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVoicePhraseAccess().getNotesNoteParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_notes_3_0=ruleNote();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVoicePhraseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"notes",
            	      						lv_notes_3_0,
            	      						"org.lilychant.LilyChant.Note");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_4, grammarAccess.getVoicePhraseAccess().getENDTerminalRuleCall_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVoicePhrase"


    // $ANTLR start "entryRuleChant"
    // InternalLilyChantParser.g:380:1: entryRuleChant returns [EObject current=null] : iv_ruleChant= ruleChant EOF ;
    public final EObject entryRuleChant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChant = null;


        try {
            // InternalLilyChantParser.g:380:46: (iv_ruleChant= ruleChant EOF )
            // InternalLilyChantParser.g:381:2: iv_ruleChant= ruleChant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChant=ruleChant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChant"


    // $ANTLR start "ruleChant"
    // InternalLilyChantParser.g:387:1: ruleChant returns [EObject current=null] : (otherlv_0= Chant ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= Tone ( (otherlv_3= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_phrases_5_0= ruleLyricPhrase ) )+ this_END_6= RULE_END ) ;
    public final EObject ruleChant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        EObject lv_phrases_5_0 = null;



        	enterRule();

        try {
            // InternalLilyChantParser.g:393:2: ( (otherlv_0= Chant ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= Tone ( (otherlv_3= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_phrases_5_0= ruleLyricPhrase ) )+ this_END_6= RULE_END ) )
            // InternalLilyChantParser.g:394:2: (otherlv_0= Chant ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= Tone ( (otherlv_3= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_phrases_5_0= ruleLyricPhrase ) )+ this_END_6= RULE_END )
            {
            // InternalLilyChantParser.g:394:2: (otherlv_0= Chant ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= Tone ( (otherlv_3= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_phrases_5_0= ruleLyricPhrase ) )+ this_END_6= RULE_END )
            // InternalLilyChantParser.g:395:3: otherlv_0= Chant ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= Tone ( (otherlv_3= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_phrases_5_0= ruleLyricPhrase ) )+ this_END_6= RULE_END
            {
            otherlv_0=(Token)match(input,Chant,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getChantAccess().getChantKeyword_0());
              		
            }
            // InternalLilyChantParser.g:399:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLilyChantParser.g:400:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalLilyChantParser.g:400:4: (lv_name_1_0= RULE_STRING )
                    // InternalLilyChantParser.g:401:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getChantAccess().getNameSTRINGTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getChantRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.lilychant.LilyChant.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,Tone,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getChantAccess().getToneKeyword_2());
              		
            }
            // InternalLilyChantParser.g:421:3: ( (otherlv_3= RULE_ID ) )
            // InternalLilyChantParser.g:422:4: (otherlv_3= RULE_ID )
            {
            // InternalLilyChantParser.g:422:4: (otherlv_3= RULE_ID )
            // InternalLilyChantParser.g:423:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getChantRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getChantAccess().getToneToneCrossReference_3_0());
              				
            }

            }


            }

            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_4, grammarAccess.getChantAccess().getBEGINTerminalRuleCall_4());
              		
            }
            // InternalLilyChantParser.g:438:3: ( (lv_phrases_5_0= ruleLyricPhrase ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==HyphenMinusHyphenMinus||LA8_0==LeftParenthesis||LA8_0==Asterisk||LA8_0==KW__||LA8_0==RULE_ID||LA8_0==RULE_START_NOTE_GROUP) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLilyChantParser.g:439:4: (lv_phrases_5_0= ruleLyricPhrase )
            	    {
            	    // InternalLilyChantParser.g:439:4: (lv_phrases_5_0= ruleLyricPhrase )
            	    // InternalLilyChantParser.g:440:5: lv_phrases_5_0= ruleLyricPhrase
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getChantAccess().getPhrasesLyricPhraseParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_phrases_5_0=ruleLyricPhrase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getChantRule());
            	      					}
            	      					add(
            	      						current,
            	      						"phrases",
            	      						lv_phrases_5_0,
            	      						"org.lilychant.LilyChant.LyricPhrase");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_6, grammarAccess.getChantAccess().getENDTerminalRuleCall_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChant"


    // $ANTLR start "entryRuleLyricPhrase"
    // InternalLilyChantParser.g:465:1: entryRuleLyricPhrase returns [EObject current=null] : iv_ruleLyricPhrase= ruleLyricPhrase EOF ;
    public final EObject entryRuleLyricPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLyricPhrase = null;


        try {
            // InternalLilyChantParser.g:465:52: (iv_ruleLyricPhrase= ruleLyricPhrase EOF )
            // InternalLilyChantParser.g:466:2: iv_ruleLyricPhrase= ruleLyricPhrase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLyricPhraseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLyricPhrase=ruleLyricPhrase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLyricPhrase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLyricPhrase"


    // $ANTLR start "ruleLyricPhrase"
    // InternalLilyChantParser.g:472:1: ruleLyricPhrase returns [EObject current=null] : ( (otherlv_0= LeftParenthesis ( (otherlv_1= RULE_ID ) ) otherlv_2= RightParenthesis )? ( (lv_noteGroups_3_0= ruleNoteGroup ) )+ ( (lv_bar_4_0= ruleBarline ) ) ) ;
    public final EObject ruleLyricPhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_noteGroups_3_0 = null;

        Enumerator lv_bar_4_0 = null;



        	enterRule();

        try {
            // InternalLilyChantParser.g:478:2: ( ( (otherlv_0= LeftParenthesis ( (otherlv_1= RULE_ID ) ) otherlv_2= RightParenthesis )? ( (lv_noteGroups_3_0= ruleNoteGroup ) )+ ( (lv_bar_4_0= ruleBarline ) ) ) )
            // InternalLilyChantParser.g:479:2: ( (otherlv_0= LeftParenthesis ( (otherlv_1= RULE_ID ) ) otherlv_2= RightParenthesis )? ( (lv_noteGroups_3_0= ruleNoteGroup ) )+ ( (lv_bar_4_0= ruleBarline ) ) )
            {
            // InternalLilyChantParser.g:479:2: ( (otherlv_0= LeftParenthesis ( (otherlv_1= RULE_ID ) ) otherlv_2= RightParenthesis )? ( (lv_noteGroups_3_0= ruleNoteGroup ) )+ ( (lv_bar_4_0= ruleBarline ) ) )
            // InternalLilyChantParser.g:480:3: (otherlv_0= LeftParenthesis ( (otherlv_1= RULE_ID ) ) otherlv_2= RightParenthesis )? ( (lv_noteGroups_3_0= ruleNoteGroup ) )+ ( (lv_bar_4_0= ruleBarline ) )
            {
            // InternalLilyChantParser.g:480:3: (otherlv_0= LeftParenthesis ( (otherlv_1= RULE_ID ) ) otherlv_2= RightParenthesis )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LeftParenthesis) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLilyChantParser.g:481:4: otherlv_0= LeftParenthesis ( (otherlv_1= RULE_ID ) ) otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getLyricPhraseAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    // InternalLilyChantParser.g:485:4: ( (otherlv_1= RULE_ID ) )
                    // InternalLilyChantParser.g:486:5: (otherlv_1= RULE_ID )
                    {
                    // InternalLilyChantParser.g:486:5: (otherlv_1= RULE_ID )
                    // InternalLilyChantParser.g:487:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLyricPhraseRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getLyricPhraseAccess().getExplicitPhraseTonePhraseCrossReference_0_1_0());
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLyricPhraseAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            // InternalLilyChantParser.g:503:3: ( (lv_noteGroups_3_0= ruleNoteGroup ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==HyphenMinusHyphenMinus||LA10_0==Asterisk||LA10_0==KW__||LA10_0==RULE_ID||LA10_0==RULE_START_NOTE_GROUP) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLilyChantParser.g:504:4: (lv_noteGroups_3_0= ruleNoteGroup )
            	    {
            	    // InternalLilyChantParser.g:504:4: (lv_noteGroups_3_0= ruleNoteGroup )
            	    // InternalLilyChantParser.g:505:5: lv_noteGroups_3_0= ruleNoteGroup
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getLyricPhraseAccess().getNoteGroupsNoteGroupParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_noteGroups_3_0=ruleNoteGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getLyricPhraseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"noteGroups",
            	      						lv_noteGroups_3_0,
            	      						"org.lilychant.LilyChant.NoteGroup");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // InternalLilyChantParser.g:522:3: ( (lv_bar_4_0= ruleBarline ) )
            // InternalLilyChantParser.g:523:4: (lv_bar_4_0= ruleBarline )
            {
            // InternalLilyChantParser.g:523:4: (lv_bar_4_0= ruleBarline )
            // InternalLilyChantParser.g:524:5: lv_bar_4_0= ruleBarline
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLyricPhraseAccess().getBarBarlineEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_bar_4_0=ruleBarline();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLyricPhraseRule());
              					}
              					set(
              						current,
              						"bar",
              						lv_bar_4_0,
              						"org.lilychant.LilyChant.Barline");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLyricPhrase"


    // $ANTLR start "entryRuleNoteGroup"
    // InternalLilyChantParser.g:545:1: entryRuleNoteGroup returns [EObject current=null] : iv_ruleNoteGroup= ruleNoteGroup EOF ;
    public final EObject entryRuleNoteGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoteGroup = null;


        try {
            // InternalLilyChantParser.g:545:50: (iv_ruleNoteGroup= ruleNoteGroup EOF )
            // InternalLilyChantParser.g:546:2: iv_ruleNoteGroup= ruleNoteGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNoteGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNoteGroup=ruleNoteGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNoteGroup; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoteGroup"


    // $ANTLR start "ruleNoteGroup"
    // InternalLilyChantParser.g:552:1: ruleNoteGroup returns [EObject current=null] : ( ( ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) ) ( (lv_syllables_4_0= ruleExtenderRule ) )* ) | ( (lv_syllables_5_0= ruleSkipRule ) ) | (this_START_NOTE_GROUP_6= RULE_START_NOTE_GROUP ( (lv_noemphasis_7_0= Solidus ) )? ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+ this_END_NOTE_GROUP_9= RULE_END_NOTE_GROUP ) ) ;
    public final EObject ruleNoteGroup() throws RecognitionException {
        EObject current = null;

        Token this_START_NOTE_GROUP_6=null;
        Token lv_noemphasis_7_0=null;
        Token this_END_NOTE_GROUP_9=null;
        EObject lv_syllables_0_0 = null;

        EObject lv_syllables_1_0 = null;

        EObject lv_syllables_2_0 = null;

        EObject lv_syllables_3_0 = null;

        EObject lv_syllables_4_0 = null;

        EObject lv_syllables_5_0 = null;

        EObject lv_syllables_8_1 = null;

        EObject lv_syllables_8_2 = null;

        EObject lv_syllables_8_3 = null;



        	enterRule();

        try {
            // InternalLilyChantParser.g:558:2: ( ( ( ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) ) ( (lv_syllables_4_0= ruleExtenderRule ) )* ) | ( (lv_syllables_5_0= ruleSkipRule ) ) | (this_START_NOTE_GROUP_6= RULE_START_NOTE_GROUP ( (lv_noemphasis_7_0= Solidus ) )? ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+ this_END_NOTE_GROUP_9= RULE_END_NOTE_GROUP ) ) )
            // InternalLilyChantParser.g:559:2: ( ( ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) ) ( (lv_syllables_4_0= ruleExtenderRule ) )* ) | ( (lv_syllables_5_0= ruleSkipRule ) ) | (this_START_NOTE_GROUP_6= RULE_START_NOTE_GROUP ( (lv_noemphasis_7_0= Solidus ) )? ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+ this_END_NOTE_GROUP_9= RULE_END_NOTE_GROUP ) )
            {
            // InternalLilyChantParser.g:559:2: ( ( ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) ) ( (lv_syllables_4_0= ruleExtenderRule ) )* ) | ( (lv_syllables_5_0= ruleSkipRule ) ) | (this_START_NOTE_GROUP_6= RULE_START_NOTE_GROUP ( (lv_noemphasis_7_0= Solidus ) )? ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+ this_END_NOTE_GROUP_9= RULE_END_NOTE_GROUP ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case HyphenMinusHyphenMinus:
            case Asterisk:
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case KW__:
                {
                alt17=2;
                }
                break;
            case RULE_START_NOTE_GROUP:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalLilyChantParser.g:560:3: ( ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) ) ( (lv_syllables_4_0= ruleExtenderRule ) )* )
                    {
                    // InternalLilyChantParser.g:560:3: ( ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) ) ( (lv_syllables_4_0= ruleExtenderRule ) )* )
                    // InternalLilyChantParser.g:561:4: ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) ) ( (lv_syllables_4_0= ruleExtenderRule ) )*
                    {
                    // InternalLilyChantParser.g:561:4: ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==Asterisk||LA12_0==RULE_ID) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==HyphenMinusHyphenMinus) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalLilyChantParser.g:562:5: ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? )
                            {
                            // InternalLilyChantParser.g:562:5: ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? )
                            // InternalLilyChantParser.g:563:6: ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )?
                            {
                            // InternalLilyChantParser.g:563:6: ( (lv_syllables_0_0= ruleIdRule ) )
                            // InternalLilyChantParser.g:564:7: (lv_syllables_0_0= ruleIdRule )
                            {
                            // InternalLilyChantParser.g:564:7: (lv_syllables_0_0= ruleIdRule )
                            // InternalLilyChantParser.g:565:8: lv_syllables_0_0= ruleIdRule
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNoteGroupAccess().getSyllablesIdRuleParserRuleCall_0_0_0_0_0());
                              							
                            }
                            pushFollow(FOLLOW_19);
                            lv_syllables_0_0=ruleIdRule();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNoteGroupRule());
                              								}
                              								add(
                              									current,
                              									"syllables",
                              									lv_syllables_0_0,
                              									"org.lilychant.LilyChant.IdRule");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalLilyChantParser.g:582:6: ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )?
                            int alt11=2;
                            alt11 = dfa11.predict(input);
                            switch (alt11) {
                                case 1 :
                                    // InternalLilyChantParser.g:583:7: ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) )
                                    {
                                    // InternalLilyChantParser.g:589:7: ( (lv_syllables_1_0= ruleHyphenRule ) )
                                    // InternalLilyChantParser.g:590:8: (lv_syllables_1_0= ruleHyphenRule )
                                    {
                                    // InternalLilyChantParser.g:590:8: (lv_syllables_1_0= ruleHyphenRule )
                                    // InternalLilyChantParser.g:591:9: lv_syllables_1_0= ruleHyphenRule
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNoteGroupAccess().getSyllablesHyphenRuleParserRuleCall_0_0_0_1_0_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_20);
                                    lv_syllables_1_0=ruleHyphenRule();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNoteGroupRule());
                                      									}
                                      									add(
                                      										current,
                                      										"syllables",
                                      										lv_syllables_1_0,
                                      										"org.lilychant.LilyChant.HyphenRule");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalLilyChantParser.g:611:5: ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) )
                            {
                            // InternalLilyChantParser.g:611:5: ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) )
                            // InternalLilyChantParser.g:612:6: ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) )
                            {
                            // InternalLilyChantParser.g:612:6: ( (lv_syllables_2_0= ruleHyphenRule ) )
                            // InternalLilyChantParser.g:613:7: (lv_syllables_2_0= ruleHyphenRule )
                            {
                            // InternalLilyChantParser.g:613:7: (lv_syllables_2_0= ruleHyphenRule )
                            // InternalLilyChantParser.g:614:8: lv_syllables_2_0= ruleHyphenRule
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNoteGroupAccess().getSyllablesHyphenRuleParserRuleCall_0_0_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_21);
                            lv_syllables_2_0=ruleHyphenRule();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNoteGroupRule());
                              								}
                              								add(
                              									current,
                              									"syllables",
                              									lv_syllables_2_0,
                              									"org.lilychant.LilyChant.HyphenRule");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalLilyChantParser.g:631:6: ( (lv_syllables_3_0= ruleIdRule ) )
                            // InternalLilyChantParser.g:632:7: (lv_syllables_3_0= ruleIdRule )
                            {
                            // InternalLilyChantParser.g:632:7: (lv_syllables_3_0= ruleIdRule )
                            // InternalLilyChantParser.g:633:8: lv_syllables_3_0= ruleIdRule
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNoteGroupAccess().getSyllablesIdRuleParserRuleCall_0_0_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_20);
                            lv_syllables_3_0=ruleIdRule();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNoteGroupRule());
                              								}
                              								add(
                              									current,
                              									"syllables",
                              									lv_syllables_3_0,
                              									"org.lilychant.LilyChant.IdRule");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;

                    }

                    // InternalLilyChantParser.g:652:4: ( (lv_syllables_4_0= ruleExtenderRule ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==KW___) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalLilyChantParser.g:653:5: (lv_syllables_4_0= ruleExtenderRule )
                    	    {
                    	    // InternalLilyChantParser.g:653:5: (lv_syllables_4_0= ruleExtenderRule )
                    	    // InternalLilyChantParser.g:654:6: lv_syllables_4_0= ruleExtenderRule
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getNoteGroupAccess().getSyllablesExtenderRuleParserRuleCall_0_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    lv_syllables_4_0=ruleExtenderRule();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getNoteGroupRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"syllables",
                    	      							lv_syllables_4_0,
                    	      							"org.lilychant.LilyChant.ExtenderRule");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalLilyChantParser.g:673:3: ( (lv_syllables_5_0= ruleSkipRule ) )
                    {
                    // InternalLilyChantParser.g:673:3: ( (lv_syllables_5_0= ruleSkipRule ) )
                    // InternalLilyChantParser.g:674:4: (lv_syllables_5_0= ruleSkipRule )
                    {
                    // InternalLilyChantParser.g:674:4: (lv_syllables_5_0= ruleSkipRule )
                    // InternalLilyChantParser.g:675:5: lv_syllables_5_0= ruleSkipRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNoteGroupAccess().getSyllablesSkipRuleParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_syllables_5_0=ruleSkipRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNoteGroupRule());
                      					}
                      					add(
                      						current,
                      						"syllables",
                      						lv_syllables_5_0,
                      						"org.lilychant.LilyChant.SkipRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLilyChantParser.g:693:3: (this_START_NOTE_GROUP_6= RULE_START_NOTE_GROUP ( (lv_noemphasis_7_0= Solidus ) )? ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+ this_END_NOTE_GROUP_9= RULE_END_NOTE_GROUP )
                    {
                    // InternalLilyChantParser.g:693:3: (this_START_NOTE_GROUP_6= RULE_START_NOTE_GROUP ( (lv_noemphasis_7_0= Solidus ) )? ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+ this_END_NOTE_GROUP_9= RULE_END_NOTE_GROUP )
                    // InternalLilyChantParser.g:694:4: this_START_NOTE_GROUP_6= RULE_START_NOTE_GROUP ( (lv_noemphasis_7_0= Solidus ) )? ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+ this_END_NOTE_GROUP_9= RULE_END_NOTE_GROUP
                    {
                    this_START_NOTE_GROUP_6=(Token)match(input,RULE_START_NOTE_GROUP,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_START_NOTE_GROUP_6, grammarAccess.getNoteGroupAccess().getSTART_NOTE_GROUPTerminalRuleCall_2_0());
                      			
                    }
                    // InternalLilyChantParser.g:698:4: ( (lv_noemphasis_7_0= Solidus ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==Solidus) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalLilyChantParser.g:699:5: (lv_noemphasis_7_0= Solidus )
                            {
                            // InternalLilyChantParser.g:699:5: (lv_noemphasis_7_0= Solidus )
                            // InternalLilyChantParser.g:700:6: lv_noemphasis_7_0= Solidus
                            {
                            lv_noemphasis_7_0=(Token)match(input,Solidus,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_noemphasis_7_0, grammarAccess.getNoteGroupAccess().getNoemphasisSolidusKeyword_2_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getNoteGroupRule());
                              						}
                              						setWithLastConsumed(current, "noemphasis", true, "/");
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalLilyChantParser.g:712:4: ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=HyphenMinusHyphenMinus && LA16_0<=KW___)||LA16_0==Asterisk||LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalLilyChantParser.g:713:5: ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) )
                    	    {
                    	    // InternalLilyChantParser.g:713:5: ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) )
                    	    // InternalLilyChantParser.g:714:6: (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule )
                    	    {
                    	    // InternalLilyChantParser.g:714:6: (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule )
                    	    int alt15=3;
                    	    switch ( input.LA(1) ) {
                    	    case Asterisk:
                    	    case RULE_ID:
                    	        {
                    	        alt15=1;
                    	        }
                    	        break;
                    	    case HyphenMinusHyphenMinus:
                    	        {
                    	        alt15=2;
                    	        }
                    	        break;
                    	    case KW___:
                    	        {
                    	        alt15=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 15, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt15) {
                    	        case 1 :
                    	            // InternalLilyChantParser.g:715:7: lv_syllables_8_1= ruleIdRule
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getNoteGroupAccess().getSyllablesIdRuleParserRuleCall_2_2_0_0());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_24);
                    	            lv_syllables_8_1=ruleIdRule();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getNoteGroupRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"syllables",
                    	              								lv_syllables_8_1,
                    	              								"org.lilychant.LilyChant.IdRule");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalLilyChantParser.g:731:7: lv_syllables_8_2= ruleHyphenRule
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getNoteGroupAccess().getSyllablesHyphenRuleParserRuleCall_2_2_0_1());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_24);
                    	            lv_syllables_8_2=ruleHyphenRule();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getNoteGroupRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"syllables",
                    	              								lv_syllables_8_2,
                    	              								"org.lilychant.LilyChant.HyphenRule");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalLilyChantParser.g:747:7: lv_syllables_8_3= ruleExtenderRule
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getNoteGroupAccess().getSyllablesExtenderRuleParserRuleCall_2_2_0_2());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_24);
                    	            lv_syllables_8_3=ruleExtenderRule();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getNoteGroupRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"syllables",
                    	              								lv_syllables_8_3,
                    	              								"org.lilychant.LilyChant.ExtenderRule");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    this_END_NOTE_GROUP_9=(Token)match(input,RULE_END_NOTE_GROUP,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_NOTE_GROUP_9, grammarAccess.getNoteGroupAccess().getEND_NOTE_GROUPTerminalRuleCall_2_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoteGroup"


    // $ANTLR start "entryRuleIdRule"
    // InternalLilyChantParser.g:774:1: entryRuleIdRule returns [EObject current=null] : iv_ruleIdRule= ruleIdRule EOF ;
    public final EObject entryRuleIdRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdRule = null;


        try {
            // InternalLilyChantParser.g:774:47: (iv_ruleIdRule= ruleIdRule EOF )
            // InternalLilyChantParser.g:775:2: iv_ruleIdRule= ruleIdRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdRule=ruleIdRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdRule"


    // $ANTLR start "ruleIdRule"
    // InternalLilyChantParser.g:781:1: ruleIdRule returns [EObject current=null] : ( ( (lv_emphasis_0_0= Asterisk ) )? ( (lv_literal_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIdRule() throws RecognitionException {
        EObject current = null;

        Token lv_emphasis_0_0=null;
        Token lv_literal_1_0=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:787:2: ( ( ( (lv_emphasis_0_0= Asterisk ) )? ( (lv_literal_1_0= RULE_ID ) ) ) )
            // InternalLilyChantParser.g:788:2: ( ( (lv_emphasis_0_0= Asterisk ) )? ( (lv_literal_1_0= RULE_ID ) ) )
            {
            // InternalLilyChantParser.g:788:2: ( ( (lv_emphasis_0_0= Asterisk ) )? ( (lv_literal_1_0= RULE_ID ) ) )
            // InternalLilyChantParser.g:789:3: ( (lv_emphasis_0_0= Asterisk ) )? ( (lv_literal_1_0= RULE_ID ) )
            {
            // InternalLilyChantParser.g:789:3: ( (lv_emphasis_0_0= Asterisk ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Asterisk) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLilyChantParser.g:790:4: (lv_emphasis_0_0= Asterisk )
                    {
                    // InternalLilyChantParser.g:790:4: (lv_emphasis_0_0= Asterisk )
                    // InternalLilyChantParser.g:791:5: lv_emphasis_0_0= Asterisk
                    {
                    lv_emphasis_0_0=(Token)match(input,Asterisk,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_emphasis_0_0, grammarAccess.getIdRuleAccess().getEmphasisAsteriskKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getIdRuleRule());
                      					}
                      					setWithLastConsumed(current, "emphasis", true, "*");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalLilyChantParser.g:803:3: ( (lv_literal_1_0= RULE_ID ) )
            // InternalLilyChantParser.g:804:4: (lv_literal_1_0= RULE_ID )
            {
            // InternalLilyChantParser.g:804:4: (lv_literal_1_0= RULE_ID )
            // InternalLilyChantParser.g:805:5: lv_literal_1_0= RULE_ID
            {
            lv_literal_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_literal_1_0, grammarAccess.getIdRuleAccess().getLiteralIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIdRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"literal",
              						lv_literal_1_0,
              						"org.lilychant.LilyChant.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdRule"


    // $ANTLR start "entryRuleHyphenRule"
    // InternalLilyChantParser.g:825:1: entryRuleHyphenRule returns [EObject current=null] : iv_ruleHyphenRule= ruleHyphenRule EOF ;
    public final EObject entryRuleHyphenRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHyphenRule = null;


        try {
            // InternalLilyChantParser.g:825:51: (iv_ruleHyphenRule= ruleHyphenRule EOF )
            // InternalLilyChantParser.g:826:2: iv_ruleHyphenRule= ruleHyphenRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHyphenRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHyphenRule=ruleHyphenRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHyphenRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHyphenRule"


    // $ANTLR start "ruleHyphenRule"
    // InternalLilyChantParser.g:832:1: ruleHyphenRule returns [EObject current=null] : ( () ( (lv_literal_1_0= HyphenMinusHyphenMinus ) ) ) ;
    public final EObject ruleHyphenRule() throws RecognitionException {
        EObject current = null;

        Token lv_literal_1_0=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:838:2: ( ( () ( (lv_literal_1_0= HyphenMinusHyphenMinus ) ) ) )
            // InternalLilyChantParser.g:839:2: ( () ( (lv_literal_1_0= HyphenMinusHyphenMinus ) ) )
            {
            // InternalLilyChantParser.g:839:2: ( () ( (lv_literal_1_0= HyphenMinusHyphenMinus ) ) )
            // InternalLilyChantParser.g:840:3: () ( (lv_literal_1_0= HyphenMinusHyphenMinus ) )
            {
            // InternalLilyChantParser.g:840:3: ()
            // InternalLilyChantParser.g:841:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHyphenRuleAccess().getHyphenRuleAction_0(),
              					current);
              			
            }

            }

            // InternalLilyChantParser.g:847:3: ( (lv_literal_1_0= HyphenMinusHyphenMinus ) )
            // InternalLilyChantParser.g:848:4: (lv_literal_1_0= HyphenMinusHyphenMinus )
            {
            // InternalLilyChantParser.g:848:4: (lv_literal_1_0= HyphenMinusHyphenMinus )
            // InternalLilyChantParser.g:849:5: lv_literal_1_0= HyphenMinusHyphenMinus
            {
            lv_literal_1_0=(Token)match(input,HyphenMinusHyphenMinus,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_literal_1_0, grammarAccess.getHyphenRuleAccess().getLiteralHyphenMinusHyphenMinusKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getHyphenRuleRule());
              					}
              					setWithLastConsumed(current, "literal", lv_literal_1_0, "--");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHyphenRule"


    // $ANTLR start "entryRuleExtenderRule"
    // InternalLilyChantParser.g:865:1: entryRuleExtenderRule returns [EObject current=null] : iv_ruleExtenderRule= ruleExtenderRule EOF ;
    public final EObject entryRuleExtenderRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtenderRule = null;


        try {
            // InternalLilyChantParser.g:865:53: (iv_ruleExtenderRule= ruleExtenderRule EOF )
            // InternalLilyChantParser.g:866:2: iv_ruleExtenderRule= ruleExtenderRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtenderRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExtenderRule=ruleExtenderRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtenderRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtenderRule"


    // $ANTLR start "ruleExtenderRule"
    // InternalLilyChantParser.g:872:1: ruleExtenderRule returns [EObject current=null] : ( () ( (lv_literal_1_0= KW___ ) ) ) ;
    public final EObject ruleExtenderRule() throws RecognitionException {
        EObject current = null;

        Token lv_literal_1_0=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:878:2: ( ( () ( (lv_literal_1_0= KW___ ) ) ) )
            // InternalLilyChantParser.g:879:2: ( () ( (lv_literal_1_0= KW___ ) ) )
            {
            // InternalLilyChantParser.g:879:2: ( () ( (lv_literal_1_0= KW___ ) ) )
            // InternalLilyChantParser.g:880:3: () ( (lv_literal_1_0= KW___ ) )
            {
            // InternalLilyChantParser.g:880:3: ()
            // InternalLilyChantParser.g:881:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExtenderRuleAccess().getExtenderRuleAction_0(),
              					current);
              			
            }

            }

            // InternalLilyChantParser.g:887:3: ( (lv_literal_1_0= KW___ ) )
            // InternalLilyChantParser.g:888:4: (lv_literal_1_0= KW___ )
            {
            // InternalLilyChantParser.g:888:4: (lv_literal_1_0= KW___ )
            // InternalLilyChantParser.g:889:5: lv_literal_1_0= KW___
            {
            lv_literal_1_0=(Token)match(input,KW___,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_literal_1_0, grammarAccess.getExtenderRuleAccess().getLiteral__Keyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExtenderRuleRule());
              					}
              					setWithLastConsumed(current, "literal", lv_literal_1_0, "__");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtenderRule"


    // $ANTLR start "entryRuleSkipRule"
    // InternalLilyChantParser.g:905:1: entryRuleSkipRule returns [EObject current=null] : iv_ruleSkipRule= ruleSkipRule EOF ;
    public final EObject entryRuleSkipRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkipRule = null;


        try {
            // InternalLilyChantParser.g:905:49: (iv_ruleSkipRule= ruleSkipRule EOF )
            // InternalLilyChantParser.g:906:2: iv_ruleSkipRule= ruleSkipRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSkipRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSkipRule=ruleSkipRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSkipRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSkipRule"


    // $ANTLR start "ruleSkipRule"
    // InternalLilyChantParser.g:912:1: ruleSkipRule returns [EObject current=null] : ( () ( (lv_literal_1_0= KW__ ) ) ) ;
    public final EObject ruleSkipRule() throws RecognitionException {
        EObject current = null;

        Token lv_literal_1_0=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:918:2: ( ( () ( (lv_literal_1_0= KW__ ) ) ) )
            // InternalLilyChantParser.g:919:2: ( () ( (lv_literal_1_0= KW__ ) ) )
            {
            // InternalLilyChantParser.g:919:2: ( () ( (lv_literal_1_0= KW__ ) ) )
            // InternalLilyChantParser.g:920:3: () ( (lv_literal_1_0= KW__ ) )
            {
            // InternalLilyChantParser.g:920:3: ()
            // InternalLilyChantParser.g:921:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSkipRuleAccess().getSkipRuleAction_0(),
              					current);
              			
            }

            }

            // InternalLilyChantParser.g:927:3: ( (lv_literal_1_0= KW__ ) )
            // InternalLilyChantParser.g:928:4: (lv_literal_1_0= KW__ )
            {
            // InternalLilyChantParser.g:928:4: (lv_literal_1_0= KW__ )
            // InternalLilyChantParser.g:929:5: lv_literal_1_0= KW__
            {
            lv_literal_1_0=(Token)match(input,KW__,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_literal_1_0, grammarAccess.getSkipRuleAccess().getLiteral_Keyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSkipRuleRule());
              					}
              					setWithLastConsumed(current, "literal", lv_literal_1_0, "_");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSkipRule"


    // $ANTLR start "entryRuleNote"
    // InternalLilyChantParser.g:945:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // InternalLilyChantParser.g:945:45: (iv_ruleNote= ruleNote EOF )
            // InternalLilyChantParser.g:946:2: iv_ruleNote= ruleNote EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNoteRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNote=ruleNote();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNote; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalLilyChantParser.g:952:1: ruleNote returns [EObject current=null] : ( ( (lv_pitch_0_0= RULE_ID ) ) ( (lv_duration_1_0= RULE_DURATION ) )? ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token lv_pitch_0_0=null;
        Token lv_duration_1_0=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:958:2: ( ( ( (lv_pitch_0_0= RULE_ID ) ) ( (lv_duration_1_0= RULE_DURATION ) )? ) )
            // InternalLilyChantParser.g:959:2: ( ( (lv_pitch_0_0= RULE_ID ) ) ( (lv_duration_1_0= RULE_DURATION ) )? )
            {
            // InternalLilyChantParser.g:959:2: ( ( (lv_pitch_0_0= RULE_ID ) ) ( (lv_duration_1_0= RULE_DURATION ) )? )
            // InternalLilyChantParser.g:960:3: ( (lv_pitch_0_0= RULE_ID ) ) ( (lv_duration_1_0= RULE_DURATION ) )?
            {
            // InternalLilyChantParser.g:960:3: ( (lv_pitch_0_0= RULE_ID ) )
            // InternalLilyChantParser.g:961:4: (lv_pitch_0_0= RULE_ID )
            {
            // InternalLilyChantParser.g:961:4: (lv_pitch_0_0= RULE_ID )
            // InternalLilyChantParser.g:962:5: lv_pitch_0_0= RULE_ID
            {
            lv_pitch_0_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_pitch_0_0, grammarAccess.getNoteAccess().getPitchIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNoteRule());
              					}
              					setWithLastConsumed(
              						current,
              						"pitch",
              						lv_pitch_0_0,
              						"org.lilychant.LilyChant.ID");
              				
            }

            }


            }

            // InternalLilyChantParser.g:978:3: ( (lv_duration_1_0= RULE_DURATION ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DURATION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLilyChantParser.g:979:4: (lv_duration_1_0= RULE_DURATION )
                    {
                    // InternalLilyChantParser.g:979:4: (lv_duration_1_0= RULE_DURATION )
                    // InternalLilyChantParser.g:980:5: lv_duration_1_0= RULE_DURATION
                    {
                    lv_duration_1_0=(Token)match(input,RULE_DURATION,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_duration_1_0, grammarAccess.getNoteAccess().getDurationDURATIONTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getNoteRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"duration",
                      						lv_duration_1_0,
                      						"org.lilychant.LilyChant.DURATION");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "ruleBarline"
    // InternalLilyChantParser.g:1000:1: ruleBarline returns [Enumerator current=null] : ( (enumLiteral_0= VerticalLine ) | (enumLiteral_1= VerticalLineVerticalLine ) ) ;
    public final Enumerator ruleBarline() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:1006:2: ( ( (enumLiteral_0= VerticalLine ) | (enumLiteral_1= VerticalLineVerticalLine ) ) )
            // InternalLilyChantParser.g:1007:2: ( (enumLiteral_0= VerticalLine ) | (enumLiteral_1= VerticalLineVerticalLine ) )
            {
            // InternalLilyChantParser.g:1007:2: ( (enumLiteral_0= VerticalLine ) | (enumLiteral_1= VerticalLineVerticalLine ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==VerticalLine) ) {
                alt20=1;
            }
            else if ( (LA20_0==VerticalLineVerticalLine) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalLilyChantParser.g:1008:3: (enumLiteral_0= VerticalLine )
                    {
                    // InternalLilyChantParser.g:1008:3: (enumLiteral_0= VerticalLine )
                    // InternalLilyChantParser.g:1009:4: enumLiteral_0= VerticalLine
                    {
                    enumLiteral_0=(Token)match(input,VerticalLine,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBarlineAccess().getSingleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBarlineAccess().getSingleEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLilyChantParser.g:1016:3: (enumLiteral_1= VerticalLineVerticalLine )
                    {
                    // InternalLilyChantParser.g:1016:3: (enumLiteral_1= VerticalLineVerticalLine )
                    // InternalLilyChantParser.g:1017:4: enumLiteral_1= VerticalLineVerticalLine
                    {
                    enumLiteral_1=(Token)match(input,VerticalLineVerticalLine,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBarlineAccess().getDoubleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBarlineAccess().getDoubleEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBarline"

    // $ANTLR start synpred1_InternalLilyChantParser
    public final void synpred1_InternalLilyChantParser_fragment() throws RecognitionException {   
        // InternalLilyChantParser.g:583:7: ( ( ( ruleHyphenRule ) ) )
        // InternalLilyChantParser.g:583:8: ( ( ruleHyphenRule ) )
        {
        // InternalLilyChantParser.g:583:8: ( ( ruleHyphenRule ) )
        // InternalLilyChantParser.g:584:8: ( ruleHyphenRule )
        {
        // InternalLilyChantParser.g:584:8: ( ruleHyphenRule )
        // InternalLilyChantParser.g:585:9: ruleHyphenRule
        {
        pushFollow(FOLLOW_2);
        ruleHyphenRule();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalLilyChantParser

    // Delegated rules

    public final boolean synpred1_InternalLilyChantParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalLilyChantParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\2\1\13\12\uffff";
    static final String dfa_3s = "\2\11\4\uffff\1\22\1\0\4\uffff";
    static final String dfa_4s = "\2\25\4\uffff\1\22\1\0\4\uffff";
    static final String dfa_5s = "\2\uffff\1\2\3\1\2\uffff\4\1";
    static final String dfa_6s = "\1\uffff\1\0\5\uffff\1\1\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\2\uffff\1\2\1\uffff\3\2\2\uffff\1\2",
            "\1\10\1\3\1\5\2\uffff\1\6\1\uffff\1\11\1\4\1\7\2\uffff\1\12",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "582:6: ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_1==KW___) && (synpred1_InternalLilyChantParser())) {s = 3;}

                        else if ( (LA11_1==VerticalLine) && (synpred1_InternalLilyChantParser())) {s = 4;}

                        else if ( (LA11_1==VerticalLineVerticalLine) && (synpred1_InternalLilyChantParser())) {s = 5;}

                        else if ( (LA11_1==Asterisk) ) {s = 6;}

                        else if ( (LA11_1==RULE_ID) ) {s = 7;}

                        else if ( (LA11_1==HyphenMinusHyphenMinus) && (synpred1_InternalLilyChantParser())) {s = 8;}

                        else if ( (LA11_1==KW__) && (synpred1_InternalLilyChantParser())) {s = 9;}

                        else if ( (LA11_1==RULE_START_NOTE_GROUP) && (synpred1_InternalLilyChantParser())) {s = 10;}

                        else if ( (LA11_1==EOF) && (synpred1_InternalLilyChantParser())) {s = 11;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalLilyChantParser()) ) {s = 11;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000142L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000255200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001255200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000275A00L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000044602L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000004C600L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000044600L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000444600L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100002L});

}