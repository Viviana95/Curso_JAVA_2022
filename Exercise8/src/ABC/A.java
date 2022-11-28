package ABC;

import exception.ExceptionA;
import exception.ExceptionB;

public class A {

	public static void a() throws ExceptionA {
		throw new ExceptionA("checked exception");

	}

	public static void b() throws ExceptionB {
		throw new ExceptionB("unchecked exception");
	}
}
