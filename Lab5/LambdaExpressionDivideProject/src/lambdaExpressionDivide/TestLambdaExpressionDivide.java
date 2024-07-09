package lambdaExpressionDivide;

import java.io.*;
import java.util.*;
import java.util.function.*;

public class TestLambdaExpressionDivide {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner inFile = new Scanner(new FileReader("Divide.in"));
		Set <Divide> setDivide = new HashSet<Divide>();
		
		while (inFile.hasNext()) {
			setDivide.add(new Divide(inFile.nextDouble(), inFile.nextDouble()));
		}
		inFile.close();
		
		//Printing the elements of the set using lambda expression
		System.out.println("Printing the elements of the set using lambda expression: ");
		setDivide.forEach(element -> System.out.println(element));
		
		//Printing the elements of the set using method reference
		System.out.println("\nPrinting the elements of the set using method reference expression: ");
		setDivide.forEach(System.out::println);
		
		System.out.println("\nPrinting the divMethod for eachelement of the set using  Consumer interface: ");
		Consumer <Divide> divMethod = element -> System.out.println(element + " = " +element.getX()/element.getY());
		setDivide.forEach(divMethod);
		
		System.out.println("\nPrinting the divMethod2 for each element of the set using  Consumer interface: ");
		Consumer <Divide> divMethod2 = Divide::division;
		setDivide.forEach(divMethod2);
		
		System.out.println("\nPrinting the divMethod3 for each element of the set using  Function interface: ");
		Function <Divide, Double> divMethod3 = element  -> {double n = element.getX()+element.getY(); 
															return (n*3)/(n-2);};
		setDivide.forEach(element -> System.out.println(element+" = "+divMethod3.apply(element)));
		
		System.out.println("\nPrinting the calculateDivision method for each element of the set using  Consumer interface: ");
		setDivide.forEach(element -> System.out.println(element+" = "+element.calculateDivision()));
		
		System.out.println("\nPrinting elements where the calculateDivision method is greater than 20: ");
		setDivide.stream().filter(element -> element.calculateDivision()>20).forEach(element -> System.out.println(element+" = "+element.calculateDivision()));
		
		System.out.println("\nPrinting elements in ascending order of x: ");
		setDivide.stream().sorted(Comparator.comparing(Divide::getX)).forEach(System.out::println);
		
		System.out.println("\nPrinting elements in ascending order of y: ");
		setDivide.stream().sorted((element1, element2) -> Double.compare(element1.getY(), element2.getY())).forEach(System.out::println);
		
		System.out.println("\nPrinting elements in ascending order of calculateDivision: ");
		setDivide.stream().sorted(Comparator.comparing(Divide::calculateDivision)  ).forEach(element -> System.out.println(element+" = "+element.calculateDivision()));
		
		System.out.println("\nPrinting maximum element with respect to calculateDivision: ");
		Divide max = setDivide.stream().max((element1, element2) -> Double.compare(element1.calculateDivision(), element2.calculateDivision())).get();
		System.out.println(max+" = "+max.calculateDivision());
		
		System.out.println("\nPrinting minimum element with respect to calculateDivision: ");
		Divide min = setDivide.stream().min((element1, element2) -> Double.compare(element1.calculateDivision(), element2.calculateDivision())).get();
		System.out.println(min+" = "+min.calculateDivision());
		
	}
	


}
