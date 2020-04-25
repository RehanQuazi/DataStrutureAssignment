package com.data_structure.list;

public class ReverseLinkedList {

	static Node head;

	static class Node {

		Node next;
		int data;

		public Node(int d) {
			data = d;
			next = null;
		}

	}

	Node reverseNode(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.println(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		
		list.printList(head);
		head = list.reverseNode(head);
		System.out.println("Reversed linked list ");
		list.printList(head);
	}

}
