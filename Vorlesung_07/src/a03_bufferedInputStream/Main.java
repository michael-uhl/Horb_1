package a03_bufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {

		
		InputStream fis = 
			new BufferedInputStream(new FileInputStream("res/big.file"), 204800);
		
		long millisBefore = new Date().getTime();
		int r;
		while((r = fis.read()) != -1) {
		}
		long millisAfter = new Date().getTime();
		
		System.out.println(millisAfter - millisBefore);
		
		fis.close();
	}
}
