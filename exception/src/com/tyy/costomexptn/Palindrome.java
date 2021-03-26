package com.tyy.costomexptn;

public class Palindrome {
	public static void pa(String str1)
	{
		String str2="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		for(int i=0;i<str1.length();i++)
		{
		if(str1.charAt(i)==str2.charAt(i))
		{
			System.out.println(str1+""+"is a palindrome");
			break;
		}
		else {
		System.out.println(str1+" "+"   is not a palindrome");
	         }
		}
		}
		public static void main(String[] args) 
		{
			Palindrome.pa("madam");
			//String str1="madam";
			 //res=pa(str1);
			//System.out.println();
		}

	}



