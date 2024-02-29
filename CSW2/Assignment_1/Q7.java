abstract class Account {
	private int account_number;
	private double balance;

	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return account_number;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccountNumber(int account_number) {
		this.account_number = account_number;
	}

	abstract void deposit(double amount);

	abstract void withdrawl(double amount);

}

class SavingsAccount extends Account {
	final double interest_rate = 10;

	void deposit(double amount) {

		double interest = amount * interest_rate * 0.01;
		setBalance(getBalance() + interest + amount);
		System.out.println("Updated Balance: " + getBalance());

	}

	void withdrawl(double amount) {
		if (amount > getBalance()) {
			System.out.println("Insufficient Balance");
		} else {
			setBalance(getBalance() - amount);
		}
		System.out.println("Updated Balance:" + getBalance());
	}
}

class CurrentAccount extends Account {
	final double overdraftLimit = 50000;

	void deposit(double amount) {
		setBalance(amount + getBalance());
		System.out.println("Updated Balance:" + getBalance());
	}

	void withdrawl(double amount) {
		if (amount > getBalance()) {
			System.out.println("Insufficient Balance");
		} else if (amount > overdraftLimit) {
			System.out.println("Exceeding Overdraft Limit");
		} else {
			setBalance(getBalance() - amount);
		}
		System.out.println("Updated Balance:" + getBalance());
	}
}

public class Q7 {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		CurrentAccount ca = new CurrentAccount();
		sa.setAccountNumber(10111);
		System.out.println("For Savings Account");
		sa.deposit(50000);
		sa.withdrawl(10000);
		System.out.println("For Current Account");
		ca.deposit(100000);
		ca.withdrawl(40000);

	}
}

/*
 * Output--
 * For Savings Account
 * Updated Balance : 55000.0
 * Updated Balance:45000.0
 * For Current Account
 * Updated Balance:100000.0
 * Updated Balance:60000.0
 */