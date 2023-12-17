package metodos;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		System.out.println("3) Média de uma Lista de Números:\r\n"
				+ "Crie um método chamado calcularMedia que recebe um array de números como "
				+ "parâmetro e retorna a média deles.\r\n"
				+ "");
		
		Scanner leia = new Scanner(System.in);{			
			System.out.println("Digite quantos termos terão para calcular a media");
			int termos= leia.nextInt();
	        float[] numeros = new float[termos];

			for(int i = 0; i<termos; i++) {
				System.out.println("Digite o termo de numero a" + (i+1));

				numeros[i]=leia.nextFloat();
			}
			
			float resultado = calcularMedia(numeros);
	        System.out.println("A média é: " + resultado);

		leia.close();
		}
				
	}
	
	public static float calcularMedia(float[] numeros) {
		float media=0;
		for(int i = 0; i<numeros.length; i++) {
			media += numeros[i];
		}
		media/=(numeros.length);
		return media;
	}

}