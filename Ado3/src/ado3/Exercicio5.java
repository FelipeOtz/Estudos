/* 
Leia um valor inteiro N do usuário, onde N é maior ou igual a 2 e menor ou igual a
1000.

A seguir, usando o laço DO-WHILE, mostre a tabuada de N no seguinte formato:
1 x N = N ... 2 x N = 2N ... 10 x N = 10N

*/
package ado3;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int x = input.nextInt();
        int contador = 1;
        
        if (x >= 2 && x <= 1000) {
            do {
            int resultado = x * contador;
            System.out.println(contador + " x " + x + " = " + resultado);
            contador++;
        } while (contador <= 10);
            
        } else {
            System.out.println("Número baixo demais ou alto demais.");
        }
        
    }
    
}
