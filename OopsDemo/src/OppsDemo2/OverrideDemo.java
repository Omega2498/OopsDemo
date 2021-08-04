package OppsDemo2;
class Bank
{
	int getRateofIntereset()
	{
		return 0;
	}
	void display()
	{
		System.out.println("Welcome to Bank");
	}
}
class SBI extends Bank
{
	int getRateofIntereset()//Overrriden Method
	{
		return 5;
	}
}
class ICICI extends Bank
{
	int getRateofInterest()//Method Overriden in child class
	{
		return 7;
	}
}
class Axis extends Bank
{
	int getRateofInterest()//Method Overriden in child class
	{
		return 6;
		
	}
	
}
public class OverrideDemo {
	public static void main(String[] args) {
		SBI b1=new SBI();
		Axis b2=new Axis();
		ICICI b3=new ICICI();
		b1.display();
		System.out.println("The rate of Interest of SBI is : "+b1.getRateofIntereset());
		b2.display();
		System.out.println("The rate of Interest of Axis is : "+b2.getRateofInterest());
		b3.display();
		System.out.println("The rate of Interest of ICICI is : "+b3.getRateofInterest());

	
	}

}
