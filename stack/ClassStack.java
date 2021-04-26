package stack;

import java.util.Scanner;
import java.util.Stack;

public class ClassStack {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		for(int i=0;i<=a.length;i++)
		{
			st.push(i);
		}
		System.out.println(st.peek());
		while(!st.empty())
		{
			System.out.println("Pop out Stack ele:-");
			System.out.println(st.pop());
		}
	}

}
