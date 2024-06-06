package ThreeLinkedList;

public class LinkedListClass {
	
	public static LinkedListNode headNode1;
	public static LinkedListNode headNode2;
	public static LinkedListNode headNode3;
	private LinkedListNode firstNode;
	private LinkedListNode currentNode;
	private LinkedListNode lastNode;
	
	//constructor
	public LinkedListClass() {
		currentNode=null;
		lastNode = null;
	}
	
	//getters and setters
	
	public LinkedListNode getFirstNode() {
		return firstNode;
	}
	
	public LinkedListNode getCurrentNode() {
		return currentNode;
	}
	
	public LinkedListNode getLastNode() {
		return lastNode;
	}
	
	public void setFirstNode(LinkedListNode firstNode) {
		this.firstNode = firstNode;
	}
	
	public void setCurrentNode(LinkedListNode currentNode) {
		this.currentNode = currentNode;
	}
	
	public void setLastNode(LinkedListNode lastNode) {
		this.lastNode = lastNode;
	}
	
	//Methods
	
	// add new node
	public void add(int info) {
		LinkedListNode newNode = new LinkedListNode(info);
		
			lastNode.setLink(newNode);
			lastNode= newNode;
		}
	
	public void addForward(int info) {
		LinkedListNode newNode = new LinkedListNode(info);
		
		switch(firstNode) {
		case null:
			firstNode = newNode;
			lastNode =newNode;
			break;
			
		default:
			lastNode.setLink(newNode);
			lastNode= newNode;
			break;
		}
	}
	
	
	// add new node in backward order
	public void addBackward(int info) {
		LinkedListNode newNode = new LinkedListNode(info);
		firstNode = newNode;
		
		switch(lastNode) {
		case null:
			firstNode.setLink(lastNode);
			lastNode = newNode;
			currentNode = lastNode;
			break;
			
		default:
			firstNode.setLink(currentNode);
			currentNode = newNode;	
			break;
		}
	}
	
	// add difference between two linked lists
	public void addDifferance(LinkedListNode node1, LinkedListNode node2) {
		
		LinkedListNode currentNodeHead1 = node1;
		LinkedListNode currentNodeHead2 = node2;
		while(currentNodeHead1 != null || currentNodeHead2 != null) {
			LinkedListNode newNode = new LinkedListNode((currentNodeHead1!=null?currentNodeHead1.getInfo():0) - (currentNodeHead2!=null?currentNodeHead2.getInfo():0));
			switch(firstNode) {
			case null:
				firstNode = newNode;
				lastNode =newNode;
				break;
				
			default:
				lastNode.setLink(newNode);
				lastNode= newNode;
				break;
			}
			currentNodeHead1 = currentNodeHead1.getLink();
			currentNodeHead2 = currentNodeHead2.getLink();
			}
	}
		
	// print list
	static public void printMainLists() {
		LinkedListNode currentNodeHead1 = headNode1;
		LinkedListNode currentNodeHead2 = headNode2;
		while(currentNodeHead1 != null || currentNodeHead2 != null) {
			System.out.println("Value in the First Linked List: " + (currentNodeHead1!=null?currentNodeHead1.getInfo():"Null")+" , Value in the Second Linked List: " + (currentNodeHead2!=null?currentNodeHead2.getInfo():"Null"));
			currentNodeHead1 = currentNodeHead1.getLink();
			currentNodeHead2 = currentNodeHead2.getLink();
			}
		}
	static public void print(LinkedListNode node) {
		LinkedListNode current = node;
		while(current != null) {
			System.out.println("Value: "+current.getInfo());
			current = current.getLink();
			}
		}
	}
