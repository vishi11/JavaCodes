package recursion_string;

import java.io.InputStream;
import java.util.Scanner;

public class Remove {
	public static String remove(String str)
	{
		if(str.isEmpty())
		{
			return str;
		}
		String s = "";
		if(str.charAt(0)!='x')
		{
			s += str.charAt(0);
		}
		String  small = remove(str.substring(1));
		return s + small;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(remove(str));

	}

}
