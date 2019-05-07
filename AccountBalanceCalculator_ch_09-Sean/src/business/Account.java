package business;

public class Account implements Depositable, Withdrawable, Balanceable {

	protected double balance;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
balance = amount;
	}

	@Override
	public void withdraw(double amount) {
balance -= amount;

	}

	@Override
	public void deposit(double amount) {
	balance += amount;

	}

}
