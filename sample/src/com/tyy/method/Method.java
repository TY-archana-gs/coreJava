package com.tyy.method;

public class Method {
	
	public void method1() {
		
		int id=10;
		System.out.println("THis is first method"+id);

		System.out.println("THis is first method");
	}
	
  public void method2() {
		
		System.out.println("THis is second method");
		
		method1();
	}
	

}
