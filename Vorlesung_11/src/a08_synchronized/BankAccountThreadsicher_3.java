package a08_synchronized;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;


public class BankAccountThreadsicher_3 {
	
	public static void main(String[] args) throws InterruptedException {
		BankAccountThreadsicher_3 ba = new BankAccountThreadsicher_3();
		ba.deposit(1000000);
		
		ReentrantLock lock = new ReentrantLock();

		BankActivityThread t1 = new BankActivityThread(ba, lock);
		BankActivityThread t2 = new BankActivityThread(ba, lock);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		if (t2.evaluateResult(t1.evaluateResult(1000000)) == ba.accountBalance) {
			System.out.println("Richtig gerechnet.");
		} else {
			System.out.println("Falsch gerechnet.");
		}
		

	}

	public static class BankActivityThread extends Thread {

		private BankAccountThreadsicher_3 bankAccount;
		private long[] deposits = new long[10000];
		private long[] transfers = new long[10000];
		
		private ReentrantLock lock;
		
		public BankActivityThread(BankAccountThreadsicher_3 bankAccount, ReentrantLock lock) {
			super();
			this.bankAccount = bankAccount;
			this.lock = lock;
		}

		public long evaluateResult(long input) {
			for(long deposit : deposits) {
				input += deposit;
			}
			
			for(long transfer : transfers) {
				input -= transfer;
			}
			
			return input;
		}
		
		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				long amountTransfer = new Double(new Random().nextFloat() * 100).longValue();
				long amountDeposit = new Double(new Random().nextFloat() * 100).longValue();
				
				deposits[i] = amountDeposit;
				transfers[i] = amountTransfer;

				lock.lock();
				
				try {
					bankAccount.deposit(amountDeposit);
					bankAccount.transfer(amountTransfer);	
				} finally {
					lock.unlock();
				}
			}
		}
	}

	long accountBalance;

	public long transfer(long amount) {
		long newAccountBalance = accountBalance - amount;
		accountBalance = newAccountBalance;
		return accountBalance;
	}

	public long deposit(long amount) {
		long newAccountBalance = accountBalance + amount;
		accountBalance = newAccountBalance;
		return accountBalance;

	}
}
