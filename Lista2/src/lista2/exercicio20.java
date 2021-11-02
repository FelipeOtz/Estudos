/*
 * Escreva um programa capaz de ler o saldo inicial de uma conta bancária e um número indeterminado de operações de depósito e saque.
    O usuário deve digitar “1” para realizar um depósito, “2” para realizar um saque.
    Após digitar o código da operação, o usuário deve digitar o valor. As operações devem continuar sendo
    realizadas até que o usuário digite o código de operação “3”.
    Ao digitar “3”, o programa deve ser encerrado e o saldo final da conta deve ser impresso com as seguintes
    mensagens: CONTA ZERADA (caso o saldo final seja 0), CONTA ESTOURADA (se o saldo for negativo) ou
    CONTA PREFERENCIAL (se o saldo for positivo).
    Utilize o laço DO-WHILE.
 */

package lista2;

import java.util.Scanner;

public class exercicio20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("BANCO SENAC");
        System.out.println("Digite o saldo inicial: ");
        float saldoInicial = input.nextFloat();
        int opcao;
        float deposito;
        float saque;
        
        do {
            System.out.println("1 - DEPÓSITO");
            System.out.println("2 - SAQUE");
            System.out.println("3 - SAIR");
            opcao = input.nextInt();
            
            if (opcao == 1) {
                System.out.println("Digite o valor a ser depositado: ");
                deposito = input.nextFloat();
                saldoInicial = saldoInicial + deposito;
                System.out.println("Valor total: " + saldoInicial);
            }
            
            if (opcao == 2) {
                System.out.println("Digite o valor a ser retirado: ");
                saque = input.nextFloat();
                saldoInicial = saldoInicial - saque;
                System.out.println("Valor total: " + saldoInicial);
            }
            
        } while (opcao != 3);
        
        if (saldoInicial > 0) {
            System.out.println("Conta preferencial.");
            System.out.println("Valor total: " + saldoInicial);
        } else if (saldoInicial == 0){
            System.out.println("Conta zerada.");
            System.out.println("Valor total: " + saldoInicial);
        } else if (saldoInicial < 0) {
            System.out.println("Conta negativada.");
            System.out.println("Valor total: " + saldoInicial);
        }
        
    }
    
}
