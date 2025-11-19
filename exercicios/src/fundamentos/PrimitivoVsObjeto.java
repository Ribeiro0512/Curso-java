package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String s = new String("Texto");
		s.toUpperCase();
		
		// Tudo em java são objetos menos os tipos primitivos
		// Wrappers são a versão objeto dos tipos primitivos!
		int a = 123;
		System.out.println(a);
	}
}
