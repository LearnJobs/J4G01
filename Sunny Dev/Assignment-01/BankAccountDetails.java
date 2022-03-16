
public class BankAccountDetails
{

	public static void main(String[] args) 
	{
		BankAccount bankAccount1 = new BankAccount(243425,"Mr.Ankit",10000);
		BankAccount bankAccount2 = new BankAccount(345627,"Mr.Rohit",20000);
		BankAccount bankAccount3 = new BankAccount(243425,"Mr.Mohit",40000);
		
		bankAccount1.depositBalance(20000);
		bankAccount2.depositBalance(6000);
		

		bankAccount3.WithdrawBlance(10000);
		bankAccount1.WithdrawBlance(15000);
		bankAccount2.WithdrawBlance(12000);
		
		System.out.println();
		System.out.println(bankAccount1);
		System.out.println(bankAccount3);
		System.out.println(bankAccount2);
	}

}
