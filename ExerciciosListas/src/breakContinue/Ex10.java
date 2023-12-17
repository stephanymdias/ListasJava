package breakContinue;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("10)Dado um array de n�meros inteiros, imprima cada n�mero at� encontrar um n�mero negativo. "
				+ "Use break para interromper o loop nesse ponto.");

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do array: ");
	    int tamanho = leia.nextInt();

	    int[] numero = new int[tamanho];
	    
	    for(int i =0; i<tamanho; i++) {
	    	System.out.println("Digite um numero:");
			numero[i] = leia.nextInt();
			
			System.out.println("N�mero inserido: " + numero[i]);
			
			if(numero[i]<0) {
                System.out.println("N�mero negativo inserido. Interrompendo o loop.");
				break;
			}
			
	    }
		
	    leia.close();
	}

}
