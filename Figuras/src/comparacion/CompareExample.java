package comparacion;

import java.util.Set;
import java.util.TreeSet;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Figura;
import figuras.exceptions.FiguraException;

public class CompareExample {

	public static void main(String[] args) throws FiguraException {
		Set<String> listName = new TreeSet<>();
		listName.add(new String ("Gabriel"));
		listName.add(new String ("Marina"));
		listName.add(new String ("Paz"));
		listName.add(new String ("Patri"));
		listName.add(new String ("Lucy"));
		listName.add(new String ("Cris"));
		listName.add(new String ("Nerea"));
		listName.add(new String ("Marta"));
		listName.add(new String ("Vivi"));
		
		int i = 1;
		for(String str: listName) 
			System.out.println(i++  + " name: " + str);
		
		Set<Figura> figuras = new TreeSet<Figura>();
		
		figuras.add(new Cuadrado("Cuadrado", 1));
		figuras.add(new Cuadrado("Hola", 5));		
		figuras.add(new Cuadrado("SegCuadrado", 25));
		figuras.add(new Circulo("Probar", 15));
		figuras.add(new Circulo("Que tal", 15));
		figuras.add(new Circulo("ACirculo", 15));
		i=1;
		for(Figura fig: figuras  )
			System.out.println(i++  + " figura: " + fig);
		
		

	}

}
