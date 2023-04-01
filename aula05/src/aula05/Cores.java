package aula05;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Cores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList <String>();
		
		String cor1, cor2, cor3, cor4, cor5;
		
		System.out.println("Digite a primeira cor: ");
		cor1 = leia.nextLine();
		cores.add(cor1);
		
		System.out.println("Digite a segunda cor: ");
		cor2 = leia.nextLine();
		cores.add(cor2);
		
		System.out.println("Digite a terceira cor: ");
		cor3 = leia.nextLine();
		cores.add(cor3);
		
		System.out.println("Digite a quarta cor: ");
		cor4 = leia.nextLine();
		cores.add(cor4);
		
		System.out.println("Digite a quinta cor: ");
		cor5 = leia.nextLine();
		cores.add(cor5);
		
		Collections.sort(cores);
		
		System.out.println(cores);
	}

}
