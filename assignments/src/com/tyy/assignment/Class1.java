package com.tyy.assignment;

class Class1
{
  void display(){
   System.out.println("Parent class method");
  }
}
	class Subclass extends Class1
	{
	   void printMsg(){
		
		display();
	   } 
	   public static void main(String args[]){
			
		Subclass obj= new Subclass();
	        obj.printMsg(); 
	   }
	}


