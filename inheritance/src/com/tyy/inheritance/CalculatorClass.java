package com.tyy.inheritance;

public class CalculatorClass {

	public void add(int a, int b) {
		int sum= a+b;
		System.out.println("This is adition"+"="+sum);
	}
	public void sub(int a, int b) {
		int subs= a-b;
		System.out.println("This is sub"+"="+subs);
	}
	
	public void mul(int a, int b) {
		int multi= a*b;
		System.out.println("This is multiplication"+"="+multi);
	}
	
	public void div(int a, int b) {
		float divs= a/b;
		System.out.println("This is division"+"="+divs);
	}
}
