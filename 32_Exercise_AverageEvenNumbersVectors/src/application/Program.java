package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elements in the vector? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		double sum = 0.0;
		int qty = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
			
			if (vect[i] % 2 == 0) {
				sum += vect[i];
				qty++;
			}
		}
		
		if (qty > 0) {
			System.out.printf("AVERAGE OF EVEN NUMBERS: %.1f%n", sum/qty);			
		}
		else {
			System.out.printf("NO EVEN NUMBERS");
		}

		sc.close();
	}
}