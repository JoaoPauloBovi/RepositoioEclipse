package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		// ArrayList nao usa HashCode

		// criou variario e adc na lista
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);

		// criou objt colocou na lista
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));

		System.out.println(lista.get(3).nome);// acessa pelo índice
		// imprime indice 3 = Bia

		System.out.println("Removido >>>'" + lista.remove(1) + "'");
		System.out.println(lista.remove(new Usuario("Manu")));

		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		System.out.println("Tem? " + lista.contains(u1));

		for (Usuario u : lista) {
			System.out.println(u.nome);
		}

	}
}
