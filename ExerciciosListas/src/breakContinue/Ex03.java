package breakContinue;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("3)Crie um loop aninhado que imprima os n�meros de 1 a 5 para cada itera��o do loop externo. "
				+ "Use break para interromper o loop interno quando o n�mero 3 for atingido.");

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				break;
			} else {

				for (int j = 1; j <= 5; j++) {
					System.out.println(j);
				}
			}
			System.out.println(" ");
		}
	}

}
