package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Developer> a1=new ArrayList<Developer>();
		Developer d1=new Developer(101,"Gaurav,","Python Developer");
		Developer d2=new Developer(102,"Kuldip,","Dot Net Developer");
		Developer d3=new Developer(103,"Tandon,","Java Developer");
		Developer d4=new Developer(104,"Arvind,","Php Developer");
		Developer d5=new Developer(105,"Gillu,","Angular Developer");
		a1.add(d4);a1.add(d5);a1.add(d1);a1.add(d3);a1.add(d2);
		
		System.out.println("******Unsorted*******");
		for(Developer d:a1)
		{
			System.out.println(d.getId()+" "+d.getName()+" "+d.getDomain());
		}
		// Sort based on Id
		Collections.sort(a1,new IdComparator());
		
		System.out.println("******Sorted by Id*******");
		for(Developer i:a1)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		}
			
			// sort by domain of developer
			Collections.sort(a1, new DomainComparator());
			System.out.println("******Sorted by Domain*******");
			for(Developer i:a1)
			{
				System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
			}
				
	}

}
