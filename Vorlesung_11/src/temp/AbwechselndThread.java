package temp;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class AbwechselndThread extends Thread {
	
    private CyclicBarrier barrier;

    public AbwechselndThread(String name, CyclicBarrier barrier) {
    	super(name);
        this.barrier = barrier;
    }

    public void run() {
        try {
			barrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
        System.out.println(this.getName() + " DRAN ha ha ha.");
	}
	
	

}
