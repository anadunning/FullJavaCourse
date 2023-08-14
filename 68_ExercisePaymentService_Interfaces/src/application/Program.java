package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Inform the contract data: ");
		System.out.print("Contract number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt); 
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		System.out.print("Inform the number of installments: ");
		int n = sc.nextInt();
		
		Contract contract = new Contract(number, date, totalValue);
		
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, n);
				
		System.out.println("\nInstallments: ");
				
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}

}
