package OppsDemo2;
/* Multi Level Inheritance
 *  Account  --- > SavingsBank ---> AccountDetails
 */

public class AccountDetails extends SavingsBank {
	int withdrawl,deposit,finalbalance;

	public AccountDetails(int accNo, String name, int mb, int b,int w, int d) {
		super(accNo, name, mb, b);
		this.withdrawl=w;
		this.deposit=d;

		
	}
	void display()
    {
            super.display();//invokes SavingsBank
            System.out.println ("Deposit: "+deposit);
            System.out.println ("Withdrawals: "+withdrawl);
            finalbalance=(balance+deposit)-withdrawl;
            System.out.println("Final Balance"+finalbalance);

    }

}
