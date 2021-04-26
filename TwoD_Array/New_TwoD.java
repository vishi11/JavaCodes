	package TwoD_Array;

import java.util.Scanner;

public class New_TwoD {
	public static int[][] input()
	{
		Scanner v = new Scanner(System.in);
		int n = v.nextInt();
		int m = v.nextInt();
		int T[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				T[i][j]=v.nextInt();
			}
		}
		return T;
	}
	public static void output(int T[][])
	{
		int a = T.length;
		int b = T[0].length;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(T[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int largest(int T[][])
	{
		int a = T.length;
		int b = T[0].length;
		
		int max  = Integer.MIN_VALUE;
		for(int j=0;j<b;j++)
		{
			int sum=0;
			for(int i = 0;i<a;i++)
			{
				sum += T[i][j];
			}
			if(sum>max)
			{
				max = sum;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		long start = System.currentTimeMillis();
		int T[][]=input();
		output(T);
		System.out.println(largest(T));
		long end = System.currentTimeMillis();
		System.out.println(end - start+" ms");
	}

}
