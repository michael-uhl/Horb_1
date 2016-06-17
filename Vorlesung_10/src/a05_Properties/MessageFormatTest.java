package a05_Properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Properties;

public class MessageFormatTest {
	
	public static void main(String ... args) {
		try {
			Properties testProperties = new Properties();
			testProperties.load(new BufferedReader(new FileReader("src/brief.properties")));
			
			String anredeRaw = testProperties.getProperty("anrede");
			MessageFormat anredeFormatter = new MessageFormat(anredeRaw);
			String[] arguments = {"geehrter", "Herr", "Müller"};
			System.out.println(anredeFormatter.format(arguments));
			
			System.out.println(MessageFormat.format(anredeRaw, "geehrter", "Herr", "Müller"));
			
			String curAnrede2 = 
				MessageFormat.format(testProperties.getProperty("anredeNeu"), 0, "Müller");
			System.out.println(curAnrede2);
			
			
			String datumszeile = testProperties.getProperty("datumszeile");
			String curDat = MessageFormat.format(datumszeile, new Date());
			System.out.println(curDat);
			
			System.out.println(String.format(testProperties.getProperty("datum"), new Date()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
