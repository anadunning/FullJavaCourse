package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
//import java.util.function.Predicate;

import entities.Product;
//import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
//		Using a lambda expression:
//		list.removeIf(p -> p.getPrice() >= 100);
		
//		Using the Predicate Interface
//		list.removeIf(new ProductPredicate());
		
//		Static Method Reference: ClassName::staticMethodName
//		list.removeIf(Product::staticProductPredicate);
		
//		Non-Static Method Reference: ClassName::staticMethodName
//		list.removeIf(Product::nonStaticProductPredicate);
		
		double min = 100.0;
		
//		Declared lambda expression
//		Predicate<Product> pred = p -> p.getPrice() >= min;
//		list.removeIf(pred);
		
//		Inline lambda expression
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
