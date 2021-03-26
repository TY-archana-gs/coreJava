package com.tyy.costomexptn;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		int a=6;
		
		for (int i =1 ; i <= a; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}

		System.out.println("-----------------");
	int b=6;
	
	for (int i =1 ; i <= b; i++) {

		for (int j = b; j >= i; j--) {
			System.out.print("* ");
		}
		System.out.println("  ");
	}
	
	System.out.println("-----------------");
	char c1='A';
	
	for (int i =1 ; i <= 5; i++) {

		for (int j = 1; j <= i; j++) {
			System.out.print(c1+" " );
		}
		System.out.println("  ");
		c1++;

	}
	
	System.out.println("-----------------");
	char c='A';
	
	for (int i =1 ; i <= 5; i++) {

		for (int j = 1; j <= i; j++) {
			System.out.print(c+" " );
			c++;

		}
		System.out.println("  ");
		//c++;

	}
	System.out.println("-----------------");
	int d=1;
	
	for (int i =1 ; i <= 5; i++) {

		for (int j = 1; j <= i; j++) {
			System.out.print(d+" " );

		}
		System.out.println("  ");
		d++;

}
	System.out.println("-----------------");
	char e='A';
	
	for (int i =1 ; i <= 5; i++) {

		for (int j = 5; j >= i; j--) {
			System.out.print(e+" " );
			c++;

		}
		System.out.println("  ");
		//c++;

	}
	int inpt = 6;

	System.out.println("Print Square");

	for (int i = 0; i < inpt; i++) {

		for (int j = 0; j < inpt; j++) {

			if ((i == 0 || j == 0) || (i == inpt-1 || j == inpt-1)) {
				System.out.print("  x");
			} else {
				System.out.print("   ");
			}

		}
		System.out.println("   ");
	}
	}}