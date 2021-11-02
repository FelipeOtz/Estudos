/*
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida do usuário.
Para cada valor lido, mostre uma mensagem em português dizendo se este valor lido é par (PAR), ímpar
(ÍMPAR), positivo (POSITIVO) ou negativo (NEGATIVO). No caso do valor ser igual a zero (0), seu programa
deverá imprimir apenas NULO. Utilize o laço DO-WHILE.
 */
package lista2;

import java.util.Scanner;

public class exercicio16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de números que serão verificados: ");
        int verificacao = input.nextInt();
        int contador = 1;
        
        do {
            System.out.println("Digite um número: ");
            float numero = input.nextFloat();
            
            if (numero == 0) {
                System.out.println("NULO");
            }
            
            if (numero > 0) {
                System.out.println("POSITIVO");
                if (numero % 2 == 0) {
                    System.out.println("PAR");
                } else {
                    System.out.println("ÍMPAR");
                }
            }
            
            if (numero < 0) {
                System.out.println("NEGATIVO");
                if (numero % 2 == 0) {
                    System.out.println("PAR");
                } else {
                    System.out.println("ÍMPAR");
                }
            }
            
            contador++;
            
        } while (contador <= verificacao);
    }  
}
