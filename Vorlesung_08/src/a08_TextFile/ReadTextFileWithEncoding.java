package a08_TextFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Date;

public class ReadTextFileWithEncoding {
	public static void main(String[] args) {
		try {
			int bufferSize = 1024;
			
			long start = new Date().getTime();
			File file = new File("res/bigTextFile.txt");
			
			Reader fileReader = 
				new InputStreamReader(new FileInputStream(file), "UTF-8");
			
			CharBuffer charBuffer = CharBuffer.allocate(bufferSize);
			
			while (true) {
				charBuffer.clear();
			
				int r = fileReader.read(charBuffer);
			
				if (r == -1) {
					break;
				}
			
				charBuffer.flip();
			
				System.out.println(charBuffer.toString());
			}
			
			fileReader.close();
			long end = new Date().getTime();
			System.out.println(end - start);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
