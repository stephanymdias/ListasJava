package breakContinue;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println("7)Use um loop para iterar sobre os n�meros de 1 a 5. "
				+ "Pare o loop quando encontrar o n�mero 3. Use switch para imprimir uma mensagem diferente para cada n�mero.");
		 for (int i = 1; i <= 5; i++) {
	            switch (i) {
	                case 1:
	                    System.out.println("N�mero: " + i + ", Mensagem: Esta � a mensagem para o n�mero 1");
	                    break;
	                case 2:
	                    System.out.println("N�mero: " + i + ", Mensagem: Esta � a mensagem para o n�mero 2");
	                    break;
	                case 3:
	                    System.out.println("N�mero: " + i + ", Mensagem: Encontrou o n�mero 3. Saindo do loop.");
	                    return;
	                case 4:
	                    System.out.println("N�mero: " + i + ", Mensagem: Esta � a mensagem para o n�mero 4");
	                    break;
	                case 5:
	                    System.out.println("N�mero: " + i + ", Mensagem: Esta � a mensagem para o n�mero 5");
	                    break;
	                default:
	                    System.out.println("N�mero inv�lido");
	                    break;
	            }
	        }
	}

}
