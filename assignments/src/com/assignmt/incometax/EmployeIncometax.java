package com.assignmt.incometax;

public class EmployeIncometax {
	public static void main(String args[])
	{
	double t=0;
	double salary = 165623;

	
	t=incomeTax(salary);
	System.out.println("Income tax amount is "+t);
	}
static double incomeTax(double salary)
{
	double tax;	
	if(salary<=50000)
		tax=0;
	else if(salary<=60000)
		tax=0.1*(salary-50000);
	else if(salary<=150000)
		tax=(0.2*(salary-50000));
	else 
		tax=(0.3*(salary-50000));
	return tax;
 
}

}


