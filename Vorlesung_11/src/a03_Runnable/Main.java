package a03_Runnable;


public class Main {
	public static void main(String[] args) {
		Thread dateThread = new Thread(new DateCommand());
		Thread counterThread = new Thread(new CounterCommand());
		
		counterThread.start();
		dateThread.start();
		
	}
}
