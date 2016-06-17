package a07_dataStreams;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamExample {

	public static void main(String[] args) throws Exception {
		DataInputStream is = new DataInputStream(
				new BufferedInputStream(
					new FileInputStream("res/dose.dat")));
		
		System.out.println(is.readUTF());
		System.out.println(is.readDouble());
		System.out.println(is.readInt());
		is.close();
	}
}
