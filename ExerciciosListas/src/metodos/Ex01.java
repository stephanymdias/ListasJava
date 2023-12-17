package metodos;
import java.util.Scanner;
public class Ex01 {

	static int soma(int numero01, int numero02) {
		return numero01+numero02;
	}
	public static void main(String[] args) {
		System.out.println("1- Crie um método chamado soma que recebe dois números como parâmetros e retorna a soma deles.");
		
		Scanner leia = new Scanner(System.in);
			System.out.println("Digite um numero");
			int numero01 = leia.nextInt();
			System.out.println("Digite outro numero");
			int numero02 = leia.nextInt();
			System.out.println("A soma é " + soma(numero01, numero02));
		leia.close();
	}

}
