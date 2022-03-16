
public class BankAccount
{
	int accountid;
	String accountName;
	double accountBalance;
	
	
	public BankAccount(int accountid, String accountName, double accountBalance) {
		super();
		this.accountid = accountid;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	public void depositBalance(double amount)
	{
		if(amount>0)
		{
			accountBalance+=amount;
			System.out.println("Amount deposited Successfully");
		}
		else
			System.out.println("Amount can't be deposited");
	}
	public void WithdrawBlance(double amount)
	{
		if(amount<=accountBalance)
		{
			accountBalance-=amount;
			System.out.println("Amount withdraw Successfully");
			
		}
	}
	
	

}
