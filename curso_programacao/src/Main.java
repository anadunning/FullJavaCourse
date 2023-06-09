import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Hello World! ");  	// print()
		System.out.println("Good morning!"); 	// println() - prints and move the cursor to the next line
		
		int y = 32;
		double x = 10.35784;
		String name = "Maria";
		int age = 31;
		double salary = 4000.0;
		
		
		System.out.println(y);
		System.out.println(x);
												// printf() - prints formatted output
		System.out.printf("%.2f%n", x);			// %.2f - prints the x variable with two decimals
		System.out.printf("%.4f%n", x);			//  %n or \n - move to next line
												// %.4f - prints the x variable with four decimals
		Locale.setDefault(Locale.UK);			// Locale - set a region to change the printing format 
		System.out.printf("%.4f\n", x);
		
		System.out.println("RESULT: " + x + " METERS");
		System.out.printf("RESULT = %.2f meters%n", x);
		
		System.out.printf("%s is %d and earns R$ %.2f reais%n", name, age, salary);
		
	}

}
