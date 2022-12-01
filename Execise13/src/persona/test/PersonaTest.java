package persona.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import personas.Persona;
import personas.PersonasUtil;

class PersonaTest {
	
	private Persona p1; 
	private Persona p2; 
	private Persona p3; 
	private Persona p4; 

	
	List<Persona> listPersonas;
	//List<Persona> listPers;
	
	@BeforeEach
	void setUp() throws Exception {
		
        listPersonas = new ArrayList<Persona>();
   
        //list
		listPersonas.add(new Persona(1, 10, "Masha"));
		listPersonas.add(new Persona(2, 15, "PeppaPig"));
		listPersonas.add(new Persona(3, 8, "Moana"));
		listPersonas.add(new Persona(4, 18, "Mulan"));
		
		
		//map
		p1 = new Persona(1, 10, "Masha");
		p2 = new Persona(2, 15, "PeppaPig");
		p3 = new Persona(3, 8, "Moana");
		p4 = new Persona(4, 18, "Mulan");
		
		
	}
	

	@AfterEach
	void tearDown() throws Exception {
		listPersonas = null;
		p1 = null;
		p2 = null;
		p3 = null;
		p4 = null;
	}

	@Test
	void test_Get_person_True() {
		Map<Integer, Persona> mapPersons = new HashMap<Integer, Persona>();
		mapPersons.put(p1.getId(), p1);
		mapPersons.put(p2.getId(), p2);
		mapPersons.put(p3.getId(), p3);
		mapPersons.put(p4.getId(), p4);
		
		assertEquals(mapPersons, PersonasUtil.getPersonas(listPersonas));
		

	}
	@Test
	void test_Get_person_false() {
		
		p1.setNombre("Ariel");
		Map<Integer, Persona> mapPersons = new HashMap<Integer, Persona>();
		mapPersons.put(p1.getId(), p1);
		mapPersons.put(p2.getId(), p2);
		mapPersons.put(p3.getId(), p3);
		mapPersons.put(p4.getId(), p4);
		
		assertNotEquals(mapPersons, PersonasUtil.getPersonas(listPersonas));

	}
	
	@Test
	void test_order_person_True() {
		
		Set<Persona> treePers = PersonasUtil.orderPersonas(listPersonas);
		
		Iterator<Persona> it = treePers.iterator();		
		assertEquals("Moana", it.next().getNombre());
			
	}
	@Test
	void test_order_person_False() {
		
		Set<Persona> treePers = PersonasUtil.orderPersonas(listPersonas);
		
		Iterator<Persona> it = treePers.iterator();		
		assertNotEquals("Masha", it.next().getNombre());
			
	}
	
	
	
	

}
