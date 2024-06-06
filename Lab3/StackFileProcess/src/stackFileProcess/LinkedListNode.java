package stackFileProcess;

public class LinkedListNode {
	private Divide info;
	private LinkedListNode link;
	
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
	
	//SETTERS & GETTERS
	public void setInfo(Divide info){
		this.info = info;
	}
	
	public Divide getInfo(){
		return info;
	}
	
	public void setLink(LinkedListNode link){
		this.link = link;
	}
	
	public LinkedListNode getLink(){
		return link;
	}
	
}
