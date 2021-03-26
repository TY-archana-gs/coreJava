package com.tyy.polymarphism;

public class SonClass extends FatherClass{
	
	public void bike() {
		
		System.out.println("Modification bike");
	}
	  public static void main(String[] args) {
		  System.out.println("hello");
//		  
//		  FatherClass father= new FatherClass();
//		  father.bike();
//		  
	  SonClass son	=new SonClass();
		  son.bike();
		  
		  FatherClass father =new SonClass();
		  father.bike1();
		  
	}
}
