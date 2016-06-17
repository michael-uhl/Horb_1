package a04_JodaTime;

import java.util.Calendar;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

public class PrintOuts {
	public static void main(String ... args) {
		{
			DateTime dateTime = new DateTime(2000, 1, 1, 0, 0, 0, 0);
			String res = dateTime.plusDays(90).toString("E MM/dd/yyyy HH:mm:ss.SSS");
			System.out.println(res);
		}
		
		
		{
			DateTime dateTime = new DateTime(2000, 1, 1, 0, 0, 0, 0);
			DateTime result = dateTime.plusDays(45)
								.plusMonths(1)
								.dayOfWeek().withMaximumValue();
			
			System.out.println(result.toString("E MM/dd/yyyy HH:mm:ss.SSS"));
		}
		
		{
			DateTime dateTime = new DateTime(2000, 1, 1, 0, 0, 0, 0);
			
			dateTime = dateTime.plusDays(45)
							.plusMonths(1)
							.dayOfWeek()
							.withMaximumValue();
			
			System.out.println(dateTime.toString("E MM/dd/yyyy HH:mm:ss.SSS"));
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dateTime.toDate());
		}
		{
			DateTime dateTime = new DateTime(2000, // year
					1, // month
					1, // day
					0, // hour (midnight is zero)
					0, // minute
					0, // second
					0 // milliseconds
			);
		}
		
		{
			DateTimeZone berlin = DateTimeZone.forID("Europe/Berlin");
			DateTime dateTime = new DateTime(berlin);	
		} 
		{
			LocalDate now = new LocalDate();
			LocalDate lastDayOfPreviousMonth = 
				now.minusMonths(1).dayOfMonth().withMaximumValue();
		}

	}
}
