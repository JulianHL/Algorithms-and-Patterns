package ThreeLinkedList;

import java.util.*;

public class TestThreeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//Creating three linked lists where the information can be stored and modified
		LinkedListClass linkedListFd = new LinkedListClass();
		LinkedListClass linkedListBd = new LinkedListClass();
		LinkedListClass linkedListD = new LinkedListClass();
		
		System.out.println("Line 1: Enter the data for pocessing ending with -999");
		int response = input.nextInt();
		
		//while the user response (input) is not equal to -999, the loop will be executed filling the linked lists
		while(response != -999) {
			linkedListFd.addForward(response);
			linkedListBd.addBackward(response*2);
			response = input.nextInt();	
		}
		
		//Calling the addDifferance method to add the difference between the two linked lists
		linkedListD.addDifferance(linkedListFd.getFirstNode(), linkedListBd.getFirstNode());
		
		//Setting the head nodes as the reference of the three linked lists
		LinkedListClass.headNode1 = linkedListFd.getFirstNode();
		LinkedListClass.headNode2 = linkedListBd.getFirstNode();
		LinkedListClass.headNode3 = linkedListD.getFirstNode();
		
		System.out.println("Displaying the components of the First and Second Linked List"
				+ "\n stored from user input in Forward and Backward order\n\n");
		//Calling the printMainLists method to print the tow first linked lists
		LinkedListClass.printMainLists();
		
		
		System.out.println("\n\nDisplaying the components of the First Linked List in Forward manner\n");
		//Calling the print method to print the first linked list
		LinkedListClass.print(LinkedListClass.headNode1);
		
		System.out.println("\n\nDisplaying the components of the Second Linked List in Backward manner\n");
		//Calling the print method to print the second linked list
		LinkedListClass.print(LinkedListClass.headNode2);
		
		System.out.println("\n\nDisplaying the components of the Third Linked List in Forward manner\n");
		//Calling the print method to print the third linked list
		LinkedListClass.print(LinkedListClass.headNode3);
		
	}
	
	

}
