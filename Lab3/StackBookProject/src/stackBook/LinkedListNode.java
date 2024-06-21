package stackBook;

public class LinkedListNode {
	private Book info;
	private LinkedListNode link;
	
	//CONSTRUCTORS
	public LinkedListNode (Book info) {
		this.info = info;
		this.link = null;
	}
	
	public LinkedListNode () {
		this.info = null;
		this.link = null;
	}
	
	public LinkedListNode (Book info, LinkedListNode link) {
		this.info = info;
		this.link = link;
	}
	
	//SETTERS & GETTERS
	public void setInfo(Book info){
		this.info = info;
	}
	
	public Book getInfo(){
		return info;
	}
	
	public void setLink(LinkedListNode link){
		this.link = link;
	}
	
	public LinkedListNode getLink(){
		return link;
	}
	
}
