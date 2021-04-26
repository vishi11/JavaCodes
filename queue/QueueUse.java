package queue;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException {
		QueueUsingArray q = new QueueUsingArray(3);
		for(int i=0;i<5;i++)
		{
			q.enque(i);
		}
		while(!q.isEmpty())
		{
			System.out.print(q.dequeue()+" ");
		}
	}

}
