package com.tyy.collection.hasset;

import java.util.HashSet;

public class HasSetClass {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hassh=new HashSet<Integer>();
		
		hassh.add(10);
		hassh.add(20);
		hassh.add(30);
		hassh.add(40);
		hassh.add(40);
		hassh.add(50);
		System.out.println(hassh);
	}
}
