package com.tyy.singletone;

public class TestMain {

	public static void main(String[] args) {
     
		Singletone.getInstance();
		
		 Singletone s1 = Singletone.getInstance();
		 Singletone s = Singletone.getInstance();
		
		System.out.println((s1==s));

	}

}
