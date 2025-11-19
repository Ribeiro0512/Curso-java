package fundamentos;
// Foi importado o Scanner direto do java.util
import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		// Tipos de print
		System.out.print("Bom"); // Só exibe e não pula linha
		System.out.print(" dia!\n\n"); // Podemos usar \n para quebrar a linha

		System.out.println("Bom"); // Exibe e pula linha
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d\n", // Utiliza formatação, melhor para utilizar multiplas variáveis
		    1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");
		
		// Por padrão ao utilizar System.in, a entrada que espera vem do teclado
		Scanner entrada = new Scanner(System.in);
		// .nextLine lê a linha inteira em string
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		// .nextInt lê um inteiro
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		// Necessário fechar a entrada
		entrada.close();
	}
}
