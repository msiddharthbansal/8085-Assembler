// Generated from Assembler8085.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Assembler8085Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, REGISTER=76, REGISTER_PAIR=77, IMMEDIATE=78, IMMEDIATE16=79, 
		PORT=80, ADDRESS=81, BYTE=82, WORD=83, HEX_DIGIT=84, COMMENT=85, WS=86;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_data_transfer = 2, RULE_arithmetic = 3, 
		RULE_logical = 4, RULE_branching = 5, RULE_stack_io = 6, RULE_special = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "data_transfer", "arithmetic", "logical", "branching", 
			"stack_io", "special"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MOV'", "','", "'M'", "'MVI'", "'LXI'", "'LDA'", "'STA'", "'LHLD'", 
			"'SHLD'", "'LDAX'", "'STAX'", "'XCHG'", "'ADD'", "'ADI'", "'ADC'", "'ACI'", 
			"'SUB'", "'SUI'", "'SBB'", "'SBI'", "'INR'", "'DCR'", "'INX'", "'DCX'", 
			"'DAD'", "'DAA'", "'ANA'", "'ANI'", "'XRA'", "'XRI'", "'ORA'", "'ORI'", 
			"'CMA'", "'CMC'", "'STC'", "'JMP'", "'JC'", "'JNC'", "'JZ'", "'JNZ'", 
			"'JP'", "'JM'", "'JPE'", "'JPO'", "'CALL'", "'CC'", "'CNC'", "'CZ'", 
			"'CNZ'", "'CP'", "'CM'", "'CPE'", "'CPO'", "'RET'", "'RC'", "'RNC'", 
			"'RZ'", "'RNZ'", "'RP'", "'RM'", "'RPE'", "'RPO'", "'PCHL'", "'PUSH'", 
			"'POP'", "'XTHL'", "'SPHL'", "'IN'", "'OUT'", "'NOP'", "'HLT'", "'DI'", 
			"'EI'", "'SIM'", "'RIM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "REGISTER", "REGISTER_PAIR", "IMMEDIATE", "IMMEDIATE16", 
			"PORT", "ADDRESS", "BYTE", "WORD", "HEX_DIGIT", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Assembler8085.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Assembler8085Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Assembler8085Parser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Assembler8085Visitor ) return ((Assembler8085Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				instruction();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -14L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4095L) != 0) );
			setState(21);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public Data_transferContext data_transfer() {
			return getRuleContext(Data_transferContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public BranchingContext branching() {
			return getRuleContext(BranchingContext.class,0);
		}
		public Stack_ioContext stack_io() {
			return getRuleContext(Stack_ioContext.class,0);
		}
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Assembler8085Visitor ) return ((Assembler8085Visitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				data_transfer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				arithmetic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				logical();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				branching();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				stack_io();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(28);
				special();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Data_transferContext extends ParserRuleContext {
		public List<TerminalNode> REGISTER() { return getTokens(Assembler8085Parser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(Assembler8085Parser.REGISTER, i);
		}
		public TerminalNode IMMEDIATE() { return getToken(Assembler8085Parser.IMMEDIATE, 0); }
		public TerminalNode REGISTER_PAIR() { return getToken(Assembler8085Parser.REGISTER_PAIR, 0); }
		public TerminalNode ADDRESS() { return getToken(Assembler8085Parser.ADDRESS, 0); }
		public Data_transferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_transfer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Assembler8085Visitor ) return ((Assembler8085Visitor<? extends T>)visitor).visitData_transfer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_transferContext data_transfer() throws RecognitionException {
		Data_transferContext _localctx = new Data_transferContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data_transfer);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(T__0);
				setState(32);
				match(REGISTER);
				setState(33);
				match(T__1);
				setState(34);
				match(REGISTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(T__0);
				setState(36);
				match(REGISTER);
				setState(37);
				match(T__1);
				setState(38);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(T__3);
				setState(40);
				match(REGISTER);
				setState(41);
				match(T__1);
				setState(42);
				match(IMMEDIATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				match(T__3);
				setState(44);
				match(T__2);
				setState(45);
				match(T__1);
				setState(46);
				match(IMMEDIATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(T__4);
				setState(48);
				match(REGISTER_PAIR);
				setState(49);
				match(T__1);
				setState(50);
				match(ADDRESS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				match(T__5);
				setState(52);
				match(ADDRESS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				match(T__6);
				setState(54);
				match(ADDRESS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				match(T__7);
				setState(56);
				match(ADDRESS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				match(T__8);
				setState(58);
				match(ADDRESS);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(59);
				match(T__9);
				setState(60);
				match(REGISTER_PAIR);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(61);
				match(T__10);
				setState(62);
				match(REGISTER_PAIR);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(63);
				match(T__11);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(Assembler8085Parser.REGISTER, 0); }
		public TerminalNode IMMEDIATE() { return getToken(Assembler8085Parser.IMMEDIATE, 0); }
		public TerminalNode REGISTER_PAIR() { return getToken(Assembler8085Parser.REGISTER_PAIR, 0); }
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Assembler8085Visitor ) return ((Assembler8085Visitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arithmetic);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(T__12);
				setState(67);
				match(REGISTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(T__12);
				setState(69);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(T__13);
				setState(71);
				match(IMMEDIATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(T__14);
				setState(73);
				match(REGISTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				match(T__14);
				setState(75);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				match(T__15);
				setState(77);
				match(IMMEDIATE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				match(T__16);
				setState(79);
				match(REGISTER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				match(T__16);
				setState(81);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(82);
				match(T__17);
				setState(83);
				match(IMMEDIATE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(84);
				match(T__18);
				setState(85);
				match(REGISTER);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(86);
				match(T__18);
				setState(87);
				match(T__2);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(88);
				match(T__19);
				setState(89);
				match(IMMEDIATE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(90);
				match(T__20);
				setState(91);
				match(REGISTER);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(92);
				match(T__20);
				setState(93);
				match(T__2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(94);
				match(T__21);
				setState(95);
				match(REGISTER);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(96);
				match(T__21);
				setState(97);
				match(T__2);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(98);
				match(T__22);
				setState(99);
				match(REGISTER_PAIR);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(100);
				match(T__23);
				setState(101);
				match(REGISTER_PAIR);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(102);
				match(T__24);
				setState(103);
				match(REGISTER_PAIR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(104);
				match(T__25);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(Assembler8085Parser.REGISTER, 0); }
		public TerminalNode IMMEDIATE() { return getToken(Assembler8085Parser.IMMEDIATE, 0); }
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Assembler8085Visitor ) return ((Assembler8085Visitor<? extends T>)visitor).visitLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logical);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__26);
				setState(108);
				match(REGISTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__26);
				setState(110);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(T__27);
				setState(112);
				match(IMMEDIATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(T__28);
				setState(114);
				match(REGISTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(T__28);
				setState(116);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				match(T__29);
				setState(118);
				match(IMMEDIATE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				match(T__30);
				setState(120);
				match(REGISTER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				match(T__30);
				setState(122);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(123);
				match(T__31);
				setState(124);
				match(IMMEDIATE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(125);
				match(T__32);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(126);
				match(T__33);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(127);
				match(T__34);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BranchingContext extends ParserRuleContext {
		public TerminalNode ADDRESS() { return getToken(Assembler8085Parser.ADDRESS, 0); }
		public BranchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branching; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Assembler8085Visitor ) return ((Assembler8085Visitor<? extends T>)visitor).visitBranching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchingContext branching() throws RecognitionException {
		BranchingContext _localctx = new BranchingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_branching);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__35);
				setState(131);
				match(ADDRESS);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__36);
				setState(133);
				match(ADDRESS);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(T__37);
				setState(135);
				match(ADDRESS);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(T__38);
				setState(137);
				match(ADDRESS);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				match(T__39);
				setState(139);
				match(ADDRESS);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				match(T__40);
				setState(141);
				match(ADDRESS);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				match(T__41);
				setState(143);
				match(ADDRESS);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				match(T__42);
				setState(145);
				match(ADDRESS);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 9);
				{
				setState(146);
				match(T__43);
				setState(147);
				match(ADDRESS);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 10);
				{
				setState(148);
				match(T__44);
				setState(149);
				match(ADDRESS);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 11);
				{
				setState(150);
				match(T__45);
				setState(151);
				match(ADDRESS);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 12);
				{
				setState(152);
				match(T__46);
				setState(153);
				match(ADDRESS);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 13);
				{
				setState(154);
				match(T__47);
				setState(155);
				match(ADDRESS);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 14);
				{
				setState(156);
				match(T__48);
				setState(157);
				match(ADDRESS);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 15);
				{
				setState(158);
				match(T__49);
				setState(159);
				match(ADDRESS);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 16);
				{
				setState(160);
				match(T__50);
				setState(161);
				match(ADDRESS);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 17);
				{
				setState(162);
				match(T__51);
				setState(163);
				match(ADDRESS);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 18);
				{
				setState(164);
				match(T__52);
				setState(165);
				match(ADDRESS);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 19);
				{
				setState(166);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 20);
				{
				setState(167);
				match(T__54);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 21);
				{
				setState(168);
				match(T__55);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 22);
				{
				setState(169);
				match(T__56);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 23);
				{
				setState(170);
				match(T__57);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 24);
				{
				setState(171);
				match(T__58);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 25);
				{
				setState(172);
				match(T__59);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 26);
				{
				setState(173);
				match(T__60);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 27);
				{
				setState(174);
				match(T__61);
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 28);
				{
				setState(175);
				match(T__62);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Stack_ioContext extends ParserRuleContext {
		public TerminalNode REGISTER_PAIR() { return getToken(Assembler8085Parser.REGISTER_PAIR, 0); }
		public TerminalNode PORT() { return getToken(Assembler8085Parser.PORT, 0); }
		public Stack_ioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_io; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Assembler8085Visitor ) return ((Assembler8085Visitor<? extends T>)visitor).visitStack_io(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_ioContext stack_io() throws RecognitionException {
		Stack_ioContext _localctx = new Stack_ioContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stack_io);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__63:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(T__63);
				setState(179);
				match(REGISTER_PAIR);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(T__64);
				setState(181);
				match(REGISTER_PAIR);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(T__65);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(T__66);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(T__67);
				setState(185);
				match(PORT);
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				match(T__68);
				setState(187);
				match(PORT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpecialContext extends ParserRuleContext {
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Assembler8085Visitor ) return ((Assembler8085Visitor<? extends T>)visitor).visitSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 4128769L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001V\u00c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"j\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0081\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b1\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00bd\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0000\u0001\u0002\u000066FK\u0107\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000"+
		"\u0000\u0006i\u0001\u0000\u0000\u0000\b\u0080\u0001\u0000\u0000\u0000"+
		"\n\u00b0\u0001\u0000\u0000\u0000\f\u00bc\u0001\u0000\u0000\u0000\u000e"+
		"\u00be\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011"+
		"\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013"+
		"\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016"+
		"\u0001\u0001\u0000\u0000\u0000\u0017\u001e\u0003\u0004\u0002\u0000\u0018"+
		"\u001e\u0003\u0006\u0003\u0000\u0019\u001e\u0003\b\u0004\u0000\u001a\u001e"+
		"\u0003\n\u0005\u0000\u001b\u001e\u0003\f\u0006\u0000\u001c\u001e\u0003"+
		"\u000e\u0007\u0000\u001d\u0017\u0001\u0000\u0000\u0000\u001d\u0018\u0001"+
		"\u0000\u0000\u0000\u001d\u0019\u0001\u0000\u0000\u0000\u001d\u001a\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0005\u0001"+
		"\u0000\u0000 !\u0005L\u0000\u0000!\"\u0005\u0002\u0000\u0000\"A\u0005"+
		"L\u0000\u0000#$\u0005\u0001\u0000\u0000$%\u0005L\u0000\u0000%&\u0005\u0002"+
		"\u0000\u0000&A\u0005\u0003\u0000\u0000\'(\u0005\u0004\u0000\u0000()\u0005"+
		"L\u0000\u0000)*\u0005\u0002\u0000\u0000*A\u0005N\u0000\u0000+,\u0005\u0004"+
		"\u0000\u0000,-\u0005\u0003\u0000\u0000-.\u0005\u0002\u0000\u0000.A\u0005"+
		"N\u0000\u0000/0\u0005\u0005\u0000\u000001\u0005M\u0000\u000012\u0005\u0002"+
		"\u0000\u00002A\u0005Q\u0000\u000034\u0005\u0006\u0000\u00004A\u0005Q\u0000"+
		"\u000056\u0005\u0007\u0000\u00006A\u0005Q\u0000\u000078\u0005\b\u0000"+
		"\u00008A\u0005Q\u0000\u00009:\u0005\t\u0000\u0000:A\u0005Q\u0000\u0000"+
		";<\u0005\n\u0000\u0000<A\u0005M\u0000\u0000=>\u0005\u000b\u0000\u0000"+
		">A\u0005M\u0000\u0000?A\u0005\f\u0000\u0000@\u001f\u0001\u0000\u0000\u0000"+
		"@#\u0001\u0000\u0000\u0000@\'\u0001\u0000\u0000\u0000@+\u0001\u0000\u0000"+
		"\u0000@/\u0001\u0000\u0000\u0000@3\u0001\u0000\u0000\u0000@5\u0001\u0000"+
		"\u0000\u0000@7\u0001\u0000\u0000\u0000@9\u0001\u0000\u0000\u0000@;\u0001"+
		"\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"A\u0005\u0001\u0000\u0000\u0000BC\u0005\r\u0000\u0000Cj\u0005L\u0000\u0000"+
		"DE\u0005\r\u0000\u0000Ej\u0005\u0003\u0000\u0000FG\u0005\u000e\u0000\u0000"+
		"Gj\u0005N\u0000\u0000HI\u0005\u000f\u0000\u0000Ij\u0005L\u0000\u0000J"+
		"K\u0005\u000f\u0000\u0000Kj\u0005\u0003\u0000\u0000LM\u0005\u0010\u0000"+
		"\u0000Mj\u0005N\u0000\u0000NO\u0005\u0011\u0000\u0000Oj\u0005L\u0000\u0000"+
		"PQ\u0005\u0011\u0000\u0000Qj\u0005\u0003\u0000\u0000RS\u0005\u0012\u0000"+
		"\u0000Sj\u0005N\u0000\u0000TU\u0005\u0013\u0000\u0000Uj\u0005L\u0000\u0000"+
		"VW\u0005\u0013\u0000\u0000Wj\u0005\u0003\u0000\u0000XY\u0005\u0014\u0000"+
		"\u0000Yj\u0005N\u0000\u0000Z[\u0005\u0015\u0000\u0000[j\u0005L\u0000\u0000"+
		"\\]\u0005\u0015\u0000\u0000]j\u0005\u0003\u0000\u0000^_\u0005\u0016\u0000"+
		"\u0000_j\u0005L\u0000\u0000`a\u0005\u0016\u0000\u0000aj\u0005\u0003\u0000"+
		"\u0000bc\u0005\u0017\u0000\u0000cj\u0005M\u0000\u0000de\u0005\u0018\u0000"+
		"\u0000ej\u0005M\u0000\u0000fg\u0005\u0019\u0000\u0000gj\u0005M\u0000\u0000"+
		"hj\u0005\u001a\u0000\u0000iB\u0001\u0000\u0000\u0000iD\u0001\u0000\u0000"+
		"\u0000iF\u0001\u0000\u0000\u0000iH\u0001\u0000\u0000\u0000iJ\u0001\u0000"+
		"\u0000\u0000iL\u0001\u0000\u0000\u0000iN\u0001\u0000\u0000\u0000iP\u0001"+
		"\u0000\u0000\u0000iR\u0001\u0000\u0000\u0000iT\u0001\u0000\u0000\u0000"+
		"iV\u0001\u0000\u0000\u0000iX\u0001\u0000\u0000\u0000iZ\u0001\u0000\u0000"+
		"\u0000i\\\u0001\u0000\u0000\u0000i^\u0001\u0000\u0000\u0000i`\u0001\u0000"+
		"\u0000\u0000ib\u0001\u0000\u0000\u0000id\u0001\u0000\u0000\u0000if\u0001"+
		"\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000j\u0007\u0001\u0000\u0000"+
		"\u0000kl\u0005\u001b\u0000\u0000l\u0081\u0005L\u0000\u0000mn\u0005\u001b"+
		"\u0000\u0000n\u0081\u0005\u0003\u0000\u0000op\u0005\u001c\u0000\u0000"+
		"p\u0081\u0005N\u0000\u0000qr\u0005\u001d\u0000\u0000r\u0081\u0005L\u0000"+
		"\u0000st\u0005\u001d\u0000\u0000t\u0081\u0005\u0003\u0000\u0000uv\u0005"+
		"\u001e\u0000\u0000v\u0081\u0005N\u0000\u0000wx\u0005\u001f\u0000\u0000"+
		"x\u0081\u0005L\u0000\u0000yz\u0005\u001f\u0000\u0000z\u0081\u0005\u0003"+
		"\u0000\u0000{|\u0005 \u0000\u0000|\u0081\u0005N\u0000\u0000}\u0081\u0005"+
		"!\u0000\u0000~\u0081\u0005\"\u0000\u0000\u007f\u0081\u0005#\u0000\u0000"+
		"\u0080k\u0001\u0000\u0000\u0000\u0080m\u0001\u0000\u0000\u0000\u0080o"+
		"\u0001\u0000\u0000\u0000\u0080q\u0001\u0000\u0000\u0000\u0080s\u0001\u0000"+
		"\u0000\u0000\u0080u\u0001\u0000\u0000\u0000\u0080w\u0001\u0000\u0000\u0000"+
		"\u0080y\u0001\u0000\u0000\u0000\u0080{\u0001\u0000\u0000\u0000\u0080}"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\t\u0001\u0000\u0000\u0000\u0082\u0083\u0005$"+
		"\u0000\u0000\u0083\u00b1\u0005Q\u0000\u0000\u0084\u0085\u0005%\u0000\u0000"+
		"\u0085\u00b1\u0005Q\u0000\u0000\u0086\u0087\u0005&\u0000\u0000\u0087\u00b1"+
		"\u0005Q\u0000\u0000\u0088\u0089\u0005\'\u0000\u0000\u0089\u00b1\u0005"+
		"Q\u0000\u0000\u008a\u008b\u0005(\u0000\u0000\u008b\u00b1\u0005Q\u0000"+
		"\u0000\u008c\u008d\u0005)\u0000\u0000\u008d\u00b1\u0005Q\u0000\u0000\u008e"+
		"\u008f\u0005*\u0000\u0000\u008f\u00b1\u0005Q\u0000\u0000\u0090\u0091\u0005"+
		"+\u0000\u0000\u0091\u00b1\u0005Q\u0000\u0000\u0092\u0093\u0005,\u0000"+
		"\u0000\u0093\u00b1\u0005Q\u0000\u0000\u0094\u0095\u0005-\u0000\u0000\u0095"+
		"\u00b1\u0005Q\u0000\u0000\u0096\u0097\u0005.\u0000\u0000\u0097\u00b1\u0005"+
		"Q\u0000\u0000\u0098\u0099\u0005/\u0000\u0000\u0099\u00b1\u0005Q\u0000"+
		"\u0000\u009a\u009b\u00050\u0000\u0000\u009b\u00b1\u0005Q\u0000\u0000\u009c"+
		"\u009d\u00051\u0000\u0000\u009d\u00b1\u0005Q\u0000\u0000\u009e\u009f\u0005"+
		"2\u0000\u0000\u009f\u00b1\u0005Q\u0000\u0000\u00a0\u00a1\u00053\u0000"+
		"\u0000\u00a1\u00b1\u0005Q\u0000\u0000\u00a2\u00a3\u00054\u0000\u0000\u00a3"+
		"\u00b1\u0005Q\u0000\u0000\u00a4\u00a5\u00055\u0000\u0000\u00a5\u00b1\u0005"+
		"Q\u0000\u0000\u00a6\u00b1\u00056\u0000\u0000\u00a7\u00b1\u00057\u0000"+
		"\u0000\u00a8\u00b1\u00058\u0000\u0000\u00a9\u00b1\u00059\u0000\u0000\u00aa"+
		"\u00b1\u0005:\u0000\u0000\u00ab\u00b1\u0005;\u0000\u0000\u00ac\u00b1\u0005"+
		"<\u0000\u0000\u00ad\u00b1\u0005=\u0000\u0000\u00ae\u00b1\u0005>\u0000"+
		"\u0000\u00af\u00b1\u0005?\u0000\u0000\u00b0\u0082\u0001\u0000\u0000\u0000"+
		"\u00b0\u0084\u0001\u0000\u0000\u0000\u00b0\u0086\u0001\u0000\u0000\u0000"+
		"\u00b0\u0088\u0001\u0000\u0000\u0000\u00b0\u008a\u0001\u0000\u0000\u0000"+
		"\u00b0\u008c\u0001\u0000\u0000\u0000\u00b0\u008e\u0001\u0000\u0000\u0000"+
		"\u00b0\u0090\u0001\u0000\u0000\u0000\u00b0\u0092\u0001\u0000\u0000\u0000"+
		"\u00b0\u0094\u0001\u0000\u0000\u0000\u00b0\u0096\u0001\u0000\u0000\u0000"+
		"\u00b0\u0098\u0001\u0000\u0000\u0000\u00b0\u009a\u0001\u0000\u0000\u0000"+
		"\u00b0\u009c\u0001\u0000\u0000\u0000\u00b0\u009e\u0001\u0000\u0000\u0000"+
		"\u00b0\u00a0\u0001\u0000\u0000\u0000\u00b0\u00a2\u0001\u0000\u0000\u0000"+
		"\u00b0\u00a4\u0001\u0000\u0000\u0000\u00b0\u00a6\u0001\u0000\u0000\u0000"+
		"\u00b0\u00a7\u0001\u0000\u0000\u0000\u00b0\u00a8\u0001\u0000\u0000\u0000"+
		"\u00b0\u00a9\u0001\u0000\u0000\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ab\u0001\u0000\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u000b\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005@\u0000\u0000\u00b3\u00bd\u0005M\u0000\u0000\u00b4\u00b5"+
		"\u0005A\u0000\u0000\u00b5\u00bd\u0005M\u0000\u0000\u00b6\u00bd\u0005B"+
		"\u0000\u0000\u00b7\u00bd\u0005C\u0000\u0000\u00b8\u00b9\u0005D\u0000\u0000"+
		"\u00b9\u00bd\u0005P\u0000\u0000\u00ba\u00bb\u0005E\u0000\u0000\u00bb\u00bd"+
		"\u0005P\u0000\u0000\u00bc\u00b2\u0001\u0000\u0000\u0000\u00bc\u00b4\u0001"+
		"\u0000\u0000\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bc\u00b7\u0001"+
		"\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bd\r\u0001\u0000\u0000\u0000\u00be\u00bf\u0007\u0000"+
		"\u0000\u0000\u00bf\u000f\u0001\u0000\u0000\u0000\u0007\u0013\u001d@i\u0080"+
		"\u00b0\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}