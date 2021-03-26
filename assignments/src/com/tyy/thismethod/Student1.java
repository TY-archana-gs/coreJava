package com.tyy.thismethod;

public class Student1 {
	int rollno;  
	String name,course;  
	float fee;  
	Student1(int rollno,String name,String course){  
	this.rollno=rollno;  
	this.name=name;  
	this.course=course;  
	}  
	Student1(int rollno,String name,String course,float fee){  
	this(rollno,name,course);  
	this.fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
	}  


