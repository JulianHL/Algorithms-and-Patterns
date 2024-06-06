package LinkedList;

import java.util.Scanner;

public class TestLinkedList2 {

	public static void main(String[] args) {
		
		//PROCESS TO LOAD THE INFORMATION
		
		/*The variables are instantiated: 
		 * headNode -> will point to the whole linked list, 
		 * currentNode -> will point to our last created node on each iteration, 
		 * newNode -> will be reset and will point to a new node on each iteration, and 
		 * response will store the user input to know if they wants to continue or not.*/
		LinkedListNode headNode, newNode, currentNode;
		
		//The user is asked to type an integer 
		Scanner userInput = new Scanner(System.in);
		System.out.println("Line 1: Enter the data for pocessing ending with -999");
		
		/* newNode -> points to a new LinkedListNode
		 * headNode -> points to the new LinkedListNode
		 * currentNode -> points to the new LinkedListNode
		 */
		
		newNode = new LinkedListNode(userInput.nextInt(),null);
		headNode= newNode;
		currentNode = newNode;
		System.out.println("Number:"+currentNode.getInfo());
		
		//while the user response (input) is not equal to -999, the loop will be executed
		int response = userInput.nextInt();
		while(response != -999) {
			
			System.out.println("Number:"+response);
			
			/* newNode -> now is pointing to a new LinkedListNode (new object)
			 * headNode -> it is not modified by this action, it will always point to the very first LinkedListNode
			 * the new LinkedListNode is stored in the last LinkedListNode link slot
			 * currentNode -> now is pointing to the new LinkedListNode which is indeed the current LinkedListNode
			 */
			newNode = new LinkedListNode(response,null);
			currentNode.setLink(newNode);
			currentNode=newNode; 
			response = userInput.nextInt();
		};
		System.out.println("Number:"+response);
		
		//CLOSE THE SCANNER
		userInput.close();
		
		//PROCESS TO WRITE THE INFORMATION
		
		// currentNode-> now is pointing to the first node of the list
		currentNode=headNode;
		
		System.out.println("Displaying the components of the linked list stored fron the user's input: \n\n\n");
		
		// while the current node that is checked contains a different value from -999, the loop will be executed
		while(currentNode!= null) {
			System.out.println("Value: "+currentNode.getInfo());
			
			//The current node points to the next LinkedListNode in the list
			currentNode=currentNode.getLink();
			
		}
		
		
		
		

	}

}
