package com.capgemini.training.java.ej2;

import java.util.ArrayList;
import java.util.Collections;

public class MiPila {

	private static ArrayList<Integer> numbers = new ArrayList<Integer>();
	


	public static void main(String[] args) {

		numbers.add(8);
		numbers.add(67);
		numbers.add(12);
		numbers.add(18);
		
		
		push(34);
		pop();
		peek();
		reverse();

	}

	

	public static void push(Integer e) {
		
		numbers.add(e);
		System.out.println("Listado: " + numbers);

	}

	public static void pop() {

		int last = numbers.get(numbers.size() - 1);
		numbers.remove(numbers.size() - 1);
		System.out.print("Último elemento ELIMINADO: " + last);
		System.out.println(" Listado: " + numbers);

	}

	public static void peek() {

		int lastIdx = numbers.size() - 1;
		int lastElement = numbers.get(lastIdx);
		// System.out.println("Última posición: " + lastIdx);
		System.out.println("Último elemento: " + lastElement);
	}

	public static void reverse() {

		Collections.reverse(numbers);
		System.out.println("Lista de números inversa: " + numbers);
	}

	
}
