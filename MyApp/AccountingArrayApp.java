
public class AccountingArrayApp {

	public static void main(String[] args) {
		
		
		// string을 double로 바꾸는 문법 -> Double.parsedouble(string);
		double valueOfSupply =Double.parseDouble(args[0]);
		double VATrate = 0.1;
		double expenseRate = 0.3;
		double VAT = valueOfSupply * VATrate;
		double Total = valueOfSupply + VAT;
		double Expense = valueOfSupply * expenseRate;
		double Income = valueOfSupply - Expense;
		
		double[] dividendRates = new double [3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = Income *dividendRates[0];
		double dividend2 = Income *dividendRates[1];
		double dividend3 = Income *dividendRates[2];

		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + VAT );
		System.out.println("Total : " + Total );
		System.out.println("Expense : " + Expense );
		System.out.println("Income : " + Income );
		System.out.println("Dividend 1 : " + dividend1 );
		System.out.println("Dividend 2 : " + dividend2 );
		System.out.println("Dividend 3 : " + dividend3 );
		
		
		
		String[] members = {"이태민", "호날두" , "박지성"};
		for(String e : members) {
			System.out.println(e + "이 상담을 받았습니다.");
		}
		
		
	}

}