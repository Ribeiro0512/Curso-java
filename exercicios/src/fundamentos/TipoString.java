package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		// Mesmo sem variável conseguimos utilizar um método(funcionalidade) para uma string
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		// Método para saber como inicia a String e retornar valor booleano
		System.out.println(s.startsWith("Boa"));
		// Método para transformar String toda em minúsculo
		System.out.println(s.toLowerCase().startsWith("boa"));
		// Método usado para saber como termina a String e retorna valor booleano
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		// Método usado para dizer quantos caracteres tem a String e retorna um valor inteiro
		System.out.println(s.length());
		// Método para confirmar se é igual o valor
		System.out.println(s.equals("boa tarde"));
		// Nesse caso igonora se é maiúsculo ou minúsculo 
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987F;
		
		// Utilização do System.out.printf facilitando a exibição das variáveis atráves dos especificadores de variavél
		System.out.printf("O senhor %s %s tem %d e ganha R$%.2f.", nome,
				sobrenome, idade, salario);
		
		// Da para utilizar o String.format para não precisar ficar concatenando
		String frase = String.format("\nO senhor %s %s tem %d e ganha R$%.2f.", nome,
				sobrenome, idade, salario);
		System.out.println(frase);
	}
}
