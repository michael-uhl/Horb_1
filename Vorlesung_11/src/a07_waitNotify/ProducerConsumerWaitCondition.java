package a07_waitNotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerWaitCondition {
	// A correct implementation of a producer and consumer.
	public static class Q {
		int n;
		boolean valueSet = false;
		ReentrantLock lock = new ReentrantLock();
		Condition valueWrittenAndNotReadCondition = lock.newCondition();

		int get() {
			lock.lock();
			if (!valueSet) {
				try {
					valueWrittenAndNotReadCondition.await();
				} catch (InterruptedException e) {
					System.out.println("InterruptedException caught");
				}
			}
			System.out.println("Got: " + n);
			valueSet = false;
			valueWrittenAndNotReadCondition.signal();
			lock.unlock();
			return n;
		}

		void put(int n) {
			lock.lock();
			if (valueSet) {
				try {
					valueWrittenAndNotReadCondition.await();
				} catch (InterruptedException e) {
					System.out.println("InterruptedException caught");
				}
			}
			this.n = n;
			valueSet = true;
			System.out.println("Put: " + n);
			valueWrittenAndNotReadCondition.signal();
			lock.unlock();
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
