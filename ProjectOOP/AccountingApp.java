class Accounting{
	public double valueOfSupply;
	
	public Accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
	public static double vatRate = 0.1;
	
	public double getvat() {
		return this.valueOfSupply * vatRate;
	}
	public double gettotal() {
		return this.valueOfSupply + getvat();
	}
}


public class AccountingApp {
	public static void main(String[] args) {		
		
		Accounting a1 = new Accounting(10000.0);
		Accounting a2 = new Accounting(20000.0);
		
		
		System.out.println("Value of supply : " + a1.valueOfSupply);
		System.out.println("Value of supply : " + a2.valueOfSupply);
		
		
		System.out.println("VAT : " + a1.getvat());
		System.out.println("VAT : " + a2.getvat());
		
		
		System.out.println("Total : " + a1.gettotal());
		System.out.println("Total : " + a2.gettotal());
		
		
	}

}
