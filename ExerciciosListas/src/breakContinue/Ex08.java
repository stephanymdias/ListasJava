package breakContinue;

public class Ex08 {

	public static void main(String[] args) {
		System.out.println("8)Imprima os n�meros de 1 a 10, pulando a impress�o do n�mero 5 e interrompendo o loop quando encontrar o n�mero 8.");

		for(int i=1; i<11; i++) {
			if(i==5) {
				continue;
			}if(i==8){
				break;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
