/*
 * Crie uma função capaz de calcular o resultado para a função
 * matemática abaixo (a função deve receber “x” e retornar a resposta):
 */

package ado4;

import java.util.Scanner;

public class Exercicio4 {

    static float resultado;
    
    static float funcaoMatematica (float x) {
        
        float calculo = 0;
        
        if (x < -1) {
            calculo = x + 2;
            resultado = Math.abs(calculo);
        } else if (x >= -1 && x <= 2) {
            resultado = (float) (Math.pow(x, 2) - 4);
        } else if (x > 2) {
            resultado = 2 * x - 1;
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite X: ");
        float numero = input.nextFloat();
        funcaoMatematica(numero);
        System.out.println(resultado);
    }
    
}
