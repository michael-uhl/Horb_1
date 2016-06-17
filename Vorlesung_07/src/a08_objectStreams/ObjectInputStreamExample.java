package a08_objectStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {

	public static void main(String[] args) throws Exception {
		ObjectInputStream is = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream("res/oose.dat")));
		
		Book javaIsle = (Book) is.readObject();
		
		System.out.println(javaIsle);
	}
}
