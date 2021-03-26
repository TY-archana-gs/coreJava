package com.tyy.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CvsFileReader {
	
		public static void main(String[] args) {

			Scanner sc = null;
			try {
				sc = new Scanner(new File("C:\\Users\\Dell\\Desktop\\ty project\\JAVA\\file.csv"));
				sc.useDelimiter(","); 
				while (sc.hasNext()) 
				{
					System.out.print(sc.next() + "\t"); 
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				sc.close(); // closes the scanner
			}

		}
	
}
