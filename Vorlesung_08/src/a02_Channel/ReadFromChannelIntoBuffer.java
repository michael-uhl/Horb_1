package a02_Channel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFromChannelIntoBuffer {
	public static void main(String[] args) {
		try {
			//Schritt 1: Channel erzeugen
			FileInputStream fin = new FileInputStream("res/utf16_example.txt");
			FileChannel fc = fin.getChannel();
			
			//Schritt 2: Buffer erzeugen
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			
			//Schritt 3: Daten vom Channel in den Buffer lesen
			fc.read(buffer);
			
			buffer.rewind();
			for (int i =  0; i < buffer.limit(); i++)
		        System.out.print((char) buffer.get(i));
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
