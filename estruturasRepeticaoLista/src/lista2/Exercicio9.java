/*
 * Escreva um programa para ler a quantidade de alunos existentes em uma turma. Depois disso, o programa
    deve ler as notas de cada um destes alunos, calcular e mostrar na tela a média aritmética destas notas.
    Utilize o laço WHILE.
 */
package lista2;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos: ");
        int numeroAlunos = input.nextInt();
        float somaNotas = 0;
        int contador = 1;
        float nota;
        
        while (contador <= numeroAlunos) {
            System.out.println("Digite a nota do aluno " + contador);
            nota = input.nextFloat();
            somaNotas = somaNotas + nota;
            contador++;
        }
        
        float resultado = somaNotas / numeroAlunos;
        System.out.println("A média é: " + resultado);
    }
    
}
