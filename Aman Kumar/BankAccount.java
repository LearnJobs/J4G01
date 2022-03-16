
public class BankAccount {
		int accountId;
		String accountName;
		double accountBalance;
		static double sum =0;
		public BankAccount(int accountId, String accountName, double accountBalance) {
			super();
			this.accountId = accountId;
			this.accountName = accountName;
			this.accountBalance = accountBalance;
		}
		public void doposit(double credit)
		{
			accountBalance=accountBalance+credit;
		}
		public void withdraw(double withdraw)
		{
			if(accountBalance>withdraw)
			{
				accountBalance=accountBalance -withdraw;
			}
			else
			{
				System.out.println("the balance is to low");
			}
		}
		public void sumAccountBalance(double sum)
		{
			sum=sum+accountBalance;
		}
		public void displayAccountBalance() {
			System.out.println(accountId);
			System.out.println(accountName);
			System.out.println(accountBalance);
		}
		/*public void totalDisplay()
		{
			System.out.println(sum);
		}*/
		
		
}
