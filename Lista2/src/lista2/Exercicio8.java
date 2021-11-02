/*
 * Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73. Utilize o laço que
lhe for mais conveniente.
 */
package lista2;

public class Exercicio8 {

    public static void main(String[] args) {
        int contador = 13;
        int somaPar = 0;
        int contadorPar = 0;
        
        while (contador < 73) {
            
            if (contador % 2 == 0) {
                somaPar = somaPar + contador;
                contadorPar++;
            }
            
            System.out.println(contador);
            System.out.println(somaPar);
            
            contador++;
        }
        
        int media = somaPar / contadorPar;
        System.out.println("A média dos números pares é: " + media);
    }
    
}
