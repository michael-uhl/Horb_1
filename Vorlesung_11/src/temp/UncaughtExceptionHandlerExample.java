package temp;

import java.lang.Thread.UncaughtExceptionHandler;
/**
 *
 * @author org.sanju
 * @date 26th June, 2011
 * Example program to demonstrate the use of UncaughtExceptionHandler
 *
 */


public class UncaughtExceptionHandlerExample {
	public static void main(String args[]){
		Worker worker = new Worker();
		worker.setName("worker");
//		worker.setUncaughtExceptionHandler(
//                      new WorkerThreadUncaughtExceptionHandler());
		worker.start();
	}
}


class WorkerThreadUncaughtExceptionHandler implements UncaughtExceptionHandler{
	
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Exception in "+t.getName());
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
}

class Worker extends Thread{
		public void run(){
		System.out.println(100/0);
	}
}
