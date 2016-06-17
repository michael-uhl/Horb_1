package a08_synchronized;

import java.util.Random;


public class BankAccountThreadsicher1 {
	public static void main(String[] args) throws InterruptedException {
		BankAccountThreadsicher1 ba = new BankAccountThreadsicher1();
		ba.deposit(1000000);

		BankActivityThread t1 = new BankActivityThread(ba);
		BankActivityThread t2 = new BankActivityThread(ba);
		
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

		private BankAccountThreadsicher1 bankAccount;
		private long[] deposits = new long[10000];
		private long[] transfers = new long[10000];
		
		public BankActivityThread(BankAccountThreadsicher1 bankAccount) {
			super();
			this.bankAccount = bankAccount;
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

				
				bankAccount.deposit(amountDeposit);
				bankAccount.transfer(amountTransfer);
				

			}
		}
	}

	long accountBalance;

	public synchronized long transfer(long amount) {
		long newAccountBalance = accountBalance - amount;
		accountBalance = newAccountBalance;
		return accountBalance;
	}

	public synchronized long deposit(long amount) {
		long newAccountBalance = accountBalance + amount;
		accountBalance = newAccountBalance;
		return accountBalance;

	}
}
