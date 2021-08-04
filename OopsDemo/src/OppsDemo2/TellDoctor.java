package OppsDemo2;
// Java program to implement Inheritance
class Doctor{
	int id;
	String name;
	String address;
	public Doctor(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display() {
	    System.out.println("********* Doctor Details ***********");
	        System.out.println("The name is :" + name);
	        System.out.println("The  id number is :" + id);
	        System.out.println("The address is :" + address);
	    }
}
class Specialist extends Doctor
{
	String speciality;
	public Specialist(int id, String name, String address,String sp)
	{
		super(id, name, address);//invoke the base class constructor
		this.speciality=sp;
	}
	void display() {
		super.display();
		System.out.println("The Speciality is: "+speciality);
	}

}
class NonSpecialist extends Doctor{

	public NonSpecialist(int id, String name, String address) {
		super(id, name, address);
		
	}
	
}

public class TellDoctor {

	public static void main(String[] args) {
		//Invoke child class Specialist Constructor
		Specialist spObj=new Specialist(101,"Gaurav","Bihar","CardioSurgeon");
		spObj.display();//invoke child class Specialist Display() method
		
		//Invoke child class NonSpecialist Constructor
		NonSpecialist nspObj=new  NonSpecialist(102,"Tandon","Lucknow");
		nspObj.display();//Invoke base class Doctor Display() method
		

	}

}
