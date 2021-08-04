package OppsDemo2;
class Honda extends Car{
	public void hondaStart()
	{
		Engine heng=new Engine();//Composition
		heng.startEngine();
	}
}

public class CompositionDemo {

	public static void main(String[] args) {
		Honda hondacity=new Honda();
		hondacity.setColour("White");
		hondacity.setMax_speed(200);
		System.out.println("*****Honda Car Details*****");
		System.out.println(hondacity.getColour()+"Colour");
		System.out.println(hondacity.getMax_speed()+"speed");
		hondacity.hondaStart();
		
		

	}

}
