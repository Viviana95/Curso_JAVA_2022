package com.capgemini.training.java.ej2;

import java.util.ArrayList;
import java.util.List;

public class MiPila {

	private  List<Integer> numbers = new ArrayList<Integer>();

	/**
	 * @param numbers
	 */

	public  void main(String[] args) {

		numbers.add(8);
		numbers.add(67);
		numbers.add(12);
		numbers.add(18);

		for (int i = 0; i < numbers.size(); i++) {
			
			System.out.println(numbers.get(i));
		}

		push(34);
		pop();
		peek();
		reverse();

	}
	
	public List<Integer> getNumbers() {
		return numbers;
	}



	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public void push(Integer e) {
		numbers.add(e);

	}

	public  int pop() {

		int last = numbers.remove(numbers.size() - 1);
		return last;

	}

	public  int peek() {

		int lastIdx = numbers.size() - 1;
		int lastElement = numbers.get(lastIdx);
		return lastElement;
	}

	public  void reverse() {

		List<Integer> revList = new ArrayList<Integer>();

		for (int i = numbers.size() - 1; i >= 0; i--) {
			revList.add(numbers.get(i));
		}
		numbers = revList;
		
	}

}
