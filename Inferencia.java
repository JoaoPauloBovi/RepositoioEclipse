package CapituloUmJava;

public class Inferencia {

	public static void main(String[] args) {
	
		double a = 2.3;
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora"); // troca
		s = s.toUpperCase(); // tudo maiusculo
		s = s.concat(" !!!!!"); //concatenar
		
		
		System.out.println(s);
		
		String x = "JP".toUpperCase();
		System.out.println (x);

		
		String y = "Bom dia X"
				.replace("X", "Joao")
				.toUpperCase()
				.concat("!!!!!");
		
		System.out.println(y);
		
	}	
	
}
