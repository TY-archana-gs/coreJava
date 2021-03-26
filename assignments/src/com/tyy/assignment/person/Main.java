package com.tyy.assignment.person;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sportsman spo=new Sportsman();
	spo.job();
	spo.pt_salary=1000;
	System.out.println(spo.pt_salary);
	Politician pol=new Politician();
	pol.work();
	pol.sp_salary=3000;
	System.out.println(pol.sp_salary);

	}
}

