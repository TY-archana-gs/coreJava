package com.tyy.stringexample;

public class Sample {
	public static void main(String[] args) {
	
		String A="Archana";
		String C="Archana";
		
		int lenth=A.length();
		System.out.println(lenth);
	
		String S=new String("saru");
		String S1=new String("sarus");

		
		System.out.println(S==S1);
		System.out.println(S.equals(S1));

		System.out.println(A.equals(C));
		System.out.println(A==C);
		//System.out.println(B);
	}
}
