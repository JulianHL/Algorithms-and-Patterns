package clientStack;

public class LinkedListNode {
	private Client info;
	private LinkedListNode link;
	
	//CONSTRUCTORS
	public LinkedListNode (Client info) {
		this.info = info;
		this.link = null;
	}
	
	public LinkedListNode () {
		this.info = null;
		this.link = null;
	}
	
	public LinkedListNode (Client info, LinkedListNode link) {
		this.info = info;
		this.link = link;
	}
	
	//SETTERS & GETTERS
	public void setInfo(Client info){
		this.info = info;
	}
	
	public Client getInfo(){
		return info;
	}
	
	public void setLink(LinkedListNode link){
		this.link = link;
	}
	
	public LinkedListNode getLink(){
		return link;
	}
	
}
