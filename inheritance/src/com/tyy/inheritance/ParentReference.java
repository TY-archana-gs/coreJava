package com.tyy.inheritance;

public class ParentReference {
	public static void main(String[] args) {
		/*
		 * Cycle b= new Bike(); ((Bike) b).start(); b.cost=200000; b.name();
		 */
	
	
	Bike b=new Bike();
	
	b.start();
	b.cost=3000;
	b.name();
	}

}
