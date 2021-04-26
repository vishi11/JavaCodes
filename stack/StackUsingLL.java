package stack;

public class StackUsingLL<T> {
	StackNode<T> head;
	public int size;
	public StackUsingLL() {
		head = null;
		size = 0;
	}
	int size()
	{	
		return size;
	}
	T top() throws EmptyException
	{
		if(size()==0)
		{
			throw new EmptyException();
		}
		return head.data;
	}
	boolean isempty()
	{
		return (size == 0);
	}
	void push(T ele)
	{
		StackNode<T> node = new StackNode<T>(ele);
		node.next = head;
		head = node;
		size++;
	}
	T pop()
	{
		T temp = head.data;
		head = head.next;
		return temp;
	}

}
