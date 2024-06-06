package LinkedList;

public class TestLinkedList1 {

	public static void main(String[] args) {
		
		//Nodes creation
		LinkedListNode headNode, newNode;
		
		//List filling
		headNode = new LinkedListNode(24);
		newNode = new LinkedListNode(56);
		headNode.setLink(newNode);
		newNode = new LinkedListNode(285);
		headNode.getLink().setLink(newNode);
		newNode = new LinkedListNode(3);
		headNode.getLink().getLink().setLink(newNode);
		newNode = new LinkedListNode(9);
		headNode.getLink().getLink().getLink().setLink(newNode);
		newNode = new LinkedListNode(77);
		headNode.getLink().getLink().getLink().getLink().setLink(newNode);
		
		//List printing
		LinkedListNode currentNode = headNode;
		while(currentNode != null) {
			System.out.println("Value: "+currentNode.getInfo());
			currentNode = currentNode.getLink();
		}
		
	}

}
