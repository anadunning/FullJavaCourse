package entities;

// Constructor overloading: three constructors in the class to allow initializing an object in different ways.

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	// Standard constructor
	public Product() {
	}
	
	// Customised constructor with all attributes
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Customised constructor with two attributes, quantity will start as zero
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());		
	}
}