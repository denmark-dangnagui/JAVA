import org.opentutorials.iot.Elevator; 
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJavaGoInHomeinput {

	public static void main(String[] args) {
		
		//Elevator call
		Elevator myElevator = new Elevator("java APT 507");
		myElevator.callForUp(1); 
		
		// Security off
		Security mySecurity = new Security("java APT 507");
		mySecurity.off();
		
		
		// Light on
		Lighting hallLamp = new Lighting("java APT 507 / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting("java APT 507 / Floor Lamp");
		floorLamp.on();
		
	}

}
