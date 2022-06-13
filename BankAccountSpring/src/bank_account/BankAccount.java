package bank_account;

public class BankAccount {
	
	private double checking;
	private double savings;
	
	
	private static int numAccounts=0;
	private static double totalMoney=0.0D;
	
	public BankAccount() {
		this.checking=0;
		this.savings=0;
		BankAccount.numAccounts++;
	}

	
	public BankAccount(double checking,double savings) {
		
		this.checking=checking;
		this.savings=savings;
		BankAccount.numAccounts++;
		BankAccount.totalMoney += checking + savings;
	}
	
	public void Deposit(Double amount,Boolean accountType) {
		if(accountType) {
			savings += amount;
		} else {
			checking += amount;
		} totalMoney +=amount;
}
	
	public double Withdraw(Double amount,Boolean accountType) {
		if((checking-amount<0) || (savings-amount)<0) return 0;
		
		if(accountType) {
			savings -= amount;
		} else {
			checking -= amount;
		} return amount;
}
	
	public double getTotal() {
		return checking+savings;
	}
	
	
	public double getChecking() {
		return checking;
	}


	public void setChecking(double checking) {
		this.checking = checking;
	}


	public double getSavings() {
		return savings;
	}


	public void setSavings(double savings) {
		this.savings = savings;
	}


	public static int getNumAccounts() {
		return numAccounts;
	}


	public static void setNumAccounts(int numAccounts) {
		BankAccount.numAccounts = numAccounts;
	}


	public static double getTotalMoney() {
		return totalMoney;
	}


	public static void setTotalMoney(double totalMoney) {
		BankAccount.totalMoney = totalMoney;
	}


	
};
