// Generated from CLexer.g4 by ANTLR 4.5.3
package CompiladorC;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLexerParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_declaracao_lista = 1, RULE_declaracao = 2, RULE_var_declaracao = 3, 
		RULE_atributos_declaracao = 4, RULE_fun_declaracao = 5, RULE_params = 6, 
		RULE_param_lista = 7, RULE_param = 8, RULE_composto_decl = 9, RULE_local_declaracoes = 10, 
		RULE_comando_lista = 11, RULE_comando = 12, RULE_expressao_decl = 13, 
		RULE_selecao_decl = 14, RULE_iteracao_decl = 15, RULE_args = 16, RULE_ativacao = 17, 
		RULE_arg_lista = 18, RULE_var = 19, RULE_expressao = 20, RULE_expressao_simples = 21, 
		RULE_expressao_soma = 22, RULE_termo = 23, RULE_fator = 24, RULE_retorno_decl = 25;
	public static final String[] ruleNames = {
		"programa", "declaracao_lista", "declaracao", "var_declaracao", "atributos_declaracao", 
		"fun_declaracao", "params", "param_lista", "param", "composto_decl", "local_declaracoes", 
		"comando_lista", "comando", "expressao_decl", "selecao_decl", "iteracao_decl", 
		"args", "ativacao", "arg_lista", "var", "expressao", "expressao_simples", 
		"expressao_soma", "termo", "fator", "retorno_decl"
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

	@Override
	public String getGrammarFileName() { return "CLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CLexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public Declaracao_listaContext declaracao_lista() {
			return getRuleContext(Declaracao_listaContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			declaracao_lista();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_listaContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public Declaracao_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterDeclaracao_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitDeclaracao_lista(this);
		}
	}

	public final Declaracao_listaContext declaracao_lista() throws RecognitionException {
		Declaracao_listaContext _localctx = new Declaracao_listaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			declaracao();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO_ESPECIFICADOR) {
				{
				{
				setState(55);
				declaracao();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public Var_declaracaoContext var_declaracao() {
			return getRuleContext(Var_declaracaoContext.class,0);
		}
		public Fun_declaracaoContext fun_declaracao() {
			return getRuleContext(Fun_declaracaoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				var_declaracao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				fun_declaracao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declaracaoContext extends ParserRuleContext {
		public TerminalNode TIPO_ESPECIFICADOR() { return getToken(CLexerParser.TIPO_ESPECIFICADOR, 0); }
		public TerminalNode IDENT() { return getToken(CLexerParser.IDENT, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(CLexerParser.PONTO_VIRGULA, 0); }
		public List<TerminalNode> ABRE_COLCHETE() { return getTokens(CLexerParser.ABRE_COLCHETE); }
		public TerminalNode ABRE_COLCHETE(int i) {
			return getToken(CLexerParser.ABRE_COLCHETE, i);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(CLexerParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(CLexerParser.NUM_INT, i);
		}
		public List<TerminalNode> FECHA_COLCHETE() { return getTokens(CLexerParser.FECHA_COLCHETE); }
		public TerminalNode FECHA_COLCHETE(int i) {
			return getToken(CLexerParser.FECHA_COLCHETE, i);
		}
		public Var_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterVar_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitVar_declaracao(this);
		}
	}

	public final Var_declaracaoContext var_declaracao() throws RecognitionException {
		Var_declaracaoContext _localctx = new Var_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_declaracao);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(TIPO_ESPECIFICADOR);
				setState(66);
				match(IDENT);
				setState(67);
				match(PONTO_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(TIPO_ESPECIFICADOR);
				setState(69);
				match(IDENT);
				setState(70);
				match(ABRE_COLCHETE);
				setState(71);
				match(NUM_INT);
				setState(72);
				match(FECHA_COLCHETE);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ABRE_COLCHETE) {
					{
					{
					setState(73);
					match(ABRE_COLCHETE);
					setState(74);
					match(NUM_INT);
					setState(75);
					match(FECHA_COLCHETE);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				match(PONTO_VIRGULA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atributos_declaracaoContext extends ParserRuleContext {
		public List<Var_declaracaoContext> var_declaracao() {
			return getRuleContexts(Var_declaracaoContext.class);
		}
		public Var_declaracaoContext var_declaracao(int i) {
			return getRuleContext(Var_declaracaoContext.class,i);
		}
		public Atributos_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterAtributos_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitAtributos_declaracao(this);
		}
	}

	public final Atributos_declaracaoContext atributos_declaracao() throws RecognitionException {
		Atributos_declaracaoContext _localctx = new Atributos_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atributos_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			var_declaracao();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO_ESPECIFICADOR) {
				{
				{
				setState(85);
				var_declaracao();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_declaracaoContext extends ParserRuleContext {
		public TerminalNode TIPO_ESPECIFICADOR() { return getToken(CLexerParser.TIPO_ESPECIFICADOR, 0); }
		public TerminalNode IDENT() { return getToken(CLexerParser.IDENT, 0); }
		public TerminalNode ABRE_PARENT() { return getToken(CLexerParser.ABRE_PARENT, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode FECHA_PARENT() { return getToken(CLexerParser.FECHA_PARENT, 0); }
		public Composto_declContext composto_decl() {
			return getRuleContext(Composto_declContext.class,0);
		}
		public Fun_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterFun_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitFun_declaracao(this);
		}
	}

	public final Fun_declaracaoContext fun_declaracao() throws RecognitionException {
		Fun_declaracaoContext _localctx = new Fun_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fun_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(TIPO_ESPECIFICADOR);
			setState(92);
			match(IDENT);
			setState(93);
			match(ABRE_PARENT);
			setState(94);
			params();
			setState(95);
			match(FECHA_PARENT);
			setState(96);
			composto_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public Param_listaContext param_lista() {
			return getRuleContext(Param_listaContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CLexerParser.VOID, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		try {
			setState(100);
			switch (_input.LA(1)) {
			case TIPO_ESPECIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				param_lista();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_listaContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(CLexerParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(CLexerParser.VIRGULA, i);
		}
		public Param_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterParam_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitParam_lista(this);
		}
	}

	public final Param_listaContext param_lista() throws RecognitionException {
		Param_listaContext _localctx = new Param_listaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			param();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(103);
				match(VIRGULA);
				setState(104);
				param();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode TIPO_ESPECIFICADOR() { return getToken(CLexerParser.TIPO_ESPECIFICADOR, 0); }
		public TerminalNode IDENT() { return getToken(CLexerParser.IDENT, 0); }
		public TerminalNode ABRE_COLCHETE() { return getToken(CLexerParser.ABRE_COLCHETE, 0); }
		public TerminalNode FECHA_COLCHETE() { return getToken(CLexerParser.FECHA_COLCHETE, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(TIPO_ESPECIFICADOR);
				setState(111);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(TIPO_ESPECIFICADOR);
				setState(113);
				match(IDENT);
				setState(114);
				match(ABRE_COLCHETE);
				setState(115);
				match(FECHA_COLCHETE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Composto_declContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVE() { return getToken(CLexerParser.ABRE_CHAVE, 0); }
		public Local_declaracoesContext local_declaracoes() {
			return getRuleContext(Local_declaracoesContext.class,0);
		}
		public Comando_listaContext comando_lista() {
			return getRuleContext(Comando_listaContext.class,0);
		}
		public TerminalNode FECHA_CHAVE() { return getToken(CLexerParser.FECHA_CHAVE, 0); }
		public Composto_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composto_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterComposto_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitComposto_decl(this);
		}
	}

	public final Composto_declContext composto_decl() throws RecognitionException {
		Composto_declContext _localctx = new Composto_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_composto_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ABRE_CHAVE);
			setState(119);
			local_declaracoes();
			setState(120);
			comando_lista();
			setState(121);
			match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_declaracoesContext extends ParserRuleContext {
		public List<Var_declaracaoContext> var_declaracao() {
			return getRuleContexts(Var_declaracaoContext.class);
		}
		public Var_declaracaoContext var_declaracao(int i) {
			return getRuleContext(Var_declaracaoContext.class,i);
		}
		public Local_declaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterLocal_declaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitLocal_declaracoes(this);
		}
	}

	public final Local_declaracoesContext local_declaracoes() throws RecognitionException {
		Local_declaracoesContext _localctx = new Local_declaracoesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_local_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO_ESPECIFICADOR) {
				{
				{
				setState(123);
				var_declaracao();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comando_listaContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Comando_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterComando_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitComando_lista(this);
		}
	}

	public final Comando_listaContext comando_lista() throws RecognitionException {
		Comando_listaContext _localctx = new Comando_listaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comando_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << IDENT) | (1L << PONTO_VIRGULA) | (1L << ABRE_PARENT) | (1L << ABRE_CHAVE) | (1L << NUM) | (1L << NUM_INT))) != 0)) {
				{
				{
				setState(129);
				comando();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public Expressao_declContext expressao_decl() {
			return getRuleContext(Expressao_declContext.class,0);
		}
		public Composto_declContext composto_decl() {
			return getRuleContext(Composto_declContext.class,0);
		}
		public Selecao_declContext selecao_decl() {
			return getRuleContext(Selecao_declContext.class,0);
		}
		public Iteracao_declContext iteracao_decl() {
			return getRuleContext(Iteracao_declContext.class,0);
		}
		public Retorno_declContext retorno_decl() {
			return getRuleContext(Retorno_declContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comando);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case IDENT:
			case PONTO_VIRGULA:
			case ABRE_PARENT:
			case NUM:
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				expressao_decl();
				}
				break;
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				composto_decl();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				selecao_decl();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				iteracao_decl();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				retorno_decl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_declContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(CLexerParser.PONTO_VIRGULA, 0); }
		public Expressao_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterExpressao_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitExpressao_decl(this);
		}
	}

	public final Expressao_declContext expressao_decl() throws RecognitionException {
		Expressao_declContext _localctx = new Expressao_declContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressao_decl);
		try {
			setState(146);
			switch (_input.LA(1)) {
			case IDENT:
			case ABRE_PARENT:
			case NUM:
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				expressao();
				setState(143);
				match(PONTO_VIRGULA);
				}
				break;
			case PONTO_VIRGULA:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(PONTO_VIRGULA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selecao_declContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENT() { return getToken(CLexerParser.ABRE_PARENT, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENT() { return getToken(CLexerParser.FECHA_PARENT, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Selecao_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterSelecao_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitSelecao_decl(this);
		}
	}

	public final Selecao_declContext selecao_decl() throws RecognitionException {
		Selecao_declContext _localctx = new Selecao_declContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_selecao_decl);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__0);
				setState(149);
				match(ABRE_PARENT);
				setState(150);
				expressao();
				setState(151);
				match(FECHA_PARENT);
				setState(152);
				comando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(T__0);
				setState(155);
				match(ABRE_PARENT);
				setState(156);
				expressao();
				setState(157);
				match(FECHA_PARENT);
				setState(158);
				comando();
				setState(159);
				match(T__1);
				setState(160);
				comando();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iteracao_declContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENT() { return getToken(CLexerParser.ABRE_PARENT, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENT() { return getToken(CLexerParser.FECHA_PARENT, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public Iteracao_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteracao_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterIteracao_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitIteracao_decl(this);
		}
	}

	public final Iteracao_declContext iteracao_decl() throws RecognitionException {
		Iteracao_declContext _localctx = new Iteracao_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_iteracao_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__2);
			setState(165);
			match(ABRE_PARENT);
			setState(166);
			expressao();
			setState(167);
			match(FECHA_PARENT);
			setState(168);
			comando();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public Arg_listaContext arg_lista() {
			return getRuleContext(Arg_listaContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENT) | (1L << ABRE_PARENT) | (1L << NUM) | (1L << NUM_INT))) != 0)) {
				{
				setState(170);
				arg_lista();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtivacaoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CLexerParser.IDENT, 0); }
		public TerminalNode ABRE_PARENT() { return getToken(CLexerParser.ABRE_PARENT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode FECHA_PARENT() { return getToken(CLexerParser.FECHA_PARENT, 0); }
		public AtivacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ativacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterAtivacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitAtivacao(this);
		}
	}

	public final AtivacaoContext ativacao() throws RecognitionException {
		AtivacaoContext _localctx = new AtivacaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ativacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(IDENT);
			setState(174);
			match(ABRE_PARENT);
			setState(175);
			args();
			setState(176);
			match(FECHA_PARENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_listaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(CLexerParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(CLexerParser.VIRGULA, i);
		}
		public Arg_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterArg_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitArg_lista(this);
		}
	}

	public final Arg_listaContext arg_lista() throws RecognitionException {
		Arg_listaContext _localctx = new Arg_listaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arg_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			expressao();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(179);
				match(VIRGULA);
				setState(180);
				expressao();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CLexerParser.IDENT, 0); }
		public List<TerminalNode> ABRE_COLCHETE() { return getTokens(CLexerParser.ABRE_COLCHETE); }
		public TerminalNode ABRE_COLCHETE(int i) {
			return getToken(CLexerParser.ABRE_COLCHETE, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> FECHA_COLCHETE() { return getTokens(CLexerParser.FECHA_COLCHETE); }
		public TerminalNode FECHA_COLCHETE(int i) {
			return getToken(CLexerParser.FECHA_COLCHETE, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(IDENT);
				setState(188);
				match(ABRE_COLCHETE);
				setState(189);
				expressao();
				setState(190);
				match(FECHA_COLCHETE);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ABRE_COLCHETE) {
					{
					{
					setState(191);
					match(ABRE_COLCHETE);
					setState(192);
					expressao();
					setState(193);
					match(FECHA_COLCHETE);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode SINAL_IGUAL() { return getToken(CLexerParser.SINAL_IGUAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Expressao_simplesContext expressao_simples() {
			return getRuleContext(Expressao_simplesContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressao);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				var();
				setState(203);
				match(SINAL_IGUAL);
				setState(204);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				expressao_simples();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_simplesContext extends ParserRuleContext {
		public List<Expressao_somaContext> expressao_soma() {
			return getRuleContexts(Expressao_somaContext.class);
		}
		public Expressao_somaContext expressao_soma(int i) {
			return getRuleContext(Expressao_somaContext.class,i);
		}
		public TerminalNode RELACIONAL() { return getToken(CLexerParser.RELACIONAL, 0); }
		public Expressao_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_simples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterExpressao_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitExpressao_simples(this);
		}
	}

	public final Expressao_simplesContext expressao_simples() throws RecognitionException {
		Expressao_simplesContext _localctx = new Expressao_simplesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressao_simples);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				expressao_soma();
				setState(210);
				match(RELACIONAL);
				setState(211);
				expressao_soma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				expressao_soma();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_somaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> SOMA() { return getTokens(CLexerParser.SOMA); }
		public TerminalNode SOMA(int i) {
			return getToken(CLexerParser.SOMA, i);
		}
		public Expressao_somaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_soma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterExpressao_soma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitExpressao_soma(this);
		}
	}

	public final Expressao_somaContext expressao_soma() throws RecognitionException {
		Expressao_somaContext _localctx = new Expressao_somaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressao_soma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			termo();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SOMA) {
				{
				{
				setState(217);
				match(SOMA);
				setState(218);
				termo();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CLexerParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CLexerParser.MULT, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			fator();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(225);
				match(MULT);
				setState(226);
				fator();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENT() { return getToken(CLexerParser.ABRE_PARENT, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENT() { return getToken(CLexerParser.FECHA_PARENT, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AtivacaoContext ativacao() {
			return getRuleContext(AtivacaoContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CLexerParser.NUM, 0); }
		public TerminalNode NUM_INT() { return getToken(CLexerParser.NUM_INT, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fator);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(ABRE_PARENT);
				setState(233);
				expressao();
				setState(234);
				match(FECHA_PARENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				ativacao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				match(NUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				match(NUM_INT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Retorno_declContext extends ParserRuleContext {
		public TerminalNode PONTO_VIRGULA() { return getToken(CLexerParser.PONTO_VIRGULA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Retorno_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).enterRetorno_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLexerListener ) ((CLexerListener)listener).exitRetorno_decl(this);
		}
	}

	public final Retorno_declContext retorno_decl() throws RecognitionException {
		Retorno_declContext _localctx = new Retorno_declContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_retorno_decl);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__3);
				setState(243);
				match(PONTO_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(T__3);
				setState(245);
				expressao();
				setState(246);
				match(PONTO_VIRGULA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\4\3\4\5"+
		"\4B\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5O\n\5\f\5\16\5"+
		"R\13\5\3\5\5\5U\n\5\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\5\bg\n\b\3\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\nw\n\n\3\13\3\13\3\13\3\13\3\13\3\f\7\f\177\n\f\f"+
		"\f\16\f\u0082\13\f\3\r\7\r\u0085\n\r\f\r\16\r\u0088\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u008f\n\16\3\17\3\17\3\17\3\17\5\17\u0095\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a5"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\5\22\u00ae\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\7\24\u00b8\n\24\f\24\16\24\u00bb\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00c6\n\25\f\25\16\25\u00c9"+
		"\13\25\5\25\u00cb\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u00d2\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u00d9\n\27\3\30\3\30\3\30\7\30\u00de\n\30\f\30"+
		"\16\30\u00e1\13\30\3\31\3\31\3\31\7\31\u00e6\n\31\f\31\16\31\u00e9\13"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f3\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u00fb\n\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\2\u00ff\2\66\3\2\2\2\48\3\2\2\2"+
		"\6A\3\2\2\2\bT\3\2\2\2\nV\3\2\2\2\f]\3\2\2\2\16f\3\2\2\2\20h\3\2\2\2\22"+
		"v\3\2\2\2\24x\3\2\2\2\26\u0080\3\2\2\2\30\u0086\3\2\2\2\32\u008e\3\2\2"+
		"\2\34\u0094\3\2\2\2\36\u00a4\3\2\2\2 \u00a6\3\2\2\2\"\u00ad\3\2\2\2$\u00af"+
		"\3\2\2\2&\u00b4\3\2\2\2(\u00ca\3\2\2\2*\u00d1\3\2\2\2,\u00d8\3\2\2\2."+
		"\u00da\3\2\2\2\60\u00e2\3\2\2\2\62\u00f2\3\2\2\2\64\u00fa\3\2\2\2\66\67"+
		"\5\4\3\2\67\3\3\2\2\28<\5\6\4\29;\5\6\4\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2"+
		"\2<=\3\2\2\2=\5\3\2\2\2><\3\2\2\2?B\5\b\5\2@B\5\f\7\2A?\3\2\2\2A@\3\2"+
		"\2\2B\7\3\2\2\2CD\7\7\2\2DE\7\b\2\2EU\7\16\2\2FG\7\7\2\2GH\7\b\2\2HI\7"+
		"\22\2\2IJ\7!\2\2JP\7\23\2\2KL\7\22\2\2LM\7!\2\2MO\7\23\2\2NK\3\2\2\2O"+
		"R\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2SU\7\16\2\2TC\3\2\2\2"+
		"TF\3\2\2\2U\t\3\2\2\2VZ\5\b\5\2WY\5\b\5\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2"+
		"\2Z[\3\2\2\2[\13\3\2\2\2\\Z\3\2\2\2]^\7\7\2\2^_\7\b\2\2_`\7\20\2\2`a\5"+
		"\16\b\2ab\7\21\2\2bc\5\24\13\2c\r\3\2\2\2dg\5\20\t\2eg\7\32\2\2fd\3\2"+
		"\2\2fe\3\2\2\2g\17\3\2\2\2hm\5\22\n\2ij\7\r\2\2jl\5\22\n\2ki\3\2\2\2l"+
		"o\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\21\3\2\2\2om\3\2\2\2pq\7\7\2\2qw\7\b\2"+
		"\2rs\7\7\2\2st\7\b\2\2tu\7\22\2\2uw\7\23\2\2vp\3\2\2\2vr\3\2\2\2w\23\3"+
		"\2\2\2xy\7\24\2\2yz\5\26\f\2z{\5\30\r\2{|\7\25\2\2|\25\3\2\2\2}\177\5"+
		"\b\5\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\27\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\5\32\16\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\31\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008f\5\34\17\2\u008a\u008f\5\24"+
		"\13\2\u008b\u008f\5\36\20\2\u008c\u008f\5 \21\2\u008d\u008f\5\64\33\2"+
		"\u008e\u0089\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008d\3\2\2\2\u008f\33\3\2\2\2\u0090\u0091\5*\26\2\u0091"+
		"\u0092\7\16\2\2\u0092\u0095\3\2\2\2\u0093\u0095\7\16\2\2\u0094\u0090\3"+
		"\2\2\2\u0094\u0093\3\2\2\2\u0095\35\3\2\2\2\u0096\u0097\7\3\2\2\u0097"+
		"\u0098\7\20\2\2\u0098\u0099\5*\26\2\u0099\u009a\7\21\2\2\u009a\u009b\5"+
		"\32\16\2\u009b\u00a5\3\2\2\2\u009c\u009d\7\3\2\2\u009d\u009e\7\20\2\2"+
		"\u009e\u009f\5*\26\2\u009f\u00a0\7\21\2\2\u00a0\u00a1\5\32\16\2\u00a1"+
		"\u00a2\7\4\2\2\u00a2\u00a3\5\32\16\2\u00a3\u00a5\3\2\2\2\u00a4\u0096\3"+
		"\2\2\2\u00a4\u009c\3\2\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\7\5\2\2\u00a7"+
		"\u00a8\7\20\2\2\u00a8\u00a9\5*\26\2\u00a9\u00aa\7\21\2\2\u00aa\u00ab\5"+
		"\32\16\2\u00ab!\3\2\2\2\u00ac\u00ae\5&\24\2\u00ad\u00ac\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae#\3\2\2\2\u00af\u00b0\7\b\2\2\u00b0\u00b1\7\20\2\2"+
		"\u00b1\u00b2\5\"\22\2\u00b2\u00b3\7\21\2\2\u00b3%\3\2\2\2\u00b4\u00b9"+
		"\5*\26\2\u00b5\u00b6\7\r\2\2\u00b6\u00b8\5*\26\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\'\3\2\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bc\u00cb\7\b\2\2\u00bd\u00be\7\b\2\2\u00be\u00bf"+
		"\7\22\2\2\u00bf\u00c0\5*\26\2\u00c0\u00c7\7\23\2\2\u00c1\u00c2\7\22\2"+
		"\2\u00c2\u00c3\5*\26\2\u00c3\u00c4\7\23\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c1\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00bc\3\2\2\2\u00ca"+
		"\u00bd\3\2\2\2\u00cb)\3\2\2\2\u00cc\u00cd\5(\25\2\u00cd\u00ce\7\36\2\2"+
		"\u00ce\u00cf\5*\26\2\u00cf\u00d2\3\2\2\2\u00d0\u00d2\5,\27\2\u00d1\u00cc"+
		"\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2+\3\2\2\2\u00d3\u00d4\5.\30\2\u00d4"+
		"\u00d5\7\n\2\2\u00d5\u00d6\5.\30\2\u00d6\u00d9\3\2\2\2\u00d7\u00d9\5."+
		"\30\2\u00d8\u00d3\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9-\3\2\2\2\u00da\u00df"+
		"\5\60\31\2\u00db\u00dc\7\13\2\2\u00dc\u00de\5\60\31\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"/\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e7\5\62\32\2\u00e3\u00e4\7\f\2"+
		"\2\u00e4\u00e6\5\62\32\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\61\3\2\2\2\u00e9\u00e7\3\2\2"+
		"\2\u00ea\u00eb\7\20\2\2\u00eb\u00ec\5*\26\2\u00ec\u00ed\7\21\2\2\u00ed"+
		"\u00f3\3\2\2\2\u00ee\u00f3\5(\25\2\u00ef\u00f3\5$\23\2\u00f0\u00f3\7 "+
		"\2\2\u00f1\u00f3\7!\2\2\u00f2\u00ea\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2"+
		"\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\63\3\2\2"+
		"\2\u00f4\u00f5\7\6\2\2\u00f5\u00fb\7\16\2\2\u00f6\u00f7\7\6\2\2\u00f7"+
		"\u00f8\5*\26\2\u00f8\u00f9\7\16\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f4\3"+
		"\2\2\2\u00fa\u00f6\3\2\2\2\u00fb\65\3\2\2\2\31<APTZfmv\u0080\u0086\u008e"+
		"\u0094\u00a4\u00ad\u00b9\u00c7\u00ca\u00d1\u00d8\u00df\u00e7\u00f2\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}