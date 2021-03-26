package com.tyy.linkedlist;

import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {

		LinkedList<Integer> list= new  LinkedList<Integer>();

		list.add(10);
		list.add(20);
		list.addFirst(60);
		list.addLast(100);
        list.add(30);
		list.add(40);
		list.add(40);

		System.out.println(list);


	}

}
