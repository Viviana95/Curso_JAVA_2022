package personas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class PersonasUtil {
	
	
	public static Map<Integer, Persona> getPersonas(List<Persona> persona) {
		
		
//
//      Map<Integer, Persona> mapPerson = new HashMap<Integer, Persona>();
//		
//		Iterator<Persona> ite = persona.iterator();		
//		while (ite.hasNext()) {
//			Persona personaA = (Persona) ite.next();
//			mapPerson.put((personaA.getId()), personaA);
//			
//		}		

		Map<Integer, Persona> mapPerson = persona.stream().collect(
		Collectors.toMap(x -> x.getId(), x -> x)); 
				
		return mapPerson;
	};

}
