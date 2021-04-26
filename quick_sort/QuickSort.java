package quick_sort;

import java.util.*;

public class QuickSort {
	public static int partition(int a[], int si, int ei)
	{
		int pivot = a[ei];
		int pindex = si;
		for(int i=si;i<ei;i++)
		{
			if(a[i]<=pivot)
			{
				int temp;
				temp = a[pindex];
				a[pindex] = a[i];
				a[i] = temp;
				pindex++;
			}
		}
		int temp;
		temp = a[pindex];
		a[pindex] = a[ei];
		a[ei] = temp;
		return pindex;
	}
	public static void sort(int a[], int si, int ei)
	{
		if(si<ei)
		{
			int pi = partition(a,si,ei);
			sort(a,si,pi-1);
			sort(a,pi+1,ei);
		}
		
	}
	public static int[] input(int n)
	{
		Scanner s = new Scanner(System.in);
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		return a;
	}
	public static void output(int a[], int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		int A[] = input(n);
		output(A,n);
		sort(A,0,A.length-1);
		output(A,n);

	}

}
