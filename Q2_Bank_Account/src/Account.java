
public class Account {

	int accountNumber;
	double balance;
	
	public Account() {}
	
	public Account(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Remaning balance:" + balance);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	
	
}
