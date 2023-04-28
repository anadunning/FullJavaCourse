package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		System.out.print("Enter the radius value: ");
		double radius = sc.nextDouble();
		
		double circ = calc.circumference(radius);
		
		double vol = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circ);
		System.out.printf("Volume: %.2f%n", vol);
		System.out.printf("PI value: %.2f%n", calc.PI);		
		
		sc.close();
	}
}
