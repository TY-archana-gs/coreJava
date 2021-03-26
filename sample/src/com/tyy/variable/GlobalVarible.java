package com.tyy.variable;

public class GlobalVarible
{
	private String a="Archana";
	public int b;
	protected float c;
	long d;
	char e;
	
 
	
public static void main(String[] args) {
	
	GlobalVarible g= new GlobalVarible();
	GlobalVarible g2 = g;
	
	System.out.println(g2.a);
	
	
	g.b=30;
	g.c=88876667;
	g.d=7655;
	
	System.out.println(g.a);
	System.out.println(g.b);
	System.out.println(g.c);
	System.out.println(g.d);
	System.out.println(g.e);
	
	GlobalVarible gl= new GlobalVarible();
	gl.b=30;
	gl.c=88876667;
	g.d=7655;
	
	System.out.println(gl.a);
	System.out.println(gl.b);
	System.out.println(gl.c);
	System.out.println(gl.d);
	System.out.println(gl.e);
}	
	
	
	
}
