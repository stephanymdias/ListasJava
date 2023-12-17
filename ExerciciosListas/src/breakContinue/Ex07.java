package breakContinue;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println("7)Use um loop para iterar sobre os números de 1 a 5. "
				+ "Pare o loop quando encontrar o número 3. Use switch para imprimir uma mensagem diferente para cada número.");
		 for (int i = 1; i <= 5; i++) {
	            switch (i) {
	                case 1:
	                    System.out.println("Número: " + i + ", Mensagem: Esta é a mensagem para o número 1");
	                    break;
	                case 2:
	                    System.out.println("Número: " + i + ", Mensagem: Esta é a mensagem para o número 2");
	                    break;
	                case 3:
	                    System.out.println("Número: " + i + ", Mensagem: Encontrou o número 3. Saindo do loop.");
	                    return;
	                case 4:
	                    System.out.println("Número: " + i + ", Mensagem: Esta é a mensagem para o número 4");
	                    break;
	                case 5:
	                    System.out.println("Número: " + i + ", Mensagem: Esta é a mensagem para o número 5");
	                    break;
	                default:
	                    System.out.println("Número inválido");
	                    break;
	            }
	        }
	}

}
