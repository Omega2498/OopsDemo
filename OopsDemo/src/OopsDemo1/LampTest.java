package OopsDemo1;
class Lamp
{
	// stores the value for light
	  // true if light is on
	  // false if light is off
	  boolean isOn;
	  
	  // Method to turn on the Light
	  void turnOn()
	  {
		  isOn=true;
		  System.out.println("Light On? "+ isOn);
	  }
	  // Method to turn off the Light
	  void turnOff()
	  {
		  isOn=false;
		  System.out.println("Light On? "+ isOn);
	  }
}

public class LampTest {

	public static void main(String[] args) {
		// Create Object Led and Halogen
		Lamp Led=new Lamp();
		Lamp Halogen=new Lamp();
		//Switch on Led and Halogen
		Led.turnOn();
		Halogen.turnOn();
		//Switch off Led and Halogen
		Led.turnOff();
		Halogen.turnOff();
		
		

	}

}
