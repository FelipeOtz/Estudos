/*
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente
deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
correta é o valor 2002. Utilize o laço que lhe for mais conveniente.
 */
package lista2;

import java.util.Scanner;

public class exercicio19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("***ÁREA RESTRITA***");
        int pwd = 0;
        
        do {
            System.out.println("Digite a senha: ");
            int senha = input.nextInt();
            
            if (senha == 2002) {
                System.out.println("Acesso permitido.");
                break;
            } else {
                System.out.println("Senha inválida.");
            }
        } while (pwd != 2002);
    }
    
}
