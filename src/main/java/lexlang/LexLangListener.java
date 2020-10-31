// Generated from final/LexLang.g4 by ANTLR 4.8

package lexlang;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexLangParser}.
 */
public interface LexLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LexLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LexLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(LexLangParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(LexLangParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(LexLangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(LexLangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(LexLangParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(LexLangParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(LexLangParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(LexLangParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LexLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LexLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterBtype(LexLangParser.BtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitBtype(LexLangParser.BtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(LexLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(LexLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(LexLangParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(LexLangParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void enterRexp(LexLangParser.RexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#rexp}.
	 * @param ctx the parse tree
	 */
	void exitRexp(LexLangParser.RexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterAexp(LexLangParser.AexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitAexp(LexLangParser.AexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterMexp(LexLangParser.MexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitMexp(LexLangParser.MexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterSexp(LexLangParser.SexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitSexp(LexLangParser.SexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void enterPexp(LexLangParser.PexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#pexp}.
	 * @param ctx the parse tree
	 */
	void exitPexp(LexLangParser.PexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(LexLangParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(LexLangParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexLangParser#exps}.
	 * @param ctx the parse tree
	 */
	void enterExps(LexLangParser.ExpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexLangParser#exps}.
	 * @param ctx the parse tree
	 */
	void exitExps(LexLangParser.ExpsContext ctx);
}