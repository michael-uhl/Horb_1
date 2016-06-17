package a08_TextFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;

public class WithoutNIO {
	public static void main(String[] args) throws Exception {
		String thisLine;
		
		long start = new Date().getTime();
		BufferedReader reader = 
			new BufferedReader(new FileReader("res/bigTextFile.txt"));
		
		while ((thisLine = reader.readLine()) != null) {
			System.out.println(thisLine);
		}
		
		reader.close();
		
		long end = new Date().getTime();
		System.out.println(end - start);
	}
}
