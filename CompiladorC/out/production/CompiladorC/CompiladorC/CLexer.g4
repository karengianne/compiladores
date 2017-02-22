grammar  CLexer;

// []  simbolos entre [ e ] sao opcionais;
// {}  simbolos entre { e } sao repeticoes (zero ou mais).
// (?) optional
// (*) zero-or-more
// (+) one-or-more

// <programa> ::= <declaracao-lista>
programa
    : declaracao_lista
    ;

// <declaracao-lista> ::= <declaracao> {<declaracao>}
declaracao_lista
    : declaracao (declaracao)*
    ;

// <declaracao> ::= <var-declaracao> | <fun-declaracao>
declaracao
    : var_declaracao | fun_declaracao
    ;

// <var-declaracao> ::= <tipo-especificador> <ident> ;
// | <tipo-especificador> <ident> <abre-colchete> <num-int> <fecha-colchete> {<abre-colchete> <num-int> <fecha-colchete>} ;
var_declaracao
    : TIPO_ESPECIFICADOR IDENT PONTO_VIRGULA
    | TIPO_ESPECIFICADOR IDENT ABRE_COLCHETE NUM_INT FECHA_COLCHETE (ABRE_COLCHETE NUM_INT FECHA_COLCHETE)* PONTO_VIRGULA
    ;

// <atributos-declaracao> ::= <var-declaracao> { <var-declaracao> }
atributos_declaracao
    :	var_declaracao (var_declaracao)*
    ;

//	<fun-declaracao> ::= <tipo-especificador> <ident> ( <params> ) <composto-decl>
fun_declaracao
    : TIPO_ESPECIFICADOR IDENT ABRE_PARENT params FECHA_PARENT composto_decl
    ;

// <params> ::= <param-lista> | void
params
    : param_lista
    | VOID
    ;

// <param-lista> ::= <param> {, <param>}
param_lista
    : param (VIRGULA param)*
    ;

// <param> ::= <tipo-especificador> <ident> | <tipo-especificador> <ident> <abre-colchete> <fecha-colchete>
param
    : TIPO_ESPECIFICADOR IDENT
    | TIPO_ESPECIFICADOR IDENT ABRE_COLCHETE FECHA_COLCHETE
    ;

// <composto-decl> ::= <abre-chave> <local-declaracoes> <comando-lista> <fecha-chave>
composto_decl
    : ABRE_CHAVE local_declaracoes comando_lista FECHA_CHAVE
    ;

// <local-declaracoes> ::= {<var-declaracao>}
local_declaracoes
    : (var_declaracao)*
    ;

// <comando-lista> ::= { <comando> }
comando_lista
    : (comando)*
    ;

// <comando> ::= <expressao-decl> | <composto-decl> | <selecao-decl> | <iteracao-decl> | <retorno-decl>
comando
    : expressao_decl
    | composto_decl
    | selecao_decl
    | iteracao_decl
    | retorno_decl
    ;

// <expressao_decl> ::= <expressao> ; | ;
expressao_decl
    : expressao PONTO_VIRGULA
    | PONTO_VIRGULA
    ;

// <selecao-decl> ::= 	if ( <expressao> ) <comando> |
// 						if ( <expressao> ) <comando> else <comando>
selecao_decl
    :	'if' ABRE_PARENT expressao FECHA_PARENT comando
    |	'if' ABRE_PARENT expressao FECHA_PARENT comando 'else' comando
    ;

// <iteracao-decl> ::= while ( <express~ao> ) <comando>
iteracao_decl
    :	'while' ABRE_PARENT expressao FECHA_PARENT comando
    ;

// <args> ::= [<arg-lista>]
args
    : 	arg_lista?
    ;

// <ativacao> ::= <ident> ( <args> )
ativacao
    :	IDENT ABRE_PARENT args FECHA_PARENT
    ;

//<arg-lista> ::= <express˜ao> {, <express˜ao>}
arg_lista
    : expressao (VIRGULA expressao)*
    ;

//<var> ::= <ident>|<ident><abre-colchete><express˜ao><fecha-colchete>{<abre-colchete><express˜ao><fecha-colchete>}
var
    : IDENT
    | IDENT ABRE_COLCHETE expressao FECHA_COLCHETE (ABRE_COLCHETE expressao FECHA_COLCHETE)*
    ;

