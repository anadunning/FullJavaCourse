package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people are going to enter? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		int maxAge = 0;
		String oldestPerson = name[0];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Information from person %d:%n", i+ 1);
			System.out.print("Name: ");
			name[i] = sc.next();
			System.out.print("Age: ");
			age[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (age[i] > maxAge) {
				maxAge = age[i];
				oldestPerson = name[i];
			}			
		}
		
		System.out.printf("OLDEST PERSON: %s", oldestPerson);
	
		sc.close();
	}
}
