
public class BankAccountTest {
	public static void main(String args[])
	{
		BankAccount bankaccount = new BankAccount(22,"Aman Kumar",20000.00);
		BankAccount bankaccount1 = new BankAccount(23,"Akshay Kumar",30000.00);
		BankAccount bankaccount2 = new BankAccount(22,"Abhay Kumar",50000.00);
		bankaccount.withdraw(1000);
		bankaccount1.doposit(4000);
		bankaccount2.doposit(5000);
		bankaccount.displayAccountBalance();
		bankaccount1.displayAccountBalance();
		bankaccount2.displayAccountBalance();
		double total=bankaccount.accountBalance+bankaccount1.accountBalance+bankaccount2.accountBalance;
		bankaccount.sumAccountBalance(bankaccount.accountBalance);
		bankaccount1.sumAccountBalance(bankaccount1.accountBalance);
		bankaccount2.sumAccountBalance(bankaccount2.accountBalance);
		System.out.println(BankAccount.sum);
	}

}
