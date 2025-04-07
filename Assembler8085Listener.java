// Generated from Assembler8085.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Assembler8085Parser}.
 */
public interface Assembler8085Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Assembler8085Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Assembler8085Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assembler8085Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Assembler8085Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assembler8085Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(Assembler8085Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assembler8085Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(Assembler8085Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assembler8085Parser#data_transfer}.
	 * @param ctx the parse tree
	 */
	void enterData_transfer(Assembler8085Parser.Data_transferContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assembler8085Parser#data_transfer}.
	 * @param ctx the parse tree
	 */
	void exitData_transfer(Assembler8085Parser.Data_transferContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assembler8085Parser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(Assembler8085Parser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assembler8085Parser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(Assembler8085Parser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assembler8085Parser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(Assembler8085Parser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assembler8085Parser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(Assembler8085Parser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assembler8085Parser#branching}.
	 * @param ctx the parse tree
	 */
	void enterBranching(Assembler8085Parser.BranchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assembler8085Parser#branching}.
	 * @param ctx the parse tree
	 */
	void exitBranching(Assembler8085Parser.BranchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assembler8085Parser#stack_io}.
	 * @param ctx the parse tree
	 */
	void enterStack_io(Assembler8085Parser.Stack_ioContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assembler8085Parser#stack_io}.
	 * @param ctx the parse tree
	 */
	void exitStack_io(Assembler8085Parser.Stack_ioContext ctx);
	/**
	 * Enter a parse tree produced by {@link Assembler8085Parser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(Assembler8085Parser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assembler8085Parser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(Assembler8085Parser.SpecialContext ctx);
}