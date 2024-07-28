// Generated from src/Avaj.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AvajParser}.
 */
public interface AvajListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AvajParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(AvajParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvajParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(AvajParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvajParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(AvajParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvajParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(AvajParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvajParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(AvajParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvajParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(AvajParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvajParser#funDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunDecl(AvajParser.FunDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvajParser#funDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunDecl(AvajParser.FunDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvajParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(AvajParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvajParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(AvajParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvajParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(AvajParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvajParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(AvajParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvajParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(AvajParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvajParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(AvajParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvajParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(AvajParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvajParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(AvajParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvajParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(AvajParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvajParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(AvajParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvajParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(AvajParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvajParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(AvajParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvajParser#outStmt}.
	 * @param ctx the parse tree
	 */
	void enterOutStmt(AvajParser.OutStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvajParser#outStmt}.
	 * @param ctx the parse tree
	 */
	void exitOutStmt(AvajParser.OutStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvajParser#inStmt}.
	 * @param ctx the parse tree
	 */
	void enterInStmt(AvajParser.InStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvajParser#inStmt}.
	 * @param ctx the parse tree
	 */
	void exitInStmt(AvajParser.InStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvajParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AvajParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvajParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AvajParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvajParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(AvajParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvajParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(AvajParser.ArgsContext ctx);
}