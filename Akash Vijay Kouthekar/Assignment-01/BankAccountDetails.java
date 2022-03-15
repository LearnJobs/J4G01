// Program 05 : This program is driver class of BankAccount class which performs
//				random withdraw & deposit operation on BankAccount objects & print
//				their details

package assignment01;
public class BankAccountDetails {
	public static void main(String[] args) {
		BankAccount bankAccount1 = new BankAccount(1234,"Mr. Smith",1000);
		BankAccount bankAccount2 = new BankAccount(2345,"Jhon Doe",2000);
		BankAccount bankAccount3 = new BankAccount(7894,"Jim Gordon",3000);
		
		// Depositing into random accounts
		bankAccount1.depositBalance(20000);
		bankAccount3.depositBalance(-5000);
		
		// Withdrawing from random accounts
		bankAccount2.withdrawBalance(5000);
		bankAccount1.withdrawBalance(13000);
		bankAccount2.withdrawBalance(1000);
		
		System.out.println();
		System.out.println(bankAccount1);
		System.out.println(bankAccount2);
		System.out.println(bankAccount3);
		System.out.println("Total Balance in the bank : "+BankAccount.totalBalance+" Ruppes only");
	}
}
