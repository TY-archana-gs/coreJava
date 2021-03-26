package com.tyy.finalkeyword;

public class Bike {
	
		  void cube(final int n){  
		//   n=n+2;  // compile time error
		 System.out.println(n*n*n);  
		  }  
		  public static void main(String args[]){  
		    Bike b=new Bike();  
		    b.cube(5);  
		 }  
		}  


