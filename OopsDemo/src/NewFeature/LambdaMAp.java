package NewFeature;

import java.util.HashMap;
import java.util.Map;

//Using LAmda expression to iterate in Map

public class LambdaMAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> books=new HashMap<>();
		books.put("Lat us C","Yaswant Kantekar");
		books.put("OOPS using Java","SImon Kendal");
		books.put("JAVA","David Etheridge");
		books.forEach((key,value)-> System.out.println("Book name: "+key +" -Author: "+ value));

	}

}
