package metodos;

import java.util.Scanner;

public class Ex02 {

	static boolean NumeroPrimo(int numero) {
	int numeroPrimo=0;
		for(int i=1; i<=numero; i++) {
			numeroPrimo += (numero%i==0)?1:0;
		}

		return  (numeroPrimo>2)?false:true;
	}
	public static void main(String[] args) {
		System.out.println("2) Verificação de Número Primo:\r\n"
				+ "Implemente um método chamado ehPrimo que recebe um número como parâmetro e retorna true se ele for primo e false caso contrário.\r\n"
				+ "");
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero");
			int numero01 = leia.nextInt();
			System.out.println(numero01 + " é primo? " + NumeroPrimo(numero01));
		leia.close();
		
	}

}