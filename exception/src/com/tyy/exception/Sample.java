package com.tyy.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Sample {
	public static void main(String[] args) {
		
		LinkedList<Integer> arr = new LinkedList<Integer>();
		
		arr.add(10);
		arr.add(20);
		arr.add(20);
		arr.add(60);
		arr.add(23);
		arr.add(null);
		System.out.println(arr);
		
		Iterator<Integer> ele= arr.iterator();
		
		while(ele.hasNext()==true) {
			
			System.out.println(ele.next());
		}
		
	}}
