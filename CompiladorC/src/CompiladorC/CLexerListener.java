// Generated from CLexer.g4 by ANTLR 4.5.3
package CompiladorC;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CLexerParser}.
 */
public interface CLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CLexerParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CLexerParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CLexerParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#declaracao_lista}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_lista(CLexerParser.Declaracao_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#declaracao_lista}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_lista(CLexerParser.Declaracao_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(CLexerParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(CLexerParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#var_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaracao(CLexerParser.Var_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#var_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaracao(CLexerParser.Var_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#atributos_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterAtributos_declaracao(CLexerParser.Atributos_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#atributos_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitAtributos_declaracao(CLexerParser.Atributos_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#fun_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterFun_declaracao(CLexerParser.Fun_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#fun_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitFun_declaracao(CLexerParser.Fun_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CLexerParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CLexerParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#param_lista}.
	 * @param ctx the parse tree
	 */
	void enterParam_lista(CLexerParser.Param_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#param_lista}.
	 * @param ctx the parse tree
	 */
	void exitParam_lista(CLexerParser.Param_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CLexerParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CLexerParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#composto_decl}.
	 * @param ctx the parse tree
	 */
	void enterComposto_decl(CLexerParser.Composto_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#composto_decl}.
	 * @param ctx the parse tree
	 */
	void exitComposto_decl(CLexerParser.Composto_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#local_declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declaracoes(CLexerParser.Local_declaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#local_declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declaracoes(CLexerParser.Local_declaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#comando_lista}.
	 * @param ctx the parse tree
	 */
	void enterComando_lista(CLexerParser.Comando_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#comando_lista}.
	 * @param ctx the parse tree
	 */
	void exitComando_lista(CLexerParser.Comando_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(CLexerParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(CLexerParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#expressao_decl}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_decl(CLexerParser.Expressao_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#expressao_decl}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_decl(CLexerParser.Expressao_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#selecao_decl}.
	 * @param ctx the parse tree
	 */
	void enterSelecao_decl(CLexerParser.Selecao_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#selecao_decl}.
	 * @param ctx the parse tree
	 */
	void exitSelecao_decl(CLexerParser.Selecao_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#iteracao_decl}.
	 * @param ctx the parse tree
	 */
	void enterIteracao_decl(CLexerParser.Iteracao_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#iteracao_decl}.
	 * @param ctx the parse tree
	 */
	void exitIteracao_decl(CLexerParser.Iteracao_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CLexerParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CLexerParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#ativacao}.
	 * @param ctx the parse tree
	 */
	void enterAtivacao(CLexerParser.AtivacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#ativacao}.
	 * @param ctx the parse tree
	 */
	void exitAtivacao(CLexerParser.AtivacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#arg_lista}.
	 * @param ctx the parse tree
	 */
	void enterArg_lista(CLexerParser.Arg_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#arg_lista}.
	 * @param ctx the parse tree
	 */
	void exitArg_lista(CLexerParser.Arg_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CLexerParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CLexerParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(CLexerParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(CLexerParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_simples(CLexerParser.Expressao_simplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_simples(CLexerParser.Expressao_simplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#expressao_soma}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_soma(CLexerParser.Expressao_somaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#expressao_soma}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_soma(CLexerParser.Expressao_somaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(CLexerParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(CLexerParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(CLexerParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(CLexerParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLexerParser#retorno_decl}.
	 * @param ctx the parse tree
	 */
	void enterRetorno_decl(CLexerParser.Retorno_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLexerParser#retorno_decl}.
	 * @param ctx the parse tree
	 */
	void exitRetorno_decl(CLexerParser.Retorno_declContext ctx);
}