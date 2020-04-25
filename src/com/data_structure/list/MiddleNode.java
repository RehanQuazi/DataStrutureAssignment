package com.data_structure.list;

public class MiddleNode {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	int getMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
		}
		return slow_ptr.data;
	}

	public void push(int data) {

		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
	}

	public static void main(String[] args) {
		MiddleNode list = new MiddleNode();
		for(int i=0;i<5;i++){
	    list.push(i);
		list.printList();
		System.out.println();
	  }
		System.out.println("\n"+list.getMiddle());

}
}
