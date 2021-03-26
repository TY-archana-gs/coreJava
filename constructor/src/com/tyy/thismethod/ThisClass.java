package com.tyy.thismethod;

public class ThisClass {
	
	public ThisClass() {
		this(13,20);
		System.out.println("first constructor");
	}
	public ThisClass( int a,int b) {
		this("archu",23);
		System.out.println("second constructor");
	}
	public ThisClass( String a,int b) {
		//this();
		System.out.println("third constructor");
	}
public static void main(String[] args) {
		new ThisClass();
	}

}
