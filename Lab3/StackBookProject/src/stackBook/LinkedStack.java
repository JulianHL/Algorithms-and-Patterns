package stackBook;


public class LinkedStack {

	public LinkedListNode stackTop;
	public int stackSize;
	
	public LinkedStack() {
		stackTop = null;
		stackSize = 0;
	}
	
	public void push(Book info) {
		
		LinkedListNode newNode = new LinkedListNode(info);
		newNode.setLink(stackTop); 
		stackTop = newNode;
		stackSize++;
		}
	
	public Book pop() {
		
		LinkedListNode value = stackTop;
		stackTop = stackTop.getLink();
		stackSize--;
		return value.getInfo();
		}
	
	public Book peek() {
		
		return stackTop.getInfo();
		}
	
	public void print() {
	
		LinkedListNode current = stackTop;
		while(current != null) {
			System.out.println("\n\n" + current.getInfo());
			current.getInfo().calculate_Price_Euro();
			current = current.getLink();
		}
	}
	
	}

