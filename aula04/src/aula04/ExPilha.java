package aula04;

import java.util.Stack;
import java.util.Scanner;

public class ExPilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		String livro, removeLivro;
		
		System.out.println("******************************************\r\n" + "1: Adicionar um novo livro na pilha.\r\n"
				+ "2: Listar todos os livros da Pilha\r\n"
				+ "3: Retirar um livro da pilha \r\n"
				+ "0: O programa deve ser finalizado. \r\n"
				+ "******************************************\r\n"
				+ "Entre com a opção desejada: \r\n"
				+ "");

		opcao = leia.nextInt();
		leia.nextLine();
		
		switch(opcao) {
		
		case 1:
			System.out.println("1: Adicionar um novo livro na pilha.");
			System.out.println("Digite o nome do livro: ");
			livro = leia.nextLine();
			pilha.add(livro);
			System.out.println("Livro adicionado.");
			break;
		case 2:
			System.out.println("2: Listar todos os livros da Pilha");
			if (pilha.isEmpty()) {
				System.out.println("A pilha está vazia.");
			}else{
				System.out.println(pilha);
			}
			break;
		case 3:
			System.out.println("3: Retirar um livro da pilha");
			
			if (pilha.isEmpty()) {
				System.out.println("A pilha está vazia.");
			} else {
			System.out.println("Digite o nome do livro que deseja remover: ");
			removeLivro = leia.nextLine();
			if (pilha.contains(removeLivro)) {
				pilha.remove(removeLivro);
				System.out.println("Um livro foi retirado.");
			}else {
				System.out.println("Não há nenhum livro com este nome para remover");
			}
			}
			break;
		case 0:
			System.out.println("0: O programa deve ser finalizado.");
			System.out.println("Programa finalizado.");
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}
	}

}
