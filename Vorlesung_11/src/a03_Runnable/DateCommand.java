package a03_Runnable;

import java.util.Date;

public class DateCommand implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++)
			System.out.println(new Date());
	}
}