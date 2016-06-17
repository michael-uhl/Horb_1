package a01_motivation;

public class ForkBomb implements Runnable {
	public static void main(String[] args) {
		new ForkBomb().run();
	}

	public void run() {
		new Thread(this).start();
		new Thread(this).start();
	}
}
