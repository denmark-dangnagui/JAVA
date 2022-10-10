public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		
		// string을 double로 바꾸는 문법 -> Double.parsedouble(string);
		double valueOfSupply =Double.parseDouble(args[0]);
		double VATrate = 0.1;
		double expenseRate = 0.3;
		double VAT = valueOfSupply * VATrate;
		double Total = valueOfSupply + VAT;
		double Expense = valueOfSupply * expenseRate;
		double Income = valueOfSupply - Expense;
		
		

		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + VAT );
		System.out.println("Total : " + Total );
		System.out.println("Expense : " + Expense );
		System.out.println("Income : " + Income );
		
		double[] dividendRates = new double [3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend : " + Income * dividendRates[i] );
			i += 1; 
		}
		
	}

}