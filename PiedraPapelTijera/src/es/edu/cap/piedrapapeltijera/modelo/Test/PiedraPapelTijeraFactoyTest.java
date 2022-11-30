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
	void test_getInstance_Papel() {
		assertTrue(PiedraPapelTijeraFactoy.getInstance(PiedraPapelTijeraFactoy.PAPEL) instanceof Papel);
	}
	@Test
	void test_getInstance_Tijera() {
		assertTrue(PiedraPapelTijeraFactoy.getInstance(PiedraPapelTijeraFactoy.TIJERA) instanceof Tijera);
	}

}
