package LinkedStack;

public class TestLinkedStackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListClass myList = new LinkedListClass();
		LinkedStack myStack = new LinkedStack();
		
		
		//Linked List
		myList.add(10);
		myList.add(15);
		myList.add(20);
		myList.add(25);
		
		
		myList.print();
		
		
		myStack.push(40);
		myStack.push(50);
		myStack.push(60);
		myStack.push(70);
		
		myStack.print();
		
	}

}
