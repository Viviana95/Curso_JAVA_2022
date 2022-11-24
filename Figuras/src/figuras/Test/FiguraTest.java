package figuras.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Figura;
import figuras.exceptions.FiguraException;

class FiguraTest {
	//lote pruebas
	Cuadrado cuaVacio;
	Cuadrado cuaLleno;
	Circulo cirVacio;
	Circulo cirLleno;
	
	//la lista se guarda forma ordered, permite duplicar, set no duplica
	List<Figura> figuraList;
	Set<Figura> figuraSet;
	
	

	@BeforeEach
	void setUp() throws Exception {
		
		cuaVacio = new Cuadrado();
		cuaLleno = new Cuadrado("cuadrado", 10);
		
		cirVacio = new Circulo();
		cirLleno = new Circulo("circulo", 10);
		
		figuraList = new ArrayList<>();
		
		figuraList.add(cuaVacio);
		figuraList.add(cuaLleno);
		figuraList.add(cirLleno);
		figuraList.add(cirVacio);
		
		figuraList.add(new Cuadrado("cuadrado 2", 15));
		figuraList.add(new Circulo("circulo 2", 15));
		
		figuraSet = new HashSet<>();
		
		figuraSet.add(cirLleno);
		figuraSet.add(cuaVacio);
		figuraSet.add(cuaLleno);
		
		figuraSet.add(cirVacio);
		
		figuraList.add(new Cuadrado("cuadrado 2", 15));
		figuraList.add(new Circulo("circulo 2", 15));
		
	}

	@AfterEach
	void tearDown() throws Exception {
		cuaVacio = null;
		cuaLleno = null;
		cirVacio = null;
		cirLleno = null;
		
		figuraList = null;
		figuraSet = null;
		
		Figura.clear();
	}

	@Test
	void testCuadradoLlenoGetNombre() {
		assertEquals("cuadrado", cuaLleno.getNombre());
	}
	@Test
	void testCuadradoLlenoGetLado() {
		assertEquals(10, cuaLleno.getLado(), 0.001);
	}
	
	@Test
	void testCalcularPerimetro() {
		assertEquals(40, cuaLleno.calcularPerimetro(), 0.001);
	}
	@Test
	void testCalcularSuperficie() {
		assertEquals(100, cuaLleno.calcularSuperficie(), 0.001);
	}
	
	@Test
	void testCuadradoHasnCode_TRue() {
		try {
			assertTrue(figuraList.contains(new Cuadrado("cuadrado", 10)));
		} catch (FiguraException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}
	@Test
	void testCuadradoHasnCode_False() {
		try {
			assertFalse(figuraList.contains(new Cuadrado("cuadradoo", 10)));
		} catch (FiguraException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}
	
	
	@Test
	void testCuadradoEqualsList_Cant() {
		figuraList.add(new Cuadrado());
		assertEquals(7, figuraList.size());
	}
	
	@Test
	void testCuadradoEqualsSet_Cant() {
		figuraSet.add(new Cuadrado());
		assertEquals(6, figuraList.size());
	}
	
	@Test
	void testCuadradoEquals_TRue() throws FiguraException {
		Cuadrado miCuadrado = new Cuadrado("cuadrado", 10);
        assertTrue(cuaLleno.equals(miCuadrado));
	}
	@Test
	void testCuadradoEquals_False() throws FiguraException {
		Cuadrado miCuadrado = new Cuadrado("cuadradoo", 15);
		assertFalse(cuaLleno.equals(miCuadrado));
	}
	
	@Test
	void testCuadrado_FiguraException() {
		
		Cuadrado cua = new Cuadrado();
		
		System.out.println("lista de figuras");
		System.out.println(figuraList);
		System.out.println();
		try {
			cua.setLado(-10);
		} catch (FiguraException e) {
			assertEquals("Hay un error", e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	void testCantObjetos() throws FiguraException {
		assertEquals(8, Figura.getCantFiguras() );
	}
	@Test
	void testCantObjeto() throws FiguraException {
		Cuadrado cua = new Cuadrado();
		Cuadrado cua2 = new Cuadrado();
		assertEquals(10, Figura.getCantFiguras() );
	}
	
	
	
	

}
