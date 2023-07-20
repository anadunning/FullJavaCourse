package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char option = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Annual income: ");
			double income = sc.nextDouble();
			
			if (option == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, income, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new Company(name, income, numberEmployees));
			}
		}
		
		System.out.println();
		double sumTaxes = 0.00;
		System.out.println("TAXES PAID:");
		
		for (TaxPayer payer : list) {
			
			double tax = payer.tax();			
			System.out.println(payer.getName() + ": $ " + String.format("%.2f", tax));
			sumTaxes += tax;
		}
				
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sumTaxes));
		
		sc.close();
	}
}
