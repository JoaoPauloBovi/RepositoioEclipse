package Classe;

import java.util.Date;

public class Equals {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Joao Paulo";
		u1.email = "joaopaulobovileal@gmail.com";

		Usuario u2 = new Usuario();
		u2.nome = "Joao Paulo";
		u2.email = "joaopaulobovileal@gmail.com";

		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));

		// System.out.println(u2.equals(new Date()));
	}
}
