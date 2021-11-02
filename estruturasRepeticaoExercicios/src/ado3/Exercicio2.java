/* 
Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha,
inclusive o X, se for o caso. Use o laço for.
*/

package ado3;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int x = input.nextInt();
        
        for (int contador = 0; contador <= x; contador++) {
            if (contador % 2 != 0 && contador != 0) {
                System.out.println(contador);
            }
        }
    }
    
}
