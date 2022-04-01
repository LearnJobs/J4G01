package assignment1;

public class BankAccount {
	int accountId,accountBalance;
	String accountName;
	public BankAccount(int accountId, int accountBalance, String accountName) {
		super();
		this.accountId = accountId;
		this.accountBalance = accountBalance;
		this.accountName = accountName;
	}
	public void deposit(int amt) {
		System.out.println("balance in a account:"+accountBalance);
		amt=accountBalance+amt;
		System.out.println(+accountId+"  "+accountName+"  "+amt);
	}
	public void withdraw(int amt) {
		System.out.println("balance in a acoount:"+accountBalance);
		amt=accountBalance-amt;
		System.out.println(accountId+"  "+accountName+"  "+amt);
		
	}

}
