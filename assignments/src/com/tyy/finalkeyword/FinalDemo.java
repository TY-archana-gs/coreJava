package com.tyy.finalkeyword;

public class FinalDemo {

	public final void display() {
		System.out.println("This is a final method.");
	}
}

class Main extends FinalDemo
{
	//public final void display() //compile time error
	{
		System.out.println("The final method is overridden.");
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.display();
	}
}

