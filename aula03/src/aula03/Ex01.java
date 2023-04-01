package aula03;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int numero, contador = 0, contPares = 0, contImpares = 0;
		
		for (contador = 0; contador < 10; contador++) {
		    System.out.println("Digite um número: ");
		    numero = leia.nextInt();
				
		if (numero%2 == 0) {
			contPares++;
		}else {
			contImpares++;
		}	
		}
		System.out.println("Total de números pares: " + contPares);
		System.out.println("Total de números ímpares: " + contImpares);		}
}