package FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c3=0;
		int c5=0;
		for(int i=1;i<=n;i++)
		{

			String d = "";
			c3++;
			c5++;
			if(c3==3)
			{
				d+="fizz";
				c3=0;
			}
			if(c5==5)
			{
				d+="buzz";
				c5=0;
			}
			if(d=="")
			{
				System.out.println(i);
			}
			else
			{
				System.out.println(d);
			}
			
		}

	}

}
