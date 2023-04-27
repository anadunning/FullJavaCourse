package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		
		s1.name = sc.nextLine();
		s1.grade1 = sc.nextDouble();
		s1.grade2 = sc.nextDouble();
		s1.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", s1.finalGrade());
		
		if (s1.finalGrade() > 60.00) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", s1.missingPoints());
		}
		
		sc.close();
	}

}
