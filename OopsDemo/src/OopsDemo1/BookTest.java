package OopsDemo1;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		b1.setBookid(101);
		b1.setBookname("programming 101");
		b1.setPublisher("Gaurav Publishing House");
		b1.setPrice(500);
		System.out.println(b1.getBookid()+" "+b1.getBookname()+" "+b1.getPrice()+" "+b1.getPublisher());
		System.out.println(b1);
	}

}
