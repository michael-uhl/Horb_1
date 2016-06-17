package a05_Properties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		try {
			Properties testProperties = new Properties();
			testProperties.load(new BufferedReader(new FileReader("src/test.properties")));
			System.out.println(testProperties.getProperty("name"));
			System.out.println(testProperties.getProperty("alter"));
			testProperties.setProperty("alter", "32");
			System.out.println(testProperties.get("alter"));
			testProperties.store(new BufferedWriter(new FileWriter("src/test.properties")), "no comment.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
