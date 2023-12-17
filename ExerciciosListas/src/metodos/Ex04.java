package metodos;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("4) Fatorial de um N�mero:\r\n"
				+ "Implemente um m�todo chamado fatorial que calcula o fatorial de um n�mero passado como par�metro.\r\n");
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero para calcular seu fatorial:");
		int numero = leia.nextInt();
		System.out.println("o fatorial de " +  numero + " � " + calcularFatorial(numero));
		leia.close();

	}
	
	public static int calcularFatorial(int numero) {
		return (numero>1)?numero*calcularFatorial(numero-1):1;
	}
}