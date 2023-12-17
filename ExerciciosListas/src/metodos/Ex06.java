package metodos;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		System.out.println("6) Troca de Valores:\r\n"
				+ "Implemente um método chamado trocarValores que recebe dois inteiros como parâmetros e troca os valores entre eles.\r\n"
				+ "");

		Scanner leia = new Scanner(System.in);
			System.out.println("Digite o numero 01");
			int numero01 = leia.nextInt();
			
			System.out.println("Digite o numero 02");
			int numero02 = leia.nextInt();
			
			trocarValores(numero01, numero02);
		leia.close();
	}
	
	public static void trocarValores(int numero01, int numero02) {
		int numeroTroca = numero01;
		numero01 = numero02;
		numero02 = numeroTroca;
		
		System.out.println("Numero01= "+numero01 + " Numero02= "+numero02);
	}

}