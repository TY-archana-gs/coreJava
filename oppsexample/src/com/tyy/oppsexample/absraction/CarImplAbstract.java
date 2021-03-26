package com.tyy.oppsexample.absraction;

public class CarImplAbstract  extends CarAbstract{
	void start()  
	{  
	System.out.println("The car engine has been started.");  
	}  
	public static void main(String[] args)  
	{  
		CarImplAbstract obj = new CarImplAbstract();  
	//calling abstract method  
	obj.start();  
	//calling non-abstract method  
	obj.stop();  
	}  
	}  


