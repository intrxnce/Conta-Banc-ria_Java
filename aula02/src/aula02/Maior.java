package aula02;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int A, B, C, soma;
		
		System.out.println("Digite o primeiro número: ");
		A = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		B = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		C = leia.nextInt();
		
		soma = A + B;
		
		if (soma > C)
			System.out.println("O resultado da soma de " + A + " e " + B + " é maior que " + C + ".");
		else if (soma < C)
			System.out.println("O resultado da soma de " + A + " e " + B + " é menor que " + C + ".");
		else if (soma == C)
			System.out.println("O resultado da soma de " + A + " e " + B + " é igual a " + C + ".");
		
			
				
			
	}

}
