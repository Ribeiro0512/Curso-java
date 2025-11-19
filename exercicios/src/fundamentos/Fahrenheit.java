package fundamentos;

import java.util.Scanner;

public class Fahrenheit {
	
	public static void main(String[] args) {
		// Abertura do Scanner
		Scanner entrada = new Scanner(System.in);
		// Interação com o usuário
		System.out.printf("Digite a temperatura em celcius: ");
		// Variáveis + formúla
		double celcius = entrada.nextDouble();
		double fahrenheit = (celcius * 1.8) + 32;
		// Resultado
		System.out.printf("A temperatura em fahrenheit é: %.2f", fahrenheit);
		
		entrada.close();
		
	}
}
