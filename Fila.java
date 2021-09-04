package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add > adc elementos na fila
		// Diferen�a � o comportamento ocorre
		// quando a fila esta cheia
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Lan�a uma exce�ao
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");

		// Peek e Element > obter o proximo elementos da
		// fila (sem remover)

		// Difere�a � o comportamento ocoore
		// quando a fila esta vazia!
		System.out.println(fila.peek()); // retorna false ou null
		System.out.println(fila.peek());
		System.out.println(fila.element());// lan�a uma exce��o
		System.out.println(fila.element());
		
		
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		
		//fila.size(); = contar a fila
		//fila.clear(); = limpar a fila
		//fila.isEmpty(); 
		//fila.contains();
	}
}
