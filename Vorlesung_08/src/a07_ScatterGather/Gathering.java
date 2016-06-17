package a07_ScatterGather;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Gathering {
	public static void main(String[] args) {

		try {
			ByteBuffer header = ByteBuffer.allocate(128);
			ByteBuffer body   = ByteBuffer.allocate(1024);
			
			for (int i = 0; i < 128; i++) {
				header.put((byte)1);
			}
			
			for (int i = 0; i < 1024; i++) {
				body.put((byte)2);
			}
			
			//write data into buffers

			ByteBuffer[] bufferArray = { header, body };
			
			FileOutputStream fout = new FileOutputStream("res/scatterGather.dat");
			FileChannel channel = fout.getChannel();
		
			header.flip();
			body.flip();
			
			channel.write(bufferArray);
			

			fout.close();
			channel.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
