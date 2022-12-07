                /* DESAFIO */
/*  Você receberá dois valores inteiros. Faça a eitura e em seguida calcule o produto entre estes dois valores.
    Atribuia esta operação à variavel PROD, mostrando esta de acordo com a mensagem de saída esperada

    ENTRADA: A entrada contém 2 valores inteiros.
    Saída: Exiba a variável PROD conforme exeplo abaixo, tendo obrigatoriedade um espaço em branco anes e depois da igualdade
*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    int A, B, PROD;

    A = leitor.nextInt();
    B = leitor.nextInt();

    PROD = A * B;

    System.out.println("PROD = " + PROD);

    leitor.close();
    }
}