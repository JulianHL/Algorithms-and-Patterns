package lambdaExpression;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
		
		System.out.println("Using forEach to print all the elements of the set:\n");
		mySet.forEach(System.out::println);
		
		System.out.println("\n\nUsing stream to print all the elements of the set in sorted order:\n");
		mySet.stream().sorted().forEach(System.out::println);
		
		System.out.println("\n\nUsing stream to print all the elements of the set in reverse sorted order:\n");
		mySet.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("\n\nUsing stream to print all the elements of the set with length greater than 5:\n");
		mySet.stream().filter((string) -> string.length() > 5).forEach(System.out::println);
		
		System.out.println("\n\nUsing stream to check if any element in the set is equal to banana:\n");
		System.out.println(mySet.stream().anyMatch(element -> element.equalsIgnoreCase("banana"))?"Element Exists":"Element doesn't exist");
		
		System.out.println("\n\nUsing stream to check if any element in the set starts with St:\n");	
		System.out.println(mySet.stream().anyMatch(element -> element.startsWith("st"))?"Element Exists":"Element doesn't exist");

		System.out.println("\n\nUsing stream to check if any element in the set doesn't start with St:\n");
		System.out.println(mySet.stream().noneMatch(element -> element.startsWith("st"))?"Element doesn't exist":"Element Exists");
		
		System.out.println("\n\nUsing stream to print all the elements of the set in uppercase:\n");
		List<String> mySetUpperCase = mySet.stream().map(String::toUpperCase).collect(Collectors.toList());
		mySetUpperCase.forEach(System.out::println);
		
		Predicate<String> p1 = string -> string.contains("banana") || string.startsWith("st");
		
		System.out.println("\n\nUsing stream to check if any element in the set contains banana or starts with st:\n");
		System.out.println(mySet.stream().anyMatch(p1)?"Element Exists":"Element doesn't exist");
		


	}

}
