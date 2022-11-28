package empleadoTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import empleado.Employee;

class EmployeeTest {
	
	Employee person1;
	Employee person2;
	

	@BeforeEach
	void setUp() throws Exception {
		
		Date fechaIngreso = new Date(2022, 11, 12);
		
		person1	= new Employee(fechaIngreso, 16.000, "PepaPig", 37);	
		person2 = new Employee();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		person1 = null;
		person2 = null;		
	}

	@Test
	void testPersonEquals_True () {
		
		Date fechaIngreso = new Date(2022, 11, 12);
				
		Employee person3 = new Employee(fechaIngreso, 16.000, "PepaPig", 37);	
	    assertTrue(person3.equals(person1));
	   
	}
	
	@Test
	void testPersonEquals_False () {
		
		Date fechaIngreso = new Date(2022, 11, 12);
				
		Employee person3 = new Employee(fechaIngreso, 16.000, "PepaPig", 47);	
	    assertFalse(person3.equals(person1));
	   
	}

}
