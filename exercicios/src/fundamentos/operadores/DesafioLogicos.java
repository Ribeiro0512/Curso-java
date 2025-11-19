package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean tv50 = trabalho1 && trabalho2;
		System.out.println("Comprou tv de 50 polegadas: " + tv50);
		boolean tv32 = trabalho1 ^ trabalho2;
		System.out.println("Comprou tv de 32 polegadas: " + tv32);
		boolean sorvete = tv50 || tv32;
		System.out.println("Foram para o shopping e tomaram sorvete: " + sorvete);
		System.out.println("Mais saudável: " + !sorvete); //Operador Unário

		
	}
}
