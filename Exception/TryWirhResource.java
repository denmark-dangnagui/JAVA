import java.io.FileWriter;
import java.io.IOException;

public class TryWirhResource {

	public static void main(String[] args) {
		try (FileWriter f = new FileWriter("data.txt")){		
			f.write("roanlado");		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
