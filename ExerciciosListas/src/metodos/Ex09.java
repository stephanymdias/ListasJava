package metodos;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex09 {

	public static void main(String[] args) {
		System.out.println("9) Verificação de Palíndromo:\r\n"
				+ "Crie um método chamado ehPalindromo que recebe uma string como parâmetro e retorna true se ela for um palíndromo e "
				+ "false caso contrário.\r\n"
				+ "");
		String palavra = JOptionPane.showInputDialog("Digite algo para descobri se é palindromo:");
		
		palavra = palavra.toLowerCase();
		char[] palindromo = palavra.toCharArray();
		System.out.println(ehPalindromo(palindromo));
	}

	public static boolean ehPalindromo(char[] palindromo) {
        char[] invertido = new char[palindromo.length];
		int aux=0;
		
		for(int i = palindromo.length-1; i>=0; i--) {
			invertido[aux]=palindromo[i];
			aux++;
		}
		
		
        return Arrays.equals(invertido, palindromo);
	}
}