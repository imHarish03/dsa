package dsa.stack;

public class Stack {

	int count = 5;
	private int[] stack = new int[count];
	private int counter = 0;

	public void push(int data) {

		if (!isFull()) {
			stack[counter] = data;
			counter++;
		} else {
			System.out.println("Cannot Add data :" + data + ", Stack is full");
		}

	}

	public int pop() {

		if (counter - 1 >= 0) {
			counter--;
			return stack[counter];
		} else {
			System.out.println("Stack is empty");
			return 0;
		}
	}

	public void show() {

		for (int i = 0; i < counter; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println(" ");
	}

	public boolean isFull() {
		return counter == count ? true : false;
	}

}
