package com.tyy.threads;

public class PriorityThread extends Thread{
	
	@Override
	public void run() {
		
		//Thread.yield();
		for (int i = 0; i < 8; i++) {
			
			System.out.println("This is pripority clss");
			
		}
	}
	

}
