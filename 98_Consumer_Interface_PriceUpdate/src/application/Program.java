package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double factor = 1.1;
		
//		Implementing using the Consumer Interface
//		list.forEach(new PriceUpdate());
//		list.forEach(System.out::println);
		
//		Static Method Reference: ClassName::staticMethodName
//		list.forEach(Product::staticPriceUpdate);
//		list.forEach(System.out::println);
		
//		Non-Static Method Reference: ClassName::staticMethodName
//		list.forEach(Product::nonStaticPriceUpdate);
//		list.forEach(System.out::println);
		
//		Declared lambda expression
//		Consumer<Product> cons = p -> {
//			p.setPrice(p.getPrice() * factor);
//		};
//		list.forEach(cons);
//		list.forEach(System.out::println);
		
//		Inline lambda expression
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		list.forEach(System.out::println);
	}
}
