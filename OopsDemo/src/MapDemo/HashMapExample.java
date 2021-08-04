package MapDemo;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Double> hmap=new HashMap<String,Double>();
		hmap.put("Gaurav",50000.01);
		hmap.put("Kuldip",62000.02);
		hmap.put("Tandon",20000.03);
		hmap.put("Ashutosh",80000.04);
		
		System.out.println("Display ustomers & Balance Amount ");
		for(String k:hmap.keySet())
		{
			System.out.println(k+"--->"+hmap.get(k));
		}
		// deposit 11000 to Gaurav's Account
		double bal=hmap.get("Gaurav");
		hmap.put("Gaurav",bal+11000);
		System.out.println("Gaurav's new Balance: "+hmap.get("Gaurav"));
		hmap.putIfAbsent("Gillu",20000.00);
		System.out.println(hmap);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name to get his balance");
		String name=sc.next();
		System.out.println("the balance of "+name+" is: "+hmap.get(name));

		

	}

}
