import java.io.FileWriter;
import java.io.IOException;

public class whyMethod {

	
	
	public static void main(String[] args) throws IOException{
					 // 인자,argument
		System.out.println(twotimes("a", "-"));
		FileWriter fW = new FileWriter("out.txt");
		fW.write(twotimes("a", "*"));
		fW.close();
//		Email.send("dlrgks88@naver.com", "two times a", twotimes("a", "&");
	}
	public static String twotimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
		
				
		
	}
									//매개변수, parameter
	public static void printTwoTimes(String text,String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
}
