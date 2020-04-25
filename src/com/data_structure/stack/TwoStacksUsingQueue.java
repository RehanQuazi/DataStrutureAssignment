package com.data_structure.stack;

import java.util.LinkedList;
import java.util.Queue;

public class TwoStacksUsingQueue {
	static class Stack {
		 Queue<Integer> q1;
		 Queue<Integer> q2;
		static int curr_size;

		public Stack() {
			curr_size = 0;
			q1 = new LinkedList<Integer>();
			q2 = new LinkedList<Integer>();
		}

		 void push(int x) {
			curr_size++;

			q2.add(x);

			while (!q1.isEmpty()) {
				q2.add(q1.peek());
				q1.remove();
			}
			Queue<Integer> q = q1;
			q1 = q2;
			q2 = q;
		}

		 void pop() {
			if (q1.isEmpty()) {
				return;

			}
			q1.remove();
			curr_size--;
		}

		 int top() {
			if (q1.isEmpty()) {
				return -1;
			}
			return q1.peek();
		}

		 int size() {
			return curr_size;
		}
	}

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);

		System.out.println(s.top());
		s.pop();
		System.out.println(s.top());
		s.pop();
		System.out.println(s.top());
		s.pop();
	}

}
