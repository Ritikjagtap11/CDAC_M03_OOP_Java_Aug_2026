
public class CurrentAccount extends Account {

	public CurrentAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void withdraw(double amount) {
		try {
			if(balance < 0) {
				throw new InsufficientBalanceException("withdrawal exceeds balance,");
			}
			
			System.out.println("Remaining Balance = " + balance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
