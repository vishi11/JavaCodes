package SelectionSort;

import java.util.Scanner;

public class SelSort {
	public static int[] input(int n)
	{
		Scanner s = new Scanner(System.in);
		int i;
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
			a[i]= s.nextInt();
		}
		return a;
	}
	public static void output(int a[],int n)
	{
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = input(n);
		output(a,n);
		for(int i = 0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp;
					temp = a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
		System.out.println(a[i]);
		}
	}
}
