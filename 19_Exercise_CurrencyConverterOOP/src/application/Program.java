package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar exchange rate to the real? ");
		double dollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double qtyDollars = sc.nextDouble();
		
		double reais = CurrencyConverter.currencyConverter(dollar, qtyDollars);
		System.out.printf("Amount to be paid in reais = %.2f", reais);
			
		sc.close();
	}
}
