package queue;

public class QueueUsingArray {
	private int[] data;
	private int front;
	private int rear;
	private int size;
	public QueueUsingArray() {
	  data = new int[5];
	  front = -1;
	  rear = -1;
	  size = 0;
	}
	public QueueUsingArray(int ele) {
		  data = new int[ele];
		  front = -1;
		  rear = -1;
		  size = 0;
		}
	 int size()
	{
		return size;
	}
	boolean isEmpty()
	{
		if (size==0)
			return true;
		else
			return false;
	}
	int front() throws QueueEmptyException
	{
		if(size==0)
		{
			throw new QueueEmptyException();
		}
		return data[front];
	}
//	int rear() throws QueueFullException 
//	{
//		if(size == data.length)
//		{
//			throw new QueueFullException();
//		}
//		return data[rear];
//	}
	void enque(int element) throws QueueEmptyException
	{
		if(size == data.length)
		{
			//throw new QueueEmptyException();
			doublecapacity();
		}
		if(size == 0)
		{
			front = 0;
		}
		size++;
		rear = (rear + 1) % data.length;
//		rear++;
//		if(rear == data.length)
//		{
//			rear = 0;
//		}
		data[rear] = element;
		
		
	}
	void doublecapacity()
	{
		int temp[] = data;
		data = new int[2*temp.length];
		int index = 0;
		for(int i=0;i<temp.length;i++)
		{
		data[index] = temp[i];
		index++;
		}
	}
	int dequeue()
	{
		int temp = data[front];
		front++;
		size--;
		
		if(size==0)
		{
			front = -1;
			rear = -1;
		} 
		return temp;
	}
}
