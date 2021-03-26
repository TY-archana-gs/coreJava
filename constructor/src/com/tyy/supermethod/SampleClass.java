package com.tyy.supermethod;

public class SampleClass {
	
	String name;
	int age;
	
	public SampleClass(int age,String name) {
		super();
		this.age=age;
		this .name=name;
		
		System.out.println("default constructor of sample"+name+","+age);
	}

}
