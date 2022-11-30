package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {

	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
//		cal.set(1973, Calendar.NOVEMBER, 17);
//
//		cal.add(Calendar.DATE, 2);
//
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy EEE");
//		System.out.println("La fecha es " + sdf.format(cal.getTime()));
//		System.out.println("El año es " + cal.get(Calendar.YEAR));
//		System.out.println("El mes es " + (cal.get(Calendar.MONTH) + 1));
//		System.out.println("El día es " + cal.get(Calendar.DATE));
//		System.out.println("El día de la semana es " + cal.get(Calendar.DAY_OF_WEEK));
		
		Calendar cal = Calendar.getInstance();
		
		System.out.print("Ingrese el año:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.print("Ingrese el mes:");
		int month = sc.nextInt();
		System.out.print("Ingrese el día:");
		int day = sc.nextInt();

		calendarPrint(day,month, year );
		sc.close();
		
		//System.out.println("Ultimo día es " + getLastDay(Calendar.FEBRUARY, 2022));

	}

	public static void calendarPrint(int year, int month, int day) {

		

		System.out.print("Sun\t Mon\t Tue\t Wed\t Thu\t Fri\t Sat\n");
		
		int dayM = monthLength(month, year); //dias del mes
		int spaces = getSpace(day, month, year); // número de días para imprimir

		
		//1ra fila
		for(int i = 1; i<spaces;i++) {
			System.out.print("\t");
		}
		//mes con día exacto
		for (int i = 1; i <= dayM; i++) {
            System.out.print(i); 				
            if (i== day) System.out.print("*");
            System.out.print("\t");
            if (((i + spaces - 1) % 7 == 0) || (i == dayM)) 
            	System.out.println();
		}

	}
	
	private static int getSpace(int day, int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		return cal.get(Calendar.DAY_OF_WEEK);
	}
	
	private static int monthLength(int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		int days = 1;
		
		while(cal.get(Calendar.MONTH)==(month-1)) {
			days = cal.get(Calendar.DATE);
			cal.add(Calendar.DATE, 1);
		}
		return days;
	}

	private static int getLastDay(int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, 1);
		int lastday = 1;
		while (cal.get(Calendar.MONTH) == month) {
			lastday = cal.get(Calendar.DATE);
			cal.add(Calendar.DATE, 1);
		}
		return lastday;

	}
}
