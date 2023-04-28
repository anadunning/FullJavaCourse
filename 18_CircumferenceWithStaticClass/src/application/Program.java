package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius value: ");
		double radius = sc.nextDouble();
		
		double circ = Calculator.circumference(radius);
		
		double vol = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circ);
		System.out.printf("Volume: %.2f%n", vol);
		System.out.printf("PI value: %.2f%n", Calculator.PI);		
		
		// This time we are using the class itself as all the methods and constant are static.
		// The constant and all methods are static because they don't change depending on the object.
		// Calculator is the class.
		
		sc.close();
	}
}
