package com.tyy.list.javacollection;

import java.util.ArrayList;
import java.util.Collections;

public class Arryalistmethods {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(20);
		arr.add(10);
		//arr.add(null);
		arr.add(30);
		arr.add(30);

		System.out.println(arr);

		//arr.sort(20);
		Collections.sort(arr); 

		System.out.println(arr);
		
	    arr.add(80);
	    System.out.println(arr.contains(10));
	   System.out.println( arr.remove(1));
		System.out.println(arr);

}

}
