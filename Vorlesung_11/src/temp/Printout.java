package temp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Printout {
	public static class MyThread extends Thread {
		/* ... */
		public void run() { 
			/* ... */
		} 
		/* ... */
	};
	
	public static class MyRunnable implements Runnable {
		/* ... */
		public void run() { 
			/* ... */
		} 
		/* ... */
	};
	
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		new MyThread().start();
		new Thread(new MyRunnable()).start();
	}
	
	public String foo(String a, String b) {
		return new StringBuilder(a).append(b).toString();
	}
	
	static {
		List<String> sl = Collections.synchronizedList(new ArrayList<String>());
		Map<String, String> m = Collections.synchronizedMap(new HashMap<String, String>());
		sl.add("");
	}
	
	static public class Foo {
		// safe
		private final StringBuilder builder;
	
		Foo() {
			// safe
			builder = new StringBuilder();
		}
	
		public void foo(final String a) {
			// unsafe
			builder.append(a);
		}
	
		public synchronized void bar(final String a) {
			// safe
			builder.append(a);
		}
	}
	
	public class ThreadSafe {
		private int x;
	
		public void setX(int x) {
			this.x = x;
		}
	}
	
	public static final class ExecutorPrintout {
		private static final Executor exec = Executors.newFixedThreadPool(1);
	
		public static void main(String[] args) {
			while (true) {
				Runnable task = new Runnable() {public void run() {}};
				exec.execute(task);
			}
		}
	}	
}

