// Generated from LexLang.g4 by ANTLR 4.8

package lexlang;

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
		MOD=40, LESS_THAN=41, BIGGER_THAN=42, AND=43, DOT=44, COMMA=45;
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
			"DIVIDE", "MOD", "LESS_THAN", "BIGGER_THAN", "AND", "DOT", "COMMA"
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
			"AND", "DOT", "COMMA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0136\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0084\n\r\3\16\6\16\u0087\n\16\r"+
		"\16\16\16\u0088\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0091\n\17\f\17\16"+
		"\17\u0094\13\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u009f"+
		"\n\20\f\20\16\20\u00a2\13\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\7\37\u00f5\n\37\f\37\16\37\u00f8\13\37\3 \3 \3 \7 \u00fd"+
		"\n \f \16 \u0100\13 \5 \u0102\n \3!\3!\3!\7!\u0107\n!\f!\16!\u010a\13"+
		"!\5!\u010c\n!\3!\3!\6!\u0110\n!\r!\16!\u0111\3\"\3\"\3\"\3\"\3#\3#\3$"+
		"\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3.\3/\3/\3\60\3\60\3\u0092\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\2\31\2\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61"+
		"\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]."+
		"_/\3\2\t\3\2\62;\3\2^^\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2C\\c|\5\2\62"+
		";C\\c|\3\2\63;\2\u0140\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2"+
		"\2\5c\3\2\2\2\7e\3\2\2\2\th\3\2\2\2\13j\3\2\2\2\rl\3\2\2\2\17n\3\2\2\2"+
		"\21p\3\2\2\2\23r\3\2\2\2\25t\3\2\2\2\27x\3\2\2\2\31\u0083\3\2\2\2\33\u0086"+
		"\3\2\2\2\35\u008c\3\2\2\2\37\u009a\3\2\2\2!\u00a7\3\2\2\2#\u00aa\3\2\2"+
		"\2%\u00af\3\2\2\2\'\u00b7\3\2\2\2)\u00bc\3\2\2\2+\u00c2\3\2\2\2-\u00c9"+
		"\3\2\2\2/\u00ce\3\2\2\2\61\u00d2\3\2\2\2\63\u00d7\3\2\2\2\65\u00dc\3\2"+
		"\2\2\67\u00e2\3\2\2\29\u00e7\3\2\2\2;\u00ec\3\2\2\2=\u00f2\3\2\2\2?\u0101"+
		"\3\2\2\2A\u010b\3\2\2\2C\u0113\3\2\2\2E\u0117\3\2\2\2G\u0119\3\2\2\2I"+
		"\u011c\3\2\2\2K\u011f\3\2\2\2M\u0121\3\2\2\2O\u0123\3\2\2\2Q\u0125\3\2"+
		"\2\2S\u0127\3\2\2\2U\u0129\3\2\2\2W\u012b\3\2\2\2Y\u012d\3\2\2\2[\u012f"+
		"\3\2\2\2]\u0132\3\2\2\2_\u0134\3\2\2\2ab\7}\2\2b\4\3\2\2\2cd\7\177\2\2"+
		"d\6\3\2\2\2ef\7<\2\2fg\7<\2\2g\b\3\2\2\2hi\7=\2\2i\n\3\2\2\2jk\7*\2\2"+
		"k\f\3\2\2\2lm\7+\2\2m\16\3\2\2\2no\7<\2\2o\20\3\2\2\2pq\7]\2\2q\22\3\2"+
		"\2\2rs\7_\2\2s\24\3\2\2\2tu\7p\2\2uv\7g\2\2vw\7y\2\2w\26\3\2\2\2xy\t\2"+
		"\2\2y\30\3\2\2\2z\u0084\n\3\2\2{|\7^\2\2|\u0084\7p\2\2}~\7^\2\2~\u0084"+
		"\7v\2\2\177\u0080\7^\2\2\u0080\u0084\7^\2\2\u0081\u0082\7^\2\2\u0082\u0084"+
		"\7)\2\2\u0083z\3\2\2\2\u0083{\3\2\2\2\u0083}\3\2\2\2\u0083\177\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0084\32\3\2\2\2\u0085\u0087\t\4\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\b\16\2\2\u008b\34\3\2\2\2\u008c\u008d\7}\2"+
		"\2\u008d\u008e\7/\2\2\u008e\u0092\3\2\2\2\u008f\u0091\13\2\2\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7/\2\2\u0096\u0097\7\177"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\17\2\2\u0099\36\3\2\2\2\u009a\u009b"+
		"\7/\2\2\u009b\u009c\7/\2\2\u009c\u00a0\3\2\2\2\u009d\u009f\n\5\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\t\5\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\b\20\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7k\2\2"+
		"\u00a8\u00a9\7h\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7n"+
		"\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae$\3\2\2\2\u00af\u00b0"+
		"\7k\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7t\2\2\u00b3"+
		"\u00b4\7c\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7g\2\2\u00b6&\3\2\2\2\u00b7"+
		"\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7f\2\2"+
		"\u00bb(\3\2\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7k\2"+
		"\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7v\2\2\u00c1*\3\2\2\2\u00c2\u00c3\7"+
		"t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7"+
		"\7t\2\2\u00c7\u00c8\7p\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7c\2\2\u00cd.\3\2\2\2\u00ce\u00cf"+
		"\7K\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7v\2\2\u00d1\60\3\2\2\2\u00d2\u00d3"+
		"\7E\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7t\2\2\u00d6"+
		"\62\3\2\2\2\u00d7\u00d8\7D\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7q\2\2\u00da"+
		"\u00db\7n\2\2\u00db\64\3\2\2\2\u00dc\u00dd\7H\2\2\u00dd\u00de\7n\2\2\u00de"+
		"\u00df\7q\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7v\2\2\u00e1\66\3\2\2\2\u00e2"+
		"\u00e3\7p\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7n\2\2"+
		"\u00e68\3\2\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7w\2"+
		"\2\u00ea\u00eb\7g\2\2\u00eb:\3\2\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee\7"+
		"c\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7g\2\2\u00f1<"+
		"\3\2\2\2\u00f2\u00f6\t\6\2\2\u00f3\u00f5\t\7\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7>\3\2\2\2"+
		"\u00f8\u00f6\3\2\2\2\u00f9\u0102\7\62\2\2\u00fa\u00fe\t\b\2\2\u00fb\u00fd"+
		"\t\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u00f9\3\2"+
		"\2\2\u0101\u00fa\3\2\2\2\u0102@\3\2\2\2\u0103\u010c\7\62\2\2\u0104\u0108"+
		"\t\b\2\2\u0105\u0107\t\2\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010b\u0103\3\2\2\2\u010b\u0104\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010f\7\60\2\2\u010e\u0110\5\27\f\2\u010f\u010e\3\2\2\2\u0110\u0111\3"+
		"\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112B\3\2\2\2\u0113\u0114"+
		"\7)\2\2\u0114\u0115\5\31\r\2\u0115\u0116\7)\2\2\u0116D\3\2\2\2\u0117\u0118"+
		"\7?\2\2\u0118F\3\2\2\2\u0119\u011a\7?\2\2\u011a\u011b\7?\2\2\u011bH\3"+
		"\2\2\2\u011c\u011d\7#\2\2\u011d\u011e\7?\2\2\u011eJ\3\2\2\2\u011f\u0120"+
		"\7#\2\2\u0120L\3\2\2\2\u0121\u0122\7-\2\2\u0122N\3\2\2\2\u0123\u0124\7"+
		"/\2\2\u0124P\3\2\2\2\u0125\u0126\7,\2\2\u0126R\3\2\2\2\u0127\u0128\7\61"+
		"\2\2\u0128T\3\2\2\2\u0129\u012a\7\'\2\2\u012aV\3\2\2\2\u012b\u012c\7>"+
		"\2\2\u012cX\3\2\2\2\u012d\u012e\7@\2\2\u012eZ\3\2\2\2\u012f\u0130\7(\2"+
		"\2\u0130\u0131\7(\2\2\u0131\\\3\2\2\2\u0132\u0133\7\60\2\2\u0133^\3\2"+
		"\2\2\u0134\u0135\7.\2\2\u0135`\3\2\2\2\r\2\u0083\u0088\u0092\u00a0\u00f6"+
		"\u00fe\u0101\u0108\u010b\u0111\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}