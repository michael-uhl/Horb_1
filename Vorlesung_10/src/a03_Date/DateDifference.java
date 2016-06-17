package a03_Date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateDifference {
	public static void main(String[] args) {
	    Calendar c1 = new GregorianCalendar();
	    Calendar c2 = new GregorianCalendar();
	    c1.set(2000, 1, 1);
	    c2.set(2010,1, 1);
	    long span = c2.getTimeInMillis() - c1.getTimeInMillis();
	    Calendar c3 = new GregorianCalendar();
	    c3.setTimeInMillis(span);
	    long numberOfMSInADay = 1000*60*60*24;
	    System.out.println(c3.getTimeInMillis() / numberOfMSInADay); //3653		
	}
	
	public static void main2(String ... args) {
		Calendar c1 = new GregorianCalendar();
		c1.set(2014, 0, 31);
		System.out.println(c1.getTime().toString());
		c1.add(Calendar.DAY_OF_MONTH, 5);
		System.out.println(c1.getTime().toString());
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));
		c1.set(2014, 0, 1);
		System.out.println(c1.getTime().toString());
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));		
	}
}
