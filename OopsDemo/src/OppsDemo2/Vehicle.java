package OppsDemo2;

public class Vehicle {
	void Drive()
	{
		System.out.println("Driving Vehicle");
	}



}
class Car1 extends Vehicle
{

	void Drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving Car");
	}
	
}
class Truck extends Vehicle
{

	void Drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving Truck");	}
	public void Load()
	{
		System.out.println("Loading Truck");
	}
}
