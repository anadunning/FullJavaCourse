package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("\nEmployee #%d:%n", i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken. Try again: ");
				id = sc.nextInt();				
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
//			list.add(new Employee(id, name, salary));
		}
		System.out.println("----------------------------");
//		System.out.print("\nEnter the employee id that will have salary increase: ");
//		int id = sc.nextInt();
//		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
//		if (emp == null) {
//			System.out.println("This id does not exist!");
//		}
//		else {
//			System.out.print("Enter the percentage: ");
//			double percentage = sc.nextDouble();
//			emp.increaseSalary(percentage);			
//		}
		System.out.println("----------------------------");
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Integer pos = position(list, id);
		if (pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee employees : list) {
			System.out.println(employees);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
