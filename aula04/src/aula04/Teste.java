package aula04;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosVetor {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		int index = Arrays.asList(vetorInteiros).indexOf(numero);
		
		switch (numero) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("O número " + numero + " está localizado na posição " + index);
			break;
		default:
			System.out.println("O número " + numero + " não foi localizado.");
		}
		
	}
}