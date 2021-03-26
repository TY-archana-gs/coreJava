package com.tyy.override;

public class Class1 {
	
	public static void sum(int num) {
		for(int i=0;i<=num;i++) {
			System.out.println(i);
		}
	}
}
     class Subclass extends Class1{
	    public static void sum(int num) {
		for(int i=num;i>=0;i--) {
			System.out.println(i);
		}
	}
	    public static void main(String[] args) {
	    	System.out.println("hello");
	   // Subclass sub=new Subclass(); 
	    	Subclass. sum(5);
	   System.out.println("---------------------");
	   new Class1();
	   Class1.sum(5);
		}
}  

	
