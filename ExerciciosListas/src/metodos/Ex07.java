package metodos;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println("7) Conversão de Temperatura:\r\n"
				+ "Crie um método chamado converterCelsiusParaFahrenheit que recebe uma temperatura em graus Celsius como parâmetro e "
				+ "retorna a temperatura equivalente em Fahrenheit.\r\n"
				+ "");
		
		Scanner leia = new Scanner(System.in);
			System.out.println("Digite a temperatura em graus celcius:");
			float temperaturaCelcius = leia.nextInt();
			
			System.out.println(temperaturaCelcius + "°C = " + converterCelsiusParaFahrenheit(temperaturaCelcius) + "°F");	
			
		leia.close();

	}

	public static float converterCelsiusParaFahrenheit(float temperaturaCelcius) {
		return (float) (temperaturaCelcius*1.8+32f);
	}
}