package com.tyy.assgnmt.listiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass1 {
	
	public static void main(String[] args) 
    { 
        ArrayList<Integer> al = new ArrayList<Integer>(); 
  
        for (int i = 0; i < 10; i++) 
            al.add(i); 
  
        System.out.println(al); 
  
        Iterator itr = al.iterator(); 
  
        
        while (itr.hasNext()) 
        { 
            int i = (Integer)itr.next(); 
  
            System.out.print(i + " "); 
  
            if (i % 2 != 0) 
               itr.remove();  
        } 
        System.out.println();  
        System.out.println(al); 
    } 

}
