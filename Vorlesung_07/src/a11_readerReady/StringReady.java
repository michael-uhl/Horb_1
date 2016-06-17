package a11_readerReady;

import java.io.BufferedReader;
import java.io.StringReader;

public class StringReady {
	public static void main(String[] args) throws Exception {
		
		String ins = 
			"hello bye bye bye green fuck bye bye hello bye" + "\n" +
			"hello hello bar hello bye bye fuck fuck foo hello" + "\n" +
			"bar green bye green hello green foo fuck fuck bye" + "\n" +
			"bar green hello green fuck foo fuck bye fuck bye" + "\n" +
			"bar bye bye bye bye hello hello hello green hello";
			
		BufferedReader reader = 
			new BufferedReader(new StringReader(ins));
		
		while (reader.ready()) {
			System.out.println(reader.readLine().toLowerCase());
		}
		
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line.toLowerCase());
		}
		
		reader.close();
	}
}
