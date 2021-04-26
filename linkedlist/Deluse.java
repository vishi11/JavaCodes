package linkedlist;

import java.util.Scanner;

public class Deluse {

	public static Delnode<Integer> reverse(Delnode<Integer> head)
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		Delnode<Integer> finalreverse = reverse(head.next);
		Delnode<Integer> temp = finalreverse;
		while(temp.next != null)
		{
			 temp = temp.next;
		}
		temp.next = head;
		head.next = null;
		return finalreverse;
	}
	public static Delnode<Integer> delete(Delnode<Integer> head, int pos)
	{
		Delnode<Integer> temp = head; 
		if(pos == 0)
		{
			head = head.next;
			return head;
		}
		int i=0;
		while(i<pos-1)
		{
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
		return head;
		
	}
	public static Delnode<Integer> takeinput()
	{
		Scanner s = new Scanner(System.in);
		Delnode<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data!=-1)
		{
		Delnode<Integer> del = new Delnode<Integer>(data); 
		if(head == null)
		{
			head = del;
			tail = del;
		}
		else
		{
			tail.next = del;
			tail = del;
		}
		data = s.nextInt();
		}
		return head;
	}
	public static int listcount(Delnode<Integer> head)
	{
		int count=0;
		while(head!=null)
		{
			count++;
			head = head.next;
		}
		return count;
	}
	public static void output(Delnode<Integer> head)
	{
		while(head != null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	public static Delnode<Integer> midpoint(Delnode<Integer> head)
	{
		Delnode<Integer> slow = head, fast = head;
		while(fast.next!=null && fast.next.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public static void main(String[] args) {
		Delnode<Integer> head = takeinput();
		//head = delete(head, 0);
		output(head);
		System.out.println();
		System.out.println(listcount(head));
		Delnode<Integer> mid = midpoint(head);
		System.out.println(mid.data);
		head = reverse(head);
		output(head);
		
		
	}

}
