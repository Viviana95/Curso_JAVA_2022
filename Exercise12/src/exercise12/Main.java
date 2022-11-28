package exercise12;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> setA = new HashSet<>();
		setA.add("a1");
	    setA.add("a2");
	    setA.add("ab4");
	    setA.add("ab5");
	    
		Set<String> setB = new HashSet<>();
		setB.add("b1");
	    setB.add("b2");
	    setB.add("ab4");
	    setB.add("ab5");
	    
	    SetOperations.union(setA, setB);   
	    
	    SetOperations.interseccion(setA, setB);
	    
	    SetOperations.diferencia(setA, setB);
	    
	    SetOperations.difSimetrica(setA, setB);
	    

	}

}
