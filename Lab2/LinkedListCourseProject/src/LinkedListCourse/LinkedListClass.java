package LinkedListCourse;

public class LinkedListClass {
	
	private LinkedListNode firstNode;
	private LinkedListNode lastNode;
	
	//constructor
	public LinkedListClass() {
		firstNode = null;
		lastNode = null;
	}
	
	//getters and setters
	public LinkedListNode getFirstNode() {
		return firstNode;
	}
	
	public LinkedListNode getLastNode() {
		return lastNode;
	}
	
	public void setFirstNode(LinkedListNode firstNode) {
		this.firstNode = firstNode;
	}
	
	public void setLastNode(LinkedListNode lastNode) {
		this.lastNode = lastNode;
	}
	
	//Methods
	
	// add new node
	public void add(Course course) {
		LinkedListNode newNode = new LinkedListNode(course);
		
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
		
	// print list
	public void print() {
		LinkedListNode currentNode = firstNode;
		while(currentNode != null) {
			System.out.println(currentNode.getInfo());
			currentNode = currentNode.getLink();
			}
		}
	}
