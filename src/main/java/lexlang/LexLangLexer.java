// Generated from LexLang.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, WS=11, COMMENT=12, LINE_COMMENT=13, IF=14, ELSE=15, ITERATE=16, 
		READ=17, PRINT=18, RETURN=19, DATA=20, INT=21, CHAR=22, BOOL=23, FLOAT=24, 
		NULL=25, TRUE=26, FALSE=27, ID=28, INT_NUM=29, FLOAT_NUM=30, CHAR_VAL=31, 
		SET=32, EQUALS=33, NOTEQ=34, NOT=35, PLUS=36, MINUS=37, MULTIPLY=38, DIVIDE=39, 
		MOD=40, LESS_THAN=41, BIGGER_THAN=42, AND=43, DOT=44, COMMA=45, ERROR_CHAR=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "DIGIT", "CHAR_TYPES", "WS", "COMMENT", "LINE_COMMENT", "IF", 
			"ELSE", "ITERATE", "READ", "PRINT", "RETURN", "DATA", "INT", "CHAR", 
			"BOOL", "FLOAT", "NULL", "TRUE", "FALSE", "ID", "INT_NUM", "FLOAT_NUM", 
			"CHAR_VAL", "SET", "EQUALS", "NOTEQ", "NOT", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "MOD", "LESS_THAN", "BIGGER_THAN", "AND", "DOT", "COMMA", "ERROR_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'::'", "';'", "'('", "')'", "':'", "'['", "']'", 
			"'new'", null, null, null, "'if'", "'else'", "'iterate'", "'read'", "'print'", 
			"'return'", "'data'", "'Int'", "'Char'", "'Bool'", "'Float'", "'null'", 
			"'true'", "'false'", null, null, null, null, "'='", "'=='", "'!='", "'!'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'&&'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "WS", 
			"COMMENT", "LINE_COMMENT", "IF", "ELSE", "ITERATE", "READ", "PRINT", 
			"RETURN", "DATA", "INT", "CHAR", "BOOL", "FLOAT", "NULL", "TRUE", "FALSE", 
			"ID", "INT_NUM", "FLOAT_NUM", "CHAR_VAL", "SET", "EQUALS", "NOTEQ", "NOT", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "LESS_THAN", "BIGGER_THAN", 
			"AND", "DOT", "COMMA", "ERROR_CHAR"
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


	public LexLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u013a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0086\n\r\3\16\6\16"+
		"\u0089\n\16\r\16\16\16\u008a\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0093"+
		"\n\17\f\17\16\17\u0096\13\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\7\20\u00a1\n\20\f\20\16\20\u00a4\13\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\7\37\u00f7\n\37\f\37\16\37\u00fa\13\37\3"+
		" \3 \3 \7 \u00ff\n \f \16 \u0102\13 \5 \u0104\n \3!\3!\3!\7!\u0109\n!"+
		"\f!\16!\u010c\13!\5!\u010e\n!\3!\3!\6!\u0112\n!\r!\16!\u0113\3\"\3\"\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\u0094\2\62\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\2\33\r\35\16\37\17!\20#\21"+
		"%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!"+
		"E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60\3\2\t\3\2\62;\3\2^^\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17\4\2C\\c|\5\2\62;C\\c|\3\2\63;\2\u0144\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7g\3\2\2\2\t"+
		"j\3\2\2\2\13l\3\2\2\2\rn\3\2\2\2\17p\3\2\2\2\21r\3\2\2\2\23t\3\2\2\2\25"+
		"v\3\2\2\2\27z\3\2\2\2\31\u0085\3\2\2\2\33\u0088\3\2\2\2\35\u008e\3\2\2"+
		"\2\37\u009c\3\2\2\2!\u00a9\3\2\2\2#\u00ac\3\2\2\2%\u00b1\3\2\2\2\'\u00b9"+
		"\3\2\2\2)\u00be\3\2\2\2+\u00c4\3\2\2\2-\u00cb\3\2\2\2/\u00d0\3\2\2\2\61"+
		"\u00d4\3\2\2\2\63\u00d9\3\2\2\2\65\u00de\3\2\2\2\67\u00e4\3\2\2\29\u00e9"+
		"\3\2\2\2;\u00ee\3\2\2\2=\u00f4\3\2\2\2?\u0103\3\2\2\2A\u010d\3\2\2\2C"+
		"\u0115\3\2\2\2E\u0119\3\2\2\2G\u011b\3\2\2\2I\u011e\3\2\2\2K\u0121\3\2"+
		"\2\2M\u0123\3\2\2\2O\u0125\3\2\2\2Q\u0127\3\2\2\2S\u0129\3\2\2\2U\u012b"+
		"\3\2\2\2W\u012d\3\2\2\2Y\u012f\3\2\2\2[\u0131\3\2\2\2]\u0134\3\2\2\2_"+
		"\u0136\3\2\2\2a\u0138\3\2\2\2cd\7}\2\2d\4\3\2\2\2ef\7\177\2\2f\6\3\2\2"+
		"\2gh\7<\2\2hi\7<\2\2i\b\3\2\2\2jk\7=\2\2k\n\3\2\2\2lm\7*\2\2m\f\3\2\2"+
		"\2no\7+\2\2o\16\3\2\2\2pq\7<\2\2q\20\3\2\2\2rs\7]\2\2s\22\3\2\2\2tu\7"+
		"_\2\2u\24\3\2\2\2vw\7p\2\2wx\7g\2\2xy\7y\2\2y\26\3\2\2\2z{\t\2\2\2{\30"+
		"\3\2\2\2|\u0086\n\3\2\2}~\7^\2\2~\u0086\7p\2\2\177\u0080\7^\2\2\u0080"+
		"\u0086\7v\2\2\u0081\u0082\7^\2\2\u0082\u0086\7^\2\2\u0083\u0084\7^\2\2"+
		"\u0084\u0086\7)\2\2\u0085|\3\2\2\2\u0085}\3\2\2\2\u0085\177\3\2\2\2\u0085"+
		"\u0081\3\2\2\2\u0085\u0083\3\2\2\2\u0086\32\3\2\2\2\u0087\u0089\t\4\2"+
		"\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\16\2\2\u008d\34\3\2\2\2\u008e"+
		"\u008f\7}\2\2\u008f\u0090\7/\2\2\u0090\u0094\3\2\2\2\u0091\u0093\13\2"+
		"\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0095\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7/"+
		"\2\2\u0098\u0099\7\177\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\17\2\2\u009b"+
		"\36\3\2\2\2\u009c\u009d\7/\2\2\u009d\u009e\7/\2\2\u009e\u00a2\3\2\2\2"+
		"\u009f\u00a1\n\5\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\t\5\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\20\2\2\u00a8 \3\2\2\2"+
		"\u00a9\u00aa\7k\2\2\u00aa\u00ab\7h\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7g"+
		"\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7g\2\2\u00b0$\3"+
		"\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"\u00b5\7t\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7g\2\2"+
		"\u00b8&\3\2\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7c\2"+
		"\2\u00bc\u00bd\7f\2\2\u00bd(\3\2\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7"+
		"t\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3*"+
		"\3\2\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7v\2\2\u00c7"+
		"\u00c8\7w\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7p\2\2\u00ca,\3\2\2\2\u00cb"+
		"\u00cc\7f\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7c\2\2"+
		"\u00cf.\3\2\2\2\u00d0\u00d1\7K\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7v\2"+
		"\2\u00d3\60\3\2\2\2\u00d4\u00d5\7E\2\2\u00d5\u00d6\7j\2\2\u00d6\u00d7"+
		"\7c\2\2\u00d7\u00d8\7t\2\2\u00d8\62\3\2\2\2\u00d9\u00da\7D\2\2\u00da\u00db"+
		"\7q\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7n\2\2\u00dd\64\3\2\2\2\u00de\u00df"+
		"\7H\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7c\2\2\u00e2"+
		"\u00e3\7v\2\2\u00e3\66\3\2\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7w\2\2\u00e6"+
		"\u00e7\7n\2\2\u00e7\u00e8\7n\2\2\u00e88\3\2\2\2\u00e9\u00ea\7v\2\2\u00ea"+
		"\u00eb\7t\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7g\2\2\u00ed:\3\2\2\2\u00ee"+
		"\u00ef\7h\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7u\2\2"+
		"\u00f2\u00f3\7g\2\2\u00f3<\3\2\2\2\u00f4\u00f8\t\6\2\2\u00f5\u00f7\t\7"+
		"\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9>\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u0104\7\62\2\2"+
		"\u00fc\u0100\t\b\2\2\u00fd\u00ff\t\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u00fb\3\2\2\2\u0103\u00fc\3\2\2\2\u0104@\3\2\2\2"+
		"\u0105\u010e\7\62\2\2\u0106\u010a\t\b\2\2\u0107\u0109\t\2\2\2\u0108\u0107"+
		"\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u0106\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0111\7\60\2\2\u0110\u0112\5\27\f\2\u0111"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114B\3\2\2\2\u0115\u0116\7)\2\2\u0116\u0117\5\31\r\2\u0117\u0118"+
		"\7)\2\2\u0118D\3\2\2\2\u0119\u011a\7?\2\2\u011aF\3\2\2\2\u011b\u011c\7"+
		"?\2\2\u011c\u011d\7?\2\2\u011dH\3\2\2\2\u011e\u011f\7#\2\2\u011f\u0120"+
		"\7?\2\2\u0120J\3\2\2\2\u0121\u0122\7#\2\2\u0122L\3\2\2\2\u0123\u0124\7"+
		"-\2\2\u0124N\3\2\2\2\u0125\u0126\7/\2\2\u0126P\3\2\2\2\u0127\u0128\7,"+
		"\2\2\u0128R\3\2\2\2\u0129\u012a\7\61\2\2\u012aT\3\2\2\2\u012b\u012c\7"+
		"\'\2\2\u012cV\3\2\2\2\u012d\u012e\7>\2\2\u012eX\3\2\2\2\u012f\u0130\7"+
		"@\2\2\u0130Z\3\2\2\2\u0131\u0132\7(\2\2\u0132\u0133\7(\2\2\u0133\\\3\2"+
		"\2\2\u0134\u0135\7\60\2\2\u0135^\3\2\2\2\u0136\u0137\7.\2\2\u0137`\3\2"+
		"\2\2\u0138\u0139\13\2\2\2\u0139b\3\2\2\2\r\2\u0085\u008a\u0094\u00a2\u00f8"+
		"\u0100\u0103\u010a\u010d\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}