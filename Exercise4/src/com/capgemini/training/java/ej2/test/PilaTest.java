package com.capgemini.training.java.ej2.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.training.java.ej2.MiPila;
import com.capgemini.training.java.ej2.Pila;

class PilaTest extends Pila {
	
	
	Pila pila = new Pila();
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		
		pila.push(8);
		pila.push(20);
		pila.push(5);
		pila.push(3);
		pila.push(45);
	}

	@AfterEach
	void tearDown() throws Exception {
		pila = null;
	}

	@Test
	void test_Push() {
	pila.push(15);
		assertEquals(6, pila.getNumbers().size());
		
	}
	@Test
	void test_Pop() {
		assertEquals(45, pila.pop());
		
	}
	@Test
	void test_Peek() {
		pila.push(1);
		assertEquals(1, pila.peek());
		
	}
	@Test
	void test_Reverse() {
		List<Integer> revList = new ArrayList<Integer>();
		revList.add(45);
		revList.add(3);
		revList.add(5);
		revList.add(20);
		revList.add(8);
		
		pila.reverse();
		
		assertEquals(revList, pila.getNumbers());
		
	}
	

}
