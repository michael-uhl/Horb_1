package a03_Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleDateFormatTest {

	public static void main(String[] args)  throws Exception {
		SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy 'um' HH:mm:ss");
		Date given = sd.parse("01.05.2011 um 16:55:12");
		System.out.println(sd.format(given));
		
		Calendar cal = new GregorianCalendar();
		cal.setTime(given);
		cal.add(Calendar.HOUR, 2);
		
		System.out.println(sd.format(cal.getTime()));
	}
}
