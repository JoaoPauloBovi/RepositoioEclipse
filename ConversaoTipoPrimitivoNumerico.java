package CapituloUmJava;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // conversao implícita para int
		System.out.println(a);
		
		float b = (float) 1.123; //conversao explicita (cast)
		System.out.println(b);
		 
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e; //conversao explicita (cast
		System.out.println(f);
		
		
		
	}
	
}
