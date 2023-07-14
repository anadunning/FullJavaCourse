package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("New, used or imported (n/u/i)? ");
			char option = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (option == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product prod = new ImportedProduct(name, price, customsFee);
				list.add(prod);
			}
			else if (option == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, manufactureDate));
			}
			else {
				list.add(new Product(name, price));
			}
		}
		
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
