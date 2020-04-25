package com.data_structure.stack;

public class TwoStacksUsingArray {
	int top1, top2;
	int size;
	int arr[];

	public TwoStacksUsingArray(int n) {
		size = n;
		arr = new int[n];
		top1 = -1;
		top2 = size;

	}

	void push1(int x) {

		if (top1 < top2 - 1) {
			top1++;
			arr[top1] = x;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}

	void push2(int x) {
		if (top1 < top2 - 1) {
			top2--;
			arr[top2] = x;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}

	int pop1() {
		if (top1 >= 0) {
			int x = arr[top1];
			top1--;
			return x;
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	}

	int pop2() {
		if (top2 < size) {
			int x = arr[top2];
			top2++;
			return x;
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);

		}
		return 0;
	}

	public static void main(String[] args) {

		TwoStacksUsingArray stack = new TwoStacksUsingArray(5);
		stack.push1(10);
		stack.push1(20);
		stack.push2(30);
		stack.push2(40);
		System.out.println("stack 1 : "+stack.pop1());

		stack.push2(50);

		System.out.println("stack 2 : " + stack.pop2());
	}

}
