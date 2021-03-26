package com.tyy.collection.hasset;

import java.util.TreeSet;

public class MyTreeSet {
	public static void main(String[] args) {
		
		TreeSet<Integer> tree= new TreeSet<Integer>(new MyComparator<Integer>());
		
		tree.add(10);
		tree.add(20);
        tree.add(70);
		tree.add(30);
		tree.add(40);
		tree.add(40);
		System.out.println(tree.add(40));

		System.out.println(tree);

	}

}
