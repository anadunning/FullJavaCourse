package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] height = new double[n];	// Declaring a vector
		
		for (int i = 0; i < n; i++) {
			height[i] = sc.nextDouble();
		}
		
		double sum = 0.00;
		for (int i = 0; i < n; i++) {
			sum += height[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT = %.2f%n", avg);
		
		sc.close();
	}
}
