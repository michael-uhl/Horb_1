package a_01_Varargs;

import java.util.Date;

public class PrintFDate {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 100; i++) {
			Date now = new Date();
			System.out.printf("Es ist jetzt %1$tH Uhr %1$tM und %1$tS Sekunden.%n", now);
			Thread.sleep(1000);
		}

	}

}
