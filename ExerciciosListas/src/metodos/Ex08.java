package metodos;

public class Ex08 {

	public static void main(String[] args) {
		System.out.println("8) Maior Elemento em uma Matriz:\r\n"
				+ "Implemente um método chamado encontrarMaiorElemento que recebe uma matriz de inteiros como parâmetro e retorna o "
				+ "maior elemento presente nela.\r\n"
				+ "");
		
		int[][] matrizInteiros = {{1,2,3},{5,6,7},{7,8,9}};
		System.out.println("O maior valor da matriz é:" + encontrarMaiorElemento(matrizInteiros));
	}

	public static int encontrarMaiorElemento(int[][] matrizInteiros) {
		int maiorInteiro = Integer.MIN_VALUE;
		
		for(int i=0; i<matrizInteiros.length; i++) {
			for(int j=0; j<matrizInteiros[i].length;j++) {
				maiorInteiro = (matrizInteiros[i][j]>maiorInteiro)?matrizInteiros[i][j]:maiorInteiro;
			}
		}
		return maiorInteiro;
	}
}