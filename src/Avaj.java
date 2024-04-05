import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import java.io.IOException;

public class Avaj {
    public static void main(String[] args) {
        String inputFileName = "src/exemplos.txt";
        try {
            CharStream input = CharStreams.fromFileName(inputFileName);
            AvajLexer lexer = new AvajLexer(input);
            Token token;
            while (!lexer._hitEOF) {
                token = lexer.nextToken();
                System.out.println("Token: " + token.toString());
                System.out.println("  Lexema: " + token.getText());
                System.out.println("  Classe: " + lexer.getVocabulary().getDisplayName(token.getType()));
                System.out.println("  Linha: " + token.getType());
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}