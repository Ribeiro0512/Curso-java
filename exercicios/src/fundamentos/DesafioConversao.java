package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do 1° salário: ");
		String salario1 = entrada.nextLine();
		System.out.print("Digite o valor do 2° salário: ");
		String salario2 = entrada.nextLine();
		System.out.print("Digite o valor do 3° salário: ");
		String salario3 = entrada.nextLine();
		
		double salario_1 = Double.parseDouble(salario1.replace(",", "."));
		double salario_2 = Double.parseDouble(salario2.replace(",", "."));
		double salario_3 = Double.parseDouble(salario3.replace(",", "."));
		
		
		double media = (salario_1 + salario_2 + salario_3) / 3;
		System.out.printf("A média ficou em: %.2f\n", media);
		
		entrada.close();
	}
}
