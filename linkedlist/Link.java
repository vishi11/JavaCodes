package linkedlist;

public class Link {

	public static void main(String[] args) {
		Node n = new Node(10);
		System.out.println(n.data);
		System.out.println(n.next);
		Node n1 = new Node(20);
		n.next = n1;
		System.out.println(n.next);
		System.out.println(n1.data);
		System.out.println(n1.next);

		
	}

}
