package aula02;

import java.util.Scanner;

public class DoarSangue {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String nome, pergunta;
		int idade;
		boolean doacao = false;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação? (S/N)");
		leia.skip("\\R?");
		pergunta = leia.next().toUpperCase();
		
		if(pergunta == "S")
			doacao = true;
		
		if (idade >= 60 && idade <= 69) {
			if (doacao)
				System.out.println(nome + " não está apto.");
			else
				System.out.println(nome + " está apto a doar.");
		}else if (idade > 18 || idade < 69)
				System.out.println(nome + " está apto a doar");
		}

	}


