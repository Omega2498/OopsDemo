package OopsDemo1;
import java.util.Scanner;
public class Student {
	int rollnumber;
	String name,course;
	float m1,m2,m3,total;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter roll no,name,course:");
		rollnumber=sc.nextInt();
		name=sc.next();
		course=sc.next();
		System.out.println("Enter the marks in three courses:");
		m1=sc.nextInt();
		m1=sc.nextInt();
		m3=sc.nextInt();	
	}
	
	float calculate()
	{
		total=m1+m2+m3;
		return total;
		
	}
	void display()
	{
		System.out.println("*****Student Details*****");
		System.out.println("Roll no:"+rollnumber);
		System.out.println("Name: "+name);
		System.out.println("Course: "+course);
		System.out.println("Total Marks: "+total);
	}
	
	
	

}
