package es.edu.cap.piedrapapeltijera.modelo.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.edu.cap.piedrapapeltijera.modelo.Papel;
import es.edu.cap.piedrapapeltijera.modelo.Piedra;
import es.edu.cap.piedrapapeltijera.modelo.PiedraPapelTijeraFactoy;
import es.edu.cap.piedrapapeltijera.modelo.Tijera;

class PiedraPapelTijeraFactoyTest {
	
	//lote pruebas
    PiedraPapelTijeraFactoy piedra, papel, tijera;

	@BeforeEach
	void setUp() throws Exception {
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
	
	}

	@AfterEach
	void tearDown() throws Exception {
		
		piedra = null;
		papel = null;
		tijera = null;
	}

	@Test
	void test_getInstance_Piedra() {
		assertTrue(PiedraPapelTijeraFactoy.getInstance(PiedraPapelTijeraFactoy.PIEDRA) instanceof Piedra);
	}
	@Test
	void test_getInstance_Piedra_false() {
		assertFalse(PiedraPapelTijeraFactoy.getInstance(PiedraPapelTijeraFactoy.PIEDRA) instanceof Papel);
	}
	@Test
	void test_getInstance_Papel() {
		assertTrue(PiedraPapelTijeraFactoy.getInstance(PiedraPapelTijeraFactoy.PAPEL) instanceof Papel);
	}
	@Test
	void test_getInstance_Papel_false() {
		assertFalse(PiedraPapelTijeraFactoy.getInstance(PiedraPapelTijeraFactoy.PAPEL) instanceof Tijera);
	}
	@Test
	void test_getInstance_Tijera() {
		assertTrue(PiedraPapelTijeraFactoy.getInstance(PiedraPapelTijeraFactoy.TIJERA) instanceof Tijera);
	}
	@Test
	void test_getInstance_Tijera_false() {
		assertFalse(PiedraPapelTijeraFactoy.getInstance(PiedraPapelTijeraFactoy.TIJERA) instanceof Papel);
	}
	@Test
	void test_Piedra_gana_Tijera() {
		assertEquals(1, piedra.comparar(tijera));
	}
	@Test
	void test_Tijera_pierde_Piedra() {
		assertEquals(-1, tijera.comparar(piedra));		
	}
	@Test
	void test_Tijera_gana_Papel() {
		assertEquals(1, tijera.comparar(papel));
	}
	@Test
	void test_Papel_pierde_Piedra() {
		assertEquals(-1, papel.comparar(tijera));		
	}
	@Test
	void test_Papel_gana_Piedra() {
		assertEquals(1, papel.comparar(piedra));
	}
	@Test
	void test_Piedra_pierde_Papel() {
		assertEquals(-1, piedra.comparar(papel));		
	}
	@Test
	void test_Piedra_igual_Piedra() {	
		assertEquals(0, piedra.comparar(piedra));
		assertEquals("piedra empata con piedra", piedra.getDescripcionResultado());
	}
	@Test
	void test_Papel_igual_Papel() {
		assertEquals(0, papel.comparar(papel));
		assertEquals("papel empata con papel", papel.getDescripcionResultado());
	}
	@Test
	void test_Tijera_igual_Tijera() {
		assertEquals(0, tijera.comparar(tijera));
		assertEquals("tijera empata con tijera", tijera.getDescripcionResultado());
	}
	
	
	
	

}
