// Generated from CLexer.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERRO_IDENT_MAIUSCULO=1, DIGITO=2, PALAVRA_CHAVE=3, TIPO_ESPECIFICADOR=4, 
		RETORNO_DECL=5, IDENT=6, LETRA=7, NUM_INT=8, NUM=9, ARG_LISTA=10, EXPRESSAO=11, 
		EXPRESSAO_SIMPLES=12, EXPRESSAO_SOMA=13, TERMO=14, FATOR=15, VAR=16, WS=17, 
		COMENTARIO=18, RELACIONAL=19, SOMA=20, MULT=21, VIRGULA=22, DELIM=23, 
		ABRE_PARENT=24, FECHA_PARENT=25, ABRE_COLCHETE=26, FECHA_COLCHETE=27, 
		ABRE_CHAVE=28, FECHA_CHAVE=29, CIFRAO=30, CIRCUNFLEXO=31, PONTO=32, BARRA=33, 
		ATRIBUICAO=34, ESP_BRANCO=35, NOVA_LINHA=36, OUTRO=37, UNTERMINATED_COMMENT=38, 
		ERRO_DUPLO_MULT=39, ERRO_DUPLO_DELIM=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ERRO_IDENT_MAIUSCULO", "DIGITO", "PALAVRA_CHAVE", "TIPO_ESPECIFICADOR", 
		"RETORNO_DECL", "IDENT", "LETRA", "NUM_INT", "NUM", "ARG_LISTA", "EXPRESSAO", 
		"EXPRESSAO_SIMPLES", "EXPRESSAO_SOMA", "TERMO", "FATOR", "VAR", "ESC_SEQ", 
		"WS", "COMENTARIO", "RELACIONAL", "SOMA", "MULT", "VIRGULA", "DELIM", 
		"ABRE_PARENT", "FECHA_PARENT", "ABRE_COLCHETE", "FECHA_COLCHETE", "ABRE_CHAVE", 
		"FECHA_CHAVE", "CIFRAO", "CIRCUNFLEXO", "PONTO", "BARRA", "ATRIBUICAO", 
		"ESP_BRANCO", "NOVA_LINHA", "OUTRO", "UNTERMINATED_COMMENT", "ERRO_DUPLO_MULT", 
		"ERRO_DUPLO_DELIM", "LETRA_MAIUSC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "','", null, 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'$'", "'^'", "'.'", "'/'", 
		"'='", "'\t'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERRO_IDENT_MAIUSCULO", "DIGITO", "PALAVRA_CHAVE", "TIPO_ESPECIFICADOR", 
		"RETORNO_DECL", "IDENT", "LETRA", "NUM_INT", "NUM", "ARG_LISTA", "EXPRESSAO", 
		"EXPRESSAO_SIMPLES", "EXPRESSAO_SOMA", "TERMO", "FATOR", "VAR", "WS", 
		"COMENTARIO", "RELACIONAL", "SOMA", "MULT", "VIRGULA", "DELIM", "ABRE_PARENT", 
		"FECHA_PARENT", "ABRE_COLCHETE", "FECHA_COLCHETE", "ABRE_CHAVE", "FECHA_CHAVE", 
		"CIFRAO", "CIRCUNFLEXO", "PONTO", "BARRA", "ATRIBUICAO", "ESP_BRANCO", 
		"NOVA_LINHA", "OUTRO", "UNTERMINATED_COMMENT", "ERRO_DUPLO_MULT", "ERRO_DUPLO_DELIM"
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


	public CLexer(CharStream input) {
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
		case 17:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			ERRO_DUPLO_MULT_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			ERRO_DUPLO_DELIM_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u016b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\7\2a\n\2\f\2\16\2d\13\2\7\2f\n"+
		"\2\f\2\16\2i\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0094\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a4\n\6\3\7\3\7"+
		"\3\7\3\7\7\7\u00aa\n\7\f\7\16\7\u00ad\13\7\3\b\3\b\3\t\3\t\7\t\u00b3\n"+
		"\t\f\t\16\t\u00b6\13\t\3\n\5\n\u00b9\n\n\3\n\6\n\u00bc\n\n\r\n\16\n\u00bd"+
		"\3\n\3\n\6\n\u00c2\n\n\r\n\16\n\u00c3\5\n\u00c6\n\n\3\13\3\13\3\13\7\13"+
		"\u00cb\n\13\f\13\16\13\u00ce\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00d8\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00df\n\r\3\16\3\16\3\16\3\16\7\16"+
		"\u00e5\n\16\f\16\16\16\u00e8\13\16\3\17\3\17\3\17\3\17\7\17\u00ee\n\17"+
		"\f\17\16\17\u00f1\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fa"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0105\n\21\f\21"+
		"\16\21\u0108\13\21\5\21\u010a\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\7\24\u0116\n\24\f\24\16\24\u0119\13\24\3\24\5\24\u011c"+
		"\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u012b\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u0135\n"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\7(\u0159"+
		"\n(\f(\16(\u015c\13(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3\u015a"+
		"\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\2%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35"+
		";\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U\2\3\2\t\4\2--//\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\4\2,,\61\61\3\2\61\61\3\2,,\3\2C\\\u018f\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2"+
		")\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3W\3\2\2\2\5j\3\2\2\2\7\u0081"+
		"\3\2\2\2\t\u0093\3\2\2\2\13\u00a3\3\2\2\2\r\u00a5\3\2\2\2\17\u00ae\3\2"+
		"\2\2\21\u00b0\3\2\2\2\23\u00b8\3\2\2\2\25\u00c7\3\2\2\2\27\u00d7\3\2\2"+
		"\2\31\u00de\3\2\2\2\33\u00e0\3\2\2\2\35\u00e9\3\2\2\2\37\u00f9\3\2\2\2"+
		"!\u0109\3\2\2\2#\u010b\3\2\2\2%\u010e\3\2\2\2\'\u0111\3\2\2\2)\u012a\3"+
		"\2\2\2+\u012c\3\2\2\2-\u012e\3\2\2\2/\u0130\3\2\2\2\61\u0134\3\2\2\2\63"+
		"\u0136\3\2\2\2\65\u0138\3\2\2\2\67\u013a\3\2\2\29\u013c\3\2\2\2;\u013e"+
		"\3\2\2\2=\u0140\3\2\2\2?\u0142\3\2\2\2A\u0144\3\2\2\2C\u0146\3\2\2\2E"+
		"\u0148\3\2\2\2G\u014a\3\2\2\2I\u014c\3\2\2\2K\u014e\3\2\2\2M\u0150\3\2"+
		"\2\2O\u0152\3\2\2\2Q\u0161\3\2\2\2S\u0165\3\2\2\2U\u0169\3\2\2\2Wg\5U"+
		"+\2X\\\5\17\b\2Y[\5U+\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]b\3"+
		"\2\2\2^\\\3\2\2\2_a\5\5\3\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf"+
		"\3\2\2\2db\3\2\2\2eX\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\4\3\2\2\2"+
		"ig\3\2\2\2jk\4\62;\2k\6\3\2\2\2lm\7k\2\2m\u0082\7h\2\2no\7v\2\2op\7j\2"+
		"\2pq\7c\2\2q\u0082\7p\2\2rs\7g\2\2st\7n\2\2tu\7u\2\2u\u0082\7g\2\2vw\7"+
		"t\2\2wx\7g\2\2xy\7r\2\2yz\7g\2\2z{\7c\2\2{\u0082\7v\2\2|}\7w\2\2}~\7p"+
		"\2\2~\177\7v\2\2\177\u0080\7k\2\2\u0080\u0082\7n\2\2\u0081l\3\2\2\2\u0081"+
		"n\3\2\2\2\u0081r\3\2\2\2\u0081v\3\2\2\2\u0081|\3\2\2\2\u0082\b\3\2\2\2"+
		"\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0094\7v\2\2\u0086\u0087"+
		"\7h\2\2\u0087\u0088\7n\2\2\u0088\u0089\7q\2\2\u0089\u008a\7c\2\2\u008a"+
		"\u0094\7v\2\2\u008b\u008c\7e\2\2\u008c\u008d\7j\2\2\u008d\u008e\7c\2\2"+
		"\u008e\u0094\7t\2\2\u008f\u0090\7x\2\2\u0090\u0091\7q\2\2\u0091\u0092"+
		"\7k\2\2\u0092\u0094\7f\2\2\u0093\u0083\3\2\2\2\u0093\u0086\3\2\2\2\u0093"+
		"\u008b\3\2\2\2\u0093\u008f\3\2\2\2\u0094\n\3\2\2\2\u0095\u0096\7t\2\2"+
		"\u0096\u0097\7g\2\2\u0097\u0098\7v\2\2\u0098\u0099\7w\2\2\u0099\u009a"+
		"\7t\2\2\u009a\u00a4\7p\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7v\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7p\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a4\5\27\f\2\u00a3\u0095\3\2\2\2\u00a3\u009b"+
		"\3\2\2\2\u00a4\f\3\2\2\2\u00a5\u00ab\5\17\b\2\u00a6\u00aa\5\17\b\2\u00a7"+
		"\u00aa\5U+\2\u00a8\u00aa\5\5\3\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2"+
		"\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\16\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\4c|\2\u00af"+
		"\20\3\2\2\2\u00b0\u00b4\5\5\3\2\u00b1\u00b3\5\5\3\2\u00b2\u00b1\3\2\2"+
		"\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\22"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\t\2\2\2\u00b8\u00b7\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00bc\4\62;\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c5\3\2\2\2\u00bf\u00c1\7\60\2\2\u00c0\u00c2\4\62;\2\u00c1\u00c0\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\24\3\2\2"+
		"\2\u00c7\u00cc\5\r\7\2\u00c8\u00c9\7.\2\2\u00c9\u00cb\5\r\7\2\u00ca\u00c8"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\26\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\5\31\r\2\u00d0\u00d1\7=\2"+
		"\2\u00d1\u00d8\3\2\2\2\u00d2\u00d3\5!\21\2\u00d3\u00d4\7?\2\2\u00d4\u00d5"+
		"\5\27\f\2\u00d5\u00d6\7=\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d7"+
		"\u00d2\3\2\2\2\u00d8\30\3\2\2\2\u00d9\u00da\5\33\16\2\u00da\u00db\5)\25"+
		"\2\u00db\u00dc\5\33\16\2\u00dc\u00df\3\2\2\2\u00dd\u00df\5\33\16\2\u00de"+
		"\u00d9\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\32\3\2\2\2\u00e0\u00e6\5\35\17"+
		"\2\u00e1\u00e2\5+\26\2\u00e2\u00e3\5\35\17\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e1\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\34\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ef\5\37\20\2\u00ea"+
		"\u00eb\5-\27\2\u00eb\u00ec\5\37\20\2\u00ec\u00ee\3\2\2\2\u00ed\u00ea\3"+
		"\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\36\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7*\2\2\u00f3\u00f4\5\27\f"+
		"\2\u00f4\u00f5\7+\2\2\u00f5\u00fa\3\2\2\2\u00f6\u00fa\5\23\n\2\u00f7\u00fa"+
		"\5\21\t\2\u00f8\u00fa\5!\21\2\u00f9\u00f2\3\2\2\2\u00f9\u00f6\3\2\2\2"+
		"\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa \3\2\2\2\u00fb\u010a\5"+
		"\r\7\2\u00fc\u00fd\5\r\7\2\u00fd\u00fe\5\67\34\2\u00fe\u00ff\5\27\f\2"+
		"\u00ff\u0106\59\35\2\u0100\u0101\5\67\34\2\u0101\u0102\5\27\f\2\u0102"+
		"\u0103\59\35\2\u0103\u0105\3\2\2\2\u0104\u0100\3\2\2\2\u0105\u0108\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u00fb\3\2\2\2\u0109\u00fc\3\2\2\2\u010a\"\3\2\2\2"+
		"\u010b\u010c\7^\2\2\u010c\u010d\7)\2\2\u010d$\3\2\2\2\u010e\u010f\t\3"+
		"\2\2\u010f\u0110\b\23\2\2\u0110&\3\2\2\2\u0111\u0112\7\61\2\2\u0112\u0113"+
		"\7,\2\2\u0113\u0117\3\2\2\2\u0114\u0116\n\4\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u011c\7\17\2\2\u011b\u011a\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\f\2\2\u011e\u011f\b\24"+
		"\3\2\u011f(\3\2\2\2\u0120\u012b\7@\2\2\u0121\u0122\7@\2\2\u0122\u012b"+
		"\7?\2\2\u0123\u012b\7>\2\2\u0124\u0125\7>\2\2\u0125\u012b\7?\2\2\u0126"+
		"\u0127\7#\2\2\u0127\u012b\7?\2\2\u0128\u0129\7?\2\2\u0129\u012b\7?\2\2"+
		"\u012a\u0120\3\2\2\2\u012a\u0121\3\2\2\2\u012a\u0123\3\2\2\2\u012a\u0124"+
		"\3\2\2\2\u012a\u0126\3\2\2\2\u012a\u0128\3\2\2\2\u012b*\3\2\2\2\u012c"+
		"\u012d\t\2\2\2\u012d,\3\2\2\2\u012e\u012f\t\5\2\2\u012f.\3\2\2\2\u0130"+
		"\u0131\7.\2\2\u0131\60\3\2\2\2\u0132\u0135\7=\2\2\u0133\u0135\5/\30\2"+
		"\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\62\3\2\2\2\u0136\u0137"+
		"\7*\2\2\u0137\64\3\2\2\2\u0138\u0139\7+\2\2\u0139\66\3\2\2\2\u013a\u013b"+
		"\7]\2\2\u013b8\3\2\2\2\u013c\u013d\7_\2\2\u013d:\3\2\2\2\u013e\u013f\7"+
		"}\2\2\u013f<\3\2\2\2\u0140\u0141\7\177\2\2\u0141>\3\2\2\2\u0142\u0143"+
		"\7&\2\2\u0143@\3\2\2\2\u0144\u0145\7`\2\2\u0145B\3\2\2\2\u0146\u0147\7"+
		"\60\2\2\u0147D\3\2\2\2\u0148\u0149\7\61\2\2\u0149F\3\2\2\2\u014a\u014b"+
		"\7?\2\2\u014bH\3\2\2\2\u014c\u014d\7\13\2\2\u014dJ\3\2\2\2\u014e\u014f"+
		"\7\f\2\2\u014fL\3\2\2\2\u0150\u0151\7\60\2\2\u0151N\3\2\2\2\u0152\u0153"+
		"\7\61\2\2\u0153\u0154\7,\2\2\u0154\u015a\3\2\2\2\u0155\u0156\7,\2\2\u0156"+
		"\u0159\n\6\2\2\u0157\u0159\n\7\2\2\u0158\u0155\3\2\2\2\u0158\u0157\3\2"+
		"\2\2\u0159\u015c\3\2\2\2\u015a\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7\2\2\3\u015e\u015f\3\2"+
		"\2\2\u015f\u0160\b(\4\2\u0160P\3\2\2\2\u0161\u0162\5-\27\2\u0162\u0163"+
		"\5-\27\2\u0163\u0164\b)\5\2\u0164R\3\2\2\2\u0165\u0166\5\61\31\2\u0166"+
		"\u0167\5\61\31\2\u0167\u0168\b*\6\2\u0168T\3\2\2\2\u0169\u016a\t\b\2\2"+
		"\u016aV\3\2\2\2\36\2\\bg\u0081\u0093\u00a3\u00a9\u00ab\u00b4\u00b8\u00bd"+
		"\u00c3\u00c5\u00cc\u00d7\u00de\u00e6\u00ef\u00f9\u0106\u0109\u0117\u011b"+
		"\u012a\u0134\u0158\u015a\7\3\23\2\3\24\3\2\3\2\3)\4\3*\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}