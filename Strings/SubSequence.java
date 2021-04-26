package Strings;

import java.util.Scanner;

public class SubSequence {
	public static String[] findseq(String str)
	{
		if(str.isEmpty())
		{
			String[] an = {""};
		    return an;
		}
		String small[] = findseq(str.substring(1));
		String ans[] = new String[2 * small.length];
		int k=0;
		for(int i=0;i<small.length;i++)
		{
			ans[k]=small[i];
			k++;
		}
		for(int i=0;i<small.length;i++)
		{
			ans[k]=str.charAt(0)+small[i];
			k++;
		}
		return ans;
	}
	public static void output(String[] ans)
	{
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str =  s.nextLine();
		String ans[] = findseq(str);
		output(ans);

	}

}
