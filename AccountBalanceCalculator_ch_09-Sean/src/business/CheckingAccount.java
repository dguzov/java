package business;

public class CheckingAccount extends Account {
private double monthlyFee;

public CheckingAccount(double balance, double monthlyFee) {
	super(balance);
	this.monthlyFee = monthlyFee;
}

public double getMonthlyFee() {
	return monthlyFee;
}
public void subtractMonthlyFee() {
	balance -= monthlyFee;
}
}
