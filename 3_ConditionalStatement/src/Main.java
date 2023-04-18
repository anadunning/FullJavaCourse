import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Example:
		/* A phone company charges $ 50.00 for a basic plan which gives a 100 minutes allowance.
		 * Each exceeding minute costs $ 2.00. Write a program to read the quantity of minutes
		 * which were consumed by the person and show how much should be paid.		  
		 */
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		int minutes;
		double bill = 50.00;
		
		minutes = sc.nextInt();
		
		if (minutes > 100) {
			bill += (minutes - 100) * 2.00;
		}
		
		System.out.printf("Amount to pay: $ %.2f%n", bill);
		
		sc.close();
	}
}
