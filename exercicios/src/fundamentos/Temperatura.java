package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// ( °F - 32) x 5/9 = °C
		
		final double AJUSTE = 32;
		final double MULTIPLICADOR = 5.0 / 9.0;
		
		double f = 86;
		double celsius = (f - AJUSTE) * MULTIPLICADOR;
		System.out.println("A temperatura em Celsius é: " + celsius + "°C");
		
		f = 150;
		celsius = (f - AJUSTE) * MULTIPLICADOR;
		System.out.println("A temperatura em Celsius é: " + celsius + "°C");
	}
}
