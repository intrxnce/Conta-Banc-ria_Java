package aula03;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade,contMenores = 0, contMaiores = 0;
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		while(idade >= 0) {
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		if (idade < 21) {
			contMenores++;
		}else if (idade > 50){
			contMaiores++;
		}
		
	}
		System.out.println("Total de pessoas menores de 21 anos: " + contMenores);
		System.out.println("Total de pessoas maiores de 50 anos: " + contMaiores);

}}
