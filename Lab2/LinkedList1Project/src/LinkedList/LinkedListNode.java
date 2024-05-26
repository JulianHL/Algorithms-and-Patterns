package LinkedList;

public class LinkedListNode {
	private int info;
	private LinkedListNode link;
	
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
	
	//SETTERS & GETTERS
	public void setInfo(int info){
		this.info = info;
	}
	
	public int getInfo(){
		return info;
	}
	
	public void setLink(LinkedListNode link){
		this.link = link;
	}
	
	public LinkedListNode getLink(){
		return link;
	}
	
}
