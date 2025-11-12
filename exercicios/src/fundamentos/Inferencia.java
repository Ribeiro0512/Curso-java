package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		// Depois de definir o tipo não pode mudar ele durante o códgio para aquela varável
		//Nesse caso a = 4.5, precisar ser do tipo double o resto do código
		double a = 4.5;
		System.out.println(a);
		
		//Através da inferencia o java define de acordo com o valor da variável
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		//Para declarar e inicializar em linhas diferentes precisa utilizar tipos expecificos
		//Não funciona se utilizarmos somente var 
		double d; // Declaração da variável
		d = 123.65; // Inicialização da variável
		System.out.println(d);
	}
}
