package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CmparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> a1=new ArrayList<Student>();
		Student s1= new Student(101,"Gaurav",23);
		Student s2= new Student(102,"Tandon",23);
		Student s3= new Student(103,"Kuldip",24);
		Student s4= new Student(104,"Arvind",23);
		Student s5= new Student(105,"Gillu",23);
		
		//Adding student to the list
		a1.add(s2);a1.add(s3);a1.add(s1);a1.add(s4);a1.add(s5);
		Collections.sort(a1);
		
		System.out.println("*****Students Sorted List BAsed on Age******");
		for(Student s:a1)
		{
			System.out.println(s.rollNo+" "+ s.name+" "+s.age);
			
		}
}

}
