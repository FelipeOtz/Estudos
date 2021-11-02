/*
 Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N, e mostre o
resultado obtido. Use o laço WHILE.
 */
package lista2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        int soma = 0;
        int contador = 0;
        
        while (contador <= numero) {
            soma = soma + contador;
            contador++;
        }
        
        System.out.println("O resultado da soma de todos os números, a partir de 1, até " + numero + " é: " + soma);
    }
    
}
