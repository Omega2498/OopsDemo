package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(12,"gaurav");
		hmap.put(24,"kuldip");
		hmap.put(32,"tandon");
		hmap.put(74,"gillu");
		hmap.put(69,"arvind");
		
		// Display content using Iterator
        Set s=hmap.entrySet(); // return values from hmap
        Set s1=hmap.keySet();
        System.out.println(s);
       
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry mentry=(Map.Entry) itr.next();
            System.out.println(mentry.getKey()+"-->"+mentry.getValue());
        }
       
        System.out.println("*******************Key set**********");
        Iterator itr1=s1.iterator();
        while(itr1.hasNext())
        {
            Integer key=(Integer) itr1.next();
            String value=hmap.get(key);
            System.out.println(key+"---->"+value);
        }
	}


}
