
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class interestCalculator {

	public static void main(String[] args) {
	//welcome
		System.out.println("Welcome the Interest Calculator App!");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
		
		//prompt input
		System.out.println("Enter loan amount: ");		
		String loanAmtStr = sc.next();
		BigDecimal loanAmt = new BigDecimal(loanAmtStr);
		loanAmt = loanAmt.setScale(2, RoundingMode.HALF_UP);
		
		System.out.println("Enter interest rate: ");
		String intRateStr = sc.next();
		BigDecimal intRate = new BigDecimal(intRateStr);
		
		//biz logic
					BigDecimal intAmt = loanAmt.multiply(intRate);
		
		//display results
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
				cf.setRoundingMode(RoundingMode.HALF_UP);
		NumberFormat pf = NumberFormat.getPercentInstance();
		pf.setMaximumFractionDigits(3);
		pf.setMinimumFractionDigits(3);
		
		System.out.println("Loan amount:       		    "+cf.format(loanAmt));
		System.out.println("Interest rate:              "+pf.format(intRateStr));
		System.out.println("Interest:                   "+cf.format(intAmt));
		
		
		System.out.println("Continue(y/n?   ");
		choice = sc.next();
		
		}
		
		System.out.println("Bye!");
	}

}
