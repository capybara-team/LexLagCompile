// Generated from LexLang.g4 by ANTLR 4.8

package lexlang;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LexLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LexLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LexLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LexLangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(LexLangParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(LexLangParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(LexLangParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LexLangParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LexLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBtype(LexLangParser.BtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(LexLangParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LexLangParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#rexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRexp(LexLangParser.RexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexp(LexLangParser.AexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#mexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMexp(LexLangParser.MexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#sexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSexp(LexLangParser.SexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#pexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp(LexLangParser.PexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(LexLangParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexLangParser#exps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExps(LexLangParser.ExpsContext ctx);
}