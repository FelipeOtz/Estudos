/*
* Modifique a função imprimirNota do exemplo anterior para
* retornar uma String. Se aluno aprovado, retorna "Aprovado".
* Caso contrário, retorna "Reprovado".
* Perceba que você que terá que modificar a função main.
*/

package ado4;

import java.util.Scanner;

public class Exercicio1 {
    
    static String status;
    
    static String imprimirNota (double nota) {
        if (nota >= 6) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }
        return status;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a nota do aluno: ");
        double notaAluno = input.nextDouble();
        imprimirNota(notaAluno);
        System.out.println(status);
    }
    
}
