package OppsDemo2;

public class SavingsBank extends Account {
	private int min_bal;
	protected int balance;

	public SavingsBank(int accNo, String name, int mb, int b) {
		super(accNo, name);
		this.min_bal=mb;
		this.balance=b;
		// TODO Auto-generated constructor stub
	}
	void display()
        {
                super.display();//Invokes Account
                System.out.println ("Minimum Balance: "+min_bal);
                System.out.println ("Saving Balance: "+balance);
        }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
