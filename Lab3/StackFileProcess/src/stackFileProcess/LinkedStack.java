package stackFileProcess;

public class LinkedStack {

	public LinkedListNode stackTop;
	public int stackSize;
	
	public LinkedStack() {
		stackTop = null;
		stackSize = 0;
	}
	
	public void push(Divide info) {
		
		LinkedListNode newNode = new LinkedListNode(info);
		newNode.setLink(stackTop);
		stackTop = newNode;
		stackSize++;
		}
	
	public Divide pop() {
		
		LinkedListNode value = stackTop;
		stackTop = stackTop.getLink();
		stackSize--;
		return value.getInfo();
		}
	
	public Divide peek() {
		
		return stackTop.getInfo();
		}
	
	
	public void print() {
	
		LinkedListNode current = stackTop;
		while(current != null) {
			System.out.println("X= "+current.getInfo().getX()+", Y= "+current.getInfo().getY()+", Division= "+current.getInfo().division());
			current = current.getLink();
		}
	}
	
	}

