package stack;

public class Stackcls {
	private int data[];
	private int top=-1;
	public Stackcls()
	{
		data = new int[10];
		int top = -1;
	}
	public Stackcls(int cap) {
		data = new int[cap];
		int top = -1;
	}
	public boolean isempty()
	{
//		if(top == -1) 
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
		return (top==-1);
	}
	public int size()
	{
		return top+1;
	
	}
	public int top() throws EmptyException
	{
		if(size() == 0)
		{
			EmptyException e = new EmptyException();
			throw e;
		}
		return data[top];
	}
	public void push(int ele) throws FullException
	{
		if(size() == data.length)
		{
			doublecapacity();
		}
		top++;
		data[top] = ele;
	}
	
	private void doublecapacity() {
		int[] temp = data;
		data = new int[2*temp.length];
		for(int i=0; i<=top; i++)
		{
			data[i] = temp[i];
		}
	}
	public int pop()
	{
		int temp=data[top];
		top--;
		return temp;
	}
	public int getpush()
	{
		int temp = data[top];
		return temp;
	}
}
