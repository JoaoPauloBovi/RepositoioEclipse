package CapituloUmJava;

public class DesafioAritmeticos {
	
public static void main(String[] args) {
	
	int x = 3 * 4 - 10;
	int y = (int) Math.pow(x, 3);
	/* Math.pow é para elevar a potancia, 
	ex: numero elevado a 3 */
	
	System.out.println(y);
	
	
	double numA = Math.pow(6 * (3 + 2) , 2);
	double denA = 3 * 2;
	
	double numB = (1 - 5) * (2 - 7);
	double denB = 2;
	
	double superiorA = numA / numB;
	double superiorB = Math.pow (numB / denA, 2);
	
	double superior = Math.pow (superiorA - superiorB, 3);
	double inferior = Math.pow(10, 3);
	
	double resultado = superior / inferior;
	
	System.out.println(resultado);
			

	
	
}
	
}
