package fundamentos.operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56; // Variável com inferência
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // Valore inteiros então resultado é inteiro
		System.out.println(a / (double) b); // Utilizando cast para converter o resultado
		System.out.println(a / (float) b); // Conversão para float
		
		// Módulo é o resto da divisão entre dois números
		System.out.println(8 % 3);
		System.out.println(a % b);
		
		//Expressões maiores
		System.out.println(x + y - a * b);
	}
}
