// Generated from C:/Users/famille meza/TEST/src\TEST.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TESTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TESTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TESTParser#start_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_rule(TESTParser.Start_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(TESTParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(TESTParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(TESTParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(TESTParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TESTParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(TESTParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#instAff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstAff(TESTParser.InstAffContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#instIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstIf(TESTParser.InstIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#instElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstElse(TESTParser.InstElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#instScan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstScan(TESTParser.InstScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#instPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstPrint(TESTParser.InstPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#instWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstWhile(TESTParser.InstWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(TESTParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(TESTParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TESTParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(TESTParser.Expression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#pm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPm(TESTParser.PmContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#md}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMd(TESTParser.MdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression2(TESTParser.Expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link TESTParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(TESTParser.ValueContext ctx);
}