package com.tyy.costomexptn;

import java.util.Scanner;

public class AmstromeNum {

	   public static void str(int num)
	   {
		   int res=0;
		   int m=num;
		   while(m>0)
		   {
			   int rem=m%10;
			   m=m/10;
			   res=res+rem*rem*rem;
		   }
		   if(res==num)
		   { 
		   System.out.println("given num is amstrong");
		   }
		   else
		   {
		   System.out.println("given num is not amstrong");
		   }
	   }
		public static void main(String[] args) 
		{ 
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the num");
			int num=sc.nextInt();
			str(num);
		}

	}


