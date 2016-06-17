package a06_fileOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		OutputStream os = 
			new BufferedOutputStream(
					new FileOutputStream("res/fose.dat"), 1024);
		os.write(256);
		os.flush();
		os.close();
		
	}
}
