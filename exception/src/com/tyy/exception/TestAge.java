package com.tyy.exception;

public class TestAge  {

	public void age(int age) throws InvalidAge {
		if(age>=18) {
			System.out.println("valid age");
		}
		
		else{
    throw new InvalidAge("age must greater than 18");	
      }
		}
public static void main(String[] args) throws InvalidAge {
	                                                                                      
	TestAge	t=new TestAge();
	t.age(10);
	}
}
