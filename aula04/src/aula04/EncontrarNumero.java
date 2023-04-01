package aula04;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class EncontrarNumero {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Integer n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
		
		Set<Integer> setNumeros = new HashSet <Integer>();
		
		System.out.println("Digite o 1º número: ");
		n1 = leia.nextInt();
		setNumeros.add(n1);
		
		System.out.println("Digite o 2º número: ");
		n2 = leia.nextInt();
		setNumeros.add(n2);
		
		System.out.println("Digite o 3º número: ");
		n3 = leia.nextInt();
		setNumeros.add(n3);
		
		System.out.println("Digite o 4º número: ");
		n4 = leia.nextInt();
		setNumeros.add(n4);
		
		System.out.println("Digite o 5º número: ");
		n5 = leia.nextInt();
		setNumeros.add(n5);
		
		System.out.println("Digite o 6º número: ");
		n6 = leia.nextInt();
		setNumeros.add(n6);
		
		System.out.println("Digite o 7º número: ");
		n7 = leia.nextInt();
		setNumeros.add(n7);
		
		System.out.println("Digite o 8º número: ");
		n8 = leia.nextInt();
		setNumeros.add(n8);
		
		System.out.println("Digite o 9º número: ");
		n9 = leia.nextInt();
		setNumeros.add(n9);
		
		System.out.println("Digite o 10º número: ");
		n10 = leia.nextInt();
		setNumeros.add(n10);
		
		
		Iterator<Integer> iterator = setNumeros.iterator();
		
		
		System.out.println(setNumeros);

	}

}

