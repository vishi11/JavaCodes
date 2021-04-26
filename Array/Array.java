package Array;
import java.util.*;
public class Array {
	public static int[]  Input()
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] =  new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		return a;
	}
	public static void print(int a[])
	{
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static int largest(int a[])
	{
		int n = a.length;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int a[] =  new int[n];
//		for(int i=0;i<n;i++)
//		{
//			a[i] = s.nextInt();
//		}
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(a[i]);
//		}
		int a[]=Input();
		print(a);
		System.out.println("Largest element is" +" " + largest(a));
		

	}
}
