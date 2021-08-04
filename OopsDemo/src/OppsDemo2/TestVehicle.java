package OppsDemo2;
//Dynamic Polymorphism


public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vObj=new Vehicle();
		vObj.Drive();
		Vehicle vCar=new Car1();//Upcasting
		vCar.Drive();//invoke overriden drive method of car1 class
		Vehicle vTruck=new Truck();
		vTruck.Drive();
		// vTruck.Load();// Compile time Error
		Truck t1=new Truck();
		t1.Load();
		
		
		

	}

}
