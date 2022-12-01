package ABC;

import exception.ExceptionA;

public class C {

	public static void main(String[] args) {

		try {
			A.a();
		} catch (ExceptionA e) {
			e.printStackTrace();
			
		}
		A.b();
	}

}
