package temp;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.concurrent.CyclicBarrier;

public class Main {
	public static void main(String ... args) {
		CyclicBarrier barrier = new CyclicBarrier(1);	
		
	    new Thread(new AbwechselndThread("Thread 1:", barrier)).start();
	    new Thread(new AbwechselndThread("   Thread 2:",barrier)).start();
	}
	
//	public static void main(String ... args) throws Exception {
//		RandomAccessFile raf = 
//			new RandomAccessFile("res/usefilelocks.txt", "rw");
//		FileChannel fc = raf.getChannel();		
//		
//		Thread thread_1 = new UseFileLocksThread("Thread 1", fc);
//		Thread thread_2 = new UseFileLocksThread("    Thread 2", fc);
//		
//		thread_1.start();
//		thread_2.start();
//
//	}

}
