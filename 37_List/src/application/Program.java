package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Arnaldo");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Joao");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("------------------------------------");
		list.remove("Marco");
		list.remove(3);		// Removes the element on the position 1
		
		// Removing elements from the list which satisfy a particular predicate filter
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("------------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("------------------------------------");
		
		// Filtering the list to keep only the names which start with certain condition
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String obj : result) {
			System.out.println(obj);
		}
		System.out.println("------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'V').findFirst().orElse(null);
		System.out.println(name);
	}
}
