/*
Faça um programa para imprimir os números pares entre 100 e 1, em ordem decrescente, ou seja, o laço
deve iniciar em 100 e encerrar em 1. Use o laço FOR.
 */
package lista2;

public class Exercicio5 {

    public static void main(String[] args) {
        
        for (int contador = 100; contador > 0; contador = contador - 2) {
            System.out.println(contador);
        }
    }
    
}
