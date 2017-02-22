// Generated from /home/kakau/IdeaProjects/CompiladorC/src/CompiladorC/CLexer.g4 by ANTLR 4.5.3
package CompiladorC;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CLexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CLexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CLexerParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(CLexerParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#declaracao_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_lista(CLexerParser.Declaracao_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(CLexerParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#var_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaracao(CLexerParser.Var_declaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#atributos_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributos_declaracao(CLexerParser.Atributos_declaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#fun_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_declaracao(CLexerParser.Fun_declaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(CLexerParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#param_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_lista(CLexerParser.Param_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CLexerParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#composto_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposto_decl(CLexerParser.Composto_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#local_declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_declaracoes(CLexerParser.Local_declaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#comando_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_lista(CLexerParser.Comando_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(CLexerParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#expressao_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_decl(CLexerParser.Expressao_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#selecao_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao_decl(CLexerParser.Selecao_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#iteracao_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteracao_decl(CLexerParser.Iteracao_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CLexerParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#ativacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtivacao(CLexerParser.AtivacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#arg_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_lista(CLexerParser.Arg_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CLexerParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(CLexerParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#expressao_simples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_simples(CLexerParser.Expressao_simplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#expressao_soma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_soma(CLexerParser.Expressao_somaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(CLexerParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(CLexerParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CLexerParser#retorno_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno_decl(CLexerParser.Retorno_declContext ctx);
}