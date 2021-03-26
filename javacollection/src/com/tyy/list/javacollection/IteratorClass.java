package com.tyy.list.javacollection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {
	public static void main(String[] args) {
		ArrayList<Integer> arr =new ArrayList<Integer>();
		 
		 arr.add(20);
		 arr.add(20);
		 arr.add(10);
	     arr.add(40);
	     arr.add(60);
	     
	     System.out.println();
	     
	     for (Integer list : arr) {
			  System.out.println("for each"+list);
			
		}
	     Iterator iterator = arr.iterator();
	     
	     while(iterator.hasNext()) {
	    	 
	    	 Integer ele= (Integer) iterator.next();
	    	 
	    	 System.out.println(ele);
	    	 
	     }
	     
	     
	     
	     
		
	}
	
	 
	
		  
  
	}
	

