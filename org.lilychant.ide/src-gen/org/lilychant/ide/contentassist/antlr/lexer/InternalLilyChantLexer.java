package org.lilychant.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLilyChantLexer extends Lexer {
    public static final int RULE_DURATION=11;
    public static final int RULE_ID=10;
    public static final int In=9;
    public static final int RULE_BEGIN=16;
    public static final int Phrase=4;
    public static final int Voices=5;
    public static final int Chant=6;
    public static final int RULE_SL_COMMENT=19;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_HYPHEN=12;
    public static final int Voice=7;
    public static final int RULE_END=17;
    public static final int RULE_END_NOTE_GROUP=15;
    public static final int Tone=8;
    public static final int RULE_EXTENDER=13;
    public static final int RULE_WS=20;
    public static final int RULE_START_NOTE_GROUP=14;

    // delegates
    // delegators

    public InternalLilyChantLexer() {;} 
    public InternalLilyChantLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLilyChantLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLilyChantLexer.g"; }

    // $ANTLR start "Phrase"
    public final void mPhrase() throws RecognitionException {
        try {
            int _type = Phrase;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:14:8: ( 'Phrase' )
            // InternalLilyChantLexer.g:14:10: 'Phrase'
            {
            match("Phrase"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Phrase"

    // $ANTLR start "Voices"
    public final void mVoices() throws RecognitionException {
        try {
            int _type = Voices;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:16:8: ( 'Voices' )
            // InternalLilyChantLexer.g:16:10: 'Voices'
            {
            match("Voices"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Voices"

    // $ANTLR start "Chant"
    public final void mChant() throws RecognitionException {
        try {
            int _type = Chant;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:18:7: ( 'Chant' )
            // InternalLilyChantLexer.g:18:9: 'Chant'
            {
            match("Chant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Chant"

    // $ANTLR start "Voice"
    public final void mVoice() throws RecognitionException {
        try {
            int _type = Voice;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:20:7: ( 'Voice' )
            // InternalLilyChantLexer.g:20:9: 'Voice'
            {
            match("Voice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Voice"

    // $ANTLR start "Tone"
    public final void mTone() throws RecognitionException {
        try {
            int _type = Tone;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:22:6: ( 'Tone' )
            // InternalLilyChantLexer.g:22:8: 'Tone'
            {
            match("Tone"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tone"

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:24:4: ( 'in' )
            // InternalLilyChantLexer.g:24:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:28:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | ',' | ';' | '.' | ':' )* )
            // InternalLilyChantLexer.g:28:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | ',' | ';' | '.' | ':' )*
            {
            // InternalLilyChantLexer.g:28:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalLilyChantLexer.g:28:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // InternalLilyChantLexer.g:28:16: ( 'a' .. 'z' | 'A' .. 'Z' | ',' | ';' | '.' | ':' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==','||LA2_0=='.'||(LA2_0>=':' && LA2_0<=';')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLilyChantLexer.g:
            	    {
            	    if ( input.LA(1)==','||input.LA(1)=='.'||(input.LA(1)>=':' && input.LA(1)<=';')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_DURATION"
    public final void mRULE_DURATION() throws RecognitionException {
        try {
            int _type = RULE_DURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:30:15: ( ( '1' | '2' | '4' | '8' | '16' | '\\breve' )+ )
            // InternalLilyChantLexer.g:30:17: ( '1' | '2' | '4' | '8' | '16' | '\\breve' )+
            {
            // InternalLilyChantLexer.g:30:17: ( '1' | '2' | '4' | '8' | '16' | '\\breve' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=7;
                switch ( input.LA(1) ) {
                case '1':
                    {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2=='6') ) {
                        alt3=5;
                    }

                    else {
                        alt3=1;
                    }

                    }
                    break;
                case '2':
                    {
                    alt3=2;
                    }
                    break;
                case '4':
                    {
                    alt3=3;
                    }
                    break;
                case '8':
                    {
                    alt3=4;
                    }
                    break;
                case '\b':
                    {
                    alt3=6;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalLilyChantLexer.g:30:18: '1'
            	    {
            	    match('1'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalLilyChantLexer.g:30:22: '2'
            	    {
            	    match('2'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalLilyChantLexer.g:30:26: '4'
            	    {
            	    match('4'); 

            	    }
            	    break;
            	case 4 :
            	    // InternalLilyChantLexer.g:30:30: '8'
            	    {
            	    match('8'); 

            	    }
            	    break;
            	case 5 :
            	    // InternalLilyChantLexer.g:30:34: '16'
            	    {
            	    match("16"); 


            	    }
            	    break;
            	case 6 :
            	    // InternalLilyChantLexer.g:30:39: '\\breve'
            	    {
            	    match("\breve"); 


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DURATION"

    // $ANTLR start "RULE_HYPHEN"
    public final void mRULE_HYPHEN() throws RecognitionException {
        try {
            int _type = RULE_HYPHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:32:13: ( '--' )
            // InternalLilyChantLexer.g:32:15: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HYPHEN"

    // $ANTLR start "RULE_EXTENDER"
    public final void mRULE_EXTENDER() throws RecognitionException {
        try {
            int _type = RULE_EXTENDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:34:15: ( '__' )
            // InternalLilyChantLexer.g:34:17: '__'
            {
            match("__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTENDER"

    // $ANTLR start "RULE_START_NOTE_GROUP"
    public final void mRULE_START_NOTE_GROUP() throws RecognitionException {
        try {
            int _type = RULE_START_NOTE_GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:36:23: ( '<' )
            // InternalLilyChantLexer.g:36:25: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_START_NOTE_GROUP"

    // $ANTLR start "RULE_END_NOTE_GROUP"
    public final void mRULE_END_NOTE_GROUP() throws RecognitionException {
        try {
            int _type = RULE_END_NOTE_GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:38:21: ( '>' )
            // InternalLilyChantLexer.g:38:23: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END_NOTE_GROUP"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalLilyChantLexer.g:40:21: ()
            // InternalLilyChantLexer.g:40:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalLilyChantLexer.g:42:19: ()
            // InternalLilyChantLexer.g:42:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:44:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLilyChantLexer.g:44:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLilyChantLexer.g:44:24: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLilyChantLexer.g:44:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:46:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLilyChantLexer.g:46:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLilyChantLexer.g:46:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLilyChantLexer.g:46:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalLilyChantLexer.g:46:40: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLilyChantLexer.g:46:41: ( '\\r' )? '\\n'
                    {
                    // InternalLilyChantLexer.g:46:41: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalLilyChantLexer.g:46:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:48:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLilyChantLexer.g:48:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLilyChantLexer.g:48:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLilyChantLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalLilyChantLexer.g:1:8: ( Phrase | Voices | Chant | Voice | Tone | In | RULE_ID | RULE_DURATION | RULE_HYPHEN | RULE_EXTENDER | RULE_START_NOTE_GROUP | RULE_END_NOTE_GROUP | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt9=15;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // InternalLilyChantLexer.g:1:10: Phrase
                {
                mPhrase(); 

                }
                break;
            case 2 :
                // InternalLilyChantLexer.g:1:17: Voices
                {
                mVoices(); 

                }
                break;
            case 3 :
                // InternalLilyChantLexer.g:1:24: Chant
                {
                mChant(); 

                }
                break;
            case 4 :
                // InternalLilyChantLexer.g:1:30: Voice
                {
                mVoice(); 

                }
                break;
            case 5 :
                // InternalLilyChantLexer.g:1:36: Tone
                {
                mTone(); 

                }
                break;
            case 6 :
                // InternalLilyChantLexer.g:1:41: In
                {
                mIn(); 

                }
                break;
            case 7 :
                // InternalLilyChantLexer.g:1:44: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 8 :
                // InternalLilyChantLexer.g:1:52: RULE_DURATION
                {
                mRULE_DURATION(); 

                }
                break;
            case 9 :
                // InternalLilyChantLexer.g:1:66: RULE_HYPHEN
                {
                mRULE_HYPHEN(); 

                }
                break;
            case 10 :
                // InternalLilyChantLexer.g:1:78: RULE_EXTENDER
                {
                mRULE_EXTENDER(); 

                }
                break;
            case 11 :
                // InternalLilyChantLexer.g:1:92: RULE_START_NOTE_GROUP
                {
                mRULE_START_NOTE_GROUP(); 

                }
                break;
            case 12 :
                // InternalLilyChantLexer.g:1:114: RULE_END_NOTE_GROUP
                {
                mRULE_END_NOTE_GROUP(); 

                }
                break;
            case 13 :
                // InternalLilyChantLexer.g:1:134: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // InternalLilyChantLexer.g:1:150: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // InternalLilyChantLexer.g:1:166: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\6\6\10\uffff\4\6\1\31\2\uffff\4\6\1\uffff\3\6\1\41\1\6\1\44\1\45\1\uffff\1\46\1\47\4\uffff";
    static final String DFA9_eofS =
        "\50\uffff";
    static final String DFA9_minS =
        "\1\10\1\150\1\157\1\150\1\157\1\156\6\uffff\1\52\1\uffff\1\162\1\151\1\141\1\156\1\54\2\uffff\1\141\1\143\1\156\1\145\1\uffff\1\163\1\145\1\164\1\54\1\145\2\54\1\uffff\2\54\4\uffff";
    static final String DFA9_maxS =
        "\1\151\1\150\1\157\1\150\1\157\1\156\6\uffff\1\57\1\uffff\1\162\1\151\1\141\1\156\1\172\2\uffff\1\141\1\143\1\156\1\145\1\uffff\1\163\1\145\1\164\1\172\1\145\2\172\1\uffff\2\172\4\uffff";
    static final String DFA9_acceptS =
        "\6\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\uffff\1\17\5\uffff\1\15\1\16\4\uffff\1\6\7\uffff\1\5\2\uffff\1\4\1\3\1\1\1\2";
    static final String DFA9_specialS =
        "\50\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\7\2\15\2\uffff\1\15\22\uffff\1\15\14\uffff\1\10\1\uffff\1\14\1\uffff\2\7\1\uffff\1\7\3\uffff\1\7\3\uffff\1\12\1\uffff\1\13\4\uffff\1\3\14\uffff\1\1\3\uffff\1\4\1\uffff\1\2\10\uffff\1\11\11\uffff\1\5",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\23\4\uffff\1\24",
            "",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\6\1\uffff\1\6\13\uffff\2\6\5\uffff\32\6\6\uffff\32\6",
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\6\1\uffff\1\6\13\uffff\2\6\5\uffff\32\6\6\uffff\32\6",
            "\1\42",
            "\1\6\1\uffff\1\6\13\uffff\2\6\5\uffff\32\6\6\uffff\22\6\1\43\7\6",
            "\1\6\1\uffff\1\6\13\uffff\2\6\5\uffff\32\6\6\uffff\32\6",
            "",
            "\1\6\1\uffff\1\6\13\uffff\2\6\5\uffff\32\6\6\uffff\32\6",
            "\1\6\1\uffff\1\6\13\uffff\2\6\5\uffff\32\6\6\uffff\32\6",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Phrase | Voices | Chant | Voice | Tone | In | RULE_ID | RULE_DURATION | RULE_HYPHEN | RULE_EXTENDER | RULE_START_NOTE_GROUP | RULE_END_NOTE_GROUP | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}