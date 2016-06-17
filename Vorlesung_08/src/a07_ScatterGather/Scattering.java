package a07_ScatterGather;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Scattering {
	public static void main(String[] args) {

		try {
			ByteBuffer header = ByteBuffer.allocate(128);
			ByteBuffer body   = ByteBuffer.allocate(1024);
			
			FileInputStream fin = new FileInputStream("res/scatterGather.dat");
			
			FileChannel channel = fin.getChannel();
			
			ByteBuffer[] bufferArray = { header, body };
			
			channel.read(bufferArray);
			
			header.flip();
			body.flip();
			
			//Auslesen der Bufer
			
			int sum = 0;
			System.out.println("header");
			while(header.hasRemaining()) {
				//sum += (int)header.get();
				System.out.println((int)header.get());
			}
			//System.out.println(sum);
			
			sum = 0;
			System.out.println("body");
			while(body.hasRemaining()) {
				//sum += body.get();
				System.out.println((int)body.get());
			}
			//System.out.println(sum/2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
