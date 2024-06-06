package LinkedStack;

public class LinkedListClass {

	public LinkedListNode first;
	public LinkedListNode last;
	public int size;

	public LinkedListClass() {
		first = null;
		last = null;
		size = 0;
	}
	
	public void add(int info) {
		
		LinkedListNode newNode = new LinkedListNode(info);
		
		if(first==null) {
			first = newNode;
			last = newNode;
			

		}
		else {
			
			last.setLink(newNode);
			last = last.getLink();
			
		}
		size++;
		
	}
	
	public void print() {
		LinkedListNode current = first;
		while(current!=null) {
			System.out.println(current.getInfo());
			current = current.getLink();
		}
	}
	
	public void search(int num) {
		
		LinkedListNode current = first;
		
		while(current!=null && current.getInfo()!=num) {
			current = current.getLink();
		}
		
		System.out.println(current==null?"The number "+num+" does not exist into the Linked List":"The number "+num+" was found into the Linked List");
	}
	
	
}
