package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 30;
		int b = 50;
		
		System.out.println(a == b); //igual
		System.out.println(3 > 4); // Maior que
		System.out.println(3 >= 3); // Maior ou igual que
		System.out.println(3 < 7); // Menor que
		System.out.println(30 <= 7); // Menor ou igual que
		System.out.println(30 != 7); // Diferente de
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
