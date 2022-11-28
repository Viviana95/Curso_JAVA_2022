package exercise12;

import java.util.HashSet;
import java.util.Set;

public abstract class SetOperations <T>{
	
	 //TODO
    public static <T> Set<T> union(Set<T> setA, Set<T> setB) {
        Set <T> unionSet = new HashSet <T>(setA);       
        unionSet.addAll(setB);
       // System.out.println("A union B: " + unionSet);
        return unionSet;
    }
    
    //TODO
    public static <T> Set<T> interseccion(Set<T> setA, Set<T> setB) {
    	 Set <T> interSet = new HashSet <T>(setA);       
         interSet.retainAll(setB);
     //   System.out.println("A intersection B: " + interSet);
    	return interSet;
    }
    
    //TODO
    public static <T> Set<T> diferencia(Set<T> setA, Set<T> setB) {
        
    	Set <T> difSetA = new HashSet <T>(setA);       
    	difSetA.removeAll(setB);
    	Set <T> difSetB = new HashSet <T>(setB);       
    	difSetB.removeAll(setA);

     // System.out.println("A difference B: " + difSetA);
     //  System.out.println("B difference A: " + difSetB);
    	return difSetA;
    }
    
    //TODO
    public static <T> Set<T> difSimetrica(Set<T> setA, Set<T> setB) {
        
    	Set <T> difsim = SetOperations.union(setA, setB);
        difsim.removeAll(SetOperations.interseccion(setA, setB));
       System.out.println("difference sim : " + difsim); 
        return difsim;
    	
//    	Set <T> difSimSet = new HashSet <T>(setA); 
//        difSimSet.addAll(setB);
//        Set<T> tmp = new HashSet<T>(setA);
//        tmp.retainAll(setB);
//        difSimSet.removeAll(tmp);
//        System.out.println("difference sim : " + difSimSet);  	
//    	return difSimSet;
    }
}
