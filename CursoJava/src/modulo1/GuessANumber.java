package modulo1;

import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		// 1- Consigna es el ordenador elige un numero entre 0 y 100
		// 2- El participante ingresa un numero
		// 3- El sistema debe indicar si el numero ingresado es mayor o menor al numero elegido
		// 4-Se debera contar los intentos
		// utilizar un ciclo
		// al finalizar debera felicitar y decir cuantos intentos lo logro
		
		Scanner sc = new Scanner(System.in);
		System.out.println("El juego consiste en averiguar un número secreto, solo 5 intentos.");
		System.out.println("Ingrese un numero del 1 al 100");
		
		int number = sc.nextInt();
		int lotery = (int)(Math.random()*100);	
		int intento= 5;
		
		for (int i=1; i<=intento;i++){ 

		   if(number == lotery) {	
			  System.out.println("¡Felicitaciones!, acertaste con " + i + " intentos.");	
			  break;			
		   }
		    else if(number > lotery){
			  System.out.println("Incorrecto, el numero ganador es menor, intento " + i );					
		   }
		   else {
			  System.out.println("Incorrecto, el numero ganador es mayor, intento " + i );   
		  }		 		 
		 
		   if (i == 5 ) { 
		      System.out.println("Lo siento: ¡has perdido!. El número era el: " + lotery); 
		      break; 
		      }
		   System.out.println("Otro intento: "); 
		   number = sc.nextInt();
	  } 	  
   }

}
