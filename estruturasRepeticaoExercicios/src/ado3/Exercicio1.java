// Faça um programa que mostre os números pares entre 1 e 100, inclusive. Use o laço
// while.

package Ado3;

public class Exercicio1 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int contador = 0;
        
        while (contador <= 100) {
            if (contador % 2 == 0 && contador != 0) {
                System.out.println(contador);
            }
            contador++;
        }
    }
}
