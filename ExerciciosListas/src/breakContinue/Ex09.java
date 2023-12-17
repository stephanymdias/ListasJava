package breakContinue;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		System.out.println("9)Crie um loop infinito que solicita ao usuário um número. Pare o loop quando o número 0 for inserido.");
		
		
		Scanner leia = new Scanner(System.in);
		int numero=0;
		do {
			System.out.println("Digite um numero:");
			numero = leia.nextInt();
		} while (numero!=0);
		
		
		
		leia.close();
	}

}
