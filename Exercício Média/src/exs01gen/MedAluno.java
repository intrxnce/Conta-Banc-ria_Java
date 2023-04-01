package exs01gen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MedAluno {
	
	public static void main(String[] args) {
	
	DecimalFormat df = new DecimalFormat("##0.00");
	
	Scanner leia = new Scanner (System.in);
	float nota1, nota2, nota3, nota4, soma;
	
	System.out.println("Digite a nota do primeiro bimestre: ");
	nota1 = leia.nextFloat();
	
	System.out.println("Digite a nota do segundo bimestre: ");
	nota2 = leia.nextFloat();
	
	System.out.println("Digite a nota do terceiro bimestre: ");
	nota3 = leia.nextFloat();
	
	System.out.println("Digite a nota do quarto bimestre: ");
	nota4 = leia.nextFloat();
	
	soma = (nota1 + nota2 + nota3 + nota4);
	
	System.out.println("Média do aluno: " + df.format((soma/4)));
	
	}

}
