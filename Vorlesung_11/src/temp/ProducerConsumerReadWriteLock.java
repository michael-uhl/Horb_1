package temp;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ProducerConsumerReadWriteLock {
	// A correct implementation of a producer and consumer.
	public static class Q {
		int n;
		ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

		int get() {
			lock.readLock().lock();
			System.out.println("Got: " + n);
			lock.readLock().unlock();
			return n;
		}

		void put(int n) {
			lock.writeLock().lock();
			this.n = n;
			System.out.println("Put: " + n);
			lock.writeLock().unlock();
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
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Control-C to stop.");
	}
}
