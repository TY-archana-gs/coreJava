package com.tyy.filehandling;

import java.io.FileReader;

public class TextFileReader {
	
	  public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("D:\\testout.txt");    
          int i;    
          while(
        		  (i=fr.read())!=-1
        	   )    
          System.out.print((char)i);    
          fr.close();    
    }    

}
