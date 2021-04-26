package Strings;

import java.util.Scanner;

public class Hackstring {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String A = s.next();
		String B = s.next();
		int n = A.length();
		int n2 = B.length();
		System.out.println(n+n2);
		int comp = A.compareTo(B);
		if(comp <= 0)
		{
			System.out.println("No");
		}
		else 
		{
			System.out.println("Yes");
		}
		String a= A.substring(0,1).toUpperCase()+A.substring(1);
		String b = B.substring(0, 1).toUpperCase()+B.substring(1);
		System.out.println(a+" "+b);

	}
}










