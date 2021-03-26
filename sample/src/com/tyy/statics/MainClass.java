package com.tyy.statics;

public class MainClass {
public static void main(String[] args) {
	
	//----------------------------STATIC----------------------------------------
//	StaticClass.age=24;
//	
//	System.out.println(StaticClass.Name);
//
//	System.out.println(StaticClass.age);
//	
//	StaticClass.display();
//}
	  //----------------------NON STATIC ---------------------------------------
//	NonstaticClass n= new NonstaticClass();
//			
//	System.out.println(n.name);
//	
//	System.out.println(n.age);
//		
//	n.info();
//	
//	NonstaticClass ns= new NonstaticClass();
//	
//	System.out.println(ns.name);
//	
//	System.out.println(ns.age);
//		
//	ns.info();
	
	
	//--------------------BOTH STATIC AND NON STATIC ------------------------------------
	
	Static2Class s=new Static2Class();
	System.out.println(s.age);
	s.show();
	System.out.println(Static2Class.Name);
	Static2Class.display();
}}
