package linkedlist;

import java.util.LinkedList;

public class Linklist {

	public static void main(String[] args) {
		LinkedList<Integer> node = new LinkedList<>();
		node.add(100);
		node.add(170);
		node.set(1, 90);
		node.addFirst(200);
		for(int i=0;i<node.size();i++)
		{
			System.out.print(node.get(i)+" ");
		}

	}

}
