grammar Avaj;

TYPE: 'tni' | 'taolf' | 'gnirts' | 'loob';
STRING: '"' .*? '"';
ATRIB: '=';
AP: '(';
FP: ')';
AC: '{';
FC: '}';
OP: '/' | '*' | '+' | '-';
OPR: '==' | '!=' | '<' | '>' | '<=' | '>=';
IN: 'tupni';
OUT: 'tnirp';
RET: 'nruter';
COND: 'fi' | 'esle' | 'esle fi';
WHILE: 'elihw';
NUM: DIGIT ('.' DIGIT+)?;
ID: CHAR (CHAR | DIGIT)*;
WS: [ \r\n\t]+ -> skip;

fragment CHAR: [a-zA-Z];
fragment DIGIT: [0-9];