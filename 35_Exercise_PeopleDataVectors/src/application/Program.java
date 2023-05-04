package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will be entered? ");
		int n = sc.nextInt();
		People[] p = new People[n];
		
		for (int i = 0; i < p.length; i++) {
			System.out.printf("Height from person %d: ", i + 1);
			double height = sc.nextDouble();
			System.out.printf("Gender from person %d: ", i + 1);
			char gender = sc.next().charAt(0);
			p[i] = new People(height, gender);
		}
		
		double smallestHeight = 1000.0;
		double greatestHeight = 0.0;
		double sum = 0.0;
		int genderF = 0;
		int genderM = 0;
		
		for (int i = 0; i < p.length; i++) {
			if (p[i].getHeight() < smallestHeight) {
				smallestHeight = p[i].getHeight();
			}
			
			if (p[i].getHeight() > greatestHeight) {
				greatestHeight = p[i].getHeight();
			}
			
			if (p[i].getGender() == 'F') {
				genderF++;
				sum += p[i].getHeight();
			}
			
			if (p[i].getGender() == 'M') {
				genderM++;
			}
		}
		
		System.out.printf("\nSmallest height = %.2f%n", smallestHeight);
		System.out.printf("Greatest height = %.2f%n", greatestHeight);
		System.out.printf("Average of women's height: %.2f%n", sum / genderF);
		System.out.printf("Number of men = %d", genderM);
		
		sc.close();
	}
}
