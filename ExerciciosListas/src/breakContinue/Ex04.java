package breakContinue;

public class Ex04 {

	public static void main(String[] args) {
		System.out
				.println("4)Crie um loop aninhado que imprima os n�meros de 1 a 5 para cada itera��o do loop externo, "
						+ "pulando a impress�o do n�mero 3 em cada itera��o interna usando continue.");

		for (int i = 1; i <= 5; i++) {
		
				for (int j = 1; j <= 5; j++) {
					if(j==3) {
						continue;
				}else {
					System.out.println(j);
				}
			}
			System.out.println(" ");
		}

	}

}
