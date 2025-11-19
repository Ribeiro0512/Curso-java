package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		//Conversão com metodo externo
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//Conversão com metodo interno
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		//Conversão com concatenação
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}
}
