package com.tyy.abstractasgn;



public class Employee extends Person {
	
	private int empId;
	
	public Employee(String nm, String gen, int id) {
		super(nm, gen);
		this.empId=id;
	}

	@Override
	public void work() {
		if(empId == 0){
			System.out.println("Not working");
		}else{
			System.out.println("Working as employee!!");
		}
	}
	
	public static void main(String args[]){
		Person student = new Employee("Dove","Female",0);
		Person employee = new Employee("Archana","Female",123);
		student.work();
		employee.work();
		employee.changeName("Racchu");
		System.out.println(employee.toString());
	}

}



