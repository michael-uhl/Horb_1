package a08_TextFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Date;

public class ReadTextFile {
	public static void main(String[] args) {
		try {
			int bufferSize = 1024;
			
			long start = new Date().getTime();
			File file = new File("res/bigTextFile.txt");
			FileReader fileReader = new FileReader(file);
			CharBuffer charBuffer = CharBuffer.allocate(bufferSize);
			
			while (true) {
				charBuffer.clear();
			
				int r = fileReader.read(charBuffer);
			
				charBuffer.flip();
			
				System.out.print(charBuffer.toString());
				
				if (r == -1) {
					break;
				}
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
