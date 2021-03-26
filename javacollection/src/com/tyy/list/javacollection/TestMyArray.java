package com.tyy.list.javacollection;

import java.util.Iterator;

public class TestMyArray {
	public static <E> void main(String[] args) throws IllegalAccessException {
		
		MyArrayList<E> arr= new MyArrayList<E>();
		
		arr.add(20);
		arr.add(20);
		arr.add(30);
		arr.add(50);
		arr.add(50);
		arr.remove(0);
		System.out.println(arr);
	Iterator<E> itr= arr.iterator();
	
		while(itr.hasNext()) {
	    	 System.out.println(itr.next());

	
//			
//			for (Integer list : arr) {
//				  System.out.println("for each"+list);
//				
//			}
//			
//		}
		
		
		
//System.out.println(arr);
		
	}

	}}
