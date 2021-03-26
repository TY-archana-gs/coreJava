package com.tyy.myproperties;

import java.io.FileOutputStream;
import java.util.Properties;

public class FileWriter {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream  output= new FileOutputStream("first.property");
		
		Properties pro=new Properties();
		pro.setProperty("name", "archana");
		pro.setProperty("mail", "archana@gamil.com");
		pro.store(output,"comments");
		
		System.out.println("Property file created");

		
	}

}
