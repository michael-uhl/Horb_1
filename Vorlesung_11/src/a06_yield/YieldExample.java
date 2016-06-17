package a06_yield;

public class YieldExample implements Runnable {

	private Thread t;

	YieldExample(String str) {

		t = new Thread(this, str);
		// this will call run() function
		t.start();
	}

	public void run() {

		for (int i = 0; i < 5; i++) {
			// yields control to another thread every 5 iterations
			if ((i % 5) == 0) {
				System.out.println(Thread.currentThread().getName()
						+ "yielding control...");

				/*
				 * causes the currently executing thread object to temporarily
				 * pause and allow other threads to execute
				 */
				Thread.yield();
			}
		}

		System.out.println(Thread.currentThread().getName()
				+ " hasfinished executing.");
	}

	public static void main(String[] args) {
		new YieldExample("Thread 1");
		new YieldExample("Thread 2");
		new YieldExample("Thread 3");
	}
}