// This class is Part of Program : 05
//	Create a BankAccout class with required fields & it should contain deposit() &
//	withdraw() method which takes amount as argument.
//	The BankAccount class should also consist of one totalBalance variable which 
//	prints total balance of all account

package assignment01;
public class BankAccount {
	static double totalBalance=0;
	int accountId;
	String accountName;
	double accountBalance;
	
	public BankAccount(int accountId, String accountName, double accountBalance) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
		totalBalance=totalBalance+accountBalance;
	}
	
	public void depositBalance(double amount)
	{
		if(amount>0)
		{
		accountBalance+=amount;
		totalBalance=totalBalance+amount;
		System.out.println("Amount deposited successfully!");
		}
		else
			System.out.println("Amount can't be deposited");
	}
	
	public void withdrawBalance(double amount)
	{
		if(amount<=accountBalance)
		{
		accountBalance-=amount;
		totalBalance-=amount;
		System.out.println("Amount withdrawn successfully!");
		}
		else
			System.out.println("Insufficient balance.");
	}

	@Override
	public String toString() {
		return "Account Number : " + accountId + "\nName : " + accountName + "\nTotal Balance : "
				+ accountBalance + " Ruppess only\n";
	}
}
