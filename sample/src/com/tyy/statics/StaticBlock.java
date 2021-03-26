package com.tyy.statics;

public  class StaticBlock {
	static int id;
	static {
		id =10;
		System.out.println("this is frst block"+"="+id);
	}
	static {
		System.out.println("this is second block");
	}
	static {
		System.out.println("this is third block");
	}
	static {
		System.out.println("this is fourth block");
	}
public static void main(String[] args) {
	System.out.println("Main block");
}
}
