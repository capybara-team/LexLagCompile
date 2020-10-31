/*
 * @author Maxwell Souza    201435009
 * @author Rodolpho Rossete 201435032
 */
package lang;

import ast.SuperNode;
import parser.LexLangParseAdaptor;
import parser.ParseAdaptor;
import parser.TestParser;

public class LangCompiler {
	// Recupera o nome base (sem extens�o) de um arquivo.
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Lang compiler v 0.0.1 - Outubro de 2020");
			System.out.println("Use java -cp . Lang ação <Caminho para código Fonte> ");
			System.out.println("Ação (uma das seguintes possibilidades): ");

			System.out.println(" -bs : Executa uma bateria de testes sintáticos;");
			System.out
					.println(" <nome_arquivo> : Executa uma bateria de testes sintáticos para um arquivo específico.");

		}
		try {
			ParseAdaptor langParser = new LexLangParseAdaptor();

			if (args.length == 2) {
				if (args[0].equals("-bs")) {
					System.out.println("Executando bateria de testes sintáticos:");
					TestParser tp = new TestParser(langParser, args[1]);
					return;
				}

			}

			if (args.length == 1) {
				if (args[0].equals("-bs")) {
					System.out.println("Executando bateria de testes sintáticos:");
					TestParser tp = new TestParser(langParser, null);
					return;
				}else {
					
					System.out.print("Testando " + args[0] + " [");
					if (langParser.parseFile(args[0]) != null) {
						System.out.println(" OK  ]");
					} else {
						System.out.println(" FALHOU ]");
					}
				}


			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
