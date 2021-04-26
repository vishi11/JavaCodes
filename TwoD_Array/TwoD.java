package TwoD_Array;

import java.util.*;

public class TwoD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int t[][] = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println("Enter the row "+i+" and col "+j);
				t[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(t[i][j] +" ");
				
			}
			System.out.println();
		}
		
	}

}
