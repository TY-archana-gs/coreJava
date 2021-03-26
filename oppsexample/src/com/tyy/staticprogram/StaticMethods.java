package com.tyy.staticprogram;

public class StaticMethods {
	int age;
	String name;
	static String clg="GECH";
	 
	/*
	 * public static void show() {
	 * 
	 * System.out.println("This is Student Information"); }
	 */


	 StaticMethods(int age,String name) {
		age=this.age;
		name=this.name;
	}
	
	public void display() {
		System.out.println(age+","+name+","+clg);
	}



}
