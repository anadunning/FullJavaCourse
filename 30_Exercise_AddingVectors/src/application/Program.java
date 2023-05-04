package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elements in each vector? ");
		int n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
		
		System.out.println("Enter the values from vector A:");
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Enter the values from vector B:");
		for (int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("VECTOR C = RESULT FROM A + B:");
		for (int i = 0; i < vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
			
		sc.close();
	}
}
