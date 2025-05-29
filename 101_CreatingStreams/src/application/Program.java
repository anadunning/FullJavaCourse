package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		// Stream below is created from the list calling the stream() method
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		
		// Creating a stream applying map which applies a function to each element of the stream
		Stream<Integer> st2 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st2.toArray()));
		
		// Creating a stream using Stream.of
		Stream<String> st3 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st3.toArray()));
		
		
		Stream<Integer> st4 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
		Stream<Long> st5 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st5.limit(20).toArray()));
	}
}
