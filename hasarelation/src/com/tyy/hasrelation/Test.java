package com.tyy.hasrelation;

public class Test {

	public static void main(String[] args) {

		Adress adress1=new Adress(101, "Ashoknagar", "Hassan", 573201);
	Employee employe=new Employee(10, "Archana", adress1);
	System.out.println("Employee_Id=="+employe.id);
	System.out.println("Employee_Name=="+employe.name);
	System.out.println("Employee_Adress_Doorno=="+employe.adress.doorno);
	System.out.println("Employee_Adress_Area=="+employe.adress.area);
    System.out.println("Employee_Adress_City=="+employe.adress.city);
	}
}
