package lambdaExpression;

import java.util.*;

public class TestStreamNumberProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Double> numberList = new ArrayList<Double>();
		numberList.add(149.99);
		numberList.add(25.0);
		numberList.add(55.99);
		numberList.add(14.99);
		numberList.add(69.99);
		numberList.add(189.99);
		
		System.out.println("Using For Loop to filter numbers greater than 60");
		int count = 0;
		for(Double number : numberList) {
			if(number>60) { 
				System.out.println(number); 
				count++;
			}	
		}

		System.out.println("Number of numbers greater than 60: " + count);
		
		System.out.println("\nUsing Stream to filter numbers greater than 60");
		numberList.stream().filter((number) -> number>60).forEach((number) -> System.out.println(number));
		
		System.out.println("\nUsing Stream to get the maximum number");
		Double max = numberList.stream().max((n1,n2) -> Double.compare(n1, n2)).get();
		System.out.println(max);
		
		System.out.println("\nUsing Stream to get the minimum number");
		Double min = numberList.stream().min((n1,n2) -> Double.compare(n1, n2)).get();
		System.out.println(min);
		
		System.out.println("\nUsing Stream to get the average number");
		Double average = numberList.stream().mapToDouble(number -> number).average().getAsDouble();
		System.out.println(average);
		
		System.out.println("\nUsing Stream to get the inverse sorted list");
		numberList.stream().sorted((n1,n2) -> Double.compare(n2, n1)).forEach((number) -> System.out.println(number));

		


	}

}
