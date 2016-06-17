package a03_Date;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class ErzeugungCalendar {
	public static void main(String ... args) { 
		System.out.println(TimeZone.getDefault().getDisplayName());
		{
			Calendar cal = new GregorianCalendar();
			cal.toString();
		} 
		{
			Calendar cal = Calendar.getInstance();
			cal.toString();
		}
		{
			TimeZone dtt = TimeZone.getTimeZone("Europe/Berlin");
			Calendar cal = Calendar.getInstance(dtt);
			System.out.println(cal.get(Calendar.HOUR));
			dtt = TimeZone.getTimeZone("Asia/Shanghai");
			cal.setTimeZone(dtt);
			System.out.println(cal.get(Calendar.HOUR));
			System.out.println(dtt.inDaylightTime(cal.getTime()));
		}		
	}
}
