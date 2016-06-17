package sol;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SavingsSolution {
	private static final float BALANCE_MAX = 20000;
	private float balance;
	
	private Condition einzahlerCondition;
	private Condition auszahlerCondition;
	private Lock lock;

	public SavingsSolution(ReentrantLock lock) {
		this.balance = 0;
		this.lock = lock;
		this.einzahlerCondition = lock.newCondition();
		this.auszahlerCondition = lock.newCondition();
	}

	public float getBalance() {
		return this.balance;
	}

	public void withdraw(float amount) throws InterruptedException {
		lock.lock();
		
		while (this.balance < amount)
			auszahlerCondition.await();
		
		this.balance -= amount;
		
		einzahlerCondition.signalAll();
		lock.unlock();
	}

	public void deposit(float amount) throws InterruptedException {
		lock.lock();
		
		while (this.balance + amount > BALANCE_MAX)
			einzahlerCondition.await();
		
		this.balance += amount;
		
		auszahlerCondition.signalAll();
	}
}
