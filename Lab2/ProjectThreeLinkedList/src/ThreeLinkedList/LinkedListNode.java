package ThreeLinkedList;

public class LinkedListNode {
	public int  info;
	public LinkedListNode link;
	
	//CONSTRUCTORS
	public LinkedListNode (int info) {
		this.info = info;
		this.link = null;
	}
	
	public LinkedListNode () {
		this.info = 0;
		this.link = null;
	}
	
	public LinkedListNode (int info, LinkedListNode link) {
		this.info = info;
		this.link = link;
	}
	
	//GETTERS AND SETTERS
	public int getInfo() {
		return info;
	}
	
	public void setInfo(int info) {
		this.info = info;
	}
	
	public LinkedListNode getLink() {
		return link;
	}
	
	public void setLink(LinkedListNode link) {
		this.link = link;
	}
	
}
