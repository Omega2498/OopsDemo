package OppsDemo2;

public class AggregationDemo {

	public static void main(String[] args) {
		Address ad1=new Address("Muzaffarpur","Bihar","India",843125);
		Address ad2=new Address("Greater Noida","UP","india",201310);
		Student s1=new Student(101,"Gaurav",ad1);
		Student s2=new Student(102,"Kuldip",ad2);
		s1.display();
		s2.display();

	}

}
