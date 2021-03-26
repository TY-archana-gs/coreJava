package com.tyy.exception;


public class Demo {
	public static void main(String[] args) {

		try {
			int a[] = { 2, 4, 5, 7 };
			System.out.println(a[9]);

		} catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			try {
				int a[] = { 2, 4, 5, 7 };
				System.out.println(a[9]);

			} catch (ArrayIndexOutOfBoundsException exc) {
				//System.out.println("ArrayIndexOutOfBoundsException" );
				System.out.println(exc.getMessage() );

			} catch (Exception exc) {
				System.out.println("Exception");

			}
}
			finally {
				System.exit(0);
				System.out.println("this is finally block");
			}
	}
}
