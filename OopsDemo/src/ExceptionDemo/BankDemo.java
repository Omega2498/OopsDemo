package ExceptionDemo;

public class BankDemo {

	public static void main(String[] args) {
		CheckingAccount c1=new CheckingAccount(101);
		System.out.println("Deeposit $5000-------");
		c1.deposit(5000);
	
	try
	{
		System.out.println("Withdrawing  $1000-------");
		c1.withdraw(1000);
		
		System.out.println("Withdrawing $5000-------");
		c1.deposit(6000);
		
	}
	catch
	{
		System.out.println("Sorry insufficient baance: "+c1.getBalance());
		e.printStackTrace();
	}

}
}

