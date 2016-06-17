package a02_Channel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WriteToChannelFromBuffer {
	public static void main(String[] args) {
		try {
			// Schritt 1: Channel erzeugen
			FileOutputStream fout = new FileOutputStream("res/writesomebytes.txt");
			FileChannel fc = fout.getChannel();

			// Schritt 2: Buffer erzeugen und befüllen
			byte[] message = "Hallo Studenten der Dualen HS Horb".getBytes();
			
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			for (int i = 0; i < message.length; ++i) {
				buffer.put(message[i]);
			}
			buffer.flip();

			// Schritt 3: Daten in den Channel vom Buffer schreiben.
			fc.write(buffer);
			fc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
