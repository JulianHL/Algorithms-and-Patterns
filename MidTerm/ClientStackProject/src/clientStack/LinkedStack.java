package clientStack;


public class LinkedStack {

	public LinkedListNode stackTop;
	public int stackSize;
	
	public void push(Client info) {
		
		LinkedListNode newNode = new LinkedListNode(info);
		newNode.setLink(stackTop); 
		stackTop = newNode;
		stackSize++;
		}
	
	public Client pop() {
		LinkedListNode value = stackTop;
		stackTop = stackTop.getLink();
		stackSize--;
		return value.getInfo();
		}
	
	public Client peek() {
		return stackTop.getInfo();
		}
	
	public void print() {
		LinkedListNode current = stackTop;
		while(current != null) {
			System.out.println(current.getInfo());
			current = current.getLink();
		}
		
		System.out.println("\nThe size of stack is:" + stackSize+"\n\n"
				+ "StackTop is:" + stackTop.getInfo());
		
	}
	
	}

