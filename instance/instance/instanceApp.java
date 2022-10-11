package instance;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class instanceApp {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter p1 = new PrintWriter("result.txt");
		p1.write("HEllo 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("HEllo 2");
		p2.close();
				
	}

}
