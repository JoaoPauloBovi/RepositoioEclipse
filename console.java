package CapituloUmJava;

import java.util.Scanner;

public class console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia !\n");
		
		System.out.println("Bom");
		System.out.println(" dia! \n");
		
		System.out.printf("megasena: %d %d %d %d %n %n", 1, 2 , 3, 4 );
		
		System.out.printf("Salario: %.2f\n", 142.433);
		
		System.out.printf ("Nome: %s%n", "João");
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print ("Digite o seu nome: ");
		String nome = entrada.nextLine (); 
		// programa pede para digitar o nome
		
		System.out.print ("Digite o seu Sobrenome: ");
		String sobrenome = entrada.nextLine ();
		//programa pede pra digitar sobrenome
		
		System.out.print ("Digite sua idade: ");
		int idade = entrada.nextInt ();
		
		// System.out.println ("nome = " + nome + sobrenome +idade);
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		entrada.close();
		
	}
	
}
