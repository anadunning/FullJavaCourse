import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		// HashSet is the fastest implementation, but it doesn't guarantee the order.
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
