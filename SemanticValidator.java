import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashSet;

public class SemanticValidator extends Assembler8085BaseVisitor<Void> {

    // Set of valid register pairs
    private static final HashSet<String> VALID_REGISTER_PAIRS = new HashSet<>();

    static {
        VALID_REGISTER_PAIRS.add("BC");
        VALID_REGISTER_PAIRS.add("DE");
        VALID_REGISTER_PAIRS.add("HL");
        VALID_REGISTER_PAIRS.add("SP");
    }

    public static void validate(ParseTree tree) {
        SemanticValidator validator = new SemanticValidator();
        validator.visit(tree);  // Ensures visitor traversal
    }

    @Override
    public Void visitData_transfer(Assembler8085Parser.Data_transferContext ctx) {
        if (ctx.getText().startsWith("LXI")) {
            String regPair = ctx.REGISTER_PAIR().getText();
            if (!VALID_REGISTER_PAIRS.contains(regPair)) {
                System.err.println("Error: Invalid register pair used with LXI: " + regPair);
            }
        }
        return null;
    }

    @Override
    public Void visitArithmetic(Assembler8085Parser.ArithmeticContext ctx) {
        if (ctx.getText().startsWith("INR") || ctx.getText().startsWith("DCR")) {
            String reg = ctx.REGISTER().getText();
            if (VALID_REGISTER_PAIRS.contains(reg)) {
                System.err.println("Error: INR/DCR cannot be used on a register pair: " + reg);
            }
        }
        return null;
    }

    @Override
    public Void visitBranching(Assembler8085Parser.BranchingContext ctx) {
        if (ctx.getText().startsWith("JMP") || ctx.getText().startsWith("CALL")) {
            String address = ctx.ADDRESS().getText();
            if (!isValidAddress(address)) {
                System.err.println("Error: Invalid address format: " + address);
            }
        }
        return null;
    }

    @Override
    public Void visitStack_io(Assembler8085Parser.Stack_ioContext ctx) {
        if (ctx.getText().startsWith("PUSH") || ctx.getText().startsWith("POP")) {
            String regPair = ctx.REGISTER_PAIR().getText();
            if (!VALID_REGISTER_PAIRS.contains(regPair)) {
                System.err.println("Error: Invalid register pair used with PUSH/POP: " + regPair);
            }
        }
        return null;
    }

    @Override
    public Void visitSpecial(Assembler8085Parser.SpecialContext ctx) {
        if (ctx.getText().startsWith("NOP") || ctx.getText().startsWith("HLT")) {
            System.out.println("Note: Special instruction detected: " + ctx.getText());
        }
        return null;
    }

    /**
     * Validates if the address is a proper 16-bit hexadecimal value.
     */
    private boolean isValidAddress(String address) {
        return address.matches("0x[0-9A-Fa-f]{4}");
    }
}

