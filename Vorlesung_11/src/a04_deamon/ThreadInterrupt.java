package a04_deamon;

public class ThreadInterrupt extends Thread {

	public static void main(String ... args) {
		Thread t = new ThreadInterrupt();
		t.start();
		t.interrupt();
	}
	
	ThreadInterrupt() {
	}

	@Override
	public void run() {
		while (!this.isInterrupted())
			System.out.println("Lauf, Thread, lauf");
	}

	@Override
	protected void finalize() throws Throwable {
		this.interrupt();
		System.out.println("inter");
		super.finalize();
	}
	
	
}
