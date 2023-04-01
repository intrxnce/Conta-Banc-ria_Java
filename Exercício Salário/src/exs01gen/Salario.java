package exs01gen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		Scanner leia = new Scanner (System.in);
		float salarioBruto, adicionalNoturno, horasExtras, descontos, soma;
		
		System.out.println("Digite o valor do salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor das horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		soma = (salarioBruto + adicionalNoturno + (horasExtras * 5));
		
		System.out.println("Salário Líquido: R$ " + df.format((soma - descontos)));
		
	}
}
