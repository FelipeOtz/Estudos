/* 
Faça um programa que gere a seguinte série: 10, 20, 30, 40, ..., 990, 1000. Use o laço FOR.
*/
package lista2;

public class Exercicio4 {

    public static void main(String[] args) {
        
        for (int contador = 0; contador <= 1000; contador = contador + 10) {
            System.out.println(contador);
        }
    }
    
}
