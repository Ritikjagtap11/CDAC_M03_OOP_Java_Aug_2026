
public class SavingsAccount extends Account {

	public SavingsAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double withdrwalAmt) {
		try {
			if(balance < 500) {
				System.out.println("Savings account must maintain minimum balance of 500");
				throw new InsufficientBalanceException("Withdrawal denied due to insufficient balance");
			}
			
			System.out.println("Remaining Balance = " + (balance- withdrwalAmt) );
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
