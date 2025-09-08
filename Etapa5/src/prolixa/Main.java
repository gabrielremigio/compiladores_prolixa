package prolixa;

import java.io.*;
import prolixa.analysis.PrettyPrinter;
import prolixa.lexer.*;
import prolixa.node.*;
import prolixa.parser.*;

public class Main
{
	public static void main(String[] args)
	{

		Parser parser;
		try
		{
			String arquivo = "/home/jose-gabriel/Documents/Ufs/2025.1/Compiladores/compiladores_prolixa/Etapa4/teste/teste.prlx";

			// // Teste do Lexer
			// Lexer lexer = new Lexer(
			// 					new PushbackReader(  
			// 							new FileReader(arquivo), 1024)); 
			// 							// new InputStreamReader(System.in), 1024)));
			// Token token;
			// while(!((token = lexer.next()) instanceof EOF)){
			// 	System.out.println(token.getClass());
			// 	System.out.println("( " + token.toString() + ")");
			// }

			// Teste do Parser
			parser = new prolixa.parser.Parser(
								new Lexer(
									new PushbackReader(  
											new FileReader(arquivo), 1024))); 
											// new InputStreamReader(System.in), 1024)));
			Start tree = parser.parse();

			tree.apply(new PrettyPrinter());

			} catch (prolixa.parser.ParserException e) {
            System.err.println("Erro de sintaxe: " + e.getMessage());
        } catch (prolixa.lexer.LexerException e) {
            System.err.println("Erro léxico: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
	}
}
