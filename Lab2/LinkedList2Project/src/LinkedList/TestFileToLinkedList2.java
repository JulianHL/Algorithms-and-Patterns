package LinkedList;

import java.io.*;
import java.util.*;

public class TestFileToLinkedList2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		Scanner inFile = new Scanner(new FileReader("divide.in"));
		
		//create system-difined linked list
		List<Divide> divideLinkedList = new LinkedList<Divide>();
		
		//add elements to linked list
		while(inFile.hasNext()) {
			divideLinkedList.add(new Divide(inFile.nextDouble(), inFile.nextDouble()));
		}
		inFile.close();
		
		//traverse linked list
		divideLinkedList.forEach(element -> System.out.println("x= "+element.getX()+", y="+element.getY()+", division= "+element.division()));
		
		//Find X and Y values
		System.out.print("\n");
		Divide.findX(divideLinkedList);
		Divide.findY(divideLinkedList);
		

	}

}
