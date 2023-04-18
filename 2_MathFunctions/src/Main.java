
public class Main {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double d = 72.3;
		double e = 0.34;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("====================Math.sqrt()=====================");
		System.out.println("The square root of " + x + " = " + A);
		System.out.println("The square root of " + y + " = " + B);
		System.out.println("The square root of 25 = " + C);
		
		C = Math.pow(5.0, 2.0);
		
		System.out.println("\n==================== Math.pow()=====================");
		System.out.println(x + " to the power of " + y + " = " + Math.pow(x, y));
		System.out.println(x + " to the 2nd power = " + Math.pow(x, 2.0));
		System.out.println("5.0 to the 2nd power = " + C);
		
		System.out.println("\n==================== Math.abs()=====================");
		
		A = Math.abs(y);
		System.out.println("Absolute value of " + y + " = " + A);
		System.out.println("Absolute value of z = " + Math.abs(z));
		
		System.out.println("\n==== Math.round()====== round off a floating point number to the nearest integer. ======");
		System.out.println(d + " is approximately " + Math.round(d));
		System.out.println(e + " is approximately " + Math.round(e));
		
		System.out.println("\n==== Math.ceil()====== The \"ceiling\" of a number is the smallest integer greater than or equal to the number. ======");
		System.out.println("The ceiling of " + x + " is " + Math.ceil(x));
		System.out.println("The ceiling of " + y + " is " + Math.ceil(y));
		System.out.println("The ceiling of " + d + " is " + Math.ceil(d));
		System.out.println("The ceiling of " + e + " is " + Math.ceil(e));
		
		System.out.println("\n==== Math.floor()====== The \"floor\" of a number is the largest integer less than or equal to the number. ======");
		System.out.println("The floor of " + x + " is " + Math.floor(x));
		System.out.println("The floor of " + y + " is " + Math.floor(y));
		System.out.println("The floor of " + d + " is " + Math.floor(d));
		System.out.println("The floor of " + e + " is " + Math.floor(e));

	}
}
