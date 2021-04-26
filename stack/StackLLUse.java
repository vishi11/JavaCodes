package stack;

public class StackLLUse {

	public static void main(String[] args) throws EmptyException  {
		StackUsingLL<Integer> st = new StackUsingLL<>();
		for(int i=0;i<=10;i++)
		{
			st.push(i);
		}
		while(!st.isempty())
		{
			System.out.println(st.pop());
		}
	}
}
