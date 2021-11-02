/*
 * Crie uma função com dois parâmetros numéricos capaz de
 * verificar qual número é o maior e retorná-lo.
 * Feito.
 */
package ado4;

import java.util.Scanner;

public class Exercicio2 {
    
    static int maximo (int a, int b){
        
        int max = 0;
        
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = input.nextInt();
        int resultado = maximo(num1, num2);
        System.out.println("Máximo: " + resultado);
    }
    
}
