package Strings;

public class NewSubSequence {
	public static void print(String a , String b)
	{
		if(a.length()==0)
		{
			System.out.println(b);
			return;
		}
		print(a.substring(1),b);
		print(a.substring(1),a.charAt(0)+b);
	}

	public static void main(String[] args) {
		print("xyz"," ");
	}
}
