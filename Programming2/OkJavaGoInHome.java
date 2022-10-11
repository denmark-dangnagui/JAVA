import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator; 
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJavaGoInHome {

	public static void main(String[] args) {
		
//		String id = JOptionPane.showInputDialog("Enter a APT?");
//		String bright = JOptionPane.showInputDialog("Bright?");
//		double b = Double.parseDouble(bright);
		String id = args[0];
		String bright = args[1];
		double b = Double.parseDouble(bright);
		
		//Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1); 
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		
		// Light on
		Lighting hallLamp = new Lighting(id +" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / Floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
		moodLamp.setBright(b);
		moodLamp.on();

	}

}
