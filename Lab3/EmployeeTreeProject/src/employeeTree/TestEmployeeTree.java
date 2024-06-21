package employeeTree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestEmployeeTree {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("Employee.in"));
		BinaryTreeClass employeeTree = new BinaryTreeClass();
		
		while(inFile.hasNext()) {
			employeeTree.put(new Employee(inFile.nextInt(), inFile.next()+" "+inFile.next(), inFile.nextDouble()));
		}
		
		employeeTree.inOrderTraversal();
		
	}

}
