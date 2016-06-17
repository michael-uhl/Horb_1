package a07_dataStreams;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class DataOutputStreamExample {

	public static void main(String[] args) throws Exception {
		DataOutputStream os = new DataOutputStream(
				new BufferedOutputStream(
				       new FileOutputStream("res/dose.dat")));
		
		os.writeUTF("Hallo Welt!");
		os.writeDouble(5.1);
		os.writeInt(2);
		os.flush();
		os.close();

	}
}
