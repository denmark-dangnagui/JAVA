class Accounting{
	public double valueOfSupply;
	public double vatrate;
	public double expenseRate;
	
	static void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT() );
		System.out.println("Total : " + getTotal() );
		System.out.println("Expense : " + getTotal() );
		System.out.println("Income : " + getIncome() );
		System.out.println("Dividend 1 : " + getDividend1() );
		System.out.println("Dividend 2 : " + getDividend2() );
		System.out.println("Dividend 3 : " + getDividend3() );
	}
	private double getDividend1() {
		return getIncome() * 0.5;
	}
	private double getDividend2() {
		return getIncome() * 0.5;
	}
	private double getDividend3() {
		return getIncome() * 0.5;
	}

	private double getIncome() {
		return valueOfSupply - getExpense();
	}

	private double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private double getTotal() {
		return valueOfSupply + getVAT();
	}

	private double getVAT() {
		return valueOfSupply * vatrate;
	}
}
public class AccountingInstanceApp {
	

	public static void main(String[] args) {
		
//		Accounting.valueOfSupply =10000.0;
//		Accounting.vatrate = 0.1;
//		Accounting.expenseRate = 0.3;
//		Accounting.print();
		
		
		// instance
		
		
		
	}



	

}