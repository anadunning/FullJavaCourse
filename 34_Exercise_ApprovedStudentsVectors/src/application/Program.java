package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students will be entered? ");
		int n = sc.nextInt();
		String[] name = new String[n];
		double[] firstGrade = new double[n];
		double[] secondGrade = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the name, first and second grade from student %d:%n", i + 1);
			sc.nextLine();
			name[i] = sc.nextLine();
			firstGrade[i] = sc.nextDouble();
			secondGrade[i] = sc.nextDouble();
		}
		
		double avg;
		
		System.out.println("Approved students: ");
		for (int i = 0; i < n; i++) {
			avg = (firstGrade[i] + secondGrade[i]) / 2;
			
			if (avg >= 6.0) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();
	}
}
