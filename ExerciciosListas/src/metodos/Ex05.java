package metodos;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("5) Contagem de Vogais:\r\n"
				+ "Crie um método chamado contarVogais que recebe uma string como parâmetro e retorna o número de vogais nela.\r\n"
				+ "");
        String palavra = JOptionPane.showInputDialog("Digite algo:");
		contarVogais(palavra);

	}
	
	public static void contarVogais(String palavra) {
		int numeroVogais=0;
		
        palavra = palavra.toLowerCase();
        
		char[] caracteresArray = palavra.toCharArray();
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
		
		for(int i = 0; i<caracteresArray.length; i++) {
			for(int j=0; j< vogais.length; j++) {
				numeroVogais+=(caracteresArray[i]== vogais[j])?1:0;
			}
		}
		System.out.println("O numero de vogais da palavra " + palavra + ":"+numeroVogais);
	}

}
