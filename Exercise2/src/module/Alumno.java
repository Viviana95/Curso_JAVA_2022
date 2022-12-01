package module;

import java.util.Scanner;

public class Alumno {

	public static void main(String[] args) {
				
				System.out.println("Introduzca un número del 1 al 100");
				Scanner sc = new Scanner (System.in);
				int nota = sc.nextInt();
				
				sc.close();
				
				  if (nota >=0 && nota <=50) {
					  System.out.println("Suspenso");	
				}
				  
				  if (nota >=51 && nota <=75) {
					  System.out.println("Recuperar");	
				}
				  if (nota >=76 && nota <=90) {
					  System.out.println("Aprobado");	
				}
				  if (nota >=91 && nota <=100) {
					  System.out.println("Aprobado con mérito");	
				}
				  if (nota >100 || nota <0) {
					  System.out.println("Error al introducir el dato");	
				}
			

		}

	

}
