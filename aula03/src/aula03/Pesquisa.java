package aula03;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, genero = 0, esporte, contador = 0, futebolFeminino = 0, maiores18Volei = 0;
		char continua = 'S';
				
		while(continua == 'S') {
			
		
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
		
			System.out.println("Digite o sexo (1-M/2-F/3-Outros: ");
			sexo = leia.nextInt();
		
			System.out.println("Digite seu esporte favorito(1-Futebol/2-Voleibol/3-Basquete/4-Games ");
			esporte = leia.nextInt();
			
			contador ++;
			
			if(sexo == 2 && esporte == 1)
				futebolFeminino ++;
			
			if(idade >= 18 && esporte == 2)
				maiores18Volei ++;
			
			if((sexo == 3 || sexo == 4) && genero == 2 && esporte == 4);
				gamesTNBF ++;
			
			genero = 0;
			
			
			System.out.println("Deseja continuar (S/N)? ");
			continua = leia.next().toUpperCase().charAt(0);
		}
		
		System.out.println("Total de Fichas preenchidas: " + contador);

	}

}
