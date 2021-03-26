package com.tyy.linkedlist;

public class LinkedListImplemt {
	
	Node head;
	
	public void insert(int data) {
		System.out.println("wlcome");
		
		Node node=new Node();
		
        node.data= data;	
        node.next=null;
		if(head==null) {
			head=node;
			
		}
		else {
			Node n=head;
			while(n.next!=null) {
				
				n=n.next;
			}
			n.next = node;
		}
	}

	public void show() {
		System.out.println("show");
		
		Node node=head;

		 while(node!=null) {
			 
			 System.out.println(node.data);
			 node=node.next;
		 }
		
		//System.out.println(node.next);
	}

	
}
