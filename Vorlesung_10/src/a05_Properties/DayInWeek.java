package a05_Properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

public class DayInWeek {
	public static void main(String[] args) {
		try {
			Properties testProperties = new Properties();
			testProperties.load(new BufferedReader(new FileReader("src/date.properties")));
			
			String tag1Unformatted = testProperties.getProperty("tag1");
			System.out.println(MessageFormat.format(tag1Unformatted, new Date()));
			
			String tag3Unformatted = testProperties.getProperty("tag3");
			System.out.println(MessageFormat.format(tag3Unformatted, new Date()));
			
			MessageFormat engl = new MessageFormat(tag3Unformatted, Locale.KOREAN);
			Date[] arguments = new Date[1];
			arguments[0] = new Date();
			System.out.println(engl.format(arguments));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
