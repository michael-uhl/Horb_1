package a04_bufferdInputStreamWithBuffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		byte[] buffer = new byte[1024];
	
		InputStream fis = new BufferedInputStream(new FileInputStream("res/big.file"));
		long millisBefore = new Date().getTime();
		while (fis.read(buffer) != -1) {
		}
		long millisAfter = new Date().getTime();
		System.out.println(millisAfter - millisBefore);
	}
}
