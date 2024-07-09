package employeeData;

public class LinkedListNode {
	public Employee  info;
	public LinkedListNode link;
	
	//CONSTRUCTORS
	public LinkedListNode (Employee info) {
		this.info = info;
		this.link = null;
	}
	
	public LinkedListNode () {
		this.info = null;;
		this.link = null;
	}
	
	public LinkedListNode (Employee info, LinkedListNode link) {
		this.info = info;
		this.link = link;
	}
	
	//GETTERS AND SETTERS
	public Employee getInfo() {
		return info;
	}
	
	public void setInfo(Employee info) {
		this.info = info;
	}
	
	public LinkedListNode getLink() {
		return link;
	}
	
	public void setLink(LinkedListNode link) {
		this.link = link;
	}
	
}
