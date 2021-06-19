
grammar ConGrammar;
file: block NEWLINE? EOF;
block : expression? (NEWLINE expression)*
      | NEWLINE
      ;

expression: assignExp
          | callExp
          | declarationExp
          | conditionalExp
          | conditionalMultiExp
          | whileExp
          | commentExp
          | runExp
          | includeExp
          | returnExp
          ;

returnExp: RETURN;
commentExp: LINECOMMENT | BLOCKCOMMENT;
includeExp: INCLUDE literal (literal)*;
runExp: RUN literal (literal)*;
callExp: IDENTIFIER literal*;
assignExp: callExp ASSIGN IDENTIFIER;
declarationExp: declarationModifier IDENTIFIER ( INITIALIZER literal);
declarationModifier: VAR | CONST;
conditionalExp: IF condition NEWLINE block (NEWLINE ELSE NEWLINE block)? NEWLINE ENDIF;
conditionalMultiExp: IF condition NEWLINE (ELSEIF NEWLINE block)+ (NEWLINE ELSE NEWLINE block)? NEWLINE ENDIF;
whileExp: WHILE condition NEWLINE block NEWLINE ENDWHILE;
condition: IDENTIFIER comparator literal;
comparator: EQUAL | NOTEQUAL | GREATER | GREATEREQUAL | LESSEQUAL |  LESSEQUAL;

literal: STRING
        | IDENTIFIER
        | vector
        | NUMBER
        ;
vector: NUMBER '/' NUMBER '/' NUMBER;

NEWLINE: [\r\n\u2028\u2029]+;
// Variables modifiers
VAR: 'var';
CONST: 'const';
// Comments
LINECOMMENT: 'rem' ~[\r\n\u2028\u2029]*;
BLOCKCOMMENT: 'beginRem'.*? 'endRem'; 
// Condition Operators
WHILE: 'while';
ENDWHILE: 'endWhile';
IF: 'if';
ELSE: 'else';
ELSEIF: 'elseIf';
ENDIF: 'endIf';
// Binary operators
EQUAL: '=='| 'equals';
NOTEQUAL: '!='| 'notEquals';
LESS: '<'| 'lessThan';
LESSEQUAL: '<=' | 'lessOrEqualThan';
GREATER: '>'| 'greaterThan';
GREATEREQUAL: '>='| 'greaterOrEqualThan';
ASSIGN: '->';
INITIALIZER: '=';
// Unary operator
INCLUDE: 'include';
RUN: 'run';
// zero-operator
RETURN: 'return';

IDENTIFIER: [_:/\\.A-Za-z0-9]+;
STRING : '"' [_:/.\\A-Za-z0-9 ]* '"';
NUMBER : '-'? [0-9]+ ( '.' [0-9]+ )?;

WS: [ \t\r]+ -> skip ; // skip spaces, tabs, 


