package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto"); // numero sao chaves
		usuarios.put(20, "Ricardo"); // nomes sao valores
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());

		System.out.println(usuarios.keySet()); // chaves
		System.out.println(usuarios.values()); // valores
		System.out.println(usuarios.entrySet()); // chave + valores

		System.out.println(usuarios.containsKey(20)); // contem chave 20
		System.out.println(usuarios.containsValue("Rebeca")); // contem valor ;
		
		System.out.println(usuarios.get(4));// volta o valor
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove("Gui"));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey() + "-> ");
			System.out.println(registro.getValue());
		}
		
	}

}
