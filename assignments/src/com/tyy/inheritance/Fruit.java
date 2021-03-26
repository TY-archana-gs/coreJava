package com.tyy.inheritance;

public class Fruit {
	 int f;
	protected int g;
	 void name()
	{
       System.out.println("hello this is parent");	
    }
	}

	class Child extends Fruit
	{
		void method () {
			System.out.println("this is child");
		}
		}
	class MainClass
	{
	public static void main (String [] args)
	{
		Child child= new Child ();
	child.method();
	child.f=10;
	child.g=20;
	child.name();
	}

}
