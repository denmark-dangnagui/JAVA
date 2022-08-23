import 	org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class Ok_JavaGoinHome {
	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
	
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting halllamp = new Lighting(id + "/ Hall Lamp");
		halllamp.on();
		
		Lighting floorlamp = new Lighting(id + "/ Floor Lamp");
		floorlamp.on();
		
	}
}
