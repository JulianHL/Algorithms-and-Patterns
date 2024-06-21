package queue;

public class TestQueue {

	public static void main(String[] args) {
		QueueClass queue = new QueueClass(6);
		queue.addQueue(6);
		queue.addQueue(16);
		queue.addQueue(30);
		queue.addQueue(40);
		queue.addQueue(18);
		
		
		System.out.println("The number of elements in the queue is: " +queue.count);
		System.out.println("The inex of the queue front is: " +queue.getFront()+", the queue front value is: " +queue.getQueue()[queue.getFront()]);
		System.out.println("The index of the queue rear is: " +queue.getRear()+", the queue rear value is: " +queue.getQueue()[queue.getRear()]);
		queue.deleteQueue();
		System.out.println("The number of elements in the queue is: " +queue.count);
		System.out.println("The inex of the queue front is: " +queue.getFront()+", the queue front value is: " +queue.getQueue()[queue.getFront()]);
		System.out.println("The index of the queue rear is: " +queue.getRear()+", the queue rear value is: " +queue.getQueue()[queue.getRear()]);
		queue.addQueue(19);
		System.out.println("The number of elements in the queue is: " +queue.count);
		System.out.println("The inex of the queue front is: " +queue.getFront()+", the queue front value is: " +queue.getQueue()[queue.getFront()]);
		System.out.println("The index of the queue rear is: " +queue.getRear()+", the queue rear value is: " +queue.getQueue()[queue.getRear()]);
		
		
	}
	
	
}
