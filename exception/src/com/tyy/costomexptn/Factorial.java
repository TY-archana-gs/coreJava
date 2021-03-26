package com.tyy.costomexptn;

public class Factorial {
	
	public  void fact(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
			
    System.out.println("Factorial of number"+" "+ fact);
	}
	
	public static void main(String[] args) {
		
		Factorial fa=new Factorial();
		fa.fact(5);
	}

}
