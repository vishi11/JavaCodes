package Strings;

import java.util.Scanner;

public class Str_Palindrome {

	public static void main(String[] args) {
		String str,original="";
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		int len = str.length();
		for(int i=len-1;i>=0;i--)
		{
			original += str.charAt(i);
		}
		if(str.length()==0)
		{
			System.out.println("-1");
		}
		else if(str.equals(original))
		{
			System.out.println(str+" Is palindrome");
		}
		else
		{
			System.out.println(str+" Is Not palindrome");
		}
	}

}
