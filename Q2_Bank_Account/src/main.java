import java.util.Scanner;

public class main {

	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the account type");
		 String accountType = sc.next();
		 
		 System.out.println("Enter the account number");
		 String accountnumber = sc.next();
		 
		 System.out.println("Enter the balance");
		 String balance = sc.next();
		 
		 System.out.println("Enter the widthrawl");
		 String withdrwal = sc.next();
		 
		 Account account = null;
		 
		 if(accountType.equalsIgnoreCase("savings")) {
//			 double balanceAmt = Integer.parseInt(balance);
			 double withdrwalAmt = Double.parseDouble(withdrwal);
			 account = new SavingsAccount(withdrwalAmt);
		 }else if(accountType.equalsIgnoreCase("current")){
			 double balanceAmt = Integer.parseInt(balance);
			 double withdrwalAmt = Integer.parseInt(withdrwal);
//			 account = new CurrentAccount(balanceAmt,withdrwalAmt);
		 }else {
			 System.out.println("Invalid Account Type");
		 }
		 
//		 SavingsAccount savingAccount = new SavingsAccount(2344578,600);
//		 savingAccount.checkSavingAccountRule();
		 
//		 CurrentAccount currentAccount = new CurrentAccount(2344578,1200);
//		 currentAccount.checkCurrentAccountRule();
		 
		 
	 }
}
