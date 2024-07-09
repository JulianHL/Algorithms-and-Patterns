package lambdaExpression;

import java.util.*;
import java.util.function.Consumer;

public class TestLambdaExpressionConsumerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numberlist = new ArrayList<>();
		
		numberlist.add(10);
		numberlist.add(15);
		numberlist.add(5);
		numberlist.add(-9);
		numberlist.add(3);
		
		System.out.println("Invok simple method");
		Consumer<Integer> methodToDouble = (n) -> {System.out.println(n*2);};
		numberlist.forEach(methodToDouble);
		
		System.out.println("Invok complex method");
		Consumer<Integer> fullMethod = (n) -> 
		{
			int x = 2;
			System.out.println(n*2 + x);
		};
		numberlist.forEach(fullMethod);
		
		System.out.println("Invok complex method providing cleaner code");
		fullMethod = (n) -> invokeFullMethod(n);
		numberlist.forEach(fullMethod);
		fullMethod.accept(10);
		
	}
	
	private static void invokeFullMethod(int num) {
		// TODO Auto-generated method stub
		int x = 2;
		double y = x-6;
		System.out.println(num*2 + x *y);
	}
	

}
