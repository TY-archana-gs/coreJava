package com.tyy.overloading;

public class MethodOverloading {
	
	public int add(int a,int b) {
		
		System.out.println("adding  int"+ "="+(a+b));
		return a+b;
	}
    public double add(double a,double b) {
		
		System.out.println("adding "+"="+ (a+b));
		return a+b;
	} 
    public void add(float a,float b) {
		
		System.out.println("adding "+ "="+(a+b));
	} 
    
    
    public static void main(String[] args) {
    	MethodOverloading meth=new MethodOverloading();
    	meth.add(20, 30);
    	meth.add(30.9,30);
    	meth.add(400, 2);
    	
	}
}
