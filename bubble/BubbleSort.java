package bubble;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		int c = a.length;
		
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt(); 
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<c-1;i++)
		{
			for(int j=0;j<c-1;j++)
			{
				if(a[j]>a[j+1])
				{
				int temp;
				temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
				}
			}
		}
		for(int i1=0;i1<a.length;i1++)
		{
			System.out.print(a[i1]+" ");
		}
	}
	
}
