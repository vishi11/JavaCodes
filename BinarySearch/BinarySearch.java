package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
	public static int BiSea(int a[], int z, int e, int x)
	{
		while(z<=e)
		{
		int mid = (z+e)/2;
		if(a[mid]==x )
		{
			return mid;
		}
		else if(a[mid]>x)
		{
			return BiSea(a,z,mid-1,x);
		}
		else
		{
			return BiSea(a,mid+1,e,x);
		}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
		int x = s.nextInt();
		int w = BiSea(a,0,n-1,x);
		System.out.println(w);
		}
}
