package CapituloUmJava;

public class ternario {

	public static void main(String[] args) {
		
		double media = 3.6;
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado." : resultadoParcial;
		
		System.out.println("O aluno esta " + resultadoFinal);
	}
}
