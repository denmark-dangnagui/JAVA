
public class AccountingAppIF {

	public static void main(String[] args) {
		
		// string을 double로 바꾸는 문법 -> Double.parsedouble(string);
		double valueOfSupply =Double.parseDouble(args[0]);
		double VATrate = 0.1;
		double expenseRate = 0.3;
		double VAT = valueOfSupply * VATrate;
		double Total = valueOfSupply + VAT;
		double Expense = valueOfSupply * expenseRate;
		double Income = valueOfSupply - Expense;
		
		double dividend1;
		double dividend2;
		double dividend3;
		
		
		if(Income > 10000.0) {
			 dividend1 = Income *0.5;
			 dividend2 = Income *0.3;
			 dividend3 = Income *0.2;
		}
		else {
			 dividend1 = Income *1;
			 dividend2 = Income *0;
			 dividend3 = Income *0;
					
		}
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + VAT );
		System.out.println("Total : " + Total );
		System.out.println("Expense : " + Expense );
		System.out.println("Income : " + Income );
		System.out.println("Dividend 1 : " + dividend1 );
		System.out.println("Dividend 2 : " + dividend2 );
		System.out.println("Dividend 3 : " + dividend3 );
		
		
	}

}