package stackFileProcess;

public class LinkedStack {

	public LinkedListNode stackTop;
	
	public void push(Divide info) {
		
		LinkedListNode newNode = new LinkedListNode(info);
		newNode.setLink(stackTop);
		stackTop = newNode;
		}
	
	public Divide pop() {
		
		LinkedListNode value = stackTop;
		stackTop = stackTop.getLink();
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

