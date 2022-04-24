package brown_box.stack_queue;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("()"));
		System.out.println(isValid("(]"));
	}

	private static boolean isValid(String str) {
		Stack<Character> myStack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				myStack.push(c);
			} else {
				if (myStack.isEmpty()) {
					return false;
				}
				Character peek = myStack.peek();
				if ((c == ')' && peek == '(') ||
						(c == '}' && peek == '{') ||
						(c == ']' && peek == '[')) {
					myStack.pop();
				} else {
					return false;
				}
			}
		}
		return myStack.isEmpty();
	}
}
