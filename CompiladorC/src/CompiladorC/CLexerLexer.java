// Generated from CLexer.g4 by ANTLR 4.5.3
package CompiladorC;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLexerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, TIPO_ESPECIFICADOR=5, IDENT=6, COMENTARIO=7, 
		RELACIONAL=8, SOMA=9, MULT=10, VIRGULA=11, PONTO_VIRGULA=12, DELIM=13, 
		ABRE_PARENT=14, FECHA_PARENT=15, ABRE_COLCHETE=16, FECHA_COLCHETE=17, 
		ABRE_CHAVE=18, FECHA_CHAVE=19, CIFRAO=20, CIRCUNFLEXO=21, PONTO=22, BARRA=23, 
		VOID=24, INT=25, FLOAT=26, CHAR=27, SINAL_IGUAL=28, LETRA=29, NUM=30, 
		NUM_INT=31, DIGITO=32, LETRA_MAIUSC=33, WS=34, ERRO_IDENT_MAIUSCULO=35, 
		UNTERMINATED_COMMENT=36, ERRO_DUPLO_MULT=37, ERRO_DUPLO_DELIM=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "TIPO_ESPECIFICADOR", "IDENT", "COMENTARIO", 
		"RELACIONAL", "SOMA", "MULT", "VIRGULA", "PONTO_VIRGULA", "DELIM", "ABRE_PARENT", 
		"FECHA_PARENT", "ABRE_COLCHETE", "FECHA_COLCHETE", "ABRE_CHAVE", "FECHA_CHAVE", 
		"CIFRAO", "CIRCUNFLEXO", "PONTO", "BARRA", "VOID", "INT", "FLOAT", "CHAR", 
		"SINAL_IGUAL", "LETRA", "NUM", "NUM_INT", "DIGITO", "LETRA_MAIUSC", "ESC_SEQ", 
		"WS", "ERRO_IDENT_MAIUSCULO", "UNTERMINATED_COMMENT", "ERRO_DUPLO_MULT", 
		"ERRO_DUPLO_DELIM"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'while'", "'return'", null, null, null, null, 
		null, null, "','", "';'", null, "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"'$'", "'^'", "'.'", "'/'", "'void'", "'int'", "'float'", "'char'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "TIPO_ESPECIFICADOR", "IDENT", "COMENTARIO", 
		"RELACIONAL", "SOMA", "MULT", "VIRGULA", "PONTO_VIRGULA", "DELIM", "ABRE_PARENT", 
		"FECHA_PARENT", "ABRE_COLCHETE", "FECHA_COLCHETE", "ABRE_CHAVE", "FECHA_CHAVE", 
		"CIFRAO", "CIRCUNFLEXO", "PONTO", "BARRA", "VOID", "INT", "FLOAT", "CHAR", 
		"SINAL_IGUAL", "LETRA", "NUM", "NUM_INT", "DIGITO", "LETRA_MAIUSC", "WS", 
		"ERRO_IDENT_MAIUSCULO", "UNTERMINATED_COMMENT", "ERRO_DUPLO_MULT", "ERRO_DUPLO_DELIM"
	};
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


	public CLexerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			ERRO_DUPLO_MULT_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			ERRO_DUPLO_DELIM_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}
	private void ERRO_DUPLO_MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			    try {
			        throw new Exception("Erro - expressão inválida");
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			break;
		}
	}
	private void ERRO_DUPLO_DELIM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			     try {
			         throw new Exception("Erro - expressão inválida");
			     } catch (Exception e) {
			         e.printStackTrace();
			     }
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u011f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\7\7p\n\7\f\7\16\7s\13\7\3\b\3\b\3\b\3"+
		"\b\7\by\n\b\f\b\16\b|\13\b\3\b\5\b\177\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\5\16\u009a\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\5\37\u00c9\n\37\3\37\3\37"+
		"\7\37\u00cd\n\37\f\37\16\37\u00d0\13\37\3\37\3\37\6\37\u00d4\n\37\r\37"+
		"\16\37\u00d5\5\37\u00d8\n\37\3\37\3\37\5\37\u00dc\n\37\3\37\6\37\u00df"+
		"\n\37\r\37\16\37\u00e0\5\37\u00e3\n\37\3 \3 \7 \u00e7\n \f \16 \u00ea"+
		"\13 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\7%\u00f9\n%\f%\16%\u00fc"+
		"\13%\3%\7%\u00ff\n%\f%\16%\u0102\13%\7%\u0104\n%\f%\16%\u0107\13%\3&\3"+
		"&\3&\3&\3&\3&\7&\u010f\n&\f&\16&\u0112\13&\3&\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3\u0110\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E\2G$I%K&M\'O(\3\2\t\4\2\f\f\17\17\4\2"+
		"--//\4\2,,\61\61\3\2C\\\5\2\13\f\17\17\"\"\3\2\61\61\3\2,,\u0137\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5T\3\2\2\2\7Y\3\2\2\2\t_\3\2"+
		"\2\2\13j\3\2\2\2\rl\3\2\2\2\17t\3\2\2\2\21\u008d\3\2\2\2\23\u008f\3\2"+
		"\2\2\25\u0091\3\2\2\2\27\u0093\3\2\2\2\31\u0095\3\2\2\2\33\u0099\3\2\2"+
		"\2\35\u009b\3\2\2\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2\2%\u00a3"+
		"\3\2\2\2\'\u00a5\3\2\2\2)\u00a7\3\2\2\2+\u00a9\3\2\2\2-\u00ab\3\2\2\2"+
		"/\u00ad\3\2\2\2\61\u00af\3\2\2\2\63\u00b4\3\2\2\2\65\u00b8\3\2\2\2\67"+
		"\u00be\3\2\2\29\u00c3\3\2\2\2;\u00c5\3\2\2\2=\u00c8\3\2\2\2?\u00e4\3\2"+
		"\2\2A\u00eb\3\2\2\2C\u00ed\3\2\2\2E\u00ef\3\2\2\2G\u00f2\3\2\2\2I\u00f5"+
		"\3\2\2\2K\u0108\3\2\2\2M\u0117\3\2\2\2O\u011b\3\2\2\2QR\7k\2\2RS\7h\2"+
		"\2S\4\3\2\2\2TU\7g\2\2UV\7n\2\2VW\7u\2\2WX\7g\2\2X\6\3\2\2\2YZ\7y\2\2"+
		"Z[\7j\2\2[\\\7k\2\2\\]\7n\2\2]^\7g\2\2^\b\3\2\2\2_`\7t\2\2`a\7g\2\2ab"+
		"\7v\2\2bc\7w\2\2cd\7t\2\2de\7p\2\2e\n\3\2\2\2fk\5\63\32\2gk\5\65\33\2"+
		"hk\5\67\34\2ik\5\61\31\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\f\3"+
		"\2\2\2lq\5;\36\2mp\5;\36\2np\5A!\2om\3\2\2\2on\3\2\2\2ps\3\2\2\2qo\3\2"+
		"\2\2qr\3\2\2\2r\16\3\2\2\2sq\3\2\2\2tu\7\61\2\2uv\7,\2\2vz\3\2\2\2wy\n"+
		"\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}\177"+
		"\7\17\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\f\2\2"+
		"\u0081\u0082\b\b\2\2\u0082\20\3\2\2\2\u0083\u008e\7@\2\2\u0084\u0085\7"+
		"@\2\2\u0085\u008e\7?\2\2\u0086\u008e\7>\2\2\u0087\u0088\7>\2\2\u0088\u008e"+
		"\7?\2\2\u0089\u008a\7#\2\2\u008a\u008e\7?\2\2\u008b\u008c\7?\2\2\u008c"+
		"\u008e\7?\2\2\u008d\u0083\3\2\2\2\u008d\u0084\3\2\2\2\u008d\u0086\3\2"+
		"\2\2\u008d\u0087\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\22\3\2\2\2\u008f\u0090\t\3\2\2\u0090\24\3\2\2\2\u0091\u0092\t\4\2\2\u0092"+
		"\26\3\2\2\2\u0093\u0094\7.\2\2\u0094\30\3\2\2\2\u0095\u0096\7=\2\2\u0096"+
		"\32\3\2\2\2\u0097\u009a\7=\2\2\u0098\u009a\5\27\f\2\u0099\u0097\3\2\2"+
		"\2\u0099\u0098\3\2\2\2\u009a\34\3\2\2\2\u009b\u009c\7*\2\2\u009c\36\3"+
		"\2\2\2\u009d\u009e\7+\2\2\u009e \3\2\2\2\u009f\u00a0\7]\2\2\u00a0\"\3"+
		"\2\2\2\u00a1\u00a2\7_\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7}\2\2\u00a4&\3\2"+
		"\2\2\u00a5\u00a6\7\177\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7&\2\2\u00a8*\3"+
		"\2\2\2\u00a9\u00aa\7`\2\2\u00aa,\3\2\2\2\u00ab\u00ac\7\60\2\2\u00ac.\3"+
		"\2\2\2\u00ad\u00ae\7\61\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7x\2\2\u00b0"+
		"\u00b1\7q\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7f\2\2\u00b3\62\3\2\2\2\u00b4"+
		"\u00b5\7k\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7v\2\2\u00b7\64\3\2\2\2\u00b8"+
		"\u00b9\7h\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7c\2\2"+
		"\u00bc\u00bd\7v\2\2\u00bd\66\3\2\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7"+
		"j\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7t\2\2\u00c28\3\2\2\2\u00c3\u00c4"+
		"\7?\2\2\u00c4:\3\2\2\2\u00c5\u00c6\4c|\2\u00c6<\3\2\2\2\u00c7\u00c9\t"+
		"\3\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00ce\5A!\2\u00cb\u00cd\5A!\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d7\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d1\u00d3\5-\27\2\u00d2\u00d4\5A!\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00e2\3\2\2\2\u00d9"+
		"\u00db\7G\2\2\u00da\u00dc\t\3\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00de\3\2\2\2\u00dd\u00df\5A!\2\u00de\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00d9\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3>\3\2\2\2\u00e4\u00e8\5A!\2\u00e5"+
		"\u00e7\5A!\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2"+
		"\2\u00e8\u00e9\3\2\2\2\u00e9@\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec"+
		"\4\62;\2\u00ecB\3\2\2\2\u00ed\u00ee\t\5\2\2\u00eeD\3\2\2\2\u00ef\u00f0"+
		"\7^\2\2\u00f0\u00f1\7)\2\2\u00f1F\3\2\2\2\u00f2\u00f3\t\6\2\2\u00f3\u00f4"+
		"\b$\3\2\u00f4H\3\2\2\2\u00f5\u0105\5C\"\2\u00f6\u00fa\5;\36\2\u00f7\u00f9"+
		"\5C\"\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u0100\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\5A"+
		"!\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u00f6\3\2"+
		"\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"J\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\61\2\2\u0109\u010a\7,\2\2"+
		"\u010a\u0110\3\2\2\2\u010b\u010c\7,\2\2\u010c\u010f\n\7\2\2\u010d\u010f"+
		"\n\b\2\2\u010e\u010b\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u0114\7\2\2\3\u0114\u0115\3\2\2\2\u0115\u0116\b&\4\2\u0116"+
		"L\3\2\2\2\u0117\u0118\5\25\13\2\u0118\u0119\5\25\13\2\u0119\u011a\b\'"+
		"\5\2\u011aN\3\2\2\2\u011b\u011c\5\33\16\2\u011c\u011d\5\33\16\2\u011d"+
		"\u011e\b(\6\2\u011eP\3\2\2\2\27\2joqz~\u008d\u0099\u00c8\u00ce\u00d5\u00d7"+
		"\u00db\u00e0\u00e2\u00e8\u00fa\u0100\u0105\u010e\u0110\7\3\b\2\3$\3\2"+
		"\3\2\3\'\4\3(\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}