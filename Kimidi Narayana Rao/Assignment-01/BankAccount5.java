
public class BankAccount5 {
	int accountId;
	String accountName;
	double accountBalance;
	double sumBalance;
	
	public  BankAccount5(int accountId, String accountName, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountBalance = accountBalance;

	}
	public void deposit(double amt)
	{
		accountBalance = accountBalance + amt;
	}
	public void withdraw(double amt)
	{
		accountBalance = accountBalance - amt;
	}
	
	void display()
	{
		
	}
	
	public static void main(String args[])
	{
		BankAccount5 ba1 = new BankAccount5(123, " KNR", 5000.00);
		ba1.deposit(500);
		ba1.withdraw(1000);
		
		BankAccount5 ba2 = new BankAccount5(456, " KKK", 6000.00);
		ba2.deposit(400);
		ba2.withdraw(700);
		
		BankAccount5 ba3 = new BankAccount5(789, " ZZZ", 7000.00);
		ba3.deposit(800);
		ba3.withdraw(700);
		
		System.out.println("-----Details of User 1----");
		System.out.println("After Deposit:");
		
		System.out.println("ID: "+ba1.accountId);
		System.out.println("Name: "+ba1.accountName);
		System.out.println("Balance: "+ba1.accountBalance);
		
		System.out.println();
		
		System.out.println("After Withdrawing:");	
		
		System.out.println("ID: "+ba1.accountId);
		System.out.println("Name: "+ba1.accountName);
		System.out.println("Balance: "+ba1.accountBalance);
		
		System.out.println();
		
		System.out.println("-----Details of User 2----");
		System.out.println("After Deposit:");
		
		System.out.println("ID: "+ba2.accountId);
		System.out.println("Name: "+ba2.accountName);
		System.out.println("Balance: "+ba2.accountBalance);
		
		System.out.println("After Withdrawing:");
		
		System.out.println("ID: "+ba2.accountId);
		System.out.println("Name: "+ba2.accountName);
		System.out.println("Balance: "+ba2.accountBalance);
				
		System.out.println();
		
		System.out.println("-----Details of User 3----");
		System.out.println("After Deposit:");
		
		System.out.println("ID: "+ba3.accountId);
		System.out.println("Name: "+ba3.accountName);
		System.out.println("Balance: "+ba3.accountBalance);
		
		System.out.println("After Withdrawing:");	
		
		System.out.println("ID: "+ba3.accountId);
		System.out.println("Name: "+ba3.accountName);
		System.out.println("Balance: "+ba3.accountBalance);
		
	}

	
}
