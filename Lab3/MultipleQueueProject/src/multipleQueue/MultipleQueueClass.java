package multipleQueue;

public class MultipleQueueClass {

	public int queueFrontA;
	public int queueRearA;
	public int queueFrontB;
	public int queueRearB;
	public int maxQueueSize;
	public int countA;
	public int countB;
	public Integer[][] list;
	
	//constructor
	public MultipleQueueClass(int maxQueueSize) {
		this.maxQueueSize = maxQueueSize;
		queueFrontA = 0;
		queueRearA = maxQueueSize-1;
		queueFrontB = 0;
		queueRearB = maxQueueSize-1;
		countA = 0;
		countB = 0;
		list = new Integer[2][maxQueueSize];
	}
	
	//methods
	
	public void addQueue(Integer num) {
		if(countA == countB) {
			queueRearA = (queueRearA+1)%maxQueueSize;
			list[0][queueRearA] = num;
			System.out.println("The Element named "+num+" is queued in queueA system");
			
			countA++;
		}else {
			queueRearB = (queueRearB+1)%maxQueueSize;
			list[1][queueRearB] = num;
			System.out.println("The Element named "+num+" is queued in queueB system");
			
			countB++;
		}
	}
	
	public void deleteQueue() {
		if(countA == countB || countA > countB) {
			System.out.println(list[0][queueFrontA]+" has withdrawn from the queueA\n");
			list[0][queueFrontA] = null;
			queueFrontA = (queueFrontA+1)%maxQueueSize;
			
			countA--;
		}else {
			System.out.println(list[1][queueFrontB]+" has withdrawn from the queueB");
			list[1][queueFrontB] = null;
			queueFrontB = (queueFrontB+1)%maxQueueSize;
			countB--;
		}
	}
	
	public void printQueuesInfo() {
		System.out.println("The front of queue A is "+list[0][queueFrontA]+"\nThe back of queue A is "+list[0][queueRearA]+"\nThe number of elements in queue A is "+countA);
		System.out.println("\nThe front of queue B is "+list[1][queueFrontB]+"\nThe back of queue B is "+list[1][queueRearB]+"\nThe number of elements in queue B is "+countB+"\n");
	}
	
}
