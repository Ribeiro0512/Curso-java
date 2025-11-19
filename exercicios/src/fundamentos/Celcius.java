package fundamentos;

import java.util.Scanner;

public class Celcius {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Usuário pede o valor atráves do Scanner
		System.out.print("Digite a temperatura em fahrenheit: ");
		// Declaração das variáveis já inserindo a formúla 
		double fahrenheit = entrada.nextDouble();
		double celcius = 5.0 / 9.0 * (fahrenheit - 32);
		//Exibição do valor em celcius
		System.out.printf("Essa temperatura em celcius é %.2f", celcius);
		
		entrada.close();
	}
}
