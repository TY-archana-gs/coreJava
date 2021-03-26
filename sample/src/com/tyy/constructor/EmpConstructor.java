package com.tyy.constructor;

public class EmpConstructor {
	
	int id;
	 String name;
	String email;
	
    public EmpConstructor(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public static void main(String[] args) {
    	
    	EmpConstructor emp=new EmpConstructor(23,"archana","arch@gm");
    	EmpConstructor emp1=new EmpConstructor(10,"Ram","ram@gm");

    	System.out.println("employee id"+"="+emp.id);
		System.out.println("employee name"+"="+emp.name);
        System.out.println("employee mail"+"="+emp.email);
        
        System.out.println("---------------------");
        
        System.out.println("employee id"+"="+emp1.id);
		System.out.println("employee name"+"="+emp1.name);
        System.out.println("employee mail"+"="+emp1.email);
		
	}
}
