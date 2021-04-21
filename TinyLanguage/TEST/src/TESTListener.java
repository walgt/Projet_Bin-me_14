// Generated from C:/Users/famille meza/TEST/src\TEST.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TESTParser}.
 */
public interface TESTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TESTParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void enterStart_rule(TESTParser.Start_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void exitStart_rule(TESTParser.Start_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(TESTParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(TESTParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(TESTParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(TESTParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(TESTParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(TESTParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(TESTParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(TESTParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TESTParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TESTParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(TESTParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(TESTParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#instAff}.
	 * @param ctx the parse tree
	 */
	void enterInstAff(TESTParser.InstAffContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#instAff}.
	 * @param ctx the parse tree
	 */
	void exitInstAff(TESTParser.InstAffContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#instIf}.
	 * @param ctx the parse tree
	 */
	void enterInstIf(TESTParser.InstIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#instIf}.
	 * @param ctx the parse tree
	 */
	void exitInstIf(TESTParser.InstIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#instElse}.
	 * @param ctx the parse tree
	 */
	void enterInstElse(TESTParser.InstElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#instElse}.
	 * @param ctx the parse tree
	 */
	void exitInstElse(TESTParser.InstElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#instScan}.
	 * @param ctx the parse tree
	 */
	void enterInstScan(TESTParser.InstScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#instScan}.
	 * @param ctx the parse tree
	 */
	void exitInstScan(TESTParser.InstScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#instPrint}.
	 * @param ctx the parse tree
	 */
	void enterInstPrint(TESTParser.InstPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#instPrint}.
	 * @param ctx the parse tree
	 */
	void exitInstPrint(TESTParser.InstPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#instWhile}.
	 * @param ctx the parse tree
	 */
	void enterInstWhile(TESTParser.InstWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#instWhile}.
	 * @param ctx the parse tree
	 */
	void exitInstWhile(TESTParser.InstWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(TESTParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(TESTParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(TESTParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(TESTParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TESTParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TESTParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(TESTParser.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(TESTParser.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#pm}.
	 * @param ctx the parse tree
	 */
	void enterPm(TESTParser.PmContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#pm}.
	 * @param ctx the parse tree
	 */
	void exitPm(TESTParser.PmContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#md}.
	 * @param ctx the parse tree
	 */
	void enterMd(TESTParser.MdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#md}.
	 * @param ctx the parse tree
	 */
	void exitMd(TESTParser.MdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterExpression2(TESTParser.Expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitExpression2(TESTParser.Expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link TESTParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(TESTParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TESTParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(TESTParser.ValueContext ctx);
}