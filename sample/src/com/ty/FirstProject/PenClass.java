package com.ty.FirstProject;

public class PenClass {

//	 String color="yellow";
//	 String name="ball pen";
//	public  void write()
//	{
//		System.out.println("writing");
//	}
	
	public static void main(String[] args) {
		 
		CarClass p=new CarClass();
		p.write();
		
		System.out.println("Pen color is"+"="+p.color);
		System.out.println("Pen cost is"+"="+ p.cost);
		System.out.println("pen name is"+"="+p.name);

	}
}
