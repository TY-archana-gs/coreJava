package com.tyy.collection.hasset;

import java.util.Iterator;
import java.util.TreeSet;

public class MainTaskComparator {
	public static <T> void main(String[] args) {
		
		TreeSet<StudenName> tree= new TreeSet<StudenName>(new TaskComparotor<StudenName>() );
		
		StudenName<T> s1=new StudenName<T>("c");
		StudenName<T> s2=new StudenName<T>("d");
		StudenName<T> s3=new StudenName<T>("A");
		StudenName<T> s4=new StudenName<T>("a");
		StudenName<T> s5=new StudenName<T>("f");
		StudenName<T> s6=new StudenName<T>("b");
		StudenName<T> s7=new StudenName<T>("e");


		tree.add(s1);
		tree.add(s2);
		tree.add(s3);
		tree.add(s4);
		tree.add(s5);
		tree.add(s6);
		tree.add(s7);

      //System.out.println(tree);
      
      Iterator i1= tree.iterator();
      
      while(i1.hasNext()==true) {
    	  System.out.println(i1.next());
      }

		
	}

	

	

	

}
