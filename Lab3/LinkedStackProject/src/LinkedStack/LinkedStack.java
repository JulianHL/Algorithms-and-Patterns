package LinkedStack;


public class LinkedStack {

	public LinkedListNode stackTop;
	
	public void push(int info) {
		
		LinkedListNode newNode = new LinkedListNode(info);
		newNode.setLink(stackTop); 
		stackTop = newNode;
		}
	
	public int pop() {
		
		LinkedListNode value = stackTop;
		stackTop = stackTop.getLink();
		return value.getInfo();
		}
	
	public int peek() {
		
		return stackTop.getInfo();
		}
	
	public void print() {
	
		System.out.println("Stack Values: ");
		LinkedListNode current = stackTop;
		while(current != null) {
			System.out.println("Value: " + current.getInfo());
			current = current.getLink();
		}
	}
	
	}

