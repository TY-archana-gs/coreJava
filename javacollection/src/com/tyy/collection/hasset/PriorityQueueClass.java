package com.tyy.collection.hasset;

import java.util.PriorityQueue;

public class PriorityQueueClass {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pr=new PriorityQueue<Integer>();
		
		pr.offer(10);
		pr.offer(50);
		pr.offer(30);
		pr.offer(70);
		pr.offer(60);
		pr.offer(60);

		
		System.out.println(pr.remove());
		
		System.out.println(pr);
		
	}

}
