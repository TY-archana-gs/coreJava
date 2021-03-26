package com.tyy.threads;

public class MyTestThread {
public static void main(String[] args) {
	
	System.out.println("Thread priority =="+Thread.currentThread().getPriority());	
	for (int i = 0; i <3; i++) {

		System.out.println("Main Thread");

	}
	
	
	MyThread  my = new MyThread();
	my.setPriority(1);
	my.start();
	
	System.out.println("My Thread priority =="+my.getPriority());
	
	for (int i = 0; i <3; i++) {

		System.out.println("Main Thread");

	}
	
}
}
