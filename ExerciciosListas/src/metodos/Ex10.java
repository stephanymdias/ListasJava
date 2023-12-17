package metodos;

import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("10) Ordenação Crescente:\r\n"
				+ "Implemente um método chamado ordenarCrescente que recebe um array de inteiros como parâmetro e o "
				+ "ordena em ordem crescente.\r\n"
				+ "");

		int[] numero= {6,4,5};
		ordemCrescente(numero);
	}

	
	public static void ordemCrescente(int[] numero) {
		Arrays.sort(numero);
		
		for(int i:numero) {
			System.out.println(i);
		}
	}
}