package com.tyy.interfaceass;

public interface DefaultMethod {

	void draw();  
	default void msg(){
		System.out.println("default method");
		}  
}  
class Hello implements DefaultMethod{ 
	
	public void draw(){
		System.out.println("drawing rectangle");
		}  
}  
class TestInterfaceDefault{  
	
	public static void main(String args[]){  
		DefaultMethod d=new Hello();  
		d.draw();  
		d.msg();  
	}}  


