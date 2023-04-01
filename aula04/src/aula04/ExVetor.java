package aula04;

import java.util.Scanner;

public class ExVetor {

    public static void main(String[] args) {
    	
    	Scanner leia = new Scanner(System.in);
        
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        
      
        System.out.print("Digite um número: ");
        int numero = leia.nextInt();
        
        boolean encontrado = false;
        int posicao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                encontrado = true;
                posicao = i;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("O número " + numero + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("O número " + numero + "não foi encontrado.");
        }
        
        leia.close();
    }
}


