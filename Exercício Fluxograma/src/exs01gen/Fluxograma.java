package exs01gen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fluxograma {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		Scanner leia = new Scanner (System.in);
		float salario, abono;
		
		System.out.println("Digite o valor do salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o valor do abono: ");
		abono = leia.nextFloat();
		
		System.out.println("Novo salário: R$ " + df.format((salario+abono)));
		
	}

}
