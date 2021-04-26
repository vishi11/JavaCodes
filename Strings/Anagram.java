package Strings;
import java.io.*;
import java.util.*;
public class Anagram {
    static boolean isAnagram(String a, String b){
	        int n = a.length();
	        int m = b.length();
	        if(n!=m)
	        return false;
	        boolean f = false;
	        char temp1[]= a.toCharArray();
	        char temp2[] = b.toCharArray();
	       Arrays.sort(temp1);
	       Arrays.sort(temp2);
	       System.out.println(temp1);
	       System.out.println(temp2);
	       if(temp1.equals(temp2))
	        return f = true;
	       return f ;
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Not Anagrams" : "Anagrams" );
	    }
	
}
