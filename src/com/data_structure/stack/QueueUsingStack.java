package com.data_structure.stack;

import java.util.Stack;

public class QueueUsingStack {
	
	static class Queue {

		static Stack<Integer> s1;
		static Stack<Integer> s2;

		 Queue(){
			 s1=new Stack<Integer>();
			 s2=new Stack<Integer>();
		 }
		 void enQueue(int x) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(x);
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}

		 int DeQueue() {
			if (s1.isEmpty()) {
				System.out.println("Queue is Empty");
				System.exit(0);
			}
			int x = s1.peek();
			s1.pop();
			return x;
		}
	}

	public static void main(String[] args) {

		Queue q = new Queue();
		q.enQueue(100);
		q.enQueue(200);
		q.enQueue(300);

		System.out.println(q.DeQueue());
		System.out.println(q.DeQueue());
		System.out.println(q.DeQueue());

	}

}
