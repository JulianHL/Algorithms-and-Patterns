package stackFileProcess;

import java.io.*;
import java.util.*;

public class TestStackFileProcess {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("Divide.in"));
		
		LinkedStack stack = new LinkedStack();
		
		while(inFile.hasNext()) {
			stack.push(new Divide(inFile.nextDouble(),inFile.nextDouble()));
		}
		
		stack.print();
		
		System.out.println("The size of the stack is: "+stack.stackSize);
		
		inFile.close();
		

	}

}
