package a07_waitNotify;

public class ProducerConsumerWrong {
	public static class Q {
		int n;
		
		synchronized int get() {
			System.out.println("Got: " + n);
			return n;
		}
	
		synchronized void put(int n) {
			this.n = n;
			System.out.println("Put: " + n);
		}
	}

	public static class Producer implements Runnable {
		Q q;
	
		Producer(Q q) {
			this.q = q;
			new Thread(this, "Producer").start();
		}
	
		public void run() {
			int i = 0;
			while (true) {
				q.put(i++);
			}
		}
	}

	public static class Consumer implements Runnable {
		Q q;
		
	
		Consumer(Q q) {
			this.q = q;
			new Thread(this, "Consumer").start();
		}
	
		public void run() {
			while (true) {
				q.get();
			}
		}
	}

	public static void main(String args[]) {
		Q q = new Q();
		System.out.println("Press Control-C to stop.");
		new Producer(q);
		new Consumer(q);
	}

}
