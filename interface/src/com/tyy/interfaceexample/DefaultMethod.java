package com.tyy.interfaceexample;

public interface DefaultMethod {
	
	public void play();
	
	public static void work() {
		System.out.println("static methods");
	}
	
	default void sign() {
		System.out.println("default method");
	}
	
	
}
