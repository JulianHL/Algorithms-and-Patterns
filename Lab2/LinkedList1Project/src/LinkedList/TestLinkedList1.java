package LinkedList;

public class TestLinkedList1 {

	public static void main(String[] args) {
		
		LinkedListNode headNode, newNode;
				
		headNode = new LinkedListNode(45);
		newNode = new LinkedListNode(65);
		headNode.setLink(newNode);
		newNode = new LinkedListNode(34);
		headNode.getLink().setLink(newNode);
		newNode = new LinkedListNode(70);
		headNode.getLink().getLink().setLink(newNode);
		
	}

}
