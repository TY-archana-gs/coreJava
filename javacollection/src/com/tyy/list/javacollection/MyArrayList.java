package com.tyy.list.javacollection;

import java.util.Arrays;
import java.util.Iterator;
//import java.util.ArrayList.Itr;

public class MyArrayList<E>  implements Iterable<E>{

	private Object elementData[];
	private final int DEFAULT_SIZE=4;
	private int size=0;

	MyArrayList() {
		this.elementData= new Object[DEFAULT_SIZE];
	}

	public void add(Object el) {
		System.out.println("inside method");

		if(size == elementData.length) {
			System.out.println("inside block");

			System.out.println("size"+size);
			int prevSize=elementData.length;
			System.out.println("prevSize"+prevSize);

			int newSize= prevSize*2;
			System.out.println("newSize"+newSize);

			elementData=Arrays.copyOf(elementData, newSize);
		}
		this.elementData[size]=el;
		size++;
	
	}
	
	public void remove(int index) throws IllegalAccessException {
		
		if(index < 0 || index > size-1) {
			
			throw new IllegalAccessException();
		}
		System.arraycopy(elementData, index+1, elementData, index, elementData.length-1-index);
		elementData[--size]=null;
	}
	
	
	  public void forEach(Object obj) {
		  
		  for (Object object : elementData) {
			
		}
		  System.out.println(obj);
		  
	   }
	 
	
	
	
	
	@Override
	public String toString() {
		String s1= new String("[");

		for (int i = 0; i < size; i++) {

			if (i == size-1) {
				s1=s1+ elementData[i];
			}else {
				s1= s1+ elementData[i]+ ",";
			}

		}
		s1=s1+"]";

		return s1;
	}

   public Iterator<E> iterator() {
                 return new Itr();
        }

private class Itr implements Iterator<E> {
	
   private int index;
	
	//public IteratClass() {}
	@Override
	public boolean hasNext() {
		return (index<size) ? true : false;
	
	}
	@Override
	public E next() {
		
		E e= (E) elementData[index];
		index++;
		return e;
		}
		
	}
}