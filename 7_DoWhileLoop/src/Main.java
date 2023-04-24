import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.print("Inform the temperature in Celsius: ");
			double tempC = sc.nextDouble();
			double tempF = 9.0 * tempC / 5 + 32.0;
			System.out.printf("Equivalent in Fahrenheit: %.1f%n", tempF);	
			System.out.print("Do you need to read again (y/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
			
		sc.close();
	}
}
