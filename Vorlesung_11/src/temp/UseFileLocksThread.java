package temp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class UseFileLocksThread extends Thread {
	private static final int start = 10;
	private static final int end = 20;

	private FileChannel fc;

	public UseFileLocksThread(String name, FileChannel fc) {
		super(name);
		this.fc = fc;
	}

	@Override
	public void run() {
		try {
			while (true) {
				// Get lock
				System.out.println(this.getName() + ": trying to get lock");
				FileLock lock;
				synchronized (fc) {
					lock = fc.lock(start, end, false);

					System.out.println(this.getName() + ": got lock!");

					// Pause
					System.out.println(this.getName() + ": pausing");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ie) {
					}

					// Release lock
					System.out.println(this.getName()
							+ ": going to release lock");
					lock.release();
					//Thread.yield();
					fc.notify();
					try {
						fc.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(this.getName() + ": released lock");

				if (false) {
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
