package a03_CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.util.Date;

public class CopyFile {
	static public void main(String args[]) throws Exception {
//		if (args.length < 2) {
//			System.err.println("Usage: java CopyFile infile outfile");
//			System.exit(1);
//		}
//
//		String infile = args[0];
//		String outfile = args[1];
		
		FileInputStream fin = new FileInputStream("res/bigTextfile.txt");
		FileOutputStream fout = new FileOutputStream("res/textfile.n2.txt");
		
		FileChannel fcin = fin.getChannel();
		FileChannel fcout = fout.getChannel();
		
		ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
		
		Date start = new Date();
		while (true) {
			buffer.clear();
		
			int r = fcin.read(buffer);
		
			buffer.flip();
		
			fcout.write(buffer);

			if (r == -1) {
				break;
			}
		}
		Date end = new Date();
		System.out.println(end.getTime() - start.getTime());
	}
}
