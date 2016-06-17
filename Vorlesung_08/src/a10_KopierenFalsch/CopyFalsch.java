package a10_KopierenFalsch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyFalsch {
	public static void main(String args[]) throws FileNotFoundException,
			IOException {
		FileWriter schreiber = new FileWriter(args[1]);
		BufferedReader leser = new BufferedReader(new InputStreamReader(
				new FileInputStream(args[0]), "Cp1252"));
	
		for (int i = 0;; i++) {
			int gelesenInt = leser.read();
			if (gelesenInt == -1) {
				break;
			}
			schreiber.write(gelesenInt);
		}
		schreiber.close();
	}
}
