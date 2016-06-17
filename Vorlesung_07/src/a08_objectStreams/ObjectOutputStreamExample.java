package a08_objectStreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {

	public static void main(String[] args) throws Exception {
		Book javaIsle = new Book();
		javaIsle.setTitle("Java ist auch eine Insel");
		javaIsle.setAuthor("Christian Ullenboom");
		javaIsle.setIsbn("3898425266");
		javaIsle.setPublishingYear(2004);
		javaIsle.setScore(1.0);
	
		ObjectOutputStream os = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("res/oose.dat")));
		
		os.writeObject(javaIsle);
		os.flush();
		os.close();
	}

}
