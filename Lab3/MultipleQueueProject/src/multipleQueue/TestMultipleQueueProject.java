package multipleQueue;

public class TestMultipleQueueProject {
	
	public static void main(String[] args) {
		MultipleQueueClass multipleQueue = new MultipleQueueClass(3);
		
		multipleQueue.addQueue(6);
		multipleQueue.addQueue(17);
		multipleQueue.addQueue(5);
		multipleQueue.addQueue(20);
		multipleQueue.addQueue(15);
		multipleQueue.printQueuesInfo();
		multipleQueue.deleteQueue();
		System.out.println("After dequeue:");
		multipleQueue.printQueuesInfo();
		multipleQueue.addQueue(30);
		System.out.println("After adding in queue:");
		multipleQueue.printQueuesInfo();
		multipleQueue.deleteQueue();
		System.out.println("After dequeue:");
		multipleQueue.printQueuesInfo();
		multipleQueue.deleteQueue();
		System.out.println("After dequeue:");
		multipleQueue.printQueuesInfo();
	}
}
