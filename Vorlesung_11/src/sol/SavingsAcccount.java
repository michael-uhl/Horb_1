package sol;

class SavingsAccount {
	private static final float BALANCE_MAX = 20000;
	private float balance;

	public SavingsAccount() {
		this.balance = 0;
	}

	synchronized public float getBalance() {
		return this.balance;
	}

	synchronized public void withdraw(float amount) throws InterruptedException {
		while (this.balance < amount)
			wait();
		this.balance -= amount;
		notifyAll();
	}

	synchronized public void deposit(float amount) throws InterruptedException {
		while (this.balance + amount > BALANCE_MAX)
			wait();
		this.balance += amount;
		notifyAll();
	}
}