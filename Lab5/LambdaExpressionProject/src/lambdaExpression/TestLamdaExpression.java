package lambdaExpression;

import java.util.*;

public class TestLamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);

		System.out.println("Printing array using Enhanced For Loop");
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("\nPrinting array using Lambda Expression");
		numbers.forEach((fruit)->System.out.println(fruit));
		
		System.out.println("\nPrinting array using method reference");
		numbers.forEach(System.out::println);
		
	}

}
