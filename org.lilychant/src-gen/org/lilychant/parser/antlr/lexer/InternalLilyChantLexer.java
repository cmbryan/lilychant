package org.lilychant.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLilyChantLexer extends Lexer {
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

    // $ANTLR start "HyphenMinusHyphenMinus"
    public final void mHyphenMinusHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinusHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:24:24: ( '--' )
            // InternalLilyChantLexer.g:24:26: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusHyphenMinus"

    // $ANTLR start "KW___"
    public final void mKW___() throws RecognitionException {
        try {
            int _type = KW___;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:26:7: ( '__' )
            // InternalLilyChantLexer.g:26:9: '__'
            {
            match("__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW___"

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:28:26: ( '||' )
            // InternalLilyChantLexer.g:28:28: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLineVerticalLine"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:30:17: ( '(' )
            // InternalLilyChantLexer.g:30:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:32:18: ( ')' )
            // InternalLilyChantLexer.g:32:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:34:10: ( '*' )
            // InternalLilyChantLexer.g:34:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:36:9: ( '/' )
            // InternalLilyChantLexer.g:36:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "KW__"
    public final void mKW__() throws RecognitionException {
        try {
            int _type = KW__;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:38:6: ( '_' )
            // InternalLilyChantLexer.g:38:8: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW__"

    // $ANTLR start "VerticalLine"
    public final void mVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:40:14: ( '|' )
            // InternalLilyChantLexer.g:40:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLine"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:42:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0400' .. '\\u04FF' | ',' | '\\'' | ';' | ':' | '.' )* )
            // InternalLilyChantLexer.g:42:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0400' .. '\\u04FF' | ',' | '\\'' | ';' | ':' | '.' )*
            {
            // InternalLilyChantLexer.g:42:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalLilyChantLexer.g:42:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // InternalLilyChantLexer.g:42:16: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0400' .. '\\u04FF' | ',' | '\\'' | ';' | ':' | '.' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\''||LA2_0==','||LA2_0=='.'||(LA2_0>=':' && LA2_0<=';')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u0400' && LA2_0<='\u04FF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLilyChantLexer.g:
            	    {
            	    if ( input.LA(1)=='\''||input.LA(1)==','||input.LA(1)=='.'||(input.LA(1)>=':' && input.LA(1)<=';')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u0400' && input.LA(1)<='\u04FF') ) {
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:44:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLilyChantLexer.g:44:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLilyChantLexer.g:44:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLilyChantLexer.g:44:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLilyChantLexer.g:44:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalLilyChantLexer.g:44:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLilyChantLexer.g:44:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalLilyChantLexer.g:44:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLilyChantLexer.g:44:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalLilyChantLexer.g:44:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLilyChantLexer.g:44:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_DURATION"
    public final void mRULE_DURATION() throws RecognitionException {
        try {
            int _type = RULE_DURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:46:15: ( ( '1' | '2' | '4' | '8' | '16' | '\\breve' )+ )
            // InternalLilyChantLexer.g:46:17: ( '1' | '2' | '4' | '8' | '16' | '\\breve' )+
            {
            // InternalLilyChantLexer.g:46:17: ( '1' | '2' | '4' | '8' | '16' | '\\breve' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=7;
                switch ( input.LA(1) ) {
                case '1':
                    {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2=='6') ) {
                        alt6=5;
                    }

                    else {
                        alt6=1;
                    }

                    }
                    break;
                case '2':
                    {
                    alt6=2;
                    }
                    break;
                case '4':
                    {
                    alt6=3;
                    }
                    break;
                case '8':
                    {
                    alt6=4;
                    }
                    break;
                case '\b':
                    {
                    alt6=6;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalLilyChantLexer.g:46:18: '1'
            	    {
            	    match('1'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalLilyChantLexer.g:46:22: '2'
            	    {
            	    match('2'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalLilyChantLexer.g:46:26: '4'
            	    {
            	    match('4'); 

            	    }
            	    break;
            	case 4 :
            	    // InternalLilyChantLexer.g:46:30: '8'
            	    {
            	    match('8'); 

            	    }
            	    break;
            	case 5 :
            	    // InternalLilyChantLexer.g:46:34: '16'
            	    {
            	    match("16"); 


            	    }
            	    break;
            	case 6 :
            	    // InternalLilyChantLexer.g:46:39: '\\breve'
            	    {
            	    match("\breve"); 


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DURATION"

    // $ANTLR start "RULE_START_NOTE_GROUP"
    public final void mRULE_START_NOTE_GROUP() throws RecognitionException {
        try {
            int _type = RULE_START_NOTE_GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:48:23: ( '<' )
            // InternalLilyChantLexer.g:48:25: '<'
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
            // InternalLilyChantLexer.g:50:21: ( '>' )
            // InternalLilyChantLexer.g:50:23: '>'
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
            // InternalLilyChantLexer.g:52:21: ()
            // InternalLilyChantLexer.g:52:23: 
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
            // InternalLilyChantLexer.g:54:19: ()
            // InternalLilyChantLexer.g:54:21: 
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
            // InternalLilyChantLexer.g:56:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLilyChantLexer.g:56:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLilyChantLexer.g:56:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLilyChantLexer.g:56:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalLilyChantLexer.g:58:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLilyChantLexer.g:58:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLilyChantLexer.g:58:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLilyChantLexer.g:58:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalLilyChantLexer.g:58:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLilyChantLexer.g:58:41: ( '\\r' )? '\\n'
                    {
                    // InternalLilyChantLexer.g:58:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalLilyChantLexer.g:58:41: '\\r'
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
            // InternalLilyChantLexer.g:60:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLilyChantLexer.g:60:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLilyChantLexer.g:60:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:62:16: ( . )
            // InternalLilyChantLexer.g:62:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalLilyChantLexer.g:1:8: ( Phrase | Voices | Chant | Voice | Tone | HyphenMinusHyphenMinus | KW___ | VerticalLineVerticalLine | LeftParenthesis | RightParenthesis | Asterisk | Solidus | KW__ | VerticalLine | RULE_ID | RULE_STRING | RULE_DURATION | RULE_START_NOTE_GROUP | RULE_END_NOTE_GROUP | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=23;
        alt12 = dfa12.predict(input);
        switch (alt12) {
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
                // InternalLilyChantLexer.g:1:41: HyphenMinusHyphenMinus
                {
                mHyphenMinusHyphenMinus(); 

                }
                break;
            case 7 :
                // InternalLilyChantLexer.g:1:64: KW___
                {
                mKW___(); 

                }
                break;
            case 8 :
                // InternalLilyChantLexer.g:1:70: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 9 :
                // InternalLilyChantLexer.g:1:95: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 10 :
                // InternalLilyChantLexer.g:1:111: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 11 :
                // InternalLilyChantLexer.g:1:128: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 12 :
                // InternalLilyChantLexer.g:1:137: Solidus
                {
                mSolidus(); 

                }
                break;
            case 13 :
                // InternalLilyChantLexer.g:1:145: KW__
                {
                mKW__(); 

                }
                break;
            case 14 :
                // InternalLilyChantLexer.g:1:150: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 15 :
                // InternalLilyChantLexer.g:1:163: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // InternalLilyChantLexer.g:1:171: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // InternalLilyChantLexer.g:1:183: RULE_DURATION
                {
                mRULE_DURATION(); 

                }
                break;
            case 18 :
                // InternalLilyChantLexer.g:1:197: RULE_START_NOTE_GROUP
                {
                mRULE_START_NOTE_GROUP(); 

                }
                break;
            case 19 :
                // InternalLilyChantLexer.g:1:219: RULE_END_NOTE_GROUP
                {
                mRULE_END_NOTE_GROUP(); 

                }
                break;
            case 20 :
                // InternalLilyChantLexer.g:1:239: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // InternalLilyChantLexer.g:1:255: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // InternalLilyChantLexer.g:1:271: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // InternalLilyChantLexer.g:1:279: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\5\16\1\31\1\40\1\42\3\uffff\1\50\1\uffff\1\16\1\uffff\1\31\5\uffff\1\31\4\uffff\4\16\14\uffff\1\16\5\uffff\7\16\1\73\1\16\1\76\1\77\1\uffff\1\100\1\101\4\uffff";
    static final String DFA12_eofS =
        "\102\uffff";
    static final String DFA12_minS =
        "\1\0\1\150\1\157\1\150\1\157\1\55\1\137\1\174\3\uffff\1\52\1\uffff\1\0\1\uffff\1\0\5\uffff\1\162\4\uffff\1\162\1\151\1\141\1\156\14\uffff\1\0\5\uffff\1\141\1\143\1\156\1\145\1\163\1\145\1\164\1\47\1\145\2\47\1\uffff\2\47\4\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\150\1\157\1\150\1\157\1\55\1\137\1\174\3\uffff\1\57\1\uffff\1\uffff\1\uffff\1\uffff\5\uffff\1\162\4\uffff\1\162\1\151\1\141\1\156\14\uffff\1\uffff\5\uffff\1\141\1\143\1\156\1\145\1\163\1\145\1\164\1\u04ff\1\145\2\u04ff\1\uffff\2\u04ff\4\uffff";
    static final String DFA12_acceptS =
        "\10\uffff\1\11\1\12\1\13\1\uffff\1\17\1\uffff\1\17\1\uffff\1\17\4\21\1\uffff\1\22\1\23\1\26\1\27\4\uffff\1\6\1\7\1\15\1\10\1\16\1\11\1\12\1\13\1\24\1\25\1\14\1\20\1\uffff\1\17\1\21\1\22\1\23\1\26\13\uffff\1\5\2\uffff\1\4\1\3\1\1\1\2";
    static final String DFA12_specialS =
        "\1\0\14\uffff\1\2\1\uffff\1\1\32\uffff\1\3\27\uffff}>";
    static final String[] DFA12_transitionS = {
            "\10\31\1\25\2\30\2\31\1\30\22\31\1\30\1\31\1\17\4\31\1\15\1\10\1\11\1\12\1\31\1\20\1\5\1\20\1\13\1\31\1\21\1\22\1\31\1\23\3\31\1\24\1\31\2\20\1\26\1\31\1\27\2\31\2\20\1\3\14\20\1\1\3\20\1\4\1\20\1\2\4\20\3\31\1\14\1\6\1\31\32\20\1\31\1\7\u0383\31\u0100\20\ufb00\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\41",
            "",
            "",
            "",
            "\1\46\4\uffff\1\47",
            "",
            "\47\51\1\53\4\51\1\52\1\51\1\52\13\51\2\52\5\51\32\52\6\51\32\52\u0385\51\u0100\52\ufb00\51",
            "",
            "\0\51",
            "",
            "",
            "",
            "",
            "",
            "\1\54",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\51\1\53\4\51\1\52\1\51\1\52\13\51\2\52\5\51\32\52\6\51\32\52\u0385\51\u0100\52\ufb00\51",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\16\4\uffff\1\16\1\uffff\1\16\13\uffff\2\16\5\uffff\32\16\6\uffff\32\16\u0385\uffff\u0100\16",
            "\1\74",
            "\1\16\4\uffff\1\16\1\uffff\1\16\13\uffff\2\16\5\uffff\32\16\6\uffff\22\16\1\75\7\16\u0385\uffff\u0100\16",
            "\1\16\4\uffff\1\16\1\uffff\1\16\13\uffff\2\16\5\uffff\32\16\6\uffff\32\16\u0385\uffff\u0100\16",
            "",
            "\1\16\4\uffff\1\16\1\uffff\1\16\13\uffff\2\16\5\uffff\32\16\6\uffff\32\16\u0385\uffff\u0100\16",
            "\1\16\4\uffff\1\16\1\uffff\1\16\13\uffff\2\16\5\uffff\32\16\6\uffff\32\16\u0385\uffff\u0100\16",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Phrase | Voices | Chant | Voice | Tone | HyphenMinusHyphenMinus | KW___ | VerticalLineVerticalLine | LeftParenthesis | RightParenthesis | Asterisk | Solidus | KW__ | VerticalLine | RULE_ID | RULE_STRING | RULE_DURATION | RULE_START_NOTE_GROUP | RULE_END_NOTE_GROUP | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='P') ) {s = 1;}

                        else if ( (LA12_0=='V') ) {s = 2;}

                        else if ( (LA12_0=='C') ) {s = 3;}

                        else if ( (LA12_0=='T') ) {s = 4;}

                        else if ( (LA12_0=='-') ) {s = 5;}

                        else if ( (LA12_0=='_') ) {s = 6;}

                        else if ( (LA12_0=='|') ) {s = 7;}

                        else if ( (LA12_0=='(') ) {s = 8;}

                        else if ( (LA12_0==')') ) {s = 9;}

                        else if ( (LA12_0=='*') ) {s = 10;}

                        else if ( (LA12_0=='/') ) {s = 11;}

                        else if ( (LA12_0=='^') ) {s = 12;}

                        else if ( (LA12_0=='\'') ) {s = 13;}

                        else if ( (LA12_0=='\"') ) {s = 15;}

                        else if ( (LA12_0==','||LA12_0=='.'||(LA12_0>=':' && LA12_0<=';')||(LA12_0>='A' && LA12_0<='B')||(LA12_0>='D' && LA12_0<='O')||(LA12_0>='Q' && LA12_0<='S')||LA12_0=='U'||(LA12_0>='W' && LA12_0<='Z')||(LA12_0>='a' && LA12_0<='z')||(LA12_0>='\u0400' && LA12_0<='\u04FF')) ) {s = 16;}

                        else if ( (LA12_0=='1') ) {s = 17;}

                        else if ( (LA12_0=='2') ) {s = 18;}

                        else if ( (LA12_0=='4') ) {s = 19;}

                        else if ( (LA12_0=='8') ) {s = 20;}

                        else if ( (LA12_0=='\b') ) {s = 21;}

                        else if ( (LA12_0=='<') ) {s = 22;}

                        else if ( (LA12_0=='>') ) {s = 23;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 24;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\u0007')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='+'||LA12_0=='0'||LA12_0=='3'||(LA12_0>='5' && LA12_0<='7')||LA12_0=='9'||LA12_0=='='||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\u03FF')||(LA12_0>='\u0500' && LA12_0<='\uFFFF')) ) {s = 25;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_15 = input.LA(1);

                        s = -1;
                        if ( ((LA12_15>='\u0000' && LA12_15<='\uFFFF')) ) {s = 41;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_13 = input.LA(1);

                        s = -1;
                        if ( ((LA12_13>='\u0000' && LA12_13<='&')||(LA12_13>='(' && LA12_13<='+')||LA12_13=='-'||(LA12_13>='/' && LA12_13<='9')||(LA12_13>='<' && LA12_13<='@')||(LA12_13>='[' && LA12_13<='`')||(LA12_13>='{' && LA12_13<='\u03FF')||(LA12_13>='\u0500' && LA12_13<='\uFFFF')) ) {s = 41;}

                        else if ( (LA12_13==','||LA12_13=='.'||(LA12_13>=':' && LA12_13<=';')||(LA12_13>='A' && LA12_13<='Z')||(LA12_13>='a' && LA12_13<='z')||(LA12_13>='\u0400' && LA12_13<='\u04FF')) ) {s = 42;}

                        else if ( (LA12_13=='\'') ) {s = 43;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_42 = input.LA(1);

                        s = -1;
                        if ( (LA12_42=='\'') ) {s = 43;}

                        else if ( ((LA12_42>='\u0000' && LA12_42<='&')||(LA12_42>='(' && LA12_42<='+')||LA12_42=='-'||(LA12_42>='/' && LA12_42<='9')||(LA12_42>='<' && LA12_42<='@')||(LA12_42>='[' && LA12_42<='`')||(LA12_42>='{' && LA12_42<='\u03FF')||(LA12_42>='\u0500' && LA12_42<='\uFFFF')) ) {s = 41;}

                        else if ( (LA12_42==','||LA12_42=='.'||(LA12_42>=':' && LA12_42<=';')||(LA12_42>='A' && LA12_42<='Z')||(LA12_42>='a' && LA12_42<='z')||(LA12_42>='\u0400' && LA12_42<='\u04FF')) ) {s = 42;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}