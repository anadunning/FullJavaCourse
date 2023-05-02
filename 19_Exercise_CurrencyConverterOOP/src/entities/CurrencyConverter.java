package entities;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double currencyConverter(double dollar, double qtyDollars) {
		return (dollar * qtyDollars) * (IOF +  1.0);
	}
}
