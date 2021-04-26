package linkedlist;

import java.util.Scanner;

public class Iterative {
	public static NewNode<Integer> itrrev(NewNode<Integer> head)
	{
		NewNode<Integer> cur = head;
		NewNode<Integer> pre = null;
		NewNode<Integer> temp;
		while(cur != null)
		{
			temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}
		return pre;
	}
	public static NewNode<Integer> recusinsert(NewNode<Integer> head, int pos, int ele) {
		if(pos == 0)
		{
			NewNode<Integer> node = new NewNode<Integer>(ele);
			node.next = head;
			return head;
		}
		if(head == null)
		{
			return head;
		}
		head.next = recusinsert(head, pos-1, ele);
		return head;
	}

	public static NewNode<Integer> takeinput()
	{
		Scanner s = new Scanner(System.in);
		NewNode<Integer> head = null , tail =  null;
		int data = s.nextInt();
		while(data != -1)
		{
			NewNode<Integer> newnode = new NewNode<Integer>(data);
			if(head == null)
			{
				head = newnode;
				tail = newnode;
			}
			else {
//				NewNode<Integer> temp = head;
//				while(temp.next != null)
//				{
//					temp = temp.next;
//				}
//				temp.next = newnode;
				tail.next = newnode;
				tail = newnode;
			}
			data = s.nextInt();
		}
		return head;
	}
	public static void print(NewNode<Integer> head)
	{
		NewNode<Integer> temp = head;
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
//		head = temp;
//		while(head!=null)
//		{
//			System.out.print(head.data+" ");
//			head = head.next;
//		}
		
	}

	public static void main(String[] args) {
		NewNode<Integer> head = takeinput();
		 head = recusinsert(head, 2, 20);
//		head = itrrev(head);
		print(head);
	}

}
