package exercise.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercise12.SetOperations;

class SetOperationsTest {

	Set<String> setStrA;
	Set<String> setStrB;
	Set<Integer> setIntA;
	Set<Integer> setIntB;
	@BeforeEach
	void setUp() throws Exception {
		setStrA = new HashSet<String>();
		setStrA.add("A");
		setStrA.add("B");
		setStrA.add("C");
		setStrA.add("D");
		setStrA.add("F");
		
		setStrB = new HashSet<String>();
		setStrB.add("A");
		setStrB.add("B");
		setStrB.add("C");
		setStrB.add("D");
		setStrB.add("E");
		
		setIntA = new HashSet<Integer>();
		setIntA.add(new Integer(1));
		setIntA.add(new Integer(2));
		setIntA.add(new Integer(3));
		setIntA.add(new Integer(4));
		
		
		setIntB = new HashSet<Integer>();
		setIntB.add(new Integer(1));
		setIntB.add(new Integer(2));
		setIntB.add(new Integer(7));
		setIntB.add(new Integer(8));
		
	}

	@AfterEach
	void tearDown() throws Exception {
		setStrA=null;
		setStrB=null;
		setIntA=null;
		setIntB=null;
	}

	@Test
	void test_union_Integer() {
		Set<Integer> totalUnion = new HashSet<Integer>();
		totalUnion.add(1);
		totalUnion.add(2);
		totalUnion.add(3);
		totalUnion.add(4);
		totalUnion.add(7);
		totalUnion.add(8);
		
		assertEquals(totalUnion, SetOperations.union(setIntA, setIntB));
		
		
	}
	@Test
	void test_union_String() {
		Set<String> totalUnionStr = new HashSet<String>();
		totalUnionStr.add("A");
		totalUnionStr.add("B");
		totalUnionStr.add("C");
		totalUnionStr.add("D");
		totalUnionStr.add("E");
		totalUnionStr.add("F");
		
		assertEquals(totalUnionStr, SetOperations.union(setStrA, setStrB));
		
	
	}
	@Test
	void test_Interseccion_Integer() {
		Set<Integer> inters = new HashSet<Integer>();
		inters.add(new Integer(1));
		inters.add(new Integer(2));
		
		assertEquals(inters, SetOperations.interseccion(setIntA, setIntB));	
		
	}
	@Test
	void test_Interseccion_String() {
		Set<String> inters = new HashSet<String>();
		inters.add("A");
		inters.add("B");
		inters.add("C");
		inters.add("D");		
		
		assertEquals(inters, SetOperations.interseccion(setStrA, setStrB));	
		
	}
	
	@Test
	void test_Diferencia_Integer() {
		Set<Integer> difer = new HashSet<Integer>();
		difer.add(new Integer(3));
		difer.add(new Integer(4));
		
		
		assertEquals(difer, SetOperations.diferencia(setIntA, setIntB));	
		
	}
	@Test
	void test_Diferencia_String() {
		Set<String> difer = new HashSet<String>();
		difer.add("F");

		assertEquals(difer, SetOperations.diferencia(setStrA, setStrB));	
		
	}

	
	
	

}
