package a02_fileInputStream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		InputStream fis = new FileInputStream("res/big.file");
		long millisBefore = new Date().getTime();
		
		int r;
		while ((r = fis.read()) != -1) {
//			System.out.print((char)r);
		}
		
		long millisAfter = new Date().getTime();
		System.out.println(millisAfter - millisBefore);
		
		fis.close();
	}
}
