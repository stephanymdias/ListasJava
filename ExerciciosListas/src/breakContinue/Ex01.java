package breakContinue;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("1)Imprima os n�meros de 1 a 10, mas pare a execu��o do loop quando chegar a 5.");
		
		for(int i=1; i<11; i++) {
			if(i==5) {
				break;
			}else {
				System.out.println(i);
			}
			
		}
	}

	}
