package com.tyy.exception;

public class Division {
	
	public static void main(String[] args) {
		
		try {
		
		System.out.println("Division"+"  "+(10/0));
		
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			//System.out.println("Division"+(10/2));
			e.printStackTrace();
			e.toString();
		
		}
					System.out.println("Sample " );

	}

}
