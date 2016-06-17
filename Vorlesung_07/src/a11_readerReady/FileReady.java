package a11_readerReady;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReady {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = 
			new BufferedReader(new FileReader("res/bure.txt"));
		
		while (reader.ready()) {
			System.out.println(reader.readLine());
		}
		
		reader.close();
	}
}
