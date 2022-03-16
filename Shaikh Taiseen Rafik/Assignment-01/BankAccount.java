package Assigmnent1;

public class BankAccount {
	int accountID;
	String accountName;
	int accountBalance =1000;
	public BankAccount(int accountID, String accountName, int accountBalance) {
		// TODO Auto-generated constructor stub
		this.accountID=accountID;
		this.accountName=accountName;
		this.accountBalance=accountBalance;
	}
	public BankAccount() {
		// TODO Auto-generated constructor stub
		this.accountID=11;
		this.accountName="Harshada";
		this.accountBalance=1000;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank= new BankAccount();
		bank.deposite(1000);
		bank.withdraw(500);
		
		BankAccount[] bank2= new BankAccount[] {new BankAccount(101,"Taiseen",1000),new BankAccount(111,"Shahid",5000),new BankAccount(121,"Toufik",10000)} ;
		for(BankAccount ba :bank2) {
			ba.deposite(2000);
			ba.withdraw(1000);
		}
	}

	private void withdraw( int withdraw) {
		// TODO Auto-generated method stub
		accountBalance=accountBalance-withdraw;
		System.out.println("Withdraw Amount From "+accountName+" Account "+accountBalance);
	}

	private void deposite( int deposite) {
		// TODO Auto-generated method stub
		accountBalance=accountBalance+deposite;
		System.out.println("Deposited to "+accountName+" Account "+accountBalance);
	}

}
