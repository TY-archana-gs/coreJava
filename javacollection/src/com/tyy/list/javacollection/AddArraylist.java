package com.tyy.list.javacollection;

import java.util.ArrayList;

public class AddArraylist {

	 public static void main(String[] args) {
		
		 ArrayList<Integer> arr =new ArrayList<Integer>();
		 
		 arr.add(20);
		 arr.add(20);
		 arr.add(10);
         arr.add(40);
         arr.add(60);
   //for (int i = 0; i < arr.size(); i++) 
//         
//	  for (int i = 0; i < arr.size(); i++) {
//		  System.out.println("for loop"+arr.get(i));
//	}
	
	  for (Integer list : arr) {
		  System.out.println("for each"+list);
		
	}
}
		 
	}

