package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceParanthesis {
	public static boolean Arepair(char open, char close)
	{
		if(open == '(' && close == ')')
			return true;
		if(open == '{' && close == '}')
			return true;
		if(open == '[' && close == ']')
			return true;
		else
			return false;
	}
	public static boolean isBalance(String exep)
	{
	Stack<Character> sc = new Stack<Character>();
	
		for(int i=0;i<exep.length();i++)
		{
			if(exep.charAt(i)=='(' || exep.charAt(i)== '{' || exep.charAt(i)=='[')
			{
				sc.push(exep.charAt(i));
			}
			else if(exep.charAt(i)==')' || exep.charAt(i)=='}' || exep.charAt(i)==']')
			{
				if(sc.isEmpty() || !Arepair(sc.peek(),exep.charAt(i)))
				{
					return false;
				}
				else
				{
					sc.pop();
				}
			}
		}
		return (sc.isEmpty());
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String exep = s.nextLine();
		System.out.println(isBalance(exep));
}
}