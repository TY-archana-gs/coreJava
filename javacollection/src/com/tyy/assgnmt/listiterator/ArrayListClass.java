package com.tyy.assgnmt.listiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr= new ArrayList<String>();
		
		arr.add("Archana");
		arr.add("Aradha");
		arr.add("Bhak");
		arr.add("Sam");
		arr.add("Ram");
		
 Iterator<String> iterator = arr.iterator();
	     
	     while(iterator.hasNext()) {
	    	 
	    	 String ele= (String) iterator.next();
	    	 
	    	 
	    	 
	    	 System.out.println(ele);
	    	 
	     }
		
	}

}
