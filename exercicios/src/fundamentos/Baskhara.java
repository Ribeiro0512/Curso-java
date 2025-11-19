package fundamentos;

import java.util.Scanner;

public class Baskhara {

	public static void main(String[] args) {
		
		System.out.println("==== BASKHARA ====");
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o valor de A: ");
		int a = entrada.nextInt();
		System.out.print("digite o valor de B: ");
		int b = entrada.nextInt();
		System.out.print("digite o valor de C: ");
		int c = entrada.nextInt();
		
		
		double delta = b * b - 4 * a * c;
		double raizq = Math.sqrt(delta);
		double x1 = (-b + raizq) / 2 * a;
		double x2 = (-b - raizq) / 2 * a;
		
		System.out.println("Raíz 1: " + x1);
		System.out.println("Raíz 2: " + x2);
		
		entrada.close();
		
	}
}
