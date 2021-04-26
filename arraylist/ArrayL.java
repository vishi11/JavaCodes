
package arraylist;

import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(23);
		l.add(3);
	
		System.out.println(l);
		System.out.println(l.get(1));
		l.add(1, 40);
		System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		//l.remove(2);
		l.set(2, 100);
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		for(int ele : l)
		{
			System.out.print(ele+" ");
		}
	}

}
