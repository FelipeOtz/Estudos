/*
 * Crie uma função com parâmetro capaz de verificar se um
 * número é par ou ímpar.
 * 
 */
package ado4;

import java.util.Scanner;

public class Exercicio3 {

    static void parImpar (int a) {
        
        if (a % 2 == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        parImpar(numero);
    }
    
}
