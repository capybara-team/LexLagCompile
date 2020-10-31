package parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ast.LexLangSuperNote;
import ast.SuperNode;
import lexlang.LexLangLexer;
import lexlang.LexLangParser;

public class LexLangParseAdaptor implements ParseAdaptor {

	public SuperNode parseFile(String path) {

		try {
			CharStream stream = CharStreams.fromFileName(path);

			LexLangLexer lex = new LexLangLexer(stream);

			CommonTokenStream tokens = new CommonTokenStream(lex);

			LexLangParser parser = new LexLangParser(tokens);

			ParseTree tree = parser.prog();
			
			parser.getNumberOfSyntaxErrors();
			
			if(parser.getNumberOfSyntaxErrors() > 0) {
				return null;
			}

			return new LexLangSuperNote();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
