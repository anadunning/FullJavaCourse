package application;

import java.util.Arrays;

public class Program {
	
	public static int globalValue = 3;
	
	// The function down here is not an example of a referencially transparent one.
	// It depends on the external value of the globalValue static variable.
	public static void main(String[] args) {
		
		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));		
	}
	
	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
}
