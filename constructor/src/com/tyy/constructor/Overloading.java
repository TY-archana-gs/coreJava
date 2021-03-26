package com.tyy.constructor;

public class Overloading {
	
	Overloading() {
		
		System.out.println("default constrctor");
		
	}
	
    Overloading( int x) {
		
		System.out.println("single argument constrctor"+x);
		
	}
    Overloading( double x, int y) {
		
		System.out.println("double argument constrctor"+ x+ ","+y);
		
	}
   public static void main(String[] args) {
	   new Overloading();
	   new Overloading(20);	   

	   new Overloading(30.6,7);	   

}
}
