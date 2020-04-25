package com.data_structure.list;
public class LinkedListDetectLoop {
	
	static Node head;

	static class Node {
		Node next;
		int data;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	int detectLoop(Node node) {
		Node slow = node, fast = node;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				removeLoop(slow, node);
				return 1;
			}
		}
		return 0;
	}

	void removeLoop(Node loop, Node curr) {
		Node ptr1, ptr2 = null;
		ptr1 = curr;
		while (1 == 1) {
			ptr2 = loop;
			while (ptr2.next != loop && ptr2.next != ptr1) {
				ptr2 = ptr2.next;
			}
			if (ptr2.next == ptr1) {
				break;
			}
			ptr1 = ptr1.next;
		}
		ptr2.next = null;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListDetectLoop ll = new LinkedListDetectLoop();
		ll.head = new Node(50);
		ll.head.next = new Node(20);
		ll.head.next.next = new Node(15);
		ll.head.next.next.next = new Node(4);
		ll.head.next.next.next.next = new Node(10);

		head.next.next.next.next.next = head.next.next;
		ll.detectLoop(head);
		System.out.println("Linked List after removing loop : ");
		ll.printList(head);
	}

}

