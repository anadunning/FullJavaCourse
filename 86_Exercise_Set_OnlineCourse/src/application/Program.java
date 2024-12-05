package application;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Set<Student> courseA = new HashSet<>(); // sets of students
		Set<Student> courseB = new HashSet<>();
		Set<Student> courseC = new HashSet<>();

		System.out.print("How many students for course A ? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			courseA.add(new Student(number));
		}

		System.out.print("How many students for course B ? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			courseB.add(new Student(number));
		}

		System.out.print("How many students for course C ? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			courseC.add(new Student(number));
		}

		Set<Student> total = new HashSet<>(courseA);
		total.addAll(courseB);
		total.addAll(courseC);

		System.out.println("Total students: " + total.size());

		sc.close();
	}
}
