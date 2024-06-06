package LinkedList;

public class LinkedListNode {
	public Divide  info;
	public LinkedListNode link;
	
	//CONSTRUCTORS
	public LinkedListNode (Divide info) {
		this.info = info;
		this.link = null;
	}
	
	public LinkedListNode () {
		this.info = null;
		this.link = null;
	}
	
	public LinkedListNode (Divide info, LinkedListNode link) {
		this.info = info;
		this.link = link;
	}
	
	//GETTERS AND SETTERS
	public Divide getInfo() {
		return info;
	}
	
	public void setInfo(Divide info) {
		this.info = info;
	}
	
	public LinkedListNode getLink() {
		return link;
	}
	
	public void setLink(LinkedListNode link) {
		this.link = link;
	}
	
}
