package com.tyy.threads;

public class TestRunnable {
	
	public static void main(String[] args) {
		RunableThread rt=new RunableThread();
		
		Thread th= new Thread(rt);
		th.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main method");
			
		}
		
		
		
	}

}
