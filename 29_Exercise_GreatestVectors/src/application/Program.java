package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers are you going to enter? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		double max = vect[0];
		int posMax = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
		}
			
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > max) {
				max = vect[i];
				posMax = i;
			}
		}
		
		System.out.println("\nGREATEST VALUE = " + max);
		System.out.printf("POSTION OF THE GREATEST = %d", posMax);		
		
		sc.close();
	}
}
