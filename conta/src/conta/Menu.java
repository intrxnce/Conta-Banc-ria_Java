package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.util.Cores;
import conta.model.ContaPoupanca;
import conta.model.ContaCorrente;

public class Menu {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ContaController contas = new ContaController();
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;
		
		while (true) {
			System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
					+ "**************************************");
			System.out.println("                                      ");
			System.out.println("        BANCO DO BRAZIL COM Z         ");
			System.out.println("                                      ");
			System.out.println("**************************************");
			System.out.println("                                      ");
			System.out.println("         1 - Criar conta              ");
			System.out.println("      2 - Listar todas as contas      ");
			System.out.println("     3 - Buscar conta por número      ");
			System.out.println("     4 - Atualizar dados da conta     ");
			System.out.println("          5 - Apagar conta            ");
			System.out.println("            6 - Sacar                 ");
			System.out.println("           7 - Depositar              ");
			System.out.println(" 8 - Transferir valores entre contas  ");
			System.out.println("             9 - Sair                 ");
			System.out.println("                                      ");
			System.out.println("**************************************");
			System.out.println("Entre com a opção desejada:           ");
			System.out.println("                                      " + Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nDigite valores inteiros.");
				leia.nextLine();
				opcao = 0;
			}
				
			if (opcao == 9) {
				System.out.println(Cores.TEXT_BLUE_BOLD + "\nBanco do Brazil com Z - O seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta\n\n");
				System.out.println("Digite o número da agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o nome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o tipo da conta (1 - CC ou 2 - CP): ");
					tipo = leia.nextInt();
				}while(tipo < 1 && tipo > 2);
				
				System.out.println("Digite o saldo da conta (R$): ");
				saldo = leia.nextFloat();
				
				switch(tipo) {
					case 1 -> {
						System.out.println("Digite o limite de crédito (R$)");
						limite = leia.nextFloat();
						contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
					}
					case 2 -> {
						System.out.println("Digite o dia do aniversario da conta: ");
						aniversario = leia.nextInt();
						contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					}
				}
				
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as contas\n\n");
				contas.listarTodas();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da conta - por número\n\n");

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da conta\n\n");

				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a conta\n\n");

				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");

				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");

				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre contas\n\n");

				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção inválida.\n" + Cores.TEXT_RESET);

				keyPress();
				break;
			}
		}
	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar.");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de Enter.");

		}
	}
}