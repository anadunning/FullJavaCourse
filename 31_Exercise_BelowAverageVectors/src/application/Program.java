package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elements in the vector? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double avg = sum / vect.length;
		System.out.printf("\nAVERAGE FROM THE VECTOR = %.3f%n", avg);
		
		System.out.println("ELEMENTS BELOW AVERAGE: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < avg) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();
	}
}
