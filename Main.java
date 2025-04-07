import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = args.length > 0 ? args[0] : null;
        InputStream is = inputFile != null ? new FileInputStream(inputFile) : System.in;

        CharStream input = CharStreams.fromStream(is);
        Assembler8085Lexer lexer = new Assembler8085Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Assembler8085Parser parser = new Assembler8085Parser(tokens);
        ParseTree tree = parser.program(); // Start parsing

        // Run Semantic Validation
        SemanticValidator.validate(tree);
    }
}

