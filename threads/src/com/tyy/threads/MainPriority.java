package com.tyy.threads;

public class MainPriority {

	public static void main(String[] args) {
 System.out.println("thread priority"+Thread.currentThread().getPriority() );
		
		PriorityThread pt= new PriorityThread();
		
		pt.setPriority(6);
		
		pt.start();
		
		System.out.println(pt.getPriority());
		pt.getPriority();
		
		for (int i = 0; i <10; i++) {

			System.out.println("Main Thread");

		}
	}

}
