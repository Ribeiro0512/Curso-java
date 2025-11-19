package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// Pós fixada
		a++; // Incremento -> a = a + 1
		a--; // Decremento -> a = a - 1
		
		// Pré fixada
		++b; // Incremento -> b = b + 1
		--b; // Decremento -> b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}
}
