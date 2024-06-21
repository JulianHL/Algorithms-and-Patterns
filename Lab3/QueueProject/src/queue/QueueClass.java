package queue;

public class QueueClass {
	
	private Integer[] queue;
	private int front;
	private int rear;
	private int size;
	public int count;
	
	public QueueClass(int size) {
		this.size = size;
		queue = new Integer[size];
		front = 0;
		rear = size-1;
		count=0;
	}
	
	//getters & setters
	public int getFront() {
		return front;
	}
	
	public int getRear() {
		return rear;
	}
	
	public int getSize() {
		return size;
	}
	
	public Integer[] getQueue() {
		return queue;
	}
	
	public void setFront(int front) {
		this.front = front;
	}
	
	public void setRear(int rear) {
		this.rear = rear;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void setQueue(Integer[] queue) {
		this.queue = queue;
	}
	
	
	
	
	//methods
	
	public void addQueue(int info) {
		rear = (rear+1)%size;
		queue[rear] = info;
		
		count++;
		
	}
	
	public int deleteQueue() {
		
		int value =queue[front]; 
		queue[front] = null;
		front = (front+1)%size;
		count--;
		return value;
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
}
