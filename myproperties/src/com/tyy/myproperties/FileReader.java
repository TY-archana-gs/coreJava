package com.tyy.myproperties;

import java.io.FileInputStream;
import java.util.Properties;
public class FileReader {
public static void main(String[] args) throws Exception {
		
		FileInputStream  input= new FileInputStream("myproperty.properties");
		Properties pro=new Properties();
		pro.load(input);
		String name =(String) pro.get("name");
		String salary=(String) pro.get("salary");
		
		System.out.println("Name="+name + "  " + "Salary= "+salary);
    }
}
