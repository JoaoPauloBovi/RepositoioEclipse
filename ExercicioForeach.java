package Arrays;

import java.util.Arrays;

public class ExercicioForeach {
	
	public static void main(String[] args) {
	
		double [] notasAlunoA = new double[3];		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		
		//Arrays.toString(notasAlunoA);
		System.out.println(Arrays.toString(notasAlunoA));
		
		for(double nota: notasAlunoA) {
			System.out.println(nota);
		}
		System.out.println(); //quebrar linha
		
double[] notasAlunoB = {6.7, 8.9, 5.5, 10};
	
		for(double nota : notasAlunoB) {
			System.out.println(nota);
		}
}
}
