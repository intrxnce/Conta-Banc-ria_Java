package aula03;

import java.util.Scanner;

public class ExMediaDoWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int numero = 0, contador3 = -1;
		double media = 0, somaNumeros3 = 0;
	
		do {
		
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
		
			if(numero%3 == 0) {
				somaNumeros3 += numero;
				contador3++;
			}
		}while(numero != 0);

		if (contador3 != 0) {
			media = somaNumeros3 / contador3;
			System.out.println("A média de todos os números múltiplos de 3 é " + (somaNumeros3/contador3));
		} else {
			System.out.println("Não foi possível realizar a operação.");
	}
	
	}
	
}


