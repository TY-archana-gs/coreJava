package com.tyy.synchronization;

public class Display {
	
	public synchronized void  wish(String name,int id) {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Good afternoon");
			
		try {
			Thread.sleep(2000);
	    	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name);
		System.out.println(id);


	}

	}
}
