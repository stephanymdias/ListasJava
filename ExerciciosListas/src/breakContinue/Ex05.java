package breakContinue;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("5)Imprima os n�meros de 1 a 10, mas pare o loop quando encontrar um n�mero maior que 7.");

		for(int i=1; i<11; i++) {
			if(i>7) {
				break;
			}else {
				System.out.println(i);
			}
		}
	}

}
