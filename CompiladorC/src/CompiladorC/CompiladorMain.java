package CompiladorC;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by kakau on 19/10/16.
 */
public class CompiladorMain {

   public static void main (String... args) throws IOException {

       String fileName = "./teste2.c";

       File file = new File(fileName);

       FileInputStream fis = null;

       fis = new FileInputStream(file);

       ANTLRInputStream input = new ANTLRInputStream(fis);

       CLexerLexer scanner = new CLexerLexer(input);

       CommonTokenStream allTokensGenerated = new CommonTokenStream(scanner);

       CLexerParser parser = new CLexerParser(allTokensGenerated);

       CLexerParser.ProgramaContext compilationUnitContext = parser.programa();

       ParseTreeWalker treeWalker = new ParseTreeWalker();

       CListener listener = new CListener(parser, allTokensGenerated);

       treeWalker.walk(listener, compilationUnitContext);

       //System.out.println("\nModificado -->" +listener.tokenStreamRewriter.getText());


   }
}
