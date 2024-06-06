package LinkedListCourse;

public class LinkedListNode {
	public Course  info;
	public LinkedListNode link;
	
	//CONSTRUCTORS
	public LinkedListNode (Course info) {
		this.info = info;
		this.link = null;
	}
	
	public LinkedListNode () {
		this.info = null;
		this.link = null;
	}
	
	public LinkedListNode (Course info, LinkedListNode link) {
		this.info = info;
		this.link = link;
	}
	
	//GETTERS AND SETTERS
	public Course getInfo() {
		return info;
	}
	
	public void setInfo(Course info) {
		this.info = info;
	}
	
	public LinkedListNode getLink() {
		return link;
	}
	
	public void setLink(LinkedListNode link) {
		this.link = link;
	}
	
}
