package com.tyy.collection.hasset;

import java.util.Comparator;

public class TaskComparotor<T> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		
		//String s1=(String)o1;
		//String s2=(String)o2;
		
		StudenName s1=(StudenName) o1;
		StudenName s2=(StudenName) o1;
		
		String n1=s1.name;
	    String n2=s2.name;
	    
	    int res= n1.compareTo(n2);
		
		
		return res;
		
		//return ((String) o1).compareTo((String) o2);
		
		//Integer i1= o1;

	//	int res= (s1.hashCode()-s2.hashCode());
		//return res;

//		String i1 =(String)s1 ;
//		String i2 =(String) s2.hashCode();
//		
//		if(i1<i2)
//			return 100;
//		
//		else if (i1>i2) 
//			return -100;
//		
//		if(i1==i2)
//			return 0;
//		
//		return i2;
	
	}
}
