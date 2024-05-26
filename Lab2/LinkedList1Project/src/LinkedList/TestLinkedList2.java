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
		char response;
		
		//The user is asked to type an integer 
		Scanner userInput = new Scanner(System.in);
		System.out.println("Write an integer");
		
		/* newNode -> points to a new LinkedListNode
		 * headNode -> points to the new LinkedListNode
		 * currentNode -> points to the new LinkedListNode
		 */
		newNode = new LinkedListNode(userInput.nextInt(),null);
		headNode= newNode;
		currentNode = newNode;
		
		//The user is asked to continue or not
		System.out.println("Type Y/y to continue or any oyher key to stop");
		response = Character.toLowerCase(userInput.next().charAt(0));
		
		//while the user response (input) is equal to 'y', the loop will be executed
		while(response=='y') {
			
			//The user is asked to type an integer 
			System.out.println("Write an integer");
			
			/* newNode -> now is pointing to a new LinkedListNode (new object)
			 * headNode -> it is not modified by this action, it will always point to the very first LinkedListNode
			 * the new LinkedListNode is stored in the last LinkedListNode link slot
			 * currentNode -> now is pointing to the new LinkedListNode which is indeed the current LinkedListNode
			 */
			newNode = new LinkedListNode(userInput.nextInt(),null);
			currentNode.setLink(newNode);
			currentNode=newNode;
			 
			//The user is asked to continue or not
			System.out.println("Type Y/y to continue or any other key to stop");
			response = Character.toLowerCase(userInput.next().charAt(0));	 
		};
		userInput.close();
		
		//PROCESS TO WRITE THE INFORMATION
		
		// currentNode-> now is pointing to the first node of the list
		currentNode=headNode;
		
		System.out.println("\nThese are the stored numbers: ");
		
		// while the current node that is checked contains a LinkedListNode, the loop will be executed
		while(currentNode!=null) {
			System.out.println("* "+currentNode.getInfo());
			
			//The current node points to the next LinkedListNode in the list
			currentNode=currentNode.getLink();
			
		}
		
		
		
		

	}

}
