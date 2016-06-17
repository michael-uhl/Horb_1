package a04_JodaTime;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;

/**
 * Dies ist eine Klasse.
 */
public class DateDifference {
	
	public static void main(String ... args) {
		DateTime dt1 = new DateTime(2000, 1, 1, 0, 0, 0, 0);
		DateTime dt2 = new DateTime(2010, 1, 1, 0, 0, 0, 0);
		Minutes.minutesBetween(dt1, dt2).getMinutes();
		int days = Days.daysBetween(dt1, dt2).getDays();
		System.out.println(days);

//	       LocalDate now = new LocalDate();
//	        LocalDate lastDayOfPreviousMonth = 
//	             now.minusMonths(1).dayOfMonth().withMaximumValue();
//	        System.out.println(lastDayOfPreviousMonth);
		
//		DateTime dateTime = new DateTime(2000, 1, 1, 0, 0, 0, 0);
//		System.out.println(dateTime.plusDays(45).plusMonths(1).dayOfWeek()
//		  .withMaximumValue().toString("E MM/dd/yyyy HH:mm:ss.SSS"));
	}
}

