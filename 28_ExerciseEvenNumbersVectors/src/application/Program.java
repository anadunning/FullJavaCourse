package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers are you going to enter? ");		
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
		}
		
		int sumEven = 0;
		
		System.out.println("\nEVEN NUMBERS:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				sumEven++;  
			}
		}
		
		System.out.println("\n");
		System.out.printf("QUANTITY OF EVEN NUMBERS = %d", sumEven);
		
		sc.close();
	}
}
