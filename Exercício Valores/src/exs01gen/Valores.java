package exs01gen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Valores {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		Scanner leia = new Scanner (System.in);
		float n1, n2, n3, n4, dif;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		n4 = leia.nextFloat();
		
		System.out.println("Diferença = " + df.format(((n1 * n2) - (n3 * n4))));
		
	}

}
