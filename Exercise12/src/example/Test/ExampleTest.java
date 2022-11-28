package example.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercise12.Example;

class ExampleTest {
	String myStr;
	Integer myInt;
	@BeforeEach
	void setUp() throws Exception {
		myStr = new String("Hola");
		myInt = new Integer(10);
	}

	@AfterEach
	void tearDown() throws Exception {
		myStr=null;
		myInt=null;
	}

	@Test
	void test_ConstructString() {
		
		Example<String> strPair = new Example<String>(myStr, "que tal");
		String first = strPair.getFirst();
		String second = strPair.getSecond();
		assertEquals("Hola", first);
		assertEquals("que tal", second);
	}
	@Test
	void test_ConstructInteger() {
		
		Example<Integer> intPair = new Example<Integer>(myInt, new Integer(2));
		Integer first = intPair.getFirst();
		Integer second = intPair.getSecond();
		assertEquals(10, first);
		assertEquals(2, second);
	}

}
