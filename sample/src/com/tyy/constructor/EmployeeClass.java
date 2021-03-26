package com.tyy.constructor;

public class EmployeeClass {
	
	int id;
	String name;
	String email;
	
//	public void display() {
//		System.out.println("employee id"+"="+id);
//		System.out.println("employee name"+"="+name);
//
//		System.out.println("employee mail"+"="+email);
//
//	}
	public static void main(String[] args) {
		EmployeeClass emp=new EmployeeClass();
		emp.id=23;
		emp.name="Archana";
		emp.email="arc@gmail";
		System.out.println("employee id"+"="+emp.id);
		System.out.println("employee name"+"="+emp.name);

		System.out.println("employee mail"+"="+emp.email);
//		emp.display();
		
	}
	
	}


