package MergeSort;
import java.util.Scanner;
public class MergeSort {
	
	public static void Merge(int A[], int l, int mid, int r)
	{
        int n1 = mid - l + 1;
        int n2 = r - mid;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = A[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = A[mid + 1 + j];
		int i = 0;
		int j = 0;
		int k = l;
		while(i<n1 && j<n2)
		{
			if(L[i]>R[j])
			{
				A[k]=R[j];
				j++;
			}
			else 
			{
				if(L[i]<R[j])
				{
					A[k]=L[i];
					i++;
				}
			}
			k++;
		}
		while(i<n1)
		{
			A[k]=L[i];
			k++;
			i++;
		}
		while(j<n2)
		{
			A[k]=R[j];
			k++;
			j++;
		}
	}
	public static void divide(int A[],int l,int r)
	{
		if(l<r)
		{
			int mid = (l+r)/2;
			divide(A,l,mid);
			divide(A,mid+1,r);
			Merge(A,l,mid,r);
			
		}
	}
 	public static int[] Array(int n)
	{
		Scanner s = new Scanner(System.in);
		int A[] = new int[n];
		for(int k=0;k<n;k++)
		{
			A[k]=s.nextInt();
		}
		return A;
	}
	public static void Aout(int A[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int A[] = Array(n);
		Aout(A,n);
		divide(A,0,A.length-1);
		Aout(A,n);
		long end = System.currentTimeMillis();
		long value = end - start;
		System.out.println("Time taken " + value + "ms");
	}

}
