package ds.queue;

public class Queue {

	private int maxSize;//initializes the number of slots
	private int front;//this will be the index position for the element in the front
	private int rear;//this will be the index position for the element at the back of the line
	private long[]queueArray;//slots to maintain the data
	private int Nitems;//counter to maintain the number items in our queue
	
	public Queue(int size) {
		this.maxSize = size;
		this.front = 0;//index position of the first slot of the array
		this.rear = -1;//there is no item in the array yet to be considered as the last item
		this.Nitems = 0;// we don't have elements in the array yet
		this.queueArray = new long[maxSize];
	}
	
	public void insert(int i) {
		
		if (rear == maxSize -1) {
			rear = -1;
		}
		rear++;
		queueArray[rear] = i;
		Nitems++;
	}
	
	public void view() {
		System.out.print("[ ");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print("]");
	}
	
	public long remove() {//remove item from the front of the queue
		if (front == maxSize) {
			front = 0;//we can set front back to the 0th index so that we can utilize the entire array agin 
		}
		long temp = queueArray[front];
		front++;
		Nitems--;
		return temp;
	}
	
	public long peakFront() {
		return queueArray[front];
	}
	
	public boolean isEmpty() {
		return Nitems == 0;
	}
	
	public boolean isFull() {
		return Nitems == maxSize;
	}
}
