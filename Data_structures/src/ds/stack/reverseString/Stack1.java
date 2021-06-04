package ds.stack.reverseString;

public class Stack1 {
	
	private int maxSize;
	private int top;
	private char[] stackArray;
	
	public Stack1(int size) {
		this.maxSize  = size;
		this.top = -1;
		this.stackArray = new char[maxSize];
	}
	
	public void push(char ch) {
		if (isFull()) {
			System.out.println("stack is alrady full");
		}else {
			top++;
			stackArray[top] = ch;			
		}
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return '0';
		}else {
			int old_top = top;
			top--;
			return stackArray[old_top];	
		}
	}
	
	public char peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == (maxSize - 1));
	}
}
