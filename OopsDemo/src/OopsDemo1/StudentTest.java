package OopsDemo1;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an object of a sudent class
		Student s1=new Student();
		//Invoke methods of student class using . operator
		s1.input();
		float tot=s1.calculate();
		s1.display();
		System.out.println("Total"+tot);
		

	}

}
