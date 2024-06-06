package queue;

public class TestQueue {

	public static void main(String[] args) {
		QueueClass queue = new QueueClass(5);
		queue.addQueue(10);
		queue.addQueue(20);
		queue.addQueue(30);
		queue.addQueue(40);
		queue.addQueue(50);
		
		System.out.println(queue.count);
		System.out.println(queue.getFront());
		System.out.println(queue.getRear());
		System.out.println(queue.deleteQueue());
		System.out.println(queue.getFront());
		System.out.println(queue.getQueue()[queue.getRear()]);
		
		System.out.println("Queue: ");
		while(!queue.isEmpty()) {
			System.out.println(queue.deleteQueue());
		}
		
	}
	
	
}
