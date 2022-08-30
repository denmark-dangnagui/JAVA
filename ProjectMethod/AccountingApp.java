
public class AccountingApp {
	//공급가  전역변수는 이렇게 쓰는것!
	public static double valueOfSupply = 10000.0;
			
	//부가가치
	public static double vatRate = 0.1;
	
	public static double getvat() {
		return valueOfSupply * vatRate;
	}
	public static double gettotal() {
		return valueOfSupply + getvat();
	}
	
	public static void main(String[] args) {		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getvat());
		System.out.println("Total : " + gettotal());
	}

}
