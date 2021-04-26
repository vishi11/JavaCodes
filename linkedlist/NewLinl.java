package linkedlist;

import java.util.Scanner;

public class NewLinl {
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
	public static NewNode<Integer> insert(NewNode<Integer> head, int data, int pos )
	{
		NewNode<Integer> newnode = new NewNode<Integer>(data);
		if(pos == 0)
		{
			newnode.next = head;
			head = newnode;
			return head;
		}
		int i=0;
		NewNode<Integer> temp = head;
		while(i<pos-1)
		{
			temp = temp.next;
			i++;
		}
		newnode.next = temp.next;
		temp.next = newnode;
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
		NewNode<Integer> h = takeinput();
		h = insert(h, 70, 0);
		print(h);
//		NewNode<Integer> node = new NewNode<Integer>(10);
//		NewNode<Integer> node2 = new NewNode<Integer>(20);
//		NewNode<Integer> node3 = new NewNode<Integer>(30);
//		NewNode<Integer> node4 = new NewNode<Integer>(40);
//		node.next = node2;
//		node2.next = node3;
//		node3.next = node4;
//		NewNode<Integer> head = node;
////		while(head!=null)
////		{
////			System.out.print(head.data+" ");
////			head = head.next;
////		}
//		print(head);
	}

}
