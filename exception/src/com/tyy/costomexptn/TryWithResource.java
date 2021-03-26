package com.tyy.costomexptn;

import java.io.FileOutputStream;

public class TryWithResource {
	
	public static void main(String args[]){
		
 try(FileOutputStream fileOutputStream =new FileOutputStream("abc.txt")){      
 String msg = "Welcome to javaTpoint!";      
byte byteArray[] = msg.getBytes();  

fileOutputStream.write(byteArray); 

System.out.println("Message written to file successfuly!");      
}
 catch(Exception exception){
	 
       System.out.println(exception);  
}      
}      
}    


