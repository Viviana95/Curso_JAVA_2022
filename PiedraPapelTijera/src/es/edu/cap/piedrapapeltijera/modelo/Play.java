package es.edu.cap.piedrapapeltijera.modelo;

import java.util.Scanner;

public class Play {

	public static void main(String[] args) {
		
		 System.out.println("Vamos a jugar a piedra-papel-tijera");
		 System.out.println("Ingrese un número: 1-piedra, 2-papel, 3-tijera ");
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int num = sc.nextInt();
		 int numPC = (int)(Math.random() * 3) + 1;
		 
		 //obtengo objetos
		 PiedraPapelTijeraFactoy user = PiedraPapelTijeraFactoy.getInstance(num);
		 PiedraPapelTijeraFactoy pc = PiedraPapelTijeraFactoy.getInstance(numPC);
		 
		 //comparo
		 user.comparar(pc);
		 sc.close();
		 
		 System.out.println("\n\n Taran tann tan .....");
		 System.out.println("\n El usuario eligio.... " + user.getNombre());
		 System.out.println(" El ordenador eligio.... " + pc.getNombre());
		 System.out.println("\n RESULTADO.... " + user.getDescripcionResultado());
	}

}
