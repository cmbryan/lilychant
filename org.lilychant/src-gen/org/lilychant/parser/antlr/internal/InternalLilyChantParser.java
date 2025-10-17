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
    // InternalLilyChantParser.g:65:1: ruleScript returns [EObject current=null] : ( ( (lv_tones_0_0= ruleTone ) )* ( (lv_chants_1_0= ruleChant ) )* ( (lv_format_2_0= ruleFormat ) )? ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_tones_0_0 = null;

        EObject lv_chants_1_0 = null;

        EObject lv_format_2_0 = null;



        	enterRule();

        try {
            // InternalLilyChantParser.g:71:2: ( ( ( (lv_tones_0_0= ruleTone ) )* ( (lv_chants_1_0= ruleChant ) )* ( (lv_format_2_0= ruleFormat ) )? ) )
            // InternalLilyChantParser.g:72:2: ( ( (lv_tones_0_0= ruleTone ) )* ( (lv_chants_1_0= ruleChant ) )* ( (lv_format_2_0= ruleFormat ) )? )
            {
            // InternalLilyChantParser.g:72:2: ( ( (lv_tones_0_0= ruleTone ) )* ( (lv_chants_1_0= ruleChant ) )* ( (lv_format_2_0= ruleFormat ) )? )
            // InternalLilyChantParser.g:73:3: ( (lv_tones_0_0= ruleTone ) )* ( (lv_chants_1_0= ruleChant ) )* ( (lv_format_2_0= ruleFormat ) )?
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

            // InternalLilyChantParser.g:111:3: ( (lv_format_2_0= ruleFormat ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Format) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLilyChantParser.g:112:4: (lv_format_2_0= ruleFormat )
                    {
                    // InternalLilyChantParser.g:112:4: (lv_format_2_0= ruleFormat )
                    // InternalLilyChantParser.g:113:5: lv_format_2_0= ruleFormat
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getScriptAccess().getFormatFormatParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_format_2_0=ruleFormat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getScriptRule());
                      					}
                      					set(
                      						current,
                      						"format",
                      						lv_format_2_0,
                      						"org.lilychant.LilyChant.Format");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleTone"
    // InternalLilyChantParser.g:134:1: entryRuleTone returns [EObject current=null] : iv_ruleTone= ruleTone EOF ;
    public final EObject entryRuleTone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTone = null;


        try {
            // InternalLilyChantParser.g:134:45: (iv_ruleTone= ruleTone EOF )
            // InternalLilyChantParser.g:135:2: iv_ruleTone= ruleTone EOF
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
    // InternalLilyChantParser.g:141:1: ruleTone returns [EObject current=null] : (otherlv_0= Tone ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Voices this_BEGIN_4= RULE_BEGIN ( (lv_voiceNames_5_0= ruleVoiceName ) )+ this_END_6= RULE_END ( (lv_phrases_7_0= ruleTonePhrase ) )+ this_END_8= RULE_END ) ;
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
            // InternalLilyChantParser.g:147:2: ( (otherlv_0= Tone ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Voices this_BEGIN_4= RULE_BEGIN ( (lv_voiceNames_5_0= ruleVoiceName ) )+ this_END_6= RULE_END ( (lv_phrases_7_0= ruleTonePhrase ) )+ this_END_8= RULE_END ) )
            // InternalLilyChantParser.g:148:2: (otherlv_0= Tone ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Voices this_BEGIN_4= RULE_BEGIN ( (lv_voiceNames_5_0= ruleVoiceName ) )+ this_END_6= RULE_END ( (lv_phrases_7_0= ruleTonePhrase ) )+ this_END_8= RULE_END )
            {
            // InternalLilyChantParser.g:148:2: (otherlv_0= Tone ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Voices this_BEGIN_4= RULE_BEGIN ( (lv_voiceNames_5_0= ruleVoiceName ) )+ this_END_6= RULE_END ( (lv_phrases_7_0= ruleTonePhrase ) )+ this_END_8= RULE_END )
            // InternalLilyChantParser.g:149:3: otherlv_0= Tone ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Voices this_BEGIN_4= RULE_BEGIN ( (lv_voiceNames_5_0= ruleVoiceName ) )+ this_END_6= RULE_END ( (lv_phrases_7_0= ruleTonePhrase ) )+ this_END_8= RULE_END
            {
            otherlv_0=(Token)match(input,Tone,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getToneAccess().getToneKeyword_0());
              		
            }
            // InternalLilyChantParser.g:153:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLilyChantParser.g:154:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLilyChantParser.g:154:4: (lv_name_1_0= RULE_ID )
            // InternalLilyChantParser.g:155:5: lv_name_1_0= RULE_ID
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
            // InternalLilyChantParser.g:183:3: ( (lv_voiceNames_5_0= ruleVoiceName ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLilyChantParser.g:184:4: (lv_voiceNames_5_0= ruleVoiceName )
            	    {
            	    // InternalLilyChantParser.g:184:4: (lv_voiceNames_5_0= ruleVoiceName )
            	    // InternalLilyChantParser.g:185:5: lv_voiceNames_5_0= ruleVoiceName
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
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_6, grammarAccess.getToneAccess().getENDTerminalRuleCall_6());
              		
            }
            // InternalLilyChantParser.g:206:3: ( (lv_phrases_7_0= ruleTonePhrase ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Phrase) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLilyChantParser.g:207:4: (lv_phrases_7_0= ruleTonePhrase )
            	    {
            	    // InternalLilyChantParser.g:207:4: (lv_phrases_7_0= ruleTonePhrase )
            	    // InternalLilyChantParser.g:208:5: lv_phrases_7_0= ruleTonePhrase
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
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // InternalLilyChantParser.g:233:1: entryRuleVoiceName returns [EObject current=null] : iv_ruleVoiceName= ruleVoiceName EOF ;
    public final EObject entryRuleVoiceName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoiceName = null;


        try {
            // InternalLilyChantParser.g:233:50: (iv_ruleVoiceName= ruleVoiceName EOF )
            // InternalLilyChantParser.g:234:2: iv_ruleVoiceName= ruleVoiceName EOF
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
    // InternalLilyChantParser.g:240:1: ruleVoiceName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVoiceName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:246:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalLilyChantParser.g:247:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalLilyChantParser.g:247:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalLilyChantParser.g:248:3: (lv_name_0_0= RULE_ID )
            {
            // InternalLilyChantParser.g:248:3: (lv_name_0_0= RULE_ID )
            // InternalLilyChantParser.g:249:4: lv_name_0_0= RULE_ID
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
    // InternalLilyChantParser.g:268:1: entryRuleTonePhrase returns [EObject current=null] : iv_ruleTonePhrase= ruleTonePhrase EOF ;
    public final EObject entryRuleTonePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTonePhrase = null;


        try {
            // InternalLilyChantParser.g:268:51: (iv_ruleTonePhrase= ruleTonePhrase EOF )
            // InternalLilyChantParser.g:269:2: iv_ruleTonePhrase= ruleTonePhrase EOF
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
    // InternalLilyChantParser.g:275:1: ruleTonePhrase returns [EObject current=null] : (otherlv_0= Phrase ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_voices_3_0= ruleVoicePhrase ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleTonePhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_voices_3_0 = null;



        	enterRule();

        try {
            // InternalLilyChantParser.g:281:2: ( (otherlv_0= Phrase ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_voices_3_0= ruleVoicePhrase ) )+ this_END_4= RULE_END ) )
            // InternalLilyChantParser.g:282:2: (otherlv_0= Phrase ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_voices_3_0= ruleVoicePhrase ) )+ this_END_4= RULE_END )
            {
            // InternalLilyChantParser.g:282:2: (otherlv_0= Phrase ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_voices_3_0= ruleVoicePhrase ) )+ this_END_4= RULE_END )
            // InternalLilyChantParser.g:283:3: otherlv_0= Phrase ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_voices_3_0= ruleVoicePhrase ) )+ this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Phrase,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTonePhraseAccess().getPhraseKeyword_0());
              		
            }
            // InternalLilyChantParser.g:287:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLilyChantParser.g:288:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLilyChantParser.g:288:4: (lv_name_1_0= RULE_ID )
            // InternalLilyChantParser.g:289:5: lv_name_1_0= RULE_ID
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
            // InternalLilyChantParser.g:309:3: ( (lv_voices_3_0= ruleVoicePhrase ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Voice) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLilyChantParser.g:310:4: (lv_voices_3_0= ruleVoicePhrase )
            	    {
            	    // InternalLilyChantParser.g:310:4: (lv_voices_3_0= ruleVoicePhrase )
            	    // InternalLilyChantParser.g:311:5: lv_voices_3_0= ruleVoicePhrase
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
    // InternalLilyChantParser.g:336:1: entryRuleVoicePhrase returns [EObject current=null] : iv_ruleVoicePhrase= ruleVoicePhrase EOF ;
    public final EObject entryRuleVoicePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoicePhrase = null;


        try {
            // InternalLilyChantParser.g:336:52: (iv_ruleVoicePhrase= ruleVoicePhrase EOF )
            // InternalLilyChantParser.g:337:2: iv_ruleVoicePhrase= ruleVoicePhrase EOF
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
    // InternalLilyChantParser.g:343:1: ruleVoicePhrase returns [EObject current=null] : (otherlv_0= Voice ( (otherlv_1= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_notes_3_0= ruleNote ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleVoicePhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_notes_3_0 = null;



        	enterRule();

        try {
            // InternalLilyChantParser.g:349:2: ( (otherlv_0= Voice ( (otherlv_1= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_notes_3_0= ruleNote ) )+ this_END_4= RULE_END ) )
            // InternalLilyChantParser.g:350:2: (otherlv_0= Voice ( (otherlv_1= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_notes_3_0= ruleNote ) )+ this_END_4= RULE_END )
            {
            // InternalLilyChantParser.g:350:2: (otherlv_0= Voice ( (otherlv_1= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_notes_3_0= ruleNote ) )+ this_END_4= RULE_END )
            // InternalLilyChantParser.g:351:3: otherlv_0= Voice ( (otherlv_1= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_notes_3_0= ruleNote ) )+ this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Voice,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVoicePhraseAccess().getVoiceKeyword_0());
              		
            }
            // InternalLilyChantParser.g:355:3: ( (otherlv_1= RULE_ID ) )
            // InternalLilyChantParser.g:356:4: (otherlv_1= RULE_ID )
            {
            // InternalLilyChantParser.g:356:4: (otherlv_1= RULE_ID )
            // InternalLilyChantParser.g:357:5: otherlv_1= RULE_ID
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
            // InternalLilyChantParser.g:372:3: ( (lv_notes_3_0= ruleNote ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLilyChantParser.g:373:4: (lv_notes_3_0= ruleNote )
            	    {
            	    // InternalLilyChantParser.g:373:4: (lv_notes_3_0= ruleNote )
            	    // InternalLilyChantParser.g:374:5: lv_notes_3_0= ruleNote
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
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // InternalLilyChantParser.g:399:1: entryRuleChant returns [EObject current=null] : iv_ruleChant= ruleChant EOF ;
    public final EObject entryRuleChant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChant = null;


        try {
            // InternalLilyChantParser.g:399:46: (iv_ruleChant= ruleChant EOF )
            // InternalLilyChantParser.g:400:2: iv_ruleChant= ruleChant EOF
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
    // InternalLilyChantParser.g:406:1: ruleChant returns [EObject current=null] : (otherlv_0= Chant ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= Tone ( (otherlv_3= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_phrases_5_0= ruleLyricPhrase ) )+ this_END_6= RULE_END ) ;
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
            // InternalLilyChantParser.g:412:2: ( (otherlv_0= Chant ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= Tone ( (otherlv_3= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_phrases_5_0= ruleLyricPhrase ) )+ this_END_6= RULE_END ) )
            // InternalLilyChantParser.g:413:2: (otherlv_0= Chant ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= Tone ( (otherlv_3= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_phrases_5_0= ruleLyricPhrase ) )+ this_END_6= RULE_END )
            {
            // InternalLilyChantParser.g:413:2: (otherlv_0= Chant ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= Tone ( (otherlv_3= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_phrases_5_0= ruleLyricPhrase ) )+ this_END_6= RULE_END )
            // InternalLilyChantParser.g:414:3: otherlv_0= Chant ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= Tone ( (otherlv_3= RULE_ID ) ) this_BEGIN_4= RULE_BEGIN ( (lv_phrases_5_0= ruleLyricPhrase ) )+ this_END_6= RULE_END
            {
            otherlv_0=(Token)match(input,Chant,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getChantAccess().getChantKeyword_0());
              		
            }
            // InternalLilyChantParser.g:418:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLilyChantParser.g:419:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalLilyChantParser.g:419:4: (lv_name_1_0= RULE_STRING )
                    // InternalLilyChantParser.g:420:5: lv_name_1_0= RULE_STRING
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
            // InternalLilyChantParser.g:440:3: ( (otherlv_3= RULE_ID ) )
            // InternalLilyChantParser.g:441:4: (otherlv_3= RULE_ID )
            {
            // InternalLilyChantParser.g:441:4: (otherlv_3= RULE_ID )
            // InternalLilyChantParser.g:442:5: otherlv_3= RULE_ID
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
            // InternalLilyChantParser.g:457:3: ( (lv_phrases_5_0= ruleLyricPhrase ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==HyphenMinusHyphenMinus||LA9_0==LeftParenthesis||LA9_0==Asterisk||LA9_0==KW__||LA9_0==RULE_ID||LA9_0==RULE_START_NOTE_GROUP) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLilyChantParser.g:458:4: (lv_phrases_5_0= ruleLyricPhrase )
            	    {
            	    // InternalLilyChantParser.g:458:4: (lv_phrases_5_0= ruleLyricPhrase )
            	    // InternalLilyChantParser.g:459:5: lv_phrases_5_0= ruleLyricPhrase
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
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // InternalLilyChantParser.g:484:1: entryRuleLyricPhrase returns [EObject current=null] : iv_ruleLyricPhrase= ruleLyricPhrase EOF ;
    public final EObject entryRuleLyricPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLyricPhrase = null;


        try {
            // InternalLilyChantParser.g:484:52: (iv_ruleLyricPhrase= ruleLyricPhrase EOF )
            // InternalLilyChantParser.g:485:2: iv_ruleLyricPhrase= ruleLyricPhrase EOF
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
    // InternalLilyChantParser.g:491:1: ruleLyricPhrase returns [EObject current=null] : ( (otherlv_0= LeftParenthesis ( (otherlv_1= RULE_ID ) ) otherlv_2= RightParenthesis )? ( (lv_noteGroups_3_0= ruleNoteGroup ) )+ ( (lv_bar_4_0= ruleBarline ) ) ) ;
    public final EObject ruleLyricPhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_noteGroups_3_0 = null;

        Enumerator lv_bar_4_0 = null;



        	enterRule();

        try {
            // InternalLilyChantParser.g:497:2: ( ( (otherlv_0= LeftParenthesis ( (otherlv_1= RULE_ID ) ) otherlv_2= RightParenthesis )? ( (lv_noteGroups_3_0= ruleNoteGroup ) )+ ( (lv_bar_4_0= ruleBarline ) ) ) )
            // InternalLilyChantParser.g:498:2: ( (otherlv_0= LeftParenthesis ( (otherlv_1= RULE_ID ) ) otherlv_2= RightParenthesis )? ( (lv_noteGroups_3_0= ruleNoteGroup ) )+ ( (lv_bar_4_0= ruleBarline ) ) )
            {
            // InternalLilyChantParser.g:498:2: ( (otherlv_0= LeftParenthesis ( (otherlv_1= RULE_ID ) ) otherlv_2= RightParenthesis )? ( (lv_noteGroups_3_0= ruleNoteGroup ) )+ ( (lv_bar_4_0= ruleBarline ) ) )
            // InternalLilyChantParser.g:499:3: (otherlv_0= LeftParenthesis ( (otherlv_1= RULE_ID ) ) otherlv_2= RightParenthesis )? ( (lv_noteGroups_3_0= ruleNoteGroup ) )+ ( (lv_bar_4_0= ruleBarline ) )
            {
            // InternalLilyChantParser.g:499:3: (otherlv_0= LeftParenthesis ( (otherlv_1= RULE_ID ) ) otherlv_2= RightParenthesis )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LeftParenthesis) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLilyChantParser.g:500:4: otherlv_0= LeftParenthesis ( (otherlv_1= RULE_ID ) ) otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getLyricPhraseAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    // InternalLilyChantParser.g:504:4: ( (otherlv_1= RULE_ID ) )
                    // InternalLilyChantParser.g:505:5: (otherlv_1= RULE_ID )
                    {
                    // InternalLilyChantParser.g:505:5: (otherlv_1= RULE_ID )
                    // InternalLilyChantParser.g:506:6: otherlv_1= RULE_ID
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

            // InternalLilyChantParser.g:522:3: ( (lv_noteGroups_3_0= ruleNoteGroup ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==HyphenMinusHyphenMinus||LA11_0==Asterisk||LA11_0==KW__||LA11_0==RULE_ID||LA11_0==RULE_START_NOTE_GROUP) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLilyChantParser.g:523:4: (lv_noteGroups_3_0= ruleNoteGroup )
            	    {
            	    // InternalLilyChantParser.g:523:4: (lv_noteGroups_3_0= ruleNoteGroup )
            	    // InternalLilyChantParser.g:524:5: lv_noteGroups_3_0= ruleNoteGroup
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
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // InternalLilyChantParser.g:541:3: ( (lv_bar_4_0= ruleBarline ) )
            // InternalLilyChantParser.g:542:4: (lv_bar_4_0= ruleBarline )
            {
            // InternalLilyChantParser.g:542:4: (lv_bar_4_0= ruleBarline )
            // InternalLilyChantParser.g:543:5: lv_bar_4_0= ruleBarline
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
    // InternalLilyChantParser.g:564:1: entryRuleNoteGroup returns [EObject current=null] : iv_ruleNoteGroup= ruleNoteGroup EOF ;
    public final EObject entryRuleNoteGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoteGroup = null;


        try {
            // InternalLilyChantParser.g:564:50: (iv_ruleNoteGroup= ruleNoteGroup EOF )
            // InternalLilyChantParser.g:565:2: iv_ruleNoteGroup= ruleNoteGroup EOF
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
    // InternalLilyChantParser.g:571:1: ruleNoteGroup returns [EObject current=null] : ( ( ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) ) ( (lv_syllables_4_0= ruleExtenderRule ) )* ) | ( (lv_syllables_5_0= ruleSkipRule ) ) | (this_START_NOTE_GROUP_6= RULE_START_NOTE_GROUP ( (lv_noemphasis_7_0= Solidus ) )? ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+ this_END_NOTE_GROUP_9= RULE_END_NOTE_GROUP ) ) ;
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
            // InternalLilyChantParser.g:577:2: ( ( ( ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) ) ( (lv_syllables_4_0= ruleExtenderRule ) )* ) | ( (lv_syllables_5_0= ruleSkipRule ) ) | (this_START_NOTE_GROUP_6= RULE_START_NOTE_GROUP ( (lv_noemphasis_7_0= Solidus ) )? ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+ this_END_NOTE_GROUP_9= RULE_END_NOTE_GROUP ) ) )
            // InternalLilyChantParser.g:578:2: ( ( ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) ) ( (lv_syllables_4_0= ruleExtenderRule ) )* ) | ( (lv_syllables_5_0= ruleSkipRule ) ) | (this_START_NOTE_GROUP_6= RULE_START_NOTE_GROUP ( (lv_noemphasis_7_0= Solidus ) )? ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+ this_END_NOTE_GROUP_9= RULE_END_NOTE_GROUP ) )
            {
            // InternalLilyChantParser.g:578:2: ( ( ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) ) ( (lv_syllables_4_0= ruleExtenderRule ) )* ) | ( (lv_syllables_5_0= ruleSkipRule ) ) | (this_START_NOTE_GROUP_6= RULE_START_NOTE_GROUP ( (lv_noemphasis_7_0= Solidus ) )? ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+ this_END_NOTE_GROUP_9= RULE_END_NOTE_GROUP ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case HyphenMinusHyphenMinus:
            case Asterisk:
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case KW__:
                {
                alt18=2;
                }
                break;
            case RULE_START_NOTE_GROUP:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalLilyChantParser.g:579:3: ( ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) ) ( (lv_syllables_4_0= ruleExtenderRule ) )* )
                    {
                    // InternalLilyChantParser.g:579:3: ( ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) ) ( (lv_syllables_4_0= ruleExtenderRule ) )* )
                    // InternalLilyChantParser.g:580:4: ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) ) ( (lv_syllables_4_0= ruleExtenderRule ) )*
                    {
                    // InternalLilyChantParser.g:580:4: ( ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? ) | ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==Asterisk||LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==HyphenMinusHyphenMinus) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalLilyChantParser.g:581:5: ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? )
                            {
                            // InternalLilyChantParser.g:581:5: ( ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )? )
                            // InternalLilyChantParser.g:582:6: ( (lv_syllables_0_0= ruleIdRule ) ) ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )?
                            {
                            // InternalLilyChantParser.g:582:6: ( (lv_syllables_0_0= ruleIdRule ) )
                            // InternalLilyChantParser.g:583:7: (lv_syllables_0_0= ruleIdRule )
                            {
                            // InternalLilyChantParser.g:583:7: (lv_syllables_0_0= ruleIdRule )
                            // InternalLilyChantParser.g:584:8: lv_syllables_0_0= ruleIdRule
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

                            // InternalLilyChantParser.g:601:6: ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )?
                            int alt12=2;
                            alt12 = dfa12.predict(input);
                            switch (alt12) {
                                case 1 :
                                    // InternalLilyChantParser.g:602:7: ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) )
                                    {
                                    // InternalLilyChantParser.g:608:7: ( (lv_syllables_1_0= ruleHyphenRule ) )
                                    // InternalLilyChantParser.g:609:8: (lv_syllables_1_0= ruleHyphenRule )
                                    {
                                    // InternalLilyChantParser.g:609:8: (lv_syllables_1_0= ruleHyphenRule )
                                    // InternalLilyChantParser.g:610:9: lv_syllables_1_0= ruleHyphenRule
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
                            // InternalLilyChantParser.g:630:5: ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) )
                            {
                            // InternalLilyChantParser.g:630:5: ( ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) ) )
                            // InternalLilyChantParser.g:631:6: ( (lv_syllables_2_0= ruleHyphenRule ) ) ( (lv_syllables_3_0= ruleIdRule ) )
                            {
                            // InternalLilyChantParser.g:631:6: ( (lv_syllables_2_0= ruleHyphenRule ) )
                            // InternalLilyChantParser.g:632:7: (lv_syllables_2_0= ruleHyphenRule )
                            {
                            // InternalLilyChantParser.g:632:7: (lv_syllables_2_0= ruleHyphenRule )
                            // InternalLilyChantParser.g:633:8: lv_syllables_2_0= ruleHyphenRule
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

                            // InternalLilyChantParser.g:650:6: ( (lv_syllables_3_0= ruleIdRule ) )
                            // InternalLilyChantParser.g:651:7: (lv_syllables_3_0= ruleIdRule )
                            {
                            // InternalLilyChantParser.g:651:7: (lv_syllables_3_0= ruleIdRule )
                            // InternalLilyChantParser.g:652:8: lv_syllables_3_0= ruleIdRule
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

                    // InternalLilyChantParser.g:671:4: ( (lv_syllables_4_0= ruleExtenderRule ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==KW___) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalLilyChantParser.g:672:5: (lv_syllables_4_0= ruleExtenderRule )
                    	    {
                    	    // InternalLilyChantParser.g:672:5: (lv_syllables_4_0= ruleExtenderRule )
                    	    // InternalLilyChantParser.g:673:6: lv_syllables_4_0= ruleExtenderRule
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
                    	    break loop14;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalLilyChantParser.g:692:3: ( (lv_syllables_5_0= ruleSkipRule ) )
                    {
                    // InternalLilyChantParser.g:692:3: ( (lv_syllables_5_0= ruleSkipRule ) )
                    // InternalLilyChantParser.g:693:4: (lv_syllables_5_0= ruleSkipRule )
                    {
                    // InternalLilyChantParser.g:693:4: (lv_syllables_5_0= ruleSkipRule )
                    // InternalLilyChantParser.g:694:5: lv_syllables_5_0= ruleSkipRule
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
                    // InternalLilyChantParser.g:712:3: (this_START_NOTE_GROUP_6= RULE_START_NOTE_GROUP ( (lv_noemphasis_7_0= Solidus ) )? ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+ this_END_NOTE_GROUP_9= RULE_END_NOTE_GROUP )
                    {
                    // InternalLilyChantParser.g:712:3: (this_START_NOTE_GROUP_6= RULE_START_NOTE_GROUP ( (lv_noemphasis_7_0= Solidus ) )? ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+ this_END_NOTE_GROUP_9= RULE_END_NOTE_GROUP )
                    // InternalLilyChantParser.g:713:4: this_START_NOTE_GROUP_6= RULE_START_NOTE_GROUP ( (lv_noemphasis_7_0= Solidus ) )? ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+ this_END_NOTE_GROUP_9= RULE_END_NOTE_GROUP
                    {
                    this_START_NOTE_GROUP_6=(Token)match(input,RULE_START_NOTE_GROUP,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_START_NOTE_GROUP_6, grammarAccess.getNoteGroupAccess().getSTART_NOTE_GROUPTerminalRuleCall_2_0());
                      			
                    }
                    // InternalLilyChantParser.g:717:4: ( (lv_noemphasis_7_0= Solidus ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==Solidus) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalLilyChantParser.g:718:5: (lv_noemphasis_7_0= Solidus )
                            {
                            // InternalLilyChantParser.g:718:5: (lv_noemphasis_7_0= Solidus )
                            // InternalLilyChantParser.g:719:6: lv_noemphasis_7_0= Solidus
                            {
                            lv_noemphasis_7_0=(Token)match(input,Solidus,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_noemphasis_7_0, grammarAccess.getNoteGroupAccess().getNoemphasisSolidusKeyword_2_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getNoteGroupRule());
                              						}
                              						setWithLastConsumed(current, "noemphasis", lv_noemphasis_7_0 != null, "/");
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalLilyChantParser.g:731:4: ( ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=HyphenMinusHyphenMinus && LA17_0<=KW___)||LA17_0==Asterisk||LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalLilyChantParser.g:732:5: ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) )
                    	    {
                    	    // InternalLilyChantParser.g:732:5: ( (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule ) )
                    	    // InternalLilyChantParser.g:733:6: (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule )
                    	    {
                    	    // InternalLilyChantParser.g:733:6: (lv_syllables_8_1= ruleIdRule | lv_syllables_8_2= ruleHyphenRule | lv_syllables_8_3= ruleExtenderRule )
                    	    int alt16=3;
                    	    switch ( input.LA(1) ) {
                    	    case Asterisk:
                    	    case RULE_ID:
                    	        {
                    	        alt16=1;
                    	        }
                    	        break;
                    	    case HyphenMinusHyphenMinus:
                    	        {
                    	        alt16=2;
                    	        }
                    	        break;
                    	    case KW___:
                    	        {
                    	        alt16=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 16, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt16) {
                    	        case 1 :
                    	            // InternalLilyChantParser.g:734:7: lv_syllables_8_1= ruleIdRule
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
                    	            // InternalLilyChantParser.g:750:7: lv_syllables_8_2= ruleHyphenRule
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
                    	            // InternalLilyChantParser.g:766:7: lv_syllables_8_3= ruleExtenderRule
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
                    	    if ( cnt17 >= 1 ) break loop17;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
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
    // InternalLilyChantParser.g:793:1: entryRuleIdRule returns [EObject current=null] : iv_ruleIdRule= ruleIdRule EOF ;
    public final EObject entryRuleIdRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdRule = null;


        try {
            // InternalLilyChantParser.g:793:47: (iv_ruleIdRule= ruleIdRule EOF )
            // InternalLilyChantParser.g:794:2: iv_ruleIdRule= ruleIdRule EOF
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
    // InternalLilyChantParser.g:800:1: ruleIdRule returns [EObject current=null] : ( ( (lv_emphasis_0_0= Asterisk ) )? ( (lv_literal_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIdRule() throws RecognitionException {
        EObject current = null;

        Token lv_emphasis_0_0=null;
        Token lv_literal_1_0=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:806:2: ( ( ( (lv_emphasis_0_0= Asterisk ) )? ( (lv_literal_1_0= RULE_ID ) ) ) )
            // InternalLilyChantParser.g:807:2: ( ( (lv_emphasis_0_0= Asterisk ) )? ( (lv_literal_1_0= RULE_ID ) ) )
            {
            // InternalLilyChantParser.g:807:2: ( ( (lv_emphasis_0_0= Asterisk ) )? ( (lv_literal_1_0= RULE_ID ) ) )
            // InternalLilyChantParser.g:808:3: ( (lv_emphasis_0_0= Asterisk ) )? ( (lv_literal_1_0= RULE_ID ) )
            {
            // InternalLilyChantParser.g:808:3: ( (lv_emphasis_0_0= Asterisk ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Asterisk) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLilyChantParser.g:809:4: (lv_emphasis_0_0= Asterisk )
                    {
                    // InternalLilyChantParser.g:809:4: (lv_emphasis_0_0= Asterisk )
                    // InternalLilyChantParser.g:810:5: lv_emphasis_0_0= Asterisk
                    {
                    lv_emphasis_0_0=(Token)match(input,Asterisk,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_emphasis_0_0, grammarAccess.getIdRuleAccess().getEmphasisAsteriskKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getIdRuleRule());
                      					}
                      					setWithLastConsumed(current, "emphasis", lv_emphasis_0_0 != null, "*");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalLilyChantParser.g:822:3: ( (lv_literal_1_0= RULE_ID ) )
            // InternalLilyChantParser.g:823:4: (lv_literal_1_0= RULE_ID )
            {
            // InternalLilyChantParser.g:823:4: (lv_literal_1_0= RULE_ID )
            // InternalLilyChantParser.g:824:5: lv_literal_1_0= RULE_ID
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
    // InternalLilyChantParser.g:844:1: entryRuleHyphenRule returns [EObject current=null] : iv_ruleHyphenRule= ruleHyphenRule EOF ;
    public final EObject entryRuleHyphenRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHyphenRule = null;


        try {
            // InternalLilyChantParser.g:844:51: (iv_ruleHyphenRule= ruleHyphenRule EOF )
            // InternalLilyChantParser.g:845:2: iv_ruleHyphenRule= ruleHyphenRule EOF
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
    // InternalLilyChantParser.g:851:1: ruleHyphenRule returns [EObject current=null] : ( () ( (lv_literal_1_0= HyphenMinusHyphenMinus ) ) ) ;
    public final EObject ruleHyphenRule() throws RecognitionException {
        EObject current = null;

        Token lv_literal_1_0=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:857:2: ( ( () ( (lv_literal_1_0= HyphenMinusHyphenMinus ) ) ) )
            // InternalLilyChantParser.g:858:2: ( () ( (lv_literal_1_0= HyphenMinusHyphenMinus ) ) )
            {
            // InternalLilyChantParser.g:858:2: ( () ( (lv_literal_1_0= HyphenMinusHyphenMinus ) ) )
            // InternalLilyChantParser.g:859:3: () ( (lv_literal_1_0= HyphenMinusHyphenMinus ) )
            {
            // InternalLilyChantParser.g:859:3: ()
            // InternalLilyChantParser.g:860:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHyphenRuleAccess().getHyphenRuleAction_0(),
              					current);
              			
            }

            }

            // InternalLilyChantParser.g:866:3: ( (lv_literal_1_0= HyphenMinusHyphenMinus ) )
            // InternalLilyChantParser.g:867:4: (lv_literal_1_0= HyphenMinusHyphenMinus )
            {
            // InternalLilyChantParser.g:867:4: (lv_literal_1_0= HyphenMinusHyphenMinus )
            // InternalLilyChantParser.g:868:5: lv_literal_1_0= HyphenMinusHyphenMinus
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
    // InternalLilyChantParser.g:884:1: entryRuleExtenderRule returns [EObject current=null] : iv_ruleExtenderRule= ruleExtenderRule EOF ;
    public final EObject entryRuleExtenderRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtenderRule = null;


        try {
            // InternalLilyChantParser.g:884:53: (iv_ruleExtenderRule= ruleExtenderRule EOF )
            // InternalLilyChantParser.g:885:2: iv_ruleExtenderRule= ruleExtenderRule EOF
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
    // InternalLilyChantParser.g:891:1: ruleExtenderRule returns [EObject current=null] : ( () ( (lv_literal_1_0= KW___ ) ) ) ;
    public final EObject ruleExtenderRule() throws RecognitionException {
        EObject current = null;

        Token lv_literal_1_0=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:897:2: ( ( () ( (lv_literal_1_0= KW___ ) ) ) )
            // InternalLilyChantParser.g:898:2: ( () ( (lv_literal_1_0= KW___ ) ) )
            {
            // InternalLilyChantParser.g:898:2: ( () ( (lv_literal_1_0= KW___ ) ) )
            // InternalLilyChantParser.g:899:3: () ( (lv_literal_1_0= KW___ ) )
            {
            // InternalLilyChantParser.g:899:3: ()
            // InternalLilyChantParser.g:900:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExtenderRuleAccess().getExtenderRuleAction_0(),
              					current);
              			
            }

            }

            // InternalLilyChantParser.g:906:3: ( (lv_literal_1_0= KW___ ) )
            // InternalLilyChantParser.g:907:4: (lv_literal_1_0= KW___ )
            {
            // InternalLilyChantParser.g:907:4: (lv_literal_1_0= KW___ )
            // InternalLilyChantParser.g:908:5: lv_literal_1_0= KW___
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
    // InternalLilyChantParser.g:924:1: entryRuleSkipRule returns [EObject current=null] : iv_ruleSkipRule= ruleSkipRule EOF ;
    public final EObject entryRuleSkipRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkipRule = null;


        try {
            // InternalLilyChantParser.g:924:49: (iv_ruleSkipRule= ruleSkipRule EOF )
            // InternalLilyChantParser.g:925:2: iv_ruleSkipRule= ruleSkipRule EOF
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
    // InternalLilyChantParser.g:931:1: ruleSkipRule returns [EObject current=null] : ( () ( (lv_literal_1_0= KW__ ) ) ) ;
    public final EObject ruleSkipRule() throws RecognitionException {
        EObject current = null;

        Token lv_literal_1_0=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:937:2: ( ( () ( (lv_literal_1_0= KW__ ) ) ) )
            // InternalLilyChantParser.g:938:2: ( () ( (lv_literal_1_0= KW__ ) ) )
            {
            // InternalLilyChantParser.g:938:2: ( () ( (lv_literal_1_0= KW__ ) ) )
            // InternalLilyChantParser.g:939:3: () ( (lv_literal_1_0= KW__ ) )
            {
            // InternalLilyChantParser.g:939:3: ()
            // InternalLilyChantParser.g:940:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSkipRuleAccess().getSkipRuleAction_0(),
              					current);
              			
            }

            }

            // InternalLilyChantParser.g:946:3: ( (lv_literal_1_0= KW__ ) )
            // InternalLilyChantParser.g:947:4: (lv_literal_1_0= KW__ )
            {
            // InternalLilyChantParser.g:947:4: (lv_literal_1_0= KW__ )
            // InternalLilyChantParser.g:948:5: lv_literal_1_0= KW__
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
    // InternalLilyChantParser.g:964:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // InternalLilyChantParser.g:964:45: (iv_ruleNote= ruleNote EOF )
            // InternalLilyChantParser.g:965:2: iv_ruleNote= ruleNote EOF
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
    // InternalLilyChantParser.g:971:1: ruleNote returns [EObject current=null] : ( ( (lv_pitch_0_0= RULE_ID ) ) ( (lv_duration_1_0= RULE_DURATION ) )? ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token lv_pitch_0_0=null;
        Token lv_duration_1_0=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:977:2: ( ( ( (lv_pitch_0_0= RULE_ID ) ) ( (lv_duration_1_0= RULE_DURATION ) )? ) )
            // InternalLilyChantParser.g:978:2: ( ( (lv_pitch_0_0= RULE_ID ) ) ( (lv_duration_1_0= RULE_DURATION ) )? )
            {
            // InternalLilyChantParser.g:978:2: ( ( (lv_pitch_0_0= RULE_ID ) ) ( (lv_duration_1_0= RULE_DURATION ) )? )
            // InternalLilyChantParser.g:979:3: ( (lv_pitch_0_0= RULE_ID ) ) ( (lv_duration_1_0= RULE_DURATION ) )?
            {
            // InternalLilyChantParser.g:979:3: ( (lv_pitch_0_0= RULE_ID ) )
            // InternalLilyChantParser.g:980:4: (lv_pitch_0_0= RULE_ID )
            {
            // InternalLilyChantParser.g:980:4: (lv_pitch_0_0= RULE_ID )
            // InternalLilyChantParser.g:981:5: lv_pitch_0_0= RULE_ID
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

            // InternalLilyChantParser.g:997:3: ( (lv_duration_1_0= RULE_DURATION ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DURATION) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLilyChantParser.g:998:4: (lv_duration_1_0= RULE_DURATION )
                    {
                    // InternalLilyChantParser.g:998:4: (lv_duration_1_0= RULE_DURATION )
                    // InternalLilyChantParser.g:999:5: lv_duration_1_0= RULE_DURATION
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
                      						lv_duration_1_0 != null,
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


    // $ANTLR start "entryRuleFormat"
    // InternalLilyChantParser.g:1019:1: entryRuleFormat returns [EObject current=null] : iv_ruleFormat= ruleFormat EOF ;
    public final EObject entryRuleFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormat = null;


        try {
            // InternalLilyChantParser.g:1019:47: (iv_ruleFormat= ruleFormat EOF )
            // InternalLilyChantParser.g:1020:2: iv_ruleFormat= ruleFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFormat=ruleFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormat; 
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
    // $ANTLR end "entryRuleFormat"


    // $ANTLR start "ruleFormat"
    // InternalLilyChantParser.g:1026:1: ruleFormat returns [EObject current=null] : (otherlv_0= Format this_BEGIN_1= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) ) ) )* ) ) ) this_END_5= RULE_END ) ;
    public final EObject ruleFormat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token lv_raggedbottom_3_0=null;
        Token lv_raggedlastbottom_4_0=null;
        Token this_END_5=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:1032:2: ( (otherlv_0= Format this_BEGIN_1= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) ) ) )* ) ) ) this_END_5= RULE_END ) )
            // InternalLilyChantParser.g:1033:2: (otherlv_0= Format this_BEGIN_1= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) ) ) )* ) ) ) this_END_5= RULE_END )
            {
            // InternalLilyChantParser.g:1033:2: (otherlv_0= Format this_BEGIN_1= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) ) ) )* ) ) ) this_END_5= RULE_END )
            // InternalLilyChantParser.g:1034:3: otherlv_0= Format this_BEGIN_1= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) ) ) )* ) ) ) this_END_5= RULE_END
            {
            otherlv_0=(Token)match(input,Format,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFormatAccess().getFormatKeyword_0());
              		
            }
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_1, grammarAccess.getFormatAccess().getBEGINTerminalRuleCall_1());
              		
            }
            // InternalLilyChantParser.g:1042:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) ) ) )* ) ) )
            // InternalLilyChantParser.g:1043:4: ( ( ( ({...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) ) ) )* ) )
            {
            // InternalLilyChantParser.g:1043:4: ( ( ( ({...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) ) ) )* ) )
            // InternalLilyChantParser.g:1044:5: ( ( ({...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getFormatAccess().getUnorderedGroup_2());
            // InternalLilyChantParser.g:1047:5: ( ( ({...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) ) ) )* )
            // InternalLilyChantParser.g:1048:6: ( ({...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) ) ) )*
            {
            // InternalLilyChantParser.g:1048:6: ( ({...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) ) ) )*
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( LA21_0 == RaggedBottom && getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 == RaggedLastBottom && getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 1) ) {
                    alt21=2;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLilyChantParser.g:1049:4: ({...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) ) )
            	    {
            	    // InternalLilyChantParser.g:1049:4: ({...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) ) )
            	    // InternalLilyChantParser.g:1050:5: {...}? => ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalLilyChantParser.g:1050:103: ( ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) ) )
            	    // InternalLilyChantParser.g:1051:6: ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 0);
            	    // InternalLilyChantParser.g:1054:9: ({...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) ) )
            	    // InternalLilyChantParser.g:1054:10: {...}? => ( (lv_raggedbottom_3_0= RaggedBottom ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFormat", "true");
            	    }
            	    // InternalLilyChantParser.g:1054:19: ( (lv_raggedbottom_3_0= RaggedBottom ) )
            	    // InternalLilyChantParser.g:1054:20: (lv_raggedbottom_3_0= RaggedBottom )
            	    {
            	    // InternalLilyChantParser.g:1054:20: (lv_raggedbottom_3_0= RaggedBottom )
            	    // InternalLilyChantParser.g:1055:10: lv_raggedbottom_3_0= RaggedBottom
            	    {
            	    lv_raggedbottom_3_0=(Token)match(input,RaggedBottom,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_raggedbottom_3_0, grammarAccess.getFormatAccess().getRaggedbottomRaggedBottomKeyword_2_0_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getFormatRule());
            	      										}
            	      										setWithLastConsumed(current, "raggedbottom", lv_raggedbottom_3_0 != null, "ragged-bottom");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormatAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLilyChantParser.g:1072:4: ({...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) ) )
            	    {
            	    // InternalLilyChantParser.g:1072:4: ({...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) ) )
            	    // InternalLilyChantParser.g:1073:5: {...}? => ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalLilyChantParser.g:1073:103: ( ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) ) )
            	    // InternalLilyChantParser.g:1074:6: ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getFormatAccess().getUnorderedGroup_2(), 1);
            	    // InternalLilyChantParser.g:1077:9: ({...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) ) )
            	    // InternalLilyChantParser.g:1077:10: {...}? => ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFormat", "true");
            	    }
            	    // InternalLilyChantParser.g:1077:19: ( (lv_raggedlastbottom_4_0= RaggedLastBottom ) )
            	    // InternalLilyChantParser.g:1077:20: (lv_raggedlastbottom_4_0= RaggedLastBottom )
            	    {
            	    // InternalLilyChantParser.g:1077:20: (lv_raggedlastbottom_4_0= RaggedLastBottom )
            	    // InternalLilyChantParser.g:1078:10: lv_raggedlastbottom_4_0= RaggedLastBottom
            	    {
            	    lv_raggedlastbottom_4_0=(Token)match(input,RaggedLastBottom,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_raggedlastbottom_4_0, grammarAccess.getFormatAccess().getRaggedlastbottomRaggedLastBottomKeyword_2_1_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getFormatRule());
            	      										}
            	      										setWithLastConsumed(current, "raggedlastbottom", lv_raggedlastbottom_4_0 != null, "ragged-last-bottom");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormatAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getFormatAccess().getUnorderedGroup_2());

            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_5, grammarAccess.getFormatAccess().getENDTerminalRuleCall_3());
              		
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
    // $ANTLR end "ruleFormat"


    // $ANTLR start "ruleBarline"
    // InternalLilyChantParser.g:1110:1: ruleBarline returns [Enumerator current=null] : ( (enumLiteral_0= VerticalLine ) | (enumLiteral_1= VerticalLineVerticalLine ) ) ;
    public final Enumerator ruleBarline() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLilyChantParser.g:1116:2: ( ( (enumLiteral_0= VerticalLine ) | (enumLiteral_1= VerticalLineVerticalLine ) ) )
            // InternalLilyChantParser.g:1117:2: ( (enumLiteral_0= VerticalLine ) | (enumLiteral_1= VerticalLineVerticalLine ) )
            {
            // InternalLilyChantParser.g:1117:2: ( (enumLiteral_0= VerticalLine ) | (enumLiteral_1= VerticalLineVerticalLine ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==VerticalLine) ) {
                alt22=1;
            }
            else if ( (LA22_0==VerticalLineVerticalLine) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalLilyChantParser.g:1118:3: (enumLiteral_0= VerticalLine )
                    {
                    // InternalLilyChantParser.g:1118:3: (enumLiteral_0= VerticalLine )
                    // InternalLilyChantParser.g:1119:4: enumLiteral_0= VerticalLine
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
                    // InternalLilyChantParser.g:1126:3: (enumLiteral_1= VerticalLineVerticalLine )
                    {
                    // InternalLilyChantParser.g:1126:3: (enumLiteral_1= VerticalLineVerticalLine )
                    // InternalLilyChantParser.g:1127:4: enumLiteral_1= VerticalLineVerticalLine
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
        // InternalLilyChantParser.g:602:7: ( ( ( ruleHyphenRule ) ) )
        // InternalLilyChantParser.g:602:8: ( ( ruleHyphenRule ) )
        {
        // InternalLilyChantParser.g:602:8: ( ( ruleHyphenRule ) )
        // InternalLilyChantParser.g:603:8: ( ruleHyphenRule )
        {
        // InternalLilyChantParser.g:603:8: ( ruleHyphenRule )
        // InternalLilyChantParser.g:604:9: ruleHyphenRule
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


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\2\1\13\12\uffff";
    static final String dfa_3s = "\2\14\1\uffff\1\25\1\0\7\uffff";
    static final String dfa_4s = "\2\30\1\uffff\1\25\1\0\7\uffff";
    static final String dfa_5s = "\2\uffff\1\2\2\uffff\7\1";
    static final String dfa_6s = "\1\uffff\1\1\2\uffff\1\0\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\2\uffff\1\2\1\uffff\3\2\2\uffff\1\2",
            "\1\10\1\5\1\7\2\uffff\1\3\1\uffff\1\11\1\6\1\4\2\uffff\1\12",
            "",
            "\1\4",
            "\1\uffff",
            "",
            "",
            "",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "601:6: ( ( ( ( ruleHyphenRule ) ) )=> ( (lv_syllables_1_0= ruleHyphenRule ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalLilyChantParser()) ) {s = 11;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_1==Asterisk) ) {s = 3;}

                        else if ( (LA12_1==RULE_ID) ) {s = 4;}

                        else if ( (LA12_1==KW___) && (synpred1_InternalLilyChantParser())) {s = 5;}

                        else if ( (LA12_1==VerticalLine) && (synpred1_InternalLilyChantParser())) {s = 6;}

                        else if ( (LA12_1==VerticalLineVerticalLine) && (synpred1_InternalLilyChantParser())) {s = 7;}

                        else if ( (LA12_1==HyphenMinusHyphenMinus) && (synpred1_InternalLilyChantParser())) {s = 8;}

                        else if ( (LA12_1==KW__) && (synpred1_InternalLilyChantParser())) {s = 9;}

                        else if ( (LA12_1==RULE_START_NOTE_GROUP) && (synpred1_InternalLilyChantParser())) {s = 10;}

                        else if ( (LA12_1==EOF) && (synpred1_InternalLilyChantParser())) {s = 11;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000A42L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000012A9000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000092A9000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000013AD000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000223002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000263000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000223000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002223000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000030L});

}
