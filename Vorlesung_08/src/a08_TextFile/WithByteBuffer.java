package a08_TextFile;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Date;

public class WithByteBuffer {
	public static void main(String[] args) throws Exception {
		long start = new Date().getTime();
		
		FileInputStream fin = new FileInputStream("res/bigTextFile.txt");
		FileChannel finC = fin.getChannel();
		ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
		
		CharsetDecoder dec = Charset.forName("UTF-8").newDecoder();
		
		while (true) {
			buffer.clear();
		
			int r = finC.read(buffer);
		
			if (r == -1) {
				break;
			}
		
			buffer.flip();
		
			dec.decode(buffer).toString();
			//System.out.println(dec.decode(buffer).toString());
		}
		
		long end = new Date().getTime();
		System.out.println(end - start);
	}
}
