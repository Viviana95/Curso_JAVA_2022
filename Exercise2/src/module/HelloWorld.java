package module;

public class HelloWorld {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		for (int j = 1; j < 11; j++) {
		for (int i = 0; i < array.length; i++) {
			int result = j * array[i];
			System.out.println(j + " * " + array[i] + " es = " + result );
		}
		System.out.println("\n");
		}
	}

}
