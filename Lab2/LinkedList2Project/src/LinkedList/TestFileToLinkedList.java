package LinkedList;
import java.util.Scanner;
import java.io.*;

public class TestFileToLinkedList {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// read file
		Scanner inFile = new Scanner(new FileReader("divide.in"));
		
		LinkedListNode headNode, currentNode, newNode;
		
		//create a use-defined linked list
		newNode = new LinkedListNode(new Divide(inFile.nextDouble(), inFile.nextDouble()));
		headNode= newNode;
		currentNode = newNode;
		//traverse linked list
		while(inFile.hasNext()) {
			
		
			newNode = new LinkedListNode(new Divide(inFile.nextDouble(),inFile.nextDouble()));
			currentNode.setLink(newNode);
			currentNode = newNode;
			
			
		}
		// close scanner
				inFile.close();
		
		
		//traverse linked list
		currentNode = headNode;
		while(currentNode!=null) {
			
			System.out.println("X = "+currentNode.getInfo().getX()+" Y = "+currentNode.getInfo().getY()+" Division = "+currentNode.getInfo().division());
			currentNode = currentNode.getLink();
			
			
		}
		
		
		
		
		

	}
	

}
