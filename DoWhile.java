package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String texto = "por favor";
		do {
			System.out.println("Voc� precisa falar" 
			             + "\nas palavras m�gicas...");
			System.out.println("quer sair ?");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("obrigado!");
		entrada.close();
		
		
	}
}
