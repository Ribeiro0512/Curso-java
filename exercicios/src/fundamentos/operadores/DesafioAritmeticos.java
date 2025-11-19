package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		//Expressão 1
		var ex1 = 6 * (3 + 2);
		int ex1a = (int) Math.pow(ex1, 2);
		int ex1b = 3 * 2;
		int resultado1 = ex1a / ex1b;
		
		//Expressão 2
		var ex2 = ((1 - 5) * (2 - 7)) / 2;
		int resultado2 = (int) Math.pow(ex2, 2);
		
		//Expressão final
		var exf = resultado1 - resultado2;
		int resultadofinal = (int) Math.pow(exf, 3);
		int resultadofinalb = (int) Math.pow(10, 3);
		
		//Total
		int total = resultadofinal / resultadofinalb;
		
		System.out.println(total);
		
		
		
		
		
		
	}
}
