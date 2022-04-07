
public class BankAccount {
	int accountId;
	String accountName;
	double accountBalance=0;
	public BankAccount(int accountId, String accountName) {
		this.accountId = accountId;
		this.accountName = accountName;
	}
	public void deposite(int amount) {
		this.accountBalance+=amount;
		System.out.println(" 50Balance is :"+accountBalance);
	}
	public void withdraw(int amount) {
		if(accountBalance>=amount) {
			double balance = accountBalance - amount;
			this.accountBalance = balance;
			System.out.println("Total Balance is :" +accountBalance);
		}
	}
	public  void displayDetails() {
		System.out.println("account Id : "+this.accountId);
		System.out.println("account name : "+this.accountName);
	}
}
