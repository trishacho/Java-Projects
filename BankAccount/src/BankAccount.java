public class BankAccount 
{
	private String password;
	private double myBalance;
	public static final double OVERDRAWN_PENALTY = 20.00;
	public static int counter = 0;
	
	public BankAccount()
	{
		password = "";
		myBalance = 0;
		counter++;
	}
	
	public BankAccount(String pw, double balance)
	{ 
		password = pw;
		myBalance = balance;
		counter++;
	}
	
	public void setUpAccount(String password, double balance)
	{ 
		this.password = password;
		myBalance = balance;
		return;
	}
	
	public double getBalance()
	{ 
		return myBalance;
	}
	
	public void deposit(String pw, int amount)
	{
		if (pw.equals(password))
			myBalance +=amount;
	}

	public void deposit(String pw, double amount)
	{
		if(pw.equals(password))
			myBalance += amount;
	}
	
	public void withdraw(String pw, int amount)
	{
		if(pw.equals(password))
		{
			myBalance = myBalance - amount;
		}
		if (myBalance <0)
		{
			System.out.println("Overdrawn");
			myBalance = myBalance-OVERDRAWN_PENALTY;
		}
	}

	public void withdraw(String pw, double amount)
	{
		if(pw.equals(password))
		{
			myBalance = myBalance - amount;
		}
		if(myBalance < 0)
		{
			System.out.println("Overdrawn");
			myBalance = myBalance-OVERDRAWN_PENALTY;
		}
	}
	
	public static BankAccount whoHasMore(BankAccount b1, BankAccount b2)
	{
		BankAccount moreMoney;
		if (b1.getBalance()>b2.getBalance())
			moreMoney = b1;
		else
			moreMoney=b2;
		
		return moreMoney;		
	}
		
	public static void main(String[] args) 
	{
		BankAccount josh = new BankAccount("hamburger1", 2000.25);
		BankAccount ben = new BankAccount("sandwich2", 3400.54);
		
		System.out.println("Josh's balance is "+ josh.getBalance());
		System.out.println("Ben's balance is " + ben.getBalance());
		
		System.out.println("The number of accounts is "+ BankAccount.counter);
		
		josh.deposit("hamburger1", 500.43);
		System.out.println("Josh's balance with deposit is "+ josh.getBalance());
		
		ben.withdraw("sandwich2", 4000.25);
		System.out.println("Ben's balance with withdrawal is " + ben.getBalance());
		
		BankAccount better = BankAccount.whoHasMore(josh,ben);
		System.out.println("The largest deposit amount is " + better.getBalance());
		
		BankAccount.counter = 10;
		System.out.println(BankAccount.counter);
	}
}