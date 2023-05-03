package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holderName = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		
		
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, holderName, initialDeposit);
		}
		else {
			account = new Account(accountNumber, holderName);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.print("\nEnter a deposit value: ");
		double value = sc.nextDouble();
		account.makeDeposit(value);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.print("\nEnter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}
}
