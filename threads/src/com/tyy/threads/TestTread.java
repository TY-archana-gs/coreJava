package com.tyy.threads;

public class TestTread {

	public static void main(String[] args) {
		
		System.out.println("Main Trhread=="+Thread.currentThread().isDaemon());
		System.out.println("Thread priority =="+Thread.currentThread().getPriority());

		MyThread  my = new MyThread();
		
		System.out.println("Child Thread=="+my.isDaemon());
		my.setDaemon(true);
		System.out.println("Child Thread=="+my.isDaemon());

		//my.getPriority();
		
		my.setPriority(10);

		//my.run();//It will treated as a normal method execute in a flow
		my.start();
		
		//my.start();
System.out.println("My Thread priority =="+my.getPriority());

		System.out.println("tid"+my.getId());
		
	System.out.println("tName="+my.getName());
	
	my.setName("Archana");
	
	System.out.println("Uname"+my.getName());
		
		for (int i = 0; i <3; i++) {

			System.out.println("Main Thread");

		}

	}

}
