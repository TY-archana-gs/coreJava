package com.tyy.collection.hasset;

import java.util.Comparator;

public class MyComparator<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		return o2.hashCode()-o1.hashCode();
		/*
		Integer i1 =(Integer) o1;
		Integer i2 =(Integer) o2;
		
		if(i1<i2)
			return 100;
		
		else if (i1>i2) 
			return -100;
		
		if(i1==i2)
			return 0;
		
		return i2;	 
	}*/
}
}
