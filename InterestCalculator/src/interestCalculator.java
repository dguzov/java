import java.text.NumberFormat;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class interestCalculator {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Interest Calculator!");

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			BigDecimal loanAmount = new BigDecimal("100.005");
			BigDecimal interestRate = new BigDecimal(".01");
			BigDecimal interest = new BigDecimal("100.005");

			// prompt for user logic

			System.out.print("Enter loan amount: ");
			loanAmount = sc.nextBigDecimal();

			System.out.print("Enter interest rate: ");
			interestRate = sc.nextBigDecimal();

			// business logic
			interest = loanAmount.multiply(interestRate).setScale(2, RoundingMode.HALF_UP);

			// format and display the results

			NumberFormat currency = NumberFormat.getCurrencyInstance();

			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);

			System.out.println();
			System.out.println("Loan amount:     " + currency.format(loanAmount));
			System.out.println("Interest rate:   " + percent.format(interestRate));
			System.out.println("Interest:        " + currency.format(interest));

			System.out.println("Continue? (y/n) ");
			choice = sc.next();
		}
		// bye
		System.out.println("Bye!");

	}

}
