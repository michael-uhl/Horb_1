package a12_file;

import java.io.File;

public class FileTest {
	
	public static void main(String[] args) throws Exception {
		File f = new File("res/dontExist");
		System.out.println(f.exists());
		System.out.println(f.isFile());
		f.mkdirs();
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
	}

}
