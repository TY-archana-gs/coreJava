package com.tyy.threads;

public class SleepThread extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.print("A");
		Thread.sleep(2000);
		System.out.print("R");
		Thread.sleep(2000);

		System.out.print("C");
		Thread.sleep(2000);

		System.out.print("H");
		Thread.sleep(2000);

		System.out.print("U");

		
	}

}
