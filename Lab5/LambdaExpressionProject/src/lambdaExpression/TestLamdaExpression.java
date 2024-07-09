package lambdaExpression;

import java.util.*;

public class TestLamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> myFruitSet = new HashSet<>();
		
		myFruitSet.add("pear");
		myFruitSet.add("apple");
		myFruitSet.add("strawberry");
		myFruitSet.add("banana");

		
		myFruitSet.forEach((fruit)->System.out.println(fruit));
		
		for(String fruit : myFruitSet) {
			System.out.println(fruit);
		}
		
		myFruitSet.forEach((fruit)->System.out.println(fruit));
		
		myFruitSet.forEach(System.out::println);
		
	}

}
