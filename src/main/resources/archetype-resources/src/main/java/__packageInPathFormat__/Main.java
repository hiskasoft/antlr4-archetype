#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package};
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    private static final String EXTENSION = "${fileExtension}";
    private static final String DIRBASE = "src/test/resources/";
    

    public static void main(String[] args) throws IOException {
        String files[] = args.length==0? new String[]{ "test." + EXTENSION } : args;
        System.out.println("Process dirbase: " + DIRBASE);
        for (String file : files){
            System.out.println("Interpreting file " + file);

            ${grammarName}Lexer lexer = new ${grammarName}Lexer(new ANTLRFileStream( DIRBASE + file));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ${grammarName}Parser parser = new ${grammarName}Parser(tokens);
            ${grammarName}Parser.StartContext tree = parser.start();
            ${grammarName}CustomVisitor visitor = new ${grammarName}CustomVisitor();
            visitor.visit(tree);

            System.out.println("Interpretation finished");
        }

    }

}
