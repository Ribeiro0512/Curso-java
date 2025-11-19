package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==== Área do triangulo ====");
		// Pedido ao usuário
		System.out.print("Digite a base: ");
		double base = entrada.nextDouble();
		
		System.out.print("Digite a altura: ");
		double altura = entrada.nextDouble();
		// Formúla
		double area = (base * altura) / 2.0;
		System.out.printf("A área do seu triângulo é de: %.2f", area);
		
		entrada.close();
	}
}
