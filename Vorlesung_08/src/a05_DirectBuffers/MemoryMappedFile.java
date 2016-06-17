package a05_DirectBuffers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class MemoryMappedFile {
	public static void main(String[] args) {
		try {
			int shmSize = 1024;
			RandomAccessFile file = new RandomAccessFile("res/shm.raw", "rw");

			// inialize file size
			if (file.length() < shmSize) {
				byte[] tmp = new byte[shmSize];
				file.write(tmp);
				file.seek(0); // seek back to start of file.
			}

			// memory-map file.
			FileChannel ch = file.getChannel();
			MappedByteBuffer shm = 
				ch.map(FileChannel.MapMode.READ_WRITE, 0,shmSize);
			ch.close(); // channel not needed anymore.
			shm.load(); // force file into physical memory.
			
			// now use the ByteBuffer's get/put/position methods to read/write
			// the shared memory
			
			Charset utf8 = Charset.forName("UTF-8");
			CharsetEncoder utf8Enc = utf8.newEncoder();
			ByteBuffer buffer = utf8Enc.encode(CharBuffer.wrap("Hallo Buffer."));
			shm.put(buffer);
			//shm.force();
			
			RandomAccessFile readFile = new RandomAccessFile("res/shm.raw", "r");
			FileChannel c2 = readFile.getChannel();
			MappedByteBuffer shmr = 
				c2.map(FileChannel.MapMode.READ_ONLY, 0,shmSize);
			CharsetDecoder utf8Dec = utf8.newDecoder();
			CharBuffer readBuffer = utf8Dec.decode(shmr);
			System.out.println(readBuffer.toString());



		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
