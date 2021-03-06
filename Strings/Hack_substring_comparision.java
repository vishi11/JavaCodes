package Strings;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Hack_substring_comparision {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        String temp;
        for(int i=0;i<s.length()-k+1;i++)
        {
        	temp = s.substring(i,i+k);
        if(smallest.compareTo(temp)>0)	smallest = temp;
        
        if(largest.compareTo(temp)<0)	largest = temp;

        }
        return smallest + "\n" + largest;
        
        
        //2nd way
//        SortedSet<String> ss = new TreeSet();
//        System.out.println(s.length());
//        for(int i=0;i<s.length()-k+1;i++)
//        {
//        ss.add(s.substring(i,i+k));
//        }
//        System.out.println(ss);
//        return ss.first() + "\n" + ss.last();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }

}