// <expressão> ::= <var> = <expressão> | <expressão-simples>
expressao
    : var SINAL_IGUAL expressao
    | expressao_simples
    ;

//<expressão-simples> ::= <expressão-soma> <relacional> <expressão-soma> | <expressão-soma>
expressao_simples
    : expressao_soma RELACIONAL expressao_soma
    | expressao_soma
    ;

// <expressão-soma> ::= <termo> {<soma> <termo>}
expressao_soma
    : termo (SOMA termo)*
    ;

// <termo> ::= <fator> {<mult> <fator>}
termo
    : fator (MULT fator)*
    ;

// <fator> ::= ( <expressão> ) | <var> | <ativação> | <num> | <num-int>
fator
    : ABRE_PARENT expressao FECHA_PARENT
    | var
    | ativacao
    | NUM
    | NUM_INT
    ;

TIPO_ESPECIFICADOR
	: INT
	| FLOAT
	| CHAR
	| VOID
	;

// <retorno-decl> ::= return ; | return <expressão> ;
retorno_decl
    : 'return' PONTO_VIRGULA
    | 'return' expressao PONTO_VIRGULA
    ;

// <ident> ::= <letra> {<letra> | <dı́gito>}
IDENT
    : LETRA ( LETRA | DIGITO )*
    ;

// LEXER

// Keywords
COMENTARIO  :   '/*' ~('\n'|'\r')* '\r'? '\n' {skip();};
RELACIONAL	:	'>' | '>=' | '<' | '<=' | '!=' | '==';
SOMA	:	'+' | '-';
MULT    :   '*' | '/';
VIRGULA : ',' ;
PONTO_VIRGULA:  ';' ;
DELIM	:	';' | VIRGULA;
ABRE_PARENT :	'(';
FECHA_PARENT:	')';
ABRE_COLCHETE :	'[';
FECHA_COLCHETE:	']';
ABRE_CHAVE :	'{';
FECHA_CHAVE:	'}';
CIFRAO		:	'$';
CIRCUNFLEXO	:	'^';
PONTO       :   '.';
BARRA       :   '/';

VOID        :   'void';
INT         :   'int';
FLOAT       :   'float';
CHAR        :   'char';
SINAL_IGUAL:    '=';

LETRA : ('a'..'z') ;


//<num> ::= [+ | -] <dı́gito> {<dı́gito>} [. <dı́gito> {<dı́gito>}] [E [+ | -] <dı́gito> {<dı́gito>}]
NUM: ('+'|'-')? DIGITO (DIGITO)* (PONTO (DIGITO)+)? ('E' ('+'|'-')? (DIGITO)+)?;

NUM_INT : DIGITO (DIGITO)* ;

DIGITO	: '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9';

LETRA_MAIUSC : [A-Z];

fragment ESC_SEQ	: '\\\'';

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;


// erro de variavel que começa com letra maiuscula
ERRO_IDENT_MAIUSCULO : (LETRA_MAIUSC)((LETRA)(LETRA_MAIUSC)*(DIGITO)*)*;

// Tratamentos de erros
UNTERMINATED_COMMENT :  '/*' ('*' ~'/' | ~'*')*? EOF -> channel(HIDDEN) ;

ERRO_DUPLO_MULT : MULT MULT  {
    try {
        throw new Exception("Erro - expressão inválida");
    } catch (Exception e) {
        e.printStackTrace();
    }} ;

 ERRO_DUPLO_DELIM : DELIM DELIM  {
     try {
         throw new Exception("Erro - expressão inválida");
     } catch (Exception e) {
         e.printStackTrace();
     }} ;


//ERRO_FLOAT : 'float' NUM_INT '.' ~('0'..'9')*?{
//     try {
//         throw new Exception("Erro - expressão desconhecida");
//     } catch (Exception e) {
//         e.printStackTrace();
//     }} ;

//ERRO_ARGUMENTOS_LISTA : VIRGULA TIPO_ESPECIFICADOR (~('0'..'9') | ~('a'..'z'|'A'..'Z'))+? EOF -> channel(HIDDEN) ;