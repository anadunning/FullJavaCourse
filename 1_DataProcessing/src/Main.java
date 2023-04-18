import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int x, y;
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("======================================================");
		
		Scanner sc = new Scanner(System.in);
		
		String z;
		System.out.println("Enter a string:");
		z = sc.next();		// next() -> reads only one word without spaces
		
		byte t;
		System.out.println("Enter a byte (integer):");
		t = sc.nextByte();	// -128 to 127
		
		int a;
		System.out.println("Enter an int:");
		a = sc.nextInt();	// -2147483648 to 2147483647
		
		long b;
		System.out.println("Enter a long:");
		b = sc.nextLong();	// -9,223,372,036,854,770,000 to 9223372036854770000
		
		short c;
		System.out.println("Enter a short:");
		c = sc.nextShort();	// -32768 to 32767
		
		double d;
		System.out.println("Enter a double:");
		d = sc.nextDouble();
		
		float f;
		System.out.println("Enter a float:");
		f = sc.nextFloat();
		
		char ch;
		System.out.println("Enter a char:");
		ch = sc.next().charAt(0);
		
		System.out.println(z);
		System.out.println("=============== Primite types: Integers ================");
		System.out.println("Byte: " + t);
		System.out.println("Int: " + a);
		System.out.println("Long: " + b);
		System.out.println("Short: " + c);
		System.out.println("=============== Primite types: Decimals =================");
		System.out.println("Double: " + d);
		System.out.println("Float: " + f);
		System.out.println("=============== Primite types: Char =================");
		System.out.println("Char: " + ch);
		
		System.out.println("=============== How to clear the reading buffer =================");
		int g;
		String s1, s2, s3;
		System.out.println("Enter an int:");
		g = sc.nextInt();
		
		System.out.println("Now, enter three strings. You can enter more than one word now:");
		sc.nextLine();	// You need to enter this extra nextLine to consume the line break.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Data entered:");
		System.out.println(g);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);	
		
		sc.close();
	}
}