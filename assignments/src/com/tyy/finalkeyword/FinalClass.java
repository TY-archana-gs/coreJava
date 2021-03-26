package com.tyy.finalkeyword;

	final class FinalClass {
		  public void display() {
		    System.out.println("This is a final method.");
		  }
		}

/*
 * class Main extends FinalClass//final class can not be inherited { public void
 * display() { System.out.println("The final method is overridden."); }
 * 
 * public static void main(String[] args) { Main obj = new Main();
 * obj.display(); } }
 */

