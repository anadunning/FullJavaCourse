import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int sum = 0;
		
		while (i != 0) {
			sum += i;
			
			i = sc.nextInt();
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}