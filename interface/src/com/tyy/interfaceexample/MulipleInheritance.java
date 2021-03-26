package com.tyy.interfaceexample;

public class MulipleInheritance implements Game,Office{

	@Override
	public void work() {
		System.out.println("Work hard");		
	}

	@Override
	public void play() {
		System.out.println("play a game");
	}

}
