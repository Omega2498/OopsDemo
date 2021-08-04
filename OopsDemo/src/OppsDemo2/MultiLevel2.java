package OppsDemo2;
class Staff
{
	private int empId;
	private String name;
	protected float salary, hra;
	public Staff(int empId, String name, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	void getHRA() {
		hra=(salary*60)/100;
		System.out.println("HRA is: "+hra); 
	}
	void display() {
		System.out.println(empId+" "+name+" "+salary);

	}
}
//Staff--->manager
class Manager extends Staff
{
	protected float da,grossM;

	public Manager(int empId, String name, float salary) {
		super(empId, name, salary);

	}
	void getDA() {
		da=(salary*80)/100;
		System.out.println("DA is: "+da);
	}
	void getGrossM() {
		grossM=salary+hra+da;
		System.out.println("Gross of Manager is: "+grossM);
	}
	

}
//Staff-->Manager--->Director
class Director extends Manager
{
		private  float ta,grossD;
	

		public Director(int empId, String name, float salary) {
			super(empId, name, salary);
			// TODO Auto-generated constructor stub
		}
		void getTA() {
			ta=(salary*30)/100;
			System.out.println("TA is: "+ta);
			
		}
		void getGrossD() {
			grossD=salary+hra+ta+da;
			System.out.println("Gross of Director is: "+grossD);
		}
		
	}
	

public class MultiLevel2 
{
	public static void main(String[] args) {
		Director d1=new Director(101,"gaurav",26237);
		System.out.println("*****Director Details*****");
		d1.display();//invoke Staff method
		d1.getHRA();//Staff
		d1.getDA();//Manager
		d1.getTA();//Director
		d1.getGrossD();//Director
		
		Manager m1=new Manager(102,"Kuldip",20000);
		System.out.println("*****Manager Details*****");
		m1.display();//invoke Staff method
		m1.getHRA();//Staff
		m1.getDA();//Manager
		m1.getGrossM();//Manager
		
		Staff s1=new Staff(103,"Tandon",15000);
		System.out.println("*****Staff Details*****");
		s1.display();//invoke Staff method
		s1.getHRA();//Staff
	}

}
