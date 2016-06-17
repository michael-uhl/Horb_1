package a05_consoleInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleCorrect {

	public static void main(String[] args) throws IOException	 {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		
		String s = in .readLine();
		System.out.println(s);
		
		in.close();
		
	}
}
