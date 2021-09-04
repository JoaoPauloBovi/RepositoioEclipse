package Arrays;

import java.util.Arrays;

public class exercicio {

	public static void main(String[] args) {
		
		double [] notasAlunoA = new double[3];		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		
		//Arrays.toString(notasAlunoA);
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		
		for(int i = 0; i < 3; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / 3);
		
		double[] notasAlunoB = {6.7, 8.9, 5.5, 10};
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoB.length);

	}
	
}
