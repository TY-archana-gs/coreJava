package com.tyy.synchronization;

public class MyThread  extends Thread{
	
	Display d;
	int id;
	String name;
	public MyThread(Display d, int id,String name) {
		super();
		this.d = d;
		this.id = id;
		this.name = name;
	}
	@Override
	public void run() {
		
		d.wish(name, id);
		
	}
	 

}
