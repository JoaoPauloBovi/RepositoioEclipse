package CapituloUmJava;

import javax.swing.JOptionPane;

public class DesafiaCalculadora2 {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Insira o primeiro numero");
		String num2 = JOptionPane.showInputDialog("Insira o segundo numero");
		String simb = JOptionPane.showInputDialog("Insira o simbolo numero");
		
		System.out.println(num1 + simb + num2);
		
		double numer1 = Double.parseDouble(num1);
		double numer2 = Double.parseDouble(num2);
		int simb2 = Integer.parseInt(simb);
		
		double resultado = (numer1 + simb2 + numer2);
		
		System.out.println(resultado);
		
		
	}
}
