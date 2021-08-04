package OopsDemo1;
import java.util.Scanner;
// Program to demonstrate working of constructors
class Person
{
	String name,constituency;
	int age;
	Scanner s;
	public Person() //Implicit Constructor
	{
		System.out.println("Voter Eligibility App");
		age=0;
		name="";
		constituency="Bihar";
		s=new Scanner(System.in);	
	}
	public Person(String name, int age) //Parameterized Constructor
	{
		this.name = name;
		this.age = age;
		constituency="Mumbai";
	}
	void input()
	{
		System.out.println("Enter your name:");
		name=s.nextLine();
		System.out.println("Enter your age:");
		age=s.nextInt();
	}
	void print()
	{
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("constituency is: "+constituency);
	}
	
	
}

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person objPerson1=new Person();//invoke implicit constructor
		objPerson1.input();
		objPerson1.print();
		System.out.println("-------------------");
		Person objPerson2=new Person("Gaurav",23);//invoke constructor with 2 arguments
		objPerson2.print();

	}

}
