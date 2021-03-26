package com.tyy.exception;

public class Test {
	public static void stuff() throws Exception{
		//stuff2();
		
		System.out.println("Exception is handled");

		System.out.println((10/0));
		
	}
	public static void stuff1() throws Exception {
		stuff();
		System.out.println("stuff1 executing");
		
	}
	public static void stuff2() throws Exception {
		stuff1();
		System.out.println("stuff2 executing");
		
	}
	
	public static void main(String[] args)  {
		try {
			stuff2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}

}
