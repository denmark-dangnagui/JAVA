
class print{
	public String delimiter = "";	
	public print(String _delimiter) {
		delimiter = _delimiter;
	}
	public void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}