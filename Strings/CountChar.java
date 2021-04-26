package Strings;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String v = s.nextLine();
		int c=0;
		int d = 0;
		int f=0;
		int i;
		for(i=0;i<v.length();i++)
		{
			if(v.charAt(i)>='a' && v.charAt(i)<='z')
			{
				f++;
			}
			else if(v.charAt(i)>='0' && v.charAt(i)<='9')
			{
				c++;
			}
			else if(v.charAt(i)==' ')
			{
				d++;
			}
			else
			{
				break;
			}
	
		}
		System.out.println("Characters => "+f);
		System.out.println("Numbers => "+c);
		System.out.println("Spaces => "+d);
	}

}
