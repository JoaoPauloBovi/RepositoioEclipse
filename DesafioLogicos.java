package CapituloUmJava;

public class DesafioLogicos {

public static void main(String[] args) {
	
	boolean trabalho1 = true;
	boolean trabalho2 = true;
	
	boolean comproutv50 = trabalho1 && trabalho2;
	boolean comproutv32 = trabalho1 ^ trabalho2;
	boolean comprousorvete = trabalho1 || trabalho2;
	
	boolean maissaudavel = !comprousorvete;
	
	
	System.out.println("Comprou TV 50\"?" + comproutv50);
	System.out.println("Comprou TV 32\"?" + comproutv32);
	System.out.println("Comprou sorvete?" + comprousorvete);
	System.out.println("mais saudavel ?" + maissaudavel);
	
	
}
	
}
