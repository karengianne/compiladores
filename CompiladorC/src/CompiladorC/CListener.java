package CompiladorC;

import org.antlr.v4.runtime.*;

/**
 * Created by kakau on 01/02/17.
 */
public class CListener extends CLexerBaseListener{


    public TokenStreamRewriter tokenStreamRewriter;
    CLexerParser parser;

    public String novoFormato = "";


    public CListener(CLexerParser parser, CommonTokenStream tokenStreamRewriter) {
        this.parser = parser;
        this.tokenStreamRewriter = new TokenStreamRewriter(tokenStreamRewriter);
    }

    @Override
    public void exitDeclaracao_lista(CLexerParser.Declaracao_listaContext ctx) {
        super.exitDeclaracao_lista(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO na lista de declarações: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitDeclaracao(CLexerParser.DeclaracaoContext ctx) {
        super.exitDeclaracao(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO na declaração: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void enterPrograma(CLexerParser.ProgramaContext ctx) {
        super.enterPrograma(ctx);
    }

    @Override
    public void exitPrograma(CLexerParser.ProgramaContext ctx) {
        super.exitPrograma(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO no programa: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitArg_lista(CLexerParser.Arg_listaContext ctx) {
        super.exitArg_lista(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO na Lista de Argumentos: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitArgs(CLexerParser.ArgsContext ctx) {
        super.exitArgs(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Argumentos: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitComando(CLexerParser.ComandoContext ctx) {
        super.exitComando(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Comando: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitComando_lista(CLexerParser.Comando_listaContext ctx) {
        super.exitComando_lista(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Lista de Comando: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitExpressao(CLexerParser.ExpressaoContext ctx) {
        super.exitExpressao(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Expressao: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitExpressao_soma(CLexerParser.Expressao_somaContext ctx) {
        super.exitExpressao_soma(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Expressao SOMA: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitExpressao_simples(CLexerParser.Expressao_simplesContext ctx) {
        super.exitExpressao_simples(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Expressao Simples: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitExpressao_decl(CLexerParser.Expressao_declContext ctx) {
        super.exitExpressao_decl(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Declaração de Expressao: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitIteracao_decl(CLexerParser.Iteracao_declContext ctx) {
        super.exitIteracao_decl(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Iteração: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }




    @Override
    public void exitComposto_decl(CLexerParser.Composto_declContext ctx) {
        super.exitComposto_decl(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Iteração: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitAtivacao(CLexerParser.AtivacaoContext ctx) {
        super.exitAtivacao(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Ativação: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitAtributos_declaracao(CLexerParser.Atributos_declaracaoContext ctx) {
        super.exitAtributos_declaracao(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Declaração de Atributos: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitFator(CLexerParser.FatorContext ctx) {
        super.exitFator(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Fator: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitTermo(CLexerParser.TermoContext ctx) {
        super.exitTermo(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Termo: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitVar_declaracao(CLexerParser.Var_declaracaoContext ctx) {
        super.exitVar_declaracao(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Declaração de variavel: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitVar(CLexerParser.VarContext ctx) {
        super.exitVar(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Variavel: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitParam(CLexerParser.ParamContext ctx) {
        super.exitParam(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Parametro: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitParams(CLexerParser.ParamsContext ctx) {
        super.exitParams(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Parametros: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitParam_lista(CLexerParser.Param_listaContext ctx) {
        super.exitParam_lista(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Lista de Parametros: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitFun_declaracao(CLexerParser.Fun_declaracaoContext ctx) {
        super.exitFun_declaracao(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Declaracao de Função: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitLocal_declaracoes(CLexerParser.Local_declaracoesContext ctx) {
        super.exitLocal_declaracoes(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Declaracao Local: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitRetorno_decl(CLexerParser.Retorno_declContext ctx) {
        super.exitRetorno_decl(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Declaracao de retorno: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    @Override
    public void exitSelecao_decl(CLexerParser.Selecao_declContext ctx) {
        super.exitSelecao_decl(ctx);

        if(ctx.exception != null) {

            System.out.println("### ERRO de Declaracao de seleção: " + ctx.exception.fillInStackTrace().toString());

            System.out.println("Linha -> " + ctx.exception.getOffendingToken().getLine());
            System.out.println("Coluna -> " + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

}
