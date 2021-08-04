package CollectionsDemo;

import java.util.Set;

//Hash Set with user defines objects

public class HashSetDemoUserDefined {

	public static void main(String[] args) {
		Set<Customer> customers=new HashSet<Customer>();
		//Add customer Object to set
		customers.add(new Customer(101,"Gaurav","Muzaffarpur"));
		customers.add(new Customer(102,"Kuldip","Bokaro"));
		customers.add(new Customer(103,"Tandon","Lucknow"));
		customers.add(new Customer(104,"Gillu","J&K"));
		customers.add(new Customer(105,"Arvind","Ranchi"));
		//add Duplicate customer
		customers.add(new Customer(101,"Gaurav","Muzaffarpur"));
		for(Customer i:customers)
		{
			System.out.println(i."")
		}
		

		
	}

}
