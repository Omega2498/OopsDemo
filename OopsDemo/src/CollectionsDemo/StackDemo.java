package CollectionsDemo;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s=new Stack<String>();
		s.push("Gaurav");
		s.push("Tandon");
		s.push("Kuldip");
		s.push("Arvind");
		s.push("Gillu");
		System.out.println("Remove Element:"+s.pop());
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Element on top"+s.peek());
		System.out.println("Search Gaurav: "+s.search("Gaurav"));

	}

}
