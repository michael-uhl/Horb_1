package a09_ExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Shouter implements Runnable {
	
	public static void main(String ... args) {
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		scheduler.scheduleAtFixedRate(new Shouter(), 0, 1, TimeUnit.SECONDS);
	}

	@Override
	public void run() {
		System.out.println("Rufe HALLO." + " " + "fldjaflkdj");
	}

}
