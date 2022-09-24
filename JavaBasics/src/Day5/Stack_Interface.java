package Day5;

import java.util.Stack;

public class Stack_Interface {
	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(5);
		s.push(7);
		s.push(9);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		//s;
		System.out.println(s.peek());
		
		
	}
}
