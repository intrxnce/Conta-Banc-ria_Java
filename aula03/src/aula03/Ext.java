package aula03;

import java.util.Scanner;

public class Ext {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
        int num, sum = 0, count = 0;

        do {
            System.out.print("Digite um número: ");
            num = input.nextInt();

            if (num % 3 == 0 && num != 0) {
                sum += num;
                count++;
            }
        } while (num != 0);

        if (count > 0) {
            double media = (double) sum / count;
            System.out.printf("A média dos números múltiplos de 3 é %.2f", media);
        } else {
            System.out.println("Não foram digitados números múltiplos de 3.");
        }

        input.close();
    }
}








}
