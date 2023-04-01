package aula02;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero%2 == 0)
			System.out.println("O número digitado é par");
		else if (numero%2 != 0)
			System.out.println("O número digitado é ímpar");

	}

}
