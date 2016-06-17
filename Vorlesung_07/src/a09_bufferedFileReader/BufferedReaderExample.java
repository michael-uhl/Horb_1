package a09_bufferedFileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;

public class BufferedReaderExample {
	public static void main(String[] args) throws Exception {
		
		long start = new Date().getTime();
		BufferedReader reader = 
			new BufferedReader(new FileReader("res/fwe.txt"));
		
		String thisLine;
		while ((thisLine = reader.readLine()) != null) {
			System.out.println(thisLine);
		}
		
		reader.close();
		long end = new Date().getTime();
		System.out.println(end - start);
	}
}
