package com.data_structure.list;


public class NthNodeFromEnd {

	static Node head;

	static class Node {
		Node next;
		int data;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	static Node retriveNthFromEnd(int n) {

		Node ptr = head;
		Node ref_ptr = head;
		int count = 0;
		while (count < n) {
			ref_ptr = ref_ptr.next;
			count++;
		}

		while (ref_ptr != null) {
			ptr = ptr.next;
			ref_ptr = ref_ptr.next;
		}

		return ptr;
	}

	static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		head = new Node(10);
		head.next = new Node(11);
		head.next.next = new Node(12);
		head.next.next.next = new Node(13);
		head.next.next.next.next = new Node(14);
		head.next.next.next.next.next = new Node(15);

		printList(head);
		Node nth_node = retriveNthFromEnd(3);
		System.out.println(nth_node.data);

	}
}
