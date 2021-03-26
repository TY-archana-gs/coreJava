package com.tyy.staticprogram;

public class StaticExample {
	
	int rollno;
	   String name;  
	   static String college ="ITS";  
	   StaticExample(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   
	   static void change(){  
		     college = "BBDIT";  
		     }  
	   void display (){System.out.println(rollno+" "+name+" "+college);
	}  

public static void main(String[] args) {
	
	StaticExample s1 = new StaticExample(111,"Karan");  
	StaticExample s2 = new StaticExample(222,"Aryan");  
	StaticExample.change();
		 s1.display();  
		 s2.display();  
		 }  }