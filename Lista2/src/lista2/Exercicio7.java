/*
 * Escreva um programa que imprima todos os múltiplos de 7 menores que 200. Use o laço WHILE.
 */
package lista2;

public class Exercicio7 {

    public static void main(String[] args) {
        int contador = 0;
        
        while (contador < 200) {
            if (contador % 7 == 0) {
                System.out.println(contador);
            }
            contador = contador + 7;
        }
    }
    
}
