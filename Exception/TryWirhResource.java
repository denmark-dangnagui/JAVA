import java.io.FileWriter;
import java.io.IOException;

public class TryWirhResource {

	public static void main(String[] args) {
		try (FileWriter f = new FileWriter("create.txt")){
			f.write("Hi, Im backend-developer");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
