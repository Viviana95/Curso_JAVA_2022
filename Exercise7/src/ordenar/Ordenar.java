package ordenar;

public class Ordenar {

	public static void main(String[] args) {
		int[] numbers = { 9, 5, 3, 2 };	
		    
		for (int i = 0; i < numbers.length - 1; i++) {
		        for (int j = i + 1; j < numbers.length; j++) {
		            if (numbers[i] > numbers[j]) {
		        
		                int temporal = numbers[i];
		                numbers[i] = numbers[j];
		                numbers[j] = temporal;		               
		            }		           
		        } 		        
		    }
		
	        for (int i : numbers) {
	            System.out.println(i);
	        }

	}

}
