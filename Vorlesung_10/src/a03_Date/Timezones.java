package a03_Date;

import java.util.TimeZone;

public class Timezones {
	public static void main(String[] args) {
		for(String id : TimeZone.getAvailableIDs()) {
			System.out.println(id); 
			System.out.println("\t" + TimeZone.getTimeZone(id).getDisplayName());
		}
	}
}
