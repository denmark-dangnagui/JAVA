class print{
	public String delimiter;
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	public static void c(String delimeter) {
		System.out.println(delimeter);
		System.out.println("c");
		System.out.println("c");		
	}
	
}

//method 가 instance 소속일 때는 static을 빼줘야 한다. 그런데 method가 class 소속일 때는 static을 써줘야 한다.


public class StaticMethod {

	public static void main(String[] args) {
//		print.a("-");
//		print.b("-");
		
		//instance
		print t1 = new print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
		print.c("$");
		
//		print.a("*");
//		print.b("*");
		
		print t2 = new print();
		t2.delimiter = "-";
		t2.a();
		t2.b();
		
		
	}

}
