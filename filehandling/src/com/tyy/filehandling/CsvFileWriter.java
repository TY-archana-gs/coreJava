package com.tyy.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CsvFileWriter {
	
	
	public static void main(String[] args) {

		try (PrintWriter writer = new PrintWriter(new File("C:\\Users\\Dell\\Desktop\\ty project\\JAVA\\file.csv"))) {

			StringBuilder sb = new StringBuilder();
			sb.append("id,");
			sb.append("Name");
			sb.append(',');			
			sb.append('\n');

			sb.append("1");
			sb.append(',');
			sb.append("Prashant Ghimire");
			sb.append('\n');
			
			sb.append("2");
			sb.append(',');
			sb.append("Rohit");
			sb.append('\n');
			
			sb.append("3");
			sb.append(',');
			sb.append("archana");
			sb.append('\n');
			
			sb.append("4");
			sb.append(',');
			sb.append("Ram");
			sb.append('\n');
			
			sb.append("5");
			sb.append(',');
			sb.append("Sam");
			sb.append('\n');

			writer.write(sb.toString());

			System.out.println("done!");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
}

