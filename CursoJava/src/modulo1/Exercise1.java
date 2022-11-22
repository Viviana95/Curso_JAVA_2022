package modulo1;

import java.util.Scanner;

/**
 * 
 * @author vtrujill
 * Esto es un ejemplo
 */
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = new String ("Hola");
		
		System.out.println("Ingrese un numero");	
		
		int i = sc.nextInt();
		int number = (int)(Math.random()*100);
		
		System.out.println("loteria... " + number);
		
		if(number == i)
			System.out.println("Ganastes");
		else
			System.out.println("Perdistes");			

	}

}
