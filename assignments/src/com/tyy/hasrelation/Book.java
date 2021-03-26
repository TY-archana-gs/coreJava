package com.tyy.hasrelation;

public class Book {
	
		  String name;
		  int price;
		  Author auther;
		  Publisher publisher;
		  Book(String n, int p, Author auther, Publisher publisher )
		  {
		    this.name = n;
		    this.price = p;
		    this.auther = auther;
		    this.publisher = publisher;
		  }
}
