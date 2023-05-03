package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will be informed? ");
		
		int n = sc.nextInt();
		Person[] person = new Person[n];
		
		for (int i = 0; i < person.length; i++) {
			System.out.printf("Information from the person %d:%n", i+1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			person[i] = new Person(name, age, height);
		}
		
		double sumHeight = 0.0;
		for (int i = 0; i < person.length; i++) {
			sumHeight += person[i].getHeight();
		}
		
		double avg = sumHeight / n;
		System.out.printf("\nAverage height: %.2f%n", avg);
		
		int person16 = 0;
		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				person16++;
			}
		}
		
		double percMinor16 = 100.0 * person16 / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%n", percMinor16);
		System.out.println();
		
		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}
		}

		sc.close();
	}
}
