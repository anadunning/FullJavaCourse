import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();

		copy(myInts, myObjs);
		printList(myObjs);

		copy(myDoubles, myObjs);
		printList(myObjs);
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

//		List<Integer> intList = new ArrayList<Integer>();
//		intList.add(10);
//		intList.add(5);
//
//		List<? extends Number> list = intList;
//		Number x = list.get(0);

//		list.add(20);	// This comes up with a compilation error due to covariance. We cannot add a value into the list
//		printList(list);

//		List<Object> Objs = new ArrayList<Object>();
//		Objs.add("Maria");
//		Objs.add("Alex");
//
//		List<? super Number> myNums = Objs;
//		myNums.add(10);
//		myNums.add(3.14);

//		Number x = myNums.get(0); // This comes up with a compilation error due to contravariance. We cannot read a value from the list.
//		printList(myNums);
//	}
//	
//	public static void printList(List<?> list) {
//		for (Object obj : list) {
//			System.out.print(obj + " ");
//		}
//		System.out.println();
//		
//	}
}
