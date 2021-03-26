package com.tyy.interfaceass;

public interface StaticMethod {

	void draw();  
	static int cube(int x){
		return x*x*x;
	}  
}  
class Rectangle implements StaticMethod{  
	public void draw(){

		System.out.println("drawing rectangle");
	}  
}  

class TestInterfaceStatic{

	public static void main(String args[]){

		StaticMethod d=new Rectangle();  
		d.draw();  
		System.out.println(StaticMethod.cube(3));  
	}}  


