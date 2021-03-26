package com.tyy.override;

public class StaticOverriding {
	
	public static void display()   
	{   
	System.out.println("Static method called.");   
	}   
	public static void display(int x)   
	{   
	System.out.println("An overloaded static method called.");   
	}   
	public static void main(String args[])   
	{   
		StaticOverriding.display();   
		StaticOverriding.display(160);   
	}   
	} 


