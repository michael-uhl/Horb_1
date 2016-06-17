package temp;

public class yield implements Runnable {

	@Override
	public void run() {
		for (int x = 1; x <= 4; x++) {
			if (x == 2) {
				Thread.yield();
			} else {

				System.out.println(x + "Thread name is  "
						+ Thread.currentThread().getName());
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new yield());
		Thread t2 = new Thread(new yield());
		Thread t3 = new Thread(new yield());
		t1.start();
		t2.start();
		t3.start();
	}
}