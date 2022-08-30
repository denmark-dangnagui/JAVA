
class print{
	public String delimiter = "";	
	public print(String delimiter) {
		this.delimiter = delimiter;
	}
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}

// this는 클래스가 인스턴스화 되었을 때 instance 자체를 가리키는 특수한 단어이다. 
