package com.capgemini.training.java.ej2;

import java.util.ArrayList;
import java.util.List;

public class Pila <E>{
	private  List<E> numbers = new ArrayList<E>();

	
	public List<E> getNumbers() {
		return numbers;
	}

	public Pila(List<E> numbers) {
		super();
		this.numbers = numbers;
	}

	public Pila() {
		
	}

	public void setNumbers(List<E> numbers) {
		this.numbers = numbers;
	}

	public void push(E e) {
		numbers.add(e);

	}

	public int pop() {

		int last =   (int) numbers.remove(numbers.size() - 1);
		return last;

	}

	public  int peek() {

		int lastIdx = numbers.size() - 1;
		int lastElement = (int) numbers.get(lastIdx);
		return lastElement;
	}

	public  void reverse() {

		List<E> revList = new ArrayList<E>();

		for (int i = numbers.size() - 1; i >= 0; i--) {
			revList.add((E) numbers.get(i));
		}
		numbers =  revList;
		
	}
}
