package aula02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraSimple {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float numero1, numero2;
		int operacao;

		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextFloat();

		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextFloat();
		
		
		System.out.println("OPERAÇÕES DA CALCULADORA: 1 - SOMA; 2 - SUBTRAÇÃO; 3 - MULTIPLICAÇÃO; 4 - DIVISÃO");
		System.out.println("Digite o número da operação");
		operacao = leia.nextInt();
		
		switch (operacao) {
		case 1:
			System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			break;
		case 2:
			System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
			break;
		case 3:
			System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
			break;
		case 4:
			System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
			break;
		default:
			System.out.println("Operação inválida.");
		}

	}
	
}
