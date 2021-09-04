package CapituloUmJava;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print ("Digite um numero: ");
		double numero1 = entrada.nextDouble (); 
		
		System.out.print ("Digite o segundo numero: ");
		double numero2 = entrada.nextDouble(); 
		
		
		System.out.print ("Digite um simbolo: ");
		String simbolo = entrada.next (); 
		
		double resultado = "+".equals(simbolo) ? numero1 + numero2 : 0;
		 resultado = "*".equals(simbolo) ? numero1 * numero2 : resultado;
		 resultado = "/".equals(simbolo) ? numero1 / numero2 : resultado;
		 resultado = "-".equals(simbolo) ? numero1 - numero2 : resultado;		
		 resultado = "%".equals(simbolo) ? numero1 % numero2 : resultado;		
		
		System.out.println(resultado);
		
		entrada.close();
		
		
	}
}
