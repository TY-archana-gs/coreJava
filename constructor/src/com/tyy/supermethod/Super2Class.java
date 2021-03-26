package com.tyy.supermethod;

public class Super2Class extends SuperKeyword {
	
	int maxxspeed=300;
	
	 void speed() {
		System.out.println("Bike"+maxxspeed);
		System.out.println("Car"+super.maxspeed);
	
	}
   public static void main(String[] args) {
	
	   Super2Class s=new Super2Class();
	   s.speed();
	   
}
}
