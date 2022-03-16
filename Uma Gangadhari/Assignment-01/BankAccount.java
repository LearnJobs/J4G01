
public class BankAccount {
int accountId;
String accountName;
double accountBalance;
static double sumOfBalance=100000;

	public static void main(String[] args) {
		BankAccount b1=new BankAccount(1,"Uma",10000);
		b1.deposit(6000);
		b1.withdraw(3000);		
		BankAccount b2=new BankAccount(2,"Appu",20000);
		b2.deposit(8000);
		b2.withdraw(5000);				
		BankAccount b3=new BankAccount(3,"Mouni",5000);
		b3.deposit(5000);
		b3.withdraw(2000);	
		}	

public BankAccount(int accountId, String accountName, long accountBalance) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

public void deposit(double amount)
{	
	accountBalance=accountBalance+amount;
	System.out.println(accountId+","+accountName+","+accountBalance);
	sumOfBalance=sumOfBalance+amount;
	System.out.println("sumOfBalance"+sumOfBalance);
}

public void withdraw(double amount)
{
	accountBalance=accountBalance-amount;
	System.out.println(accountId+","+accountName+","+accountBalance);
	sumOfBalance=sumOfBalance-amount;
	System.out.println("sumOfBalance"+sumOfBalance);
}
}
