package com.tyy.synchronization;

public class TestDisplay {
	public static void main(String[] args) {
		
		Display dis =new Display();
		 Thread thread1=new MyThread(dis, 10,"Archana");
		 Thread thread2=new MyThread(dis, 20,"Chiru");
		 thread1.start();
		 thread2.start();

	}

}
