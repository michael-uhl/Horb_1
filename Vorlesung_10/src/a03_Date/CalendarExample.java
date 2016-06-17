package a03_Date;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.MONTH));
		cal.add(Calendar.MONTH, 1);
		System.out.println(cal.get(Calendar.MONTH));
	}
}
