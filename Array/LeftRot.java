package Array;
import java.util.*;
public class LeftRot {
	public static int[] rotation(int a[],int n)
	{
		int b = a.length;
		int rot[] = new int[b];
		System.arraycopy(a, 2 , rot, 0,3);
		System.arraycopy(a, 0, rot, 3, 2);
		
		return rot;
	}
	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		int n = y.nextInt();
		//int d = y.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=y.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		a = rotation(a,n-1);
		for(int t =0; t<n; t++)
		{
			System.out.print(a[t]+" ");
		}
		System.out.println();
	}
}
