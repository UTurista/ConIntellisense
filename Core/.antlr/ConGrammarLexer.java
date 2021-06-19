// Generated from d:\Projects\ProjectReality\ConIntellisense\Core\ConGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NEWLINE=2, VAR=3, CONST=4, LINECOMMENT=5, BLOCKCOMMENT=6, WHILE=7, 
		ENDWHILE=8, IF=9, ELSE=10, ELSEIF=11, ENDIF=12, EQUAL=13, NOTEQUAL=14, 
		LESS=15, LESSEQUAL=16, GREATER=17, GREATEREQUAL=18, ASSIGN=19, INITIALIZER=20, 
		INCLUDE=21, RUN=22, RETURN=23, IDENTIFIER=24, STRING=25, NUMBER=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "NEWLINE", "VAR", "CONST", "LINECOMMENT", "BLOCKCOMMENT", "WHILE", 
			"ENDWHILE", "IF", "ELSE", "ELSEIF", "ENDIF", "EQUAL", "NOTEQUAL", "LESS", 
			"LESSEQUAL", "GREATER", "GREATEREQUAL", "ASSIGN", "INITIALIZER", "INCLUDE", 
			"RUN", "RETURN", "IDENTIFIER", "STRING", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", null, "'var'", "'const'", null, null, "'while'", "'endWhile'", 
			"'if'", "'else'", "'elseIf'", "'endIf'", null, null, null, null, null, 
			null, "'->'", "'='", "'include'", "'run'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NEWLINE", "VAR", "CONST", "LINECOMMENT", "BLOCKCOMMENT", 
			"WHILE", "ENDWHILE", "IF", "ELSE", "ELSEIF", "ENDIF", "EQUAL", "NOTEQUAL", 
			"LESS", "LESSEQUAL", "GREATER", "GREATEREQUAL", "ASSIGN", "INITIALIZER", 
			"INCLUDE", "RUN", "RETURN", "IDENTIFIER", "STRING", "NUMBER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ConGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ConGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0124\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\6\3=\n\3\r\3\16\3>\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6P\n\6\f\6"+
		"\16\6S\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7_\n\7\f\7\16\7"+
		"b\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0097\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00a4\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00af\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c2\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d0\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00e6\n\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\6\31\u0101\n\31\r\31\16\31\u0102\3\32\3\32\7\32\u0107"+
		"\n\32\f\32\16\32\u010a\13\32\3\32\3\32\3\33\5\33\u010f\n\33\3\33\6\33"+
		"\u0112\n\33\r\33\16\33\u0113\3\33\3\33\6\33\u0118\n\33\r\33\16\33\u0119"+
		"\5\33\u011c\n\33\3\34\6\34\u011f\n\34\r\34\16\34\u0120\3\34\3\34\3`\2"+
		"\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2"+
		"\7\5\2\f\f\17\17\u202a\u202b\7\2\60<C\\^^aac|\b\2\"\"\60<C\\^^aac|\3\2"+
		"\62;\5\2\13\13\17\17\"\"\2\u0133\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\39\3\2\2\2\5<\3\2\2\2\7@\3\2\2\2\tD\3\2\2\2\13J\3\2\2"+
		"\2\rT\3\2\2\2\17j\3\2\2\2\21p\3\2\2\2\23y\3\2\2\2\25|\3\2\2\2\27\u0081"+
		"\3\2\2\2\31\u0088\3\2\2\2\33\u0096\3\2\2\2\35\u00a3\3\2\2\2\37\u00ae\3"+
		"\2\2\2!\u00c1\3\2\2\2#\u00cf\3\2\2\2%\u00e5\3\2\2\2\'\u00e7\3\2\2\2)\u00ea"+
		"\3\2\2\2+\u00ec\3\2\2\2-\u00f4\3\2\2\2/\u00f8\3\2\2\2\61\u0100\3\2\2\2"+
		"\63\u0104\3\2\2\2\65\u010e\3\2\2\2\67\u011e\3\2\2\29:\7\61\2\2:\4\3\2"+
		"\2\2;=\t\2\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\6\3\2\2\2@A\7"+
		"x\2\2AB\7c\2\2BC\7t\2\2C\b\3\2\2\2DE\7e\2\2EF\7q\2\2FG\7p\2\2GH\7u\2\2"+
		"HI\7v\2\2I\n\3\2\2\2JK\7t\2\2KL\7g\2\2LM\7o\2\2MQ\3\2\2\2NP\n\2\2\2ON"+
		"\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\f\3\2\2\2SQ\3\2\2\2TU\7d\2\2U"+
		"V\7g\2\2VW\7i\2\2WX\7k\2\2XY\7p\2\2YZ\7T\2\2Z[\7g\2\2[\\\7o\2\2\\`\3\2"+
		"\2\2]_\13\2\2\2^]\3\2\2\2_b\3\2\2\2`a\3\2\2\2`^\3\2\2\2ac\3\2\2\2b`\3"+
		"\2\2\2cd\7g\2\2de\7p\2\2ef\7f\2\2fg\7T\2\2gh\7g\2\2hi\7o\2\2i\16\3\2\2"+
		"\2jk\7y\2\2kl\7j\2\2lm\7k\2\2mn\7n\2\2no\7g\2\2o\20\3\2\2\2pq\7g\2\2q"+
		"r\7p\2\2rs\7f\2\2st\7Y\2\2tu\7j\2\2uv\7k\2\2vw\7n\2\2wx\7g\2\2x\22\3\2"+
		"\2\2yz\7k\2\2z{\7h\2\2{\24\3\2\2\2|}\7g\2\2}~\7n\2\2~\177\7u\2\2\177\u0080"+
		"\7g\2\2\u0080\26\3\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084"+
		"\7u\2\2\u0084\u0085\7g\2\2\u0085\u0086\7K\2\2\u0086\u0087\7h\2\2\u0087"+
		"\30\3\2\2\2\u0088\u0089\7g\2\2\u0089\u008a\7p\2\2\u008a\u008b\7f\2\2\u008b"+
		"\u008c\7K\2\2\u008c\u008d\7h\2\2\u008d\32\3\2\2\2\u008e\u008f\7?\2\2\u008f"+
		"\u0097\7?\2\2\u0090\u0091\7g\2\2\u0091\u0092\7s\2\2\u0092\u0093\7w\2\2"+
		"\u0093\u0094\7c\2\2\u0094\u0095\7n\2\2\u0095\u0097\7u\2\2\u0096\u008e"+
		"\3\2\2\2\u0096\u0090\3\2\2\2\u0097\34\3\2\2\2\u0098\u0099\7#\2\2\u0099"+
		"\u00a4\7?\2\2\u009a\u009b\7p\2\2\u009b\u009c\7q\2\2\u009c\u009d\7v\2\2"+
		"\u009d\u009e\7G\2\2\u009e\u009f\7s\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1"+
		"\7c\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a4\7u\2\2\u00a3\u0098\3\2\2\2\u00a3"+
		"\u009a\3\2\2\2\u00a4\36\3\2\2\2\u00a5\u00af\7>\2\2\u00a6\u00a7\7n\2\2"+
		"\u00a7\u00a8\7g\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab"+
		"\7V\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad\7c\2\2\u00ad\u00af\7p\2\2\u00ae"+
		"\u00a5\3\2\2\2\u00ae\u00a6\3\2\2\2\u00af \3\2\2\2\u00b0\u00b1\7>\2\2\u00b1"+
		"\u00c2\7?\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7u\2\2"+
		"\u00b5\u00b6\7u\2\2\u00b6\u00b7\7Q\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9"+
		"\7G\2\2\u00b9\u00ba\7s\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7c\2\2\u00bc"+
		"\u00bd\7n\2\2\u00bd\u00be\7V\2\2\u00be\u00bf\7j\2\2\u00bf\u00c0\7c\2\2"+
		"\u00c0\u00c2\7p\2\2\u00c1\u00b0\3\2\2\2\u00c1\u00b2\3\2\2\2\u00c2\"\3"+
		"\2\2\2\u00c3\u00d0\7@\2\2\u00c4\u00c5\7i\2\2\u00c5\u00c6\7t\2\2\u00c6"+
		"\u00c7\7g\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7g\2\2"+
		"\u00ca\u00cb\7t\2\2\u00cb\u00cc\7V\2\2\u00cc\u00cd\7j\2\2\u00cd\u00ce"+
		"\7c\2\2\u00ce\u00d0\7p\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c4\3\2\2\2\u00d0"+
		"$\3\2\2\2\u00d1\u00d2\7@\2\2\u00d2\u00e6\7?\2\2\u00d3\u00d4\7i\2\2\u00d4"+
		"\u00d5\7t\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7v\2\2"+
		"\u00d8\u00d9\7g\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7Q\2\2\u00db\u00dc"+
		"\7t\2\2\u00dc\u00dd\7G\2\2\u00dd\u00de\7s\2\2\u00de\u00df\7w\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7V\2\2\u00e2\u00e3\7j\2\2"+
		"\u00e3\u00e4\7c\2\2\u00e4\u00e6\7p\2\2\u00e5\u00d1\3\2\2\2\u00e5\u00d3"+
		"\3\2\2\2\u00e6&\3\2\2\2\u00e7\u00e8\7/\2\2\u00e8\u00e9\7@\2\2\u00e9(\3"+
		"\2\2\2\u00ea\u00eb\7?\2\2\u00eb*\3\2\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee"+
		"\7p\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7w\2\2\u00f1"+
		"\u00f2\7f\2\2\u00f2\u00f3\7g\2\2\u00f3,\3\2\2\2\u00f4\u00f5\7t\2\2\u00f5"+
		"\u00f6\7w\2\2\u00f6\u00f7\7p\2\2\u00f7.\3\2\2\2\u00f8\u00f9\7t\2\2\u00f9"+
		"\u00fa\7g\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7t\2\2"+
		"\u00fd\u00fe\7p\2\2\u00fe\60\3\2\2\2\u00ff\u0101\t\3\2\2\u0100\u00ff\3"+
		"\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\62\3\2\2\2\u0104\u0108\7$\2\2\u0105\u0107\t\4\2\2\u0106\u0105\3\2\2\2"+
		"\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7$\2\2\u010c\64\3\2\2\2\u010d"+
		"\u010f\7/\2\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2"+
		"\2\2\u0110\u0112\t\5\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u011b\3\2\2\2\u0115\u0117\7\60"+
		"\2\2\u0116\u0118\t\5\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0115\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\66\3\2\2\2\u011d\u011f\t\6\2\2\u011e\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\b\34\2\2\u01238\3\2\2\2\23\2>Q`\u0096\u00a3"+
		"\u00ae\u00c1\u00cf\u00e5\u0102\u0108\u010e\u0113\u0119\u011b\u0120\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}