package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		// Account variables are from a generic type, however, they are pointing to different types
		// of specific objects, which will have different behaviours according to each type.
		
		// Account and SavingsAccount calculate the withdraw in a different way.

	}
}
