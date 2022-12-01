package planet.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import planet.Planet;

class PlanetTest {

	String planetName;
	double planetRadio;
	double planetMasa;
	
	@BeforeEach
	void setUp() throws Exception {
		
		planetName = "VENUS";
		planetRadio = 6.0518e6;
		planetMasa = 4.869e+24;
		
	}

	@AfterEach
	void tearDown() throws Exception {
		planetName = null;
		planetRadio = 0;
		planetMasa = 0;
		
	}

	@Test
	void test_planet_name() {
		assertEquals(planetName, Planet.VENUS.toString());
	}
	@Test
	void test_planet_radio() {
		assertEquals(planetRadio, Planet.VENUS.getRadio());
	}
	@Test
	void test_planet_masa() {
		assertEquals(planetMasa, Planet.VENUS.getMasa());
	}

}
