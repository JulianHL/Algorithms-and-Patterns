package LinkedStack;

public class TestLinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListClass myList = new LinkedListClass();
		LinkedStack myStack = new LinkedStack();
		
		
		//Linked List
		myList.add(10);
		myList.add(11);
		myList.add(31);
		myList.add(4);
		myList.add(100);
		myList.add(70);
		myList.add(48);
		
		myList.print();
		myList.search(80);
		
		myStack.push(10);
		myStack.push(11);
		myStack.push(31);
		myStack.push(4);
		myStack.push(100);
		myStack.push(70);
		myStack.push(48);
		
		myStack.print();
		
	}

}
