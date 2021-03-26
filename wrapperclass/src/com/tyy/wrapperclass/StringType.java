package com.tyy.wrapperclass;

public class StringType {
	public static void main(String[] args) {
		
		String s="100";
		String s1="1208.45";
        int i=204;
		
		int a= Integer.parseInt(s);
		int b= (int) Double.parseDouble(s1);
		
		String str = String.valueOf(i);
		
		System.out.println(str);

		System.out.println(b);

		System.out.println(a);
	}

}
