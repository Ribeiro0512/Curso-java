package fundamentos;

import java.util.Scanner;

public class QuadradoCubo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// Utilizando metodo Math.pow para elevar um número
		System.out.print("Digite o valor: ");
		int num = entrada.nextInt();
		System.out.println("O valor ao quadrado é: " + (int)Math.pow(num, 2));
		System.out.println("O valor ao cubo é: " + (int)Math.pow(num, 3));
		
		entrada.close();
	}
}
