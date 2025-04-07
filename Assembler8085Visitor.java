// Generated from Assembler8085.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Assembler8085Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Assembler8085Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Assembler8085Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Assembler8085Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assembler8085Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(Assembler8085Parser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assembler8085Parser#data_transfer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_transfer(Assembler8085Parser.Data_transferContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assembler8085Parser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(Assembler8085Parser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assembler8085Parser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(Assembler8085Parser.LogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assembler8085Parser#branching}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranching(Assembler8085Parser.BranchingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assembler8085Parser#stack_io}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_io(Assembler8085Parser.Stack_ioContext ctx);
	/**
	 * Visit a parse tree produced by {@link Assembler8085Parser#special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(Assembler8085Parser.SpecialContext ctx);
}