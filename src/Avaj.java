import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Avaj {
    public static void main(String[] args) {
        String inputFileName = "src/exemplos.txt";
        try {
            CharStream input = CharStreams.fromFileName(inputFileName);
            AvajLexer lexer = new AvajLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AvajParser parser = new AvajParser(tokens);

            ParseTree tree = parser.start();

            System.out.println(tree.toStringTree(parser));
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}