package breakContinue;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("2)Imprima os n�meros �mpares de 1 a 10, usando continue para pular os n�meros pares.");
		
		for(int i =1; i<11;i++) {
			if(i%2==0) {
				continue;
			}else {
				System.out.println(i);
			}
		}

	}

}
