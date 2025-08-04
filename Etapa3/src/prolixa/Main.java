package prolixa;

import java.io.*;
import prolixa.lexer.*;
import prolixa.node.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String arquivo = "/home/john/Códigos/Ambiente-Java/compiladores_prolixa/Etapa2/teste/teste.prlx";

			// Teste do Lexer
			Lexer lexer = new Lexer(
								new PushbackReader(  
										new FileReader(arquivo), 1024)); 
										// new InputStreamReader(System.in), 1024)));
			Token token;
			while(!((token = lexer.next()) instanceof EOF)){
				System.out.println(token.getClass());
				System.out.println("( " + token.toString() + ")");
			}

			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}