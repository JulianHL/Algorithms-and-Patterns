package lambdaExpression;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class TestStreamStringProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> mySet = new HashSet<>();
		mySet.add("pear");
		mySet.add("apple");
		mySet.add("strawberry");
		mySet.add("banana");
		mySet.add("orange");
		mySet.add("blackberry");
		
		System.out.println("Using forEach to print all the elements of the set");
		mySet.forEach(System.out::println);
		
		System.out.println("\n");
		mySet.stream().sorted().forEach(System.out::println);
		
		System.out.println("\n");
		mySet.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		



		


	}

}
