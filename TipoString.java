package CapituloUmJava;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Ol� Mundo !".charAt (2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith ("Boa"));
		System.out.println(s.toLowerCase().startsWith ("boa"));
		System.out.println(s.toUpperCase().endsWith ("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase ("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 123.321;
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f reais.", 
				nome, sobrenome, idade, salario);
		
		
	}
	
}
