package lambdaExpression;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestFunctionLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Half references mrthod that returns double
		Function<Integer,Double> half = (n) -> n*0.5;
		
		double ans = half.apply(10);
		System.out.println(ans);
		
		
		Function<Integer,Double> half2 = half.andThen((n) -> n*3);
		
		ans = half2.apply(10);
		System.out.println(ans);
		
		List<Integer> numberlist = new ArrayList<Integer>();
		
		numberlist.add(10);
		numberlist.add(15);
		numberlist.add(5);
		numberlist.add(-9);
		numberlist.add(3);
		
		Consumer<Integer> useHalf = (n) -> System.out.println(n*0.5);
		System.out.println("\nHalf Using Function into ForEach:");
		numberlist.forEach(useHalf);
		
		Consumer<Integer> useHalf2 = useHalf.andThen((n) -> System.out.println(n*3));
		System.out.println("\nHalf Using Function into ForEach:");
		numberlist.forEach(useHalf2); 
		
		
		
		
		
		
		
		
		
		
	}

}
