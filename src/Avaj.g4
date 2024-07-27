grammar Avaj;

start: (decl | stmt)*;
decl: (varDecl | funDecl)+;
varDecl: TYPE ID ATRIB (STRING | NUM) ';';
funDecl: TYPE ID AP (params)? FP AC (varDecl)* (stmt)* FC;
params: TYPE ID (',' TYPE ID)*;
stmt: (expr | ifStmt | whileStmt | returnStmt | outStmt | inStmt) ';';
ifStmt: COND AP expr FP AC (stmt)* FC (elseStmt)?;
elseStmt: 'esle' AC (stmt)* FC;
whileStmt: WHILE AP expr FP AC (stmt)* FC;
returnStmt: RET expr;
outStmt: OUT expr;
inStmt: IN ID;
expr: ID ATRIB expr | ID AP (args)? FP | expr OP expr | ID OPR ID | ID | NUM | STRING;
args: expr (',' expr)*;

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
ERROR: .;

fragment CHAR: [a-zA-Z];
fragment DIGIT: [0-9];