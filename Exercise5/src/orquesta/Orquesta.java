package orquesta;

import java.util.ArrayList;

public abstract class Orquesta {

	private static ArrayList<Instrumento> instrumentos = new ArrayList<> ();	
		
	public static void main(String[] args) {
		
	   instrumentos.add(new Piano());
	   instrumentos.add(new Guitarra());
	   
	  instrumento();  
		

	}
	
	
	public static void instrumento() {
		for(int i=0; i<instrumentos.size(); i++) {
			System.out.println(instrumentos.get(i).sonar());
		}
	}


	

}
