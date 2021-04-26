package stack;

import java.util.Scanner;

public class StackUse {

	public static void main(String[] args) throws FullException {
		Stackcls stack = new Stackcls(3);
//		stack.push(23);
//		stack.push(24);
		Scanner s = new Scanner(System.in);
		for(int i=10;i<=15;i++)
		{
			stack.push(i);
		}
		System.out.println(stack.getpush());
		while(!stack.isempty())
		{
			System.out.println(stack.pop());
		}
	}

}
