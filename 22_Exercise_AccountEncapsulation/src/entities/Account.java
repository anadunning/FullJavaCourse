package entities;

public class Account {
	
	private static final double TAX = 5.00;
	
	private int accountNumber;
	private String holderName;
	private double balance;
	
	public Account() {
	}
	
	public Account(int accountNumber, String holderName, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		makeDeposit(initialDeposit);
	}
	
	public Account(int accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void makeDeposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= value + TAX; 
	}
	
	public String toString() {
		return "Account "
				+ accountNumber + ", Holder: "
				+ holderName + ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}