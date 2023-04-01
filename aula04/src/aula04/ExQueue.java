package aula04;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class ExQueue {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		Integer opcao;
		
		String cliente, removeCliente;
		
		System.out.println("*******************************************\n1 - Adicionar Cliente na fila\n2 - Listar todos os Clientes\n3 - Retirar Cliente da fila\n0 - Sair\n*******************************************\nEntre com a opção desejada: ");
		opcao = leia.nextInt();
		leia.nextLine();
		
		switch(opcao) {
		
		case 1:
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("Digite o nome do Cliente: ");
			cliente = leia.nextLine();
			fila.add(cliente);
			System.out.println("Cliente adicionado.");
			break;
		case 2:
			System.out.println("2 - Listar todos os Clientes");
			if (fila.isEmpty()) {
				System.out.println("A fila está vazia.");
			}else{
				System.out.println(fila);
			}
			break;
		case 3:
			System.out.println("3 - Retirar Cliente da Fila");
			
			if (fila.isEmpty()) {
				System.out.println("A fila está vazia.");
			} else {
			System.out.println("Digite o nome do cliente que deseja remover: ");
			removeCliente = leia.nextLine();
			if (fila.contains(removeCliente)) {
				fila.remove(removeCliente);
			}else {
				System.out.println("Não há ninguém com este nome para remover");
			}
			}
			break;
		case 0:
			System.out.println("0 - Sair");
			System.out.println("Programa finalizado.");
			break;
		default:
			System.out.println("Opção inválida.");
			break;
				
		}
		
		leia.close();
	}

}
