package CapituloUmJava;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2;
		
		boolean estaDeFerias = false;
		
		char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365 + " dias de empresa");
		
	   // Número de viagens
		
		System.out.println(542 / 2 + " viagens");
		
		// pontos por real
		
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println( id + " : ganha: " + salario);
		
		System.out.println("ferias ?" + estaDeFerias);
		
		System.err.println("Status: " + status);
	}
	
}
