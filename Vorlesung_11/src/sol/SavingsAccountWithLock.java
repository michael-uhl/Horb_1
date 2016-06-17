package sol;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SavingsAccountWithLock {
	private static final float BALANCE_MAX = 20000;
	private float balance;
	
	private Condition condition;
	private Lock lock;

	public SavingsAccountWithLock(ReentrantLock lock) {
		this.balance = 0;
		this.lock = lock;
		this.condition = lock.newCondition();
	}

	public float getBalance() {
		return this.balance;
	}

	public void withdraw(float amount) throws InterruptedException {
		lock.lock();
		
		while (this.balance < amount)
			condition.await();
		
		this.balance -= amount;
		
		condition.signalAll();
		lock.unlock();
	}

	public void deposit(float amount) throws InterruptedException {
		lock.lock();
		
		while (this.balance + amount > BALANCE_MAX)
			condition.await();
		
		this.balance += amount;
		
		condition.signalAll();
	}
}
