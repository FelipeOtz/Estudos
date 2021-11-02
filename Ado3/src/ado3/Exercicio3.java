/*
Crie um laço que imprima uma contagem regressiva de 100 a 0, mas que decremente
de 5 em 5. Use o laço for.
*/
package ado3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 100; i >= 0; i = i - 5) {
            System.out.println(i);
        }
    }
    
}
