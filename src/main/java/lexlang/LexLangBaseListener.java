//// Generated from LexLang.g4 by ANTLR 4.8
//
//package lexlang;
//
//
//import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.tree.ErrorNode;
//import org.antlr.v4.runtime.tree.TerminalNode;
//
///**
// * This class provides an empty implementation of {@link LexLangListener},
// * which can be extended to create a listener which only needs to handle a subset
// * of the available methods.
// */
//public class LexLangBaseListener implements LexLangListener {
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterProg(LexLangParser.ProgContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitProg(LexLangParser.ProgContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterData(LexLangParser.DataContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitData(LexLangParser.DataContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterDecl(LexLangParser.DeclContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitDecl(LexLangParser.DeclContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterFunc(LexLangParser.FuncContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitFunc(LexLangParser.FuncContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterParams(LexLangParser.ParamsContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitParams(LexLangParser.ParamsContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterType(LexLangParser.TypeContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitType(LexLangParser.TypeContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterBtype(LexLangParser.BtypeContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitBtype(LexLangParser.BtypeContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterCmd(LexLangParser.CmdContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitCmd(LexLangParser.CmdContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterExp(LexLangParser.ExpContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitExp(LexLangParser.ExpContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterRexp(LexLangParser.RexpContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitRexp(LexLangParser.RexpContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterAexp(LexLangParser.AexpContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitAexp(LexLangParser.AexpContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterMexp(LexLangParser.MexpContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitMexp(LexLangParser.MexpContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterSexp(LexLangParser.SexpContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitSexp(LexLangParser.SexpContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterPexp(LexLangParser.PexpContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitPexp(LexLangParser.PexpContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterLvalue(LexLangParser.LvalueContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitLvalue(LexLangParser.LvalueContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterExps(LexLangParser.ExpsContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitExps(LexLangParser.ExpsContext ctx) { }
//
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void enterEveryRule(ParserRuleContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void exitEveryRule(ParserRuleContext ctx) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void visitTerminal(TerminalNode node) { }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation does nothing.</p>
//	 */
//	@Override public void visitErrorNode(ErrorNode node) { }
//}