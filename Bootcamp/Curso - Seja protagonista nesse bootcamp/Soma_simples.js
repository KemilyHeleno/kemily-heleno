                /* DESAFIO */
/*  Leia dois valores inteiros identificados como variáveis A e B.
    Calcule a soma entre elase chame essa variável de SOMA.
    A seguir escreva o valor desta variável.

    ENTRADA: O arquivo de entrada contém 2 valores inteiros.
    Saída: Imprima a variável SOMA com todas as letras maiúsculas inserindo,
    um espaço em branco antes e depois do símbolo da igualdade seguido pelo
    valor da soma de A e B
*/

// A função gets é implementada dentro do sistema para ler as entradas (inputs) dos dados
// A função "print" imprime a saída (output) de dados e já pula uma ljnha ("\n")

let A = parseInt(gets());
let B = parseInt(gets());

let SOMA = A + B;
print("SOMA = " + SOMA);