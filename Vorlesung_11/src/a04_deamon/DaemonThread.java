package a04_deamon;

public class DaemonThread extends Thread {
	public static void main(String[] args) {
		new DaemonThread().start();
	}
	
	DaemonThread() {
		setDaemon(true);
	}

	@Override
	public void run() {
		while (true)
			System.out.println("Lauf, Thread, lauf");
	}


}