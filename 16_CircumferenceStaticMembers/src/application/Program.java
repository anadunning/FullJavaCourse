package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius value: ");
		double radius = sc.nextDouble();
		
		double circ = circumference(radius);
		
		double vol = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circ);
		System.out.printf("Volume: %.2f%n", vol);
		System.out.printf("PI value: %.2f%n", PI);		
		
		sc.close();
	}
	
	// Those methods declared below must be static. If we remove the static word, the compiler will not work.
	// This happens because we cannot call a non-static method inside the static main method, when the method is from
	// the same class as in here.
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
