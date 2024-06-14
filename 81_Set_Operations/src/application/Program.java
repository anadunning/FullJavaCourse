package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Mic");
		set.add("Computer");
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		set.remove("Tablet");
		set.removeIf(x -> x.length() >= 4);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
