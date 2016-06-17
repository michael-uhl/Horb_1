package a02_thread;

public class Main {
	public static void main(String[] args) {
		Thread dateThread = new DateThread();
		Thread counterThread = new CounterThread();
		
		counterThread.start();
		dateThread.start();
		
	}
}
