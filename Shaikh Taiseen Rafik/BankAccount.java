
public class BankAccount {
	int accountID;
	String accountName;
	int accountBalance =1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank= new BankAccount();
		bank.deposite(101,"Taiseen",1000);
		bank.withdraw(101,"Taiseen",100);
		
//		BankAccount[] bank2= new BankAccount[] {} ;
//		for(BankAccount ba :bank2) {
//			bank.deposite(101,"Taiseen",1000);
//			bank.withdraw(101,"Taiseen",100);
//		}
	}

	private void withdraw(int accountID, String accountName, int withdraw) {
		// TODO Auto-generated method stub
		accountBalance=accountBalance-withdraw;
		System.out.println("Withdraw Amount From "+accountName+" Account "+accountBalance);
	}

	private void deposite(int accountID, String accountName, int deposite) {
		// TODO Auto-generated method stub
		accountBalance=accountBalance+deposite;
		System.out.println("Deposited to "+accountName+" Account "+accountBalance);
	}

}
