package com.tyy.collection.hasset;

import java.util.LinkedHashSet;

public class LinkedHash {

	public static void main(String[] args) {

		LinkedHashSet<Integer> link= new LinkedHashSet<Integer>();
		
		link.add(30);
		link.add(20);
		link.add(50);
		link.add(80);
		
		System.out.println(link.add(90));
		System.out.println(link);

	}

}
