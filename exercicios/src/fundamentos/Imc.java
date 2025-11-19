package fundamentos;

import java.util.Scanner;

public class Imc {
	
	public static void main(String[] args) {
		// Entrada de dados via Scanner
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("===== IMC =====");
		// Pedidos ao usuário
		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite sua altura: ");
		double altura = entrada.nextDouble();
		// Formúla
		double imc = peso / (altura * altura);
		System.out.printf("Seu IMC é de: %.2f", imc);
		
		entrada.close();
	}
}
