package breakContinue;

public class Ex06 {

		public static void main(String[] args) {
			System.out.println("6)Imprima os n�meros de 1 a 10, pulando a impress�o do n�mero 5, usando continue.");

			for(int i=1; i<11; i++) {
				if(i==5) {
					continue;
				}else {
					System.out.println(i);
				}
			}
		}

	}
