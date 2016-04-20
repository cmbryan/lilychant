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
    public static final int RULE_DURATION=13;
    public static final int RULE_ID=11;
    public static final int Key=9;
    public static final int VerticalLineVerticalLine=10;
    public static final int RULE_BEGIN=18;
    public static final int RULE_ANY_OTHER=23;
    public static final int Phrase=4;
    public static final int Voices=5;
    public static final int Chant=6;
    public static final int RULE_SL_COMMENT=21;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=20;
    public static final int RULE_STRING=12;
    public static final int RULE_HYPHEN=14;
    public static final int Voice=7;
    public static final int RULE_END=19;
    public static final int RULE_END_NOTE_GROUP=17;
    public static final int Tone=8;
    public static final int RULE_EXTENDER=15;
    public static final int RULE_WS=22;
    public static final int RULE_START_NOTE_GROUP=16;

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

    // $ANTLR start "Key"
    public final void mKey() throws RecognitionException {
        try {
            int _type = Key;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:24:5: ( 'key' )
            // InternalLilyChantLexer.g:24:7: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Key"

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:26:26: ( '||' )
            // InternalLilyChantLexer.g:26:28: '||'
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:30:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0400' .. '\\u04FF' | ',' | '\\'' | ';' | '.' | ':' )* )
            // InternalLilyChantLexer.g:30:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0400' .. '\\u04FF' | ',' | '\\'' | ';' | '.' | ':' )*
            {
            // InternalLilyChantLexer.g:30:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalLilyChantLexer.g:30:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // InternalLilyChantLexer.g:30:16: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0400' .. '\\u04FF' | ',' | '\\'' | ';' | '.' | ':' )*
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
            // InternalLilyChantLexer.g:32:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLilyChantLexer.g:32:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLilyChantLexer.g:32:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalLilyChantLexer.g:32:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLilyChantLexer.g:32:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalLilyChantLexer.g:32:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLilyChantLexer.g:32:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalLilyChantLexer.g:32:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLilyChantLexer.g:32:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalLilyChantLexer.g:32:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLilyChantLexer.g:32:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalLilyChantLexer.g:34:15: ( ( '1' | '2' | '4' | '8' | '16' | '\\breve' )+ )
            // InternalLilyChantLexer.g:34:17: ( '1' | '2' | '4' | '8' | '16' | '\\breve' )+
            {
            // InternalLilyChantLexer.g:34:17: ( '1' | '2' | '4' | '8' | '16' | '\\breve' )+
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
            	    // InternalLilyChantLexer.g:34:18: '1'
            	    {
            	    match('1'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalLilyChantLexer.g:34:22: '2'
            	    {
            	    match('2'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalLilyChantLexer.g:34:26: '4'
            	    {
            	    match('4'); 

            	    }
            	    break;
            	case 4 :
            	    // InternalLilyChantLexer.g:34:30: '8'
            	    {
            	    match('8'); 

            	    }
            	    break;
            	case 5 :
            	    // InternalLilyChantLexer.g:34:34: '16'
            	    {
            	    match("16"); 


            	    }
            	    break;
            	case 6 :
            	    // InternalLilyChantLexer.g:34:39: '\\breve'
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

    // $ANTLR start "RULE_HYPHEN"
    public final void mRULE_HYPHEN() throws RecognitionException {
        try {
            int _type = RULE_HYPHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLilyChantLexer.g:36:13: ( '--' )
            // InternalLilyChantLexer.g:36:15: '--'
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
            // InternalLilyChantLexer.g:38:15: ( '__' )
            // InternalLilyChantLexer.g:38:17: '__'
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
            // InternalLilyChantLexer.g:40:23: ( '<' )
            // InternalLilyChantLexer.g:40:25: '<'
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
            // InternalLilyChantLexer.g:42:21: ( '>' )
            // InternalLilyChantLexer.g:42:23: '>'
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
            // InternalLilyChantLexer.g:44:21: ()
            // InternalLilyChantLexer.g:44:23: 
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
            // InternalLilyChantLexer.g:46:19: ()
            // InternalLilyChantLexer.g:46:21: 
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
            // InternalLilyChantLexer.g:48:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLilyChantLexer.g:48:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLilyChantLexer.g:48:24: ( options {greedy=false; } : . )*
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
            	    // InternalLilyChantLexer.g:48:52: .
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
            // InternalLilyChantLexer.g:50:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLilyChantLexer.g:50:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLilyChantLexer.g:50:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLilyChantLexer.g:50:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalLilyChantLexer.g:50:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLilyChantLexer.g:50:41: ( '\\r' )? '\\n'
                    {
                    // InternalLilyChantLexer.g:50:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalLilyChantLexer.g:50:41: '\\r'
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
            // InternalLilyChantLexer.g:52:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLilyChantLexer.g:52:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLilyChantLexer.g:52:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalLilyChantLexer.g:54:16: ( . )
            // InternalLilyChantLexer.g:54:18: .
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
        // InternalLilyChantLexer.g:1:8: ( Phrase | Voices | Chant | Voice | Tone | Key | VerticalLineVerticalLine | RULE_ID | RULE_STRING | RULE_DURATION | RULE_HYPHEN | RULE_EXTENDER | RULE_START_NOTE_GROUP | RULE_END_NOTE_GROUP | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=18;
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
                // InternalLilyChantLexer.g:1:41: Key
                {
                mKey(); 

                }
                break;
            case 7 :
                // InternalLilyChantLexer.g:1:45: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 8 :
                // InternalLilyChantLexer.g:1:70: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 9 :
                // InternalLilyChantLexer.g:1:78: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 10 :
                // InternalLilyChantLexer.g:1:90: RULE_DURATION
                {
                mRULE_DURATION(); 

                }
                break;
            case 11 :
                // InternalLilyChantLexer.g:1:104: RULE_HYPHEN
                {
                mRULE_HYPHEN(); 

                }
                break;
            case 12 :
                // InternalLilyChantLexer.g:1:116: RULE_EXTENDER
                {
                mRULE_EXTENDER(); 

                }
                break;
            case 13 :
                // InternalLilyChantLexer.g:1:130: RULE_START_NOTE_GROUP
                {
                mRULE_START_NOTE_GROUP(); 

                }
                break;
            case 14 :
                // InternalLilyChantLexer.g:1:152: RULE_END_NOTE_GROUP
                {
                mRULE_END_NOTE_GROUP(); 

                }
                break;
            case 15 :
                // InternalLilyChantLexer.g:1:172: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // InternalLilyChantLexer.g:1:188: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // InternalLilyChantLexer.g:1:204: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalLilyChantLexer.g:1:212: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\6\11\1\27\1\uffff\1\11\1\uffff\1\27\5\uffff\3\27\2\uffff\1\27\2\uffff\5\11\2\uffff\1\11\11\uffff\4\11\1\62\3\11\1\66\1\uffff\1\11\1\71\1\72\1\uffff\1\73\1\74\4\uffff";
    static final String DFA12_eofS =
        "\75\uffff";
    static final String DFA12_minS =
        "\1\0\1\150\1\157\1\150\1\157\1\145\1\174\1\uffff\1\0\1\uffff\1\0\5\uffff\1\162\1\55\1\137\2\uffff\1\52\2\uffff\1\162\1\151\1\141\1\156\1\171\2\uffff\1\0\11\uffff\1\141\1\143\1\156\1\145\1\47\1\163\1\145\1\164\1\47\1\uffff\1\145\2\47\1\uffff\2\47\4\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\150\1\157\1\150\1\157\1\145\1\174\1\uffff\1\uffff\1\uffff\1\uffff\5\uffff\1\162\1\55\1\137\2\uffff\1\57\2\uffff\1\162\1\151\1\141\1\156\1\171\2\uffff\1\uffff\11\uffff\1\141\1\143\1\156\1\145\1\u04ff\1\163\1\145\1\164\1\u04ff\1\uffff\1\145\2\u04ff\1\uffff\2\u04ff\4\uffff";
    static final String DFA12_acceptS =
        "\7\uffff\1\10\1\uffff\1\10\1\uffff\1\10\4\12\3\uffff\1\15\1\16\1\uffff\1\21\1\22\5\uffff\1\7\1\11\1\uffff\1\10\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\11\uffff\1\6\3\uffff\1\5\2\uffff\1\4\1\3\1\1\1\2";
    static final String DFA12_specialS =
        "\1\3\7\uffff\1\2\1\uffff\1\0\24\uffff\1\1\35\uffff}>";
    static final String[] DFA12_transitionS = {
            "\10\27\1\20\2\26\2\27\1\26\22\27\1\26\1\27\1\12\4\27\1\10\4\27\1\13\1\21\1\13\1\25\1\27\1\14\1\15\1\27\1\16\3\27\1\17\1\27\2\13\1\23\1\27\1\24\2\27\2\13\1\3\14\13\1\1\3\13\1\4\1\13\1\2\4\13\3\27\1\7\1\22\1\27\12\13\1\5\17\13\1\27\1\6\u0383\27\u0100\13\ufb00\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "",
            "\47\36\1\40\4\36\1\37\1\36\1\37\13\36\2\37\5\36\32\37\6\36\32\37\u0385\36\u0100\37\ufb00\36",
            "",
            "\0\36",
            "",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "",
            "",
            "\1\46\4\uffff\1\47",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "",
            "\47\36\1\40\4\36\1\37\1\36\1\37\13\36\2\37\5\36\32\37\6\36\32\37\u0385\36\u0100\37\ufb00\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\11\4\uffff\1\11\1\uffff\1\11\13\uffff\2\11\5\uffff\32\11\6\uffff\32\11\u0385\uffff\u0100\11",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\11\4\uffff\1\11\1\uffff\1\11\13\uffff\2\11\5\uffff\32\11\6\uffff\32\11\u0385\uffff\u0100\11",
            "",
            "\1\67",
            "\1\11\4\uffff\1\11\1\uffff\1\11\13\uffff\2\11\5\uffff\32\11\6\uffff\22\11\1\70\7\11\u0385\uffff\u0100\11",
            "\1\11\4\uffff\1\11\1\uffff\1\11\13\uffff\2\11\5\uffff\32\11\6\uffff\32\11\u0385\uffff\u0100\11",
            "",
            "\1\11\4\uffff\1\11\1\uffff\1\11\13\uffff\2\11\5\uffff\32\11\6\uffff\32\11\u0385\uffff\u0100\11",
            "\1\11\4\uffff\1\11\1\uffff\1\11\13\uffff\2\11\5\uffff\32\11\6\uffff\32\11\u0385\uffff\u0100\11",
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
            return "1:1: Tokens : ( Phrase | Voices | Chant | Voice | Tone | Key | VerticalLineVerticalLine | RULE_ID | RULE_STRING | RULE_DURATION | RULE_HYPHEN | RULE_EXTENDER | RULE_START_NOTE_GROUP | RULE_END_NOTE_GROUP | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_10 = input.LA(1);

                        s = -1;
                        if ( ((LA12_10>='\u0000' && LA12_10<='\uFFFF')) ) {s = 30;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( (LA12_31=='\'') ) {s = 32;}

                        else if ( (LA12_31==','||LA12_31=='.'||(LA12_31>=':' && LA12_31<=';')||(LA12_31>='A' && LA12_31<='Z')||(LA12_31>='a' && LA12_31<='z')||(LA12_31>='\u0400' && LA12_31<='\u04FF')) ) {s = 31;}

                        else if ( ((LA12_31>='\u0000' && LA12_31<='&')||(LA12_31>='(' && LA12_31<='+')||LA12_31=='-'||(LA12_31>='/' && LA12_31<='9')||(LA12_31>='<' && LA12_31<='@')||(LA12_31>='[' && LA12_31<='`')||(LA12_31>='{' && LA12_31<='\u03FF')||(LA12_31>='\u0500' && LA12_31<='\uFFFF')) ) {s = 30;}

                        else s = 9;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_8 = input.LA(1);

                        s = -1;
                        if ( ((LA12_8>='\u0000' && LA12_8<='&')||(LA12_8>='(' && LA12_8<='+')||LA12_8=='-'||(LA12_8>='/' && LA12_8<='9')||(LA12_8>='<' && LA12_8<='@')||(LA12_8>='[' && LA12_8<='`')||(LA12_8>='{' && LA12_8<='\u03FF')||(LA12_8>='\u0500' && LA12_8<='\uFFFF')) ) {s = 30;}

                        else if ( (LA12_8==','||LA12_8=='.'||(LA12_8>=':' && LA12_8<=';')||(LA12_8>='A' && LA12_8<='Z')||(LA12_8>='a' && LA12_8<='z')||(LA12_8>='\u0400' && LA12_8<='\u04FF')) ) {s = 31;}

                        else if ( (LA12_8=='\'') ) {s = 32;}

                        else s = 9;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='P') ) {s = 1;}

                        else if ( (LA12_0=='V') ) {s = 2;}

                        else if ( (LA12_0=='C') ) {s = 3;}

                        else if ( (LA12_0=='T') ) {s = 4;}

                        else if ( (LA12_0=='k') ) {s = 5;}

                        else if ( (LA12_0=='|') ) {s = 6;}

                        else if ( (LA12_0=='^') ) {s = 7;}

                        else if ( (LA12_0=='\'') ) {s = 8;}

                        else if ( (LA12_0=='\"') ) {s = 10;}

                        else if ( (LA12_0==','||LA12_0=='.'||(LA12_0>=':' && LA12_0<=';')||(LA12_0>='A' && LA12_0<='B')||(LA12_0>='D' && LA12_0<='O')||(LA12_0>='Q' && LA12_0<='S')||LA12_0=='U'||(LA12_0>='W' && LA12_0<='Z')||(LA12_0>='a' && LA12_0<='j')||(LA12_0>='l' && LA12_0<='z')||(LA12_0>='\u0400' && LA12_0<='\u04FF')) ) {s = 11;}

                        else if ( (LA12_0=='1') ) {s = 12;}

                        else if ( (LA12_0=='2') ) {s = 13;}

                        else if ( (LA12_0=='4') ) {s = 14;}

                        else if ( (LA12_0=='8') ) {s = 15;}

                        else if ( (LA12_0=='\b') ) {s = 16;}

                        else if ( (LA12_0=='-') ) {s = 17;}

                        else if ( (LA12_0=='_') ) {s = 18;}

                        else if ( (LA12_0=='<') ) {s = 19;}

                        else if ( (LA12_0=='>') ) {s = 20;}

                        else if ( (LA12_0=='/') ) {s = 21;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 22;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\u0007')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0=='0'||LA12_0=='3'||(LA12_0>='5' && LA12_0<='7')||LA12_0=='9'||LA12_0=='='||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\u03FF')||(LA12_0>='\u0500' && LA12_0<='\uFFFF')) ) {s = 23;}

                        else s = 9;

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