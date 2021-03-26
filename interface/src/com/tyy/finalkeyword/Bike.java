package com.tyy.finalkeyword;

public  class Bike {
	
	final int speed=100;
	static final String name="archana";
	final void moving() {
		//speed=120;
		System.out.println("Bike is moving"+speed+name);
	}
  public static void main(String[] args) {
	Bike b=new Bike();
	b.moving();
	//Bike.name="Archana";
	
}
}
