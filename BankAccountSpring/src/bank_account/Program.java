package bank_account;

public class Program {
	public static void main(String[] args) {
		
		BankAccount account1=new BankAccount();
		BankAccount account2=new BankAccount(100.23D,4000D);
		
		account1.Deposit(400.0D,false);
		System.out.println(account1.getChecking());
		account2.Deposit(123.45,true);
		System.out.println(account2.getSavings());
		
		account1.Withdraw(200.0D, false);
		System.out.println(account1.getChecking());
		account2.Withdraw(300.0D,true);
		System.out.println(account2.getSavings());
		
		
	}
	
};