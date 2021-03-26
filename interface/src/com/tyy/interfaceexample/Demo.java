package com.tyy.interfaceexample;

public class Demo implements B{

	@Override
	public void play() {
		System.out.println("play a game");		
	}

	@Override
	public void work() {
		System.out.println("do a work");		
	}

}
