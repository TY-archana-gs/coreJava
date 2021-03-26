package com.tyy.filehandling;

import java.io.FileWriter;

public class TextFileWriter {
	

	    public static void main(String args[]){    
	         try{    
	          FileWriter fw=new FileWriter("C:\\Users\\Dell\\Desktop\\ty project\\JAVA\\file.txt");    
	           fw.write("Welcome to javaTpoint.");    
	           fw.close();    
	          }
	         catch(Exception e)
	         {
	        	 System.out.println(e);
	         }    
	          System.out.println("Success...");    
	     }    
	}  




