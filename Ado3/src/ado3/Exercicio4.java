/*
 * Use o laço while para ler 06 valores do usuário. Ao final do laço, imprimir:
 * 1. Soma de todos os valores digitados que foram positivos;
 * 2. Quantidade de valores digitados que foram positivos.
 * 3. Média (decimal) de todos os valores digitados que foram positivos
 * 
 */
package ado3;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 1;
        int x;
        int soma = 0;
        int contadorPositivo = 0;
        
        while (i <= 6) {
            System.out.println("Digite um número: ");
            x = input.nextInt();
            if (x > 0) {
                soma = soma + x;
                System.out.println("Etapa " + i + ". Soma total: " + soma);
                contadorPositivo++;
                System.out.println("Números positivos digitados até o momento: " + contadorPositivo);
            } else {
                System.out.println("Etapa " + i + ". Soma total: " + soma + ". Negativos não são contabilizados.");
            }
            i++;
        }
        
        float media = soma / contadorPositivo;
        System.out.println("A média de todos os valores positivos é de: " + media);
    }
    
}
