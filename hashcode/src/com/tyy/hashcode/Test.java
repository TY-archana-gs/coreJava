package com.tyy.hashcode;

public class Test {
	public static void main(String[] args) {

		Person	p=new Person(10, "Archana");
		//Person per=new Person(10, "Archana");

		System.out.println(p.hashCode());
		System.out.println(p);
        System.out.println(p.toString());
        
       // boolean result=p.equals(per);
       // System.out.println(result);
        
        
       // System.out.println((p==per));//matching the adress of the object
        
        Person p1=p;
        System.out.println((p==p1));
        } 

}
