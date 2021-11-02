package calculadorasimples;

import java.util.Scanner;

public class CalculadoraSimples {
    
    static float resultado;

    static float soma (float a, float b) {
        
        resultado = a + b;
        System.out.println("Resultado da operação: " + resultado + "\n");
        return resultado;
        
    }
    
    static float multiplicacao (float a, float b) {
        
        resultado = a * b;
        System.out.println("Resultado da operação: " + resultado + "\n");
        return resultado;
        
    }
    
    static float subtracao (float a, float b) {
        
        resultado = a - b;
        System.out.println("Resultado da operação: " + resultado + "\n");
        return resultado;
        
    }
    
    static float divisao (float a, float b) {
        
        resultado = a / b;
        System.out.println("Resultado da operação: " + resultado + "\n");
        return resultado;
        
    }
    
    static float raiz (float a) {
        
        resultado = (float) Math.sqrt(a);
        System.out.println("Resultado da operação: " + resultado + "\n");
        return resultado;
        
    }
    
    static float potencia (float a, float b) {
        
        resultado = (float) Math.pow(a, b);
        System.out.println("Resultado da operação: " + resultado + "\n");
        return resultado;
        
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //float num1 = input.nextFloat();
        //float num2 = input.nextFloat();
        
        //multiplicacao(num1, num2);
        
        System.out.println("-CALCULADORA-\n");
        int operacao;
        
        
        do {
            System.out.println("1)Soma \n2)Multiplicação\n3)Subtração\n4)Divisão\n5)Raíz quadrada\n6)Potência\n0)Sair\n");
            System.out.println("Digite a operação desejada: ");
            operacao = input.nextInt();
            System.out.println("Digite o primeiro número: ");
            float num1 = input.nextFloat();
            System.out.println("Digite o segundo número (se não aplicável, digite zero): ");
            float num2 = input.nextFloat();
        
            switch (operacao){
            case 1:
                soma(num1, num2);
                break;
            case 2:
                multiplicacao(num1, num2);
                break;
            case 3:
                subtracao(num1, num2);
                break;
            case 4:
                divisao(num1, num2);
                break;
            case 5:
                raiz(num1);
                break;
            case 6:
                potencia(num1, num2);
                break;
            }
        } while (operacao != 0);
        
    }
    
}
