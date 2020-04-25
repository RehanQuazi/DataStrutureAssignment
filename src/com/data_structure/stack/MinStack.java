package com.data_structure.stack;

import java.util.Stack;

public class MinStack {

	Stack<Integer> s;
	Integer minEle;

	MinStack() {
		s = new Stack<Integer>();
	}
	
	void getMin() {
		if (s.isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println("Minimum Element :"+minEle);
	}

	void peek() {
		if (s.isEmpty()) {
			return;
		}
		Integer t = s.peek(); 

		if (t < minEle)
			System.out.println(minEle);
		else
			System.out.println(t);
	}

	void pop() {
		if (s.isEmpty()) {
			return;
		}
		
		Integer t = s.pop();

		if (t < minEle) {
			System.out.println(minEle);
			minEle = 2 * minEle - t;
		}

		else
			System.out.println(t);
	}

	void push(Integer x) {
		if (s.isEmpty()) {
			minEle = x;
			s.push(x);
			return;
		}
			s.push(2 * x - minEle);
			minEle = x;
	if (x < minEle) {
		s.push(2 * x - minEle);
		minEle = x;
	}
		else
			s.push(x);
}

	public static void main(String[] args) {

		MinStack m = new MinStack();
		m.push(10);
		m.push(9);
		m.getMin();
		m.push(17);
		m.push(3);
		m.getMin();
		m.pop();
		m.getMin();
	}

}
