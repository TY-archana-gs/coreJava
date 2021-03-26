package com.tyy.wrapperclass;

public class Test {
	
	public static void main(String[] args) {
		
		//Auto-boxing
		
		int x=10;
		Integer integer= new Integer(x);
		System.out.println(integer);
	
		//Auto-UnBoxing
       Double dub= new Double(19.5);
       double a=dub;
       
       double s1=30.34;
       int i=(int)s1;
       {
		System.out.println(a);
		System.out.println(i);


}
}}