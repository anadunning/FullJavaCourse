package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("LOAN:");
		System.out.print("Value: ");
		double amount = sc.nextDouble();
		System.out.print("Number of months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);		
		
		System.out.printf("Full payment after %d months: ", months);
		System.out.println(String.format("%.2f", payment));
	}
}