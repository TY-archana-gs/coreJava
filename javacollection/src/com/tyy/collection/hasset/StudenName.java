package com.tyy.collection.hasset;

public class StudenName<T> implements Comparable<T> {

	String name;
	
	public StudenName(String name) {
		
		this.name=name;
	}

	
	/*
	 * @Override public String toString() { return name; }
	 */
	
	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return this.hashCode()-o.hashCode();
	}
	

}
