package CapituloUmJava;

public class Veiculo {

	float velAtual = 0.0f;
	long numDeSerie = 0;
	
	void acelerar (float deltaV) {
		velAtual += deltaV;
	}
	
	void brecar() {
		velAtual -= 1.0f;
	}
	
	void parar () {
		while (velAtual > 0) {
			brecar();
		}
	}
}
