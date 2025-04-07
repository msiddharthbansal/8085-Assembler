grammar Assembler8085;

// Parser rules
program: instruction+ EOF;

instruction: data_transfer
           | arithmetic
           | logical
           | branching
           | stack_io
           | special;

data_transfer: 'MOV' REGISTER ',' REGISTER
             | 'MOV' REGISTER ',' 'M'
             | 'MVI' REGISTER ',' IMMEDIATE
             | 'MVI' 'M' ',' IMMEDIATE
             | 'LXI' REGISTER_PAIR ',' ADDRESS
             | 'LDA' ADDRESS
             | 'STA' ADDRESS
             | 'LHLD' ADDRESS
             | 'SHLD' ADDRESS
             | 'LDAX' REGISTER_PAIR
             | 'STAX' REGISTER_PAIR
             | 'XCHG';

arithmetic: 'ADD' REGISTER
          | 'ADD' 'M'
          | 'ADI' IMMEDIATE
          | 'ADC' REGISTER
          | 'ADC' 'M'
          | 'ACI' IMMEDIATE
          | 'SUB' REGISTER
          | 'SUB' 'M'
          | 'SUI' IMMEDIATE
          | 'SBB' REGISTER
          | 'SBB' 'M'
          | 'SBI' IMMEDIATE
          | 'INR' REGISTER
          | 'INR' 'M'
          | 'DCR' REGISTER
          | 'DCR' 'M'
          | 'INX' REGISTER_PAIR
          | 'DCX' REGISTER_PAIR
          | 'DAD' REGISTER_PAIR
          | 'DAA';

logical: 'ANA' REGISTER
       | 'ANA' 'M'
       | 'ANI' IMMEDIATE
       | 'XRA' REGISTER
       | 'XRA' 'M'
       | 'XRI' IMMEDIATE
       | 'ORA' REGISTER
       | 'ORA' 'M'
       | 'ORI' IMMEDIATE
       | 'CMA'
       | 'CMC'
       | 'STC';

branching: 'JMP' ADDRESS
         | 'JC' ADDRESS
         | 'JNC' ADDRESS
         | 'JZ' ADDRESS
         | 'JNZ' ADDRESS
         | 'JP' ADDRESS
         | 'JM' ADDRESS
         | 'JPE' ADDRESS
         | 'JPO' ADDRESS
         | 'CALL' ADDRESS
         | 'CC' ADDRESS
         | 'CNC' ADDRESS
         | 'CZ' ADDRESS
         | 'CNZ' ADDRESS
         | 'CP' ADDRESS
         | 'CM' ADDRESS
         | 'CPE' ADDRESS
         | 'CPO' ADDRESS
         | 'RET'
         | 'RC'
         | 'RNC'
         | 'RZ'
         | 'RNZ'
         | 'RP'
         | 'RM'
         | 'RPE'
         | 'RPO'
         | 'PCHL';

stack_io: 'PUSH' REGISTER_PAIR
        | 'POP' REGISTER_PAIR
        | 'XTHL'
        | 'SPHL'
        | 'IN' PORT
        | 'OUT' PORT;

special: 'NOP'
       | 'HLT'
       | 'DI'
       | 'EI'
       | 'SIM'
       | 'RIM'
       | 'RET';

// Lexer rules (must start with uppercase)
REGISTER: 'A' | 'B' | 'C' | 'D' | 'E' | 'H' | 'L';
REGISTER_PAIR: 'BC' | 'DE' | 'HL' | 'SP';

IMMEDIATE: '#' BYTE;
IMMEDIATE16: '#' WORD;
PORT: '0x' BYTE; // Ensure only BYTE-sized hexadecimal values are considered as PORT
ADDRESS: '0x' WORD; // Ensure only WORD-sized hexadecimal values are considered as ADDRESS

BYTE: HEX_DIGIT HEX_DIGIT;
WORD: HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;
HEX_DIGIT: [0-9A-Fa-f];

// Ignore spaces and newlines
COMMENT : ';' ~[\r\n]* -> skip ; // Ignore everything after ';' till the end of the line
WS      : [ \t\r\n]+ -> skip ;  // Ignore whitespace

